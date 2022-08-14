package db.timeout;

import db.util.JC;
import org.springframework.jdbc.core.JdbcTemplate;

public class Timeout1Test extends JC {
    @Override
    public void test() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);
        jdbcTemplate.execute(" SELECT t.EXAM_ID FROM cscenter.cs_examination t");
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
