/**
 * NdfdXMLPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.weather.graphical.xml.DWMLgen.wsdl.ndfdXML_wsdl;

public interface NdfdXMLPortType extends java.rmi.Remote {

    /**
     * Returns National Weather Service digital weather forecast data
     */
    public java.lang.String NDFDgen(java.math.BigDecimal latitude, java.math.BigDecimal longitude, gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd.ProductType product, java.util.Calendar startTime, java.util.Calendar endTime, gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd.UnitType unit, gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd.WeatherParametersType weatherParameters) throws java.rmi.RemoteException;

    /**
     * Returns National Weather Service digital weather forecast data
     * summarized over either 24- or 12-hourly periods
     */
    public java.lang.String NDFDgenByDay(java.math.BigDecimal latitude, java.math.BigDecimal longitude, java.util.Date startDate, java.math.BigInteger numDays, gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd.UnitType unit, gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd.FormatType format) throws java.rmi.RemoteException;

    /**
     * Returns National Weather Service digital weather forecast data
     */
    public java.lang.String NDFDgenLatLonList(java.lang.String listLatLon, gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd.ProductType product, java.util.Calendar startTime, java.util.Calendar endTime, gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd.UnitType unit, gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd.WeatherParametersType weatherParameters) throws java.rmi.RemoteException;

    /**
     * Returns National Weather Service digital weather forecast data
     * summarized over either 24- or 12-hourly periods
     */
    public java.lang.String NDFDgenByDayLatLonList(java.lang.String listLatLon, java.util.Date startDate, java.math.BigInteger numDays, gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd.UnitType unit, gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd.FormatType format) throws java.rmi.RemoteException;

    /**
     * Returns National Weather Service digital weather forecast data
     * encoded in GML for a single time
     */
    public java.lang.String gmlLatLonList(java.lang.String listLatLon, java.util.Calendar requestedTime, gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd.FeatureTypeType featureType, gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd.WeatherParametersType weatherParameters) throws java.rmi.RemoteException;

    /**
     * Returns National Weather Service digital weather forecast data
     * encoded in GML for a time period
     */
    public java.lang.String gmlTimeSeries(java.lang.String listLatLon, java.util.Calendar startTime, java.util.Calendar endTime, gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd.CompTypeType compType, gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd.FeatureTypeType featureType, java.lang.String propertyName) throws java.rmi.RemoteException;

    /**
     * Returns a list of latitude and longitude pairs in a rectangular
     * subgrid defined by the lower left and upper right points
     */
    public java.lang.String latLonListSubgrid(java.math.BigDecimal lowerLeftLatitude, java.math.BigDecimal lowerLeftLongitude, java.math.BigDecimal upperRightLatitude, java.math.BigDecimal upperRightLongitude, java.math.BigDecimal resolution) throws java.rmi.RemoteException;

    /**
     * Returns a list of latitude and longitude pairs along a line
     * defined by the latitude and longitude of the 2 endpoints
     */
    public java.lang.String latLonListLine(java.math.BigDecimal endPoint1Lat, java.math.BigDecimal endPoint1Lon, java.math.BigDecimal endPoint2Lat, java.math.BigDecimal endPoint2Lon) throws java.rmi.RemoteException;

    /**
     * Returns a list of latitude and longitude pairs with each pair
     * corresponding to an input zip code.
     */
    public java.lang.String latLonListZipCode(java.lang.String zipCodeList) throws java.rmi.RemoteException;

    /**
     * Returns a list of latitude and longitude pairs in a rectangle
     * defined by a central point and distance from that point in the latitudinal
     * and longitudinal directions
     */
    public java.lang.String latLonListSquare(java.math.BigDecimal centerPointLat, java.math.BigDecimal centerPointLon, java.math.BigDecimal distanceLat, java.math.BigDecimal distanceLon, java.math.BigDecimal resolution) throws java.rmi.RemoteException;

    /**
     * Returns four latitude and longitude pairs for corners of an
     * NDFD grid and the minimum resolution that will return the entire grid
     */
    public java.lang.String cornerPoints(gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd.SectorType sector) throws java.rmi.RemoteException;

    /**
     * Returns a list of latitude and longitude pairs paired with
     * the city names they correspond to
     */
    public java.lang.String latLonListCityNames(gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd.DisplayLevelType displayLevel) throws java.rmi.RemoteException;
}
