/*
 * An XML document type.
 * Localname: ProductIntegrationReportMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductIntegrationReportMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ProductIntegrationReportMessage(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ProductIntegrationReportMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ProductIntegrationReportMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductIntegrationReportMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTINTEGRATIONREPORTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductIntegrationReportMessage");
    
    
    /**
     * Gets the "ProductIntegrationReportMessage" element
     */
    public com.cdiscount.www.ProductIntegrationReportMessage getProductIntegrationReportMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductIntegrationReportMessage target = null;
            target = (com.cdiscount.www.ProductIntegrationReportMessage)get_store().find_element_user(PRODUCTINTEGRATIONREPORTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductIntegrationReportMessage" element
     */
    public boolean isNilProductIntegrationReportMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductIntegrationReportMessage target = null;
            target = (com.cdiscount.www.ProductIntegrationReportMessage)get_store().find_element_user(PRODUCTINTEGRATIONREPORTMESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ProductIntegrationReportMessage" element
     */
    public void setProductIntegrationReportMessage(com.cdiscount.www.ProductIntegrationReportMessage productIntegrationReportMessage)
    {
        generatedSetterHelperImpl(productIntegrationReportMessage, PRODUCTINTEGRATIONREPORTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductIntegrationReportMessage" element
     */
    public com.cdiscount.www.ProductIntegrationReportMessage addNewProductIntegrationReportMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductIntegrationReportMessage target = null;
            target = (com.cdiscount.www.ProductIntegrationReportMessage)get_store().add_element_user(PRODUCTINTEGRATIONREPORTMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ProductIntegrationReportMessage" element
     */
    public void setNilProductIntegrationReportMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductIntegrationReportMessage target = null;
            target = (com.cdiscount.www.ProductIntegrationReportMessage)get_store().find_element_user(PRODUCTINTEGRATIONREPORTMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductIntegrationReportMessage)get_store().add_element_user(PRODUCTINTEGRATIONREPORTMESSAGE$0);
            }
            target.setNil();
        }
    }
}
