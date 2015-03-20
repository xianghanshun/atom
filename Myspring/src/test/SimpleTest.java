package test;
import net.spring.qs.Action;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class SimpleTest {
	 public static void main(String args[])
	 {
		  SimpleTest test=new SimpleTest();
		  test.testQuickStart();
	 }
 
	 public void testQuickStart() { 
	     ApplicationContext ctx=new  FileSystemXmlApplicationContext("/src/bean.xml"); 
	     Action action = (Action) ctx.getBean("TheAction"); 
	     System.out.println(action.execute("Rod Johnson"));
	     action = (Action) ctx.getBean("action2");
	     System.out.println(action.execute("jecKj"));
	  }
}