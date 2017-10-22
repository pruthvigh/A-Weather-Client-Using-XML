/**
 * NdfdXML.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.weather.graphical.xml.DWMLgen.wsdl.ndfdXML_wsdl;

public interface NdfdXML extends javax.xml.rpc.Service {

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
    public java.lang.String getndfdXMLPortAddress();

    public gov.weather.graphical.xml.DWMLgen.wsdl.ndfdXML_wsdl.NdfdXMLPortType getndfdXMLPort() throws javax.xml.rpc.ServiceException;

    public gov.weather.graphical.xml.DWMLgen.wsdl.ndfdXML_wsdl.NdfdXMLPortType getndfdXMLPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
