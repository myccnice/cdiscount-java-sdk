/*
 * An XML document type.
 * Localname: RefundInformation
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.RefundInformationDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one RefundInformation(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class RefundInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.RefundInformationDocument
{
    private static final long serialVersionUID = 1L;
    
    public RefundInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFUNDINFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "RefundInformation");
    
    
    /**
     * Gets the "RefundInformation" element
     */
    public com.cdiscount.www.RefundInformation getRefundInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundInformation target = null;
            target = (com.cdiscount.www.RefundInformation)get_store().find_element_user(REFUNDINFORMATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RefundInformation" element
     */
    public boolean isNilRefundInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundInformation target = null;
            target = (com.cdiscount.www.RefundInformation)get_store().find_element_user(REFUNDINFORMATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RefundInformation" element
     */
    public void setRefundInformation(com.cdiscount.www.RefundInformation refundInformation)
    {
        generatedSetterHelperImpl(refundInformation, REFUNDINFORMATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RefundInformation" element
     */
    public com.cdiscount.www.RefundInformation addNewRefundInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundInformation target = null;
            target = (com.cdiscount.www.RefundInformation)get_store().add_element_user(REFUNDINFORMATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "RefundInformation" element
     */
    public void setNilRefundInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundInformation target = null;
            target = (com.cdiscount.www.RefundInformation)get_store().find_element_user(REFUNDINFORMATION$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.RefundInformation)get_store().add_element_user(REFUNDINFORMATION$0);
            }
            target.setNil();
        }
    }
}
