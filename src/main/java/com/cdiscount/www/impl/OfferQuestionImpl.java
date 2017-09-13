/*
 * XML Type:  OfferQuestion
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferQuestion
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML OfferQuestion(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class OfferQuestionImpl extends com.cdiscount.www.impl.DiscussionThreadBaseImpl implements com.cdiscount.www.OfferQuestion
{
    private static final long serialVersionUID = 1L;
    
    public OfferQuestionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTEAN$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductEAN");
    private static final javax.xml.namespace.QName PRODUCTSELLERREFERENCE$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductSellerReference");
    
    
    /**
     * Gets the "ProductEAN" element
     */
    public java.lang.String getProductEAN()
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
     * Gets (as xml) the "ProductEAN" element
     */
    public org.apache.xmlbeans.XmlString xgetProductEAN()
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
     * Tests for nil "ProductEAN" element
     */
    public boolean isNilProductEAN()
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
     * True if has "ProductEAN" element
     */
    public boolean isSetProductEAN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTEAN$0) != 0;
        }
    }
    
    /**
     * Sets the "ProductEAN" element
     */
    public void setProductEAN(java.lang.String productEAN)
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
            target.setStringValue(productEAN);
        }
    }
    
    /**
     * Sets (as xml) the "ProductEAN" element
     */
    public void xsetProductEAN(org.apache.xmlbeans.XmlString productEAN)
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
            target.set(productEAN);
        }
    }
    
    /**
     * Nils the "ProductEAN" element
     */
    public void setNilProductEAN()
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
     * Unsets the "ProductEAN" element
     */
    public void unsetProductEAN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTEAN$0, 0);
        }
    }
    
    /**
     * Gets the "ProductSellerReference" element
     */
    public java.lang.String getProductSellerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTSELLERREFERENCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductSellerReference" element
     */
    public org.apache.xmlbeans.XmlString xgetProductSellerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTSELLERREFERENCE$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductSellerReference" element
     */
    public boolean isNilProductSellerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTSELLERREFERENCE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ProductSellerReference" element
     */
    public boolean isSetProductSellerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTSELLERREFERENCE$2) != 0;
        }
    }
    
    /**
     * Sets the "ProductSellerReference" element
     */
    public void setProductSellerReference(java.lang.String productSellerReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTSELLERREFERENCE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTSELLERREFERENCE$2);
            }
            target.setStringValue(productSellerReference);
        }
    }
    
    /**
     * Sets (as xml) the "ProductSellerReference" element
     */
    public void xsetProductSellerReference(org.apache.xmlbeans.XmlString productSellerReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTSELLERREFERENCE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTSELLERREFERENCE$2);
            }
            target.set(productSellerReference);
        }
    }
    
    /**
     * Nils the "ProductSellerReference" element
     */
    public void setNilProductSellerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTSELLERREFERENCE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTSELLERREFERENCE$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ProductSellerReference" element
     */
    public void unsetProductSellerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTSELLERREFERENCE$2, 0);
        }
    }
}
