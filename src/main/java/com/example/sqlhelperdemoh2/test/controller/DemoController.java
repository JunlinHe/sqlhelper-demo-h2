package com.example.sqlhelperdemoh2.test.controller;


import com.example.sqlhelperdemoh2.test.entity.Demo;
import com.example.sqlhelperdemoh2.test.entity.PageDTO;
import com.example.sqlhelperdemoh2.test.service.IDemoService;
import com.jn.sqlhelper.dialect.pagination.PagingRequest;
import com.jn.sqlhelper.dialect.pagination.PagingResult;
import com.jn.sqlhelper.dialect.pagination.SqlPaginations;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author hejunlin
 * @since 2020-05-18
 */
@RestController
@AllArgsConstructor
@RequestMapping("/demo")
public class DemoController {

    private final IDemoService demoService;

    @GetMapping("{id}")
    public Demo getById(@PathVariable Integer id) {
        return demoService.getById(id);
    }

    @GetMapping("/page")
    public PagingResult<Demo> page(PageDTO pageDTO) {
        PagingRequest<?, Demo> request = SqlPaginations.preparePagination(pageDTO.getPageNo(), pageDTO.getPageSize(), pageDTO.getOrder());

        demoService.list();

        return request.getResult();
    }

    @PostMapping
    public Demo save(@RequestBody Demo demo) {
        return demo.insert() ? demo : null;
    }
}

