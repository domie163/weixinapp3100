package com.dao;

import com.entity.ZizhupingyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZizhupingyiVO;
import com.entity.view.ZizhupingyiView;


/**
 * 资助评议
 * 
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
public interface ZizhupingyiDao extends BaseMapper<ZizhupingyiEntity> {
	
	List<ZizhupingyiVO> selectListVO(@Param("ew") Wrapper<ZizhupingyiEntity> wrapper);
	
	ZizhupingyiVO selectVO(@Param("ew") Wrapper<ZizhupingyiEntity> wrapper);
	
	List<ZizhupingyiView> selectListView(@Param("ew") Wrapper<ZizhupingyiEntity> wrapper);

	List<ZizhupingyiView> selectListView(Pagination page,@Param("ew") Wrapper<ZizhupingyiEntity> wrapper);
	
	ZizhupingyiView selectView(@Param("ew") Wrapper<ZizhupingyiEntity> wrapper);
	

}
