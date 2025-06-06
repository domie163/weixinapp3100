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


import com.dao.MingdangongshiDao;
import com.entity.MingdangongshiEntity;
import com.service.MingdangongshiService;
import com.entity.vo.MingdangongshiVO;
import com.entity.view.MingdangongshiView;

@Service("mingdangongshiService")
public class MingdangongshiServiceImpl extends ServiceImpl<MingdangongshiDao, MingdangongshiEntity> implements MingdangongshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MingdangongshiEntity> page = this.selectPage(
                new Query<MingdangongshiEntity>(params).getPage(),
                new EntityWrapper<MingdangongshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MingdangongshiEntity> wrapper) {
		  Page<MingdangongshiView> page =new Query<MingdangongshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MingdangongshiVO> selectListVO(Wrapper<MingdangongshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MingdangongshiVO selectVO(Wrapper<MingdangongshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MingdangongshiView> selectListView(Wrapper<MingdangongshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MingdangongshiView selectView(Wrapper<MingdangongshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
