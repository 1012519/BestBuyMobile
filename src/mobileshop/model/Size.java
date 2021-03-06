package mobileshop.model;
// Generated Dec 4, 2013 3:57:57 PM by Hibernate Tools 3.2.1.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




/**
 * Size generated by hbm2java
 */
@Entity
@Table(name = "size")
public class Size {

    @Id
    @GeneratedValue
    @Column(name = "sizeID")
     private Integer sizeId;
    @Column(name = "productID")
     private String productId;
    @Column(name = "sizeName")
     private String sizeName;
    @Column(name = "sizeCode")
     private String sizeCode;

    public Size() {
    }

    public Size(String productId, String sizeName, String sizeCode) {
       this.productId = productId;
       this.sizeName = sizeName;
       this.sizeCode = sizeCode;
    }
   
    public Integer getSizeId() {
        return this.sizeId;
    }
    
    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }
    
    public String getSizeName() {
        return this.sizeName;
    }
    
    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }
    public String getSizeCode() {
        return this.sizeCode;
    }
    
    public void setSizeCode(String sizeCode) {
        this.sizeCode = sizeCode;
    }

    /**
     * @return the productId
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }
}


