package mobileshop.dao;

import org.springframework.stereotype.Repository;
import java.util.List;

import mobileshop.dao.AccountDAO;
import mobileshop.model.Account;

@Repository("accountDAO")
public class AccountDAOImpl extends MyHibernateDaoSupport implements AccountDAO {

	public void save(Account acc){
		getHibernateTemplate().save(acc);
	}
 
	public void update(Account acc){
		getHibernateTemplate().update(acc);
	}
 
	public void delete(Account acc){
		getHibernateTemplate().delete(acc);
	}
 
	public Account findByAccountCode(String AccountCode){
		List list = getHibernateTemplate().find(
                     "from Account where accountId=?",AccountCode);
		return (Account)list.get(0);
	}
}
