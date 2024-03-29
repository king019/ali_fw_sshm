package mybatis.dto;

import java.io.Serializable;
import java.util.Date;

public class MybatisTable2 implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mybatis_table_2.id
     *
     * @mbg.generated 2019-02-16 14:15:16
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mybatis_table_2.num
     *
     * @mbg.generated 2019-02-16 14:15:16
     */
    private Integer num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mybatis_table_2.str
     *
     * @mbg.generated 2019-02-16 14:15:16
     */
    private String str;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mybatis_table_2.mybatis_time2
     *
     * @mbg.generated 2019-02-16 14:15:16
     */
    private Date mybatisTime2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mybatis_table_2
     *
     * @mbg.generated 2019-02-16 14:15:16
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mybatis_table_2.id
     *
     * @return the value of mybatis_table_2.id
     * @mbg.generated 2019-02-16 14:15:16
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mybatis_table_2.id
     *
     * @param id the value for mybatis_table_2.id
     * @mbg.generated 2019-02-16 14:15:16
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mybatis_table_2.num
     *
     * @return the value of mybatis_table_2.num
     * @mbg.generated 2019-02-16 14:15:16
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mybatis_table_2.num
     *
     * @param num the value for mybatis_table_2.num
     * @mbg.generated 2019-02-16 14:15:16
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mybatis_table_2.str
     *
     * @return the value of mybatis_table_2.str
     * @mbg.generated 2019-02-16 14:15:16
     */
    public String getStr() {
        return str;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mybatis_table_2.str
     *
     * @param str the value for mybatis_table_2.str
     * @mbg.generated 2019-02-16 14:15:16
     */
    public void setStr(String str) {
        this.str = str == null ? null : str.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mybatis_table_2.mybatis_time2
     *
     * @return the value of mybatis_table_2.mybatis_time2
     * @mbg.generated 2019-02-16 14:15:16
     */
    public Date getMybatisTime2() {
        return mybatisTime2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mybatis_table_2.mybatis_time2
     *
     * @param mybatisTime2 the value for mybatis_table_2.mybatis_time2
     * @mbg.generated 2019-02-16 14:15:16
     */
    public void setMybatisTime2(Date mybatisTime2) {
        this.mybatisTime2 = mybatisTime2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mybatis_table_2
     *
     * @mbg.generated 2019-02-16 14:15:16
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
        MybatisTable2 other = (MybatisTable2) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
                && (this.getStr() == null ? other.getStr() == null : this.getStr().equals(other.getStr()))
                && (this.getMybatisTime2() == null ? other.getMybatisTime2() == null : this.getMybatisTime2().equals(other.getMybatisTime2()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mybatis_table_2
     *
     * @mbg.generated 2019-02-16 14:15:16
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getStr() == null) ? 0 : getStr().hashCode());
        result = prime * result + ((getMybatisTime2() == null) ? 0 : getMybatisTime2().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mybatis_table_2
     *
     * @mbg.generated 2019-02-16 14:15:16
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", num=").append(num);
        sb.append(", str=").append(str);
        sb.append(", mybatisTime2=").append(mybatisTime2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}