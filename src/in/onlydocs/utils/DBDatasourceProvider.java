package in.onlydocs.utils;

import java.io.IOException;
import java.security.GeneralSecurityException;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class DBDatasourceProvider extends BasicDataSource {

	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		try {
			super.setPassword(ProtectedConfigFile.decrypt(password));
		} catch (GeneralSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void setUsername(String userName) {
		
		// TODO Auto-generated method stub
		try {
			super.setUsername(ProtectedConfigFile.decrypt(userName));
		} catch (GeneralSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
