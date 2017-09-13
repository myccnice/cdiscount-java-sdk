/*
 * An XML document type.
 * Localname: ArrayOfSellerRefundResult
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfSellerRefundResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfSellerRefundResult(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfSellerRefundResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfSellerRefundResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSellerRefundResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSELLERREFUNDRESULT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfSellerRefundResult");
    
    
    /**
     * Gets the "ArrayOfSellerRefundResult" element
     */
    public com.cdiscount.www.ArrayOfSellerRefundResult getArrayOfSellerRefundResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerRefundResult target = null;
            target = (com.cdiscount.www.ArrayOfSellerRefundResult)get_store().find_element_user(ARRAYOFSELLERREFUNDRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfSellerRefundResult" element
     */
    public boolean isNilArrayOfSellerRefundResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerRefundResult target = null;
            target = (com.cdiscount.www.ArrayOfSellerRefundResult)get_store().find_element_user(ARRAYOFSELLERREFUNDRESULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfSellerRefundResult" element
     */
    public void setArrayOfSellerRefundResult(com.cdiscount.www.ArrayOfSellerRefundResult arrayOfSellerRefundResult)
    {
        generatedSetterHelperImpl(arrayOfSellerRefundResult, ARRAYOFSELLERREFUNDRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfSellerRefundResult" element
     */
    public com.cdiscount.www.ArrayOfSellerRefundResult addNewArrayOfSellerRefundResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerRefundResult target = null;
            target = (com.cdiscount.www.ArrayOfSellerRefundResult)get_store().add_element_user(ARRAYOFSELLERREFUNDRESULT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfSellerRefundResult" element
     */
    public void setNilArrayOfSellerRefundResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfSellerRefundResult target = null;
            target = (com.cdiscount.www.ArrayOfSellerRefundResult)get_store().find_element_user(ARRAYOFSELLERREFUNDRESULT$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfSellerRefundResult)get_store().add_element_user(ARRAYOFSELLERREFUNDRESULT$0);
            }
            target.setNil();
        }
    }
}
