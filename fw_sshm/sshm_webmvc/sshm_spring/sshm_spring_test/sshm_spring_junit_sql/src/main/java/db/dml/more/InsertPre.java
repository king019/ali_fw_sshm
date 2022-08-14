package db.dml.more;

import db.util.JC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPre extends JC {
    @Override
    public void test() {
        Connection con = null;
        try {
            con = ds.getConnection();
            con.setAutoCommit(true);
            PreparedStatement pst = con.prepareStatement(" insert into  exam(exam_name) values(?)");
            for (int i = 0; i < 5000000; i++) {
                pst.setString(1, "" + System.currentTimeMillis() + Math.random() + "123");
                pst.addBatch();
                // jdbcTemplate.execute(" insert into  exam(exam_name) values('" + System.currentTimeMillis() + "123');");
                if (i % 1000 == 0) {
                    pst.executeBatch();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
