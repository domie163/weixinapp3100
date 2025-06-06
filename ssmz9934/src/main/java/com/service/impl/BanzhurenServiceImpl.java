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


import com.dao.BanzhurenDao;
import com.entity.BanzhurenEntity;
import com.service.BanzhurenService;
import com.entity.vo.BanzhurenVO;
import com.entity.view.BanzhurenView;

@Service("banzhurenService")
public class BanzhurenServiceImpl extends ServiceImpl<BanzhurenDao, BanzhurenEntity> implements BanzhurenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanzhurenEntity> page = this.selectPage(
                new Query<BanzhurenEntity>(params).getPage(),
                new EntityWrapper<BanzhurenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanzhurenEntity> wrapper) {
		  Page<BanzhurenView> page =new Query<BanzhurenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanzhurenVO> selectListVO(Wrapper<BanzhurenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanzhurenVO selectVO(Wrapper<BanzhurenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanzhurenView> selectListView(Wrapper<BanzhurenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanzhurenView selectView(Wrapper<BanzhurenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
