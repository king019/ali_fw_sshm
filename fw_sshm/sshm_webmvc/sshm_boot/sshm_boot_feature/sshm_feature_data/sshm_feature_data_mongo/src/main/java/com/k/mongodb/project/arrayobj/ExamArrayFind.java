package com.k.mongodb.project.arrayobj;

import com.alibaba.fastjson.JSON;
import com.k.mongodb.project.arrayobj.model.ExamOption;
import com.k.mongodb.project.arrayobj.model.ExamQues;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.junit.Test;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:auth/applicationContext-mongodb.xml")
public class ExamArrayFind {

    @Resource
    private MongoTemplate mongoTemplate;

    @Test
//    @Ignore
    public void test() {
        ExamQues ques = new ExamQues();
        ques.setQuesAns("ans");
        List<ExamOption> opts = new ArrayList<>();
        ExamOption opt1 = new ExamOption();
        opt1.setOptName("optname1");
        opt1.setOptId(new ObjectId().toHexString());
        ExamOption opt2 = new ExamOption();
        opt2.setOptName("optname2");
        opt2.setOptId(new ObjectId().toHexString());
        opts.add(opt1);
        opts.add(opt2);
        ques.setOpts(opts);
        MongoCollection<Document> dbc = mongoTemplate.getCollection("ceshi");
        String jsonString = JSON.toJSONString(ques);
        Document dbobj = JSON.parseObject(jsonString, Document.class);
        dbc.insertOne(dbobj);
        mongoTemplate.insert(ques);
    }
}
