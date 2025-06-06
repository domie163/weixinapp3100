package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GonggaofenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GonggaofenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GonggaofenleiView;


/**
 * 公告分类
 *
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
public interface GonggaofenleiService extends IService<GonggaofenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GonggaofenleiVO> selectListVO(Wrapper<GonggaofenleiEntity> wrapper);
   	
   	GonggaofenleiVO selectVO(@Param("ew") Wrapper<GonggaofenleiEntity> wrapper);
   	
   	List<GonggaofenleiView> selectListView(Wrapper<GonggaofenleiEntity> wrapper);
   	
   	GonggaofenleiView selectView(@Param("ew") Wrapper<GonggaofenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GonggaofenleiEntity> wrapper);
   	

}

