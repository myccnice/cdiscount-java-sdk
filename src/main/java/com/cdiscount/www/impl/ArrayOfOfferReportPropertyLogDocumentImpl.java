/*
 * An XML document type.
 * Localname: ArrayOfOfferReportPropertyLog
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfOfferReportPropertyLogDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfOfferReportPropertyLog(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfOfferReportPropertyLogDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfOfferReportPropertyLogDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOfferReportPropertyLogDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFOFFERREPORTPROPERTYLOG$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfOfferReportPropertyLog");
    
    
    /**
     * Gets the "ArrayOfOfferReportPropertyLog" element
     */
    public com.cdiscount.www.ArrayOfOfferReportPropertyLog getArrayOfOfferReportPropertyLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferReportPropertyLog target = null;
            target = (com.cdiscount.www.ArrayOfOfferReportPropertyLog)get_store().find_element_user(ARRAYOFOFFERREPORTPROPERTYLOG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfOfferReportPropertyLog" element
     */
    public boolean isNilArrayOfOfferReportPropertyLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferReportPropertyLog target = null;
            target = (com.cdiscount.www.ArrayOfOfferReportPropertyLog)get_store().find_element_user(ARRAYOFOFFERREPORTPROPERTYLOG$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfOfferReportPropertyLog" element
     */
    public void setArrayOfOfferReportPropertyLog(com.cdiscount.www.ArrayOfOfferReportPropertyLog arrayOfOfferReportPropertyLog)
    {
        generatedSetterHelperImpl(arrayOfOfferReportPropertyLog, ARRAYOFOFFERREPORTPROPERTYLOG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfOfferReportPropertyLog" element
     */
    public com.cdiscount.www.ArrayOfOfferReportPropertyLog addNewArrayOfOfferReportPropertyLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferReportPropertyLog target = null;
            target = (com.cdiscount.www.ArrayOfOfferReportPropertyLog)get_store().add_element_user(ARRAYOFOFFERREPORTPROPERTYLOG$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfOfferReportPropertyLog" element
     */
    public void setNilArrayOfOfferReportPropertyLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferReportPropertyLog target = null;
            target = (com.cdiscount.www.ArrayOfOfferReportPropertyLog)get_store().find_element_user(ARRAYOFOFFERREPORTPROPERTYLOG$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfOfferReportPropertyLog)get_store().add_element_user(ARRAYOFOFFERREPORTPROPERTYLOG$0);
            }
            target.setNil();
        }
    }
}
