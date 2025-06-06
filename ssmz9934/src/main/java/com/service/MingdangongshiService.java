package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MingdangongshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MingdangongshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MingdangongshiView;


/**
 * 名单公示
 *
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
public interface MingdangongshiService extends IService<MingdangongshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MingdangongshiVO> selectListVO(Wrapper<MingdangongshiEntity> wrapper);
   	
   	MingdangongshiVO selectVO(@Param("ew") Wrapper<MingdangongshiEntity> wrapper);
   	
   	List<MingdangongshiView> selectListView(Wrapper<MingdangongshiEntity> wrapper);
   	
   	MingdangongshiView selectView(@Param("ew") Wrapper<MingdangongshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MingdangongshiEntity> wrapper);
   	

}

