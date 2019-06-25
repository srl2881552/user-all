package org.play.user.impl.mapper;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.play.user.impl.base.BaseMapper;
import org.play.user.impl.entity.Users;



public interface UsersMapper extends BaseMapper<Users, Serializable>{

	public List<Users> findUserByLogin(String login);
	public List<Users> login(Map<String, Object> map);
}
