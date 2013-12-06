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
 * Comments generated by hbm2java
 */
@Entity
@Table(name = "comments")
public class Comments {

    @Id
    @GeneratedValue
    @Column(name = "commentID")
     private Integer commentId;
    @Column(name = "accountID")
     private String accountId;
    @Column(name = "productID")
     private String productId;
    @Column(name = "commnentText")
     private String commentText;
    @Column(name = "commentCreatedTime")
     private Timestamp commentCreatedTime;

    public Comments() {
    }

    public Comments(String accountId, String productId, String commentText, Timestamp commentCreatedTime) {
       this.accountId = accountId;
       this.productId = productId;
       this.commentText = commentText;
       this.commentCreatedTime = commentCreatedTime;
    }
   
    public Integer getCommentId() {
        return this.commentId;
    }
    
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }
    
    public String getCommentText() {
        return this.commentText;
    }
    
    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }
    public Date getCommentCreatedTime() {
        return this.commentCreatedTime;
    }
    
    public void setCommentCreatedTime(Timestamp commentCreatedTime) {
        this.commentCreatedTime = commentCreatedTime;
    }

    /**
     * @return the accountId
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * @param accountId the accountId to set
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
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

