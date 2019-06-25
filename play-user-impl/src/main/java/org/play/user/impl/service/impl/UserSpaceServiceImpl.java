package org.play.user.impl.service.impl;

import java.util.List;

import org.play.user.impl.entity.UserSpace;
import org.play.user.impl.entity.Video;
import org.play.user.impl.mybatis.utility.PageBean;
import org.play.user.impl.mapper.UserSpaceMapper;
import org.play.user.impl.service.UserSpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Service("userSpaceService")
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
public class UserSpaceServiceImpl implements UserSpaceService{

	@Autowired
	private UserSpaceMapper userSpaceMapper;
	@Override
	public UserSpace selectById(String id) {
		// TODO Auto-generated method stub
		return userSpaceMapper.selectById(id);
	}

	@Override
	public int insert(UserSpace entity) {
		// TODO Auto-generated method stub
		return userSpaceMapper.insert(entity);
	}

	@Override
	public int update(UserSpace entity) {
		// TODO Auto-generated method stub
		return userSpaceMapper.update(entity);
	}

	@Override
	public List<UserSpace> selectAll() {
		// TODO Auto-generated method stub
		return userSpaceMapper.selectAll();
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return userSpaceMapper.delete(id);
	}

	@Override
	public PageBean<UserSpace> selectListPage(PageBean<UserSpace> entity) {
		// TODO Auto-generated method stub
		entity.setResult(userSpaceMapper.selectListPage(entity));
		return entity;
	}

	@Override
	public PageBean<Video> findMySpaceListPage(PageBean<Video> bean) {
		// TODO Auto-generated method stub
		bean.setResult(userSpaceMapper.findMySpaceListPage(bean));
		return bean;
	}

	@Override
	public PageBean<Video> findMyFollowListPage(PageBean<Video> bean) {
		// TODO Auto-generated method stub
		bean.setResult(userSpaceMapper.findMyFollowListPage(bean));
		return bean;
	}

}
