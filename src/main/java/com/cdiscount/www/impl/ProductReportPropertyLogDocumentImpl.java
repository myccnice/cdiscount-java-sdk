/*
 * An XML document type.
 * Localname: ProductReportPropertyLog
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductReportPropertyLogDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ProductReportPropertyLog(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ProductReportPropertyLogDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ProductReportPropertyLogDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductReportPropertyLogDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTREPORTPROPERTYLOG$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductReportPropertyLog");
    
    
    /**
     * Gets the "ProductReportPropertyLog" element
     */
    public com.cdiscount.www.ProductReportPropertyLog getProductReportPropertyLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductReportPropertyLog target = null;
            target = (com.cdiscount.www.ProductReportPropertyLog)get_store().find_element_user(PRODUCTREPORTPROPERTYLOG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductReportPropertyLog" element
     */
    public boolean isNilProductReportPropertyLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductReportPropertyLog target = null;
            target = (com.cdiscount.www.ProductReportPropertyLog)get_store().find_element_user(PRODUCTREPORTPROPERTYLOG$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ProductReportPropertyLog" element
     */
    public void setProductReportPropertyLog(com.cdiscount.www.ProductReportPropertyLog productReportPropertyLog)
    {
        generatedSetterHelperImpl(productReportPropertyLog, PRODUCTREPORTPROPERTYLOG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductReportPropertyLog" element
     */
    public com.cdiscount.www.ProductReportPropertyLog addNewProductReportPropertyLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductReportPropertyLog target = null;
            target = (com.cdiscount.www.ProductReportPropertyLog)get_store().add_element_user(PRODUCTREPORTPROPERTYLOG$0);
            return target;
        }
    }
    
    /**
     * Nils the "ProductReportPropertyLog" element
     */
    public void setNilProductReportPropertyLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductReportPropertyLog target = null;
            target = (com.cdiscount.www.ProductReportPropertyLog)get_store().find_element_user(PRODUCTREPORTPROPERTYLOG$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductReportPropertyLog)get_store().add_element_user(PRODUCTREPORTPROPERTYLOG$0);
            }
            target.setNil();
        }
    }
}
