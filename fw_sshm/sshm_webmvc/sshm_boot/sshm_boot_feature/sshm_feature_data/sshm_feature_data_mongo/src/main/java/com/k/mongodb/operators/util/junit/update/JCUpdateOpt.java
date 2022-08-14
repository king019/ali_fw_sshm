package com.k.mongodb.operators.util.junit.update;

import com.k.mongodb.operators.util.junit.jc.JCOpt;
import com.k.mongodb.operators.vo.Ques;
import com.mongodb.client.result.UpdateResult;
import org.junit.After;
import org.junit.Before;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

public abstract class JCUpdateOpt extends JCOpt {
    public Update update;

    @Before
    public void bf() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("*********" + name.getMethodName() + "   start******************");
        criteria = new Criteria();
        query = new Query(criteria);
        criteria.and("_id").is(id);
        update = new Update();
    }

    @After
    public void af() {
        try {
            System.out.println(query);
            System.out.println(update);
            UpdateResult wr = mongoTemplate.updateFirst(query, update, Ques.class);
            System.out.println(wr);
            list = mongoTemplate.find(query, Ques.class);
            System.out.println(list);
            System.out.println("*********" + name.getMethodName() + "     end******************");
            System.out.println();
            System.out.println();
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void nouse() {
        System.out.println("no use");
    }
}
