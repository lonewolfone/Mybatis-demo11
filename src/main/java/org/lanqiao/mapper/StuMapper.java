package org.lanqiao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.lanqiao.entity.Stu;

public interface StuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu
     *
     * @mbg.generated
     */
    int insert(Stu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu
     *
     * @mbg.generated
     */
    Stu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu
     *
     * @mbg.generated
     */
    @Select("select * from stu")
    List<Stu> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Stu record);
}