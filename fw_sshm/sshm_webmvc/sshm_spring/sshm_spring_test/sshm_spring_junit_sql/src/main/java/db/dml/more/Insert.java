package db.dml.more;

import db.util.JC;
import org.springframework.jdbc.core.JdbcTemplate;

public class Insert extends JC {
    @Override
    public void test() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);
        for (int i = 0; i < 5000000; i++) {
            jdbcTemplate.execute(" insert into  exam(exam_name) values('" + System.currentTimeMillis() + "123');");
        }
    }
}
