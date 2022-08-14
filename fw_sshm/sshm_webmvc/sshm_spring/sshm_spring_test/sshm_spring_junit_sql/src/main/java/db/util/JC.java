package db.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.AfterTransaction;
import org.springframework.test.context.transaction.BeforeTransaction;

import javax.sql.DataSource;

@Slf4j
//import org.springframework.test.context.transaction.TransactionConfiguration;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-hibernate.xml")
//@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
// @Transactional(timeout = 1)
public abstract class JC {

    @Autowired
    public DataSource ds;

    @Test
    @Ignore
    public abstract void test();

    @AfterTransaction
    public void after() throws InterruptedException {
        log.info("after");
    }

    @BeforeTransaction
    public void befer() throws InterruptedException {
        log.info("befer");
    }
}
