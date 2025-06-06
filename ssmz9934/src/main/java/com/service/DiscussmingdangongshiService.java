package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmingdangongshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmingdangongshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmingdangongshiView;


/**
 * 名单公示评论表
 *
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
public interface DiscussmingdangongshiService extends IService<DiscussmingdangongshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmingdangongshiVO> selectListVO(Wrapper<DiscussmingdangongshiEntity> wrapper);
   	
   	DiscussmingdangongshiVO selectVO(@Param("ew") Wrapper<DiscussmingdangongshiEntity> wrapper);
   	
   	List<DiscussmingdangongshiView> selectListView(Wrapper<DiscussmingdangongshiEntity> wrapper);
   	
   	DiscussmingdangongshiView selectView(@Param("ew") Wrapper<DiscussmingdangongshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmingdangongshiEntity> wrapper);
   	

}

