/*
 * XML Type:  OfferQuestionFilter
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferQuestionFilter
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML OfferQuestionFilter(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class OfferQuestionFilterImpl extends com.cdiscount.www.impl.DiscussionFilterBaseImpl implements com.cdiscount.www.OfferQuestionFilter
{
    private static final long serialVersionUID = 1L;
    
    public OfferQuestionFilterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTEANLIST$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductEANList");
    private static final javax.xml.namespace.QName PRODUCTSELLERREFERENCELIST$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductSellerReferenceList");
    
    
    /**
     * Gets the "ProductEANList" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getProductEANList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(PRODUCTEANLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductEANList" element
     */
    public boolean isNilProductEANList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(PRODUCTEANLIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ProductEANList" element
     */
    public boolean isSetProductEANList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTEANLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "ProductEANList" element
     */
    public void setProductEANList(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring productEANList)
    {
        generatedSetterHelperImpl(productEANList, PRODUCTEANLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductEANList" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewProductEANList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(PRODUCTEANLIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "ProductEANList" element
     */
    public void setNilProductEANList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(PRODUCTEANLIST$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(PRODUCTEANLIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ProductEANList" element
     */
    public void unsetProductEANList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTEANLIST$0, 0);
        }
    }
    
    /**
     * Gets the "ProductSellerReferenceList" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getProductSellerReferenceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(PRODUCTSELLERREFERENCELIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductSellerReferenceList" element
     */
    public boolean isNilProductSellerReferenceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(PRODUCTSELLERREFERENCELIST$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ProductSellerReferenceList" element
     */
    public boolean isSetProductSellerReferenceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTSELLERREFERENCELIST$2) != 0;
        }
    }
    
    /**
     * Sets the "ProductSellerReferenceList" element
     */
    public void setProductSellerReferenceList(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring productSellerReferenceList)
    {
        generatedSetterHelperImpl(productSellerReferenceList, PRODUCTSELLERREFERENCELIST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductSellerReferenceList" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewProductSellerReferenceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(PRODUCTSELLERREFERENCELIST$2);
            return target;
        }
    }
    
    /**
     * Nils the "ProductSellerReferenceList" element
     */
    public void setNilProductSellerReferenceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(PRODUCTSELLERREFERENCELIST$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(PRODUCTSELLERREFERENCELIST$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ProductSellerReferenceList" element
     */
    public void unsetProductSellerReferenceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTSELLERREFERENCELIST$2, 0);
        }
    }
}
