package com.cloud.d自定义异常;

import lombok.*;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/18
 * @Time 21:08
 */
public class Main {
    public static void main(String[] args) {
        throw new DIYException("错误", 1000);
    }
}


@Data
@NoArgsConstructor
@AllArgsConstructor
class DIYException extends RuntimeException {

    private String message;

    private Integer code;
}

