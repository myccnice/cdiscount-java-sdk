package com.cdiscount;

import org.apache.axis2.AxisFault;
import org.tempuri.MarketplaceAPIServiceStub;

public class BaseTest {

    protected static final String HEADER_MESSAGE_VERSION = "1.0";
    protected static MarketplaceAPIServiceStub stub;
    protected static String userName="cutemagnets-api";
    protected static String tokenId="ab7a0e53592048cd8a6696bdc5100a14";

    static {
        try {
            stub = new MarketplaceAPIServiceStub();
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        }
    }
}
