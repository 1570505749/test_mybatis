package com.example.daliy.bean;

/**
 * Copyright (C), 2019-2019, 软件卓越人才班
 * FileName: Report
 * Author:   hzg
 * Date:     2019-12-27 11:20
 * Description: 日报周报
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈日报周报〉
 *
 * @author hzg
 * @create 2019-12-27
 * @since 1.0.0
 */
@Data
public class Report {

    private Integer reportId;
    /**
     * 报告类型，日报或者周报
     */
    private Integer typeId;
    /**
     * 人员类型，成员，组长，老师
     */
    private Integer reportType;

    /**
     * 工作内容
     */
    private String workContent;
    /**
     * 遇到的困难
     */
    private String difficulty;
    /**
     * 解决方法
     */
    private String solution;
    /**
     * 心得体会
     */
    private String experience;
    /**
     * 后续计划
     */
    private String plan;

    /**
     * 写日报的时间，返回时转成正常日期格式 年-月-日
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createdDate;


    /**
     * 写日报的人归属的小组
     */
    private String createdGroup;

    /**
     * 写日报的人
     */
    private String createdPerson;

    /**
     * 写日报的人的id
     */
    private String createdId;


}
