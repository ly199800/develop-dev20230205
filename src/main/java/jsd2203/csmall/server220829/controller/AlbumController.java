package jsd2203.csmall.server220829.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jsd2203.csmall.server220829.pojo.dto.AlbumAddNewDTO;
import jsd2203.csmall.server220829.pojo.vo.AlbumListItemVO;
import jsd2203.csmall.server220829.service.IAlbumService;
import jsd2203.csmall.server220829.web.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 相册控制器
 *
 * */
@Slf4j
@Api(tags = "3.相册管理模块")
@RestController
@RequestMapping("/albums")
public class AlbumController {
     @Autowired
     private IAlbumService albumService;

    public AlbumController() {
        log.debug("创建控制器对象：AlbumController");
    }
    // http://localhost:9080/albums/add-new
    @ApiOperation("添加相册")
    @ApiOperationSupport(order = 100)
    @PostMapping("/add-new")
    public JsonResult addNew(@RequestBody AlbumAddNewDTO albumAddNewDTO){
        log.debug("接收到的请求参数：{}", albumAddNewDTO);
        albumService.addNew(albumAddNewDTO);
        return JsonResult.ok();
    }

    // http://localhost:9080/albums/1/delete
    @ApiOperation("删除相册")
    @ApiOperationSupport(order = 200)
    @PostMapping("/{id:[0-9]+}/delete")
    public JsonResult deleteById(@PathVariable Long id) {
        log.debug("接收到的请求参数：{}", id);
        albumService.deleteById(id);
        return JsonResult.ok();
    }

    // http://localhost:9080/albums
    @ApiOperation("查询相册列表")
    @ApiOperationSupport(order = 400)
    @GetMapping("")
    public JsonResult list() {
        log.debug("接收到查询相册列表的请求");
        List<AlbumListItemVO> albums = albumService.list();
        return JsonResult.ok(albums);
    }






}
