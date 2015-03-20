package server;

@javax.jws.WebService(targetNamespace = "http://server/", serviceName = "FileTransService", portName = "FileTransPort")
public class FileTransDelegate {

	server.FileTrans fileTrans = new server.FileTrans();
	public String sayHello(String name) {
		return fileTrans.sayHello(name);
	}

}