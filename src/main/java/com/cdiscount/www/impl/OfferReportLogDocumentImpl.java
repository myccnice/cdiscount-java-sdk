/*
 * An XML document type.
 * Localname: OfferReportLog
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferReportLogDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OfferReportLog(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OfferReportLogDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferReportLogDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfferReportLogDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERREPORTLOG$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferReportLog");
    
    
    /**
     * Gets the "OfferReportLog" element
     */
    public com.cdiscount.www.OfferReportLog getOfferReportLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferReportLog target = null;
            target = (com.cdiscount.www.OfferReportLog)get_store().find_element_user(OFFERREPORTLOG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferReportLog" element
     */
    public boolean isNilOfferReportLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferReportLog target = null;
            target = (com.cdiscount.www.OfferReportLog)get_store().find_element_user(OFFERREPORTLOG$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OfferReportLog" element
     */
    public void setOfferReportLog(com.cdiscount.www.OfferReportLog offerReportLog)
    {
        generatedSetterHelperImpl(offerReportLog, OFFERREPORTLOG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OfferReportLog" element
     */
    public com.cdiscount.www.OfferReportLog addNewOfferReportLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferReportLog target = null;
            target = (com.cdiscount.www.OfferReportLog)get_store().add_element_user(OFFERREPORTLOG$0);
            return target;
        }
    }
    
    /**
     * Nils the "OfferReportLog" element
     */
    public void setNilOfferReportLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferReportLog target = null;
            target = (com.cdiscount.www.OfferReportLog)get_store().find_element_user(OFFERREPORTLOG$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferReportLog)get_store().add_element_user(OFFERREPORTLOG$0);
            }
            target.setNil();
        }
    }
}
