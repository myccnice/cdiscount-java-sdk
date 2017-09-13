/*
 * An XML document type.
 * Localname: OrderQuestionListMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderQuestionListMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OrderQuestionListMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OrderQuestionListMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OrderQuestionListMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderQuestionListMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERQUESTIONLISTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderQuestionListMessage");
    
    
    /**
     * Gets the "OrderQuestionListMessage" element
     */
    public com.cdiscount.www.OrderQuestionListMessage getOrderQuestionListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderQuestionListMessage target = null;
            target = (com.cdiscount.www.OrderQuestionListMessage)get_store().find_element_user(ORDERQUESTIONLISTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderQuestionListMessage" element
     */
    public boolean isNilOrderQuestionListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderQuestionListMessage target = null;
            target = (com.cdiscount.www.OrderQuestionListMessage)get_store().find_element_user(ORDERQUESTIONLISTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrderQuestionListMessage" element
     */
    public void setOrderQuestionListMessage(com.cdiscount.www.OrderQuestionListMessage orderQuestionListMessage)
    {
        generatedSetterHelperImpl(orderQuestionListMessage, ORDERQUESTIONLISTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderQuestionListMessage" element
     */
    public com.cdiscount.www.OrderQuestionListMessage addNewOrderQuestionListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderQuestionListMessage target = null;
            target = (com.cdiscount.www.OrderQuestionListMessage)get_store().add_element_user(ORDERQUESTIONLISTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrderQuestionListMessage" element
     */
    public void setNilOrderQuestionListMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderQuestionListMessage target = null;
            target = (com.cdiscount.www.OrderQuestionListMessage)get_store().find_element_user(ORDERQUESTIONLISTMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OrderQuestionListMessage)get_store().add_element_user(ORDERQUESTIONLISTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
