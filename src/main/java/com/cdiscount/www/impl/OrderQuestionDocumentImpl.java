/*
 * An XML document type.
 * Localname: OrderQuestion
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderQuestionDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OrderQuestion(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OrderQuestionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OrderQuestionDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderQuestionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERQUESTION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderQuestion");
    
    
    /**
     * Gets the "OrderQuestion" element
     */
    public com.cdiscount.www.OrderQuestion getOrderQuestion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderQuestion target = null;
            target = (com.cdiscount.www.OrderQuestion)get_store().find_element_user(ORDERQUESTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderQuestion" element
     */
    public boolean isNilOrderQuestion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderQuestion target = null;
            target = (com.cdiscount.www.OrderQuestion)get_store().find_element_user(ORDERQUESTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrderQuestion" element
     */
    public void setOrderQuestion(com.cdiscount.www.OrderQuestion orderQuestion)
    {
        generatedSetterHelperImpl(orderQuestion, ORDERQUESTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderQuestion" element
     */
    public com.cdiscount.www.OrderQuestion addNewOrderQuestion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderQuestion target = null;
            target = (com.cdiscount.www.OrderQuestion)get_store().add_element_user(ORDERQUESTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrderQuestion" element
     */
    public void setNilOrderQuestion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderQuestion target = null;
            target = (com.cdiscount.www.OrderQuestion)get_store().find_element_user(ORDERQUESTION$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OrderQuestion)get_store().add_element_user(ORDERQUESTION$0);
            }
            target.setNil();
        }
    }
}
