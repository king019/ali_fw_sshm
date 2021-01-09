package com.k.mongodb.operators.operators.aggregation.pipeline.group;

import com.k.mongodb.operators.util.junit.aggregation.group.JCAggregationGroupOpt;
import com.k.mongodb.operators.vo.Ques;

import org.junit.Test;
import org.junit.Ignore;
import org.springframework.data.mongodb.core.aggregation.Fields;
import org.springframework.data.mongodb.core.aggregation.GroupOperation;
import org.springframework.data.mongodb.core.aggregation.TypedAggregation;

/**
 * <br/> $addToSet (page 452) Returns an array of all theuniquevalues for the selected field among for ea in that group. <br/> $first(page 453) Returns the first value in a group. <br/> $last(page 453) Returns the last value in a group. <br/> $max(page 453) Returns the highest value in a group. <br/> $min(page 453) Returns the lowest value in a group. <br/> $avg(page 454) Returns an average of all the values in a group. <br/> $push(page 455) Returns an array ofallvalues for the selected field among for each docume group. <br/> $sum(page 457) Returns the sum of all the values in a group.
 */
public class Group$Opt extends JCAggregationGroupOpt {

  /**
   * 将num汇聚成nums的列表返回
   */
  @Ignore
  @Test
  public void addToSet() {
    groupOperation = new GroupOperation(Fields.fields(str));
    groupOperationBuilder = groupOperation.addToSet(num);
    groupOperation = groupOperationBuilder.as(nums);
    typedAggregation = new TypedAggregation<>(Ques.class, groupOperation);
    aggregationResults = mongoTemplate.aggregate(typedAggregation, Ques.class);
  }

  /**
   * 多个值选第一个
   */
  @Ignore
  @Test
  public void first() {
    groupOperation = new GroupOperation(Fields.fields(num));
    groupOperationBuilder = groupOperation.first(num1);
    groupOperation = groupOperationBuilder.as(num1);
    typedAggregation = new TypedAggregation<>(Ques.class, groupOperation);
    aggregationResults = mongoTemplate.aggregate(typedAggregation, Ques.class);
  }

  @Ignore
  @Test
  public void last() {
    groupOperation = new GroupOperation(Fields.fields(num));
    groupOperationBuilder = groupOperation.last(num1);
    groupOperation = groupOperationBuilder.as(num1);
    typedAggregation = new TypedAggregation<>(Ques.class, groupOperation);
    aggregationResults = mongoTemplate.aggregate(typedAggregation, Ques.class);
  }

  @Ignore
  @Test
  public void first_last() {
    groupOperation = new GroupOperation(Fields.fields(num));
    groupOperationBuilder = groupOperation.first(num1);
    groupOperation = groupOperationBuilder.as(num1);
    groupOperationBuilder = groupOperation.last(num1);
    groupOperation = groupOperationBuilder.as(num2);
    typedAggregation = new TypedAggregation<>(Ques.class, groupOperation);
    aggregationResults = mongoTemplate.aggregate(typedAggregation, Ques.class);
  }

  @Ignore
  @Test
  public void max() {
    groupOperation = new GroupOperation(Fields.fields(num));
    groupOperationBuilder = groupOperation.max(num1);
    groupOperation = groupOperationBuilder.as(num1);
    typedAggregation = new TypedAggregation<>(Ques.class, groupOperation);
    aggregationResults = mongoTemplate.aggregate(typedAggregation, Ques.class);
  }

  @Ignore
  @Test
  public void min() {
    groupOperation = new GroupOperation(Fields.fields(num));
    groupOperationBuilder = groupOperation.min(num1);
    groupOperation = groupOperationBuilder.as(num1);
    typedAggregation = new TypedAggregation<>(Ques.class, groupOperation);
    aggregationResults = mongoTemplate.aggregate(typedAggregation, Ques.class);
  }

  @Ignore
  @Test
  public void max_min() {
    groupOperation = new GroupOperation(Fields.fields(num));
    groupOperationBuilder = groupOperation.max(num1);
    groupOperation = groupOperationBuilder.as(num1);
    groupOperationBuilder = groupOperation.min(num1);
    groupOperation = groupOperationBuilder.as(num2);
    typedAggregation = new TypedAggregation<>(Ques.class, groupOperation);
    aggregationResults = mongoTemplate.aggregate(typedAggregation, Ques.class);
  }

  @Ignore
  @Test
  public void avg() {
    groupOperation = new GroupOperation(Fields.fields(num));
    groupOperationBuilder = groupOperation.avg(num1);
    groupOperation = groupOperationBuilder.as(num1);
    typedAggregation = new TypedAggregation<>(Ques.class, groupOperation);
    aggregationResults = mongoTemplate.aggregate(typedAggregation, Ques.class);
  }

  /**
   * 将得到的全部数据填充为一个列表
   */
  @Ignore
  @Test
  public void push() {
    groupOperation = new GroupOperation(Fields.fields(num));
    groupOperationBuilder = groupOperation.push(num1);
    groupOperation = groupOperationBuilder.as(num1);
    typedAggregation = new TypedAggregation<>(Ques.class, groupOperation);
    aggregationResults = mongoTemplate.aggregate(typedAggregation, Ques.class);
  }

  @Ignore
  @Test
  public void sum() {
    groupOperation = new GroupOperation(Fields.fields(num));
    groupOperationBuilder = groupOperation.sum(num1);
    groupOperation = groupOperationBuilder.as(num1);
    typedAggregation = new TypedAggregation<>(Ques.class, groupOperation);
    aggregationResults = mongoTemplate.aggregate(typedAggregation, Ques.class);
  }
}
