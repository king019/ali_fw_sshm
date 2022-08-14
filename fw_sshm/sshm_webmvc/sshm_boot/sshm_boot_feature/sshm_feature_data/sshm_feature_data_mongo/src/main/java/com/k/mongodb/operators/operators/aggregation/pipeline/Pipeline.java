package com.k.mongodb.operators.operators.aggregation.pipeline;

import com.k.mongodb.operators.util.junit.aggregation.JCAggregationOpt;
import com.k.mongodb.operators.vo.Ques;
import com.k.mongodb.operators.vo.unwind.QuesOptWind;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.data.mongodb.core.aggregation.*;

/**
 * <br/> $project (page 435) Reshapes a document stream.$project(page 435) can rename, add, or remove fields as well as create computed values and sub-documents. <br/> $match (page 437) Filters the document stream, and only allows matching documents to pass into the next pipeline stage. $match(page 437) uses standard MongoDB queries. <br/> $redact (page 438) Restricts the content of a returned document on a per-field level. <br/> $limit (page 442) Restricts the number of documents in an aggregation pipeline. <br/> $skip (page 442) Skips over a specified number of documents from the pipeline and returns the rest. <br/> $unwind (page 443) Takes an array of documents and returns them as a stream of documents. <br/> $group (page 444) Groups documents together for the purpose of calculating aggregate values based on a collection of documents. <br/> $sort (page 446) Takes all input documents and returns them in a stream of sorted documents. <br/> $geoNear (page 448) Returns an ordered
 * stream of documents based on proximity to a geospatial point. <br/> $out (page 450) Writes documents from the pipeline to a collection. The$out(page 450) operator must be the last stage in the pipeline.
 */
public class Pipeline extends JCAggregationOpt {

    @Ignore
    @Test
    public void project() {
        // 需要自己测试下效果
        projectionOperation = new ProjectionOperation(Fields.fields(num));
        typedAggregation = new TypedAggregation<Ques>(Ques.class, projectionOperation);
        aggregationResults = mongoTemplate.aggregate(typedAggregation, Ques.class);
    }

    @Ignore
    @Test
    public void match() {
        projectionOperation = new ProjectionOperation(Fields.fields(num));
        criteria.and(num).is(0);
        typedAggregation = new TypedAggregation<Ques>(Ques.class, matchOperation, projectionOperation);
        aggregationResults = mongoTemplate.aggregate(typedAggregation, Ques.class);
    }

    @Ignore
    @Test
    public void redact() {
        nouse();
    }

    @Ignore
    @Test
    public void limit() {
        limitOperation = new LimitOperation(1);
        projectionOperation = new ProjectionOperation(Fields.fields(num));
        criteria.and(num).is(0);
        typedAggregation = new TypedAggregation<Ques>(Ques.class, matchOperation, projectionOperation, limitOperation);
        aggregationResults = mongoTemplate.aggregate(typedAggregation, Ques.class);
    }

    @Ignore
    @Test
    public void skip() {
        skipOperation = new SkipOperation(1);
        projectionOperation = new ProjectionOperation(Fields.fields(num));
        criteria.and(num).is(0);
        typedAggregation = new TypedAggregation<Ques>(Ques.class, matchOperation, projectionOperation, skipOperation);
        aggregationResults = mongoTemplate.aggregate(typedAggregation, Ques.class);
    }

    @Ignore
    @Test
    public void unwind() {
        projectionOperation = new ProjectionOperation(Fields.fields(num, nums));
        unwindOperation = new UnwindOperation(Fields.field(nums));
        typedAggregation = new TypedAggregation<Ques>(Ques.class, projectionOperation, unwindOperation);
        aggregationResultsWin = mongoTemplate.aggregate(typedAggregation, QuesOptWind.class);
    }

    @Test
    @Ignore
    public void group() {
        groupOperation = new GroupOperation(Fields.fields(str));
        projectionOperation = new ProjectionOperation(Fields.fields(_id, num, nums));
        typedAggregation = new TypedAggregation<Ques>(Ques.class, groupOperation);
        aggregationResults = mongoTemplate.aggregate(typedAggregation, Ques.class);
    }

    @Ignore
    @Test
    public void sort() {
        groupOperation = new GroupOperation(Fields.fields(_id, num, nums));
        projectionOperation = new ProjectionOperation(Fields.fields(_id, num, nums));
        typedAggregation = new TypedAggregation<Ques>(Ques.class, groupOperation);
        aggregationResults = mongoTemplate.aggregate(typedAggregation, Ques.class);
    }

    @Ignore
    @Test
    public void out() {
        nouse();
    }
}
