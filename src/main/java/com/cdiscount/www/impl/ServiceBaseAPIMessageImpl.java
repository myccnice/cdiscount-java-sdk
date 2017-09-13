/*
 * XML Type:  ServiceBaseAPIMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ServiceBaseAPIMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ServiceBaseAPIMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ServiceBaseAPIMessageImpl extends org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.impl.ServiceMessageImpl implements com.cdiscount.www.ServiceBaseAPIMessage
{
    private static final long serialVersionUID = 1L;
    
    public ServiceBaseAPIMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ErrorList");
    private static final javax.xml.namespace.QName SELLERLOGIN$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerLogin");
    private static final javax.xml.namespace.QName TOKENID$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "TokenId");
    
    
    /**
     * Gets the "ErrorList" element
     */
    public com.cdiscount.www.ArrayOfError getErrorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfError target = null;
            target = (com.cdiscount.www.ArrayOfError)get_store().find_element_user(ERRORLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ErrorList" element
     */
    public boolean isNilErrorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfError target = null;
            target = (com.cdiscount.www.ArrayOfError)get_store().find_element_user(ERRORLIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ErrorList" element
     */
    public boolean isSetErrorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "ErrorList" element
     */
    public void setErrorList(com.cdiscount.www.ArrayOfError errorList)
    {
        generatedSetterHelperImpl(errorList, ERRORLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ErrorList" element
     */
    public com.cdiscount.www.ArrayOfError addNewErrorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfError target = null;
            target = (com.cdiscount.www.ArrayOfError)get_store().add_element_user(ERRORLIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "ErrorList" element
     */
    public void setNilErrorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfError target = null;
            target = (com.cdiscount.www.ArrayOfError)get_store().find_element_user(ERRORLIST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfError)get_store().add_element_user(ERRORLIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ErrorList" element
     */
    public void unsetErrorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORLIST$0, 0);
        }
    }
    
    /**
     * Gets the "SellerLogin" element
     */
    public java.lang.String getSellerLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERLOGIN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SellerLogin" element
     */
    public org.apache.xmlbeans.XmlString xgetSellerLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERLOGIN$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerLogin" element
     */
    public boolean isNilSellerLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERLOGIN$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SellerLogin" element
     */
    public boolean isSetSellerLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELLERLOGIN$2) != 0;
        }
    }
    
    /**
     * Sets the "SellerLogin" element
     */
    public void setSellerLogin(java.lang.String sellerLogin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERLOGIN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELLERLOGIN$2);
            }
            target.setStringValue(sellerLogin);
        }
    }
    
    /**
     * Sets (as xml) the "SellerLogin" element
     */
    public void xsetSellerLogin(org.apache.xmlbeans.XmlString sellerLogin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERLOGIN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERLOGIN$2);
            }
            target.set(sellerLogin);
        }
    }
    
    /**
     * Nils the "SellerLogin" element
     */
    public void setNilSellerLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERLOGIN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERLOGIN$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SellerLogin" element
     */
    public void unsetSellerLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELLERLOGIN$2, 0);
        }
    }
    
    /**
     * Gets the "TokenId" element
     */
    public java.lang.String getTokenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOKENID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TokenId" element
     */
    public org.apache.xmlbeans.XmlString xgetTokenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOKENID$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "TokenId" element
     */
    public boolean isNilTokenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOKENID$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "TokenId" element
     */
    public boolean isSetTokenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOKENID$4) != 0;
        }
    }
    
    /**
     * Sets the "TokenId" element
     */
    public void setTokenId(java.lang.String tokenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOKENID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOKENID$4);
            }
            target.setStringValue(tokenId);
        }
    }
    
    /**
     * Sets (as xml) the "TokenId" element
     */
    public void xsetTokenId(org.apache.xmlbeans.XmlString tokenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOKENID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOKENID$4);
            }
            target.set(tokenId);
        }
    }
    
    /**
     * Nils the "TokenId" element
     */
    public void setNilTokenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOKENID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOKENID$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "TokenId" element
     */
    public void unsetTokenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOKENID$4, 0);
        }
    }
}
