package dao;

import java.util.List;

import model.Order;

import org.springframework.stereotype.Repository;

@Repository
public class OrderDAOImpl implements OrderDAO {

	@Override
	public Order getOrderById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getOrderByUserId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertOrder(Order order) {
		// TODO Auto-generated method stub
		return 0;
	}

}
