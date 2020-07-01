package in.onlydocs.bean;

import java.util.Date;

public class PaymentMethod {
	
	String ID;
	String cardNo;
	Date dateFrom;
	Date dateTo;
	String otherDetails;
	String mobileNumber;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public String getOtherDetails() {
		return otherDetails;
	}

	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "PaymentMethod [ID=" + ID + ", cardNo=" + cardNo + ", dateFrom=" + dateFrom + ", dateTo=" + dateTo
				+ ", otherDetails=" + otherDetails + ", mobileNumber=" + mobileNumber + "]";
	}

}
