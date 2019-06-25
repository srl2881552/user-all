package org.play.user.impl.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.play.user.impl.base.BaseService;
import org.play.user.impl.entity.Users;

public interface UsersService extends BaseService<Users, Serializable>{

	public List<Users> findUserByLogin(String login);
	public List<Users> login(Map<String, Object> map);
}
