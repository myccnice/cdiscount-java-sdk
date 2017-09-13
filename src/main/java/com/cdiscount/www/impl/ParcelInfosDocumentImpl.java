/*
 * An XML document type.
 * Localname: ParcelInfos
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ParcelInfosDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ParcelInfos(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ParcelInfosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ParcelInfosDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParcelInfosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARCELINFOS$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ParcelInfos");
    
    
    /**
     * Gets the "ParcelInfos" element
     */
    public com.cdiscount.www.ParcelInfos getParcelInfos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelInfos target = null;
            target = (com.cdiscount.www.ParcelInfos)get_store().find_element_user(PARCELINFOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ParcelInfos" element
     */
    public boolean isNilParcelInfos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelInfos target = null;
            target = (com.cdiscount.www.ParcelInfos)get_store().find_element_user(PARCELINFOS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ParcelInfos" element
     */
    public void setParcelInfos(com.cdiscount.www.ParcelInfos parcelInfos)
    {
        generatedSetterHelperImpl(parcelInfos, PARCELINFOS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ParcelInfos" element
     */
    public com.cdiscount.www.ParcelInfos addNewParcelInfos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelInfos target = null;
            target = (com.cdiscount.www.ParcelInfos)get_store().add_element_user(PARCELINFOS$0);
            return target;
        }
    }
    
    /**
     * Nils the "ParcelInfos" element
     */
    public void setNilParcelInfos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ParcelInfos target = null;
            target = (com.cdiscount.www.ParcelInfos)get_store().find_element_user(PARCELINFOS$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ParcelInfos)get_store().add_element_user(PARCELINFOS$0);
            }
            target.setNil();
        }
    }
}
