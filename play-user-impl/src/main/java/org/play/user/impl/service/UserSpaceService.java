package org.play.user.impl.service;

import java.io.Serializable;
import java.util.List;

import org.play.user.impl.base.BaseService;
import org.play.user.impl.entity.UserSpace;
import org.play.user.impl.entity.Video;
import org.play.user.impl.mybatis.utility.PageBean;

public interface UserSpaceService extends BaseService<UserSpace, Serializable>{

	PageBean<Video> findMySpaceListPage(PageBean<Video> bean);
	PageBean<Video> findMyFollowListPage(PageBean<Video> bean);
}
