/*
 * XML Type:  OrderQuestionFilter
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OrderQuestionFilter
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML OrderQuestionFilter(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class OrderQuestionFilterImpl extends com.cdiscount.www.impl.DiscussionFilterBaseImpl implements com.cdiscount.www.OrderQuestionFilter
{
    private static final long serialVersionUID = 1L;
    
    public OrderQuestionFilterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERNUMBERLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OrderNumberList");
    
    
    /**
     * Gets the "OrderNumberList" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getOrderNumberList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(ORDERNUMBERLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderNumberList" element
     */
    public boolean isNilOrderNumberList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(ORDERNUMBERLIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OrderNumberList" element
     */
    public boolean isSetOrderNumberList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERNUMBERLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "OrderNumberList" element
     */
    public void setOrderNumberList(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring orderNumberList)
    {
        generatedSetterHelperImpl(orderNumberList, ORDERNUMBERLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderNumberList" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewOrderNumberList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(ORDERNUMBERLIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrderNumberList" element
     */
    public void setNilOrderNumberList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(ORDERNUMBERLIST$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(ORDERNUMBERLIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OrderNumberList" element
     */
    public void unsetOrderNumberList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERNUMBERLIST$0, 0);
        }
    }
}
