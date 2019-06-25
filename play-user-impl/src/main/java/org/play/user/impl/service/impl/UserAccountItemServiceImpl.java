package org.play.user.impl.service.impl;

import java.util.List;

import org.play.user.impl.entity.UserAccountItem;
import org.play.user.impl.mybatis.utility.PageBean;
import org.play.user.impl.mapper.UserAccountItemMapper;
import org.play.user.impl.service.UserAccountItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Service("userAccountItemService")
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
public class UserAccountItemServiceImpl implements UserAccountItemService{

	@Autowired
	private UserAccountItemMapper accountItemMapper;
	@Override
	public UserAccountItem selectById(String id) {
		// TODO Auto-generated method stub
		return accountItemMapper.selectById(id);
	}

	@Override
	public int insert(UserAccountItem entity) {
		// TODO Auto-generated method stub
		return accountItemMapper.insert(entity);
	}

	@Override
	public int update(UserAccountItem entity) {
		// TODO Auto-generated method stub
		return accountItemMapper.update(entity);
	}

	@Override
	public List<UserAccountItem> selectAll() {
		// TODO Auto-generated method stub
		return accountItemMapper.selectAll();
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return accountItemMapper.delete(id);
	}

	@Override
	public PageBean<UserAccountItem> selectListPage(
			PageBean<UserAccountItem> entity) {
		// TODO Auto-generated method stub
		entity.setResult(accountItemMapper.selectListPage(entity));
		return entity;
	}

}
