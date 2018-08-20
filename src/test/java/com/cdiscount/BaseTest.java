package com.cdiscount;

import org.apache.axis2.AxisFault;
import org.tempuri.MarketplaceAPIServiceStub;

public class BaseTest {

    protected static final String HEADER_MESSAGE_VERSION = "1.0";
    protected static MarketplaceAPIServiceStub stub;
    protected static String userName="myccnice";
    protected static String tokenId="abcd145adad25";

    static {
        try {
            stub=new MarketplaceAPIServiceStub();
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        }
    }
}
