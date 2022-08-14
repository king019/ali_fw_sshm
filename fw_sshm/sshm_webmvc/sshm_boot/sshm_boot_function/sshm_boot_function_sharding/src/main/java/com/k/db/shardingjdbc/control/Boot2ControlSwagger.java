package com.k.db.shardingjdbc.control;

import com.k.db.shardingjdbc.dao.TorderDao;
import com.k.db.shardingjdbc.model.TOrder;
import org.apache.shardingsphere.api.hint.HintManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class Boot2ControlSwagger {
    @Autowired
    private TorderDao torderDao;

    @GetMapping(value = "/insert")
    @ResponseBody
    public String index() {
        long nowTime = System.currentTimeMillis();
        TOrder info = new TOrder();
        info.setUserId("u" + nowTime);
        info.setOrderId("o" + nowTime);
        HintManager hintManager = HintManager.getInstance();
        hintManager.setDatabaseShardingValue("ds1");
        torderDao.save(info);
        hintManager.close();
        return "" + nowTime;
    }

    @GetMapping(value = "/select")
    @ResponseBody
    public String select() {
        long nowTime = System.currentTimeMillis();
        TOrder info = new TOrder();
        info.setUserId("u" + nowTime);
        info.setOrderId("o" + nowTime);
        HintManager hintManager = HintManager.getInstance();
        hintManager.setDatabaseShardingValue("ds1");
        torderDao.query(info);
        hintManager.close();
        return "" + nowTime;
    }

}


