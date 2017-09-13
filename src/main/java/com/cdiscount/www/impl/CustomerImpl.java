/*
 * XML Type:  Customer
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.Customer
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML Customer(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class CustomerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.Customer
{
    private static final long serialVersionUID = 1L;
    
    public CustomerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CIVILITY$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Civility");
    private static final javax.xml.namespace.QName CUSTOMERID$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CustomerId");
    private static final javax.xml.namespace.QName EMAIL$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Email");
    private static final javax.xml.namespace.QName ENCRYPTEDEMAIL$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "EncryptedEmail");
    private static final javax.xml.namespace.QName FIRSTNAME$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "FirstName");
    private static final javax.xml.namespace.QName LASTNAME$10 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "LastName");
    private static final javax.xml.namespace.QName MOBILEPHONE$12 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "MobilePhone");
    private static final javax.xml.namespace.QName PHONE$14 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Phone");
    private static final javax.xml.namespace.QName SHIPPINGFIRSTNAME$16 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ShippingFirstName");
    private static final javax.xml.namespace.QName SHIPPINGLASTNAME$18 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ShippingLastName");
    
    
    /**
     * Gets the "Civility" element
     */
    public com.cdiscount.www.Civility.Enum getCivility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIVILITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.Civility.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Civility" element
     */
    public com.cdiscount.www.Civility xgetCivility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Civility target = null;
            target = (com.cdiscount.www.Civility)get_store().find_element_user(CIVILITY$0, 0);
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
            com.cdiscount.www.Civility target = null;
            target = (com.cdiscount.www.Civility)get_store().find_element_user(CIVILITY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Civility" element
     */
    public boolean isSetCivility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CIVILITY$0) != 0;
        }
    }
    
    /**
     * Sets the "Civility" element
     */
    public void setCivility(com.cdiscount.www.Civility.Enum civility)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIVILITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CIVILITY$0);
            }
            target.setEnumValue(civility);
        }
    }
    
    /**
     * Sets (as xml) the "Civility" element
     */
    public void xsetCivility(com.cdiscount.www.Civility civility)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Civility target = null;
            target = (com.cdiscount.www.Civility)get_store().find_element_user(CIVILITY$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.Civility)get_store().add_element_user(CIVILITY$0);
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
            com.cdiscount.www.Civility target = null;
            target = (com.cdiscount.www.Civility)get_store().find_element_user(CIVILITY$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.Civility)get_store().add_element_user(CIVILITY$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Civility" element
     */
    public void unsetCivility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CIVILITY$0, 0);
        }
    }
    
    /**
     * Gets the "CustomerId" element
     */
    public java.lang.String getCustomerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CustomerId" element
     */
    public org.apache.xmlbeans.XmlString xgetCustomerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERID$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CustomerId" element
     */
    public boolean isNilCustomerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERID$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CustomerId" element
     */
    public boolean isSetCustomerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERID$2) != 0;
        }
    }
    
    /**
     * Sets the "CustomerId" element
     */
    public void setCustomerId(java.lang.String customerId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMERID$2);
            }
            target.setStringValue(customerId);
        }
    }
    
    /**
     * Sets (as xml) the "CustomerId" element
     */
    public void xsetCustomerId(org.apache.xmlbeans.XmlString customerId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMERID$2);
            }
            target.set(customerId);
        }
    }
    
    /**
     * Nils the "CustomerId" element
     */
    public void setNilCustomerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMERID$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CustomerId" element
     */
    public void unsetCustomerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERID$2, 0);
        }
    }
    
    /**
     * Gets the "Email" element
     */
    public java.lang.String getEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Email" element
     */
    public org.apache.xmlbeans.XmlString xgetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Email" element
     */
    public boolean isNilEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Email" element
     */
    public boolean isSetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAIL$4) != 0;
        }
    }
    
    /**
     * Sets the "Email" element
     */
    public void setEmail(java.lang.String email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$4);
            }
            target.setStringValue(email);
        }
    }
    
    /**
     * Sets (as xml) the "Email" element
     */
    public void xsetEmail(org.apache.xmlbeans.XmlString email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$4);
            }
            target.set(email);
        }
    }
    
    /**
     * Nils the "Email" element
     */
    public void setNilEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Email" element
     */
    public void unsetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAIL$4, 0);
        }
    }
    
    /**
     * Gets the "EncryptedEmail" element
     */
    public java.lang.String getEncryptedEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCRYPTEDEMAIL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EncryptedEmail" element
     */
    public org.apache.xmlbeans.XmlString xgetEncryptedEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENCRYPTEDEMAIL$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EncryptedEmail" element
     */
    public boolean isNilEncryptedEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENCRYPTEDEMAIL$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EncryptedEmail" element
     */
    public boolean isSetEncryptedEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENCRYPTEDEMAIL$6) != 0;
        }
    }
    
    /**
     * Sets the "EncryptedEmail" element
     */
    public void setEncryptedEmail(java.lang.String encryptedEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCRYPTEDEMAIL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENCRYPTEDEMAIL$6);
            }
            target.setStringValue(encryptedEmail);
        }
    }
    
    /**
     * Sets (as xml) the "EncryptedEmail" element
     */
    public void xsetEncryptedEmail(org.apache.xmlbeans.XmlString encryptedEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENCRYPTEDEMAIL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENCRYPTEDEMAIL$6);
            }
            target.set(encryptedEmail);
        }
    }
    
    /**
     * Nils the "EncryptedEmail" element
     */
    public void setNilEncryptedEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENCRYPTEDEMAIL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENCRYPTEDEMAIL$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EncryptedEmail" element
     */
    public void unsetEncryptedEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENCRYPTEDEMAIL$6, 0);
        }
    }
    
    /**
     * Gets the "FirstName" element
     */
    public java.lang.String getFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTNAME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FirstName" element
     */
    public org.apache.xmlbeans.XmlString xgetFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRSTNAME$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "FirstName" element
     */
    public boolean isNilFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRSTNAME$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "FirstName" element
     */
    public boolean isSetFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIRSTNAME$8) != 0;
        }
    }
    
    /**
     * Sets the "FirstName" element
     */
    public void setFirstName(java.lang.String firstName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRSTNAME$8);
            }
            target.setStringValue(firstName);
        }
    }
    
    /**
     * Sets (as xml) the "FirstName" element
     */
    public void xsetFirstName(org.apache.xmlbeans.XmlString firstName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRSTNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIRSTNAME$8);
            }
            target.set(firstName);
        }
    }
    
    /**
     * Nils the "FirstName" element
     */
    public void setNilFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRSTNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIRSTNAME$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "FirstName" element
     */
    public void unsetFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIRSTNAME$8, 0);
        }
    }
    
    /**
     * Gets the "LastName" element
     */
    public java.lang.String getLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTNAME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LastName" element
     */
    public org.apache.xmlbeans.XmlString xgetLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTNAME$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "LastName" element
     */
    public boolean isNilLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTNAME$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "LastName" element
     */
    public boolean isSetLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTNAME$10) != 0;
        }
    }
    
    /**
     * Sets the "LastName" element
     */
    public void setLastName(java.lang.String lastName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTNAME$10);
            }
            target.setStringValue(lastName);
        }
    }
    
    /**
     * Sets (as xml) the "LastName" element
     */
    public void xsetLastName(org.apache.xmlbeans.XmlString lastName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LASTNAME$10);
            }
            target.set(lastName);
        }
    }
    
    /**
     * Nils the "LastName" element
     */
    public void setNilLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LASTNAME$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "LastName" element
     */
    public void unsetLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTNAME$10, 0);
        }
    }
    
    /**
     * Gets the "MobilePhone" element
     */
    public java.lang.String getMobilePhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILEPHONE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MobilePhone" element
     */
    public org.apache.xmlbeans.XmlString xgetMobilePhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILEPHONE$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "MobilePhone" element
     */
    public boolean isNilMobilePhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILEPHONE$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "MobilePhone" element
     */
    public boolean isSetMobilePhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOBILEPHONE$12) != 0;
        }
    }
    
    /**
     * Sets the "MobilePhone" element
     */
    public void setMobilePhone(java.lang.String mobilePhone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILEPHONE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOBILEPHONE$12);
            }
            target.setStringValue(mobilePhone);
        }
    }
    
    /**
     * Sets (as xml) the "MobilePhone" element
     */
    public void xsetMobilePhone(org.apache.xmlbeans.XmlString mobilePhone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILEPHONE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOBILEPHONE$12);
            }
            target.set(mobilePhone);
        }
    }
    
    /**
     * Nils the "MobilePhone" element
     */
    public void setNilMobilePhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILEPHONE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOBILEPHONE$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "MobilePhone" element
     */
    public void unsetMobilePhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOBILEPHONE$12, 0);
        }
    }
    
    /**
     * Gets the "Phone" element
     */
    public java.lang.String getPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Phone" element
     */
    public org.apache.xmlbeans.XmlString xgetPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$14, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Phone" element
     */
    public boolean isNilPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Phone" element
     */
    public boolean isSetPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHONE$14) != 0;
        }
    }
    
    /**
     * Sets the "Phone" element
     */
    public void setPhone(java.lang.String phone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONE$14);
            }
            target.setStringValue(phone);
        }
    }
    
    /**
     * Sets (as xml) the "Phone" element
     */
    public void xsetPhone(org.apache.xmlbeans.XmlString phone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONE$14);
            }
            target.set(phone);
        }
    }
    
    /**
     * Nils the "Phone" element
     */
    public void setNilPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONE$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Phone" element
     */
    public void unsetPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHONE$14, 0);
        }
    }
    
    /**
     * Gets the "ShippingFirstName" element
     */
    public java.lang.String getShippingFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGFIRSTNAME$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShippingFirstName" element
     */
    public org.apache.xmlbeans.XmlString xgetShippingFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGFIRSTNAME$16, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ShippingFirstName" element
     */
    public boolean isNilShippingFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGFIRSTNAME$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ShippingFirstName" element
     */
    public boolean isSetShippingFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPPINGFIRSTNAME$16) != 0;
        }
    }
    
    /**
     * Sets the "ShippingFirstName" element
     */
    public void setShippingFirstName(java.lang.String shippingFirstName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGFIRSTNAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPPINGFIRSTNAME$16);
            }
            target.setStringValue(shippingFirstName);
        }
    }
    
    /**
     * Sets (as xml) the "ShippingFirstName" element
     */
    public void xsetShippingFirstName(org.apache.xmlbeans.XmlString shippingFirstName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGFIRSTNAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPPINGFIRSTNAME$16);
            }
            target.set(shippingFirstName);
        }
    }
    
    /**
     * Nils the "ShippingFirstName" element
     */
    public void setNilShippingFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGFIRSTNAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPPINGFIRSTNAME$16);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ShippingFirstName" element
     */
    public void unsetShippingFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPPINGFIRSTNAME$16, 0);
        }
    }
    
    /**
     * Gets the "ShippingLastName" element
     */
    public java.lang.String getShippingLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGLASTNAME$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShippingLastName" element
     */
    public org.apache.xmlbeans.XmlString xgetShippingLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGLASTNAME$18, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ShippingLastName" element
     */
    public boolean isNilShippingLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGLASTNAME$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ShippingLastName" element
     */
    public boolean isSetShippingLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPPINGLASTNAME$18) != 0;
        }
    }
    
    /**
     * Sets the "ShippingLastName" element
     */
    public void setShippingLastName(java.lang.String shippingLastName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPPINGLASTNAME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPPINGLASTNAME$18);
            }
            target.setStringValue(shippingLastName);
        }
    }
    
    /**
     * Sets (as xml) the "ShippingLastName" element
     */
    public void xsetShippingLastName(org.apache.xmlbeans.XmlString shippingLastName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGLASTNAME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPPINGLASTNAME$18);
            }
            target.set(shippingLastName);
        }
    }
    
    /**
     * Nils the "ShippingLastName" element
     */
    public void setNilShippingLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPPINGLASTNAME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPPINGLASTNAME$18);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ShippingLastName" element
     */
    public void unsetShippingLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPPINGLASTNAME$18, 0);
        }
    }
}
