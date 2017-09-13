/*
 * An XML document type.
 * Localname: DiscountComponent
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.DiscountComponentDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one DiscountComponent(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class DiscountComponentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.DiscountComponentDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiscountComponentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCOUNTCOMPONENT$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DiscountComponent");
    
    
    /**
     * Gets the "DiscountComponent" element
     */
    public com.cdiscount.www.DiscountComponent getDiscountComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscountComponent target = null;
            target = (com.cdiscount.www.DiscountComponent)get_store().find_element_user(DISCOUNTCOMPONENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DiscountComponent" element
     */
    public boolean isNilDiscountComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscountComponent target = null;
            target = (com.cdiscount.www.DiscountComponent)get_store().find_element_user(DISCOUNTCOMPONENT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DiscountComponent" element
     */
    public void setDiscountComponent(com.cdiscount.www.DiscountComponent discountComponent)
    {
        generatedSetterHelperImpl(discountComponent, DISCOUNTCOMPONENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DiscountComponent" element
     */
    public com.cdiscount.www.DiscountComponent addNewDiscountComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscountComponent target = null;
            target = (com.cdiscount.www.DiscountComponent)get_store().add_element_user(DISCOUNTCOMPONENT$0);
            return target;
        }
    }
    
    /**
     * Nils the "DiscountComponent" element
     */
    public void setNilDiscountComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.DiscountComponent target = null;
            target = (com.cdiscount.www.DiscountComponent)get_store().find_element_user(DISCOUNTCOMPONENT$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.DiscountComponent)get_store().add_element_user(DISCOUNTCOMPONENT$0);
            }
            target.setNil();
        }
    }
}
