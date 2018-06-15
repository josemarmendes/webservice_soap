package aula.pratica.servicoweb;

public class CalculadoraSomaServiceProxy implements aula.pratica.servicoweb.CalculadoraSomaService {
  private String _endpoint = null;
  private aula.pratica.servicoweb.CalculadoraSomaService calculadoraSomaService = null;
  
  public CalculadoraSomaServiceProxy() {
    _initCalculadoraSomaServiceProxy();
  }
  
  public CalculadoraSomaServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculadoraSomaServiceProxy();
  }
  
  private void _initCalculadoraSomaServiceProxy() {
    try {
      calculadoraSomaService = (new aula.pratica.servicoweb.CalculadoraSomaServiceServiceLocator()).getCalculadoraSomaServicePort();
      if (calculadoraSomaService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculadoraSomaService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculadoraSomaService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculadoraSomaService != null)
      ((javax.xml.rpc.Stub)calculadoraSomaService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public aula.pratica.servicoweb.CalculadoraSomaService getCalculadoraSomaService() {
    if (calculadoraSomaService == null)
      _initCalculadoraSomaServiceProxy();
    return calculadoraSomaService;
  }
  
  public aula.pratica.servicoweb.ResultadoSoma soma(double arg0, double arg1) throws java.rmi.RemoteException{
    if (calculadoraSomaService == null)
      _initCalculadoraSomaServiceProxy();
    return calculadoraSomaService.soma(arg0, arg1);
  }
  
  
}