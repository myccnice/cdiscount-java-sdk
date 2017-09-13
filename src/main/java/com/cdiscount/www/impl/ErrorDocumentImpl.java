/*
 * An XML document type.
 * Localname: Error
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ErrorDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one Error(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ErrorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ErrorDocument
{
    private static final long serialVersionUID = 1L;
    
    public ErrorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERROR$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Error");
    
    
    /**
     * Gets the "Error" element
     */
    public com.cdiscount.www.Error getError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Error target = null;
            target = (com.cdiscount.www.Error)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Error" element
     */
    public boolean isNilError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Error target = null;
            target = (com.cdiscount.www.Error)get_store().find_element_user(ERROR$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Error" element
     */
    public void setError(com.cdiscount.www.Error error)
    {
        generatedSetterHelperImpl(error, ERROR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Error" element
     */
    public com.cdiscount.www.Error addNewError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Error target = null;
            target = (com.cdiscount.www.Error)get_store().add_element_user(ERROR$0);
            return target;
        }
    }
    
    /**
     * Nils the "Error" element
     */
    public void setNilError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Error target = null;
            target = (com.cdiscount.www.Error)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.Error)get_store().add_element_user(ERROR$0);
            }
            target.setNil();
        }
    }
}
