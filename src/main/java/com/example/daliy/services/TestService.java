package com.example.daliy.services;

import com.example.daliy.bean.Report;
import com.example.daliy.bean.User;
import com.example.daliy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    UserMapper userMapper;

    public User login(String username, String password){
        return userMapper.login(username,password);
    }

    public List<Report> getAllReport(String createdperson ,int reporttype){
        return userMapper.getAllReport(createdperson,reporttype);
    }

    public void addReport(Report report){
        userMapper.saveReport(report);
    }

    public List<Report>  getGroupReport(String groupname,int reporttype){ return userMapper.getGroupReport(groupname,reporttype);}

    public List<Report>  getClassReport(int reporttype){ return userMapper.getClassReport(reporttype);}
}
