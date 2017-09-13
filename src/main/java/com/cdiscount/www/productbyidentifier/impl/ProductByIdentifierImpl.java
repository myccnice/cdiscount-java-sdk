/*
 * XML Type:  ProductByIdentifier
 * Namespace: http://www.cdiscount.com/ProductByIdentifier
 * Java type: com.cdiscount.www.productbyidentifier.ProductByIdentifier
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.productbyidentifier.impl;
/**
 * An XML ProductByIdentifier(@http://www.cdiscount.com/ProductByIdentifier).
 *
 * This is a complex type.
 */
public class ProductByIdentifierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.productbyidentifier.ProductByIdentifier
{
    private static final long serialVersionUID = 1L;
    
    public ProductByIdentifierImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BRANDNAME$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com/ProductByIdentifier", "BrandName");
    private static final javax.xml.namespace.QName CATEGORYCODE$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com/ProductByIdentifier", "CategoryCode");
    private static final javax.xml.namespace.QName COLOR$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com/ProductByIdentifier", "Color");
    private static final javax.xml.namespace.QName EAN$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com/ProductByIdentifier", "Ean");
    private static final javax.xml.namespace.QName ERRORMESSAGE$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com/ProductByIdentifier", "ErrorMessage");
    private static final javax.xml.namespace.QName FATHERPRODUCTID$10 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com/ProductByIdentifier", "FatherProductId");
    private static final javax.xml.namespace.QName HASERROR$12 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com/ProductByIdentifier", "HasError");
    private static final javax.xml.namespace.QName IMAGEURL$14 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com/ProductByIdentifier", "ImageUrl");
    private static final javax.xml.namespace.QName NAME$16 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com/ProductByIdentifier", "Name");
    private static final javax.xml.namespace.QName PRODUCTTYPE$18 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com/ProductByIdentifier", "ProductType");
    private static final javax.xml.namespace.QName SIZE$20 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com/ProductByIdentifier", "Size");
    
    
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
     * Gets the "CategoryCode" element
     */
    public java.lang.String getCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CategoryCode" element
     */
    public org.apache.xmlbeans.XmlString xgetCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORYCODE$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CategoryCode" element
     */
    public boolean isNilCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORYCODE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CategoryCode" element
     */
    public boolean isSetCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "CategoryCode" element
     */
    public void setCategoryCode(java.lang.String categoryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORYCODE$2);
            }
            target.setStringValue(categoryCode);
        }
    }
    
    /**
     * Sets (as xml) the "CategoryCode" element
     */
    public void xsetCategoryCode(org.apache.xmlbeans.XmlString categoryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORYCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORYCODE$2);
            }
            target.set(categoryCode);
        }
    }
    
    /**
     * Nils the "CategoryCode" element
     */
    public void setNilCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORYCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORYCODE$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CategoryCode" element
     */
    public void unsetCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYCODE$2, 0);
        }
    }
    
    /**
     * Gets the "Color" element
     */
    public java.lang.String getColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLOR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Color" element
     */
    public org.apache.xmlbeans.XmlString xgetColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLOR$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Color" element
     */
    public boolean isNilColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLOR$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Color" element
     */
    public boolean isSetColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLOR$4) != 0;
        }
    }
    
    /**
     * Sets the "Color" element
     */
    public void setColor(java.lang.String color)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLOR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLOR$4);
            }
            target.setStringValue(color);
        }
    }
    
    /**
     * Sets (as xml) the "Color" element
     */
    public void xsetColor(org.apache.xmlbeans.XmlString color)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLOR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COLOR$4);
            }
            target.set(color);
        }
    }
    
    /**
     * Nils the "Color" element
     */
    public void setNilColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLOR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COLOR$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Color" element
     */
    public void unsetColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLOR$4, 0);
        }
    }
    
    /**
     * Gets the "Ean" element
     */
    public java.lang.String getEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EAN$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Ean" element
     */
    public org.apache.xmlbeans.XmlString xgetEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EAN$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Ean" element
     */
    public boolean isNilEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EAN$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Ean" element
     */
    public boolean isSetEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EAN$6) != 0;
        }
    }
    
    /**
     * Sets the "Ean" element
     */
    public void setEan(java.lang.String ean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EAN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EAN$6);
            }
            target.setStringValue(ean);
        }
    }
    
    /**
     * Sets (as xml) the "Ean" element
     */
    public void xsetEan(org.apache.xmlbeans.XmlString ean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EAN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EAN$6);
            }
            target.set(ean);
        }
    }
    
    /**
     * Nils the "Ean" element
     */
    public void setNilEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EAN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EAN$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Ean" element
     */
    public void unsetEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EAN$6, 0);
        }
    }
    
    /**
     * Gets the "ErrorMessage" element
     */
    public java.lang.String getErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORMESSAGE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORMESSAGE$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ErrorMessage" element
     */
    public boolean isNilErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORMESSAGE$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ErrorMessage" element
     */
    public boolean isSetErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORMESSAGE$8) != 0;
        }
    }
    
    /**
     * Sets the "ErrorMessage" element
     */
    public void setErrorMessage(java.lang.String errorMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORMESSAGE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORMESSAGE$8);
            }
            target.setStringValue(errorMessage);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorMessage" element
     */
    public void xsetErrorMessage(org.apache.xmlbeans.XmlString errorMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORMESSAGE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORMESSAGE$8);
            }
            target.set(errorMessage);
        }
    }
    
    /**
     * Nils the "ErrorMessage" element
     */
    public void setNilErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORMESSAGE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORMESSAGE$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ErrorMessage" element
     */
    public void unsetErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORMESSAGE$8, 0);
        }
    }
    
    /**
     * Gets the "FatherProductId" element
     */
    public java.lang.String getFatherProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FATHERPRODUCTID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FatherProductId" element
     */
    public org.apache.xmlbeans.XmlString xgetFatherProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FATHERPRODUCTID$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "FatherProductId" element
     */
    public boolean isNilFatherProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FATHERPRODUCTID$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "FatherProductId" element
     */
    public boolean isSetFatherProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FATHERPRODUCTID$10) != 0;
        }
    }
    
    /**
     * Sets the "FatherProductId" element
     */
    public void setFatherProductId(java.lang.String fatherProductId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FATHERPRODUCTID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FATHERPRODUCTID$10);
            }
            target.setStringValue(fatherProductId);
        }
    }
    
    /**
     * Sets (as xml) the "FatherProductId" element
     */
    public void xsetFatherProductId(org.apache.xmlbeans.XmlString fatherProductId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FATHERPRODUCTID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FATHERPRODUCTID$10);
            }
            target.set(fatherProductId);
        }
    }
    
    /**
     * Nils the "FatherProductId" element
     */
    public void setNilFatherProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FATHERPRODUCTID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FATHERPRODUCTID$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "FatherProductId" element
     */
    public void unsetFatherProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FATHERPRODUCTID$10, 0);
        }
    }
    
    /**
     * Gets the "HasError" element
     */
    public boolean getHasError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASERROR$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "HasError" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASERROR$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "HasError" element
     */
    public boolean isSetHasError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASERROR$12) != 0;
        }
    }
    
    /**
     * Sets the "HasError" element
     */
    public void setHasError(boolean hasError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASERROR$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASERROR$12);
            }
            target.setBooleanValue(hasError);
        }
    }
    
    /**
     * Sets (as xml) the "HasError" element
     */
    public void xsetHasError(org.apache.xmlbeans.XmlBoolean hasError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASERROR$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASERROR$12);
            }
            target.set(hasError);
        }
    }
    
    /**
     * Unsets the "HasError" element
     */
    public void unsetHasError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASERROR$12, 0);
        }
    }
    
    /**
     * Gets the "ImageUrl" element
     */
    public java.lang.String getImageUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMAGEURL$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ImageUrl" element
     */
    public org.apache.xmlbeans.XmlString xgetImageUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMAGEURL$14, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ImageUrl" element
     */
    public boolean isNilImageUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMAGEURL$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ImageUrl" element
     */
    public boolean isSetImageUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMAGEURL$14) != 0;
        }
    }
    
    /**
     * Sets the "ImageUrl" element
     */
    public void setImageUrl(java.lang.String imageUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMAGEURL$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMAGEURL$14);
            }
            target.setStringValue(imageUrl);
        }
    }
    
    /**
     * Sets (as xml) the "ImageUrl" element
     */
    public void xsetImageUrl(org.apache.xmlbeans.XmlString imageUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMAGEURL$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IMAGEURL$14);
            }
            target.set(imageUrl);
        }
    }
    
    /**
     * Nils the "ImageUrl" element
     */
    public void setNilImageUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMAGEURL$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IMAGEURL$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ImageUrl" element
     */
    public void unsetImageUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMAGEURL$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$16, 0);
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
            return get_store().count_elements(NAME$16) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$16);
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
            get_store().remove_element(NAME$16, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPE$18, 0);
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
            target = (com.cdiscount.www.ProductTypeEnum)get_store().find_element_user(PRODUCTTYPE$18, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductType" element
     */
    public boolean isNilProductType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductTypeEnum target = null;
            target = (com.cdiscount.www.ProductTypeEnum)get_store().find_element_user(PRODUCTTYPE$18, 0);
            if (target == null) return false;
            return target.isNil();
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
            return get_store().count_elements(PRODUCTTYPE$18) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTTYPE$18);
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
            target = (com.cdiscount.www.ProductTypeEnum)get_store().find_element_user(PRODUCTTYPE$18, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductTypeEnum)get_store().add_element_user(PRODUCTTYPE$18);
            }
            target.set(productType);
        }
    }
    
    /**
     * Nils the "ProductType" element
     */
    public void setNilProductType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductTypeEnum target = null;
            target = (com.cdiscount.www.ProductTypeEnum)get_store().find_element_user(PRODUCTTYPE$18, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductTypeEnum)get_store().add_element_user(PRODUCTTYPE$18);
            }
            target.setNil();
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
            get_store().remove_element(PRODUCTTYPE$18, 0);
        }
    }
    
    /**
     * Gets the "Size" element
     */
    public java.lang.String getSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIZE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Size" element
     */
    public org.apache.xmlbeans.XmlString xgetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIZE$20, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Size" element
     */
    public boolean isNilSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIZE$20, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Size" element
     */
    public boolean isSetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIZE$20) != 0;
        }
    }
    
    /**
     * Sets the "Size" element
     */
    public void setSize(java.lang.String size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIZE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIZE$20);
            }
            target.setStringValue(size);
        }
    }
    
    /**
     * Sets (as xml) the "Size" element
     */
    public void xsetSize(org.apache.xmlbeans.XmlString size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIZE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIZE$20);
            }
            target.set(size);
        }
    }
    
    /**
     * Nils the "Size" element
     */
    public void setNilSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIZE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIZE$20);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Size" element
     */
    public void unsetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIZE$20, 0);
        }
    }
}
