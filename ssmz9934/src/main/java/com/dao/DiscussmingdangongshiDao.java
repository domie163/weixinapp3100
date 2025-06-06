package com.dao;

import com.entity.DiscussmingdangongshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmingdangongshiVO;
import com.entity.view.DiscussmingdangongshiView;


/**
 * 名单公示评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
public interface DiscussmingdangongshiDao extends BaseMapper<DiscussmingdangongshiEntity> {
	
	List<DiscussmingdangongshiVO> selectListVO(@Param("ew") Wrapper<DiscussmingdangongshiEntity> wrapper);
	
	DiscussmingdangongshiVO selectVO(@Param("ew") Wrapper<DiscussmingdangongshiEntity> wrapper);
	
	List<DiscussmingdangongshiView> selectListView(@Param("ew") Wrapper<DiscussmingdangongshiEntity> wrapper);

	List<DiscussmingdangongshiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmingdangongshiEntity> wrapper);
	
	DiscussmingdangongshiView selectView(@Param("ew") Wrapper<DiscussmingdangongshiEntity> wrapper);
	

}
