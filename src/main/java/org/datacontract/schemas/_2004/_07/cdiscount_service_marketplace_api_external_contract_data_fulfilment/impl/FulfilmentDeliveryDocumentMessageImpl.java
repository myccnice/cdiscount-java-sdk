/*
 * XML Type:  FulfilmentDeliveryDocumentMessage
 * Namespace: http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Fulfilment
 * Java type: org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.impl;
/**
 * An XML FulfilmentDeliveryDocumentMessage(@http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Fulfilment).
 *
 * This is a complex type.
 */
public class FulfilmentDeliveryDocumentMessageImpl extends com.cdiscount.www.impl.ServiceBaseAPIMessageImpl implements org.datacontract.schemas._2004._07.cdiscount_service_marketplace_api_external_contract_data_fulfilment.FulfilmentDeliveryDocumentMessage
{
    private static final long serialVersionUID = 1L;
    
    public FulfilmentDeliveryDocumentMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PDFDOCUMENT$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Cdiscount.Service.Marketplace.API.External.Contract.Data.Fulfilment", "PdfDocument");
    
    
    /**
     * Gets the "PdfDocument" element
     */
    public java.lang.String getPdfDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PDFDOCUMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PdfDocument" element
     */
    public org.apache.xmlbeans.XmlString xgetPdfDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PDFDOCUMENT$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PdfDocument" element
     */
    public boolean isNilPdfDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PDFDOCUMENT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PdfDocument" element
     */
    public boolean isSetPdfDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PDFDOCUMENT$0) != 0;
        }
    }
    
    /**
     * Sets the "PdfDocument" element
     */
    public void setPdfDocument(java.lang.String pdfDocument)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PDFDOCUMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PDFDOCUMENT$0);
            }
            target.setStringValue(pdfDocument);
        }
    }
    
    /**
     * Sets (as xml) the "PdfDocument" element
     */
    public void xsetPdfDocument(org.apache.xmlbeans.XmlString pdfDocument)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PDFDOCUMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PDFDOCUMENT$0);
            }
            target.set(pdfDocument);
        }
    }
    
    /**
     * Nils the "PdfDocument" element
     */
    public void setNilPdfDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PDFDOCUMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PDFDOCUMENT$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PdfDocument" element
     */
    public void unsetPdfDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PDFDOCUMENT$0, 0);
        }
    }
}
