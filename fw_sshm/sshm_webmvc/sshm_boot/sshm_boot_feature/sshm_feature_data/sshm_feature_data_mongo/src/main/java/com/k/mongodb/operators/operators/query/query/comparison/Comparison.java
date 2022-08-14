package com.k.mongodb.operators.operators.query.query.comparison;

import com.k.mongodb.operators.util.junit.query.JCQueryOpt;
import org.junit.Ignore;
import org.junit.Test;

/**
 * <br/>> $gt(page 370) Matches values that are greater than the value specified in the query. <br/> $gte(page 371) Matches values that are greater than or equal to the value specified in the query. <br/> $in(page 371) Matches any of the values that exist in an array specified in the query. <br/> < $lt(page 372) Matches values that are less than the value specified in the query. <br/> < $lte(page 372) Matches values that are less than or equal to the value specified in the query. <br/> $ne(page 373) Matches all values that are not equal to the value specified in the query. <br/> $nin(page 373) Matches values thatdo notexist in an array specified to the query.
 */
public class Comparison extends JCQueryOpt {

    @Test
    @Ignore
    public void gt() {
        criteria.and(num).gt(10);
    }

    @Test
    @Ignore
    public void gte() {
        criteria.and(num).gte(10);
    }

    @Test
    @Ignore
    public void in() {
        criteria.and(num).in(10);
    }

    @Test
    @Ignore
    public void lt() {
        criteria.and(num).lt(10);
    }

    @Test
    @Ignore
    public void lte() {
        criteria.and(num).lte(10);
    }

    @Test
    @Ignore
    public void ne() {
        criteria.and(num).ne(10);
    }

    @Test
    @Ignore
    public void nin() {
        criteria.and(num).nin(10);
    }
}
