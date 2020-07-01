package in.onlydocs.bean;

import java.util.Date;

public class Transaction {
	
	Order order;
	PaymentMethod method;
	String status;
	Date startTime;
	Date endTime;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public PaymentMethod getMethod() {
		return method;
	}

	public void setMethod(PaymentMethod method) {
		this.method = method;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "Transaction [order=" + order + ", method=" + method + ", status=" + status + ", startTime=" + startTime
				+ ", endTime=" + endTime + "]";
	}
}
