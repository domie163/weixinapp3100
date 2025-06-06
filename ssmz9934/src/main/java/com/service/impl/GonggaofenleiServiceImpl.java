package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GonggaofenleiDao;
import com.entity.GonggaofenleiEntity;
import com.service.GonggaofenleiService;
import com.entity.vo.GonggaofenleiVO;
import com.entity.view.GonggaofenleiView;

@Service("gonggaofenleiService")
public class GonggaofenleiServiceImpl extends ServiceImpl<GonggaofenleiDao, GonggaofenleiEntity> implements GonggaofenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GonggaofenleiEntity> page = this.selectPage(
                new Query<GonggaofenleiEntity>(params).getPage(),
                new EntityWrapper<GonggaofenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GonggaofenleiEntity> wrapper) {
		  Page<GonggaofenleiView> page =new Query<GonggaofenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GonggaofenleiVO> selectListVO(Wrapper<GonggaofenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GonggaofenleiVO selectVO(Wrapper<GonggaofenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GonggaofenleiView> selectListView(Wrapper<GonggaofenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GonggaofenleiView selectView(Wrapper<GonggaofenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
