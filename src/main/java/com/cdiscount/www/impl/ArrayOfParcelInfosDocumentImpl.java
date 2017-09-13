/*
 * An XML document type.
 * Localname: ArrayOfParcelInfos
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfParcelInfosDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfParcelInfos(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfParcelInfosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfParcelInfosDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfParcelInfosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFPARCELINFOS$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfParcelInfos");
    
    
    /**
     * Gets the "ArrayOfParcelInfos" element
     */
    public com.cdiscount.www.ArrayOfParcelInfos getArrayOfParcelInfos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelInfos target = null;
            target = (com.cdiscount.www.ArrayOfParcelInfos)get_store().find_element_user(ARRAYOFPARCELINFOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfParcelInfos" element
     */
    public boolean isNilArrayOfParcelInfos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelInfos target = null;
            target = (com.cdiscount.www.ArrayOfParcelInfos)get_store().find_element_user(ARRAYOFPARCELINFOS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfParcelInfos" element
     */
    public void setArrayOfParcelInfos(com.cdiscount.www.ArrayOfParcelInfos arrayOfParcelInfos)
    {
        generatedSetterHelperImpl(arrayOfParcelInfos, ARRAYOFPARCELINFOS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfParcelInfos" element
     */
    public com.cdiscount.www.ArrayOfParcelInfos addNewArrayOfParcelInfos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelInfos target = null;
            target = (com.cdiscount.www.ArrayOfParcelInfos)get_store().add_element_user(ARRAYOFPARCELINFOS$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfParcelInfos" element
     */
    public void setNilArrayOfParcelInfos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfParcelInfos target = null;
            target = (com.cdiscount.www.ArrayOfParcelInfos)get_store().find_element_user(ARRAYOFPARCELINFOS$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfParcelInfos)get_store().add_element_user(ARRAYOFPARCELINFOS$0);
            }
            target.setNil();
        }
    }
}
