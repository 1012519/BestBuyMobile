package mobileshop.service;

import java.util.List;

import mobileshop.model.Account;

public interface AccountService {
	void save(Account acc);
	void update(Account acc);
	void delete(Account acc);
	Account findByAccountCode(String accountCode);
}