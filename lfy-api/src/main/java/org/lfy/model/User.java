package org.lfy.model;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

import java.io.Serializable;

/**
 * @FileName: User
 * @Description: TODO
 * @Author: Lify
 * @CreateDate: 2022/5/26 15:42
 **/
@Data
@Builder
public class User implements Serializable {

    private Long userId;

    private String name;

    private String sex;

    private Integer age;

    private String goodAt;

    @Tolerate
    public User() {
    }
}
