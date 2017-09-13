/*
 * XML Type:  GeoCoordinate
 * Namespace: http://schemas.datacontract.org/2004/07/System.Device.Location
 * Java type: org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.system_device_location;


/**
 * An XML GeoCoordinate(@http://schemas.datacontract.org/2004/07/System.Device.Location).
 *
 * This is a complex type.
 */
public interface GeoCoordinate extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GeoCoordinate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s299C95E2D55508F813FE05B50BDB21D0").resolveHandle("geocoordinatebcd8type");
    
    /**
     * Gets the "Altitude" element
     */
    double getAltitude();
    
    /**
     * Gets (as xml) the "Altitude" element
     */
    org.apache.xmlbeans.XmlDouble xgetAltitude();
    
    /**
     * True if has "Altitude" element
     */
    boolean isSetAltitude();
    
    /**
     * Sets the "Altitude" element
     */
    void setAltitude(double altitude);
    
    /**
     * Sets (as xml) the "Altitude" element
     */
    void xsetAltitude(org.apache.xmlbeans.XmlDouble altitude);
    
    /**
     * Unsets the "Altitude" element
     */
    void unsetAltitude();
    
    /**
     * Gets the "Course" element
     */
    double getCourse();
    
    /**
     * Gets (as xml) the "Course" element
     */
    org.apache.xmlbeans.XmlDouble xgetCourse();
    
    /**
     * True if has "Course" element
     */
    boolean isSetCourse();
    
    /**
     * Sets the "Course" element
     */
    void setCourse(double course);
    
    /**
     * Sets (as xml) the "Course" element
     */
    void xsetCourse(org.apache.xmlbeans.XmlDouble course);
    
    /**
     * Unsets the "Course" element
     */
    void unsetCourse();
    
    /**
     * Gets the "HorizontalAccuracy" element
     */
    double getHorizontalAccuracy();
    
    /**
     * Gets (as xml) the "HorizontalAccuracy" element
     */
    org.apache.xmlbeans.XmlDouble xgetHorizontalAccuracy();
    
    /**
     * True if has "HorizontalAccuracy" element
     */
    boolean isSetHorizontalAccuracy();
    
    /**
     * Sets the "HorizontalAccuracy" element
     */
    void setHorizontalAccuracy(double horizontalAccuracy);
    
    /**
     * Sets (as xml) the "HorizontalAccuracy" element
     */
    void xsetHorizontalAccuracy(org.apache.xmlbeans.XmlDouble horizontalAccuracy);
    
    /**
     * Unsets the "HorizontalAccuracy" element
     */
    void unsetHorizontalAccuracy();
    
    /**
     * Gets the "Latitude" element
     */
    double getLatitude();
    
    /**
     * Gets (as xml) the "Latitude" element
     */
    org.apache.xmlbeans.XmlDouble xgetLatitude();
    
    /**
     * True if has "Latitude" element
     */
    boolean isSetLatitude();
    
    /**
     * Sets the "Latitude" element
     */
    void setLatitude(double latitude);
    
    /**
     * Sets (as xml) the "Latitude" element
     */
    void xsetLatitude(org.apache.xmlbeans.XmlDouble latitude);
    
    /**
     * Unsets the "Latitude" element
     */
    void unsetLatitude();
    
    /**
     * Gets the "Longitude" element
     */
    double getLongitude();
    
    /**
     * Gets (as xml) the "Longitude" element
     */
    org.apache.xmlbeans.XmlDouble xgetLongitude();
    
    /**
     * True if has "Longitude" element
     */
    boolean isSetLongitude();
    
    /**
     * Sets the "Longitude" element
     */
    void setLongitude(double longitude);
    
    /**
     * Sets (as xml) the "Longitude" element
     */
    void xsetLongitude(org.apache.xmlbeans.XmlDouble longitude);
    
    /**
     * Unsets the "Longitude" element
     */
    void unsetLongitude();
    
    /**
     * Gets the "Speed" element
     */
    double getSpeed();
    
    /**
     * Gets (as xml) the "Speed" element
     */
    org.apache.xmlbeans.XmlDouble xgetSpeed();
    
    /**
     * True if has "Speed" element
     */
    boolean isSetSpeed();
    
    /**
     * Sets the "Speed" element
     */
    void setSpeed(double speed);
    
    /**
     * Sets (as xml) the "Speed" element
     */
    void xsetSpeed(org.apache.xmlbeans.XmlDouble speed);
    
    /**
     * Unsets the "Speed" element
     */
    void unsetSpeed();
    
    /**
     * Gets the "VerticalAccuracy" element
     */
    double getVerticalAccuracy();
    
    /**
     * Gets (as xml) the "VerticalAccuracy" element
     */
    org.apache.xmlbeans.XmlDouble xgetVerticalAccuracy();
    
    /**
     * True if has "VerticalAccuracy" element
     */
    boolean isSetVerticalAccuracy();
    
    /**
     * Sets the "VerticalAccuracy" element
     */
    void setVerticalAccuracy(double verticalAccuracy);
    
    /**
     * Sets (as xml) the "VerticalAccuracy" element
     */
    void xsetVerticalAccuracy(org.apache.xmlbeans.XmlDouble verticalAccuracy);
    
    /**
     * Unsets the "VerticalAccuracy" element
     */
    void unsetVerticalAccuracy();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate newInstance() {
          return (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
