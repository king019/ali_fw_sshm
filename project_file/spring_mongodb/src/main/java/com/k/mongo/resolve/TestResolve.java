package com.k.mongo.resolve;
import com.mongodb.WriteConcern;
import org.springframework.data.mongodb.core.MongoAction;
import org.springframework.data.mongodb.core.WriteConcernResolver;
public class TestResolve implements WriteConcernResolver {
  @Override
  public WriteConcern resolve(MongoAction action) {
    return WriteConcern.REPLICAS_SAFE;
    // return action.getDefaultWriteConcern();
  }
}
