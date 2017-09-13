/*
 * An XML document type.
 * Localname: ArrayOfProductReportLog
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfProductReportLogDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfProductReportLog(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfProductReportLogDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfProductReportLogDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfProductReportLogDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFPRODUCTREPORTLOG$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfProductReportLog");
    
    
    /**
     * Gets the "ArrayOfProductReportLog" element
     */
    public com.cdiscount.www.ArrayOfProductReportLog getArrayOfProductReportLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductReportLog target = null;
            target = (com.cdiscount.www.ArrayOfProductReportLog)get_store().find_element_user(ARRAYOFPRODUCTREPORTLOG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfProductReportLog" element
     */
    public boolean isNilArrayOfProductReportLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductReportLog target = null;
            target = (com.cdiscount.www.ArrayOfProductReportLog)get_store().find_element_user(ARRAYOFPRODUCTREPORTLOG$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfProductReportLog" element
     */
    public void setArrayOfProductReportLog(com.cdiscount.www.ArrayOfProductReportLog arrayOfProductReportLog)
    {
        generatedSetterHelperImpl(arrayOfProductReportLog, ARRAYOFPRODUCTREPORTLOG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfProductReportLog" element
     */
    public com.cdiscount.www.ArrayOfProductReportLog addNewArrayOfProductReportLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductReportLog target = null;
            target = (com.cdiscount.www.ArrayOfProductReportLog)get_store().add_element_user(ARRAYOFPRODUCTREPORTLOG$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfProductReportLog" element
     */
    public void setNilArrayOfProductReportLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfProductReportLog target = null;
            target = (com.cdiscount.www.ArrayOfProductReportLog)get_store().find_element_user(ARRAYOFPRODUCTREPORTLOG$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfProductReportLog)get_store().add_element_user(ARRAYOFPRODUCTREPORTLOG$0);
            }
            target.setNil();
        }
    }
}
