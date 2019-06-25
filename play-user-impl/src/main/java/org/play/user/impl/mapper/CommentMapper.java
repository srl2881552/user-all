package org.play.user.impl.mapper;

import java.io.Serializable;

import org.play.user.impl.base.BaseMapper;
import org.play.user.impl.entity.Comment;

public interface CommentMapper extends BaseMapper<Comment, Serializable>{

	Integer selectCount(String videoId);
}
