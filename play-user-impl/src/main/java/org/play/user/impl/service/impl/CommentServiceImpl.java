package org.play.user.impl.service.impl;

import java.util.List;

import org.play.user.impl.entity.Comment;
import org.play.user.impl.mapper.CommentMapper;
import org.play.user.impl.mybatis.utility.PageBean;
import org.play.user.impl.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Service("commentService")
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
public class CommentServiceImpl implements CommentService{

	@Autowired
	private CommentMapper commentMapper;
	@Override
	public Comment selectById(String id) {
		// TODO Auto-generated method stub
		return commentMapper.selectById(id);
	}

	@Override
	public int insert(Comment entity) {
		// TODO Auto-generated method stub
		return commentMapper.insert(entity);
	}

	@Override
	public int update(Comment entity) {
		// TODO Auto-generated method stub
		return commentMapper.update(entity);
	}

	@Override
	public List<Comment> selectAll() {
		// TODO Auto-generated method stub
		return commentMapper.selectAll();
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return commentMapper.delete(id);
	}

	@Override
	public PageBean<Comment> selectListPage(PageBean<Comment> entity) {
		// TODO Auto-generated method stub
		entity.setResult(commentMapper.selectListPage(entity));
		return entity;
	}

	@Override
	public Integer selectCount(String videoId) {
		// TODO Auto-generated method stub
		return commentMapper.selectCount(videoId);
	}

}
