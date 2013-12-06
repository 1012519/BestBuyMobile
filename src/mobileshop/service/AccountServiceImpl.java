package mobileshop.service;
import mobileshop.dao.AccountDAO;
import mobileshop.model.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDAO accountDao;

	public AccountDAO getAccountDao() {
		return accountDao;
	}
	
	@Autowired 
	public void setAccountDao(AccountDAO accountDao) {
		this.accountDao = accountDao;
	}

	public AccountServiceImpl() {
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void save(Account acc) {
		accountDao.save(acc);
	}

	public void update(Account acc) {
		accountDao.update(acc);
	}

	public void delete(Account acc) {
		accountDao.delete(acc);
	}
	
	public Account findByAccountCode(String accountCode) {
		return accountDao.findByAccountCode(accountCode);
	}
}