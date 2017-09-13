/*
 * XML Type:  ArrayOfProductModel
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ArrayOfProductModel
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ArrayOfProductModel(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ArrayOfProductModelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ArrayOfProductModel
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfProductModelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTMODEL$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductModel");
    
    
    /**
     * Gets array of all "ProductModel" elements
     */
    public com.cdiscount.www.ProductModel[] getProductModelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCTMODEL$0, targetList);
            com.cdiscount.www.ProductModel[] result = new com.cdiscount.www.ProductModel[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProductModel" element
     */
    public com.cdiscount.www.ProductModel getProductModelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductModel target = null;
            target = (com.cdiscount.www.ProductModel)get_store().find_element_user(PRODUCTMODEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ProductModel" element
     */
    public boolean isNilProductModelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductModel target = null;
            target = (com.cdiscount.www.ProductModel)get_store().find_element_user(PRODUCTMODEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ProductModel" element
     */
    public int sizeOfProductModelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTMODEL$0);
        }
    }
    
    /**
     * Sets array of all "ProductModel" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProductModelArray(com.cdiscount.www.ProductModel[] productModelArray)
    {
        check_orphaned();
        arraySetterHelper(productModelArray, PRODUCTMODEL$0);
    }
    
    /**
     * Sets ith "ProductModel" element
     */
    public void setProductModelArray(int i, com.cdiscount.www.ProductModel productModel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductModel target = null;
            target = (com.cdiscount.www.ProductModel)get_store().find_element_user(PRODUCTMODEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(productModel);
        }
    }
    
    /**
     * Nils the ith "ProductModel" element
     */
    public void setNilProductModelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductModel target = null;
            target = (com.cdiscount.www.ProductModel)get_store().find_element_user(PRODUCTMODEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductModel" element
     */
    public com.cdiscount.www.ProductModel insertNewProductModel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductModel target = null;
            target = (com.cdiscount.www.ProductModel)get_store().insert_element_user(PRODUCTMODEL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProductModel" element
     */
    public com.cdiscount.www.ProductModel addNewProductModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductModel target = null;
            target = (com.cdiscount.www.ProductModel)get_store().add_element_user(PRODUCTMODEL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProductModel" element
     */
    public void removeProductModel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTMODEL$0, i);
        }
    }
}
