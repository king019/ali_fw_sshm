package com.k.mongodb.operators.operators.query.query.evaluation;

import com.k.mongodb.operators.util.junit.query.JCQueryOpt;
import org.junit.Ignore;
import org.junit.Test;

/**
 * <br/> $mod(page 381) Performs a modulo operation on the value of a field and selects documents with result. <br/> $regex (page 383) Selects documents where values match a specified regular expression. <br/> $text(page 384) Performs text search. <br/> $where (page 387) Matches documents that satisfy a JavaScript expression.
 */
public class Evaluation extends JCQueryOpt {

    // @Test @Ignore
    public void mod() {
        // x/4余1
        criteria.and(num).mod(4, 1);
    }

    // @Test @Ignore
    public void regex() {
        criteria.and(str).regex(".*?ans54a0b38da.*");
    }

    // @Test @Ignore
    public void text() {
        System.out.println("未找到");
    }

    @Test
    @Ignore
    public void where() {
        System.out.println("未找到");
    }
}
