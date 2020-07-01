package in.onlydocs.bean;

import java.util.Date;

public class Order {
	
	String id;
	String orderStatus;
	Customer customer;
	Transaction transaction;
	Date date;
	PaymentMethod paymentMethod;
	Coupon coupon;
	Service service;
	
	
	
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public Coupon getCoupon() {
		return coupon;
	}
	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderStatus=" + orderStatus + ", customer=" + customer + ", transaction="
				+ transaction + ", date=" + date + ", paymentMethod=" + paymentMethod + ", coupon=" + coupon
				+ ", service=" + service + "]";
	}
			
}
