/*
 * An XML document type.
 * Localname: VariationDescription
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.VariationDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one VariationDescription(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class VariationDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.VariationDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public VariationDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VARIATIONDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "VariationDescription");
    
    
    /**
     * Gets the "VariationDescription" element
     */
    public com.cdiscount.www.VariationDescription getVariationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.VariationDescription target = null;
            target = (com.cdiscount.www.VariationDescription)get_store().find_element_user(VARIATIONDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "VariationDescription" element
     */
    public boolean isNilVariationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.VariationDescription target = null;
            target = (com.cdiscount.www.VariationDescription)get_store().find_element_user(VARIATIONDESCRIPTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "VariationDescription" element
     */
    public void setVariationDescription(com.cdiscount.www.VariationDescription variationDescription)
    {
        generatedSetterHelperImpl(variationDescription, VARIATIONDESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "VariationDescription" element
     */
    public com.cdiscount.www.VariationDescription addNewVariationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.VariationDescription target = null;
            target = (com.cdiscount.www.VariationDescription)get_store().add_element_user(VARIATIONDESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "VariationDescription" element
     */
    public void setNilVariationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.VariationDescription target = null;
            target = (com.cdiscount.www.VariationDescription)get_store().find_element_user(VARIATIONDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.VariationDescription)get_store().add_element_user(VARIATIONDESCRIPTION$0);
            }
            target.setNil();
        }
    }
}
