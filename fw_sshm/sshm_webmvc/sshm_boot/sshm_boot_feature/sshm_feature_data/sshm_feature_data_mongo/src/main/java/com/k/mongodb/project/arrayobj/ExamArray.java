package com.k.mongodb.project.arrayobj;

import com.k.mongodb.project.arrayobj.model.ExamOption;
import com.k.mongodb.project.arrayobj.model.ExamQues;
import org.bson.types.ObjectId;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:applicationContext-mongodb.xml")
public class ExamArray {
    private String optId = "opts.optId";
    @Resource
    ApplicationContext context;
    @Resource
    private MongoTemplate mongoTemplate;


    @Ignore
    @Test
    public void insert() {
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
        mongoTemplate.insert(ques);
    }

    @Ignore
    @Test
    public void push() {
        try {
            Criteria criteria = new Criteria();
            Query query = new Query();
            criteria.and(optId).is("5448c4c7406c22cb4e1dad30");
            query.addCriteria(criteria);
            Update update = new Update();
            ExamOption opt3 = new ExamOption();
            opt3.setOptName("optname3");
            update.push("opts", opt3);
            mongoTemplate.updateFirst(query, update, ExamQues.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Ignore
    @Test
    public void pull() {
        try {
            Criteria criteria = new Criteria();
            Query query = new Query();
            criteria.and(optId).is("5448c4c7406c22cb4e1dad30");
            query.addCriteria(criteria);
            Update update = new Update();
            ExamOption opt3 = new ExamOption();
            opt3.setOptName("optname3");
            update.pull("opts", opt3);
            mongoTemplate.updateFirst(query, update, ExamQues.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // @Ignore
    @Test
    @Ignore
    public void addToSet() {
        try {
            String id = "5448c953406c9e83475b645e";
            Criteria criteria = new Criteria();
            Query query = new Query();
            criteria.and(optId).is(id);
            query.addCriteria(criteria);
            Update update = new Update();
            update.set("opts.$.optName", "newopt$name");
            mongoTemplate.updateFirst(query, update, ExamQues.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
