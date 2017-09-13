/*
 * XML Type:  Error
 * Namespace: http://www.cdiscount.com
 * Java type: com.cdiscount.www.Error
 *
 * Automatically generated - do not modify.
 */
package com.cdiscount.www.impl;
/**
 * An XML Error(@http://www.cdiscount.com).
 *
 * This is a complex type.
 */
public class ErrorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.cdiscount.www.Error
{
    private static final long serialVersionUID = 1L;
    
    public ErrorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORTYPE$0 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "ErrorType");
    private static final javax.xml.namespace.QName MESSAGE$2 = 
        new javax.xml.namespace.QName("http://www.cdiscount.com", "Message");
    
    
    /**
     * Gets the "ErrorType" element
     */
    public com.cdiscount.www.ErrorTypeEnum.Enum getErrorType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.cdiscount.www.ErrorTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorType" element
     */
    public com.cdiscount.www.ErrorTypeEnum xgetErrorType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ErrorTypeEnum target = null;
            target = (com.cdiscount.www.ErrorTypeEnum)get_store().find_element_user(ERRORTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ErrorType" element
     */
    public void setErrorType(com.cdiscount.www.ErrorTypeEnum.Enum errorType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORTYPE$0);
            }
            target.setEnumValue(errorType);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorType" element
     */
    public void xsetErrorType(com.cdiscount.www.ErrorTypeEnum errorType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.cdiscount.www.ErrorTypeEnum target = null;
            target = (com.cdiscount.www.ErrorTypeEnum)get_store().find_element_user(ERRORTYPE$0, 0);
            if (target == null)
            {
                target = (com.cdiscount.www.ErrorTypeEnum)get_store().add_element_user(ERRORTYPE$0);
            }
            target.set(errorType);
        }
    }
    
    /**
     * Gets the "Message" element
     */
    public java.lang.String getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Message" element
     */
    public org.apache.xmlbeans.XmlString xgetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Message" element
     */
    public boolean isNilMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Message" element
     */
    public void setMessage(java.lang.String message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$2);
            }
            target.setStringValue(message);
        }
    }
    
    /**
     * Sets (as xml) the "Message" element
     */
    public void xsetMessage(org.apache.xmlbeans.XmlString message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$2);
            }
            target.set(message);
        }
    }
    
    /**
     * Nils the "Message" element
     */
    public void setNilMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$2);
            }
            target.setNil();
        }
    }
}
