/*
 * XML Type:  SellerMessage
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.SellerMessage
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML SellerMessage(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class SellerMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements com.cdiscount.www.SellerMessage
{
    private static final long serialVersionUID = 1L;
    
    public SellerMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELIVERYMODES$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DeliveryModes");
    private static final javax.xml.namespace.QName OFFERPOOLLIST$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferPoolList");
    private static final javax.xml.namespace.QName SELLER$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Seller");
    
    
    /**
     * Gets the "DeliveryModes" element
     */
    public com.cdiscount.www.ArrayOfDeliveryModeInformation getDeliveryModes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDeliveryModeInformation target = null;
            target = (com.cdiscount.www.ArrayOfDeliveryModeInformation)get_store().find_element_user(DELIVERYMODES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DeliveryModes" element
     */
    public boolean isNilDeliveryModes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDeliveryModeInformation target = null;
            target = (com.cdiscount.www.ArrayOfDeliveryModeInformation)get_store().find_element_user(DELIVERYMODES$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "DeliveryModes" element
     */
    public boolean isSetDeliveryModes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIVERYMODES$0) != 0;
        }
    }
    
    /**
     * Sets the "DeliveryModes" element
     */
    public void setDeliveryModes(com.cdiscount.www.ArrayOfDeliveryModeInformation deliveryModes)
    {
        generatedSetterHelperImpl(deliveryModes, DELIVERYMODES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DeliveryModes" element
     */
    public com.cdiscount.www.ArrayOfDeliveryModeInformation addNewDeliveryModes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDeliveryModeInformation target = null;
            target = (com.cdiscount.www.ArrayOfDeliveryModeInformation)get_store().add_element_user(DELIVERYMODES$0);
            return target;
        }
    }
    
    /**
     * Nils the "DeliveryModes" element
     */
    public void setNilDeliveryModes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDeliveryModeInformation target = null;
            target = (com.cdiscount.www.ArrayOfDeliveryModeInformation)get_store().find_element_user(DELIVERYMODES$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfDeliveryModeInformation)get_store().add_element_user(DELIVERYMODES$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "DeliveryModes" element
     */
    public void unsetDeliveryModes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIVERYMODES$0, 0);
        }
    }
    
    /**
     * Gets the "OfferPoolList" element
     */
    public com.cdiscount.www.ArrayOfOfferPool getOfferPoolList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferPool target = null;
            target = (com.cdiscount.www.ArrayOfOfferPool)get_store().find_element_user(OFFERPOOLLIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferPoolList" element
     */
    public boolean isNilOfferPoolList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferPool target = null;
            target = (com.cdiscount.www.ArrayOfOfferPool)get_store().find_element_user(OFFERPOOLLIST$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OfferPoolList" element
     */
    public boolean isSetOfferPoolList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFERPOOLLIST$2) != 0;
        }
    }
    
    /**
     * Sets the "OfferPoolList" element
     */
    public void setOfferPoolList(com.cdiscount.www.ArrayOfOfferPool offerPoolList)
    {
        generatedSetterHelperImpl(offerPoolList, OFFERPOOLLIST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OfferPoolList" element
     */
    public com.cdiscount.www.ArrayOfOfferPool addNewOfferPoolList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferPool target = null;
            target = (com.cdiscount.www.ArrayOfOfferPool)get_store().add_element_user(OFFERPOOLLIST$2);
            return target;
        }
    }
    
    /**
     * Nils the "OfferPoolList" element
     */
    public void setNilOfferPoolList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfOfferPool target = null;
            target = (com.cdiscount.www.ArrayOfOfferPool)get_store().find_element_user(OFFERPOOLLIST$2, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfOfferPool)get_store().add_element_user(OFFERPOOLLIST$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OfferPoolList" element
     */
    public void unsetOfferPoolList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFERPOOLLIST$2, 0);
        }
    }
    
    /**
     * Gets the "Seller" element
     */
    public com.cdiscount.www.Seller getSeller()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Seller target = null;
            target = (com.cdiscount.www.Seller)get_store().find_element_user(SELLER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Seller" element
     */
    public boolean isNilSeller()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Seller target = null;
            target = (com.cdiscount.www.Seller)get_store().find_element_user(SELLER$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Seller" element
     */
    public boolean isSetSeller()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELLER$4) != 0;
        }
    }
    
    /**
     * Sets the "Seller" element
     */
    public void setSeller(com.cdiscount.www.Seller seller)
    {
        generatedSetterHelperImpl(seller, SELLER$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Seller" element
     */
    public com.cdiscount.www.Seller addNewSeller()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Seller target = null;
            target = (com.cdiscount.www.Seller)get_store().add_element_user(SELLER$4);
            return target;
        }
    }
    
    /**
     * Nils the "Seller" element
     */
    public void setNilSeller()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.Seller target = null;
            target = (com.cdiscount.www.Seller)get_store().find_element_user(SELLER$4, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.Seller)get_store().add_element_user(SELLER$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Seller" element
     */
    public void unsetSeller()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELLER$4, 0);
        }
    }
}
