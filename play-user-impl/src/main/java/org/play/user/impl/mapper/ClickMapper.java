package org.play.user.impl.mapper;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.play.user.impl.base.BaseMapper;
import org.play.user.impl.entity.Click;
import org.play.user.impl.entity.Video;
import org.play.user.impl.mybatis.utility.PageBean;
public interface ClickMapper extends BaseMapper<Click, Serializable>{

	Integer selectCount(Map<String, Object> map);
	
	List<Video> findMyHistoryListPage(PageBean<Video> pageBean);
}
