/*
 * XML Type:  GeoCoordinate
 * Namespace: http://schemas.datacontract.org/2004/07/System.Device.Location
 * Java type: org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.system_device_location.impl;
/**
 * An XML GeoCoordinate(@http://schemas.datacontract.org/2004/07/System.Device.Location).
 *
 * This is a complex type.
 */
public class GeoCoordinateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate
{
    private static final long serialVersionUID = 1L;
    
    public GeoCoordinateImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALTITUDE$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Device.Location", "Altitude");
    private static final javax.xml.namespace.QName COURSE$2 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Device.Location", "Course");
    private static final javax.xml.namespace.QName HORIZONTALACCURACY$4 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Device.Location", "HorizontalAccuracy");
    private static final javax.xml.namespace.QName LATITUDE$6 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Device.Location", "Latitude");
    private static final javax.xml.namespace.QName LONGITUDE$8 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Device.Location", "Longitude");
    private static final javax.xml.namespace.QName SPEED$10 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Device.Location", "Speed");
    private static final javax.xml.namespace.QName VERTICALACCURACY$12 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Device.Location", "VerticalAccuracy");
    
    
    /**
     * Gets the "Altitude" element
     */
    public double getAltitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTITUDE$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "Altitude" element
     */
    public org.apache.xmlbeans.XmlDouble xgetAltitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ALTITUDE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Altitude" element
     */
    public boolean isSetAltitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALTITUDE$0) != 0;
        }
    }
    
    /**
     * Sets the "Altitude" element
     */
    public void setAltitude(double altitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTITUDE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALTITUDE$0);
            }
            target.setDoubleValue(altitude);
        }
    }
    
    /**
     * Sets (as xml) the "Altitude" element
     */
    public void xsetAltitude(org.apache.xmlbeans.XmlDouble altitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ALTITUDE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(ALTITUDE$0);
            }
            target.set(altitude);
        }
    }
    
    /**
     * Unsets the "Altitude" element
     */
    public void unsetAltitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALTITUDE$0, 0);
        }
    }
    
    /**
     * Gets the "Course" element
     */
    public double getCourse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COURSE$2, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "Course" element
     */
    public org.apache.xmlbeans.XmlDouble xgetCourse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(COURSE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Course" element
     */
    public boolean isSetCourse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COURSE$2) != 0;
        }
    }
    
    /**
     * Sets the "Course" element
     */
    public void setCourse(double course)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COURSE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COURSE$2);
            }
            target.setDoubleValue(course);
        }
    }
    
    /**
     * Sets (as xml) the "Course" element
     */
    public void xsetCourse(org.apache.xmlbeans.XmlDouble course)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(COURSE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(COURSE$2);
            }
            target.set(course);
        }
    }
    
    /**
     * Unsets the "Course" element
     */
    public void unsetCourse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COURSE$2, 0);
        }
    }
    
    /**
     * Gets the "HorizontalAccuracy" element
     */
    public double getHorizontalAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HORIZONTALACCURACY$4, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "HorizontalAccuracy" element
     */
    public org.apache.xmlbeans.XmlDouble xgetHorizontalAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(HORIZONTALACCURACY$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "HorizontalAccuracy" element
     */
    public boolean isSetHorizontalAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HORIZONTALACCURACY$4) != 0;
        }
    }
    
    /**
     * Sets the "HorizontalAccuracy" element
     */
    public void setHorizontalAccuracy(double horizontalAccuracy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HORIZONTALACCURACY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HORIZONTALACCURACY$4);
            }
            target.setDoubleValue(horizontalAccuracy);
        }
    }
    
    /**
     * Sets (as xml) the "HorizontalAccuracy" element
     */
    public void xsetHorizontalAccuracy(org.apache.xmlbeans.XmlDouble horizontalAccuracy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(HORIZONTALACCURACY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(HORIZONTALACCURACY$4);
            }
            target.set(horizontalAccuracy);
        }
    }
    
    /**
     * Unsets the "HorizontalAccuracy" element
     */
    public void unsetHorizontalAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HORIZONTALACCURACY$4, 0);
        }
    }
    
    /**
     * Gets the "Latitude" element
     */
    public double getLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$6, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "Latitude" element
     */
    public org.apache.xmlbeans.XmlDouble xgetLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LATITUDE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Latitude" element
     */
    public boolean isSetLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LATITUDE$6) != 0;
        }
    }
    
    /**
     * Sets the "Latitude" element
     */
    public void setLatitude(double latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATITUDE$6);
            }
            target.setDoubleValue(latitude);
        }
    }
    
    /**
     * Sets (as xml) the "Latitude" element
     */
    public void xsetLatitude(org.apache.xmlbeans.XmlDouble latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LATITUDE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(LATITUDE$6);
            }
            target.set(latitude);
        }
    }
    
    /**
     * Unsets the "Latitude" element
     */
    public void unsetLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LATITUDE$6, 0);
        }
    }
    
    /**
     * Gets the "Longitude" element
     */
    public double getLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$8, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "Longitude" element
     */
    public org.apache.xmlbeans.XmlDouble xgetLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LONGITUDE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "Longitude" element
     */
    public boolean isSetLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LONGITUDE$8) != 0;
        }
    }
    
    /**
     * Sets the "Longitude" element
     */
    public void setLongitude(double longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONGITUDE$8);
            }
            target.setDoubleValue(longitude);
        }
    }
    
    /**
     * Sets (as xml) the "Longitude" element
     */
    public void xsetLongitude(org.apache.xmlbeans.XmlDouble longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LONGITUDE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(LONGITUDE$8);
            }
            target.set(longitude);
        }
    }
    
    /**
     * Unsets the "Longitude" element
     */
    public void unsetLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LONGITUDE$8, 0);
        }
    }
    
    /**
     * Gets the "Speed" element
     */
    public double getSpeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPEED$10, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "Speed" element
     */
    public org.apache.xmlbeans.XmlDouble xgetSpeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(SPEED$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "Speed" element
     */
    public boolean isSetSpeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPEED$10) != 0;
        }
    }
    
    /**
     * Sets the "Speed" element
     */
    public void setSpeed(double speed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPEED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPEED$10);
            }
            target.setDoubleValue(speed);
        }
    }
    
    /**
     * Sets (as xml) the "Speed" element
     */
    public void xsetSpeed(org.apache.xmlbeans.XmlDouble speed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(SPEED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(SPEED$10);
            }
            target.set(speed);
        }
    }
    
    /**
     * Unsets the "Speed" element
     */
    public void unsetSpeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPEED$10, 0);
        }
    }
    
    /**
     * Gets the "VerticalAccuracy" element
     */
    public double getVerticalAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERTICALACCURACY$12, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "VerticalAccuracy" element
     */
    public org.apache.xmlbeans.XmlDouble xgetVerticalAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(VERTICALACCURACY$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "VerticalAccuracy" element
     */
    public boolean isSetVerticalAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERTICALACCURACY$12) != 0;
        }
    }
    
    /**
     * Sets the "VerticalAccuracy" element
     */
    public void setVerticalAccuracy(double verticalAccuracy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERTICALACCURACY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERTICALACCURACY$12);
            }
            target.setDoubleValue(verticalAccuracy);
        }
    }
    
    /**
     * Sets (as xml) the "VerticalAccuracy" element
     */
    public void xsetVerticalAccuracy(org.apache.xmlbeans.XmlDouble verticalAccuracy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(VERTICALACCURACY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(VERTICALACCURACY$12);
            }
            target.set(verticalAccuracy);
        }
    }
    
    /**
     * Unsets the "VerticalAccuracy" element
     */
    public void unsetVerticalAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERTICALACCURACY$12, 0);
        }
    }
}
