package in.onlydocs.bean;

public class Session {
	
	String mobileNo;
	String otp;
	String sessionId;
	String sessionStatus;
	
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getSessionStatus() {
		return sessionStatus;
	}
	public void setSessionStatus(String sessionStatus) {
		this.sessionStatus = sessionStatus;
	}
	
	@Override
	public String toString() {
		return "Session [mobileNo=" + mobileNo + ", otp=" + otp + ", sessionId=" + sessionId + ", sessionStatus="
				+ sessionStatus + "]";
	}

}
