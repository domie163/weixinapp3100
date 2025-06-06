package com.dao;

import com.entity.HuizhigonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuizhigonggaoVO;
import com.entity.view.HuizhigonggaoView;


/**
 * 回执公告
 * 
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
public interface HuizhigonggaoDao extends BaseMapper<HuizhigonggaoEntity> {
	
	List<HuizhigonggaoVO> selectListVO(@Param("ew") Wrapper<HuizhigonggaoEntity> wrapper);
	
	HuizhigonggaoVO selectVO(@Param("ew") Wrapper<HuizhigonggaoEntity> wrapper);
	
	List<HuizhigonggaoView> selectListView(@Param("ew") Wrapper<HuizhigonggaoEntity> wrapper);

	List<HuizhigonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<HuizhigonggaoEntity> wrapper);
	
	HuizhigonggaoView selectView(@Param("ew") Wrapper<HuizhigonggaoEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<HuizhigonggaoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuizhigonggaoEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuizhigonggaoEntity> wrapper);
}
