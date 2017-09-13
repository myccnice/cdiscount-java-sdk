/*
 * An XML document type.
 * Localname: IdentifierRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.IdentifierRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one IdentifierRequest(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class IdentifierRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.IdentifierRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public IdentifierRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIERREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "IdentifierRequest");
    
    
    /**
     * Gets the "IdentifierRequest" element
     */
    public com.cdiscount.www.IdentifierRequest getIdentifierRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.IdentifierRequest target = null;
            target = (com.cdiscount.www.IdentifierRequest)get_store().find_element_user(IDENTIFIERREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IdentifierRequest" element
     */
    public boolean isNilIdentifierRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.IdentifierRequest target = null;
            target = (com.cdiscount.www.IdentifierRequest)get_store().find_element_user(IDENTIFIERREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "IdentifierRequest" element
     */
    public void setIdentifierRequest(com.cdiscount.www.IdentifierRequest identifierRequest)
    {
        generatedSetterHelperImpl(identifierRequest, IDENTIFIERREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IdentifierRequest" element
     */
    public com.cdiscount.www.IdentifierRequest addNewIdentifierRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.IdentifierRequest target = null;
            target = (com.cdiscount.www.IdentifierRequest)get_store().add_element_user(IDENTIFIERREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "IdentifierRequest" element
     */
    public void setNilIdentifierRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.IdentifierRequest target = null;
            target = (com.cdiscount.www.IdentifierRequest)get_store().find_element_user(IDENTIFIERREQUEST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.IdentifierRequest)get_store().add_element_user(IDENTIFIERREQUEST$0);
            }
            target.setNil();
        }
    }
}
