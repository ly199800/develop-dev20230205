package jsd2203.csmall.server220829.controller;


import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jsd2203.csmall.server220829.pojo.dto.CategoryAddNewDTO;
import jsd2203.csmall.server220829.pojo.vo.CategoryListItemVO;
import jsd2203.csmall.server220829.service.ICategoryService;
import jsd2203.csmall.server220829.web.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// ====================================================
// 以下部分是笔记
// ====================================================
// 需要被Spring创建对象的类型，必须：
// 1. 添加组件注解
//      基础的组件注解有：@Component（通用） / @Controller（控制器） / @Service（业务） / @Repository（存储）
//      在Spring框架的作用范围内，以上4个注解是等效的
// 2. 必须在“组件扫描”的包下
//      Spring框架会执行“组件扫描”操作，会在某个包下查找所有的类，如果类上添加了组件注解，就会创建此类的对象
//      Spring Boot项目默认执行了组件扫描，且扫描的包就是创建项目时已生成的包
//      组件扫描的包都是指的“根包”，组件类放在此根包下的各层级子孙包中也都是有效的
// ====================================================

/**
 * 类别控制器
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Slf4j
@Api(tags = "2. 类别管理模块")
@RestController
@RequestMapping("categories")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    public CategoryController() {
        log.debug("创建控制器对象：CategoryController");
    }

    // http://localhost:9080/categories/add-new
    @ApiOperation("添加类别")
    @ApiOperationSupport(order = 100)
    @PostMapping(value = "/add-new")
    public JsonResult addNew(@RequestBody CategoryAddNewDTO categoryAddNewDTO) {
        log.debug("接收到的请求参数：{}", categoryAddNewDTO);
        categoryService.addNew(categoryAddNewDTO);
        return JsonResult.ok();
    }

    // http://localhost:9080/categories/1/delete
    @ApiOperation("删除类别")
    @ApiOperationSupport(order = 200)
    @PostMapping("/{id:[0-9]+}/delete")
    public JsonResult deleteById(@PathVariable Long id) {
        log.debug("接收到的请求参数：{}", id);
        categoryService.deleteById(id);
        return JsonResult.ok();
    }

    @PostMapping("/update-by-id")
    @ApiOperation("修改类别")
    @ApiOperationSupport(order = 300)
    public String update() {
        int[] arr = new int[5];
        System.out.println(arr[-1]);
        log.debug("CategoryController.xx()");
        return "即将根据id修改类别信息（尚未完成）";
    }

    // http://localhost:9080/brands
    @ApiOperation("查询类别列表")
    @ApiOperationSupport(order = 400)
    @GetMapping("")
    public JsonResult listByParentId(Long parentId) {
        log.debug("接收到查询类别列表的请求");
        if (parentId == null) {
            parentId = 0L;
        }
        List<CategoryListItemVO> list = categoryService.listByParentId(parentId);
        return JsonResult.ok(list);
    }

}
