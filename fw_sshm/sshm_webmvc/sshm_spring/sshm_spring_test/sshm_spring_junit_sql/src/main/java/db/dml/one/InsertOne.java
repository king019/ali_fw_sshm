package db.dml.one;

import db.util.JC;
import org.springframework.jdbc.core.JdbcTemplate;

public class InsertOne extends JC {
    @Override
    public void test() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);
        jdbcTemplate.execute(" insert into  exam(exam_name) values('" + System.currentTimeMillis() + "123');");
    }
}
