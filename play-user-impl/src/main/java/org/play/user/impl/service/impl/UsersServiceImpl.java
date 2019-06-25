package org.play.user.impl.service.impl;

import java.util.List;
import java.util.Map;

import org.play.user.impl.entity.Users;
import org.play.user.impl.mybatis.utility.PageBean;
import org.play.user.impl.mapper.UsersMapper;
import org.play.user.impl.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Service("usersService")
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersMapper usersMapper;
	@Override
	public Users selectById(String id) {
		// TODO Auto-generated method stub
		return usersMapper.selectById(id);
	}

	@Override
	public int insert(Users entity) {
		// TODO Auto-generated method stub
		return usersMapper.insert(entity);
	}

	@Override
	public int update(Users entity) {
		// TODO Auto-generated method stub
		return usersMapper.update(entity);
	}

	@Override
	public List<Users> selectAll() {
		// TODO Auto-generated method stub
		return usersMapper.selectAll();
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return usersMapper.delete(id);
	}

	@Override
	public PageBean<Users> selectListPage(PageBean<Users> entity) {
		// TODO Auto-generated method stub
		entity.setResult(usersMapper.selectListPage(entity));
		return entity;
	}

	@Override
	public List<Users> findUserByLogin(String login) {
		// TODO Auto-generated method stub
		return usersMapper.findUserByLogin(login);
	}

	@Override
	public List<Users> login(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return usersMapper.login(map);
	}

}
