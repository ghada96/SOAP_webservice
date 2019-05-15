package mysoapproject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService

public class MyBanqueService {
	@WebMethod(operationName="conversionEuroToDinar")
	public double conversion(@WebParam(name="montant")double mt) {
		return mt*3.5;
	}
	@WebMethod
	public Comptebancaire getCompte(@WebParam(name="code")Long code) {
		return new Comptebancaire(code,1546.3,new Date());
	}
	@WebMethod
	public List<Comptebancaire> getAll(){
		List<Comptebancaire>comptes=new ArrayList<Comptebancaire>();
		comptes.add(new Comptebancaire(1L,145,new Date()));
		comptes.add(new Comptebancaire(2L,145,new Date()));
		comptes.add(new Comptebancaire(3L,145,new Date()));
		comptes.add(new Comptebancaire(4L,145,new Date()));
		return comptes;
	}


}
