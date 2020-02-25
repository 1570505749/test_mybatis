/**
 * Copyright (C), 2019-2019, 软件卓越人才班
 * FileName: ResponseData
 * Author:   hzg
 * Date:     2019-12-23 14:43
 * Description: 示例响应信息
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.daliy.utils;

import lombok.Data;

/**
 * 〈一句话功能简述〉<br> 
 * 〈示例响应信息〉
 *
 * @author hzg
 * @create 2019-12-23
 * @since 1.0.0
 */
@Data
public class ResponseData {

    private int resultCode;
    private String message;
    private Object resultData;

}
