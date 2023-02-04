package jsd2203.csmall.server220829.service.impl;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import jsd2203.csmall.server220829.ex.ServiceException;
import jsd2203.csmall.server220829.mapper.AlbumMapper;
import jsd2203.csmall.server220829.pojo.dto.AlbumAddNewDTO;
import jsd2203.csmall.server220829.pojo.entity.Album;
import jsd2203.csmall.server220829.pojo.vo.AlbumDetailVO;
import jsd2203.csmall.server220829.pojo.vo.AlbumListItemVO;
import jsd2203.csmall.server220829.service.IAlbumService;
import jsd2203.csmall.server220829.web.ServiceCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 基于接口编程当controller调用service,service是实现了Iservice的实现类
 * 此实现类再调用servicemapper具体实现方法
 * 此处为业务层,只处理业务
 * */
@Slf4j
public class AlbumServiceImpl implements IAlbumService {

    @Autowired
    private AlbumMapper albumMapper;

    public AlbumServiceImpl() {
        System.out.println("创建当前业务类");
    }

    @Override
    public void addNew(AlbumAddNewDTO albumAddNewDTO) {
      log.debug("开始处理添加相册业务,参数:{}",albumAddNewDTO);
        String name = albumAddNewDTO.getName();
        int count = albumMapper.countByName(name);
        if (count>0){
            String message = "添加相册失败，相册名称【" + name + "】已经被占用！";
            log.error(message);
            throw new ServiceException(ServiceCode.ERR_CONFLICT, message);
        }

        Album album = new Album();
        BeanUtils.copyProperties(albumAddNewDTO,album);

        if (album.getSort()==null){
            album.setSort(0);

        }
        int insert = albumMapper.insert(album);
        if (insert !=1){
            String message = "添加相册失败，服务器忙，请稍后再次尝试！";
            log.error(message);
            throw new ServiceException(ServiceCode.ERR_INSERT, message);
        }


    }
    /**
     * 根据id删除相册方法
     * @param id 相册所属id
     *
     * */
    @Override
    public void deleteById(Long id) {
         AlbumDetailVO queryResult = albumMapper.getById(id);
        if (queryResult == null){
            String message = "删除相册失败，尝试删除的数据不存在！";
            log.error(message);
            throw new ServiceException(ServiceCode.ERR_NOT_FOUND, message);
        }
        int i = albumMapper.deleteById(id);
        if (i !=1){
            String message = "删除相册失败，服务器忙，请稍后再次尝试！";
            log.error(message);
            throw new ServiceException(ServiceCode.ERR_NOT_FOUND, message);
        }


    }
/**
 * 修改方法
 *
 * **/
    @Override
    public void updateByAlbumDTO(AlbumDetailVO albumDetailVO) {

    }


    /**
 *
 * 品牌列表数据
 * */
    @Override
    public List<AlbumListItemVO> list() {
        log.debug("开始处理查询品牌列表的业务");
        return albumMapper.list();
    }
}
