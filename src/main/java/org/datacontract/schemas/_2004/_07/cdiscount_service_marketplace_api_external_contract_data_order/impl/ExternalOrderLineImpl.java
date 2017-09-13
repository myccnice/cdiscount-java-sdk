/*
 * XML Type:  ExternalOrderLine
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrderLine
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.impl;
/**
 * An XML ExternalOrderLine(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order).
 *
 * This is a complex type.
 */
public class ExternalOrderLineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrderLine
{
    private static final long serialVersionUID = 1L;
    
    public ExternalOrderLineImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTEAN$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "ProductEan");
    private static final javax.xml.namespace.QName PRODUCTREFERENCE$2 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "ProductReference");
    private static final javax.xml.namespace.QName QUANTITY$4 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "Quantity");
    
    
    /**
     * Gets the "ProductEan" element
     */
    public java.lang.String getProductEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTEAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductEan" element
     */
    public org.apache.xmlbeans.XmlString xgetProductEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductEan" element
     */
    public boolean isNilProductEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ProductEan" element
     */
    public void setProductEan(java.lang.String productEan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTEAN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTEAN$0);
            }
            target.setStringValue(productEan);
        }
    }
    
    /**
     * Sets (as xml) the "ProductEan" element
     */
    public void xsetProductEan(org.apache.xmlbeans.XmlString productEan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTEAN$0);
            }
            target.set(productEan);
        }
    }
    
    /**
     * Nils the "ProductEan" element
     */
    public void setNilProductEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTEAN$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "ProductReference" element
     */
    public java.lang.String getProductReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTREFERENCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductReference" element
     */
    public org.apache.xmlbeans.XmlString xgetProductReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTREFERENCE$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductReference" element
     */
    public boolean isNilProductReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTREFERENCE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ProductReference" element
     */
    public boolean isSetProductReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTREFERENCE$2) != 0;
        }
    }
    
    /**
     * Sets the "ProductReference" element
     */
    public void setProductReference(java.lang.String productReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTREFERENCE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTREFERENCE$2);
            }
            target.setStringValue(productReference);
        }
    }
    
    /**
     * Sets (as xml) the "ProductReference" element
     */
    public void xsetProductReference(org.apache.xmlbeans.XmlString productReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTREFERENCE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTREFERENCE$2);
            }
            target.set(productReference);
        }
    }
    
    /**
     * Nils the "ProductReference" element
     */
    public void setNilProductReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTREFERENCE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTREFERENCE$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ProductReference" element
     */
    public void unsetProductReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTREFERENCE$2, 0);
        }
    }
    
    /**
     * Gets the "Quantity" element
     */
    public int getQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITY$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Quantity" element
     */
    public org.apache.xmlbeans.XmlInt xgetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QUANTITY$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Quantity" element
     */
    public void setQuantity(int quantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUANTITY$4);
            }
            target.setIntValue(quantity);
        }
    }
    
    /**
     * Sets (as xml) the "Quantity" element
     */
    public void xsetQuantity(org.apache.xmlbeans.XmlInt quantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QUANTITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(QUANTITY$4);
            }
            target.set(quantity);
        }
    }
}
