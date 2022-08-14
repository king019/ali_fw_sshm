package com.k.mongodb.operators.operators.query.query.element;

import com.k.mongodb.operators.util.junit.query.JCQueryOpt;
import org.junit.Ignore;
import org.junit.Test;

/**
 * <br/> $exists(page 378) Matches documents that have the specified field. <br/> $type(page 379) Selects documents if a field is of the specified type.
 */
public class ElementOpt extends JCQueryOpt {

    @Test
    @Ignore
    public void exists() {
        criteria.and("ext").exists(true);
    }

    @Test
    @Ignore
    public void type() {
        criteria.and("ext").type(2);
    }
}
