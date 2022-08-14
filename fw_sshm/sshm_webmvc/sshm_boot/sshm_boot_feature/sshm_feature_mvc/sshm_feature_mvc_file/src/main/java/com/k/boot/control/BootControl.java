package com.k.boot.control;

import com.csvreader.CsvReader;
import com.google.common.base.Charsets;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Slf4j
@RestController
public class BootControl {

    @PostMapping(value = "/upload")
    @ResponseBody
    String upload(@RequestParam("file") MultipartFile file) throws IOException {
        String name = file.getOriginalFilename();
        if (name.endsWith(".xlsx")) {
            handleExcel(file);
        } else if (name.endsWith(".csv")) {
            handleCsv(file);
        }
        return "ok";
    }

    //实现Spring Boot 的文件下载功能，映射网址为/download
    @PostMapping("/down")
    public String downloadFile(HttpServletRequest request,
                               HttpServletResponse response, @RequestParam("path") String path) throws UnsupportedEncodingException {
        int index = path.lastIndexOf("/") + 1;
        //设置文件路径
        String fileName = path.substring(index);
        File file = new File(path);
        // 如果文件名存在，则进行下载
        if (file.exists()) {
            // 配置文件下载
            //response.setHeader("content-type", "application/octet-stream");
            //response.setContentType("application/octet-stream");
            response.setContentType("application/force-download");// 设置强制下载不打开
            // 下载文件能正常显示中文
            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
            // 实现文件下载
            byte[] buffer = new byte[1024];
            FileInputStream fis = null;
            BufferedInputStream bis = null;
            try {
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                OutputStream os = response.getOutputStream();
                int i = bis.read(buffer);
                while (i != -1) {
                    os.write(buffer, 0, i);
                    i = bis.read(buffer);
                }
                log.info("Download the song successfully!");
            } catch (Exception e) {
                log.info("Download the song error!", e);
            } finally {
                if (bis != null) {
                    try {
                        bis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return null;
    }

    private void handleExcel(MultipartFile file) throws IOException {
        Workbook xwb = new XSSFWorkbook(file.getInputStream());
        // 读取第一章表格内容
        Sheet sheet = xwb.getSheetAt(0);
        Row row = sheet.getRow(1);
        Cell cell = row.getCell(1);
        String rawValue = cell.getStringCellValue();
        xwb.close();
    }

    private void handleCsv(MultipartFile file) throws IOException {
        try {
            CsvReader reader = new CsvReader(file.getInputStream(), Charsets.UTF_8);
            reader.readHeaders();
            while (reader.readRecord()) {
                String[] vals = reader.getValues();
                for (String val : vals) {
                    log.info(val);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
