/*
 * An XML document type.
 * Localname: CloseDiscussionResult
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.CloseDiscussionResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one CloseDiscussionResult(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class CloseDiscussionResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CloseDiscussionResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public CloseDiscussionResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSEDISCUSSIONRESULT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CloseDiscussionResult");
    
    
    /**
     * Gets the "CloseDiscussionResult" element
     */
    public com.cdiscount.www.CloseDiscussionResult getCloseDiscussionResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionResult target = null;
            target = (com.cdiscount.www.CloseDiscussionResult)get_store().find_element_user(CLOSEDISCUSSIONRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CloseDiscussionResult" element
     */
    public boolean isNilCloseDiscussionResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionResult target = null;
            target = (com.cdiscount.www.CloseDiscussionResult)get_store().find_element_user(CLOSEDISCUSSIONRESULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CloseDiscussionResult" element
     */
    public void setCloseDiscussionResult(com.cdiscount.www.CloseDiscussionResult closeDiscussionResult)
    {
        generatedSetterHelperImpl(closeDiscussionResult, CLOSEDISCUSSIONRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CloseDiscussionResult" element
     */
    public com.cdiscount.www.CloseDiscussionResult addNewCloseDiscussionResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionResult target = null;
            target = (com.cdiscount.www.CloseDiscussionResult)get_store().add_element_user(CLOSEDISCUSSIONRESULT$0);
            return target;
        }
    }
    
    /**
     * Nils the "CloseDiscussionResult" element
     */
    public void setNilCloseDiscussionResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.CloseDiscussionResult target = null;
            target = (com.cdiscount.www.CloseDiscussionResult)get_store().find_element_user(CLOSEDISCUSSIONRESULT$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.CloseDiscussionResult)get_store().add_element_user(CLOSEDISCUSSIONRESULT$0);
            }
            target.setNil();
        }
    }
}
