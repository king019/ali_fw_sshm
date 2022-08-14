package com.k.mongodb.operators.operators.update;

import com.k.mongodb.operators.util.junit.update.JCUpdateOpt;
import org.junit.Ignore;
import org.junit.Test;

/**
 * <br/> $inc(page 409) Increments the value of the field by the specified amount. <br/> $mul(page 410) Multiplies the value of the field by the specified amount. <br/> $rename (page 411) Renames a field. <br/> $setOnInsert (page 412) Sets the value of a field upon document creation during an upsert. Has no effect onoperations that modify existing documents. <br/> $set(page 413) Sets the value of a field in a document. <br/> $unset (page 414) Removes the specified field from a document. <br/> $min(page 414) Only updates the field if the specified value is less than the existing field value. <br/> $max(page 415) Only updates the field if the specified value is greater than the existing field value. <br/> $currentDate (page 416) Sets the value of a field to current date, either as a Date or a Timestamp.
 */
public class FieldsOPt extends JCUpdateOpt {

    @Ignore
    @Test
    public void inc() {
        update.inc(num, 1);
    }

    @Ignore
    @Test
    public void mul() {
    }

    @Ignore
    @Test
    public void rename() {
        update.rename("k1", "k2");
    }

    @Ignore
    @Test
    public void setOnInsert() {
        nouse();
        // update.setOnInsert("k3", "k3");
    }

    @Ignore
    @Test
    public void unset() {
        update.unset("k2");
    }

    @Ignore
    @Test
    public void min() {
        nouse();
    }

    @Ignore
    @Test
    public void max() {
        nouse();
    }

    @Test
    public void currentDate() {
        nouse();
        // update.currentDate(date);
    }
}
