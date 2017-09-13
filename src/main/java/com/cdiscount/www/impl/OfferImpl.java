/*
 * XML Type:  Offer
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.Offer
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML Offer(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class OfferImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.Offer
{
    private static final long serialVersionUID = 1L;
    
    public OfferImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BESTSHIPPINGCHARGES$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "BestShippingCharges");
    private static final javax.xml.namespace.QName COMMENTS$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Comments");
    private static final javax.xml.namespace.QName CREATIONDATE$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "CreationDate");
    private static final javax.xml.namespace.QName DEATAX$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DeaTax");
    private static final javax.xml.namespace.QName DISCOUNTLIST$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DiscountList");
    private static final javax.xml.namespace.QName ECOTAX$10 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "EcoTax");
    private static final javax.xml.namespace.QName INTEGRATIONPRICE$12 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "IntegrationPrice");
    private static final javax.xml.namespace.QName ISCDAV$14 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "IsCDAV");
    private static final javax.xml.namespace.QName LASTUPDATEDATE$16 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "LastUpdateDate");
    private static final javax.xml.namespace.QName MINIMUMPRICEFORPRICEALIGNMENT$18 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "MinimumPriceForPriceAlignment");
    private static final javax.xml.namespace.QName OFFERBENCHMARK$20 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferBenchMark");
    private static final javax.xml.namespace.QName OFFERPOOLLIST$22 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferPoolList");
    private static final javax.xml.namespace.QName OFFERSTATE$24 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "OfferState");
    private static final javax.xml.namespace.QName PARENTPRODUCTID$26 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ParentProductId");
    private static final javax.xml.namespace.QName PRICE$28 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Price");
    private static final javax.xml.namespace.QName PRICEMUSTBEALIGNED$30 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "PriceMustBeAligned");
    private static final javax.xml.namespace.QName PRODUCTCONDITION$32 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductCondition");
    private static final javax.xml.namespace.QName PRODUCTEAN$34 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductEan");
    private static final javax.xml.namespace.QName PRODUCTID$36 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductId");
    private static final javax.xml.namespace.QName PRODUCTPACKAGINGUNIT$38 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductPackagingUnit");
    private static final javax.xml.namespace.QName PRODUCTPACKAGINGUNITPRICE$40 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductPackagingUnitPrice");
    private static final javax.xml.namespace.QName PRODUCTPACKAGINGVALUE$42 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ProductPackagingValue");
    private static final javax.xml.namespace.QName SELLERPRODUCTID$44 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "SellerProductId");
    private static final javax.xml.namespace.QName SHIPPINGINFORMATIONLIST$46 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ShippingInformationList");
    private static final javax.xml.namespace.QName STOCK$48 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Stock");
    private static final javax.xml.namespace.QName STRIKEDPRICE$50 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "StrikedPrice");
    private static final javax.xml.namespace.QName VATRATE$52 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "VatRate");
    
    
    /**
     * Gets the "BestShippingCharges" element
     */
    public java.math.BigDecimal getBestShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BESTSHIPPINGCHARGES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "BestShippingCharges" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetBestShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(BESTSHIPPINGCHARGES$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "BestShippingCharges" element
     */
    public boolean isSetBestShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BESTSHIPPINGCHARGES$0) != 0;
        }
    }
    
    /**
     * Sets the "BestShippingCharges" element
     */
    public void setBestShippingCharges(java.math.BigDecimal bestShippingCharges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BESTSHIPPINGCHARGES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BESTSHIPPINGCHARGES$0);
            }
            target.setBigDecimalValue(bestShippingCharges);
        }
    }
    
    /**
     * Sets (as xml) the "BestShippingCharges" element
     */
    public void xsetBestShippingCharges(org.apache.xmlbeans.XmlDecimal bestShippingCharges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(BESTSHIPPINGCHARGES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(BESTSHIPPINGCHARGES$0);
            }
            target.set(bestShippingCharges);
        }
    }
    
    /**
     * Unsets the "BestShippingCharges" element
     */
    public void unsetBestShippingCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BESTSHIPPINGCHARGES$0, 0);
        }
    }
    
    /**
     * Gets the "Comments" element
     */
    public java.lang.String getComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENTS$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENTS$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENTS$2, 0);
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
            return get_store().count_elements(COMMENTS$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENTS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMENTS$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENTS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMENTS$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENTS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMENTS$2);
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
            get_store().remove_element(COMMENTS$2, 0);
        }
    }
    
    /**
     * Gets the "CreationDate" element
     */
    public java.util.Calendar getCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATIONDATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CreationDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATIONDATE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "CreationDate" element
     */
    public boolean isSetCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATIONDATE$4) != 0;
        }
    }
    
    /**
     * Sets the "CreationDate" element
     */
    public void setCreationDate(java.util.Calendar creationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATIONDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATIONDATE$4);
            }
            target.setCalendarValue(creationDate);
        }
    }
    
    /**
     * Sets (as xml) the "CreationDate" element
     */
    public void xsetCreationDate(org.apache.xmlbeans.XmlDateTime creationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATIONDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATIONDATE$4);
            }
            target.set(creationDate);
        }
    }
    
    /**
     * Unsets the "CreationDate" element
     */
    public void unsetCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATIONDATE$4, 0);
        }
    }
    
    /**
     * Gets the "DeaTax" element
     */
    public java.math.BigDecimal getDeaTax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEATAX$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeaTax" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetDeaTax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(DEATAX$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "DeaTax" element
     */
    public boolean isSetDeaTax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEATAX$6) != 0;
        }
    }
    
    /**
     * Sets the "DeaTax" element
     */
    public void setDeaTax(java.math.BigDecimal deaTax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEATAX$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEATAX$6);
            }
            target.setBigDecimalValue(deaTax);
        }
    }
    
    /**
     * Sets (as xml) the "DeaTax" element
     */
    public void xsetDeaTax(org.apache.xmlbeans.XmlDecimal deaTax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(DEATAX$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(DEATAX$6);
            }
            target.set(deaTax);
        }
    }
    
    /**
     * Unsets the "DeaTax" element
     */
    public void unsetDeaTax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEATAX$6, 0);
        }
    }
    
    /**
     * Gets the "DiscountList" element
     */
    public com.cdiscount.www.ArrayOfDiscountComponent getDiscountList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDiscountComponent target = null;
            target = (com.cdiscount.www.ArrayOfDiscountComponent)get_store().find_element_user(DISCOUNTLIST$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DiscountList" element
     */
    public boolean isNilDiscountList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDiscountComponent target = null;
            target = (com.cdiscount.www.ArrayOfDiscountComponent)get_store().find_element_user(DISCOUNTLIST$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "DiscountList" element
     */
    public boolean isSetDiscountList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCOUNTLIST$8) != 0;
        }
    }
    
    /**
     * Sets the "DiscountList" element
     */
    public void setDiscountList(com.cdiscount.www.ArrayOfDiscountComponent discountList)
    {
        generatedSetterHelperImpl(discountList, DISCOUNTLIST$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DiscountList" element
     */
    public com.cdiscount.www.ArrayOfDiscountComponent addNewDiscountList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDiscountComponent target = null;
            target = (com.cdiscount.www.ArrayOfDiscountComponent)get_store().add_element_user(DISCOUNTLIST$8);
            return target;
        }
    }
    
    /**
     * Nils the "DiscountList" element
     */
    public void setNilDiscountList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfDiscountComponent target = null;
            target = (com.cdiscount.www.ArrayOfDiscountComponent)get_store().find_element_user(DISCOUNTLIST$8, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfDiscountComponent)get_store().add_element_user(DISCOUNTLIST$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "DiscountList" element
     */
    public void unsetDiscountList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCOUNTLIST$8, 0);
        }
    }
    
    /**
     * Gets the "EcoTax" element
     */
    public java.math.BigDecimal getEcoTax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ECOTAX$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "EcoTax" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetEcoTax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(ECOTAX$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "EcoTax" element
     */
    public boolean isSetEcoTax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ECOTAX$10) != 0;
        }
    }
    
    /**
     * Sets the "EcoTax" element
     */
    public void setEcoTax(java.math.BigDecimal ecoTax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ECOTAX$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ECOTAX$10);
            }
            target.setBigDecimalValue(ecoTax);
        }
    }
    
    /**
     * Sets (as xml) the "EcoTax" element
     */
    public void xsetEcoTax(org.apache.xmlbeans.XmlDecimal ecoTax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(ECOTAX$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(ECOTAX$10);
            }
            target.set(ecoTax);
        }
    }
    
    /**
     * Unsets the "EcoTax" element
     */
    public void unsetEcoTax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ECOTAX$10, 0);
        }
    }
    
    /**
     * Gets the "IntegrationPrice" element
     */
    public java.math.BigDecimal getIntegrationPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGRATIONPRICE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "IntegrationPrice" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetIntegrationPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(INTEGRATIONPRICE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "IntegrationPrice" element
     */
    public boolean isSetIntegrationPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTEGRATIONPRICE$12) != 0;
        }
    }
    
    /**
     * Sets the "IntegrationPrice" element
     */
    public void setIntegrationPrice(java.math.BigDecimal integrationPrice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGRATIONPRICE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTEGRATIONPRICE$12);
            }
            target.setBigDecimalValue(integrationPrice);
        }
    }
    
    /**
     * Sets (as xml) the "IntegrationPrice" element
     */
    public void xsetIntegrationPrice(org.apache.xmlbeans.XmlDecimal integrationPrice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(INTEGRATIONPRICE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(INTEGRATIONPRICE$12);
            }
            target.set(integrationPrice);
        }
    }
    
    /**
     * Unsets the "IntegrationPrice" element
     */
    public void unsetIntegrationPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTEGRATIONPRICE$12, 0);
        }
    }
    
    /**
     * Gets the "IsCDAV" element
     */
    public boolean getIsCDAV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCDAV$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsCDAV" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsCDAV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCDAV$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsCDAV" element
     */
    public boolean isSetIsCDAV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISCDAV$14) != 0;
        }
    }
    
    /**
     * Sets the "IsCDAV" element
     */
    public void setIsCDAV(boolean isCDAV)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCDAV$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISCDAV$14);
            }
            target.setBooleanValue(isCDAV);
        }
    }
    
    /**
     * Sets (as xml) the "IsCDAV" element
     */
    public void xsetIsCDAV(org.apache.xmlbeans.XmlBoolean isCDAV)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCDAV$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISCDAV$14);
            }
            target.set(isCDAV);
        }
    }
    
    /**
     * Unsets the "IsCDAV" element
     */
    public void unsetIsCDAV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISCDAV$14, 0);
        }
    }
    
    /**
     * Gets the "LastUpdateDate" element
     */
    public java.util.Calendar getLastUpdateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATEDATE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "LastUpdateDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetLastUpdateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTUPDATEDATE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "LastUpdateDate" element
     */
    public boolean isSetLastUpdateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTUPDATEDATE$16) != 0;
        }
    }
    
    /**
     * Sets the "LastUpdateDate" element
     */
    public void setLastUpdateDate(java.util.Calendar lastUpdateDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATEDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTUPDATEDATE$16);
            }
            target.setCalendarValue(lastUpdateDate);
        }
    }
    
    /**
     * Sets (as xml) the "LastUpdateDate" element
     */
    public void xsetLastUpdateDate(org.apache.xmlbeans.XmlDateTime lastUpdateDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTUPDATEDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(LASTUPDATEDATE$16);
            }
            target.set(lastUpdateDate);
        }
    }
    
    /**
     * Unsets the "LastUpdateDate" element
     */
    public void unsetLastUpdateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTUPDATEDATE$16, 0);
        }
    }
    
    /**
     * Gets the "MinimumPriceForPriceAlignment" element
     */
    public java.math.BigDecimal getMinimumPriceForPriceAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMUMPRICEFORPRICEALIGNMENT$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "MinimumPriceForPriceAlignment" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetMinimumPriceForPriceAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(MINIMUMPRICEFORPRICEALIGNMENT$18, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "MinimumPriceForPriceAlignment" element
     */
    public boolean isNilMinimumPriceForPriceAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(MINIMUMPRICEFORPRICEALIGNMENT$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "MinimumPriceForPriceAlignment" element
     */
    public boolean isSetMinimumPriceForPriceAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINIMUMPRICEFORPRICEALIGNMENT$18) != 0;
        }
    }
    
    /**
     * Sets the "MinimumPriceForPriceAlignment" element
     */
    public void setMinimumPriceForPriceAlignment(java.math.BigDecimal minimumPriceForPriceAlignment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMUMPRICEFORPRICEALIGNMENT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINIMUMPRICEFORPRICEALIGNMENT$18);
            }
            target.setBigDecimalValue(minimumPriceForPriceAlignment);
        }
    }
    
    /**
     * Sets (as xml) the "MinimumPriceForPriceAlignment" element
     */
    public void xsetMinimumPriceForPriceAlignment(org.apache.xmlbeans.XmlDecimal minimumPriceForPriceAlignment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(MINIMUMPRICEFORPRICEALIGNMENT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(MINIMUMPRICEFORPRICEALIGNMENT$18);
            }
            target.set(minimumPriceForPriceAlignment);
        }
    }
    
    /**
     * Nils the "MinimumPriceForPriceAlignment" element
     */
    public void setNilMinimumPriceForPriceAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(MINIMUMPRICEFORPRICEALIGNMENT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(MINIMUMPRICEFORPRICEALIGNMENT$18);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "MinimumPriceForPriceAlignment" element
     */
    public void unsetMinimumPriceForPriceAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINIMUMPRICEFORPRICEALIGNMENT$18, 0);
        }
    }
    
    /**
     * Gets the "OfferBenchMark" element
     */
    public com.cdiscount.www.OfferPriceBenchMark getOfferBenchMark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferPriceBenchMark target = null;
            target = (com.cdiscount.www.OfferPriceBenchMark)get_store().find_element_user(OFFERBENCHMARK$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OfferBenchMark" element
     */
    public boolean isNilOfferBenchMark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferPriceBenchMark target = null;
            target = (com.cdiscount.www.OfferPriceBenchMark)get_store().find_element_user(OFFERBENCHMARK$20, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OfferBenchMark" element
     */
    public boolean isSetOfferBenchMark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFERBENCHMARK$20) != 0;
        }
    }
    
    /**
     * Sets the "OfferBenchMark" element
     */
    public void setOfferBenchMark(com.cdiscount.www.OfferPriceBenchMark offerBenchMark)
    {
        generatedSetterHelperImpl(offerBenchMark, OFFERBENCHMARK$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OfferBenchMark" element
     */
    public com.cdiscount.www.OfferPriceBenchMark addNewOfferBenchMark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferPriceBenchMark target = null;
            target = (com.cdiscount.www.OfferPriceBenchMark)get_store().add_element_user(OFFERBENCHMARK$20);
            return target;
        }
    }
    
    /**
     * Nils the "OfferBenchMark" element
     */
    public void setNilOfferBenchMark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferPriceBenchMark target = null;
            target = (com.cdiscount.www.OfferPriceBenchMark)get_store().find_element_user(OFFERBENCHMARK$20, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferPriceBenchMark)get_store().add_element_user(OFFERBENCHMARK$20);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OfferBenchMark" element
     */
    public void unsetOfferBenchMark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFERBENCHMARK$20, 0);
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
            target = (com.cdiscount.www.ArrayOfOfferPool)get_store().find_element_user(OFFERPOOLLIST$22, 0);
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
            target = (com.cdiscount.www.ArrayOfOfferPool)get_store().find_element_user(OFFERPOOLLIST$22, 0);
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
            return get_store().count_elements(OFFERPOOLLIST$22) != 0;
        }
    }
    
    /**
     * Sets the "OfferPoolList" element
     */
    public void setOfferPoolList(com.cdiscount.www.ArrayOfOfferPool offerPoolList)
    {
        generatedSetterHelperImpl(offerPoolList, OFFERPOOLLIST$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.cdiscount.www.ArrayOfOfferPool)get_store().add_element_user(OFFERPOOLLIST$22);
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
            target = (com.cdiscount.www.ArrayOfOfferPool)get_store().find_element_user(OFFERPOOLLIST$22, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfOfferPool)get_store().add_element_user(OFFERPOOLLIST$22);
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
            get_store().remove_element(OFFERPOOLLIST$22, 0);
        }
    }
    
    /**
     * Gets the "OfferState" element
     */
    public com.cdiscount.www.OfferStateEnum.Enum getOfferState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERSTATE$24, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.OfferStateEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OfferState" element
     */
    public com.cdiscount.www.OfferStateEnum xgetOfferState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferStateEnum target = null;
            target = (com.cdiscount.www.OfferStateEnum)get_store().find_element_user(OFFERSTATE$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "OfferState" element
     */
    public boolean isSetOfferState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFERSTATE$24) != 0;
        }
    }
    
    /**
     * Sets the "OfferState" element
     */
    public void setOfferState(com.cdiscount.www.OfferStateEnum.Enum offerState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERSTATE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERSTATE$24);
            }
            target.setEnumValue(offerState);
        }
    }
    
    /**
     * Sets (as xml) the "OfferState" element
     */
    public void xsetOfferState(com.cdiscount.www.OfferStateEnum offerState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.OfferStateEnum target = null;
            target = (com.cdiscount.www.OfferStateEnum)get_store().find_element_user(OFFERSTATE$24, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.OfferStateEnum)get_store().add_element_user(OFFERSTATE$24);
            }
            target.set(offerState);
        }
    }
    
    /**
     * Unsets the "OfferState" element
     */
    public void unsetOfferState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFERSTATE$24, 0);
        }
    }
    
    /**
     * Gets the "ParentProductId" element
     */
    public java.lang.String getParentProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTPRODUCTID$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ParentProductId" element
     */
    public org.apache.xmlbeans.XmlString xgetParentProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTPRODUCTID$26, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ParentProductId" element
     */
    public boolean isNilParentProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTPRODUCTID$26, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ParentProductId" element
     */
    public boolean isSetParentProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTPRODUCTID$26) != 0;
        }
    }
    
    /**
     * Sets the "ParentProductId" element
     */
    public void setParentProductId(java.lang.String parentProductId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTPRODUCTID$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTPRODUCTID$26);
            }
            target.setStringValue(parentProductId);
        }
    }
    
    /**
     * Sets (as xml) the "ParentProductId" element
     */
    public void xsetParentProductId(org.apache.xmlbeans.XmlString parentProductId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTPRODUCTID$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARENTPRODUCTID$26);
            }
            target.set(parentProductId);
        }
    }
    
    /**
     * Nils the "ParentProductId" element
     */
    public void setNilParentProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTPRODUCTID$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARENTPRODUCTID$26);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ParentProductId" element
     */
    public void unsetParentProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTPRODUCTID$26, 0);
        }
    }
    
    /**
     * Gets the "Price" element
     */
    public java.math.BigDecimal getPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICE$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Price" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PRICE$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "Price" element
     */
    public boolean isSetPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRICE$28) != 0;
        }
    }
    
    /**
     * Sets the "Price" element
     */
    public void setPrice(java.math.BigDecimal price)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRICE$28);
            }
            target.setBigDecimalValue(price);
        }
    }
    
    /**
     * Sets (as xml) the "Price" element
     */
    public void xsetPrice(org.apache.xmlbeans.XmlDecimal price)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PRICE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(PRICE$28);
            }
            target.set(price);
        }
    }
    
    /**
     * Unsets the "Price" element
     */
    public void unsetPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRICE$28, 0);
        }
    }
    
    /**
     * Gets the "PriceMustBeAligned" element
     */
    public com.cdiscount.www.PriceAlignmentAction.Enum getPriceMustBeAligned()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICEMUSTBEALIGNED$30, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.PriceAlignmentAction.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "PriceMustBeAligned" element
     */
    public com.cdiscount.www.PriceAlignmentAction xgetPriceMustBeAligned()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.PriceAlignmentAction target = null;
            target = (com.cdiscount.www.PriceAlignmentAction)get_store().find_element_user(PRICEMUSTBEALIGNED$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "PriceMustBeAligned" element
     */
    public boolean isSetPriceMustBeAligned()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRICEMUSTBEALIGNED$30) != 0;
        }
    }
    
    /**
     * Sets the "PriceMustBeAligned" element
     */
    public void setPriceMustBeAligned(com.cdiscount.www.PriceAlignmentAction.Enum priceMustBeAligned)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICEMUSTBEALIGNED$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRICEMUSTBEALIGNED$30);
            }
            target.setEnumValue(priceMustBeAligned);
        }
    }
    
    /**
     * Sets (as xml) the "PriceMustBeAligned" element
     */
    public void xsetPriceMustBeAligned(com.cdiscount.www.PriceAlignmentAction priceMustBeAligned)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.PriceAlignmentAction target = null;
            target = (com.cdiscount.www.PriceAlignmentAction)get_store().find_element_user(PRICEMUSTBEALIGNED$30, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.PriceAlignmentAction)get_store().add_element_user(PRICEMUSTBEALIGNED$30);
            }
            target.set(priceMustBeAligned);
        }
    }
    
    /**
     * Unsets the "PriceMustBeAligned" element
     */
    public void unsetPriceMustBeAligned()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRICEMUSTBEALIGNED$30, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCONDITION$32, 0);
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
            target = (com.cdiscount.www.ProductConditionEnum)get_store().find_element_user(PRODUCTCONDITION$32, 0);
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
            return get_store().count_elements(PRODUCTCONDITION$32) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCONDITION$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCONDITION$32);
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
            target = (com.cdiscount.www.ProductConditionEnum)get_store().find_element_user(PRODUCTCONDITION$32, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductConditionEnum)get_store().add_element_user(PRODUCTCONDITION$32);
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
            get_store().remove_element(PRODUCTCONDITION$32, 0);
        }
    }
    
    /**
     * Gets the "ProductEan" element
     */
    public java.lang.String getProductEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTEAN$34, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductEan" element
     */
    public org.apache.xmlbeans.XmlString xgetProductEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$34, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductEan" element
     */
    public boolean isNilProductEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$34, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ProductEan" element
     */
    public boolean isSetProductEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTEAN$34) != 0;
        }
    }
    
    /**
     * Sets the "ProductEan" element
     */
    public void setProductEan(java.lang.String productEan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTEAN$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTEAN$34);
            }
            target.setStringValue(productEan);
        }
    }
    
    /**
     * Sets (as xml) the "ProductEan" element
     */
    public void xsetProductEan(org.apache.xmlbeans.XmlString productEan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTEAN$34);
            }
            target.set(productEan);
        }
    }
    
    /**
     * Nils the "ProductEan" element
     */
    public void setNilProductEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTEAN$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTEAN$34);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ProductEan" element
     */
    public void unsetProductEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTEAN$34, 0);
        }
    }
    
    /**
     * Gets the "ProductId" element
     */
    public java.lang.String getProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTID$36, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductId" element
     */
    public org.apache.xmlbeans.XmlString xgetProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTID$36, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ProductId" element
     */
    public boolean isNilProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTID$36, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ProductId" element
     */
    public boolean isSetProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTID$36) != 0;
        }
    }
    
    /**
     * Sets the "ProductId" element
     */
    public void setProductId(java.lang.String productId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTID$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTID$36);
            }
            target.setStringValue(productId);
        }
    }
    
    /**
     * Sets (as xml) the "ProductId" element
     */
    public void xsetProductId(org.apache.xmlbeans.XmlString productId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTID$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTID$36);
            }
            target.set(productId);
        }
    }
    
    /**
     * Nils the "ProductId" element
     */
    public void setNilProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTID$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTID$36);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ProductId" element
     */
    public void unsetProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTID$36, 0);
        }
    }
    
    /**
     * Gets the "ProductPackagingUnit" element
     */
    public com.cdiscount.www.ProductPackagingUnit.Enum getProductPackagingUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTPACKAGINGUNIT$38, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.ProductPackagingUnit.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductPackagingUnit" element
     */
    public com.cdiscount.www.ProductPackagingUnit xgetProductPackagingUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductPackagingUnit target = null;
            target = (com.cdiscount.www.ProductPackagingUnit)get_store().find_element_user(PRODUCTPACKAGINGUNIT$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "ProductPackagingUnit" element
     */
    public boolean isSetProductPackagingUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTPACKAGINGUNIT$38) != 0;
        }
    }
    
    /**
     * Sets the "ProductPackagingUnit" element
     */
    public void setProductPackagingUnit(com.cdiscount.www.ProductPackagingUnit.Enum productPackagingUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTPACKAGINGUNIT$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTPACKAGINGUNIT$38);
            }
            target.setEnumValue(productPackagingUnit);
        }
    }
    
    /**
     * Sets (as xml) the "ProductPackagingUnit" element
     */
    public void xsetProductPackagingUnit(com.cdiscount.www.ProductPackagingUnit productPackagingUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ProductPackagingUnit target = null;
            target = (com.cdiscount.www.ProductPackagingUnit)get_store().find_element_user(PRODUCTPACKAGINGUNIT$38, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ProductPackagingUnit)get_store().add_element_user(PRODUCTPACKAGINGUNIT$38);
            }
            target.set(productPackagingUnit);
        }
    }
    
    /**
     * Unsets the "ProductPackagingUnit" element
     */
    public void unsetProductPackagingUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTPACKAGINGUNIT$38, 0);
        }
    }
    
    /**
     * Gets the "ProductPackagingUnitPrice" element
     */
    public java.math.BigDecimal getProductPackagingUnitPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTPACKAGINGUNITPRICE$40, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductPackagingUnitPrice" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetProductPackagingUnitPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PRODUCTPACKAGINGUNITPRICE$40, 0);
            return target;
        }
    }
    
    /**
     * True if has "ProductPackagingUnitPrice" element
     */
    public boolean isSetProductPackagingUnitPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTPACKAGINGUNITPRICE$40) != 0;
        }
    }
    
    /**
     * Sets the "ProductPackagingUnitPrice" element
     */
    public void setProductPackagingUnitPrice(java.math.BigDecimal productPackagingUnitPrice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTPACKAGINGUNITPRICE$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTPACKAGINGUNITPRICE$40);
            }
            target.setBigDecimalValue(productPackagingUnitPrice);
        }
    }
    
    /**
     * Sets (as xml) the "ProductPackagingUnitPrice" element
     */
    public void xsetProductPackagingUnitPrice(org.apache.xmlbeans.XmlDecimal productPackagingUnitPrice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PRODUCTPACKAGINGUNITPRICE$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(PRODUCTPACKAGINGUNITPRICE$40);
            }
            target.set(productPackagingUnitPrice);
        }
    }
    
    /**
     * Unsets the "ProductPackagingUnitPrice" element
     */
    public void unsetProductPackagingUnitPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTPACKAGINGUNITPRICE$40, 0);
        }
    }
    
    /**
     * Gets the "ProductPackagingValue" element
     */
    public java.math.BigDecimal getProductPackagingValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTPACKAGINGVALUE$42, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductPackagingValue" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetProductPackagingValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PRODUCTPACKAGINGVALUE$42, 0);
            return target;
        }
    }
    
    /**
     * True if has "ProductPackagingValue" element
     */
    public boolean isSetProductPackagingValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTPACKAGINGVALUE$42) != 0;
        }
    }
    
    /**
     * Sets the "ProductPackagingValue" element
     */
    public void setProductPackagingValue(java.math.BigDecimal productPackagingValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTPACKAGINGVALUE$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTPACKAGINGVALUE$42);
            }
            target.setBigDecimalValue(productPackagingValue);
        }
    }
    
    /**
     * Sets (as xml) the "ProductPackagingValue" element
     */
    public void xsetProductPackagingValue(org.apache.xmlbeans.XmlDecimal productPackagingValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PRODUCTPACKAGINGVALUE$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(PRODUCTPACKAGINGVALUE$42);
            }
            target.set(productPackagingValue);
        }
    }
    
    /**
     * Unsets the "ProductPackagingValue" element
     */
    public void unsetProductPackagingValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTPACKAGINGVALUE$42, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERPRODUCTID$44, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$44, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$44, 0);
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
            return get_store().count_elements(SELLERPRODUCTID$44) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERPRODUCTID$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELLERPRODUCTID$44);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERPRODUCTID$44);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERPRODUCTID$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERPRODUCTID$44);
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
            get_store().remove_element(SELLERPRODUCTID$44, 0);
        }
    }
    
    /**
     * Gets the "ShippingInformationList" element
     */
    public com.cdiscount.www.ArrayOfShippingInformation getShippingInformationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfShippingInformation target = null;
            target = (com.cdiscount.www.ArrayOfShippingInformation)get_store().find_element_user(SHIPPINGINFORMATIONLIST$46, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ShippingInformationList" element
     */
    public boolean isNilShippingInformationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfShippingInformation target = null;
            target = (com.cdiscount.www.ArrayOfShippingInformation)get_store().find_element_user(SHIPPINGINFORMATIONLIST$46, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ShippingInformationList" element
     */
    public boolean isSetShippingInformationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPPINGINFORMATIONLIST$46) != 0;
        }
    }
    
    /**
     * Sets the "ShippingInformationList" element
     */
    public void setShippingInformationList(com.cdiscount.www.ArrayOfShippingInformation shippingInformationList)
    {
        generatedSetterHelperImpl(shippingInformationList, SHIPPINGINFORMATIONLIST$46, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ShippingInformationList" element
     */
    public com.cdiscount.www.ArrayOfShippingInformation addNewShippingInformationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfShippingInformation target = null;
            target = (com.cdiscount.www.ArrayOfShippingInformation)get_store().add_element_user(SHIPPINGINFORMATIONLIST$46);
            return target;
        }
    }
    
    /**
     * Nils the "ShippingInformationList" element
     */
    public void setNilShippingInformationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfShippingInformation target = null;
            target = (com.cdiscount.www.ArrayOfShippingInformation)get_store().find_element_user(SHIPPINGINFORMATIONLIST$46, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfShippingInformation)get_store().add_element_user(SHIPPINGINFORMATIONLIST$46);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ShippingInformationList" element
     */
    public void unsetShippingInformationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPPINGINFORMATIONLIST$46, 0);
        }
    }
    
    /**
     * Gets the "Stock" element
     */
    public int getStock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STOCK$48, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Stock" element
     */
    public org.apache.xmlbeans.XmlInt xgetStock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STOCK$48, 0);
            return target;
        }
    }
    
    /**
     * True if has "Stock" element
     */
    public boolean isSetStock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STOCK$48) != 0;
        }
    }
    
    /**
     * Sets the "Stock" element
     */
    public void setStock(int stock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STOCK$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STOCK$48);
            }
            target.setIntValue(stock);
        }
    }
    
    /**
     * Sets (as xml) the "Stock" element
     */
    public void xsetStock(org.apache.xmlbeans.XmlInt stock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STOCK$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(STOCK$48);
            }
            target.set(stock);
        }
    }
    
    /**
     * Unsets the "Stock" element
     */
    public void unsetStock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STOCK$48, 0);
        }
    }
    
    /**
     * Gets the "StrikedPrice" element
     */
    public java.math.BigDecimal getStrikedPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRIKEDPRICE$50, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "StrikedPrice" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetStrikedPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(STRIKEDPRICE$50, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "StrikedPrice" element
     */
    public boolean isNilStrikedPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(STRIKEDPRICE$50, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "StrikedPrice" element
     */
    public boolean isSetStrikedPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRIKEDPRICE$50) != 0;
        }
    }
    
    /**
     * Sets the "StrikedPrice" element
     */
    public void setStrikedPrice(java.math.BigDecimal strikedPrice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRIKEDPRICE$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRIKEDPRICE$50);
            }
            target.setBigDecimalValue(strikedPrice);
        }
    }
    
    /**
     * Sets (as xml) the "StrikedPrice" element
     */
    public void xsetStrikedPrice(org.apache.xmlbeans.XmlDecimal strikedPrice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(STRIKEDPRICE$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(STRIKEDPRICE$50);
            }
            target.set(strikedPrice);
        }
    }
    
    /**
     * Nils the "StrikedPrice" element
     */
    public void setNilStrikedPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(STRIKEDPRICE$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(STRIKEDPRICE$50);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "StrikedPrice" element
     */
    public void unsetStrikedPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRIKEDPRICE$50, 0);
        }
    }
    
    /**
     * Gets the "VatRate" element
     */
    public java.math.BigDecimal getVatRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VATRATE$52, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "VatRate" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetVatRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(VATRATE$52, 0);
            return target;
        }
    }
    
    /**
     * True if has "VatRate" element
     */
    public boolean isSetVatRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VATRATE$52) != 0;
        }
    }
    
    /**
     * Sets the "VatRate" element
     */
    public void setVatRate(java.math.BigDecimal vatRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VATRATE$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VATRATE$52);
            }
            target.setBigDecimalValue(vatRate);
        }
    }
    
    /**
     * Sets (as xml) the "VatRate" element
     */
    public void xsetVatRate(org.apache.xmlbeans.XmlDecimal vatRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(VATRATE$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(VATRATE$52);
            }
            target.set(vatRate);
        }
    }
    
    /**
     * Unsets the "VatRate" element
     */
    public void unsetVatRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VATRATE$52, 0);
        }
    }
}
