package aula.pratica.servicoweb;
import javax.jws.WebMethod;
import javax.jws.WebService;

import aula.pratica.dominio.ResultadoSoma;

@WebService
public class CalculadoraSomaService {
	
	@WebMethod
	public ResultadoSoma soma(double valor1, double valor2) {
		ResultadoSoma resultadoSoma =  new ResultadoSoma();
		double somaTotal = valor1 + valor2;
		resultadoSoma.setSomaTotal(somaTotal);
		
		return resultadoSoma;
	}
}
