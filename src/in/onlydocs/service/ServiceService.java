package in.onlydocs.service;

import java.sql.SQLException;
import java.util.List;

import in.onlydocs.bean.Order;
import in.onlydocs.bean.Service;
import in.onlydocs.exceptions.CustomereNotFoundException;
import in.onlydocs.exceptions.OrderNotFoundException;
import in.onlydocs.exceptions.ServiceNotFoundException;

public interface ServiceService {
	public List<Service> getServices() throws SQLException;
	public Service getServiceDetails(String serviceId) throws SQLException, ServiceNotFoundException;
	public Service getDocuments(String serviceId) throws SQLException, ServiceNotFoundException;
	public List<Order> getOrders(String custMobileNo) throws SQLException, CustomereNotFoundException;
 	public  Order getOrderDetails(String customerId, String orderId) throws SQLException, CustomereNotFoundException, OrderNotFoundException;
}
