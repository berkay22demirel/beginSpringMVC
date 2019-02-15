package dao;

import java.util.List;

import model.Order;

public interface OrderDAO {

	public Order getOrderById(Integer id);

	public List<Order> getOrderByUserId(Integer id);

	public int insertOrder(Order order);

}
