/*
 * XML Type:  IdentifierRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.IdentifierRequest
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML IdentifierRequest(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class IdentifierRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.IdentifierRequest
{
    private static final long serialVersionUID = 1L;
    
    public IdentifierRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIERTYPE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "IdentifierType");
    private static final javax.xml.namespace.QName VALUELIST$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ValueList");
    
    
    /**
     * Gets the "IdentifierType" element
     */
    public com.cdiscount.www.IdentifierTypeEnum.Enum getIdentifierType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIERTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.IdentifierTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "IdentifierType" element
     */
    public com.cdiscount.www.IdentifierTypeEnum xgetIdentifierType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.IdentifierTypeEnum target = null;
            target = (com.cdiscount.www.IdentifierTypeEnum)get_store().find_element_user(IDENTIFIERTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "IdentifierType" element
     */
    public boolean isSetIdentifierType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIERTYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "IdentifierType" element
     */
    public void setIdentifierType(com.cdiscount.www.IdentifierTypeEnum.Enum identifierType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIERTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFIERTYPE$0);
            }
            target.setEnumValue(identifierType);
        }
    }
    
    /**
     * Sets (as xml) the "IdentifierType" element
     */
    public void xsetIdentifierType(com.cdiscount.www.IdentifierTypeEnum identifierType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.IdentifierTypeEnum target = null;
            target = (com.cdiscount.www.IdentifierTypeEnum)get_store().find_element_user(IDENTIFIERTYPE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.IdentifierTypeEnum)get_store().add_element_user(IDENTIFIERTYPE$0);
            }
            target.set(identifierType);
        }
    }
    
    /**
     * Unsets the "IdentifierType" element
     */
    public void unsetIdentifierType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIERTYPE$0, 0);
        }
    }
    
    /**
     * Gets the "ValueList" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(VALUELIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ValueList" element
     */
    public boolean isNilValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(VALUELIST$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ValueList" element
     */
    public boolean isSetValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUELIST$2) != 0;
        }
    }
    
    /**
     * Sets the "ValueList" element
     */
    public void setValueList(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring valueList)
    {
        generatedSetterHelperImpl(valueList, VALUELIST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ValueList" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(VALUELIST$2);
            return target;
        }
    }
    
    /**
     * Nils the "ValueList" element
     */
    public void setNilValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(VALUELIST$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(VALUELIST$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ValueList" element
     */
    public void unsetValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUELIST$2, 0);
        }
    }
}
