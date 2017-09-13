/*
 * An XML document type.
 * Localname: ParcelActionResult
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ParcelActionResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ParcelActionResult(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ParcelActionResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ParcelActionResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParcelActionResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARCELACTIONRESULT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ParcelActionResult");
    
    
    /**
     * Gets the "ParcelActionResult" element
     */
    public com.cdiscount.www.ParcelActionResult getParcelActionResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelActionResult target = null;
            target = (com.cdiscount.www.ParcelActionResult)get_store().find_element_user(PARCELACTIONRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ParcelActionResult" element
     */
    public boolean isNilParcelActionResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelActionResult target = null;
            target = (com.cdiscount.www.ParcelActionResult)get_store().find_element_user(PARCELACTIONRESULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ParcelActionResult" element
     */
    public void setParcelActionResult(com.cdiscount.www.ParcelActionResult parcelActionResult)
    {
        generatedSetterHelperImpl(parcelActionResult, PARCELACTIONRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ParcelActionResult" element
     */
    public com.cdiscount.www.ParcelActionResult addNewParcelActionResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelActionResult target = null;
            target = (com.cdiscount.www.ParcelActionResult)get_store().add_element_user(PARCELACTIONRESULT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ParcelActionResult" element
     */
    public void setNilParcelActionResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelActionResult target = null;
            target = (com.cdiscount.www.ParcelActionResult)get_store().find_element_user(PARCELACTIONRESULT$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ParcelActionResult)get_store().add_element_user(PARCELACTIONRESULT$0);
            }
            target.setNil();
        }
    }
}
