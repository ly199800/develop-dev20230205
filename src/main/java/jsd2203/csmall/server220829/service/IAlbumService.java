package jsd2203.csmall.server220829.service;

import jsd2203.csmall.server220829.pojo.dto.AlbumAddNewDTO;
import jsd2203.csmall.server220829.pojo.vo.AlbumDetailVO;
import jsd2203.csmall.server220829.pojo.vo.AlbumListItemVO;

import java.util.List;

/***
 * 相册业务接口,mybatis框架帮我们简写了jdbc那一套流程
 * 我们只需要写接口和抽象方法以及映射的xml文件
 * 最后再配置文件里配置当前xml文件所在的包
 * # Mybatis的Mapper文件（XML）位置
 * mybatis.mapper-locations=classpath:mapper/*.xml
 * */
public interface IAlbumService {
    /**
     * 添加相册
     *
     * @param albumAddNewDTO 添加的相册数据
     */
    void addNew(AlbumAddNewDTO albumAddNewDTO);

    /**
     * 根据id删除相册
     *
     * @param id
     */
    void deleteById(Long id);



     void updateByAlbumDTO(AlbumDetailVO albumDetailVO);

    /**
     * 查询相册列表
     *
     * @return 相册列表的集合
     */
    List<AlbumListItemVO> list();
}
