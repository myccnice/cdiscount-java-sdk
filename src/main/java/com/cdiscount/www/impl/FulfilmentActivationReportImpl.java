/*
 * XML Type:  FulfilmentActivationReport
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.FulfilmentActivationReport
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML FulfilmentActivationReport(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class FulfilmentActivationReportImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.FulfilmentActivationReport
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentActivationReportImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPOSITID$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DepositId");
    private static final javax.xml.namespace.QName DETAILSLIST$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "DetailsList");
    private static final javax.xml.namespace.QName NUMBEROFACTIVATEDPRODUCTS$4 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "NumberOfActivatedProducts");
    private static final javax.xml.namespace.QName NUMBEROFDEACTIVATEDPRODUCTS$6 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "NumberOfDeactivatedProducts");
    private static final javax.xml.namespace.QName NUMBEROFPROCESSEDPRODUCTS$8 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "NumberOfProcessedProducts");
    private static final javax.xml.namespace.QName NUMBEROFPRODUCTS$10 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "NumberOfProducts");
    private static final javax.xml.namespace.QName NUMBEROFPRODUCTSINERROR$12 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "NumberOfProductsInError");
    private static final javax.xml.namespace.QName NUMBEROFREMAININGPRODUCTSTOPROCESS$14 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "NumberOfRemainingProductsToProcess");
    private static final javax.xml.namespace.QName REPORTDATE$16 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ReportDate");
    
    
    /**
     * Gets the "DepositId" element
     */
    public int getDepositId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPOSITID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DepositId" element
     */
    public org.apache.xmlbeans.XmlInt xgetDepositId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEPOSITID$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "DepositId" element
     */
    public boolean isNilDepositId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEPOSITID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "DepositId" element
     */
    public boolean isSetDepositId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPOSITID$0) != 0;
        }
    }
    
    /**
     * Sets the "DepositId" element
     */
    public void setDepositId(int depositId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPOSITID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPOSITID$0);
            }
            target.setIntValue(depositId);
        }
    }
    
    /**
     * Sets (as xml) the "DepositId" element
     */
    public void xsetDepositId(org.apache.xmlbeans.XmlInt depositId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEPOSITID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DEPOSITID$0);
            }
            target.set(depositId);
        }
    }
    
    /**
     * Nils the "DepositId" element
     */
    public void setNilDepositId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEPOSITID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DEPOSITID$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "DepositId" element
     */
    public void unsetDepositId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPOSITID$0, 0);
        }
    }
    
    /**
     * Gets the "DetailsList" element
     */
    public com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails getDetailsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails)get_store().find_element_user(DETAILSLIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DetailsList" element
     */
    public boolean isNilDetailsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails)get_store().find_element_user(DETAILSLIST$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "DetailsList" element
     */
    public boolean isSetDetailsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETAILSLIST$2) != 0;
        }
    }
    
    /**
     * Sets the "DetailsList" element
     */
    public void setDetailsList(com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails detailsList)
    {
        generatedSetterHelperImpl(detailsList, DETAILSLIST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DetailsList" element
     */
    public com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails addNewDetailsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails)get_store().add_element_user(DETAILSLIST$2);
            return target;
        }
    }
    
    /**
     * Nils the "DetailsList" element
     */
    public void setNilDetailsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails target = null;
            target = (com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails)get_store().find_element_user(DETAILSLIST$2, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ArrayOfFulfilmentActivationReportDetails)get_store().add_element_user(DETAILSLIST$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "DetailsList" element
     */
    public void unsetDetailsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETAILSLIST$2, 0);
        }
    }
    
    /**
     * Gets the "NumberOfActivatedProducts" element
     */
    public int getNumberOfActivatedProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFACTIVATEDPRODUCTS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberOfActivatedProducts" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumberOfActivatedProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFACTIVATEDPRODUCTS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumberOfActivatedProducts" element
     */
    public boolean isSetNumberOfActivatedProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEROFACTIVATEDPRODUCTS$4) != 0;
        }
    }
    
    /**
     * Sets the "NumberOfActivatedProducts" element
     */
    public void setNumberOfActivatedProducts(int numberOfActivatedProducts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFACTIVATEDPRODUCTS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFACTIVATEDPRODUCTS$4);
            }
            target.setIntValue(numberOfActivatedProducts);
        }
    }
    
    /**
     * Sets (as xml) the "NumberOfActivatedProducts" element
     */
    public void xsetNumberOfActivatedProducts(org.apache.xmlbeans.XmlInt numberOfActivatedProducts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFACTIVATEDPRODUCTS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBEROFACTIVATEDPRODUCTS$4);
            }
            target.set(numberOfActivatedProducts);
        }
    }
    
    /**
     * Unsets the "NumberOfActivatedProducts" element
     */
    public void unsetNumberOfActivatedProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEROFACTIVATEDPRODUCTS$4, 0);
        }
    }
    
    /**
     * Gets the "NumberOfDeactivatedProducts" element
     */
    public int getNumberOfDeactivatedProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFDEACTIVATEDPRODUCTS$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberOfDeactivatedProducts" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumberOfDeactivatedProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFDEACTIVATEDPRODUCTS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumberOfDeactivatedProducts" element
     */
    public boolean isSetNumberOfDeactivatedProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEROFDEACTIVATEDPRODUCTS$6) != 0;
        }
    }
    
    /**
     * Sets the "NumberOfDeactivatedProducts" element
     */
    public void setNumberOfDeactivatedProducts(int numberOfDeactivatedProducts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFDEACTIVATEDPRODUCTS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFDEACTIVATEDPRODUCTS$6);
            }
            target.setIntValue(numberOfDeactivatedProducts);
        }
    }
    
    /**
     * Sets (as xml) the "NumberOfDeactivatedProducts" element
     */
    public void xsetNumberOfDeactivatedProducts(org.apache.xmlbeans.XmlInt numberOfDeactivatedProducts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFDEACTIVATEDPRODUCTS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBEROFDEACTIVATEDPRODUCTS$6);
            }
            target.set(numberOfDeactivatedProducts);
        }
    }
    
    /**
     * Unsets the "NumberOfDeactivatedProducts" element
     */
    public void unsetNumberOfDeactivatedProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEROFDEACTIVATEDPRODUCTS$6, 0);
        }
    }
    
    /**
     * Gets the "NumberOfProcessedProducts" element
     */
    public int getNumberOfProcessedProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFPROCESSEDPRODUCTS$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberOfProcessedProducts" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumberOfProcessedProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFPROCESSEDPRODUCTS$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumberOfProcessedProducts" element
     */
    public boolean isSetNumberOfProcessedProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEROFPROCESSEDPRODUCTS$8) != 0;
        }
    }
    
    /**
     * Sets the "NumberOfProcessedProducts" element
     */
    public void setNumberOfProcessedProducts(int numberOfProcessedProducts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFPROCESSEDPRODUCTS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFPROCESSEDPRODUCTS$8);
            }
            target.setIntValue(numberOfProcessedProducts);
        }
    }
    
    /**
     * Sets (as xml) the "NumberOfProcessedProducts" element
     */
    public void xsetNumberOfProcessedProducts(org.apache.xmlbeans.XmlInt numberOfProcessedProducts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFPROCESSEDPRODUCTS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBEROFPROCESSEDPRODUCTS$8);
            }
            target.set(numberOfProcessedProducts);
        }
    }
    
    /**
     * Unsets the "NumberOfProcessedProducts" element
     */
    public void unsetNumberOfProcessedProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEROFPROCESSEDPRODUCTS$8, 0);
        }
    }
    
    /**
     * Gets the "NumberOfProducts" element
     */
    public int getNumberOfProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFPRODUCTS$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberOfProducts" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumberOfProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFPRODUCTS$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumberOfProducts" element
     */
    public boolean isSetNumberOfProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEROFPRODUCTS$10) != 0;
        }
    }
    
    /**
     * Sets the "NumberOfProducts" element
     */
    public void setNumberOfProducts(int numberOfProducts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFPRODUCTS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFPRODUCTS$10);
            }
            target.setIntValue(numberOfProducts);
        }
    }
    
    /**
     * Sets (as xml) the "NumberOfProducts" element
     */
    public void xsetNumberOfProducts(org.apache.xmlbeans.XmlInt numberOfProducts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFPRODUCTS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBEROFPRODUCTS$10);
            }
            target.set(numberOfProducts);
        }
    }
    
    /**
     * Unsets the "NumberOfProducts" element
     */
    public void unsetNumberOfProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEROFPRODUCTS$10, 0);
        }
    }
    
    /**
     * Gets the "NumberOfProductsInError" element
     */
    public int getNumberOfProductsInError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFPRODUCTSINERROR$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberOfProductsInError" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumberOfProductsInError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFPRODUCTSINERROR$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumberOfProductsInError" element
     */
    public boolean isSetNumberOfProductsInError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEROFPRODUCTSINERROR$12) != 0;
        }
    }
    
    /**
     * Sets the "NumberOfProductsInError" element
     */
    public void setNumberOfProductsInError(int numberOfProductsInError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFPRODUCTSINERROR$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFPRODUCTSINERROR$12);
            }
            target.setIntValue(numberOfProductsInError);
        }
    }
    
    /**
     * Sets (as xml) the "NumberOfProductsInError" element
     */
    public void xsetNumberOfProductsInError(org.apache.xmlbeans.XmlInt numberOfProductsInError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFPRODUCTSINERROR$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBEROFPRODUCTSINERROR$12);
            }
            target.set(numberOfProductsInError);
        }
    }
    
    /**
     * Unsets the "NumberOfProductsInError" element
     */
    public void unsetNumberOfProductsInError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEROFPRODUCTSINERROR$12, 0);
        }
    }
    
    /**
     * Gets the "NumberOfRemainingProductsToProcess" element
     */
    public int getNumberOfRemainingProductsToProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFREMAININGPRODUCTSTOPROCESS$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberOfRemainingProductsToProcess" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumberOfRemainingProductsToProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFREMAININGPRODUCTSTOPROCESS$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumberOfRemainingProductsToProcess" element
     */
    public boolean isSetNumberOfRemainingProductsToProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEROFREMAININGPRODUCTSTOPROCESS$14) != 0;
        }
    }
    
    /**
     * Sets the "NumberOfRemainingProductsToProcess" element
     */
    public void setNumberOfRemainingProductsToProcess(int numberOfRemainingProductsToProcess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFREMAININGPRODUCTSTOPROCESS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFREMAININGPRODUCTSTOPROCESS$14);
            }
            target.setIntValue(numberOfRemainingProductsToProcess);
        }
    }
    
    /**
     * Sets (as xml) the "NumberOfRemainingProductsToProcess" element
     */
    public void xsetNumberOfRemainingProductsToProcess(org.apache.xmlbeans.XmlInt numberOfRemainingProductsToProcess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFREMAININGPRODUCTSTOPROCESS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBEROFREMAININGPRODUCTSTOPROCESS$14);
            }
            target.set(numberOfRemainingProductsToProcess);
        }
    }
    
    /**
     * Unsets the "NumberOfRemainingProductsToProcess" element
     */
    public void unsetNumberOfRemainingProductsToProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEROFREMAININGPRODUCTSTOPROCESS$14, 0);
        }
    }
    
    /**
     * Gets the "ReportDate" element
     */
    public java.util.Calendar getReportDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTDATE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReportDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetReportDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(REPORTDATE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "ReportDate" element
     */
    public boolean isSetReportDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTDATE$16) != 0;
        }
    }
    
    /**
     * Sets the "ReportDate" element
     */
    public void setReportDate(java.util.Calendar reportDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTDATE$16);
            }
            target.setCalendarValue(reportDate);
        }
    }
    
    /**
     * Sets (as xml) the "ReportDate" element
     */
    public void xsetReportDate(org.apache.xmlbeans.XmlDateTime reportDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(REPORTDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(REPORTDATE$16);
            }
            target.set(reportDate);
        }
    }
    
    /**
     * Unsets the "ReportDate" element
     */
    public void unsetReportDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTDATE$16, 0);
        }
    }
}
