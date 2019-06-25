package org.play.user.impl.feign;

import java.util.HashMap;
import java.util.Map;

import org.play.user.impl.entity.Click;
import org.play.user.impl.entity.Comment;
import org.play.user.impl.mybatis.utility.PageBean;
import org.play.user.impl.service.ClickService;
import org.play.user.impl.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentFeign {

	@Autowired
	private CommentService commentService;
	
	@RequestMapping("/comment/save")
	public Integer Save(@RequestBody Comment comment){
		int result=commentService.insert(comment);
		return result;
	}
	
	@RequestMapping("/comment/update")
	public Integer update(@RequestBody Comment comment){
		int result=commentService.update(comment);
		return result;
	}
	
	@RequestMapping("/comment/delete")
	public Integer delete(@RequestParam String id){
		int result=commentService.delete(id);
		return result;
	}
	
	
	@RequestMapping("/comment/selectCount")
	public Integer selectCount(@RequestParam(value = "videoId") String videoId){
		
		Integer users=commentService.selectCount(videoId);
		return users;
	}
	
	@RequestMapping("/comment/selectListPage")
	public PageBean<Comment> selectListPage(@RequestParam(value = "videoId") String videoId,@RequestParam(value = "pageNo") Integer pageNo,@RequestParam(value = "pageSize") Integer pageSize){
		PageBean<Comment> pageBean=new PageBean<Comment>();
		pageBean.setPage(pageNo);
		pageBean.setPageSize(pageSize);
		Comment entity=new Comment();
		entity.setVideoId(videoId);
		pageBean.setParameter(entity);
		pageBean=commentService.selectListPage(pageBean);
		return pageBean;
	}
}
