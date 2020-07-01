package in.onlydocs.bean;

import java.sql.Date;

public class Coupon {
	String id;
	float precentage;
	Date lastDate;
	
	public String getCouponId() {
		return id;
	}
	public void setCouponId(String couponId) {
		this.id = couponId;
	}
	public float getPrecentage() {
		return precentage;
	}
	public void setPrecentage(float precentage) {
		this.precentage = precentage;
	}
	public Date getLastDate() {
		return lastDate;
	}
	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}
	@Override
	public String toString() {
		return "Discount [couponId=" + id + ", precentage=" + precentage + ", lastDate=" + lastDate + "]";
	}
	
	
}
