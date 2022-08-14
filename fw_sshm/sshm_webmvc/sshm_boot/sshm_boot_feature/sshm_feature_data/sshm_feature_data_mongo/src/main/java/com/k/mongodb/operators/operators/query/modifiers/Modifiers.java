package com.k.mongodb.operators.operators.query.modifiers;

import com.k.mongodb.operators.util.junit.query.JCQueryOpt;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import java.util.concurrent.TimeUnit;

/**
 * <br/> $comment (page 475) Adds a comment to the query to identify queries in thedatabase profileroutput. <br/> $explain (page 475) Forces MongoDB to report on query execution plans. Seeexplain()(page 80). <br/> $hint(page 476) Forces MongoDB to use a specific index. Seehint()(page 85) <br/> $maxScan (page 476) Limits the number of documents scanned. <br/> $maxTimeMS (page 477) Specifies a cumulative time limit in milliseconds for processing operations on a cursor. SeemaxTimeMS()(page 87). <br/> $max(page 477) Specifies anexclusiveupper limit for the index to use in a query. Seemax()(page 87). <br/> $min(page 478) Specifies aninclusive lower limit for the index to use in a query. See min()(page 89). <br/> $orderby (page 478) Returns a cursor with documents sorted according to a sort specification. Seesort() (page 92). <br/> $returnKey (page 479) Forces the cursor to only return fields included in the index. <br/> $showDiskLoc (page 479) Modifies the documents returned to include
 * references to the on-disk location of each document. <br/> $snapshot (page 479) Forces the query to use the index on the_idfield. Seesnapshot()(page 92). <br/> $query(page 480) Wraps a query document.
 */
public class Modifiers extends JCQueryOpt {

    @Ignore
    @Test
    public void comment() {
        nouse();
    }

    @Ignore
    @Test
    public void explain() {
        nouse();
    }

    @Ignore
    @Test
    public void hint() {
        // 强制使用索引
        query.withHint(num);
    }

    @Ignore
    @Test
    public void maxScan() {
        // 返回最大个数
        query.limit(2);
    }

    @Ignore
    @Test
    public void maxTime() {
        query.maxTime(1, TimeUnit.MICROSECONDS);
    }

    @Ignore
    @Test
    public void max() {
        nouse();
    }

    @Ignore
    @Test
    public void min() {
        nouse();
    }

    @Test
    @Ignore
    public void order() {

        Order order = Order.asc(num);
        Sort sort = Sort.by(order);
        query.with(sort);
    }

    @Test
    @Ignore
    public void returnKey() {
        nouse();
    }

    @Test
    @Ignore
    public void showDiskLoc() {
        nouse();
    }

    @Test
    @Ignore
    public void snapshot() {
        nouse();
    }

    @Test
    @Ignore
    public void query() {
        nouse();
    }
}
