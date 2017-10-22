/**
 * FeatureTypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd;

public class FeatureTypeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FeatureTypeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Forecast_Gml2Point = "Forecast_Gml2Point";
    public static final java.lang.String _Forecast_Gml2AllWx = "Forecast_Gml2AllWx";
    public static final java.lang.String _Forecast_GmlsfPoint = "Forecast_GmlsfPoint";
    public static final java.lang.String _Forecast_GmlObs = "Forecast_GmlObs";
    public static final java.lang.String _NdfdMultiPointCoverage = "NdfdMultiPointCoverage";
    public static final java.lang.String _Ndfd_KmlPoint = "Ndfd_KmlPoint";
    public static final FeatureTypeType Forecast_Gml2Point = new FeatureTypeType(_Forecast_Gml2Point);
    public static final FeatureTypeType Forecast_Gml2AllWx = new FeatureTypeType(_Forecast_Gml2AllWx);
    public static final FeatureTypeType Forecast_GmlsfPoint = new FeatureTypeType(_Forecast_GmlsfPoint);
    public static final FeatureTypeType Forecast_GmlObs = new FeatureTypeType(_Forecast_GmlObs);
    public static final FeatureTypeType NdfdMultiPointCoverage = new FeatureTypeType(_NdfdMultiPointCoverage);
    public static final FeatureTypeType Ndfd_KmlPoint = new FeatureTypeType(_Ndfd_KmlPoint);
    public java.lang.String getValue() { return _value_;}
    public static FeatureTypeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FeatureTypeType enumeration = (FeatureTypeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FeatureTypeType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeatureTypeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/schema/DWML.xsd", "featureTypeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
