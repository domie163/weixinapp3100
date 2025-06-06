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


import com.dao.ZizhupingyiDao;
import com.entity.ZizhupingyiEntity;
import com.service.ZizhupingyiService;
import com.entity.vo.ZizhupingyiVO;
import com.entity.view.ZizhupingyiView;

@Service("zizhupingyiService")
public class ZizhupingyiServiceImpl extends ServiceImpl<ZizhupingyiDao, ZizhupingyiEntity> implements ZizhupingyiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZizhupingyiEntity> page = this.selectPage(
                new Query<ZizhupingyiEntity>(params).getPage(),
                new EntityWrapper<ZizhupingyiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZizhupingyiEntity> wrapper) {
		  Page<ZizhupingyiView> page =new Query<ZizhupingyiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZizhupingyiVO> selectListVO(Wrapper<ZizhupingyiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZizhupingyiVO selectVO(Wrapper<ZizhupingyiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZizhupingyiView> selectListView(Wrapper<ZizhupingyiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZizhupingyiView selectView(Wrapper<ZizhupingyiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
