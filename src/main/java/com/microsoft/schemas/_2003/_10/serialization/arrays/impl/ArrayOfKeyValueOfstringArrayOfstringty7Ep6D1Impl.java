/*
 * XML Type:  ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays.impl;
/**
 * An XML ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1(@http://schemas.microsoft.com/2003/10/Serialization/Arrays).
 *
 * This is a complex type.
 */
public class ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUEOFSTRINGARRAYOFSTRINGTY7EP6D1$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "KeyValueOfstringArrayOfstringty7Ep6D1");
    
    
    /**
     * Gets array of all "KeyValueOfstringArrayOfstringty7Ep6D1" elements
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1.KeyValueOfstringArrayOfstringty7Ep6D1[] getKeyValueOfstringArrayOfstringty7Ep6D1Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYVALUEOFSTRINGARRAYOFSTRINGTY7EP6D1$0, targetList);
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1.KeyValueOfstringArrayOfstringty7Ep6D1[] result = new com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1.KeyValueOfstringArrayOfstringty7Ep6D1[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "KeyValueOfstringArrayOfstringty7Ep6D1" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1.KeyValueOfstringArrayOfstringty7Ep6D1 getKeyValueOfstringArrayOfstringty7Ep6D1Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1.KeyValueOfstringArrayOfstringty7Ep6D1 target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1.KeyValueOfstringArrayOfstringty7Ep6D1)get_store().find_element_user(KEYVALUEOFSTRINGARRAYOFSTRINGTY7EP6D1$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "KeyValueOfstringArrayOfstringty7Ep6D1" element
     */
    public int sizeOfKeyValueOfstringArrayOfstringty7Ep6D1Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYVALUEOFSTRINGARRAYOFSTRINGTY7EP6D1$0);
        }
    }
    
    /**
     * Sets array of all "KeyValueOfstringArrayOfstringty7Ep6D1" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setKeyValueOfstringArrayOfstringty7Ep6D1Array(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1.KeyValueOfstringArrayOfstringty7Ep6D1[] keyValueOfstringArrayOfstringty7Ep6D1Array)
    {
        check_orphaned();
        arraySetterHelper(keyValueOfstringArrayOfstringty7Ep6D1Array, KEYVALUEOFSTRINGARRAYOFSTRINGTY7EP6D1$0);
    }
    
    /**
     * Sets ith "KeyValueOfstringArrayOfstringty7Ep6D1" element
     */
    public void setKeyValueOfstringArrayOfstringty7Ep6D1Array(int i, com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1.KeyValueOfstringArrayOfstringty7Ep6D1 keyValueOfstringArrayOfstringty7Ep6D1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1.KeyValueOfstringArrayOfstringty7Ep6D1 target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1.KeyValueOfstringArrayOfstringty7Ep6D1)get_store().find_element_user(KEYVALUEOFSTRINGARRAYOFSTRINGTY7EP6D1$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyValueOfstringArrayOfstringty7Ep6D1);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValueOfstringArrayOfstringty7Ep6D1" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1.KeyValueOfstringArrayOfstringty7Ep6D1 insertNewKeyValueOfstringArrayOfstringty7Ep6D1(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1.KeyValueOfstringArrayOfstringty7Ep6D1 target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1.KeyValueOfstringArrayOfstringty7Ep6D1)get_store().insert_element_user(KEYVALUEOFSTRINGARRAYOFSTRINGTY7EP6D1$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValueOfstringArrayOfstringty7Ep6D1" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1.KeyValueOfstringArrayOfstringty7Ep6D1 addNewKeyValueOfstringArrayOfstringty7Ep6D1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1.KeyValueOfstringArrayOfstringty7Ep6D1 target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1.KeyValueOfstringArrayOfstringty7Ep6D1)get_store().add_element_user(KEYVALUEOFSTRINGARRAYOFSTRINGTY7EP6D1$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "KeyValueOfstringArrayOfstringty7Ep6D1" element
     */
    public void removeKeyValueOfstringArrayOfstringty7Ep6D1(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYVALUEOFSTRINGARRAYOFSTRINGTY7EP6D1$0, i);
        }
    }
    /**
     * An XML KeyValueOfstringArrayOfstringty7Ep6D1(@http://schemas.microsoft.com/2003/10/Serialization/Arrays).
     *
     * This is a complex type.
     */
    public static class KeyValueOfstringArrayOfstringty7Ep6D1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1.KeyValueOfstringArrayOfstringty7Ep6D1
    {
        private static final long serialVersionUID = 1L;
        
        public KeyValueOfstringArrayOfstringty7Ep6D1Impl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName KEY$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "Key");
        private static final javax.xml.namespace.QName VALUE$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "Value");
        
        
        /**
         * Gets the "Key" element
         */
        public java.lang.String getKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Key" element
         */
        public org.apache.xmlbeans.XmlString xgetKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "Key" element
         */
        public boolean isNilKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Key" element
         */
        public void setKey(java.lang.String key)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEY$0);
                }
                target.setStringValue(key);
            }
        }
        
        /**
         * Sets (as xml) the "Key" element
         */
        public void xsetKey(org.apache.xmlbeans.XmlString key)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEY$0);
                }
                target.set(key);
            }
        }
        
        /**
         * Nils the "Key" element
         */
        public void setNilKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEY$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "Value" element
         */
        public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(VALUE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "Value" element
         */
        public boolean isNilValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(VALUE$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Value" element
         */
        public void setValue(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring value)
        {
            generatedSetterHelperImpl(value, VALUE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Value" element
         */
        public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(VALUE$2);
                return target;
            }
        }
        
        /**
         * Nils the "Value" element
         */
        public void setNilValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(VALUE$2, 0);
                if (target == null)
                {
                    target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(VALUE$2);
                }
                target.setNil();
            }
        }
    }
}
