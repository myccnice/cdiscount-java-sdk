/*
 * XML Type:  ProductModel
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ProductModel
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ProductModel(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ProductModelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ProductModel
{
    private static final long serialVersionUID = 1L;
    
    public ProductModelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYCODE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CategoryCode");
    private static final javax.xml.namespace.QName DEFINITION$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Definition");
    private static final javax.xml.namespace.QName MODELID$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ModelId");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Name");
    private static final javax.xml.namespace.QName PRODUCTXMLSTRUCTURE$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductXmlStructure");
    private static final javax.xml.namespace.QName VARIATIONVALUELIST$10 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "VariationValueList");
    private static final javax.xml.namespace.QName VERSION$12 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Version");
    
    
    /**
     * Gets the "CategoryCode" element
     */
    public java.lang.String getCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYCODE$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORYCODE$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORYCODE$0, 0);
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
            return get_store().count_elements(CATEGORYCODE$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORYCODE$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORYCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORYCODE$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORYCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORYCODE$0);
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
            get_store().remove_element(CATEGORYCODE$0, 0);
        }
    }
    
    /**
     * Gets the "Definition" element
     */
    public com.cdiscount.www.ModelDefinition getDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ModelDefinition target = null;
            target = (com.cdiscount.www.ModelDefinition)get_store().find_element_user(DEFINITION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Definition" element
     */
    public boolean isNilDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ModelDefinition target = null;
            target = (com.cdiscount.www.ModelDefinition)get_store().find_element_user(DEFINITION$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Definition" element
     */
    public boolean isSetDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFINITION$2) != 0;
        }
    }
    
    /**
     * Sets the "Definition" element
     */
    public void setDefinition(com.cdiscount.www.ModelDefinition definition)
    {
        generatedSetterHelperImpl(definition, DEFINITION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Definition" element
     */
    public com.cdiscount.www.ModelDefinition addNewDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ModelDefinition target = null;
            target = (com.cdiscount.www.ModelDefinition)get_store().add_element_user(DEFINITION$2);
            return target;
        }
    }
    
    /**
     * Nils the "Definition" element
     */
    public void setNilDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ModelDefinition target = null;
            target = (com.cdiscount.www.ModelDefinition)get_store().find_element_user(DEFINITION$2, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ModelDefinition)get_store().add_element_user(DEFINITION$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Definition" element
     */
    public void unsetDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFINITION$2, 0);
        }
    }
    
    /**
     * Gets the "ModelId" element
     */
    public int getModelId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODELID$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ModelId" element
     */
    public org.apache.xmlbeans.XmlInt xgetModelId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MODELID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ModelId" element
     */
    public boolean isSetModelId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODELID$4) != 0;
        }
    }
    
    /**
     * Sets the "ModelId" element
     */
    public void setModelId(int modelId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODELID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODELID$4);
            }
            target.setIntValue(modelId);
        }
    }
    
    /**
     * Sets (as xml) the "ModelId" element
     */
    public void xsetModelId(org.apache.xmlbeans.XmlInt modelId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MODELID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MODELID$4);
            }
            target.set(modelId);
        }
    }
    
    /**
     * Unsets the "ModelId" element
     */
    public void unsetModelId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODELID$4, 0);
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
     * Gets the "ProductXmlStructure" element
     */
    public java.lang.String getProductXmlStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTXMLSTRUCTURE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductXmlStructure" element
     */
    public org.apache.xmlbeans.XmlString xgetProductXmlStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTXMLSTRUCTURE$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductXmlStructure" element
     */
    public boolean isNilProductXmlStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTXMLSTRUCTURE$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ProductXmlStructure" element
     */
    public boolean isSetProductXmlStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTXMLSTRUCTURE$8) != 0;
        }
    }
    
    /**
     * Sets the "ProductXmlStructure" element
     */
    public void setProductXmlStructure(java.lang.String productXmlStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTXMLSTRUCTURE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTXMLSTRUCTURE$8);
            }
            target.setStringValue(productXmlStructure);
        }
    }
    
    /**
     * Sets (as xml) the "ProductXmlStructure" element
     */
    public void xsetProductXmlStructure(org.apache.xmlbeans.XmlString productXmlStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTXMLSTRUCTURE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTXMLSTRUCTURE$8);
            }
            target.set(productXmlStructure);
        }
    }
    
    /**
     * Nils the "ProductXmlStructure" element
     */
    public void setNilProductXmlStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTXMLSTRUCTURE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTXMLSTRUCTURE$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ProductXmlStructure" element
     */
    public void unsetProductXmlStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTXMLSTRUCTURE$8, 0);
        }
    }
    
    /**
     * Gets the "VariationValueList" element
     */
    public com.cdiscount.www.ArrayOfVariationDescription getVariationValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfVariationDescription target = null;
            target = (com.cdiscount.www.ArrayOfVariationDescription)get_store().find_element_user(VARIATIONVALUELIST$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "VariationValueList" element
     */
    public boolean isNilVariationValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfVariationDescription target = null;
            target = (com.cdiscount.www.ArrayOfVariationDescription)get_store().find_element_user(VARIATIONVALUELIST$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "VariationValueList" element
     */
    public boolean isSetVariationValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VARIATIONVALUELIST$10) != 0;
        }
    }
    
    /**
     * Sets the "VariationValueList" element
     */
    public void setVariationValueList(com.cdiscount.www.ArrayOfVariationDescription variationValueList)
    {
        generatedSetterHelperImpl(variationValueList, VARIATIONVALUELIST$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "VariationValueList" element
     */
    public com.cdiscount.www.ArrayOfVariationDescription addNewVariationValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfVariationDescription target = null;
            target = (com.cdiscount.www.ArrayOfVariationDescription)get_store().add_element_user(VARIATIONVALUELIST$10);
            return target;
        }
    }
    
    /**
     * Nils the "VariationValueList" element
     */
    public void setNilVariationValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfVariationDescription target = null;
            target = (com.cdiscount.www.ArrayOfVariationDescription)get_store().find_element_user(VARIATIONVALUELIST$10, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfVariationDescription)get_store().add_element_user(VARIATIONVALUELIST$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "VariationValueList" element
     */
    public void unsetVariationValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VARIATIONVALUELIST$10, 0);
        }
    }
    
    /**
     * Gets the "Version" element
     */
    public java.lang.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Version" element
     */
    public org.apache.xmlbeans.XmlString xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Version" element
     */
    public boolean isNilVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Version" element
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSION$12) != 0;
        }
    }
    
    /**
     * Sets the "Version" element
     */
    public void setVersion(java.lang.String version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$12);
            }
            target.setStringValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "Version" element
     */
    public void xsetVersion(org.apache.xmlbeans.XmlString version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$12);
            }
            target.set(version);
        }
    }
    
    /**
     * Nils the "Version" element
     */
    public void setNilVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Version" element
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSION$12, 0);
        }
    }
}
