package com.k.mongodb.operators.util.junit.aggregation;

import com.k.mongodb.operators.util.junit.jc.JCOpt;
import com.k.mongodb.operators.vo.Ques;
import com.k.mongodb.operators.vo.unwind.QuesOptWind;
import com.mongodb.DBObject;
import org.junit.After;
import org.junit.Before;
import org.springframework.data.mongodb.core.aggregation.*;
import org.springframework.data.mongodb.core.mapreduce.GroupBy;
import org.springframework.data.mongodb.core.mapreduce.GroupByResults;
import org.springframework.data.mongodb.core.query.Criteria;

public abstract class JCAggregationOpt extends JCOpt {
    public Criteria criteria2;
    public ProjectionOperation projectionOperation;
    public AggregationResults<Ques> aggregationResults;
    public MatchOperation matchOperation;
    public TypedAggregation<Ques> typedAggregation;
    public AggregationResults<QuesOptWind> aggregationResultsWin;
    public LimitOperation limitOperation;
    public SkipOperation skipOperation;
    public UnwindOperation unwindOperation;
    public GroupOperation groupOperation;
    public GroupBy groupBy;
    public DBObject dbObject;
    public GroupByResults<Ques> groupByResults;

    @Before
    public void bf() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("*********" + name.getMethodName() + "   start******************");
        criteria = new Criteria();
        matchOperation = new MatchOperation(criteria);
    }

    @After
    public void af() {
        try {
            System.out.println(aggregationResults);
            System.out.println(aggregationResultsWin);
            System.out.println(groupByResults);
            System.out.println(groupBy);
            System.out.println("*********" + name.getMethodName() + "     end******************");
            System.out.println();
            System.out.println();
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
