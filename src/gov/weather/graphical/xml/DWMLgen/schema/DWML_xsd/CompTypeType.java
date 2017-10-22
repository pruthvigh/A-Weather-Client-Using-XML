/**
 * CompTypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd;

public class CompTypeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CompTypeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _IsEqual = "IsEqual";
    public static final java.lang.String _Between = "Between";
    public static final java.lang.String _GreaterThan = "GreaterThan";
    public static final java.lang.String _GreaterThanEqualTo = "GreaterThanEqualTo";
    public static final java.lang.String _LessThan = "LessThan";
    public static final java.lang.String _LessThanEqualTo = "LessThanEqualTo";
    public static final CompTypeType IsEqual = new CompTypeType(_IsEqual);
    public static final CompTypeType Between = new CompTypeType(_Between);
    public static final CompTypeType GreaterThan = new CompTypeType(_GreaterThan);
    public static final CompTypeType GreaterThanEqualTo = new CompTypeType(_GreaterThanEqualTo);
    public static final CompTypeType LessThan = new CompTypeType(_LessThan);
    public static final CompTypeType LessThanEqualTo = new CompTypeType(_LessThanEqualTo);
    public java.lang.String getValue() { return _value_;}
    public static CompTypeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CompTypeType enumeration = (CompTypeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CompTypeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CompTypeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/schema/DWML.xsd", "compTypeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
