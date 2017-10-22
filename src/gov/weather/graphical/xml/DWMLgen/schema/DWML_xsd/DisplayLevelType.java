/**
 * DisplayLevelType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd;

public class DisplayLevelType implements java.io.Serializable {
    private java.math.BigInteger _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DisplayLevelType(java.math.BigInteger value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.math.BigInteger _value1 = new java.math.BigInteger("1");
    public static final java.math.BigInteger _value2 = new java.math.BigInteger("2");
    public static final java.math.BigInteger _value3 = new java.math.BigInteger("3");
    public static final java.math.BigInteger _value4 = new java.math.BigInteger("4");
    public static final java.math.BigInteger _value5 = new java.math.BigInteger("12");
    public static final java.math.BigInteger _value6 = new java.math.BigInteger("34");
    public static final java.math.BigInteger _value7 = new java.math.BigInteger("1234");
    public static final DisplayLevelType value1 = new DisplayLevelType(_value1);
    public static final DisplayLevelType value2 = new DisplayLevelType(_value2);
    public static final DisplayLevelType value3 = new DisplayLevelType(_value3);
    public static final DisplayLevelType value4 = new DisplayLevelType(_value4);
    public static final DisplayLevelType value5 = new DisplayLevelType(_value5);
    public static final DisplayLevelType value6 = new DisplayLevelType(_value6);
    public static final DisplayLevelType value7 = new DisplayLevelType(_value7);
    public java.math.BigInteger getValue() { return _value_;}
    public static DisplayLevelType fromValue(java.math.BigInteger value)
          throws java.lang.IllegalArgumentException {
        DisplayLevelType enumeration = (DisplayLevelType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DisplayLevelType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new java.math.BigInteger(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_.toString();}
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
        new org.apache.axis.description.TypeDesc(DisplayLevelType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/schema/DWML.xsd", "displayLevelType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
