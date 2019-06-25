package org.play.user.impl.feign;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.play.user.impl.entity.Users;
import org.play.user.impl.entity.Video;
import org.play.user.impl.mybatis.utility.PageBean;
import org.play.user.impl.service.UserSpaceService;
import org.play.user.impl.service.UsersService;
import org.play.user.impl.tools.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UsersFeign {

	@Autowired
	private UsersService usersService;
	@Autowired
	private UserSpaceService userSpaceService;
	@RequestMapping("/user/save")

	public Integer Save(@RequestBody Users users){
		int result=usersService.insert(users);
		return result;
	}
	
	@RequestMapping("/user/update")

	public Integer update(@RequestBody Users users){
		int result=usersService.update(users);
		return result;
	}
	
	@RequestMapping("/user/delete")

	public Integer delete(@RequestParam String id){
		int result=usersService.delete(id);
		return result;
	}
	
	@RequestMapping("/user/getUsersById")

	public Users getUsersById(@RequestParam String id){
		Users result=usersService.selectById(id);
		return result;
	}
	@RequestMapping("/user/login")

	public List<Users> login(@RequestParam(value = "login") String login,@RequestParam(value = "password") String password){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("login", login);
		map.put("password", password);
		List<Users> users=usersService.login(map);
		return users;
	}
	@RequestMapping("/user/findUserByLogin")
	public List<Users> findUserByLogin(@RequestParam String login){
		List<Users> users=usersService.findUserByLogin(login);
		return users;
	}
	
	@RequestMapping("/user/findMySpaceListPage")
	public PageBean<Video> findMySpaceListPage(@RequestParam(value = "userId") String userId,@RequestParam(value = "pageNo") Integer pageNo,@RequestParam(value = "pageSize") Integer pageSize){
		PageBean<Video> pageBean=new PageBean<Video>();
		Video video=new Video();
		video.setUserId(userId);
		pageBean.setPage(pageNo);
		pageBean.setPageSize(pageSize);
		pageBean.setParameter(video);
		pageBean=userSpaceService.findMySpaceListPage(pageBean);
		return pageBean;
	}
	
	@RequestMapping("/user/findMyFollowListPage")
	public PageBean<Video> findMyFollowListPage(@RequestParam(value = "userId") String userId,@RequestParam(value = "pageNo") Integer pageNo,@RequestParam(value = "pageSize") Integer pageSize){
		PageBean<Video> pageBean=new PageBean<Video>();
		Video video=new Video();
		video.setUserId(userId);
		pageBean.setPage(pageNo);
		pageBean.setPageSize(pageSize);
		pageBean.setParameter(video);
		pageBean=userSpaceService.findMyFollowListPage(pageBean);
		return pageBean;
	}
}
