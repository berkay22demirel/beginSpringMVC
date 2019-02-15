package service;

import java.util.List;

import model.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.OrderDAO;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDAO orderDAO;

	@Override
	public Order getOrderById(Integer id) {

		return orderDAO.getOrderById(id);
	}

	@Override
	public List<Order> getOrderByUserId(Integer id) {

		return orderDAO.getOrderByUserId(id);
	}

	@Override
	public int insertOrder(Order order) {

		return orderDAO.insertOrder(order);
	}

}
