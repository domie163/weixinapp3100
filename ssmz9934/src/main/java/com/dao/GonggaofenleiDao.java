package com.dao;

import com.entity.GonggaofenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GonggaofenleiVO;
import com.entity.view.GonggaofenleiView;


/**
 * 公告分类
 * 
 * @author 
 * @email 
 * @date 2022-03-31 10:40:54
 */
public interface GonggaofenleiDao extends BaseMapper<GonggaofenleiEntity> {
	
	List<GonggaofenleiVO> selectListVO(@Param("ew") Wrapper<GonggaofenleiEntity> wrapper);
	
	GonggaofenleiVO selectVO(@Param("ew") Wrapper<GonggaofenleiEntity> wrapper);
	
	List<GonggaofenleiView> selectListView(@Param("ew") Wrapper<GonggaofenleiEntity> wrapper);

	List<GonggaofenleiView> selectListView(Pagination page,@Param("ew") Wrapper<GonggaofenleiEntity> wrapper);
	
	GonggaofenleiView selectView(@Param("ew") Wrapper<GonggaofenleiEntity> wrapper);
	

}
