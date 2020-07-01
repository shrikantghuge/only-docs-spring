package in.onlydocs.dao;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import in.onlydocs.bean.Order;
import in.onlydocs.bean.Service;
import in.onlydocs.exceptions.CustomereNotFoundException;
import in.onlydocs.exceptions.OrderNotFoundException;
import in.onlydocs.exceptions.ServiceNotFoundException;

public class DBDaoDaoImpl implements DBDao{

    private JdbcTemplate jdbcTemplate;
    static Logger LOGGER = Logger.getLogger(DBDaoDaoImpl.class);
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
	@Override
	public List<Service> getServices() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Service getServiceDetails(String serviceId) throws SQLException, ServiceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Service getDocuments(String serviceId) throws SQLException, ServiceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Order> getOrders(String custMobileNo) throws SQLException, CustomereNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Order getOrderDetails(String customerId, String orderId)
			throws SQLException, CustomereNotFoundException, OrderNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	


}
