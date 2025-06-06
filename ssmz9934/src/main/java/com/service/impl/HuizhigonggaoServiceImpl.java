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


import com.dao.HuizhigonggaoDao;
import com.entity.HuizhigonggaoEntity;
import com.service.HuizhigonggaoService;
import com.entity.vo.HuizhigonggaoVO;
import com.entity.view.HuizhigonggaoView;

@Service("huizhigonggaoService")
public class HuizhigonggaoServiceImpl extends ServiceImpl<HuizhigonggaoDao, HuizhigonggaoEntity> implements HuizhigonggaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuizhigonggaoEntity> page = this.selectPage(
                new Query<HuizhigonggaoEntity>(params).getPage(),
                new EntityWrapper<HuizhigonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuizhigonggaoEntity> wrapper) {
		  Page<HuizhigonggaoView> page =new Query<HuizhigonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuizhigonggaoVO> selectListVO(Wrapper<HuizhigonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuizhigonggaoVO selectVO(Wrapper<HuizhigonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuizhigonggaoView> selectListView(Wrapper<HuizhigonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuizhigonggaoView selectView(Wrapper<HuizhigonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<HuizhigonggaoEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<HuizhigonggaoEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<HuizhigonggaoEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
