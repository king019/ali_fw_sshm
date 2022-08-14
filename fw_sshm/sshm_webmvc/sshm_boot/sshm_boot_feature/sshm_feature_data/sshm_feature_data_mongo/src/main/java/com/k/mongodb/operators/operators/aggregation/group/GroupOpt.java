package com.k.mongodb.operators.operators.aggregation.group;

import com.k.mongodb.operators.util.junit.aggregation.JCAggregationOpt;
import com.k.mongodb.operators.vo.Ques;
import com.mongodb.BasicDBObject;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapreduce.GroupBy;

public class GroupOpt extends JCAggregationOpt {

    @Test
    @Ignore
    public void project() {
        groupBy = new GroupBy(num);
        dbObject = new BasicDBObject();
        dbObject.put(num, 1);
        dbObject.put(num1, 0);
        // pre最后的文档,doc当前处理的文档
        groupBy.initialDocument(dbObject.toString());
        groupBy.reduceFunction("function(doc,pre){pre." + num + "++;pre." + num1 + "=doc." + num + ";}");
        groupBy.finalizeFunction("function(pre){pre." + num + "++}");
        groupByResults = mongoTemplate.group(Ques.class.getAnnotation(Document.class).collection(), groupBy, Ques.class);
    }
}
