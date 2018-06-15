package aula.pratica.cliente;

import java.rmi.RemoteException;

import aula.pratica.servicoweb.CalculadoraSomaService;
import aula.pratica.servicoweb.CalculadoraSomaServiceProxy;
import aula.pratica.servicoweb.ResultadoSoma;

public class ClienteWS {

	public static void main(String[] args) {
		CalculadoraSomaService calc = new CalculadoraSomaServiceProxy();
		
		try {
			ResultadoSoma resultado = calc.soma(10, 20);
			System.out.println("Soma dos valores: " + resultado.getSomaTotal());
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
