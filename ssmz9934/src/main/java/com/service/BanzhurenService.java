package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanzhurenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanzhurenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanzhurenView;


/**
 * 班主任
 *
 * @author 
 * @email 
 * @date 2022-03-31 10:40:53
 */
public interface BanzhurenService extends IService<BanzhurenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanzhurenVO> selectListVO(Wrapper<BanzhurenEntity> wrapper);
   	
   	BanzhurenVO selectVO(@Param("ew") Wrapper<BanzhurenEntity> wrapper);
   	
   	List<BanzhurenView> selectListView(Wrapper<BanzhurenEntity> wrapper);
   	
   	BanzhurenView selectView(@Param("ew") Wrapper<BanzhurenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanzhurenEntity> wrapper);
   	

}

