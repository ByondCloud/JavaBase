package com.cloud.fDBUtils的使用;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;


/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/23
 * @Time 23:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Actor {
    private int id;
    private String name;
    private String sex;
    private LocalDateTime borndate;
    private String phone;
}
