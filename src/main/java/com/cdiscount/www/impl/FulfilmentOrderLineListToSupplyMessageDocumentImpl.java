/*
 * An XML document type.
 * Localname: FulfilmentOrderLineListToSupplyMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentOrderLineListToSupplyMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one FulfilmentOrderLineListToSupplyMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class FulfilmentOrderLineListToSupplyMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.FulfilmentOrderLineListToSupplyMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentOrderLineListToSupplyMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULFILMENTORDERLINELISTTOSUPPLYMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FulfilmentOrderLineListToSupplyMessage");
    
    
    /**
     * Gets the "FulfilmentOrderLineListToSupplyMessage" element
     */
    public com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage getFulfilmentOrderLineListToSupplyMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage target = null;
            target = (com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage)get_store().find_element_user(FULFILMENTORDERLINELISTTOSUPPLYMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FulfilmentOrderLineListToSupplyMessage" element
     */
    public boolean isNilFulfilmentOrderLineListToSupplyMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage target = null;
            target = (com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage)get_store().find_element_user(FULFILMENTORDERLINELISTTOSUPPLYMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FulfilmentOrderLineListToSupplyMessage" element
     */
    public void setFulfilmentOrderLineListToSupplyMessage(com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage fulfilmentOrderLineListToSupplyMessage)
    {
        generatedSetterHelperImpl(fulfilmentOrderLineListToSupplyMessage, FULFILMENTORDERLINELISTTOSUPPLYMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FulfilmentOrderLineListToSupplyMessage" element
     */
    public com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage addNewFulfilmentOrderLineListToSupplyMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage target = null;
            target = (com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage)get_store().add_element_user(FULFILMENTORDERLINELISTTOSUPPLYMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "FulfilmentOrderLineListToSupplyMessage" element
     */
    public void setNilFulfilmentOrderLineListToSupplyMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage target = null;
            target = (com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage)get_store().find_element_user(FULFILMENTORDERLINELISTTOSUPPLYMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.FulfilmentOrderLineListToSupplyMessage)get_store().add_element_user(FULFILMENTORDERLINELISTTOSUPPLYMESSAGE$0);
            }
            target.setNil();
        }
    }
}
