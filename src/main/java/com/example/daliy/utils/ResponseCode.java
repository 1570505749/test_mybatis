/**
 * Copyright (C), 2019-2019, 软件卓越人才班
 * FileName: ResponseCode
 * Author:   hzg
 * Date:     2019-12-23 14:46
 * Description: 返回的处理代码
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.daliy.utils;

/**
 * 〈一句话功能简述〉<br> 
 * 〈返回的处理代码〉
 *
 * @author hbr
 * @create 2019-12-23
 * @since 1.0.0
 */
public enum ResponseCode {
    SUCCESS(1, "success"),
    FAILED(0, "failed");


    private final int value;
    private final String description;

    private ResponseCode(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int value() {
        return this.value;
    }

    public String getDescription() {
        return this.description;
    }

}
