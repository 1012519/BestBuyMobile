package mobileshop.dao;

import java.util.List;

import mobileshop.model.Account;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class PersonDao extends HibernateDaoSupport{
    
    
    public void insert(Account acc){
        getHibernateTemplate().save(acc);
    }
     
    public List<Account> selectAll(){
        DetachedCriteria criteria = DetachedCriteria.forClass(Account.class);
        return getHibernateTemplate().findByCriteria(criteria);
    }
 
}