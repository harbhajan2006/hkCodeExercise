package soapSampleDOC;
import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "soapSampleDOC.WelcomeWorld")
public class WelcomeWorldImpl implements WelcomeWorld{

	@Override
	public String getWelcomeWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

}