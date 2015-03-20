

package test;

import client.DemoDelegate;
import client.DemoService;

import client.FileTransDelegate;
import client.FileTransService;

public class Test {
	/**
	* @param args
	*/
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	DemoService server = new DemoService();
	DemoDelegate dd = server.getDemoPort();
	String result = dd.sayHello("xianghanshun");
	System.out.println(result);
	
	FileTransService fserver = new FileTransService();
	FileTransDelegate fdd = fserver.getFileTransPort();
	String fresult = fdd.sayHello("xianghanshun111111111111");
	
	System.out.println(fresult);
	}
}