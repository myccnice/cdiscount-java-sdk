/*
 * XML Type:  Seller
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.Seller
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML Seller(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class SellerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.Seller
{
    private static final long serialVersionUID = 1L;
    
    public SellerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMAIL$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Email");
    private static final javax.xml.namespace.QName ISAVAILABLE$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "IsAvailable");
    private static final javax.xml.namespace.QName LOGIN$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Login");
    private static final javax.xml.namespace.QName MOBILENUMBER$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "MobileNumber");
    private static final javax.xml.namespace.QName PHONENUMBER$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "PhoneNumber");
    private static final javax.xml.namespace.QName SELLERADDRESS$10 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerAddress");
    private static final javax.xml.namespace.QName SHOPNAME$12 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ShopName");
    private static final javax.xml.namespace.QName SHOPURL$14 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ShopUrl");
    private static final javax.xml.namespace.QName SIRETNUMBER$16 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SiretNumber");
    private static final javax.xml.namespace.QName STATE$18 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "State");
    
    
    /**
     * Gets the "Email" element
     */
    public java.lang.String getEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$0, 0);
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
            return get_store().count_elements(EMAIL$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$0);
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
            get_store().remove_element(EMAIL$0, 0);
        }
    }
    
    /**
     * Gets the "IsAvailable" element
     */
    public com.cdiscount.www.SellerSubStateEnum.Enum getIsAvailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISAVAILABLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.SellerSubStateEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsAvailable" element
     */
    public com.cdiscount.www.SellerSubStateEnum xgetIsAvailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerSubStateEnum target = null;
            target = (com.cdiscount.www.SellerSubStateEnum)get_store().find_element_user(ISAVAILABLE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsAvailable" element
     */
    public boolean isSetIsAvailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISAVAILABLE$2) != 0;
        }
    }
    
    /**
     * Sets the "IsAvailable" element
     */
    public void setIsAvailable(com.cdiscount.www.SellerSubStateEnum.Enum isAvailable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISAVAILABLE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISAVAILABLE$2);
            }
            target.setEnumValue(isAvailable);
        }
    }
    
    /**
     * Sets (as xml) the "IsAvailable" element
     */
    public void xsetIsAvailable(com.cdiscount.www.SellerSubStateEnum isAvailable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerSubStateEnum target = null;
            target = (com.cdiscount.www.SellerSubStateEnum)get_store().find_element_user(ISAVAILABLE$2, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SellerSubStateEnum)get_store().add_element_user(ISAVAILABLE$2);
            }
            target.set(isAvailable);
        }
    }
    
    /**
     * Unsets the "IsAvailable" element
     */
    public void unsetIsAvailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISAVAILABLE$2, 0);
        }
    }
    
    /**
     * Gets the "Login" element
     */
    public java.lang.String getLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGIN$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Login" element
     */
    public org.apache.xmlbeans.XmlString xgetLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGIN$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Login" element
     */
    public boolean isNilLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGIN$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Login" element
     */
    public boolean isSetLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGIN$4) != 0;
        }
    }
    
    /**
     * Sets the "Login" element
     */
    public void setLogin(java.lang.String login)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGIN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGIN$4);
            }
            target.setStringValue(login);
        }
    }
    
    /**
     * Sets (as xml) the "Login" element
     */
    public void xsetLogin(org.apache.xmlbeans.XmlString login)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGIN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGIN$4);
            }
            target.set(login);
        }
    }
    
    /**
     * Nils the "Login" element
     */
    public void setNilLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGIN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGIN$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Login" element
     */
    public void unsetLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGIN$4, 0);
        }
    }
    
    /**
     * Gets the "MobileNumber" element
     */
    public java.lang.String getMobileNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILENUMBER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MobileNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetMobileNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILENUMBER$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "MobileNumber" element
     */
    public boolean isNilMobileNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILENUMBER$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "MobileNumber" element
     */
    public boolean isSetMobileNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOBILENUMBER$6) != 0;
        }
    }
    
    /**
     * Sets the "MobileNumber" element
     */
    public void setMobileNumber(java.lang.String mobileNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILENUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOBILENUMBER$6);
            }
            target.setStringValue(mobileNumber);
        }
    }
    
    /**
     * Sets (as xml) the "MobileNumber" element
     */
    public void xsetMobileNumber(org.apache.xmlbeans.XmlString mobileNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILENUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOBILENUMBER$6);
            }
            target.set(mobileNumber);
        }
    }
    
    /**
     * Nils the "MobileNumber" element
     */
    public void setNilMobileNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILENUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOBILENUMBER$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "MobileNumber" element
     */
    public void unsetMobileNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOBILENUMBER$6, 0);
        }
    }
    
    /**
     * Gets the "PhoneNumber" element
     */
    public java.lang.String getPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONENUMBER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PhoneNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONENUMBER$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PhoneNumber" element
     */
    public boolean isNilPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONENUMBER$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PhoneNumber" element
     */
    public boolean isSetPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHONENUMBER$8) != 0;
        }
    }
    
    /**
     * Sets the "PhoneNumber" element
     */
    public void setPhoneNumber(java.lang.String phoneNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONENUMBER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONENUMBER$8);
            }
            target.setStringValue(phoneNumber);
        }
    }
    
    /**
     * Sets (as xml) the "PhoneNumber" element
     */
    public void xsetPhoneNumber(org.apache.xmlbeans.XmlString phoneNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONENUMBER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONENUMBER$8);
            }
            target.set(phoneNumber);
        }
    }
    
    /**
     * Nils the "PhoneNumber" element
     */
    public void setNilPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONENUMBER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONENUMBER$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PhoneNumber" element
     */
    public void unsetPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHONENUMBER$8, 0);
        }
    }
    
    /**
     * Gets the "SellerAddress" element
     */
    public com.cdiscount.www.Address getSellerAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Address target = null;
            target = (com.cdiscount.www.Address)get_store().find_element_user(SELLERADDRESS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerAddress" element
     */
    public boolean isNilSellerAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Address target = null;
            target = (com.cdiscount.www.Address)get_store().find_element_user(SELLERADDRESS$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SellerAddress" element
     */
    public boolean isSetSellerAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELLERADDRESS$10) != 0;
        }
    }
    
    /**
     * Sets the "SellerAddress" element
     */
    public void setSellerAddress(com.cdiscount.www.Address sellerAddress)
    {
        generatedSetterHelperImpl(sellerAddress, SELLERADDRESS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SellerAddress" element
     */
    public com.cdiscount.www.Address addNewSellerAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Address target = null;
            target = (com.cdiscount.www.Address)get_store().add_element_user(SELLERADDRESS$10);
            return target;
        }
    }
    
    /**
     * Nils the "SellerAddress" element
     */
    public void setNilSellerAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Address target = null;
            target = (com.cdiscount.www.Address)get_store().find_element_user(SELLERADDRESS$10, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.Address)get_store().add_element_user(SELLERADDRESS$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SellerAddress" element
     */
    public void unsetSellerAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELLERADDRESS$10, 0);
        }
    }
    
    /**
     * Gets the "ShopName" element
     */
    public java.lang.String getShopName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHOPNAME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShopName" element
     */
    public org.apache.xmlbeans.XmlString xgetShopName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHOPNAME$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ShopName" element
     */
    public boolean isNilShopName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHOPNAME$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ShopName" element
     */
    public boolean isSetShopName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHOPNAME$12) != 0;
        }
    }
    
    /**
     * Sets the "ShopName" element
     */
    public void setShopName(java.lang.String shopName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHOPNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHOPNAME$12);
            }
            target.setStringValue(shopName);
        }
    }
    
    /**
     * Sets (as xml) the "ShopName" element
     */
    public void xsetShopName(org.apache.xmlbeans.XmlString shopName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHOPNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHOPNAME$12);
            }
            target.set(shopName);
        }
    }
    
    /**
     * Nils the "ShopName" element
     */
    public void setNilShopName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHOPNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHOPNAME$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ShopName" element
     */
    public void unsetShopName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHOPNAME$12, 0);
        }
    }
    
    /**
     * Gets the "ShopUrl" element
     */
    public java.lang.String getShopUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHOPURL$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShopUrl" element
     */
    public org.apache.xmlbeans.XmlString xgetShopUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHOPURL$14, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ShopUrl" element
     */
    public boolean isNilShopUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHOPURL$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ShopUrl" element
     */
    public boolean isSetShopUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHOPURL$14) != 0;
        }
    }
    
    /**
     * Sets the "ShopUrl" element
     */
    public void setShopUrl(java.lang.String shopUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHOPURL$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHOPURL$14);
            }
            target.setStringValue(shopUrl);
        }
    }
    
    /**
     * Sets (as xml) the "ShopUrl" element
     */
    public void xsetShopUrl(org.apache.xmlbeans.XmlString shopUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHOPURL$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHOPURL$14);
            }
            target.set(shopUrl);
        }
    }
    
    /**
     * Nils the "ShopUrl" element
     */
    public void setNilShopUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHOPURL$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHOPURL$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ShopUrl" element
     */
    public void unsetShopUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHOPURL$14, 0);
        }
    }
    
    /**
     * Gets the "SiretNumber" element
     */
    public java.lang.String getSiretNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIRETNUMBER$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SiretNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetSiretNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIRETNUMBER$16, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SiretNumber" element
     */
    public boolean isNilSiretNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIRETNUMBER$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SiretNumber" element
     */
    public boolean isSetSiretNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIRETNUMBER$16) != 0;
        }
    }
    
    /**
     * Sets the "SiretNumber" element
     */
    public void setSiretNumber(java.lang.String siretNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIRETNUMBER$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIRETNUMBER$16);
            }
            target.setStringValue(siretNumber);
        }
    }
    
    /**
     * Sets (as xml) the "SiretNumber" element
     */
    public void xsetSiretNumber(org.apache.xmlbeans.XmlString siretNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIRETNUMBER$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIRETNUMBER$16);
            }
            target.set(siretNumber);
        }
    }
    
    /**
     * Nils the "SiretNumber" element
     */
    public void setNilSiretNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIRETNUMBER$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIRETNUMBER$16);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SiretNumber" element
     */
    public void unsetSiretNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIRETNUMBER$16, 0);
        }
    }
    
    /**
     * Gets the "State" element
     */
    public com.cdiscount.www.SellerStateEnum.Enum getState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$18, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.SellerStateEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "State" element
     */
    public com.cdiscount.www.SellerStateEnum xgetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerStateEnum target = null;
            target = (com.cdiscount.www.SellerStateEnum)get_store().find_element_user(STATE$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "State" element
     */
    public boolean isSetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATE$18) != 0;
        }
    }
    
    /**
     * Sets the "State" element
     */
    public void setState(com.cdiscount.www.SellerStateEnum.Enum state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$18);
            }
            target.setEnumValue(state);
        }
    }
    
    /**
     * Sets (as xml) the "State" element
     */
    public void xsetState(com.cdiscount.www.SellerStateEnum state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.SellerStateEnum target = null;
            target = (com.cdiscount.www.SellerStateEnum)get_store().find_element_user(STATE$18, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.SellerStateEnum)get_store().add_element_user(STATE$18);
            }
            target.set(state);
        }
    }
    
    /**
     * Unsets the "State" element
     */
    public void unsetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATE$18, 0);
        }
    }
}
