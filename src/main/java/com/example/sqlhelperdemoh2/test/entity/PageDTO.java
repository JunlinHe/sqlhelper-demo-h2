package com.example.sqlhelperdemoh2.test.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hejunlin
 * @version 1.0
 * @since 2020/05/19 18:51
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PageDTO {
    @Builder.Default
    private Integer pageNo = 0;
    @Builder.Default
    private Integer pageSize = 5;
    private String order;
}
