/*
 * XML Type:  CategoryTree
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.CategoryTree
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML CategoryTree(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class CategoryTreeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.CategoryTree
{
    private static final long serialVersionUID = 1L;
    
    public CategoryTreeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALLOWOFFERINTEGRATION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "AllowOfferIntegration");
    private static final javax.xml.namespace.QName ALLOWPRODUCTINTEGRATION$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "AllowProductIntegration");
    private static final javax.xml.namespace.QName CHILDRENCATEGORYLIST$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ChildrenCategoryList");
    private static final javax.xml.namespace.QName CODE$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Code");
    private static final javax.xml.namespace.QName NAME$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Name");
    
    
    /**
     * Gets the "AllowOfferIntegration" element
     */
    public boolean getAllowOfferIntegration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLOWOFFERINTEGRATION$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "AllowOfferIntegration" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAllowOfferIntegration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ALLOWOFFERINTEGRATION$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "AllowOfferIntegration" element
     */
    public boolean isSetAllowOfferIntegration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLOWOFFERINTEGRATION$0) != 0;
        }
    }
    
    /**
     * Sets the "AllowOfferIntegration" element
     */
    public void setAllowOfferIntegration(boolean allowOfferIntegration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLOWOFFERINTEGRATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALLOWOFFERINTEGRATION$0);
            }
            target.setBooleanValue(allowOfferIntegration);
        }
    }
    
    /**
     * Sets (as xml) the "AllowOfferIntegration" element
     */
    public void xsetAllowOfferIntegration(org.apache.xmlbeans.XmlBoolean allowOfferIntegration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ALLOWOFFERINTEGRATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ALLOWOFFERINTEGRATION$0);
            }
            target.set(allowOfferIntegration);
        }
    }
    
    /**
     * Unsets the "AllowOfferIntegration" element
     */
    public void unsetAllowOfferIntegration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLOWOFFERINTEGRATION$0, 0);
        }
    }
    
    /**
     * Gets the "AllowProductIntegration" element
     */
    public boolean getAllowProductIntegration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLOWPRODUCTINTEGRATION$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "AllowProductIntegration" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAllowProductIntegration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ALLOWPRODUCTINTEGRATION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "AllowProductIntegration" element
     */
    public boolean isSetAllowProductIntegration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLOWPRODUCTINTEGRATION$2) != 0;
        }
    }
    
    /**
     * Sets the "AllowProductIntegration" element
     */
    public void setAllowProductIntegration(boolean allowProductIntegration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLOWPRODUCTINTEGRATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALLOWPRODUCTINTEGRATION$2);
            }
            target.setBooleanValue(allowProductIntegration);
        }
    }
    
    /**
     * Sets (as xml) the "AllowProductIntegration" element
     */
    public void xsetAllowProductIntegration(org.apache.xmlbeans.XmlBoolean allowProductIntegration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ALLOWPRODUCTINTEGRATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ALLOWPRODUCTINTEGRATION$2);
            }
            target.set(allowProductIntegration);
        }
    }
    
    /**
     * Unsets the "AllowProductIntegration" element
     */
    public void unsetAllowProductIntegration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLOWPRODUCTINTEGRATION$2, 0);
        }
    }
    
    /**
     * Gets the "ChildrenCategoryList" element
     */
    public com.cdiscount.www.ArrayOfCategoryTree getChildrenCategoryList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfCategoryTree target = null;
            target = (com.cdiscount.www.ArrayOfCategoryTree)get_store().find_element_user(CHILDRENCATEGORYLIST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ChildrenCategoryList" element
     */
    public boolean isNilChildrenCategoryList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfCategoryTree target = null;
            target = (com.cdiscount.www.ArrayOfCategoryTree)get_store().find_element_user(CHILDRENCATEGORYLIST$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ChildrenCategoryList" element
     */
    public boolean isSetChildrenCategoryList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHILDRENCATEGORYLIST$4) != 0;
        }
    }
    
    /**
     * Sets the "ChildrenCategoryList" element
     */
    public void setChildrenCategoryList(com.cdiscount.www.ArrayOfCategoryTree childrenCategoryList)
    {
        generatedSetterHelperImpl(childrenCategoryList, CHILDRENCATEGORYLIST$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ChildrenCategoryList" element
     */
    public com.cdiscount.www.ArrayOfCategoryTree addNewChildrenCategoryList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfCategoryTree target = null;
            target = (com.cdiscount.www.ArrayOfCategoryTree)get_store().add_element_user(CHILDRENCATEGORYLIST$4);
            return target;
        }
    }
    
    /**
     * Nils the "ChildrenCategoryList" element
     */
    public void setNilChildrenCategoryList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfCategoryTree target = null;
            target = (com.cdiscount.www.ArrayOfCategoryTree)get_store().find_element_user(CHILDRENCATEGORYLIST$4, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfCategoryTree)get_store().add_element_user(CHILDRENCATEGORYLIST$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ChildrenCategoryList" element
     */
    public void unsetChildrenCategoryList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHILDRENCATEGORYLIST$4, 0);
        }
    }
    
    /**
     * Gets the "Code" element
     */
    public java.lang.String getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Code" element
     */
    public org.apache.xmlbeans.XmlString xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Code" element
     */
    public boolean isNilCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Code" element
     */
    public boolean isSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODE$6) != 0;
        }
    }
    
    /**
     * Sets the "Code" element
     */
    public void setCode(java.lang.String code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$6);
            }
            target.setStringValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "Code" element
     */
    public void xsetCode(org.apache.xmlbeans.XmlString code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODE$6);
            }
            target.set(code);
        }
    }
    
    /**
     * Nils the "Code" element
     */
    public void setNilCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODE$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Code" element
     */
    public void unsetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODE$6, 0);
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Name" element
     */
    public boolean isNilName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$8) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$8);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$8);
            }
            target.set(name);
        }
    }
    
    /**
     * Nils the "Name" element
     */
    public void setNilName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$8, 0);
        }
    }
}
