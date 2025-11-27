package com.example.controller;

import com.example.pojo.Dept;
import com.example.pojo.Result;
import com.example.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequestMapping("/depts") 可以提取公因式
@Slf4j // 记录日志
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/depts")
    public Result list() {
//        System.out.println("查询全部部门数据");
        log.info("查询全部部门数据");
        List<Dept> deptList = deptService.findAll();
        return Result.success(deptList);
    }

    @DeleteMapping("/depts")
    public Result delete(Integer id) {  // 名称“id”一致时省略@RequestParam  若不给?id=..则‘删除部门数据：null’
//        System.out.println("删除部门数据：" + id);
        log.info("删除部门数据：{}", id); //占位符与传递参数
        deptService.deleteById(id);
        return Result.success();
    }

    @PostMapping("/depts")
    public Result add(@RequestBody Dept dept) {
//        System.out.println("新增部门数据：" + dept);
        log.info("新增部门数据：{}", dept);
        deptService.add(dept);
        return Result.success();
    }

    @GetMapping("/depts/{id}")
    public Result getById(@PathVariable Integer id) {
//        System.out.println("查询单个部门数据：" + id);
        log.info("查询单个部门数据：{}", id);
        Dept dept = deptService.getById(id);
        return Result.success(dept);
    }

    @PutMapping("/depts")
    public Result update(@RequestBody Dept dept) {
//        System.out.println("修改部门数据：" + dept);
        log.info("修改部门数据：{}", dept);
        deptService.update(dept);
        return Result.success();
    }
}
