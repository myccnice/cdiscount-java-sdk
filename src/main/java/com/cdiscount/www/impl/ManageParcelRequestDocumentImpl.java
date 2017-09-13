/*
 * An XML document type.
 * Localname: ManageParcelRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ManageParcelRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ManageParcelRequest(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ManageParcelRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ManageParcelRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public ManageParcelRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MANAGEPARCELREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ManageParcelRequest");
    
    
    /**
     * Gets the "ManageParcelRequest" element
     */
    public com.cdiscount.www.ManageParcelRequest getManageParcelRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ManageParcelRequest target = null;
            target = (com.cdiscount.www.ManageParcelRequest)get_store().find_element_user(MANAGEPARCELREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ManageParcelRequest" element
     */
    public boolean isNilManageParcelRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ManageParcelRequest target = null;
            target = (com.cdiscount.www.ManageParcelRequest)get_store().find_element_user(MANAGEPARCELREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ManageParcelRequest" element
     */
    public void setManageParcelRequest(com.cdiscount.www.ManageParcelRequest manageParcelRequest)
    {
        generatedSetterHelperImpl(manageParcelRequest, MANAGEPARCELREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ManageParcelRequest" element
     */
    public com.cdiscount.www.ManageParcelRequest addNewManageParcelRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ManageParcelRequest target = null;
            target = (com.cdiscount.www.ManageParcelRequest)get_store().add_element_user(MANAGEPARCELREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "ManageParcelRequest" element
     */
    public void setNilManageParcelRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ManageParcelRequest target = null;
            target = (com.cdiscount.www.ManageParcelRequest)get_store().find_element_user(MANAGEPARCELREQUEST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ManageParcelRequest)get_store().add_element_user(MANAGEPARCELREQUEST$0);
            }
            target.setNil();
        }
    }
}
