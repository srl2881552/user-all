package org.play.user.impl.service.impl;

import java.util.List;

import org.play.user.impl.entity.UserAccount;
import org.play.user.impl.mybatis.utility.PageBean;
import org.play.user.impl.mapper.UserAccountMapper;
import org.play.user.impl.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Service("userAccountService")
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
public class UserAccountServiceImpl implements UserAccountService{

	@Autowired
	private UserAccountMapper userAccountMapper;
	@Override
	public UserAccount selectById(String id) {
		// TODO Auto-generated method stub
		return userAccountMapper.selectById(id);
	}

	@Override
	public int insert(UserAccount entity) {
		// TODO Auto-generated method stub
		return userAccountMapper.insert(entity);
	}

	@Override
	public int update(UserAccount entity) {
		// TODO Auto-generated method stub
		return userAccountMapper.update(entity);
	}

	@Override
	public List<UserAccount> selectAll() {
		// TODO Auto-generated method stub
		return userAccountMapper.selectAll();
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return userAccountMapper.delete(id);
	}

	@Override
	public PageBean<UserAccount> selectListPage(PageBean<UserAccount> entity) {
		// TODO Auto-generated method stub
		entity.setResult(userAccountMapper.selectListPage(entity));
		return entity;
	}

}
