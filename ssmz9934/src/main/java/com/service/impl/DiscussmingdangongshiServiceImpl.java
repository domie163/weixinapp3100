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


import com.dao.DiscussmingdangongshiDao;
import com.entity.DiscussmingdangongshiEntity;
import com.service.DiscussmingdangongshiService;
import com.entity.vo.DiscussmingdangongshiVO;
import com.entity.view.DiscussmingdangongshiView;

@Service("discussmingdangongshiService")
public class DiscussmingdangongshiServiceImpl extends ServiceImpl<DiscussmingdangongshiDao, DiscussmingdangongshiEntity> implements DiscussmingdangongshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmingdangongshiEntity> page = this.selectPage(
                new Query<DiscussmingdangongshiEntity>(params).getPage(),
                new EntityWrapper<DiscussmingdangongshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmingdangongshiEntity> wrapper) {
		  Page<DiscussmingdangongshiView> page =new Query<DiscussmingdangongshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmingdangongshiVO> selectListVO(Wrapper<DiscussmingdangongshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmingdangongshiVO selectVO(Wrapper<DiscussmingdangongshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmingdangongshiView> selectListView(Wrapper<DiscussmingdangongshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmingdangongshiView selectView(Wrapper<DiscussmingdangongshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
