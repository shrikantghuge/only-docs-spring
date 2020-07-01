package in.onlydocs.bean;

public class Message {
	
	String mobileNumber;
	String message;
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Message [mobileNumber=" + mobileNumber + ", message=" + message + "]";
	}	
}
