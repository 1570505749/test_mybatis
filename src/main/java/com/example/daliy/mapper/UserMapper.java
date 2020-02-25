package com.example.daliy.mapper;

import com.example.daliy.bean.Report;
import com.example.daliy.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

   @Select("SELECT * FROM user WHERE username=#{username} AND password=#{password}")
    public User login(@Param("username") String username, @Param("password") String password);

   @Select("SELECT * FROM report WHERE createdperson=#{createdperson} AND reporttype=#{reporttype}")
    public List<Report> getAllReport(String createdperson,int reporttype);

   @Insert("INSERT INTO report(`reporttype`, `workcontent`, `difficulty`, `solution`, `experience`, `plan`, `createddate`, `createdperson`, `createdgroup`, `createdid`) VALUES (#{reportType}, #{workContent}, #{difficulty}, #{solution}, #{experience},#{plan}, #{createdDate}, #{createdPerson}, #{createdGroup}, #{createdId})")
    public  void  saveReport(Report report);

    @Select("SELECT * FROM report WHERE createdgroup=#{groupname} AND reporttype=#{reporttype}")
    public  List<Report> getGroupReport(String groupname,int reporttype);

    @Select("SELECT * FROM report WHERE reporttype=#{reporttype}")
    public  List<Report> getClassReport(int reporttype);
}
