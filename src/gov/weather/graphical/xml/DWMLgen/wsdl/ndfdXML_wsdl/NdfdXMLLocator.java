/**
 * NdfdXMLLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.weather.graphical.xml.DWMLgen.wsdl.ndfdXML_wsdl;

public class NdfdXMLLocator extends org.apache.axis.client.Service implements gov.weather.graphical.xml.DWMLgen.wsdl.ndfdXML_wsdl.NdfdXML {

/**
 * The service has 12 exposed functions, NDFDgen, NDFDgenLatLonList,
 * NDFDgenByDay, NDFDgenByDayLatLonList, 
 *                   LatLonListSubgrid, LatLonListLine, LatLonListZipCode,
 * CornerPoints, LatLonListSquare, GmlLatLonList, GmlTimeSeries, and
 * LatLonListCityNames. 
 *                   For the NDFDgen function, the client needs to provide
 * a latitude and longitude pair and the product type. The Unit will
 * default
 *                   to U.S. Standard (english) unless Metric is chosen
 * by client. The client also needs to provide the start and end time
 * (Local) 
 *                   of the period that it wants data for (if shorter
 * than the 7 days is wanted).  For the time-series product, the client
 * needs to 
 *                   provide an array of boolean values corresponding
 * to which NDFD values are desired.
 *                   For the NDFDgenByDay function, the client needs
 * to provide a latitude and longitude pair, the date (Local) it wants
 * to start 
 *                   retrieving data for and the number of days worth
 * of data.  The Unit will default to U.S. Standard (english) unless
 * Metric is 
 *                   chosen by client. The client also needs to provide
 * the format that is desired.  
 *                   For the multi point versions, NDFDgenLatLonList
 * and NDFDgenByDayLatLonList a space delimited list of latitude and
 * longitude 
 * 		  pairs are substituted for the single latitude and longitude input.
 * Each latitude and longitude 
 *                   pair is composed of a latitude and longitude delimited
 * by a comma.  
 * 		  For the LatLonListSubgrid, the user provides a comma delimited
 * latitude and longitude pair for the lower left and for 
 *                   the upper right corners of a rectangular subgrid.
 * The function can also take a integer 
 *                   resolution to reduce the number of grid points returned.
 * The service then returns a list of 
 *                   latitude and longitude pairs for all the grid points
 * contained in the subgrid. 
 *                   weather values should appear in the time series
 * product.  
 * 		  For the LatLonListLine, The inputs are the same as the function
 * NDFDgen except the latitude and longitude pair is 
 * 		  replaced by two latitude and longitude pairs, one for each end
 * point a line. The two points are delimited with a space.  
 *                   The service then returns data for all the NDFD points
 * on the line formed by the two points.  
 * 		  For the LatLonListZipCode function, the input is the same as the
 * NDFDgen function except the latitude and longitude values 
 * 		  are relaced by a zip code for the 50 United States and Puerto
 * Rico.
 * 		  For the LatLonListSquare function, the input is the same as the
 * NDFDgen function except the latitude and longitude values 
 * 		  are relaced by a zip code for the 50 United States and Puerto
 * Rico.
 * 		  For the CornerPoints function, the service requires a valid NDFD
 * grid name.  The function returns a 
 *                   list of four latitude and longitude pairs, one for
 * each corner of the NDFD grid.  The function 
 *                   also returns the minimum resolution required to
 * return the entire grid below the maximum points 
 *                   threshold.
 *                   For the GmlLatLonList function, the service requires
 * a list of latitude and longitude pairs, the time (UTC) the user 
 * 		  wants data for, the GML feature type and the array of boolean
 * values corresponding to which NDFD values are desired.
 *                   For the GmlTimeSeries function, the service requires
 * a list of latitude and longitude pairs, the start and end time (UTC)
 * the user 
 * 		  wants data for, a comparison type (IsEqual, Between, GreaterThan,
 * GreaterThan, GreaterThanEqualTo, LessThan, and  
 *                   LessThanEqualTo), the GML feature type and The input
 * variable "propertyName" contains a comma delimited string of NDFD
 * element to 
 *                   indicate which weather parameters are being requested.
 * For the LatLonListCityNames function, the services requires a detail
 * level that that ranges from 1 to 4.  Level 1 generally represents
 *                   large main cities.  Level 2 represents progressively
 * smaller cities or large cities that are close to another even larger
 * city.  Levels
 *                   3 and 4 are part one and two of a list of cities
 * that help increase the areal coverage of the cities dataset.  This
 * functions
 *                   returns a list of latitude and longitude values
 * along with a seperate list of city name for those point.
 */

    public NdfdXMLLocator() {
    }


    public NdfdXMLLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NdfdXMLLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ndfdXMLPort
    private java.lang.String ndfdXMLPort_address = "http://graphical.weather.gov/xml/SOAP_server/ndfdXMLserver.php";

    public java.lang.String getndfdXMLPortAddress() {
        return ndfdXMLPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ndfdXMLPortWSDDServiceName = "ndfdXMLPort";

    public java.lang.String getndfdXMLPortWSDDServiceName() {
        return ndfdXMLPortWSDDServiceName;
    }

    public void setndfdXMLPortWSDDServiceName(java.lang.String name) {
        ndfdXMLPortWSDDServiceName = name;
    }

    public gov.weather.graphical.xml.DWMLgen.wsdl.ndfdXML_wsdl.NdfdXMLPortType getndfdXMLPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ndfdXMLPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getndfdXMLPort(endpoint);
    }

    public gov.weather.graphical.xml.DWMLgen.wsdl.ndfdXML_wsdl.NdfdXMLPortType getndfdXMLPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            gov.weather.graphical.xml.DWMLgen.wsdl.ndfdXML_wsdl.NdfdXMLBindingStub _stub = new gov.weather.graphical.xml.DWMLgen.wsdl.ndfdXML_wsdl.NdfdXMLBindingStub(portAddress, this);
            _stub.setPortName(getndfdXMLPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setndfdXMLPortEndpointAddress(java.lang.String address) {
        ndfdXMLPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (gov.weather.graphical.xml.DWMLgen.wsdl.ndfdXML_wsdl.NdfdXMLPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                gov.weather.graphical.xml.DWMLgen.wsdl.ndfdXML_wsdl.NdfdXMLBindingStub _stub = new gov.weather.graphical.xml.DWMLgen.wsdl.ndfdXML_wsdl.NdfdXMLBindingStub(new java.net.URL(ndfdXMLPort_address), this);
                _stub.setPortName(getndfdXMLPortWSDDServiceName());
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
        if ("ndfdXMLPort".equals(inputPortName)) {
            return getndfdXMLPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "ndfdXML");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl", "ndfdXMLPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ndfdXMLPort".equals(portName)) {
            setndfdXMLPortEndpointAddress(address);
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
