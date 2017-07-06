package soapSampleDOC;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import soapSampleDOC.*;

public class WelcomeWorldClient{

	public static void main(String[] args) throws Exception {

	URL url = new URL("http://localhost:9999/ws/welcome?wsdl");

        //1st argument service URI, refer to wsdl document above
	//2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://soapSampleDOC/", "WelcomeWorldImplService");
// queue is nothing but package name
        Service service = Service.create(url, qname);

        WelcomeWorld hello = service.getPort(WelcomeWorld.class);

        System.out.println(hello.getWelcomeWorldAsString("mkyong-999"));

    }

}