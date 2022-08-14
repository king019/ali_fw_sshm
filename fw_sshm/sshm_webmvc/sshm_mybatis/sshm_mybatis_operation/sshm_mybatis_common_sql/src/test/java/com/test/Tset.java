package com.test;

import com.k.web.mybatis.dao.ExamLogDao;
import com.k.web.mybatis.model.ExamLog;
import com.k.web.mybatis.service.UtilService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.beans.Transient;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-*.xml"})
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
// @Transactional(timeout = 1)
public class Tset {

    @Resource
    public UtilService utilService;
    private ExamLog examLog;
    private List list;

    @Ignore
    @Test
    @Transient
    public void insert() {
        try {
            examLog = new ExamLog();
            examLog.examId = 4522;
            examLog.logAgent = "1000";
            examLog.logId = 1000;
            examLog.logType = 1;
            utilService.intertObj(examLog, ExamLogDao.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Ignore
    @Test
    public void selectOne() {
        try {
            examLog = new ExamLog();
            examLog.logId = 415;
            examLog = (ExamLog) utilService.queryObjOne(examLog, ExamLogDao.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Ignore
    @Test
    public void selectList() {
        try {
            examLog = new ExamLog();
            list = utilService.queryObjList(examLog, ExamLogDao.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Ignore
    @Test
    public void updateOne() {
        try {
            selectOne();
            examLog.setLogAgent("123741258963");
            utilService.updateObj(examLog, ExamLogDao.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Ignore
    @Test
    public void deleteOne() {
        try {
            selectOne();
            utilService.deleteObj(examLog, ExamLogDao.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
