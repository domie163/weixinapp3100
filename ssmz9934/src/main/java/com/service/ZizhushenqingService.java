package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZizhushenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZizhushenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZizhushenqingView;


/**
 * 资助申请
 *
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
public interface ZizhushenqingService extends IService<ZizhushenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZizhushenqingVO> selectListVO(Wrapper<ZizhushenqingEntity> wrapper);
   	
   	ZizhushenqingVO selectVO(@Param("ew") Wrapper<ZizhushenqingEntity> wrapper);
   	
   	List<ZizhushenqingView> selectListView(Wrapper<ZizhushenqingEntity> wrapper);
   	
   	ZizhushenqingView selectView(@Param("ew") Wrapper<ZizhushenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZizhushenqingEntity> wrapper);
   	

}

