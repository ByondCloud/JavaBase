package com.cloud.j使用Dao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/25
 * @Time 5:39
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Actor {
    private Integer id;
    private String name;
    private String sex;
    private LocalDateTime borndate;
    private String phone;
}
