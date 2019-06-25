package org.play.user.impl.mapper;

import java.io.Serializable;
import java.util.List;

import org.play.user.impl.base.BaseMapper;
import org.play.user.impl.entity.UserSpace;
import org.play.user.impl.entity.Video;
import org.play.user.impl.mybatis.utility.PageBean;



public interface UserSpaceMapper extends BaseMapper<UserSpace, Serializable>{

	public List<UserSpace> findMySpace(UserSpace userSpace);
	
	List<Video> findMySpaceListPage(PageBean<Video> bean);
	
	List<Video> findMyFollowListPage(PageBean<Video> bean);
}
