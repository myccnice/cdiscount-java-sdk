/*
 * XML Type:  ProductStock
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.impl;
/**
 * An XML ProductStock(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product).
 *
 * This is a complex type.
 */
public class ProductStockImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_product.ProductStock
{
    private static final long serialVersionUID = 1L;
    
    public ProductStockImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLOCKEDSTOCK$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product", "BlockedStock");
    private static final javax.xml.namespace.QName EAN$2 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product", "Ean");
    private static final javax.xml.namespace.QName FODSTOCK$4 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product", "FodStock");
    private static final javax.xml.namespace.QName FRONTSTOCK$6 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product", "FrontStock");
    private static final javax.xml.namespace.QName ISREFERENCED$8 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product", "IsReferenced");
    private static final javax.xml.namespace.QName LIBELLE$10 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product", "Libelle");
    private static final javax.xml.namespace.QName SELLERREFERENCE$12 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product", "SellerReference");
    private static final javax.xml.namespace.QName SKU$14 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product", "Sku");
    private static final javax.xml.namespace.QName STOCKINWAREHOUSE$16 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product", "StockInWarehouse");
    private static final javax.xml.namespace.QName WAREHOUSE$18 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Product", "Warehouse");
    
    
    /**
     * Gets the "BlockedStock" element
     */
    public int getBlockedStock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOCKEDSTOCK$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "BlockedStock" element
     */
    public org.apache.xmlbeans.XmlInt xgetBlockedStock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BLOCKEDSTOCK$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BlockedStock" element
     */
    public void setBlockedStock(int blockedStock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOCKEDSTOCK$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BLOCKEDSTOCK$0);
            }
            target.setIntValue(blockedStock);
        }
    }
    
    /**
     * Sets (as xml) the "BlockedStock" element
     */
    public void xsetBlockedStock(org.apache.xmlbeans.XmlInt blockedStock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BLOCKEDSTOCK$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(BLOCKEDSTOCK$0);
            }
            target.set(blockedStock);
        }
    }
    
    /**
     * Gets the "Ean" element
     */
    public java.lang.String getEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EAN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Ean" element
     */
    public org.apache.xmlbeans.XmlString xgetEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EAN$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Ean" element
     */
    public boolean isNilEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EAN$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Ean" element
     */
    public void setEan(java.lang.String ean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EAN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EAN$2);
            }
            target.setStringValue(ean);
        }
    }
    
    /**
     * Sets (as xml) the "Ean" element
     */
    public void xsetEan(org.apache.xmlbeans.XmlString ean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EAN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EAN$2);
            }
            target.set(ean);
        }
    }
    
    /**
     * Nils the "Ean" element
     */
    public void setNilEan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EAN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EAN$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "FodStock" element
     */
    public int getFodStock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FODSTOCK$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "FodStock" element
     */
    public org.apache.xmlbeans.XmlInt xgetFodStock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FODSTOCK$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "FodStock" element
     */
    public boolean isNilFodStock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FODSTOCK$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FodStock" element
     */
    public void setFodStock(int fodStock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FODSTOCK$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FODSTOCK$4);
            }
            target.setIntValue(fodStock);
        }
    }
    
    /**
     * Sets (as xml) the "FodStock" element
     */
    public void xsetFodStock(org.apache.xmlbeans.XmlInt fodStock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FODSTOCK$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(FODSTOCK$4);
            }
            target.set(fodStock);
        }
    }
    
    /**
     * Nils the "FodStock" element
     */
    public void setNilFodStock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FODSTOCK$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(FODSTOCK$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "FrontStock" element
     */
    public int getFrontStock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FRONTSTOCK$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "FrontStock" element
     */
    public org.apache.xmlbeans.XmlInt xgetFrontStock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FRONTSTOCK$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FrontStock" element
     */
    public void setFrontStock(int frontStock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FRONTSTOCK$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FRONTSTOCK$6);
            }
            target.setIntValue(frontStock);
        }
    }
    
    /**
     * Sets (as xml) the "FrontStock" element
     */
    public void xsetFrontStock(org.apache.xmlbeans.XmlInt frontStock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FRONTSTOCK$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(FRONTSTOCK$6);
            }
            target.set(frontStock);
        }
    }
    
    /**
     * Gets the "IsReferenced" element
     */
    public boolean getIsReferenced()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISREFERENCED$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsReferenced" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsReferenced()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISREFERENCED$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IsReferenced" element
     */
    public void setIsReferenced(boolean isReferenced)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISREFERENCED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISREFERENCED$8);
            }
            target.setBooleanValue(isReferenced);
        }
    }
    
    /**
     * Sets (as xml) the "IsReferenced" element
     */
    public void xsetIsReferenced(org.apache.xmlbeans.XmlBoolean isReferenced)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISREFERENCED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISREFERENCED$8);
            }
            target.set(isReferenced);
        }
    }
    
    /**
     * Gets the "Libelle" element
     */
    public java.lang.String getLibelle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIBELLE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Libelle" element
     */
    public org.apache.xmlbeans.XmlString xgetLibelle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LIBELLE$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Libelle" element
     */
    public boolean isNilLibelle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LIBELLE$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Libelle" element
     */
    public void setLibelle(java.lang.String libelle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIBELLE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIBELLE$10);
            }
            target.setStringValue(libelle);
        }
    }
    
    /**
     * Sets (as xml) the "Libelle" element
     */
    public void xsetLibelle(org.apache.xmlbeans.XmlString libelle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LIBELLE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LIBELLE$10);
            }
            target.set(libelle);
        }
    }
    
    /**
     * Nils the "Libelle" element
     */
    public void setNilLibelle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LIBELLE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LIBELLE$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "SellerReference" element
     */
    public java.lang.String getSellerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERREFERENCE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SellerReference" element
     */
    public org.apache.xmlbeans.XmlString xgetSellerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERREFERENCE$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SellerReference" element
     */
    public boolean isNilSellerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERREFERENCE$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SellerReference" element
     */
    public void setSellerReference(java.lang.String sellerReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELLERREFERENCE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELLERREFERENCE$12);
            }
            target.setStringValue(sellerReference);
        }
    }
    
    /**
     * Sets (as xml) the "SellerReference" element
     */
    public void xsetSellerReference(org.apache.xmlbeans.XmlString sellerReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERREFERENCE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERREFERENCE$12);
            }
            target.set(sellerReference);
        }
    }
    
    /**
     * Nils the "SellerReference" element
     */
    public void setNilSellerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SELLERREFERENCE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SELLERREFERENCE$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "Sku" element
     */
    public java.lang.String getSku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKU$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Sku" element
     */
    public org.apache.xmlbeans.XmlString xgetSku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKU$14, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Sku" element
     */
    public boolean isNilSku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKU$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Sku" element
     */
    public void setSku(java.lang.String sku)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKU$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SKU$14);
            }
            target.setStringValue(sku);
        }
    }
    
    /**
     * Sets (as xml) the "Sku" element
     */
    public void xsetSku(org.apache.xmlbeans.XmlString sku)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKU$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SKU$14);
            }
            target.set(sku);
        }
    }
    
    /**
     * Nils the "Sku" element
     */
    public void setNilSku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKU$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SKU$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "StockInWarehouse" element
     */
    public int getStockInWarehouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STOCKINWAREHOUSE$16, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "StockInWarehouse" element
     */
    public org.apache.xmlbeans.XmlInt xgetStockInWarehouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STOCKINWAREHOUSE$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "StockInWarehouse" element
     */
    public void setStockInWarehouse(int stockInWarehouse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STOCKINWAREHOUSE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STOCKINWAREHOUSE$16);
            }
            target.setIntValue(stockInWarehouse);
        }
    }
    
    /**
     * Sets (as xml) the "StockInWarehouse" element
     */
    public void xsetStockInWarehouse(org.apache.xmlbeans.XmlInt stockInWarehouse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STOCKINWAREHOUSE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(STOCKINWAREHOUSE$16);
            }
            target.set(stockInWarehouse);
        }
    }
    
    /**
     * Gets the "Warehouse" element
     */
    public java.lang.String getWarehouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAREHOUSE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Warehouse" element
     */
    public org.apache.xmlbeans.XmlString xgetWarehouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WAREHOUSE$18, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Warehouse" element
     */
    public boolean isNilWarehouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WAREHOUSE$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Warehouse" element
     */
    public void setWarehouse(java.lang.String warehouse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAREHOUSE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WAREHOUSE$18);
            }
            target.setStringValue(warehouse);
        }
    }
    
    /**
     * Sets (as xml) the "Warehouse" element
     */
    public void xsetWarehouse(org.apache.xmlbeans.XmlString warehouse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WAREHOUSE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WAREHOUSE$18);
            }
            target.set(warehouse);
        }
    }
    
    /**
     * Nils the "Warehouse" element
     */
    public void setNilWarehouse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WAREHOUSE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WAREHOUSE$18);
            }
            target.setNil();
        }
    }
}
