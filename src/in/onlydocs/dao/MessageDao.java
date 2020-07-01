package in.onlydocs.dao;

import in.onlydocs.bean.Message;
import in.onlydocs.exceptions.InvalidOTPException;

public interface MessageDao {
	public boolean sendMessage(Message message) throws Exception;
	public String validateOTP(String custometId, String otp) throws InvalidOTPException;	
	
}
