/*
 * XML Type:  OfferStateActionRequest
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.OfferStateActionRequest
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML OfferStateActionRequest(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class OfferStateActionRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.OfferStateActionRequest
{
    private static final long serialVersionUID = 1L;
    
    public OfferStateActionRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTION$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Action");
    private static final javax.xml.namespace.QName SELLERPRODUCTID$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerProductId");
    
    
    /**
     * Gets the "Action" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType.Enum getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Action" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType xgetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType)get_store().find_element_user(ACTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Action" element
     */
    public void setAction(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType.Enum action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTION$0);
            }
            target.setEnumValue(action);
        }
    }
    
    /**
     * Sets (as xml) the "Action" element
     */
    public void xsetAction(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType)get_store().find_element_user(ACTION$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.OfferStateActionType)get_store().add_element_user(ACTION$0);
            }
            target.set(action);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERPRODUCTID$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$2, 0);
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
            return get_store().count_elements(SELLERPRODUCTID$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERPRODUCTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELLERPRODUCTID$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERPRODUCTID$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERPRODUCTID$2);
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
            get_store().remove_element(SELLERPRODUCTID$2, 0);
        }
    }
}
