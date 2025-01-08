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


import com.dao.TijianjieguoDao;
import com.entity.TijianjieguoEntity;
import com.service.TijianjieguoService;
import com.entity.vo.TijianjieguoVO;
import com.entity.view.TijianjieguoView;

@Service("tijianjieguoService")
public class TijianjieguoServiceImpl extends ServiceImpl<TijianjieguoDao, TijianjieguoEntity> implements TijianjieguoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TijianjieguoEntity> page = this.selectPage(
                new Query<TijianjieguoEntity>(params).getPage(),
                new EntityWrapper<TijianjieguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TijianjieguoEntity> wrapper) {
		  Page<TijianjieguoView> page =new Query<TijianjieguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TijianjieguoVO> selectListVO(Wrapper<TijianjieguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TijianjieguoVO selectVO(Wrapper<TijianjieguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TijianjieguoView> selectListView(Wrapper<TijianjieguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TijianjieguoView selectView(Wrapper<TijianjieguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
