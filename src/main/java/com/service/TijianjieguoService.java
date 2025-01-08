package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TijianjieguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TijianjieguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TijianjieguoView;


/**
 * 体检结果
 *
 */
public interface TijianjieguoService extends IService<TijianjieguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TijianjieguoVO> selectListVO(Wrapper<TijianjieguoEntity> wrapper);
   	
   	TijianjieguoVO selectVO(@Param("ew") Wrapper<TijianjieguoEntity> wrapper);
   	
   	List<TijianjieguoView> selectListView(Wrapper<TijianjieguoEntity> wrapper);
   	
   	TijianjieguoView selectView(@Param("ew") Wrapper<TijianjieguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TijianjieguoEntity> wrapper);
   	

}

