/*
 * An XML document type.
 * Localname: ManageParcelResultMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ManageParcelResultMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ManageParcelResultMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ManageParcelResultMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ManageParcelResultMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public ManageParcelResultMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MANAGEPARCELRESULTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ManageParcelResultMessage");
    
    
    /**
     * Gets the "ManageParcelResultMessage" element
     */
    public com.cdiscount.www.ManageParcelResultMessage getManageParcelResultMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ManageParcelResultMessage target = null;
            target = (com.cdiscount.www.ManageParcelResultMessage)get_store().find_element_user(MANAGEPARCELRESULTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ManageParcelResultMessage" element
     */
    public boolean isNilManageParcelResultMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ManageParcelResultMessage target = null;
            target = (com.cdiscount.www.ManageParcelResultMessage)get_store().find_element_user(MANAGEPARCELRESULTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ManageParcelResultMessage" element
     */
    public void setManageParcelResultMessage(com.cdiscount.www.ManageParcelResultMessage manageParcelResultMessage)
    {
        generatedSetterHelperImpl(manageParcelResultMessage, MANAGEPARCELRESULTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ManageParcelResultMessage" element
     */
    public com.cdiscount.www.ManageParcelResultMessage addNewManageParcelResultMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ManageParcelResultMessage target = null;
            target = (com.cdiscount.www.ManageParcelResultMessage)get_store().add_element_user(MANAGEPARCELRESULTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ManageParcelResultMessage" element
     */
    public void setNilManageParcelResultMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ManageParcelResultMessage target = null;
            target = (com.cdiscount.www.ManageParcelResultMessage)get_store().find_element_user(MANAGEPARCELRESULTMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ManageParcelResultMessage)get_store().add_element_user(MANAGEPARCELRESULTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
