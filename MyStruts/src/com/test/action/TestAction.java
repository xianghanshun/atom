package com.test.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {
	@Override  
    public String execute() throws Exception {  
       System.out.println("Message: TestAction!");  
       return SUCCESS;  
    }  
}
