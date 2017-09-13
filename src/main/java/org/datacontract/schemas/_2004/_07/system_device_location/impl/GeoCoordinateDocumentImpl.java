/*
 * An XML document type.
 * Localname: GeoCoordinate
 * Namespace: http://schemas.datacontract.org/2004/07/System.Device.Location
 * Java type: org.datacontract.schemas._2004._07.system_device_location.GeoCoordinateDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.system_device_location.impl;
/**
 * A document containing one GeoCoordinate(@http://schemas.datacontract.org/2004/07/System.Device.Location) element.
 *
 * This is a complex type.
 */
public class GeoCoordinateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.system_device_location.GeoCoordinateDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeoCoordinateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOCOORDINATE$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Device.Location", "GeoCoordinate");
    
    
    /**
     * Gets the "GeoCoordinate" element
     */
    public org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate getGeoCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate target = null;
            target = (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate)get_store().find_element_user(GEOCOORDINATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "GeoCoordinate" element
     */
    public boolean isNilGeoCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate target = null;
            target = (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate)get_store().find_element_user(GEOCOORDINATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "GeoCoordinate" element
     */
    public void setGeoCoordinate(org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate geoCoordinate)
    {
        generatedSetterHelperImpl(geoCoordinate, GEOCOORDINATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GeoCoordinate" element
     */
    public org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate addNewGeoCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate target = null;
            target = (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate)get_store().add_element_user(GEOCOORDINATE$0);
            return target;
        }
    }
    
    /**
     * Nils the "GeoCoordinate" element
     */
    public void setNilGeoCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate target = null;
            target = (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate)get_store().find_element_user(GEOCOORDINATE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate)get_store().add_element_user(GEOCOORDINATE$0);
            }
            target.setNil();
        }
    }
}
