
package net.spring.hibernate;
import java.util.Date;

public class User {
	   private String ids;
	   private Integer id;
	    private String username;
	    private String password;
	    private Date createtime;
	    private Date expiretime;


	    public String getIds() {  
	        return ids;
	    }  
	    public void setIds(String id) {  
	        this.ids = id;
	    }  
	    public Integer getId() {  
	        return id;
	    }  
	    public void setId(Integer id) {  
	        this.id = id;
	    }  
	    public String getUsername() {
	        return username;
	    }
	    public void setUsername(String username) {
	        this.username = username;
	    }
	    public String getPassword() {
	        return password;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }
	    
	    public Date getCreateTime() {
	        return createtime;
	    }
	    public void setCreateTime(Date ct) {
	        this.createtime = ct;
	    }
	    public Date getExpireTime() {
	        return expiretime;
	    }
	    public void setExpireTime(Date et) {
	        this.expiretime = et;
	    }
}
