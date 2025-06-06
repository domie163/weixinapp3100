package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenqingfuyiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenqingfuyiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenqingfuyiView;


/**
 * 申请复议
 *
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
public interface ShenqingfuyiService extends IService<ShenqingfuyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenqingfuyiVO> selectListVO(Wrapper<ShenqingfuyiEntity> wrapper);
   	
   	ShenqingfuyiVO selectVO(@Param("ew") Wrapper<ShenqingfuyiEntity> wrapper);
   	
   	List<ShenqingfuyiView> selectListView(Wrapper<ShenqingfuyiEntity> wrapper);
   	
   	ShenqingfuyiView selectView(@Param("ew") Wrapper<ShenqingfuyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenqingfuyiEntity> wrapper);
   	

}

