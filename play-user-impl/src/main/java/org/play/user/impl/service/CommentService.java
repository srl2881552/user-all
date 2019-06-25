package org.play.user.impl.service;

import java.io.Serializable;

import org.play.user.impl.base.BaseService;
import org.play.user.impl.entity.Comment;

public interface CommentService extends BaseService<Comment, Serializable>{

	Integer selectCount(String videoId);
}
