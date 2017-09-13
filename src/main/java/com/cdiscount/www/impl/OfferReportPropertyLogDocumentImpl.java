/*
 * An XML document type.
 * Localname: OfferReportPropertyLog
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferReportPropertyLogDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one OfferReportPropertyLog(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class OfferReportPropertyLogDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferReportPropertyLogDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfferReportPropertyLogDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERREPORTPROPERTYLOG$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferReportPropertyLog");
    
    
    /**
     * Gets the "OfferReportPropertyLog" element
     */
    public com.cdiscount.www.OfferReportPropertyLog getOfferReportPropertyLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferReportPropertyLog target = null;
            target = (com.cdiscount.www.OfferReportPropertyLog)get_store().find_element_user(OFFERREPORTPROPERTYLOG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferReportPropertyLog" element
     */
    public boolean isNilOfferReportPropertyLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferReportPropertyLog target = null;
            target = (com.cdiscount.www.OfferReportPropertyLog)get_store().find_element_user(OFFERREPORTPROPERTYLOG$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OfferReportPropertyLog" element
     */
    public void setOfferReportPropertyLog(com.cdiscount.www.OfferReportPropertyLog offerReportPropertyLog)
    {
        generatedSetterHelperImpl(offerReportPropertyLog, OFFERREPORTPROPERTYLOG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OfferReportPropertyLog" element
     */
    public com.cdiscount.www.OfferReportPropertyLog addNewOfferReportPropertyLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferReportPropertyLog target = null;
            target = (com.cdiscount.www.OfferReportPropertyLog)get_store().add_element_user(OFFERREPORTPROPERTYLOG$0);
            return target;
        }
    }
    
    /**
     * Nils the "OfferReportPropertyLog" element
     */
    public void setNilOfferReportPropertyLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferReportPropertyLog target = null;
            target = (com.cdiscount.www.OfferReportPropertyLog)get_store().find_element_user(OFFERREPORTPROPERTYLOG$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferReportPropertyLog)get_store().add_element_user(OFFERREPORTPROPERTYLOG$0);
            }
            target.setNil();
        }
    }
}
