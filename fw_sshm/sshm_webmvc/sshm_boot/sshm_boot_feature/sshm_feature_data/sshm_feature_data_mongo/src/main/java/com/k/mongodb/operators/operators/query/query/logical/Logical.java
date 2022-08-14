package com.k.mongodb.operators.operators.query.query.logical;

import com.k.mongodb.operators.util.junit.query.JCQueryOpt;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.data.mongodb.core.query.Criteria;

/**
 * <br/> $or(page 374) Joins query clauses with a logicalORreturns all documents that match the conditions clause. <br/> $and (page 375) Joins query clauses with a logicalANDreturns all documents that match the condition clauses. <br/> $not (page 376) Inverts the effect of a query expression and returns documents that donotmatch the q expression. <br/> $nor (page 377) Joins query clauses with a logicalNORreturns all documents that fail to match both c
 */
public class Logical extends JCQueryOpt {

    @Ignore
    @Test
    public void or() {
        criteria2 = new Criteria();
        criteria2.and(num).gt(9);
        criteria.and(num).lt(15);
        criteria.orOperator(criteria2);
    }

    @Ignore
    @Test
    public void and() {
        criteria2 = new Criteria();
        criteria2.and(num).lt(18);
        criteria.andOperator(criteria2);
    }

    @Test
    @Ignore
    public void not() {
        criteria.and(num).lt(18).not();
    }

    @Ignore
    @Test
    public void nor() {
        criteria2 = new Criteria();
        criteria2.and(num).lt(15);
        criteria.norOperator(criteria2);
    }
}
