package dao;

import java.util.List;

import model.Comment;
import model.Product;

import org.springframework.stereotype.Repository;

@Repository
public class CommentDAOImpl implements CommentDAO {

	@Override
	public List<Comment> getCommentByProductId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertComment(Comment comment) {

		List<Product> products = ProductDAOImpl.products;

		for (Product product : products) {

			if (product.getId().compareTo(comment.getProductId()) == 0) {

				product.getComments().add(comment);
				return 1;
			}
		}

		return 0;

	}

	@Override
	public int deleteComment(Comment comment) {
		// TODO Auto-generated method stub
		return 0;
	}


}
