/*
 * An XML document type.
 * Localname: ProductReportLog
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductReportLogDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ProductReportLog(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ProductReportLogDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ProductReportLogDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductReportLogDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTREPORTLOG$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductReportLog");
    
    
    /**
     * Gets the "ProductReportLog" element
     */
    public com.cdiscount.www.ProductReportLog getProductReportLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductReportLog target = null;
            target = (com.cdiscount.www.ProductReportLog)get_store().find_element_user(PRODUCTREPORTLOG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductReportLog" element
     */
    public boolean isNilProductReportLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductReportLog target = null;
            target = (com.cdiscount.www.ProductReportLog)get_store().find_element_user(PRODUCTREPORTLOG$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ProductReportLog" element
     */
    public void setProductReportLog(com.cdiscount.www.ProductReportLog productReportLog)
    {
        generatedSetterHelperImpl(productReportLog, PRODUCTREPORTLOG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductReportLog" element
     */
    public com.cdiscount.www.ProductReportLog addNewProductReportLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductReportLog target = null;
            target = (com.cdiscount.www.ProductReportLog)get_store().add_element_user(PRODUCTREPORTLOG$0);
            return target;
        }
    }
    
    /**
     * Nils the "ProductReportLog" element
     */
    public void setNilProductReportLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductReportLog target = null;
            target = (com.cdiscount.www.ProductReportLog)get_store().find_element_user(PRODUCTREPORTLOG$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductReportLog)get_store().add_element_user(PRODUCTREPORTLOG$0);
            }
            target.setNil();
        }
    }
}
