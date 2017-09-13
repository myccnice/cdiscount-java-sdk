/*
 * XML Type:  Product
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.Product
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML Product(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ProductImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.Product
{
    private static final long serialVersionUID = 1L;
    
    public ProductImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BRANDNAME$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "BrandName");
    private static final javax.xml.namespace.QName EANLIST$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "EANList");
    private static final javax.xml.namespace.QName ISBN$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ISBN");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Name");
    private static final javax.xml.namespace.QName PRODUCTTYPE$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductType");
    private static final javax.xml.namespace.QName SKU$10 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SKU");
    
    
    /**
     * Gets the "BrandName" element
     */
    public java.lang.String getBrandName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANDNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BrandName" element
     */
    public org.apache.xmlbeans.XmlString xgetBrandName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANDNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "BrandName" element
     */
    public boolean isNilBrandName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANDNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "BrandName" element
     */
    public boolean isSetBrandName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BRANDNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "BrandName" element
     */
    public void setBrandName(java.lang.String brandName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANDNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRANDNAME$0);
            }
            target.setStringValue(brandName);
        }
    }
    
    /**
     * Sets (as xml) the "BrandName" element
     */
    public void xsetBrandName(org.apache.xmlbeans.XmlString brandName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANDNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BRANDNAME$0);
            }
            target.set(brandName);
        }
    }
    
    /**
     * Nils the "BrandName" element
     */
    public void setNilBrandName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANDNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BRANDNAME$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "BrandName" element
     */
    public void unsetBrandName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BRANDNAME$0, 0);
        }
    }
    
    /**
     * Gets the "EANList" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getEANList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(EANLIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "EANList" element
     */
    public boolean isNilEANList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(EANLIST$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EANList" element
     */
    public boolean isSetEANList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EANLIST$2) != 0;
        }
    }
    
    /**
     * Sets the "EANList" element
     */
    public void setEANList(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring eanList)
    {
        generatedSetterHelperImpl(eanList, EANLIST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EANList" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewEANList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(EANLIST$2);
            return target;
        }
    }
    
    /**
     * Nils the "EANList" element
     */
    public void setNilEANList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(EANLIST$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(EANLIST$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EANList" element
     */
    public void unsetEANList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EANLIST$2, 0);
        }
    }
    
    /**
     * Gets the "ISBN" element
     */
    public java.lang.String getISBN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISBN$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ISBN" element
     */
    public org.apache.xmlbeans.XmlString xgetISBN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISBN$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ISBN" element
     */
    public boolean isNilISBN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISBN$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ISBN" element
     */
    public boolean isSetISBN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISBN$4) != 0;
        }
    }
    
    /**
     * Sets the "ISBN" element
     */
    public void setISBN(java.lang.String isbn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISBN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISBN$4);
            }
            target.setStringValue(isbn);
        }
    }
    
    /**
     * Sets (as xml) the "ISBN" element
     */
    public void xsetISBN(org.apache.xmlbeans.XmlString isbn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISBN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISBN$4);
            }
            target.set(isbn);
        }
    }
    
    /**
     * Nils the "ISBN" element
     */
    public void setNilISBN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISBN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISBN$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ISBN" element
     */
    public void unsetISBN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISBN$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$6, 0);
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
            return get_store().count_elements(NAME$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$6);
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
            get_store().remove_element(NAME$6, 0);
        }
    }
    
    /**
     * Gets the "ProductType" element
     */
    public com.cdiscount.www.ProductTypeEnum.Enum getProductType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.ProductTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductType" element
     */
    public com.cdiscount.www.ProductTypeEnum xgetProductType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductTypeEnum target = null;
            target = (com.cdiscount.www.ProductTypeEnum)get_store().find_element_user(PRODUCTTYPE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ProductType" element
     */
    public boolean isSetProductType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTTYPE$8) != 0;
        }
    }
    
    /**
     * Sets the "ProductType" element
     */
    public void setProductType(com.cdiscount.www.ProductTypeEnum.Enum productType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTTYPE$8);
            }
            target.setEnumValue(productType);
        }
    }
    
    /**
     * Sets (as xml) the "ProductType" element
     */
    public void xsetProductType(com.cdiscount.www.ProductTypeEnum productType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductTypeEnum target = null;
            target = (com.cdiscount.www.ProductTypeEnum)get_store().find_element_user(PRODUCTTYPE$8, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductTypeEnum)get_store().add_element_user(PRODUCTTYPE$8);
            }
            target.set(productType);
        }
    }
    
    /**
     * Unsets the "ProductType" element
     */
    public void unsetProductType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTTYPE$8, 0);
        }
    }
    
    /**
     * Gets the "SKU" element
     */
    public java.lang.String getSKU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKU$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SKU" element
     */
    public org.apache.xmlbeans.XmlString xgetSKU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKU$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SKU" element
     */
    public boolean isNilSKU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKU$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SKU" element
     */
    public boolean isSetSKU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SKU$10) != 0;
        }
    }
    
    /**
     * Sets the "SKU" element
     */
    public void setSKU(java.lang.String sku)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKU$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SKU$10);
            }
            target.setStringValue(sku);
        }
    }
    
    /**
     * Sets (as xml) the "SKU" element
     */
    public void xsetSKU(org.apache.xmlbeans.XmlString sku)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKU$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SKU$10);
            }
            target.set(sku);
        }
    }
    
    /**
     * Nils the "SKU" element
     */
    public void setNilSKU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKU$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SKU$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SKU" element
     */
    public void unsetSKU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SKU$10, 0);
        }
    }
}
