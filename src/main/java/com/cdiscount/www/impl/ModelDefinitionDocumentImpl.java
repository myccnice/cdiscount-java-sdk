/*
 * An XML document type.
 * Localname: ModelDefinition
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ModelDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * A document containing one ModelDefinition(@http://www.cdiscount.com) element.
 *
 * This is a complex type.
 */
public class ModelDefinitionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ModelDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ModelDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODELDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ModelDefinition");
    
    
    /**
     * Gets the "ModelDefinition" element
     */
    public com.cdiscount.www.ModelDefinition getModelDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ModelDefinition target = null;
            target = (com.cdiscount.www.ModelDefinition)get_store().find_element_user(MODELDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ModelDefinition" element
     */
    public boolean isNilModelDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ModelDefinition target = null;
            target = (com.cdiscount.www.ModelDefinition)get_store().find_element_user(MODELDEFINITION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ModelDefinition" element
     */
    public void setModelDefinition(com.cdiscount.www.ModelDefinition modelDefinition)
    {
        generatedSetterHelperImpl(modelDefinition, MODELDEFINITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ModelDefinition" element
     */
    public com.cdiscount.www.ModelDefinition addNewModelDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ModelDefinition target = null;
            target = (com.cdiscount.www.ModelDefinition)get_store().add_element_user(MODELDEFINITION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ModelDefinition" element
     */
    public void setNilModelDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ModelDefinition target = null;
            target = (com.cdiscount.www.ModelDefinition)get_store().find_element_user(MODELDEFINITION$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ModelDefinition)get_store().add_element_user(MODELDEFINITION$0);
            }
            target.setNil();
        }
    }
}
