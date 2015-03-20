package test;
import java.util.Date;

import net.spring.hibernate.User;
import net.spring.hibernate.UserDao;
import net.spring.qs.Action;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class SimpleTest {
	 public static void main(String args[])
	 {
		  SimpleTest test=new SimpleTest();
		  //test.testHibernate();
		  test.testdel();
	 }
 
	 public void testQuickStart() { 
	     ApplicationContext ctx=new  FileSystemXmlApplicationContext("/src/applicationContext.xml"); 
	     Action action = (Action) ctx.getBean("TheAction"); 
	     System.out.println(action.execute("Rod Johnson"));
	     action = (Action) ctx.getBean("action2");
	     System.out.println(action.execute("jecKj"));
	  }
	 
	 public void testHibernate() {
	     ApplicationContext ctx=new  FileSystemXmlApplicationContext("/src/applicationContext.xml"); 
	     UserDao pdao = (UserDao) ctx.getBean("UserDaoImpl"); 
         User user = new User();  
	     for(int i = 0; i < 10; i++){
            user.setId(i);
            user.setUsername("ÓÃ»§Ãû");
            user.setPassword("123");
            user.setCreateTime(new Date());
            user.setExpireTime(new Date());
	    	pdao.save(user);
	     }
	  }
	 public void testdel(){
		 ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/applicationContext.xml");
		 UserDao pdao = (UserDao)ctx.getBean("UserDaoImpl");
		 pdao.delete((Integer)1);
	 }
}