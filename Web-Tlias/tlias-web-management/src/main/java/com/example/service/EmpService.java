package com.example.service;

import com.example.pojo.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public interface EmpService {
//    public PageResult<Emp> page(Integer page, Integer pageSize, String name, Integer gender,
//                                LocalDate begin,
//                                LocalDate end);
    public PageResult<Emp> page(EmpQueryParam empQueryParam);

    void save(Emp emp);

    void delete(Integer[] id);

    void update(Emp emp);

    Emp getInfo(Integer id);

    LoginInfo login(Emp emp);
}
