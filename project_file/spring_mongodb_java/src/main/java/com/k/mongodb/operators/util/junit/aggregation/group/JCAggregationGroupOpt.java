package com.k.mongodb.operators.util.junit.aggregation.group;
import com.k.mongodb.operators.util.junit.aggregation.JCAggregationOpt;
import org.springframework.data.mongodb.core.aggregation.GroupOperation.GroupOperationBuilder;
public abstract class JCAggregationGroupOpt extends JCAggregationOpt {
  public GroupOperationBuilder groupOperationBuilder;
}
