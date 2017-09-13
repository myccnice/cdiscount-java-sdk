/*
 * XML Type:  ExternalOrder
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.impl;
/**
 * An XML ExternalOrder(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order).
 *
 * This is a complex type.
 */
public class ExternalOrderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalOrder
{
    private static final long serialVersionUID = 1L;
    
    public ExternalOrderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMENTS$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "Comments");
    private static final javax.xml.namespace.QName CORPORATION$2 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "Corporation");
    private static final javax.xml.namespace.QName CUSTOMER$4 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "Customer");
    private static final javax.xml.namespace.QName CUSTOMERORDERNUMBER$6 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "CustomerOrderNumber");
    private static final javax.xml.namespace.QName ORDERDATE$8 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "OrderDate");
    private static final javax.xml.namespace.QName ORDERLINELIST$10 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "OrderLineList");
    private static final javax.xml.namespace.QName SHIPPINGMODE$12 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "ShippingMode");
    
    
    /**
     * Gets the "Comments" element
     */
    public java.lang.String getComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Comments" element
     */
    public org.apache.xmlbeans.XmlString xgetComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENTS$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Comments" element
     */
    public boolean isNilComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENTS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Comments" element
     */
    public boolean isSetComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMENTS$0) != 0;
        }
    }
    
    /**
     * Sets the "Comments" element
     */
    public void setComments(java.lang.String comments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMENTS$0);
            }
            target.setStringValue(comments);
        }
    }
    
    /**
     * Sets (as xml) the "Comments" element
     */
    public void xsetComments(org.apache.xmlbeans.XmlString comments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMENTS$0);
            }
            target.set(comments);
        }
    }
    
    /**
     * Nils the "Comments" element
     */
    public void setNilComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMENTS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Comments" element
     */
    public void unsetComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMENTS$0, 0);
        }
    }
    
    /**
     * Gets the "Corporation" element
     */
    public java.lang.String getCorporation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORPORATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Corporation" element
     */
    public org.apache.xmlbeans.XmlString xgetCorporation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORPORATION$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Corporation" element
     */
    public boolean isNilCorporation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORPORATION$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Corporation" element
     */
    public void setCorporation(java.lang.String corporation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORPORATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORPORATION$2);
            }
            target.setStringValue(corporation);
        }
    }
    
    /**
     * Sets (as xml) the "Corporation" element
     */
    public void xsetCorporation(org.apache.xmlbeans.XmlString corporation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORPORATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORPORATION$2);
            }
            target.set(corporation);
        }
    }
    
    /**
     * Nils the "Corporation" element
     */
    public void setNilCorporation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORPORATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORPORATION$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "Customer" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalCustomer getCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalCustomer target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalCustomer)get_store().find_element_user(CUSTOMER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Customer" element
     */
    public boolean isNilCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalCustomer target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalCustomer)get_store().find_element_user(CUSTOMER$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Customer" element
     */
    public void setCustomer(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalCustomer customer)
    {
        generatedSetterHelperImpl(customer, CUSTOMER$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Customer" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalCustomer addNewCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalCustomer target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalCustomer)get_store().add_element_user(CUSTOMER$4);
            return target;
        }
    }
    
    /**
     * Nils the "Customer" element
     */
    public void setNilCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalCustomer target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalCustomer)get_store().find_element_user(CUSTOMER$4, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalCustomer)get_store().add_element_user(CUSTOMER$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "CustomerOrderNumber" element
     */
    public java.lang.String getCustomerOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERORDERNUMBER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CustomerOrderNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetCustomerOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERORDERNUMBER$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CustomerOrderNumber" element
     */
    public boolean isNilCustomerOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERORDERNUMBER$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CustomerOrderNumber" element
     */
    public void setCustomerOrderNumber(java.lang.String customerOrderNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERORDERNUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMERORDERNUMBER$6);
            }
            target.setStringValue(customerOrderNumber);
        }
    }
    
    /**
     * Sets (as xml) the "CustomerOrderNumber" element
     */
    public void xsetCustomerOrderNumber(org.apache.xmlbeans.XmlString customerOrderNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERORDERNUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMERORDERNUMBER$6);
            }
            target.set(customerOrderNumber);
        }
    }
    
    /**
     * Nils the "CustomerOrderNumber" element
     */
    public void setNilCustomerOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERORDERNUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMERORDERNUMBER$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "OrderDate" element
     */
    public java.util.Calendar getOrderDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERDATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetOrderDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ORDERDATE$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderDate" element
     */
    public boolean isNilOrderDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ORDERDATE$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OrderDate" element
     */
    public boolean isSetOrderDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERDATE$8) != 0;
        }
    }
    
    /**
     * Sets the "OrderDate" element
     */
    public void setOrderDate(java.util.Calendar orderDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERDATE$8);
            }
            target.setCalendarValue(orderDate);
        }
    }
    
    /**
     * Sets (as xml) the "OrderDate" element
     */
    public void xsetOrderDate(org.apache.xmlbeans.XmlDateTime orderDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ORDERDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ORDERDATE$8);
            }
            target.set(orderDate);
        }
    }
    
    /**
     * Nils the "OrderDate" element
     */
    public void setNilOrderDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ORDERDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ORDERDATE$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OrderDate" element
     */
    public void unsetOrderDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERDATE$8, 0);
        }
    }
    
    /**
     * Gets the "OrderLineList" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine getOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine)get_store().find_element_user(ORDERLINELIST$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderLineList" element
     */
    public boolean isNilOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine)get_store().find_element_user(ORDERLINELIST$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrderLineList" element
     */
    public void setOrderLineList(org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine orderLineList)
    {
        generatedSetterHelperImpl(orderLineList, ORDERLINELIST$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderLineList" element
     */
    public org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine addNewOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine)get_store().add_element_user(ORDERLINELIST$10);
            return target;
        }
    }
    
    /**
     * Nils the "OrderLineList" element
     */
    public void setNilOrderLineList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine target = null;
            target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine)get_store().find_element_user(ORDERLINELIST$10, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ArrayOfExternalOrderLine)get_store().add_element_user(ORDERLINELIST$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "ShippingMode" element
     */
    public java.lang.String getShippingMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGMODE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShippingMode" element
     */
    public org.apache.xmlbeans.XmlString xgetShippingMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGMODE$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ShippingMode" element
     */
    public boolean isNilShippingMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGMODE$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ShippingMode" element
     */
    public void setShippingMode(java.lang.String shippingMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGMODE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPPINGMODE$12);
            }
            target.setStringValue(shippingMode);
        }
    }
    
    /**
     * Sets (as xml) the "ShippingMode" element
     */
    public void xsetShippingMode(org.apache.xmlbeans.XmlString shippingMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGMODE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPPINGMODE$12);
            }
            target.set(shippingMode);
        }
    }
    
    /**
     * Nils the "ShippingMode" element
     */
    public void setNilShippingMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGMODE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPPINGMODE$12);
            }
            target.setNil();
        }
    }
}
