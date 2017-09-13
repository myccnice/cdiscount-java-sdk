/*
 * An XML document type.
 * Localname: SupplyOrderMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SupplyOrderMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one SupplyOrderMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class SupplyOrderMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.SupplyOrderMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public SupplyOrderMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUPPLYORDERMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SupplyOrderMessage");
    
    
    /**
     * Gets the "SupplyOrderMessage" element
     */
    public com.cdiscount.www.SupplyOrderMessage getSupplyOrderMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderMessage target = null;
            target = (com.cdiscount.www.SupplyOrderMessage)get_store().find_element_user(SUPPLYORDERMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SupplyOrderMessage" element
     */
    public boolean isNilSupplyOrderMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderMessage target = null;
            target = (com.cdiscount.www.SupplyOrderMessage)get_store().find_element_user(SUPPLYORDERMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SupplyOrderMessage" element
     */
    public void setSupplyOrderMessage(com.cdiscount.www.SupplyOrderMessage supplyOrderMessage)
    {
        generatedSetterHelperImpl(supplyOrderMessage, SUPPLYORDERMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SupplyOrderMessage" element
     */
    public com.cdiscount.www.SupplyOrderMessage addNewSupplyOrderMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderMessage target = null;
            target = (com.cdiscount.www.SupplyOrderMessage)get_store().add_element_user(SUPPLYORDERMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "SupplyOrderMessage" element
     */
    public void setNilSupplyOrderMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SupplyOrderMessage target = null;
            target = (com.cdiscount.www.SupplyOrderMessage)get_store().find_element_user(SUPPLYORDERMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SupplyOrderMessage)get_store().add_element_user(SUPPLYORDERMESSAGE$0);
            }
            target.setNil();
        }
    }
}
