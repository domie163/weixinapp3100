package com.dao;

import com.entity.GonggaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GonggaoxinxiVO;
import com.entity.view.GonggaoxinxiView;


/**
 * 公告信息
 * 
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
public interface GonggaoxinxiDao extends BaseMapper<GonggaoxinxiEntity> {
	
	List<GonggaoxinxiVO> selectListVO(@Param("ew") Wrapper<GonggaoxinxiEntity> wrapper);
	
	GonggaoxinxiVO selectVO(@Param("ew") Wrapper<GonggaoxinxiEntity> wrapper);
	
	List<GonggaoxinxiView> selectListView(@Param("ew") Wrapper<GonggaoxinxiEntity> wrapper);

	List<GonggaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GonggaoxinxiEntity> wrapper);
	
	GonggaoxinxiView selectView(@Param("ew") Wrapper<GonggaoxinxiEntity> wrapper);
	

}
