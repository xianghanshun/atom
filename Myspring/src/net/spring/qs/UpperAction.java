package net.spring.qs;

public class UpperAction implements Action {

	 private String message; 
	 private String extra;
	   public String getMessage() { 
	    return message; 
	   } 
	  
	   public void setMessage(String string) { 
	     message = string; 
	   } 
	   
	   public String getExtra() { 
		    return extra; 
		   } 
		  
	   public void setExtra(String string) { 
		   extra = string; 
	   } 
	public String execute(String str) {
		return (getMessage()+str).toLowerCase() + getExtra(); 
	}

}
