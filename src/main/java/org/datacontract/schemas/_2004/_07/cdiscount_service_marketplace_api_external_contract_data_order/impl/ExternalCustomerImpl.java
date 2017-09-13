/*
 * XML Type:  ExternalCustomer
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalCustomer
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.impl;
/**
 * An XML ExternalCustomer(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order).
 *
 * This is a complex type.
 */
public class ExternalCustomerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_order.ExternalCustomer
{
    private static final long serialVersionUID = 1L;
    
    public ExternalCustomerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDITIONALSHIPPINGADDRESS$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "AdditionalShippingAddress");
    private static final javax.xml.namespace.QName CELLPHONENUMBER$2 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "CellPhoneNumber");
    private static final javax.xml.namespace.QName CIVILITY$4 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "Civility");
    private static final javax.xml.namespace.QName CUSTOMEREMAILADDRESS$6 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "CustomerEmailAddress");
    private static final javax.xml.namespace.QName CUSTOMERFIRSTNAME$8 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "CustomerFirstName");
    private static final javax.xml.namespace.QName CUSTOMERLASTNAME$10 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "CustomerLastName");
    private static final javax.xml.namespace.QName LANDLINEPHONENUMBER$12 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "LandlinePhoneNumber");
    private static final javax.xml.namespace.QName LOCALITY$14 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "Locality");
    private static final javax.xml.namespace.QName SHIPPINGADDRESS$16 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "ShippingAddress");
    private static final javax.xml.namespace.QName SHIPPINGADDRESSTITLE$18 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "ShippingAddressTitle");
    private static final javax.xml.namespace.QName SHIPPINGCITY$20 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "ShippingCity");
    private static final javax.xml.namespace.QName SHIPPINGCOUNTRY$22 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "ShippingCountry");
    private static final javax.xml.namespace.QName SHIPPINGPOSTALCODE$24 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Order", "ShippingPostalCode");
    
    
    /**
     * Gets the "AdditionalShippingAddress" element
     */
    public java.lang.String getAdditionalShippingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONALSHIPPINGADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AdditionalShippingAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetAdditionalShippingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDITIONALSHIPPINGADDRESS$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "AdditionalShippingAddress" element
     */
    public boolean isNilAdditionalShippingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDITIONALSHIPPINGADDRESS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "AdditionalShippingAddress" element
     */
    public boolean isSetAdditionalShippingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONALSHIPPINGADDRESS$0) != 0;
        }
    }
    
    /**
     * Sets the "AdditionalShippingAddress" element
     */
    public void setAdditionalShippingAddress(java.lang.String additionalShippingAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONALSHIPPINGADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDITIONALSHIPPINGADDRESS$0);
            }
            target.setStringValue(additionalShippingAddress);
        }
    }
    
    /**
     * Sets (as xml) the "AdditionalShippingAddress" element
     */
    public void xsetAdditionalShippingAddress(org.apache.xmlbeans.XmlString additionalShippingAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDITIONALSHIPPINGADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDITIONALSHIPPINGADDRESS$0);
            }
            target.set(additionalShippingAddress);
        }
    }
    
    /**
     * Nils the "AdditionalShippingAddress" element
     */
    public void setNilAdditionalShippingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDITIONALSHIPPINGADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDITIONALSHIPPINGADDRESS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "AdditionalShippingAddress" element
     */
    public void unsetAdditionalShippingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONALSHIPPINGADDRESS$0, 0);
        }
    }
    
    /**
     * Gets the "CellPhoneNumber" element
     */
    public java.lang.String getCellPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CELLPHONENUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CellPhoneNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetCellPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CELLPHONENUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CellPhoneNumber" element
     */
    public boolean isNilCellPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CELLPHONENUMBER$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CellPhoneNumber" element
     */
    public boolean isSetCellPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CELLPHONENUMBER$2) != 0;
        }
    }
    
    /**
     * Sets the "CellPhoneNumber" element
     */
    public void setCellPhoneNumber(java.lang.String cellPhoneNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CELLPHONENUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CELLPHONENUMBER$2);
            }
            target.setStringValue(cellPhoneNumber);
        }
    }
    
    /**
     * Sets (as xml) the "CellPhoneNumber" element
     */
    public void xsetCellPhoneNumber(org.apache.xmlbeans.XmlString cellPhoneNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CELLPHONENUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CELLPHONENUMBER$2);
            }
            target.set(cellPhoneNumber);
        }
    }
    
    /**
     * Nils the "CellPhoneNumber" element
     */
    public void setNilCellPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CELLPHONENUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CELLPHONENUMBER$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CellPhoneNumber" element
     */
    public void unsetCellPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CELLPHONENUMBER$2, 0);
        }
    }
    
    /**
     * Gets the "Civility" element
     */
    public java.lang.String getCivility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIVILITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Civility" element
     */
    public org.apache.xmlbeans.XmlString xgetCivility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CIVILITY$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Civility" element
     */
    public boolean isNilCivility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CIVILITY$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Civility" element
     */
    public void setCivility(java.lang.String civility)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIVILITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CIVILITY$4);
            }
            target.setStringValue(civility);
        }
    }
    
    /**
     * Sets (as xml) the "Civility" element
     */
    public void xsetCivility(org.apache.xmlbeans.XmlString civility)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CIVILITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CIVILITY$4);
            }
            target.set(civility);
        }
    }
    
    /**
     * Nils the "Civility" element
     */
    public void setNilCivility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CIVILITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CIVILITY$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "CustomerEmailAddress" element
     */
    public java.lang.String getCustomerEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMEREMAILADDRESS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CustomerEmailAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetCustomerEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMEREMAILADDRESS$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CustomerEmailAddress" element
     */
    public boolean isNilCustomerEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMEREMAILADDRESS$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CustomerEmailAddress" element
     */
    public void setCustomerEmailAddress(java.lang.String customerEmailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMEREMAILADDRESS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMEREMAILADDRESS$6);
            }
            target.setStringValue(customerEmailAddress);
        }
    }
    
    /**
     * Sets (as xml) the "CustomerEmailAddress" element
     */
    public void xsetCustomerEmailAddress(org.apache.xmlbeans.XmlString customerEmailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMEREMAILADDRESS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMEREMAILADDRESS$6);
            }
            target.set(customerEmailAddress);
        }
    }
    
    /**
     * Nils the "CustomerEmailAddress" element
     */
    public void setNilCustomerEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMEREMAILADDRESS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMEREMAILADDRESS$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "CustomerFirstName" element
     */
    public java.lang.String getCustomerFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERFIRSTNAME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CustomerFirstName" element
     */
    public org.apache.xmlbeans.XmlString xgetCustomerFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERFIRSTNAME$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CustomerFirstName" element
     */
    public boolean isNilCustomerFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERFIRSTNAME$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CustomerFirstName" element
     */
    public void setCustomerFirstName(java.lang.String customerFirstName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERFIRSTNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMERFIRSTNAME$8);
            }
            target.setStringValue(customerFirstName);
        }
    }
    
    /**
     * Sets (as xml) the "CustomerFirstName" element
     */
    public void xsetCustomerFirstName(org.apache.xmlbeans.XmlString customerFirstName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERFIRSTNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMERFIRSTNAME$8);
            }
            target.set(customerFirstName);
        }
    }
    
    /**
     * Nils the "CustomerFirstName" element
     */
    public void setNilCustomerFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERFIRSTNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMERFIRSTNAME$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "CustomerLastName" element
     */
    public java.lang.String getCustomerLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERLASTNAME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CustomerLastName" element
     */
    public org.apache.xmlbeans.XmlString xgetCustomerLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERLASTNAME$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CustomerLastName" element
     */
    public boolean isNilCustomerLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERLASTNAME$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CustomerLastName" element
     */
    public void setCustomerLastName(java.lang.String customerLastName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERLASTNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMERLASTNAME$10);
            }
            target.setStringValue(customerLastName);
        }
    }
    
    /**
     * Sets (as xml) the "CustomerLastName" element
     */
    public void xsetCustomerLastName(org.apache.xmlbeans.XmlString customerLastName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERLASTNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMERLASTNAME$10);
            }
            target.set(customerLastName);
        }
    }
    
    /**
     * Nils the "CustomerLastName" element
     */
    public void setNilCustomerLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERLASTNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMERLASTNAME$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "LandlinePhoneNumber" element
     */
    public java.lang.String getLandlinePhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANDLINEPHONENUMBER$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LandlinePhoneNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetLandlinePhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANDLINEPHONENUMBER$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "LandlinePhoneNumber" element
     */
    public boolean isNilLandlinePhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANDLINEPHONENUMBER$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LandlinePhoneNumber" element
     */
    public void setLandlinePhoneNumber(java.lang.String landlinePhoneNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANDLINEPHONENUMBER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANDLINEPHONENUMBER$12);
            }
            target.setStringValue(landlinePhoneNumber);
        }
    }
    
    /**
     * Sets (as xml) the "LandlinePhoneNumber" element
     */
    public void xsetLandlinePhoneNumber(org.apache.xmlbeans.XmlString landlinePhoneNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANDLINEPHONENUMBER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LANDLINEPHONENUMBER$12);
            }
            target.set(landlinePhoneNumber);
        }
    }
    
    /**
     * Nils the "LandlinePhoneNumber" element
     */
    public void setNilLandlinePhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANDLINEPHONENUMBER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LANDLINEPHONENUMBER$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "Locality" element
     */
    public java.lang.String getLocality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALITY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Locality" element
     */
    public org.apache.xmlbeans.XmlString xgetLocality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALITY$14, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Locality" element
     */
    public boolean isNilLocality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALITY$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Locality" element
     */
    public boolean isSetLocality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALITY$14) != 0;
        }
    }
    
    /**
     * Sets the "Locality" element
     */
    public void setLocality(java.lang.String locality)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALITY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALITY$14);
            }
            target.setStringValue(locality);
        }
    }
    
    /**
     * Sets (as xml) the "Locality" element
     */
    public void xsetLocality(org.apache.xmlbeans.XmlString locality)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALITY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCALITY$14);
            }
            target.set(locality);
        }
    }
    
    /**
     * Nils the "Locality" element
     */
    public void setNilLocality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALITY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCALITY$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Locality" element
     */
    public void unsetLocality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALITY$14, 0);
        }
    }
    
    /**
     * Gets the "ShippingAddress" element
     */
    public java.lang.String getShippingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGADDRESS$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShippingAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetShippingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGADDRESS$16, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ShippingAddress" element
     */
    public boolean isNilShippingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGADDRESS$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ShippingAddress" element
     */
    public void setShippingAddress(java.lang.String shippingAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGADDRESS$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPPINGADDRESS$16);
            }
            target.setStringValue(shippingAddress);
        }
    }
    
    /**
     * Sets (as xml) the "ShippingAddress" element
     */
    public void xsetShippingAddress(org.apache.xmlbeans.XmlString shippingAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGADDRESS$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPPINGADDRESS$16);
            }
            target.set(shippingAddress);
        }
    }
    
    /**
     * Nils the "ShippingAddress" element
     */
    public void setNilShippingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGADDRESS$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPPINGADDRESS$16);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "ShippingAddressTitle" element
     */
    public java.lang.String getShippingAddressTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGADDRESSTITLE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShippingAddressTitle" element
     */
    public org.apache.xmlbeans.XmlString xgetShippingAddressTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGADDRESSTITLE$18, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ShippingAddressTitle" element
     */
    public boolean isNilShippingAddressTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGADDRESSTITLE$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ShippingAddressTitle" element
     */
    public boolean isSetShippingAddressTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPPINGADDRESSTITLE$18) != 0;
        }
    }
    
    /**
     * Sets the "ShippingAddressTitle" element
     */
    public void setShippingAddressTitle(java.lang.String shippingAddressTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGADDRESSTITLE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPPINGADDRESSTITLE$18);
            }
            target.setStringValue(shippingAddressTitle);
        }
    }
    
    /**
     * Sets (as xml) the "ShippingAddressTitle" element
     */
    public void xsetShippingAddressTitle(org.apache.xmlbeans.XmlString shippingAddressTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGADDRESSTITLE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPPINGADDRESSTITLE$18);
            }
            target.set(shippingAddressTitle);
        }
    }
    
    /**
     * Nils the "ShippingAddressTitle" element
     */
    public void setNilShippingAddressTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGADDRESSTITLE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPPINGADDRESSTITLE$18);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ShippingAddressTitle" element
     */
    public void unsetShippingAddressTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPPINGADDRESSTITLE$18, 0);
        }
    }
    
    /**
     * Gets the "ShippingCity" element
     */
    public java.lang.String getShippingCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGCITY$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShippingCity" element
     */
    public org.apache.xmlbeans.XmlString xgetShippingCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGCITY$20, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ShippingCity" element
     */
    public boolean isNilShippingCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGCITY$20, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ShippingCity" element
     */
    public void setShippingCity(java.lang.String shippingCity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGCITY$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPPINGCITY$20);
            }
            target.setStringValue(shippingCity);
        }
    }
    
    /**
     * Sets (as xml) the "ShippingCity" element
     */
    public void xsetShippingCity(org.apache.xmlbeans.XmlString shippingCity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGCITY$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPPINGCITY$20);
            }
            target.set(shippingCity);
        }
    }
    
    /**
     * Nils the "ShippingCity" element
     */
    public void setNilShippingCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGCITY$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPPINGCITY$20);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "ShippingCountry" element
     */
    public java.lang.String getShippingCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGCOUNTRY$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShippingCountry" element
     */
    public org.apache.xmlbeans.XmlString xgetShippingCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGCOUNTRY$22, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ShippingCountry" element
     */
    public boolean isNilShippingCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGCOUNTRY$22, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ShippingCountry" element
     */
    public void setShippingCountry(java.lang.String shippingCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGCOUNTRY$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPPINGCOUNTRY$22);
            }
            target.setStringValue(shippingCountry);
        }
    }
    
    /**
     * Sets (as xml) the "ShippingCountry" element
     */
    public void xsetShippingCountry(org.apache.xmlbeans.XmlString shippingCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGCOUNTRY$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPPINGCOUNTRY$22);
            }
            target.set(shippingCountry);
        }
    }
    
    /**
     * Nils the "ShippingCountry" element
     */
    public void setNilShippingCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGCOUNTRY$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPPINGCOUNTRY$22);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "ShippingPostalCode" element
     */
    public java.lang.String getShippingPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGPOSTALCODE$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShippingPostalCode" element
     */
    public org.apache.xmlbeans.XmlString xgetShippingPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGPOSTALCODE$24, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ShippingPostalCode" element
     */
    public boolean isNilShippingPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGPOSTALCODE$24, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ShippingPostalCode" element
     */
    public void setShippingPostalCode(java.lang.String shippingPostalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGPOSTALCODE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPPINGPOSTALCODE$24);
            }
            target.setStringValue(shippingPostalCode);
        }
    }
    
    /**
     * Sets (as xml) the "ShippingPostalCode" element
     */
    public void xsetShippingPostalCode(org.apache.xmlbeans.XmlString shippingPostalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGPOSTALCODE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPPINGPOSTALCODE$24);
            }
            target.set(shippingPostalCode);
        }
    }
    
    /**
     * Nils the "ShippingPostalCode" element
     */
    public void setNilShippingPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGPOSTALCODE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPPINGPOSTALCODE$24);
            }
            target.setNil();
        }
    }
}
