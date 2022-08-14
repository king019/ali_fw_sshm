package com.k.mongodb.operators.operators.insert;

import com.k.mongodb.operators.util.junit.jc.JCOpt;
import com.k.mongodb.operators.vo.Opt;
import com.k.mongodb.operators.vo.Ques;
import org.bson.types.ObjectId;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Insert extends JCOpt {

    @Test
    @Ignore
    public void test() {
        for (int i = 0; i < 5; i++) {
            insert();
        }
    }

    public void insert() {
        Random rdm = new Random();
        Ques ques = new Ques();
        List<Opt> opts = new ArrayList<Opt>();
        Opt opt;
        ObjectId id = new ObjectId();
        for (int i = 0, len = rdm.nextInt(5) + 1; i < len; i++) {
            id = new ObjectId();
            opt = new Opt();
            opt.setOptId(id.toHexString());
            opt.setOptName("name" + id.toHexString());
            opt.setOptC1("c1_" + len);
            opt.setNum(rdm.nextInt(20));
            opts.add(opt);
        }
        ques.setNum1(rdm.nextInt(5));
        ques.setDateOpt(new Date());
        ques.setOpts(opts);
        ques.setNum(rdm.nextInt(20));
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 0, len = rdm.nextInt(5) + 1; i < len; i++) {
            nums.add(rdm.nextInt(20));
        }
        ques.setNums(nums);
        ques.setQuesAns("ans" + id.toString());
        mongoTemplate.insert(ques);
    }
}
