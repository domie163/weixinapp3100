package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZizhupingyiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZizhupingyiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZizhupingyiView;


/**
 * 资助评议
 *
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
public interface ZizhupingyiService extends IService<ZizhupingyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZizhupingyiVO> selectListVO(Wrapper<ZizhupingyiEntity> wrapper);
   	
   	ZizhupingyiVO selectVO(@Param("ew") Wrapper<ZizhupingyiEntity> wrapper);
   	
   	List<ZizhupingyiView> selectListView(Wrapper<ZizhupingyiEntity> wrapper);
   	
   	ZizhupingyiView selectView(@Param("ew") Wrapper<ZizhupingyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZizhupingyiEntity> wrapper);
   	

}

