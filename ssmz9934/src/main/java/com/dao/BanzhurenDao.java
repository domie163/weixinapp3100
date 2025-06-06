package com.dao;

import com.entity.BanzhurenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanzhurenVO;
import com.entity.view.BanzhurenView;


/**
 * 班主任
 * 
 * @author 
 * @email 
 * @date 2022-03-31 10:40:53
 */
public interface BanzhurenDao extends BaseMapper<BanzhurenEntity> {
	
	List<BanzhurenVO> selectListVO(@Param("ew") Wrapper<BanzhurenEntity> wrapper);
	
	BanzhurenVO selectVO(@Param("ew") Wrapper<BanzhurenEntity> wrapper);
	
	List<BanzhurenView> selectListView(@Param("ew") Wrapper<BanzhurenEntity> wrapper);

	List<BanzhurenView> selectListView(Pagination page,@Param("ew") Wrapper<BanzhurenEntity> wrapper);
	
	BanzhurenView selectView(@Param("ew") Wrapper<BanzhurenEntity> wrapper);
	

}
