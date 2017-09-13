/*
 * XML Type:  ModelDefinition
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ModelDefinition
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ModelDefinition(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ModelDefinitionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ModelDefinition
{
    private static final long serialVersionUID = 1L;
    
    public ModelDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTPROPERTIES$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ListProperties");
    private static final javax.xml.namespace.QName MANDATORYMODELPROPERTIES$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "MandatoryModelProperties");
    private static final javax.xml.namespace.QName MULTIPLEFREETEXTPROPERTIES$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "MultipleFreeTextProperties");
    private static final javax.xml.namespace.QName SINGLEFREETEXTPROPERTIES$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SingleFreeTextProperties");
    
    
    /**
     * Gets the "ListProperties" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 getListProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1)get_store().find_element_user(LISTPROPERTIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ListProperties" element
     */
    public boolean isNilListProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1)get_store().find_element_user(LISTPROPERTIES$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ListProperties" element
     */
    public boolean isSetListProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LISTPROPERTIES$0) != 0;
        }
    }
    
    /**
     * Sets the "ListProperties" element
     */
    public void setListProperties(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 listProperties)
    {
        generatedSetterHelperImpl(listProperties, LISTPROPERTIES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ListProperties" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 addNewListProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1)get_store().add_element_user(LISTPROPERTIES$0);
            return target;
        }
    }
    
    /**
     * Nils the "ListProperties" element
     */
    public void setNilListProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1)get_store().find_element_user(LISTPROPERTIES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1)get_store().add_element_user(LISTPROPERTIES$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ListProperties" element
     */
    public void unsetListProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LISTPROPERTIES$0, 0);
        }
    }
    
    /**
     * Gets the "MandatoryModelProperties" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getMandatoryModelProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(MANDATORYMODELPROPERTIES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "MandatoryModelProperties" element
     */
    public boolean isNilMandatoryModelProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(MANDATORYMODELPROPERTIES$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "MandatoryModelProperties" element
     */
    public boolean isSetMandatoryModelProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANDATORYMODELPROPERTIES$2) != 0;
        }
    }
    
    /**
     * Sets the "MandatoryModelProperties" element
     */
    public void setMandatoryModelProperties(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring mandatoryModelProperties)
    {
        generatedSetterHelperImpl(mandatoryModelProperties, MANDATORYMODELPROPERTIES$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MandatoryModelProperties" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewMandatoryModelProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(MANDATORYMODELPROPERTIES$2);
            return target;
        }
    }
    
    /**
     * Nils the "MandatoryModelProperties" element
     */
    public void setNilMandatoryModelProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(MANDATORYMODELPROPERTIES$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(MANDATORYMODELPROPERTIES$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "MandatoryModelProperties" element
     */
    public void unsetMandatoryModelProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANDATORYMODELPROPERTIES$2, 0);
        }
    }
    
    /**
     * Gets the "MultipleFreeTextProperties" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 getMultipleFreeTextProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1)get_store().find_element_user(MULTIPLEFREETEXTPROPERTIES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "MultipleFreeTextProperties" element
     */
    public boolean isNilMultipleFreeTextProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1)get_store().find_element_user(MULTIPLEFREETEXTPROPERTIES$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "MultipleFreeTextProperties" element
     */
    public boolean isSetMultipleFreeTextProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MULTIPLEFREETEXTPROPERTIES$4) != 0;
        }
    }
    
    /**
     * Sets the "MultipleFreeTextProperties" element
     */
    public void setMultipleFreeTextProperties(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 multipleFreeTextProperties)
    {
        generatedSetterHelperImpl(multipleFreeTextProperties, MULTIPLEFREETEXTPROPERTIES$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MultipleFreeTextProperties" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 addNewMultipleFreeTextProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1)get_store().add_element_user(MULTIPLEFREETEXTPROPERTIES$4);
            return target;
        }
    }
    
    /**
     * Nils the "MultipleFreeTextProperties" element
     */
    public void setNilMultipleFreeTextProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1)get_store().find_element_user(MULTIPLEFREETEXTPROPERTIES$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1)get_store().add_element_user(MULTIPLEFREETEXTPROPERTIES$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "MultipleFreeTextProperties" element
     */
    public void unsetMultipleFreeTextProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MULTIPLEFREETEXTPROPERTIES$4, 0);
        }
    }
    
    /**
     * Gets the "SingleFreeTextProperties" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 getSingleFreeTextProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1)get_store().find_element_user(SINGLEFREETEXTPROPERTIES$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SingleFreeTextProperties" element
     */
    public boolean isNilSingleFreeTextProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1)get_store().find_element_user(SINGLEFREETEXTPROPERTIES$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SingleFreeTextProperties" element
     */
    public boolean isSetSingleFreeTextProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SINGLEFREETEXTPROPERTIES$6) != 0;
        }
    }
    
    /**
     * Sets the "SingleFreeTextProperties" element
     */
    public void setSingleFreeTextProperties(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 singleFreeTextProperties)
    {
        generatedSetterHelperImpl(singleFreeTextProperties, SINGLEFREETEXTPROPERTIES$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SingleFreeTextProperties" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 addNewSingleFreeTextProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1)get_store().add_element_user(SINGLEFREETEXTPROPERTIES$6);
            return target;
        }
    }
    
    /**
     * Nils the "SingleFreeTextProperties" element
     */
    public void setNilSingleFreeTextProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1)get_store().find_element_user(SINGLEFREETEXTPROPERTIES$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1)get_store().add_element_user(SINGLEFREETEXTPROPERTIES$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SingleFreeTextProperties" element
     */
    public void unsetSingleFreeTextProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SINGLEFREETEXTPROPERTIES$6, 0);
        }
    }
}
