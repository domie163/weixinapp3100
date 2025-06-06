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


import com.dao.ShenqingfuyiDao;
import com.entity.ShenqingfuyiEntity;
import com.service.ShenqingfuyiService;
import com.entity.vo.ShenqingfuyiVO;
import com.entity.view.ShenqingfuyiView;

@Service("shenqingfuyiService")
public class ShenqingfuyiServiceImpl extends ServiceImpl<ShenqingfuyiDao, ShenqingfuyiEntity> implements ShenqingfuyiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenqingfuyiEntity> page = this.selectPage(
                new Query<ShenqingfuyiEntity>(params).getPage(),
                new EntityWrapper<ShenqingfuyiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenqingfuyiEntity> wrapper) {
		  Page<ShenqingfuyiView> page =new Query<ShenqingfuyiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenqingfuyiVO> selectListVO(Wrapper<ShenqingfuyiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenqingfuyiVO selectVO(Wrapper<ShenqingfuyiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenqingfuyiView> selectListView(Wrapper<ShenqingfuyiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenqingfuyiView selectView(Wrapper<ShenqingfuyiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
