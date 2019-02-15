package service;

import java.util.List;

import model.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CommentDAO;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentDAO commentDAO;

	@Override
	public List<Comment> getCommentByProductId(Integer id) {

		return commentDAO.getCommentByProductId(id);
	}

	@Override
	public int insertComment(Comment comment) {

		return commentDAO.insertComment(comment);
	}

	@Override
	public int deleteComment(Comment comment) {

		return commentDAO.deleteComment(comment);
	}

}
