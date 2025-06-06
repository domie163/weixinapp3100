package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuizhigonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuizhigonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuizhigonggaoView;


/**
 * 回执公告
 *
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
public interface HuizhigonggaoService extends IService<HuizhigonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuizhigonggaoVO> selectListVO(Wrapper<HuizhigonggaoEntity> wrapper);
   	
   	HuizhigonggaoVO selectVO(@Param("ew") Wrapper<HuizhigonggaoEntity> wrapper);
   	
   	List<HuizhigonggaoView> selectListView(Wrapper<HuizhigonggaoEntity> wrapper);
   	
   	HuizhigonggaoView selectView(@Param("ew") Wrapper<HuizhigonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuizhigonggaoEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<HuizhigonggaoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<HuizhigonggaoEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<HuizhigonggaoEntity> wrapper);
}

