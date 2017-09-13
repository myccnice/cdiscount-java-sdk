/*
 * XML Type:  ArrayOfProductByIdentifier
 * Namespace: http://www.cdiscount.com/ProductByIdentifier
 * Java type: com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.productbyidentifier.impl;
/**
 * An XML ArrayOfProductByIdentifier(@http://www.cdiscount.com/ProductByIdentifier).
 *
 * This is a complex type.
 */
public class ArrayOfProductByIdentifierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.productbyidentifier.ArrayOfProductByIdentifier
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfProductByIdentifierImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTBYIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com/ProductByIdentifier", "ProductByIdentifier");
    
    
    /**
     * Gets array of all "ProductByIdentifier" elements
     */
    public com.cdiscount.www.productbyidentifier.ProductByIdentifier[] getProductByIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCTBYIDENTIFIER$0, targetList);
            com.cdiscount.www.productbyidentifier.ProductByIdentifier[] result = new com.cdiscount.www.productbyidentifier.ProductByIdentifier[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProductByIdentifier" element
     */
    public com.cdiscount.www.productbyidentifier.ProductByIdentifier getProductByIdentifierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.productbyidentifier.ProductByIdentifier target = null;
            target = (com.cdiscount.www.productbyidentifier.ProductByIdentifier)get_store().find_element_user(PRODUCTBYIDENTIFIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ProductByIdentifier" element
     */
    public boolean isNilProductByIdentifierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.productbyidentifier.ProductByIdentifier target = null;
            target = (com.cdiscount.www.productbyidentifier.ProductByIdentifier)get_store().find_element_user(PRODUCTBYIDENTIFIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ProductByIdentifier" element
     */
    public int sizeOfProductByIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTBYIDENTIFIER$0);
        }
    }
    
    /**
     * Sets array of all "ProductByIdentifier" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProductByIdentifierArray(com.cdiscount.www.productbyidentifier.ProductByIdentifier[] productByIdentifierArray)
    {
        check_orphaned();
        arraySetterHelper(productByIdentifierArray, PRODUCTBYIDENTIFIER$0);
    }
    
    /**
     * Sets ith "ProductByIdentifier" element
     */
    public void setProductByIdentifierArray(int i, com.cdiscount.www.productbyidentifier.ProductByIdentifier productByIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.productbyidentifier.ProductByIdentifier target = null;
            target = (com.cdiscount.www.productbyidentifier.ProductByIdentifier)get_store().find_element_user(PRODUCTBYIDENTIFIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(productByIdentifier);
        }
    }
    
    /**
     * Nils the ith "ProductByIdentifier" element
     */
    public void setNilProductByIdentifierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.productbyidentifier.ProductByIdentifier target = null;
            target = (com.cdiscount.www.productbyidentifier.ProductByIdentifier)get_store().find_element_user(PRODUCTBYIDENTIFIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductByIdentifier" element
     */
    public com.cdiscount.www.productbyidentifier.ProductByIdentifier insertNewProductByIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.productbyidentifier.ProductByIdentifier target = null;
            target = (com.cdiscount.www.productbyidentifier.ProductByIdentifier)get_store().insert_element_user(PRODUCTBYIDENTIFIER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProductByIdentifier" element
     */
    public com.cdiscount.www.productbyidentifier.ProductByIdentifier addNewProductByIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.productbyidentifier.ProductByIdentifier target = null;
            target = (com.cdiscount.www.productbyidentifier.ProductByIdentifier)get_store().add_element_user(PRODUCTBYIDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProductByIdentifier" element
     */
    public void removeProductByIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTBYIDENTIFIER$0, i);
        }
    }
}
