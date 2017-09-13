/*
 * An XML document type.
 * Localname: ArrayOfProductReportPropertyLog
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfProductReportPropertyLogDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfProductReportPropertyLog(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfProductReportPropertyLogDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfProductReportPropertyLogDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfProductReportPropertyLogDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFPRODUCTREPORTPROPERTYLOG$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfProductReportPropertyLog");
    
    
    /**
     * Gets the "ArrayOfProductReportPropertyLog" element
     */
    public com.cdiscount.www.ArrayOfProductReportPropertyLog getArrayOfProductReportPropertyLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductReportPropertyLog target = null;
            target = (com.cdiscount.www.ArrayOfProductReportPropertyLog)get_store().find_element_user(ARRAYOFPRODUCTREPORTPROPERTYLOG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfProductReportPropertyLog" element
     */
    public boolean isNilArrayOfProductReportPropertyLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductReportPropertyLog target = null;
            target = (com.cdiscount.www.ArrayOfProductReportPropertyLog)get_store().find_element_user(ARRAYOFPRODUCTREPORTPROPERTYLOG$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfProductReportPropertyLog" element
     */
    public void setArrayOfProductReportPropertyLog(com.cdiscount.www.ArrayOfProductReportPropertyLog arrayOfProductReportPropertyLog)
    {
        generatedSetterHelperImpl(arrayOfProductReportPropertyLog, ARRAYOFPRODUCTREPORTPROPERTYLOG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfProductReportPropertyLog" element
     */
    public com.cdiscount.www.ArrayOfProductReportPropertyLog addNewArrayOfProductReportPropertyLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductReportPropertyLog target = null;
            target = (com.cdiscount.www.ArrayOfProductReportPropertyLog)get_store().add_element_user(ARRAYOFPRODUCTREPORTPROPERTYLOG$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfProductReportPropertyLog" element
     */
    public void setNilArrayOfProductReportPropertyLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductReportPropertyLog target = null;
            target = (com.cdiscount.www.ArrayOfProductReportPropertyLog)get_store().find_element_user(ARRAYOFPRODUCTREPORTPROPERTYLOG$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfProductReportPropertyLog)get_store().add_element_user(ARRAYOFPRODUCTREPORTPROPERTYLOG$0);
            }
            target.setNil();
        }
    }
}
