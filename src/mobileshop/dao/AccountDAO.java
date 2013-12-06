package mobileshop.dao;


import mobileshop.model.Account;

public interface AccountDAO {
	//To Sace the account to database
	void save(Account acc);
	void update(Account acc);
	void delete(Account acc);
	Account findByAccountCode(String accountCode);

}
