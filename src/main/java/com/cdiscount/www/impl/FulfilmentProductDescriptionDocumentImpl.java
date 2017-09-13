/*
 * An XML document type.
 * Localname: FulfilmentProductDescription
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentProductDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one FulfilmentProductDescription(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class FulfilmentProductDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.FulfilmentProductDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentProductDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULFILMENTPRODUCTDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FulfilmentProductDescription");
    
    
    /**
     * Gets the "FulfilmentProductDescription" element
     */
    public com.cdiscount.www.FulfilmentProductDescription getFulfilmentProductDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentProductDescription target = null;
            target = (com.cdiscount.www.FulfilmentProductDescription)get_store().find_element_user(FULFILMENTPRODUCTDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FulfilmentProductDescription" element
     */
    public boolean isNilFulfilmentProductDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentProductDescription target = null;
            target = (com.cdiscount.www.FulfilmentProductDescription)get_store().find_element_user(FULFILMENTPRODUCTDESCRIPTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FulfilmentProductDescription" element
     */
    public void setFulfilmentProductDescription(com.cdiscount.www.FulfilmentProductDescription fulfilmentProductDescription)
    {
        generatedSetterHelperImpl(fulfilmentProductDescription, FULFILMENTPRODUCTDESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FulfilmentProductDescription" element
     */
    public com.cdiscount.www.FulfilmentProductDescription addNewFulfilmentProductDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentProductDescription target = null;
            target = (com.cdiscount.www.FulfilmentProductDescription)get_store().add_element_user(FULFILMENTPRODUCTDESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "FulfilmentProductDescription" element
     */
    public void setNilFulfilmentProductDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.FulfilmentProductDescription target = null;
            target = (com.cdiscount.www.FulfilmentProductDescription)get_store().find_element_user(FULFILMENTPRODUCTDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.FulfilmentProductDescription)get_store().add_element_user(FULFILMENTPRODUCTDESCRIPTION$0);
            }
            target.setNil();
        }
    }
}
