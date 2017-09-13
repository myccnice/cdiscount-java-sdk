/*
 * An XML document type.
 * Localname: ArrayOfDiscussionMail
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfDiscussionMailDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ArrayOfDiscussionMail(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ArrayOfDiscussionMailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfDiscussionMailDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfDiscussionMailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFDISCUSSIONMAIL$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ArrayOfDiscussionMail");
    
    
    /**
     * Gets the "ArrayOfDiscussionMail" element
     */
    public com.cdiscount.www.ArrayOfDiscussionMail getArrayOfDiscussionMail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDiscussionMail target = null;
            target = (com.cdiscount.www.ArrayOfDiscussionMail)get_store().find_element_user(ARRAYOFDISCUSSIONMAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfDiscussionMail" element
     */
    public boolean isNilArrayOfDiscussionMail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDiscussionMail target = null;
            target = (com.cdiscount.www.ArrayOfDiscussionMail)get_store().find_element_user(ARRAYOFDISCUSSIONMAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfDiscussionMail" element
     */
    public void setArrayOfDiscussionMail(com.cdiscount.www.ArrayOfDiscussionMail arrayOfDiscussionMail)
    {
        generatedSetterHelperImpl(arrayOfDiscussionMail, ARRAYOFDISCUSSIONMAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfDiscussionMail" element
     */
    public com.cdiscount.www.ArrayOfDiscussionMail addNewArrayOfDiscussionMail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDiscussionMail target = null;
            target = (com.cdiscount.www.ArrayOfDiscussionMail)get_store().add_element_user(ARRAYOFDISCUSSIONMAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfDiscussionMail" element
     */
    public void setNilArrayOfDiscussionMail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDiscussionMail target = null;
            target = (com.cdiscount.www.ArrayOfDiscussionMail)get_store().find_element_user(ARRAYOFDISCUSSIONMAIL$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfDiscussionMail)get_store().add_element_user(ARRAYOFDISCUSSIONMAIL$0);
            }
            target.setNil();
        }
    }
}
