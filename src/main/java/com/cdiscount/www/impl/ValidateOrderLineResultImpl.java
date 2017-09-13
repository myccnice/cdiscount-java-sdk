/*
 * XML Type:  ValidateOrderLineResult
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ValidateOrderLineResult
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ValidateOrderLineResult(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ValidateOrderLineResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ValidateOrderLineResult
{
    private static final long serialVersionUID = 1L;
    
    public ValidateOrderLineResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORS$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Errors");
    private static final javax.xml.namespace.QName SELLERPRODUCTID$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerProductId");
    private static final javax.xml.namespace.QName UPDATED$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Updated");
    
    
    /**
     * Gets the "Errors" element
     */
    public com.cdiscount.www.ArrayOfError getErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfError target = null;
            target = (com.cdiscount.www.ArrayOfError)get_store().find_element_user(ERRORS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Errors" element
     */
    public boolean isNilErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfError target = null;
            target = (com.cdiscount.www.ArrayOfError)get_store().find_element_user(ERRORS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Errors" element
     */
    public boolean isSetErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORS$0) != 0;
        }
    }
    
    /**
     * Sets the "Errors" element
     */
    public void setErrors(com.cdiscount.www.ArrayOfError errors)
    {
        generatedSetterHelperImpl(errors, ERRORS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Errors" element
     */
    public com.cdiscount.www.ArrayOfError addNewErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfError target = null;
            target = (com.cdiscount.www.ArrayOfError)get_store().add_element_user(ERRORS$0);
            return target;
        }
    }
    
    /**
     * Nils the "Errors" element
     */
    public void setNilErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfError target = null;
            target = (com.cdiscount.www.ArrayOfError)get_store().find_element_user(ERRORS$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfError)get_store().add_element_user(ERRORS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Errors" element
     */
    public void unsetErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORS$0, 0);
        }
    }
    
    /**
     * Gets the "SellerProductId" element
     */
    public java.lang.String getSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERPRODUCTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SellerProductId" element
     */
    public org.apache.xmlbeans.XmlString xgetSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerProductId" element
     */
    public boolean isNilSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SellerProductId" element
     */
    public boolean isSetSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELLERPRODUCTID$2) != 0;
        }
    }
    
    /**
     * Sets the "SellerProductId" element
     */
    public void setSellerProductId(java.lang.String sellerProductId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERPRODUCTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELLERPRODUCTID$2);
            }
            target.setStringValue(sellerProductId);
        }
    }
    
    /**
     * Sets (as xml) the "SellerProductId" element
     */
    public void xsetSellerProductId(org.apache.xmlbeans.XmlString sellerProductId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERPRODUCTID$2);
            }
            target.set(sellerProductId);
        }
    }
    
    /**
     * Nils the "SellerProductId" element
     */
    public void setNilSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERPRODUCTID$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SellerProductId" element
     */
    public void unsetSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELLERPRODUCTID$2, 0);
        }
    }
    
    /**
     * Gets the "Updated" element
     */
    public boolean getUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATED$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Updated" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(UPDATED$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Updated" element
     */
    public boolean isSetUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPDATED$4) != 0;
        }
    }
    
    /**
     * Sets the "Updated" element
     */
    public void setUpdated(boolean updated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDATED$4);
            }
            target.setBooleanValue(updated);
        }
    }
    
    /**
     * Sets (as xml) the "Updated" element
     */
    public void xsetUpdated(org.apache.xmlbeans.XmlBoolean updated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(UPDATED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(UPDATED$4);
            }
            target.set(updated);
        }
    }
    
    /**
     * Unsets the "Updated" element
     */
    public void unsetUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPDATED$4, 0);
        }
    }
}
