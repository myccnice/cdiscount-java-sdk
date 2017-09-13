/*
 * XML Type:  OrderQuestionListMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderQuestionListMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML OrderQuestionListMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class OrderQuestionListMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.OrderQuestionListMessage
{
    private static final long serialVersionUID = 1L;
    
    public OrderQuestionListMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERQUESTIONLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderQuestionList");
    
    
    /**
     * Gets the "OrderQuestionList" element
     */
    public com.cdiscount.www.ArrayOfOrderQuestion getOrderQuestionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderQuestion target = null;
            target = (com.cdiscount.www.ArrayOfOrderQuestion)get_store().find_element_user(ORDERQUESTIONLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderQuestionList" element
     */
    public boolean isNilOrderQuestionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderQuestion target = null;
            target = (com.cdiscount.www.ArrayOfOrderQuestion)get_store().find_element_user(ORDERQUESTIONLIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OrderQuestionList" element
     */
    public boolean isSetOrderQuestionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERQUESTIONLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "OrderQuestionList" element
     */
    public void setOrderQuestionList(com.cdiscount.www.ArrayOfOrderQuestion orderQuestionList)
    {
        generatedSetterHelperImpl(orderQuestionList, ORDERQUESTIONLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderQuestionList" element
     */
    public com.cdiscount.www.ArrayOfOrderQuestion addNewOrderQuestionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderQuestion target = null;
            target = (com.cdiscount.www.ArrayOfOrderQuestion)get_store().add_element_user(ORDERQUESTIONLIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrderQuestionList" element
     */
    public void setNilOrderQuestionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOrderQuestion target = null;
            target = (com.cdiscount.www.ArrayOfOrderQuestion)get_store().find_element_user(ORDERQUESTIONLIST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfOrderQuestion)get_store().add_element_user(ORDERQUESTIONLIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OrderQuestionList" element
     */
    public void unsetOrderQuestionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERQUESTIONLIST$0, 0);
        }
    }
}
