package com.k.mongodb.operators.operators.query.query.array;

import com.k.mongodb.operators.util.junit.query.JCQueryOpt;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.data.mongodb.core.query.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * <br/> $all(page 399) Matches arrays that contain all elements specified in the query. <br/> $elemMatch (page 402) Selects documents if element in the array field matches all the specified$elemMa (page 402) condition. <br/> $size(page 402) Selects documents if the array field is a specified size.
 */
public class ArrayOpt extends JCQueryOpt {

    // @Test @Ignore
    public void all() {
        // 包含全部
        List<Integer> ns = new ArrayList<Integer>();
        ns.add(7);
        ns.add(13);
        criteria.and(nums).all(ns);
    }

    @Test
    @Ignore
    public void elemMatch() {
        // 包含6的document
        criteria2 = new Criteria();
        criteria2.and(num).is(6);
        criteria.and(objs).elemMatch(criteria2);
    }

    // @Test @Ignore
    public void size() {
        criteria.and(objs).size(2);
    }
}
