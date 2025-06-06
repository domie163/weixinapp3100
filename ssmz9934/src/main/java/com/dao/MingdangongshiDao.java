package com.dao;

import com.entity.MingdangongshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MingdangongshiVO;
import com.entity.view.MingdangongshiView;


/**
 * 名单公示
 * 
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
public interface MingdangongshiDao extends BaseMapper<MingdangongshiEntity> {
	
	List<MingdangongshiVO> selectListVO(@Param("ew") Wrapper<MingdangongshiEntity> wrapper);
	
	MingdangongshiVO selectVO(@Param("ew") Wrapper<MingdangongshiEntity> wrapper);
	
	List<MingdangongshiView> selectListView(@Param("ew") Wrapper<MingdangongshiEntity> wrapper);

	List<MingdangongshiView> selectListView(Pagination page,@Param("ew") Wrapper<MingdangongshiEntity> wrapper);
	
	MingdangongshiView selectView(@Param("ew") Wrapper<MingdangongshiEntity> wrapper);
	

}
