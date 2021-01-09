package com.k.spring.boot.control;

import com.k.spring.boot.util.PathUtil;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author k
 */
//@Controller
//@RequestMapping(value = "/")

public class BootControlFile {

  @RequestMapping(value = "/{user}", method = RequestMethod.DELETE)
  public User deleteUser(@PathVariable Long user) {
    return null;
    // ...
  }

  @RequestMapping(value = "/jar")
  public void queryJar(HttpServletRequest request, HttpServletResponse response) {
    Path path = Paths.get(PathUtil.queryRootPath().concat("/spring_boot_server-0.0.1-SNAPSHOT.jar"));
    try {
      File file = path.toFile();
      FileInputStream inputStream = new FileInputStream(file);
      byte[] data = new byte[(int) file.length()];
      inputStream.read(data);
      inputStream.close();
      // response.setContentType("image/png");
      OutputStream stream = response.getOutputStream();
      stream.write(data);
      stream.flush();
      stream.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
