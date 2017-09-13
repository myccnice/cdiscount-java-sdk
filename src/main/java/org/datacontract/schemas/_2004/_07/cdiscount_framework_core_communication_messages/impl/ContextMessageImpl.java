/*
 * XML Type:  ContextMessage
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages
 * Java type: org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl;
/**
 * An XML ContextMessage(@http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages).
 *
 * This is a complex type.
 */
public class ContextMessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage
{
    private static final long serialVersionUID = 1L;
    
    public ContextMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATALOGID$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "CatalogID");
    private static final javax.xml.namespace.QName CONFIGURATIONPOLICY$2 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "ConfigurationPolicy");
    private static final javax.xml.namespace.QName CUSTOMERID$4 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "CustomerID");
    private static final javax.xml.namespace.QName CUSTOMERID$6 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "CustomerId");
    private static final javax.xml.namespace.QName CUSTOMERNUMBER$8 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "CustomerNumber");
    private static final javax.xml.namespace.QName CUSTOMERPOOLID$10 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "CustomerPoolID");
    private static final javax.xml.namespace.QName GEOCOORDINATE$12 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "GeoCoordinate");
    private static final javax.xml.namespace.QName SECUREDCONTEXT$14 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "SecuredContext");
    private static final javax.xml.namespace.QName SITEID$16 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Framework.Core.Communication.Messages", "SiteID");
    
    
    /**
     * Gets the "CatalogID" element
     */
    public int getCatalogID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATALOGID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CatalogID" element
     */
    public org.apache.xmlbeans.XmlInt xgetCatalogID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CATALOGID$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CatalogID" element
     */
    public boolean isNilCatalogID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CATALOGID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CatalogID" element
     */
    public boolean isSetCatalogID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATALOGID$0) != 0;
        }
    }
    
    /**
     * Sets the "CatalogID" element
     */
    public void setCatalogID(int catalogID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATALOGID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATALOGID$0);
            }
            target.setIntValue(catalogID);
        }
    }
    
    /**
     * Sets (as xml) the "CatalogID" element
     */
    public void xsetCatalogID(org.apache.xmlbeans.XmlInt catalogID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CATALOGID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CATALOGID$0);
            }
            target.set(catalogID);
        }
    }
    
    /**
     * Nils the "CatalogID" element
     */
    public void setNilCatalogID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CATALOGID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CATALOGID$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CatalogID" element
     */
    public void unsetCatalogID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATALOGID$0, 0);
        }
    }
    
    /**
     * Gets the "ConfigurationPolicy" element
     */
    public java.lang.String getConfigurationPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIGURATIONPOLICY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConfigurationPolicy" element
     */
    public org.apache.xmlbeans.XmlString xgetConfigurationPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONFIGURATIONPOLICY$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ConfigurationPolicy" element
     */
    public boolean isNilConfigurationPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONFIGURATIONPOLICY$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ConfigurationPolicy" element
     */
    public boolean isSetConfigurationPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIGURATIONPOLICY$2) != 0;
        }
    }
    
    /**
     * Sets the "ConfigurationPolicy" element
     */
    public void setConfigurationPolicy(java.lang.String configurationPolicy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIGURATIONPOLICY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFIGURATIONPOLICY$2);
            }
            target.setStringValue(configurationPolicy);
        }
    }
    
    /**
     * Sets (as xml) the "ConfigurationPolicy" element
     */
    public void xsetConfigurationPolicy(org.apache.xmlbeans.XmlString configurationPolicy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONFIGURATIONPOLICY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONFIGURATIONPOLICY$2);
            }
            target.set(configurationPolicy);
        }
    }
    
    /**
     * Nils the "ConfigurationPolicy" element
     */
    public void setNilConfigurationPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONFIGURATIONPOLICY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONFIGURATIONPOLICY$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ConfigurationPolicy" element
     */
    public void unsetConfigurationPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIGURATIONPOLICY$2, 0);
        }
    }
    
    /**
     * Gets the "CustomerID" element
     */
    public java.lang.String getCustomerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CustomerID" element
     */
    public org.apache.xmlbeans.XmlString xgetCustomerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERID$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CustomerID" element
     */
    public boolean isNilCustomerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERID$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CustomerID" element
     */
    public boolean isSetCustomerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERID$4) != 0;
        }
    }
    
    /**
     * Sets the "CustomerID" element
     */
    public void setCustomerID(java.lang.String customerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMERID$4);
            }
            target.setStringValue(customerID);
        }
    }
    
    /**
     * Sets (as xml) the "CustomerID" element
     */
    public void xsetCustomerID(org.apache.xmlbeans.XmlString customerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMERID$4);
            }
            target.set(customerID);
        }
    }
    
    /**
     * Nils the "CustomerID" element
     */
    public void setNilCustomerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMERID$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CustomerID" element
     */
    public void unsetCustomerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERID$4, 0);
        }
    }
    
    /**
     * Gets the "CustomerId" element
     */
    public int getCustomerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERID$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CustomerId" element
     */
    public org.apache.xmlbeans.XmlInt xgetCustomerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CUSTOMERID$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "CustomerId" element
     */
    public boolean isSetCustomerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERID$6) != 0;
        }
    }
    
    /**
     * Sets the "CustomerId" element
     */
    public void setCustomerId(int customerId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMERID$6);
            }
            target.setIntValue(customerId);
        }
    }
    
    /**
     * Sets (as xml) the "CustomerId" element
     */
    public void xsetCustomerId(org.apache.xmlbeans.XmlInt customerId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CUSTOMERID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CUSTOMERID$6);
            }
            target.set(customerId);
        }
    }
    
    /**
     * Unsets the "CustomerId" element
     */
    public void unsetCustomerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERID$6, 0);
        }
    }
    
    /**
     * Gets the "CustomerNumber" element
     */
    public java.lang.String getCustomerNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERNUMBER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CustomerNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetCustomerNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERNUMBER$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CustomerNumber" element
     */
    public boolean isNilCustomerNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERNUMBER$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CustomerNumber" element
     */
    public boolean isSetCustomerNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERNUMBER$8) != 0;
        }
    }
    
    /**
     * Sets the "CustomerNumber" element
     */
    public void setCustomerNumber(java.lang.String customerNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERNUMBER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMERNUMBER$8);
            }
            target.setStringValue(customerNumber);
        }
    }
    
    /**
     * Sets (as xml) the "CustomerNumber" element
     */
    public void xsetCustomerNumber(org.apache.xmlbeans.XmlString customerNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERNUMBER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMERNUMBER$8);
            }
            target.set(customerNumber);
        }
    }
    
    /**
     * Nils the "CustomerNumber" element
     */
    public void setNilCustomerNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERNUMBER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMERNUMBER$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CustomerNumber" element
     */
    public void unsetCustomerNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERNUMBER$8, 0);
        }
    }
    
    /**
     * Gets the "CustomerPoolID" element
     */
    public int getCustomerPoolID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERPOOLID$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CustomerPoolID" element
     */
    public org.apache.xmlbeans.XmlInt xgetCustomerPoolID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CUSTOMERPOOLID$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CustomerPoolID" element
     */
    public boolean isNilCustomerPoolID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CUSTOMERPOOLID$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CustomerPoolID" element
     */
    public boolean isSetCustomerPoolID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERPOOLID$10) != 0;
        }
    }
    
    /**
     * Sets the "CustomerPoolID" element
     */
    public void setCustomerPoolID(int customerPoolID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERPOOLID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMERPOOLID$10);
            }
            target.setIntValue(customerPoolID);
        }
    }
    
    /**
     * Sets (as xml) the "CustomerPoolID" element
     */
    public void xsetCustomerPoolID(org.apache.xmlbeans.XmlInt customerPoolID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CUSTOMERPOOLID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CUSTOMERPOOLID$10);
            }
            target.set(customerPoolID);
        }
    }
    
    /**
     * Nils the "CustomerPoolID" element
     */
    public void setNilCustomerPoolID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CUSTOMERPOOLID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CUSTOMERPOOLID$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CustomerPoolID" element
     */
    public void unsetCustomerPoolID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERPOOLID$10, 0);
        }
    }
    
    /**
     * Gets the "GeoCoordinate" element
     */
    public org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate getGeoCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate target = null;
            target = (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate)get_store().find_element_user(GEOCOORDINATE$12, 0);
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
            target = (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate)get_store().find_element_user(GEOCOORDINATE$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "GeoCoordinate" element
     */
    public boolean isSetGeoCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOCOORDINATE$12) != 0;
        }
    }
    
    /**
     * Sets the "GeoCoordinate" element
     */
    public void setGeoCoordinate(org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate geoCoordinate)
    {
        generatedSetterHelperImpl(geoCoordinate, GEOCOORDINATE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate)get_store().add_element_user(GEOCOORDINATE$12);
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
            target = (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate)get_store().find_element_user(GEOCOORDINATE$12, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.system_device_location.GeoCoordinate)get_store().add_element_user(GEOCOORDINATE$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "GeoCoordinate" element
     */
    public void unsetGeoCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOCOORDINATE$12, 0);
        }
    }
    
    /**
     * Gets the "SecuredContext" element
     */
    public boolean getSecuredContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECUREDCONTEXT$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "SecuredContext" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSecuredContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SECUREDCONTEXT$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "SecuredContext" element
     */
    public boolean isSetSecuredContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECUREDCONTEXT$14) != 0;
        }
    }
    
    /**
     * Sets the "SecuredContext" element
     */
    public void setSecuredContext(boolean securedContext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECUREDCONTEXT$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECUREDCONTEXT$14);
            }
            target.setBooleanValue(securedContext);
        }
    }
    
    /**
     * Sets (as xml) the "SecuredContext" element
     */
    public void xsetSecuredContext(org.apache.xmlbeans.XmlBoolean securedContext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SECUREDCONTEXT$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SECUREDCONTEXT$14);
            }
            target.set(securedContext);
        }
    }
    
    /**
     * Unsets the "SecuredContext" element
     */
    public void unsetSecuredContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECUREDCONTEXT$14, 0);
        }
    }
    
    /**
     * Gets the "SiteID" element
     */
    public int getSiteID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITEID$16, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SiteID" element
     */
    public org.apache.xmlbeans.XmlInt xgetSiteID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SITEID$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SiteID" element
     */
    public void setSiteID(int siteID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITEID$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITEID$16);
            }
            target.setIntValue(siteID);
        }
    }
    
    /**
     * Sets (as xml) the "SiteID" element
     */
    public void xsetSiteID(org.apache.xmlbeans.XmlInt siteID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SITEID$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SITEID$16);
            }
            target.set(siteID);
        }
    }
}
