/*
 * XML Type:  CloseDiscussionResultMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.CloseDiscussionResultMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML CloseDiscussionResultMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class CloseDiscussionResultMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.CloseDiscussionResultMessage
{
    private static final long serialVersionUID = 1L;
    
    public CloseDiscussionResultMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSEDISCUSSIONRESULTLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CloseDiscussionResultList");
    
    
    /**
     * Gets the "CloseDiscussionResultList" element
     */
    public com.cdiscount.www.ArrayOfCloseDiscussionResult getCloseDiscussionResultList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfCloseDiscussionResult target = null;
            target = (com.cdiscount.www.ArrayOfCloseDiscussionResult)get_store().find_element_user(CLOSEDISCUSSIONRESULTLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CloseDiscussionResultList" element
     */
    public boolean isNilCloseDiscussionResultList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfCloseDiscussionResult target = null;
            target = (com.cdiscount.www.ArrayOfCloseDiscussionResult)get_store().find_element_user(CLOSEDISCUSSIONRESULTLIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CloseDiscussionResultList" element
     */
    public boolean isSetCloseDiscussionResultList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLOSEDISCUSSIONRESULTLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "CloseDiscussionResultList" element
     */
    public void setCloseDiscussionResultList(com.cdiscount.www.ArrayOfCloseDiscussionResult closeDiscussionResultList)
    {
        generatedSetterHelperImpl(closeDiscussionResultList, CLOSEDISCUSSIONRESULTLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CloseDiscussionResultList" element
     */
    public com.cdiscount.www.ArrayOfCloseDiscussionResult addNewCloseDiscussionResultList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfCloseDiscussionResult target = null;
            target = (com.cdiscount.www.ArrayOfCloseDiscussionResult)get_store().add_element_user(CLOSEDISCUSSIONRESULTLIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "CloseDiscussionResultList" element
     */
    public void setNilCloseDiscussionResultList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfCloseDiscussionResult target = null;
            target = (com.cdiscount.www.ArrayOfCloseDiscussionResult)get_store().find_element_user(CLOSEDISCUSSIONRESULTLIST$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfCloseDiscussionResult)get_store().add_element_user(CLOSEDISCUSSIONRESULTLIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CloseDiscussionResultList" element
     */
    public void unsetCloseDiscussionResultList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLOSEDISCUSSIONRESULTLIST$0, 0);
        }
    }
}
