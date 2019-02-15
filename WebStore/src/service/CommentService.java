package service;

import java.util.List;

import model.Comment;

public interface CommentService {

	public List<Comment> getCommentByProductId(Integer id);

	public int insertComment(Comment comment);

	public int deleteComment(Comment comment);

}
