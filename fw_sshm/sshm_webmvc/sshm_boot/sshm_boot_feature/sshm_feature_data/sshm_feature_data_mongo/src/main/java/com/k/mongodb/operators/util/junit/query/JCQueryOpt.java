package com.k.mongodb.operators.util.junit.query;

import com.k.mongodb.operators.util.junit.jc.JCOpt;
import com.k.mongodb.operators.vo.Ques;
import org.junit.After;
import org.junit.Before;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

public abstract class JCQueryOpt extends JCOpt {
    public Criteria criteria2;
    public List<Ques> list;

    @Before
    public void bf() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("*********" + name.getMethodName() + "   start******************");
        criteria = new Criteria();
        query = new Query(criteria);
    }

    @After
    public void af() {
        try {
            list = mongoTemplate.find(query, Ques.class);
            System.out.println(query);
            System.out.println(list);
            System.out.println("*********" + name.getMethodName() + "     end******************");
            System.out.println();
            System.out.println();
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
