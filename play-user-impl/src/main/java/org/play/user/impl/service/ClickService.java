package org.play.user.impl.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.play.user.impl.base.BaseService;
import org.play.user.impl.entity.Click;
import org.play.user.impl.entity.Video;
import org.play.user.impl.mybatis.utility.PageBean;


public interface ClickService extends BaseService<Click, Serializable>{

	Integer selectCount(Map<String, Object> map);
	
	PageBean<Video> findMyHistoryListPage(PageBean<Video> pageBean);
}
