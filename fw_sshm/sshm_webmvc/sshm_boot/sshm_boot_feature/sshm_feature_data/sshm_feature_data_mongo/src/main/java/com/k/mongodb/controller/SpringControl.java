package com.k.mongodb.controller;

import com.k.mongodb.vo.MongoVo;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class SpringControl {
    @Autowired
    private MongoTemplate template;

    @ResponseBody
    @GetMapping(value = "/insert")
    public MongoVo insert() {
        MongoVo vo = new MongoVo();
        template.insert(vo);
        return vo;
    }

    @ResponseBody
    @GetMapping(value = "/remove")
    public DeleteResult remove() {
        MongoVo vo = new MongoVo();
        vo.setOptId("id_df78e984-ce88-4d7e-9023-d52cc67c022c");
        DeleteResult remove = template.remove(new Query(Criteria.where("optId").is("id_df78e984-ce88-4d7e-9023-d52cc67c022c")), MongoVo.class);
        return remove;
    }

    @ResponseBody
    @GetMapping(value = "/find")
    public List<MongoVo> find() {
        List<MongoVo> optId = template.find(new Query(Criteria.where("optId").is("id_9db223d7-6fc0-4588-8243-4205f8797804")), MongoVo.class);
        return optId;
    }

    @ResponseBody
    @GetMapping(value = "/updateFirst")
    public UpdateResult updateFirst() {
        Update update = new Update();
        update.set("optName", new Date().toString());
        UpdateResult optId1 = template.updateFirst(new Query(Criteria.where("optId").is("id_9db223d7-6fc0-4588-8243-4205f8797804")), update, MongoVo.class);
        return optId1;
    }
}
