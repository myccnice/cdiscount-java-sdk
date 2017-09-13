/*
 * An XML document type.
 * Localname: ArrayOfOfferReportLog
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfOfferReportLogDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfOfferReportLog(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfOfferReportLogDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfOfferReportLogDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOfferReportLogDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFOFFERREPORTLOG$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfOfferReportLog");
    
    
    /**
     * Gets the "ArrayOfOfferReportLog" element
     */
    public com.cdiscount.www.ArrayOfOfferReportLog getArrayOfOfferReportLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferReportLog target = null;
            target = (com.cdiscount.www.ArrayOfOfferReportLog)get_store().find_element_user(ARRAYOFOFFERREPORTLOG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfOfferReportLog" element
     */
    public boolean isNilArrayOfOfferReportLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferReportLog target = null;
            target = (com.cdiscount.www.ArrayOfOfferReportLog)get_store().find_element_user(ARRAYOFOFFERREPORTLOG$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfOfferReportLog" element
     */
    public void setArrayOfOfferReportLog(com.cdiscount.www.ArrayOfOfferReportLog arrayOfOfferReportLog)
    {
        generatedSetterHelperImpl(arrayOfOfferReportLog, ARRAYOFOFFERREPORTLOG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfOfferReportLog" element
     */
    public com.cdiscount.www.ArrayOfOfferReportLog addNewArrayOfOfferReportLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferReportLog target = null;
            target = (com.cdiscount.www.ArrayOfOfferReportLog)get_store().add_element_user(ARRAYOFOFFERREPORTLOG$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfOfferReportLog" element
     */
    public void setNilArrayOfOfferReportLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferReportLog target = null;
            target = (com.cdiscount.www.ArrayOfOfferReportLog)get_store().find_element_user(ARRAYOFOFFERREPORTLOG$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfOfferReportLog)get_store().add_element_user(ARRAYOFOFFERREPORTLOG$0);
            }
            target.setNil();
        }
    }
}
