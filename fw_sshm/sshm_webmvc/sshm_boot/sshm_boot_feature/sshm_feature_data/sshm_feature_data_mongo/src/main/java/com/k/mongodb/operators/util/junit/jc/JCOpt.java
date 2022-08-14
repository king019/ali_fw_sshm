package com.k.mongodb.operators.util.junit.jc;

import com.k.mongodb.operators.vo.Ques;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import javax.annotation.Resource;
import java.util.List;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:applicationContext-mongodb.xml")
public abstract class JCOpt {

    public String id = "54a36982aa2ff4675bd5a41c";
    public String _id = "quesId";
    public String num = "num";
    public String num1 = "num1";
    public String num2 = "num2";
    public String nums = "nums";
    public String str = "quesAns";
    public String objs = "opts";
    public String date = "dateOpt";
    @Rule
    public TestName name = new TestName();
    @Resource
    public MongoTemplate mongoTemplate;
    public Query query;
    public Criteria criteria;
    public List<Ques> list;

    public void nouse() {
        System.out.println("no use");
    }
}
