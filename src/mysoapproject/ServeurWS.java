package mysoapproject;

import javax.xml.ws.Endpoint;


public class ServeurWS {

	public static void main(String[] args) {
		String url="http://localhost:8585/";
		Endpoint.publish(url, new MyBanqueService());
		System.out.println(url);

	}

}
