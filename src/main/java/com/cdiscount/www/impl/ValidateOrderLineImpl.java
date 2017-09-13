/*
 * XML Type:  ValidateOrderLine
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.ValidateOrderLine
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML ValidateOrderLine(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ValidateOrderLineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.ValidateOrderLine
{
    private static final long serialVersionUID = 1L;
    
    public ValidateOrderLineImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCEPTATIONSTATE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "AcceptationState");
    private static final javax.xml.namespace.QName PRODUCTCONDITION$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductCondition");
    private static final javax.xml.namespace.QName SELLERPRODUCTID$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerProductId");
    private static final javax.xml.namespace.QName TYPEOFRETURN$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "TypeOfReturn");
    
    
    /**
     * Gets the "AcceptationState" element
     */
    public com.cdiscount.www.AcceptationStateEnum.Enum getAcceptationState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCEPTATIONSTATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.AcceptationStateEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "AcceptationState" element
     */
    public com.cdiscount.www.AcceptationStateEnum xgetAcceptationState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.AcceptationStateEnum target = null;
            target = (com.cdiscount.www.AcceptationStateEnum)get_store().find_element_user(ACCEPTATIONSTATE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "AcceptationState" element
     */
    public boolean isSetAcceptationState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCEPTATIONSTATE$0) != 0;
        }
    }
    
    /**
     * Sets the "AcceptationState" element
     */
    public void setAcceptationState(com.cdiscount.www.AcceptationStateEnum.Enum acceptationState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCEPTATIONSTATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCEPTATIONSTATE$0);
            }
            target.setEnumValue(acceptationState);
        }
    }
    
    /**
     * Sets (as xml) the "AcceptationState" element
     */
    public void xsetAcceptationState(com.cdiscount.www.AcceptationStateEnum acceptationState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.AcceptationStateEnum target = null;
            target = (com.cdiscount.www.AcceptationStateEnum)get_store().find_element_user(ACCEPTATIONSTATE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.AcceptationStateEnum)get_store().add_element_user(ACCEPTATIONSTATE$0);
            }
            target.set(acceptationState);
        }
    }
    
    /**
     * Unsets the "AcceptationState" element
     */
    public void unsetAcceptationState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCEPTATIONSTATE$0, 0);
        }
    }
    
    /**
     * Gets the "ProductCondition" element
     */
    public com.cdiscount.www.ProductConditionEnum.Enum getProductCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCONDITION$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.ProductConditionEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductCondition" element
     */
    public com.cdiscount.www.ProductConditionEnum xgetProductCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductConditionEnum target = null;
            target = (com.cdiscount.www.ProductConditionEnum)get_store().find_element_user(PRODUCTCONDITION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ProductCondition" element
     */
    public boolean isSetProductCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTCONDITION$2) != 0;
        }
    }
    
    /**
     * Sets the "ProductCondition" element
     */
    public void setProductCondition(com.cdiscount.www.ProductConditionEnum.Enum productCondition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCONDITION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCONDITION$2);
            }
            target.setEnumValue(productCondition);
        }
    }
    
    /**
     * Sets (as xml) the "ProductCondition" element
     */
    public void xsetProductCondition(com.cdiscount.www.ProductConditionEnum productCondition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductConditionEnum target = null;
            target = (com.cdiscount.www.ProductConditionEnum)get_store().find_element_user(PRODUCTCONDITION$2, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductConditionEnum)get_store().add_element_user(PRODUCTCONDITION$2);
            }
            target.set(productCondition);
        }
    }
    
    /**
     * Unsets the "ProductCondition" element
     */
    public void unsetProductCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTCONDITION$2, 0);
        }
    }
    
    /**
     * Gets the "SellerProductId" element
     */
    public java.lang.String getSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERPRODUCTID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SellerProductId" element
     */
    public org.apache.xmlbeans.XmlString xgetSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerProductId" element
     */
    public boolean isNilSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SellerProductId" element
     */
    public boolean isSetSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELLERPRODUCTID$4) != 0;
        }
    }
    
    /**
     * Sets the "SellerProductId" element
     */
    public void setSellerProductId(java.lang.String sellerProductId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERPRODUCTID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELLERPRODUCTID$4);
            }
            target.setStringValue(sellerProductId);
        }
    }
    
    /**
     * Sets (as xml) the "SellerProductId" element
     */
    public void xsetSellerProductId(org.apache.xmlbeans.XmlString sellerProductId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERPRODUCTID$4);
            }
            target.set(sellerProductId);
        }
    }
    
    /**
     * Nils the "SellerProductId" element
     */
    public void setNilSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERPRODUCTID$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SellerProductId" element
     */
    public void unsetSellerProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELLERPRODUCTID$4, 0);
        }
    }
    
    /**
     * Gets the "TypeOfReturn" element
     */
    public com.cdiscount.www.AskingForReturnType.Enum getTypeOfReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEOFRETURN$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.AskingForReturnType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "TypeOfReturn" element
     */
    public com.cdiscount.www.AskingForReturnType xgetTypeOfReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.AskingForReturnType target = null;
            target = (com.cdiscount.www.AskingForReturnType)get_store().find_element_user(TYPEOFRETURN$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "TypeOfReturn" element
     */
    public boolean isNilTypeOfReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.AskingForReturnType target = null;
            target = (com.cdiscount.www.AskingForReturnType)get_store().find_element_user(TYPEOFRETURN$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "TypeOfReturn" element
     */
    public boolean isSetTypeOfReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPEOFRETURN$6) != 0;
        }
    }
    
    /**
     * Sets the "TypeOfReturn" element
     */
    public void setTypeOfReturn(com.cdiscount.www.AskingForReturnType.Enum typeOfReturn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEOFRETURN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPEOFRETURN$6);
            }
            target.setEnumValue(typeOfReturn);
        }
    }
    
    /**
     * Sets (as xml) the "TypeOfReturn" element
     */
    public void xsetTypeOfReturn(com.cdiscount.www.AskingForReturnType typeOfReturn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.AskingForReturnType target = null;
            target = (com.cdiscount.www.AskingForReturnType)get_store().find_element_user(TYPEOFRETURN$6, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.AskingForReturnType)get_store().add_element_user(TYPEOFRETURN$6);
            }
            target.set(typeOfReturn);
        }
    }
    
    /**
     * Nils the "TypeOfReturn" element
     */
    public void setNilTypeOfReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.AskingForReturnType target = null;
            target = (com.cdiscount.www.AskingForReturnType)get_store().find_element_user(TYPEOFRETURN$6, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.AskingForReturnType)get_store().add_element_user(TYPEOFRETURN$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "TypeOfReturn" element
     */
    public void unsetTypeOfReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPEOFRETURN$6, 0);
        }
    }
}
