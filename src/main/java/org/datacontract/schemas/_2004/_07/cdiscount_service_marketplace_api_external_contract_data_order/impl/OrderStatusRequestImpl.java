/*
 * XML Type:  OrderStatusRequest
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.impl;
/**
 * An XML OrderStatusRequest(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order).
 *
 * This is a complex type.
 */
public class OrderStatusRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.OrderStatusRequest
{
    private static final long serialVersionUID = 1L;
    
    public OrderStatusRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORPORATION$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "Corporation");
    private static final javax.xml.namespace.QName CUSTOMERORDERNUMBER$2 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "CustomerOrderNumber");
    
    
    /**
     * Gets the "Corporation" element
     */
    public java.lang.String getCorporation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORPORATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Corporation" element
     */
    public org.apache.xmlbeans.XmlString xgetCorporation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORPORATION$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Corporation" element
     */
    public boolean isNilCorporation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORPORATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Corporation" element
     */
    public boolean isSetCorporation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORPORATION$0) != 0;
        }
    }
    
    /**
     * Sets the "Corporation" element
     */
    public void setCorporation(java.lang.String corporation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORPORATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORPORATION$0);
            }
            target.setStringValue(corporation);
        }
    }
    
    /**
     * Sets (as xml) the "Corporation" element
     */
    public void xsetCorporation(org.apache.xmlbeans.XmlString corporation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORPORATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORPORATION$0);
            }
            target.set(corporation);
        }
    }
    
    /**
     * Nils the "Corporation" element
     */
    public void setNilCorporation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORPORATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORPORATION$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Corporation" element
     */
    public void unsetCorporation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORPORATION$0, 0);
        }
    }
    
    /**
     * Gets the "CustomerOrderNumber" element
     */
    public java.lang.String getCustomerOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERORDERNUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CustomerOrderNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetCustomerOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERORDERNUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CustomerOrderNumber" element
     */
    public boolean isNilCustomerOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERORDERNUMBER$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CustomerOrderNumber" element
     */
    public void setCustomerOrderNumber(java.lang.String customerOrderNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERORDERNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMERORDERNUMBER$2);
            }
            target.setStringValue(customerOrderNumber);
        }
    }
    
    /**
     * Sets (as xml) the "CustomerOrderNumber" element
     */
    public void xsetCustomerOrderNumber(org.apache.xmlbeans.XmlString customerOrderNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERORDERNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMERORDERNUMBER$2);
            }
            target.set(customerOrderNumber);
        }
    }
    
    /**
     * Nils the "CustomerOrderNumber" element
     */
    public void setNilCustomerOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERORDERNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMERORDERNUMBER$2);
            }
            target.setNil();
        }
    }
}
