package server;

@javax.jws.WebService(targetNamespace = "http://server/", serviceName = "DemoService", portName = "DemoPort")
public class DemoDelegate {

	server.Demo demo = new server.Demo();

	public String sayHello(String name) {
		return demo.sayHello(name);
	}

}