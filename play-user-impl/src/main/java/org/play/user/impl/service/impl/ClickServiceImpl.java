package org.play.user.impl.service.impl;

import java.util.List;
import java.util.Map;

import org.play.user.impl.entity.Click;
import org.play.user.impl.entity.Video;
import org.play.user.impl.mapper.ClickMapper;
import org.play.user.impl.mybatis.utility.PageBean;
import org.play.user.impl.service.ClickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Service("clickService")
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
public class ClickServiceImpl implements ClickService{

	@Autowired
	private ClickMapper clickMapper;
	@Override
	public Click selectById(String id) {
		// TODO Auto-generated method stub
		return clickMapper.selectById(id);
	}

	@Override
	public int insert(Click entity) {
		// TODO Auto-generated method stub
		return clickMapper.insert(entity);
	}

	@Override
	public int update(Click entity) {
		// TODO Auto-generated method stub
		return clickMapper.update(entity);
	}

	@Override
	public List<Click> selectAll() {
		// TODO Auto-generated method stub
		return clickMapper.selectAll();
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return clickMapper.delete(id);
	}

	@Override
	public PageBean<Click> selectListPage(PageBean<Click> entity) {
		// TODO Auto-generated method stub
		entity.setResult(clickMapper.selectListPage(entity));
		return entity;
	}

	@Override
	public Integer selectCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return clickMapper.selectCount(map);
	}

	@Override
	public PageBean<Video> findMyHistoryListPage(PageBean<Video> pageBean) {
		// TODO Auto-generated method stub
		pageBean.setResult(clickMapper.findMyHistoryListPage(pageBean));
		return pageBean;
	}

}
