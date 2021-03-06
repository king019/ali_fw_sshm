package com.k.web.mybatis.mybatis.mapper;

import com.k.web.mybatis.mybatis.model.MybatisTable2;
import com.k.web.mybatis.mybatis.model.MybatisTable2Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MybatisTable2Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mybatis_table_2
     *
     * @mbg.generated 2018-11-04 22:52:46
     */
    long countByExample(MybatisTable2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mybatis_table_2
     *
     * @mbg.generated 2018-11-04 22:52:46
     */
    int deleteByExample(MybatisTable2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mybatis_table_2
     *
     * @mbg.generated 2018-11-04 22:52:46
     */
    int insert(MybatisTable2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mybatis_table_2
     *
     * @mbg.generated 2018-11-04 22:52:46
     */
    int insertSelective(MybatisTable2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mybatis_table_2
     *
     * @mbg.generated 2018-11-04 22:52:46
     */
    List<MybatisTable2> selectByExample(MybatisTable2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mybatis_table_2
     *
     * @mbg.generated 2018-11-04 22:52:46
     */
    int updateByExampleSelective(@Param("record") MybatisTable2 record, @Param("example") MybatisTable2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mybatis_table_2
     *
     * @mbg.generated 2018-11-04 22:52:46
     */
    int updateByExample(@Param("record") MybatisTable2 record, @Param("example") MybatisTable2Example example);
}