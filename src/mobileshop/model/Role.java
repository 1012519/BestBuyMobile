package mobileshop.model;
// Generated Dec 4, 2013 3:57:57 PM by Hibernate Tools 3.2.1.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Role generated by hbm2java
 */
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue
    @Column(name = "roleName")
     private String roleName;
    public Role() {
    }

	
    public Role(String roleName) {
        this.roleName = roleName;
    }
       
    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}


