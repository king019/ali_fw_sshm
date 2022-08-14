package com.k.db.shardingjdbc.dao;

import com.k.db.shardingjdbc.model.TOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface TorderDao {
    @Insert("insert into t_order(user_id,order_id)values(#{userId},#{orderId})")
    int save(TOrder info);

    @Select("select * from t_order")
    List<TOrder> query(TOrder info);
}
