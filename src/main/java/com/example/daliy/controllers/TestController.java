package com.example.daliy.controllers;

import com.example.daliy.bean.Report;
import com.example.daliy.bean.User;
import com.example.daliy.services.TestService;
import com.example.daliy.utils.ResponseCode;
import com.example.daliy.utils.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestService testService;
    Report report;


//    @GetMapping("/test/{id}")
//    public String test(@PathVariable("id") String id){
//        System.out.println("test");
//        return testService.login(id);
//    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<Object> login(String username,String password, HttpSession session){
        ResponseData responseData = new ResponseData();
        User user=testService.login(username,password);
        responseData.setResultCode(ResponseCode.SUCCESS.value());
        if (testService.login(username,password)==null){
            responseData.setResultData("fail");
        }else{
            responseData.setResultData(user);
            session.setAttribute("username", user.getUsername());
            session.setAttribute("groupname",user.getGroupname());
            session.setAttribute("classname",user.getClassname());
            session.setAttribute("userid",user.getUserid());
            session.setAttribute("typeid",user.getTypeid());
        }
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }

    @ResponseBody
    @GetMapping("/dailyreport")
    public ResponseEntity<Object> daliyreport(HttpSession session){
        String username=(String)session.getAttribute("username");
        ResponseData responseData = new ResponseData();
        responseData.setResultCode(ResponseCode.SUCCESS.value());
        if(session.getAttribute("username")==null){
            responseData.setResultData("fail");
        }else {
            List<Report> list = testService.getAllReport(username, 1);
            responseData.setResultData(list);
        }
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }

    @ResponseBody
    @GetMapping("/groupdailyreport")
    public ResponseEntity<Object> groupdaliyreport(HttpSession session){
        String username=(String)session.getAttribute("username");
        ResponseData responseData = new ResponseData();
        responseData.setResultCode(ResponseCode.SUCCESS.value());
        if(session.getAttribute("username")==null){
            responseData.setResultData("fail");
        }else if(session.getAttribute("typeid").equals("1")){
            responseData.setResultData("no");
        }else {
            List<Report> list = testService.getGroupReport((String)session.getAttribute("groupname"),1);
            responseData.setResultData(list);
        }
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }

    @ResponseBody
    @GetMapping("/classdailyreport")
    public ResponseEntity<Object> classdaliyreport(HttpSession session){
        String username=(String)session.getAttribute("username");
        ResponseData responseData = new ResponseData();
        responseData.setResultCode(ResponseCode.SUCCESS.value());
        if(session.getAttribute("username")==null){
            responseData.setResultData("fail");
        }else if(!session.getAttribute("typeid").equals("3")){
            responseData.setResultData("no");
        }else {
            List<Report> list = testService.getClassReport((1));
            responseData.setResultData(list);
        }
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }

    @ResponseBody
    @GetMapping("/weekreport")
    public ResponseEntity<Object> weekreport(HttpSession session){
        String username=(String)session.getAttribute("username");
        ResponseData responseData = new ResponseData();
        responseData.setResultCode(ResponseCode.SUCCESS.value());
        if(session.getAttribute("username")==null){
            responseData.setResultData("fail");
        }else {
            List<Report> list = testService.getAllReport(username, 2);
            responseData.setResultData(list);
            System.out.println("ribao");
        }
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }


    @ResponseBody
    @GetMapping("/groupweekreport")
    public ResponseEntity<Object> groupweekreport(HttpSession session){
        String username=(String)session.getAttribute("username");
        ResponseData responseData = new ResponseData();
        responseData.setResultCode(ResponseCode.SUCCESS.value());
        if(session.getAttribute("username")==null){
            responseData.setResultData("fail");
        }else if(session.getAttribute("typeid").equals("1")){
            responseData.setResultData("no");
        }else {
            List<Report> list = testService.getGroupReport((String)session.getAttribute("groupname"),2);
            responseData.setResultData(list);
        }
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }

    @ResponseBody
    @GetMapping("/classweekreport")
    public ResponseEntity<Object> classweekreport(HttpSession session){
        String username=(String)session.getAttribute("username");
        ResponseData responseData = new ResponseData();
        responseData.setResultCode(ResponseCode.SUCCESS.value());
        if(session.getAttribute("username")==null){
            responseData.setResultData("fail");
        }else if(!session.getAttribute("typeid").equals("3")){
            responseData.setResultData("no");
        }else {
            List<Report> list = testService.getClassReport((2));
            responseData.setResultData(list);
        }
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }

    @RequestMapping(value = "/addreport",method = RequestMethod.POST)
    public ResponseEntity<Object> addReport(String workContent,String difficulty,String solution,String experience,String plan, HttpSession session){
        report=new Report();
        ResponseData responseData = new ResponseData();
        responseData.setResultCode(ResponseCode.SUCCESS.value());
        Calendar calendar=Calendar.getInstance();
        if(calendar.get(Calendar.DAY_OF_WEEK)-1==7){
            report.setReportType(2);
            System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        }else{
            report.setReportType(1);
            System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        }
        report.setCreatedDate(new Date());
        report.setWorkContent(workContent);
        report.setDifficulty(difficulty);
        report.setSolution(solution);
        report.setExperience(experience);
        report.setPlan(plan);
        if(session.getAttribute("username")==null){
            responseData.setResultData("fail");
        }else {
            report.setCreatedPerson((String) session.getAttribute("username"));
            report.setCreatedGroup((String) session.getAttribute("groupname"));
            report.setCreatedId(String.valueOf(session.getAttribute("userid")));
            responseData.setResultData("success");
            testService.addReport(report);
        }
        return new ResponseEntity<>(responseData, HttpStatus.OK);
        }
    }



