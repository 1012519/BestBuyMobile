
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mobileshop.model.Account;
import mobileshop.service.AccountService;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = 
		    	  new ClassPathXmlApplicationContext("../WEB-INF/dispatcher-servlet.xml");
		 
		 
		    	/** insert **/
				AccountService daoService = (AccountService)appContext.getBean("accountService");
		    	Account acc = new Account("2","USER_ROLE","username","password");
		 
		    	daoService.save(acc);
		    	
		    	System.out.println("Done");
	}

}
