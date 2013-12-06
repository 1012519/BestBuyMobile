package mobileshop.model;
// Generated Dec 4, 2013 3:57:57 PM by Hibernate Tools 3.2.1.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "color")
public class Color {

    @Id
    @GeneratedValue
    @Column(name = "colorID")
     private Integer colorId;
    @Column(name = "productID")
     private String productId;
    @Column(name = "colorName")
     private String colorName;
    @Column(name = "colorCode")
     private String colorCode;
    

    public Color() {
    }

    public Color(String product, String colorName, String colorCode) {
       this.productId = product;
       this.colorName = colorName;
       this.colorCode = colorCode;
    }
   
    public Integer getColorId() {
        return this.colorId;
    }
    
    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }
    
    public String getColorName() {
        return this.colorName;
    }
    
    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
    public String getColorCode() {
        return this.colorCode;
    }
    
    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }
    
    public String getProductId() {
        return productId;
    }

    
    public void setProductId(String productId) {
        this.productId = productId;
    }
    
}


