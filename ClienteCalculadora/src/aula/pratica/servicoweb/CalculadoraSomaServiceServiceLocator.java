/**
 * CalculadoraSomaServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package aula.pratica.servicoweb;

public class CalculadoraSomaServiceServiceLocator extends org.apache.axis.client.Service implements aula.pratica.servicoweb.CalculadoraSomaServiceService {

    public CalculadoraSomaServiceServiceLocator() {
    }


    public CalculadoraSomaServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalculadoraSomaServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CalculadoraSomaServicePort
    private java.lang.String CalculadoraSomaServicePort_address = "http://localhost:8080/CalculadoraWS/CalculadoraSomaService";

    public java.lang.String getCalculadoraSomaServicePortAddress() {
        return CalculadoraSomaServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalculadoraSomaServicePortWSDDServiceName = "CalculadoraSomaServicePort";

    public java.lang.String getCalculadoraSomaServicePortWSDDServiceName() {
        return CalculadoraSomaServicePortWSDDServiceName;
    }

    public void setCalculadoraSomaServicePortWSDDServiceName(java.lang.String name) {
        CalculadoraSomaServicePortWSDDServiceName = name;
    }

    public aula.pratica.servicoweb.CalculadoraSomaService getCalculadoraSomaServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CalculadoraSomaServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalculadoraSomaServicePort(endpoint);
    }

    public aula.pratica.servicoweb.CalculadoraSomaService getCalculadoraSomaServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            aula.pratica.servicoweb.CalculadoraSomaServiceServiceSoapBindingStub _stub = new aula.pratica.servicoweb.CalculadoraSomaServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCalculadoraSomaServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalculadoraSomaServicePortEndpointAddress(java.lang.String address) {
        CalculadoraSomaServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (aula.pratica.servicoweb.CalculadoraSomaService.class.isAssignableFrom(serviceEndpointInterface)) {
                aula.pratica.servicoweb.CalculadoraSomaServiceServiceSoapBindingStub _stub = new aula.pratica.servicoweb.CalculadoraSomaServiceServiceSoapBindingStub(new java.net.URL(CalculadoraSomaServicePort_address), this);
                _stub.setPortName(getCalculadoraSomaServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CalculadoraSomaServicePort".equals(inputPortName)) {
            return getCalculadoraSomaServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://servicoweb.pratica.aula/", "CalculadoraSomaServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://servicoweb.pratica.aula/", "CalculadoraSomaServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CalculadoraSomaServicePort".equals(portName)) {
            setCalculadoraSomaServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
