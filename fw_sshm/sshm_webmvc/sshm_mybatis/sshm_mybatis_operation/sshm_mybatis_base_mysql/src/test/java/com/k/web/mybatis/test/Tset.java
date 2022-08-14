package com.k.web.mybatis.test;

import com.k.web.mybatis.model.VO;
import com.k.web.mybatis.util.jc.JC;

public class Tset extends JC {
    public static void select() throws Exception {
        VO vo = new VO(1, "vname" + System.currentTimeMillis());
        vo.setVflag(true);
        // MybatisTestDao dao = context.getBean(MybatisTestDao.class);
        // List<VO> list = dao.select(vo);
        // dao.update(vo);
        // dao.delete(vo);
        dao.insert(vo);
        // log.info(list);
    }

    @Override
    public void test() {
        try {
            select();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
