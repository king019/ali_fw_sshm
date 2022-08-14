package com.k.mongodb.operators.operators.update.array.modifiers;

import com.k.mongodb.operators.util.junit.update.JCUpdateOpt;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.data.mongodb.core.query.Update.AddToSetBuilder;
import org.springframework.data.mongodb.core.query.Update.PushOperatorBuilder;

public class ArrysOPt extends JCUpdateOpt {

    /**
     * 没有才添加进去
     */
    @Ignore
    @Test
    public void each_addToSet() {
        AddToSetBuilder builder = update.addToSet(nums);
        builder.each(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
    }

    /**
     * 全部添加进去
     */
    @Ignore
    @Test
    public void each_push() {
        // add
        PushOperatorBuilder builder = update.push(nums);
        builder.each(11, 21, 31, 41, 51, 16, 17, 18, 19, 10);
    }

    @Ignore
    @Test
    public void slice_push() {
        nouse();
    }

    @Ignore
    @Test
    public void sort_push() {
        nouse();
    }

    @Ignore
    @Test
    public void position_push() {
        nouse();
    }
}
