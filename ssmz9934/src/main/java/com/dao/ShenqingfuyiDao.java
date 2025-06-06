package com.dao;

import com.entity.ShenqingfuyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenqingfuyiVO;
import com.entity.view.ShenqingfuyiView;


/**
 * 申请复议
 * 
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
public interface ShenqingfuyiDao extends BaseMapper<ShenqingfuyiEntity> {
	
	List<ShenqingfuyiVO> selectListVO(@Param("ew") Wrapper<ShenqingfuyiEntity> wrapper);
	
	ShenqingfuyiVO selectVO(@Param("ew") Wrapper<ShenqingfuyiEntity> wrapper);
	
	List<ShenqingfuyiView> selectListView(@Param("ew") Wrapper<ShenqingfuyiEntity> wrapper);

	List<ShenqingfuyiView> selectListView(Pagination page,@Param("ew") Wrapper<ShenqingfuyiEntity> wrapper);
	
	ShenqingfuyiView selectView(@Param("ew") Wrapper<ShenqingfuyiEntity> wrapper);
	

}
