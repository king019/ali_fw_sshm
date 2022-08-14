package com.k.web.mybatis.mybatis.model;

import java.io.Serializable;
import java.util.Date;

public class MybatisTable1 implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mybatis_table_1.id1
     *
     * @mbg.generated 2018-11-04 22:52:46
     */
    private Integer id1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mybatis_table_1.mybatis_id1
     *
     * @mbg.generated 2018-11-04 22:52:46
     */
    private Integer mybatisId1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mybatis_table_1.mybatis_name1
     *
     * @mbg.generated 2018-11-04 22:52:46
     */
    private String mybatisName1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mybatis_table_1.mybatis_time1
     *
     * @mbg.generated 2018-11-04 22:52:46
     */
    private Date mybatisTime1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mybatis_table_1
     *
     * @mbg.generated 2018-11-04 22:52:46
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mybatis_table_1.id1
     *
     * @return the value of mybatis_table_1.id1
     * @mbg.generated 2018-11-04 22:52:46
     */
    public Integer getId1() {
        return id1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mybatis_table_1.id1
     *
     * @param id1 the value for mybatis_table_1.id1
     * @mbg.generated 2018-11-04 22:52:46
     */
    public void setId1(Integer id1) {
        this.id1 = id1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mybatis_table_1.mybatis_id1
     *
     * @return the value of mybatis_table_1.mybatis_id1
     * @mbg.generated 2018-11-04 22:52:46
     */
    public Integer getMybatisId1() {
        return mybatisId1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mybatis_table_1.mybatis_id1
     *
     * @param mybatisId1 the value for mybatis_table_1.mybatis_id1
     * @mbg.generated 2018-11-04 22:52:46
     */
    public void setMybatisId1(Integer mybatisId1) {
        this.mybatisId1 = mybatisId1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mybatis_table_1.mybatis_name1
     *
     * @return the value of mybatis_table_1.mybatis_name1
     * @mbg.generated 2018-11-04 22:52:46
     */
    public String getMybatisName1() {
        return mybatisName1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mybatis_table_1.mybatis_name1
     *
     * @param mybatisName1 the value for mybatis_table_1.mybatis_name1
     * @mbg.generated 2018-11-04 22:52:46
     */
    public void setMybatisName1(String mybatisName1) {
        this.mybatisName1 = mybatisName1 == null ? null : mybatisName1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mybatis_table_1.mybatis_time1
     *
     * @return the value of mybatis_table_1.mybatis_time1
     * @mbg.generated 2018-11-04 22:52:46
     */
    public Date getMybatisTime1() {
        return mybatisTime1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mybatis_table_1.mybatis_time1
     *
     * @param mybatisTime1 the value for mybatis_table_1.mybatis_time1
     * @mbg.generated 2018-11-04 22:52:46
     */
    public void setMybatisTime1(Date mybatisTime1) {
        this.mybatisTime1 = mybatisTime1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mybatis_table_1
     *
     * @mbg.generated 2018-11-04 22:52:46
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MybatisTable1 other = (MybatisTable1) that;
        return (this.getId1() == null ? other.getId1() == null : this.getId1().equals(other.getId1()))
                && (this.getMybatisId1() == null ? other.getMybatisId1() == null : this.getMybatisId1().equals(other.getMybatisId1()))
                && (this.getMybatisName1() == null ? other.getMybatisName1() == null : this.getMybatisName1().equals(other.getMybatisName1()))
                && (this.getMybatisTime1() == null ? other.getMybatisTime1() == null : this.getMybatisTime1().equals(other.getMybatisTime1()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mybatis_table_1
     *
     * @mbg.generated 2018-11-04 22:52:46
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId1() == null) ? 0 : getId1().hashCode());
        result = prime * result + ((getMybatisId1() == null) ? 0 : getMybatisId1().hashCode());
        result = prime * result + ((getMybatisName1() == null) ? 0 : getMybatisName1().hashCode());
        result = prime * result + ((getMybatisTime1() == null) ? 0 : getMybatisTime1().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mybatis_table_1
     *
     * @mbg.generated 2018-11-04 22:52:46
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id1=").append(id1);
        sb.append(", mybatisId1=").append(mybatisId1);
        sb.append(", mybatisName1=").append(mybatisName1);
        sb.append(", mybatisTime1=").append(mybatisTime1);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}