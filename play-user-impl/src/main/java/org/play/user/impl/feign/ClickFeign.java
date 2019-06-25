package org.play.user.impl.feign;

import java.util.HashMap;
import java.util.Map;

import org.play.user.impl.entity.Click;
import org.play.user.impl.entity.Video;
import org.play.user.impl.mybatis.utility.PageBean;
import org.play.user.impl.service.ClickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClickFeign {
	@Autowired
	private ClickService clickService;
	
	@RequestMapping("/click/save")
	public Integer Save(@RequestBody Click click){
		int result=clickService.insert(click);
		return result;
	}
	
	@RequestMapping("/click/update")
	public Integer update(@RequestBody Click click){
		int result=clickService.update(click);
		return result;
	}
	
	@RequestMapping("/click/delete")
	public Integer delete(@RequestParam String id){
		int result=clickService.delete(id);
		return result;
	}
	
	@RequestMapping("/click/getClickById")
	public Click getClickById(@RequestParam String id){
		Click result=clickService.selectById(id);
		return result;
	}
	@RequestMapping("/click/selectCount")
	public Integer selectCount(@RequestParam(value = "videoId") String videoId,@RequestParam(value = "userId") String userId){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("videoId", videoId);
		map.put("userId", userId);
		Integer users=clickService.selectCount(map);
		return users;
	}
	
	@RequestMapping("/click/findMyHistoryListPage")
	public PageBean<Video> findMyHistoryListPage(@RequestParam String userId,@RequestParam Integer pageNo,@RequestParam Integer pageSize){
		PageBean<Video> pageBean=new PageBean<Video>();
		pageBean.setPage(pageNo);
		pageBean.setPageSize(pageSize);
		Video video=new Video();
		video.setUserId(userId);
		pageBean.setParameter(video);
		pageBean=clickService.findMyHistoryListPage(pageBean);
		return pageBean;
	}
	
}
