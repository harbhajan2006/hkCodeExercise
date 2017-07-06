package soapSampleDOC;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "soapSampleDOC.WelcomeUniverse")
public class WelcomeUniverseImpl implements WelcomeUniverse{

	@Override
	public String getWelcomeUniverseAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

}