package com.hib.beans;
import java.util.Date;

import org.hibernate.*;
import com.hib.util.HibernateSessionFactory;

public class Client {
    public static void main(String[] args) {  
        //读取配置文件  
    	Session session=null;
    	Transaction tx=null;
        try{  
        	session=HibernateSessionFactory.getSession();
        	tx=session.beginTransaction();
            User user = new User();  
            user.setId("1");
            user.setUsername("用户名");  
            user.setPassword("123");  
            user.setCreateTime(new Date());
            user.setExpireTime(new Date());
        	session.save(user);
        	tx.commit();
        }catch(Exception e){
            e.printStackTrace();  
            //回滚事务  
            session.getTransaction().rollback();  
        }finally{  
            if(session != null){  
                if(session.isOpen()){  
                    //关闭session  
                    session.close();  
                }  
            }  
        }  
    }  
}
