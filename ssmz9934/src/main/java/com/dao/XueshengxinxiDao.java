package com.dao;

import com.entity.XueshengxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengxinxiVO;
import com.entity.view.XueshengxinxiView;


/**
 * 学生信息
 * 
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
public interface XueshengxinxiDao extends BaseMapper<XueshengxinxiEntity> {
	
	List<XueshengxinxiVO> selectListVO(@Param("ew") Wrapper<XueshengxinxiEntity> wrapper);
	
	XueshengxinxiVO selectVO(@Param("ew") Wrapper<XueshengxinxiEntity> wrapper);
	
	List<XueshengxinxiView> selectListView(@Param("ew") Wrapper<XueshengxinxiEntity> wrapper);

	List<XueshengxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengxinxiEntity> wrapper);
	
	XueshengxinxiView selectView(@Param("ew") Wrapper<XueshengxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<XueshengxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XueshengxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XueshengxinxiEntity> wrapper);
}
