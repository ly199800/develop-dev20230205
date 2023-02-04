package jsd2203.csmall.server220829.mapper;

import jsd2203.csmall.server220829.pojo.entity.Album;
import jsd2203.csmall.server220829.pojo.vo.AlbumDetailVO;
import jsd2203.csmall.server220829.pojo.vo.AlbumListItemVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpuDetailMapper {

    /**
     *插入数据
     * @param album 相册数据
     * @return 受影响的行数, 成功插入数据时, 将返回1
     * */
    int insert(Album album);
    /**
     *根据图片id删除相册数据
     * @param id 期望删除相册数据的id
     * @return 受影响的行数, 成功插入数据时, 将返回,1如果无此id对应的数据，将返回0
     *
     * */
    int deleteById(Long id);
    /**
     * 根据若干个相册id，批量删除相册数据
     * @param ids 期望删除的若干个相册数据的id
     * @return 受影响的行数，将返回成功删除的数据量
     */
    int deleteByIds(Long[] ids);
    /**
     *根据id修改相册名,
     * @param id,name 期望修改相册数据的名字
     * @return 受影响的行数,成功修改数据时,将返回1,如果无此id对应的数据,将返回0
     * */
    int updateNameById(@Param("id")Long id,@Param("name")String name);
    /**
     * 查询相册表数据，统计
     * @return  返回统计结果
     * */
    int count();
    /**
     * 根据相册名称统计此名称对应的相册数据的数量
     *
     * @param name 相册名称
     * @return 此名称对应的品牌数据的数量
     */
    int countByName(String name);


    AlbumDetailVO getById(Long id);

    /**
     * 返回相册列表
     *
     * **/
    List<AlbumListItemVO> list();

}
