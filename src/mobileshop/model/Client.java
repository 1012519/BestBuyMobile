package mobileshop.model;
// Generated Dec 4, 2013 3:57:57 PM by Hibernate Tools 3.2.1.GA


import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Client generated by hbm2java
 */
@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue
    @Column(name = "clientID")
     private Integer clientId;
    @Column(name = "fullname")
     private String fullname;
    @Column(name = "address")
     private String address;
    @Column(name = "phone")
     private String phone;
    @Column(name = "email")
     private String email;
    @Column(name = "birthday")
     private Timestamp birthday;
    
    public Client() {
    }

	
    public Client(String fullname, String address, String phone, String email, Timestamp birthday) {
        this.fullname = fullname;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.birthday = birthday;
    }
    
    public Integer getClientId() {
        return this.clientId;
    }
    
    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }
    public String getFullname() {
        return this.fullname;
    }
    
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getBirthday() {
        return this.birthday;
    }
    
}


