package com.dao;

import com.entity.TijianjieguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TijianjieguoVO;
import com.entity.view.TijianjieguoView;


/**
 * 体检结果
 *
 */
public interface TijianjieguoDao extends BaseMapper<TijianjieguoEntity> {
	
	List<TijianjieguoVO> selectListVO(@Param("ew") Wrapper<TijianjieguoEntity> wrapper);
	
	TijianjieguoVO selectVO(@Param("ew") Wrapper<TijianjieguoEntity> wrapper);
	
	List<TijianjieguoView> selectListView(@Param("ew") Wrapper<TijianjieguoEntity> wrapper);

	List<TijianjieguoView> selectListView(Pagination page,@Param("ew") Wrapper<TijianjieguoEntity> wrapper);
	
	TijianjieguoView selectView(@Param("ew") Wrapper<TijianjieguoEntity> wrapper);
	

}
