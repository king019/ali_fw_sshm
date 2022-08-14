package com.k.mongodb.operators.operators.update.array.update;

import com.k.mongodb.operators.util.junit.update.JCUpdateOpt;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.data.mongodb.core.query.Update.Position;

/**
 * <br/> $(page 417) Acts as a placeholder to update the first element that matches the query condition in an update. <br/> $addToSet (page 419) Adds elements to an array only if they do not already exist in the set. <br/> $pop(page 420) Removes the first or last item of an array. <br/> $pullAll (page 421) Removes all matching values from an array. <br/> $pull(page 421) Removes all array elements that match a specified query. <br/> $pushAll (page 422) Deprecated.Adds several items to an array. <br/> $push(page 422) Adds an item to an array.
 */
public class ArrysOPt extends JCUpdateOpt {

    @Ignore
    @Test
    public void update_$() {
        // 查询到位置后,修改查询到的数据
        criteria.and(nums).is(19);
        update.set(nums + ".$", 1);
    }

    @Ignore
    @Test
    public void addToSet() {
        // 有不添加,无则添加
        update.addToSet(nums, 6);
    }

    /**
     * 删除第一个对象
     */
    @Ignore
    @Test
    public void pop() {
        update.pop(nums, Position.FIRST);
    }

    @Ignore
    @Test
    public void pullAll() {
        // Removes all matching values from an array.
        update.pullAll(nums, new Integer[]{1, 4});
    }

    @Ignore
    @Test
    public void pull() {
        // Removes all array elements that match a specified query.
        update.pull(nums, 5);
    }

    @Ignore
    @Test
    public void pushAll() {
        // Deprecated.Adds several items to an array.
        update.pushAll(nums, new Integer[]{1, 4});
    }

    @Ignore
    @Test
    public void push() {
        // Adds an item to an array.
        update.push(nums, 8);
    }
}
