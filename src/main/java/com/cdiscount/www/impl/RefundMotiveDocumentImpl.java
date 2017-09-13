/*
 * An XML document type.
 * Localname: RefundMotive
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.RefundMotiveDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one RefundMotive(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class RefundMotiveDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.RefundMotiveDocument
{
    private static final long serialVersionUID = 1L;
    
    public RefundMotiveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFUNDMOTIVE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "RefundMotive");
    
    
    /**
     * Gets the "RefundMotive" element
     */
    public com.cdiscount.www.RefundMotive.Enum getRefundMotive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFUNDMOTIVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.RefundMotive.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "RefundMotive" element
     */
    public com.cdiscount.www.RefundMotive xgetRefundMotive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundMotive target = null;
            target = (com.cdiscount.www.RefundMotive)get_store().find_element_user(REFUNDMOTIVE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "RefundMotive" element
     */
    public boolean isNilRefundMotive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundMotive target = null;
            target = (com.cdiscount.www.RefundMotive)get_store().find_element_user(REFUNDMOTIVE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RefundMotive" element
     */
    public void setRefundMotive(com.cdiscount.www.RefundMotive.Enum refundMotive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFUNDMOTIVE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFUNDMOTIVE$0);
            }
            target.setEnumValue(refundMotive);
        }
    }
    
    /**
     * Sets (as xml) the "RefundMotive" element
     */
    public void xsetRefundMotive(com.cdiscount.www.RefundMotive refundMotive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundMotive target = null;
            target = (com.cdiscount.www.RefundMotive)get_store().find_element_user(REFUNDMOTIVE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.RefundMotive)get_store().add_element_user(REFUNDMOTIVE$0);
            }
            target.set(refundMotive);
        }
    }
    
    /**
     * Nils the "RefundMotive" element
     */
    public void setNilRefundMotive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.RefundMotive target = null;
            target = (com.cdiscount.www.RefundMotive)get_store().find_element_user(REFUNDMOTIVE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.RefundMotive)get_store().add_element_user(REFUNDMOTIVE$0);
            }
            target.setNil();
        }
    }
}
