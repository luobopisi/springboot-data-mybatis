package com.springboot.datamybatis.mapper;

import com.springboot.datamybatis.bean.Department;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;


//指定这是一个操作数据库的mapper
//@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    //@Options 返回主键
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentname) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set department_name=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
