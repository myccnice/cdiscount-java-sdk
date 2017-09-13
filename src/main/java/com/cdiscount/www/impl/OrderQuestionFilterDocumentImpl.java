/*
 * An XML document type.
 * Localname: OrderQuestionFilter
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderQuestionFilterDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OrderQuestionFilter(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OrderQuestionFilterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OrderQuestionFilterDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderQuestionFilterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERQUESTIONFILTER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderQuestionFilter");
    
    
    /**
     * Gets the "OrderQuestionFilter" element
     */
    public com.cdiscount.www.OrderQuestionFilter getOrderQuestionFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderQuestionFilter target = null;
            target = (com.cdiscount.www.OrderQuestionFilter)get_store().find_element_user(ORDERQUESTIONFILTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderQuestionFilter" element
     */
    public boolean isNilOrderQuestionFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderQuestionFilter target = null;
            target = (com.cdiscount.www.OrderQuestionFilter)get_store().find_element_user(ORDERQUESTIONFILTER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrderQuestionFilter" element
     */
    public void setOrderQuestionFilter(com.cdiscount.www.OrderQuestionFilter orderQuestionFilter)
    {
        generatedSetterHelperImpl(orderQuestionFilter, ORDERQUESTIONFILTER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderQuestionFilter" element
     */
    public com.cdiscount.www.OrderQuestionFilter addNewOrderQuestionFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderQuestionFilter target = null;
            target = (com.cdiscount.www.OrderQuestionFilter)get_store().add_element_user(ORDERQUESTIONFILTER$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrderQuestionFilter" element
     */
    public void setNilOrderQuestionFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OrderQuestionFilter target = null;
            target = (com.cdiscount.www.OrderQuestionFilter)get_store().find_element_user(ORDERQUESTIONFILTER$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OrderQuestionFilter)get_store().add_element_user(ORDERQUESTIONFILTER$0);
            }
            target.setNil();
        }
    }
}
