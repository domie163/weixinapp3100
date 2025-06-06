package com.dao;

import com.entity.ZizhushenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZizhushenqingVO;
import com.entity.view.ZizhushenqingView;


/**
 * 资助申请
 * 
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
public interface ZizhushenqingDao extends BaseMapper<ZizhushenqingEntity> {
	
	List<ZizhushenqingVO> selectListVO(@Param("ew") Wrapper<ZizhushenqingEntity> wrapper);
	
	ZizhushenqingVO selectVO(@Param("ew") Wrapper<ZizhushenqingEntity> wrapper);
	
	List<ZizhushenqingView> selectListView(@Param("ew") Wrapper<ZizhushenqingEntity> wrapper);

	List<ZizhushenqingView> selectListView(Pagination page,@Param("ew") Wrapper<ZizhushenqingEntity> wrapper);
	
	ZizhushenqingView selectView(@Param("ew") Wrapper<ZizhushenqingEntity> wrapper);
	

}
