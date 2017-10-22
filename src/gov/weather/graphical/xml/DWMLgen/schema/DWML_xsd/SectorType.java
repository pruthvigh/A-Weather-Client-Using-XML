/**
 * SectorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd;

public class SectorType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SectorType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _conus = "conus";
    public static final java.lang.String _nhemi = "nhemi";
    public static final java.lang.String _alaska = "alaska";
    public static final java.lang.String _guam = "guam";
    public static final java.lang.String _hawaii = "hawaii";
    public static final java.lang.String _puertori = "puertori";
    public static final java.lang.String _npacocn = "npacocn";
    public static final SectorType conus = new SectorType(_conus);
    public static final SectorType nhemi = new SectorType(_nhemi);
    public static final SectorType alaska = new SectorType(_alaska);
    public static final SectorType guam = new SectorType(_guam);
    public static final SectorType hawaii = new SectorType(_hawaii);
    public static final SectorType puertori = new SectorType(_puertori);
    public static final SectorType npacocn = new SectorType(_npacocn);
    public java.lang.String getValue() { return _value_;}
    public static SectorType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SectorType enumeration = (SectorType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SectorType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SectorType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/schema/DWML.xsd", "sectorType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
