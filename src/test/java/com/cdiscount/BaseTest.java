package com.cdiscount;

import org.apache.axis2.AxisFault;
import org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage;
import org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Country;
import org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Currency;
import org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage;
import org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language;
import org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage;
import org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext;
import org.tempuri.MarketplaceAPIServiceStub;

/**
 * 测试基类
 *
 * create in 2018年8月22日
 * @author wangpeng
 */
public class BaseTest {

    protected static final String HEADER_MESSAGE_VERSION = "1.0";
    protected static MarketplaceAPIServiceStub stub;
    protected static String userName="cutemagnets-api";
    protected static String tokenId="ab7a0e53592048cd8a6696bdc5100a13";

    static {
        try {
            stub = new MarketplaceAPIServiceStub();
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        }
    }
    
    protected static void setHeaderMessage(HeaderMessage header) {
        header.setVersion(HEADER_MESSAGE_VERSION);

        SecurityContext security = header.addNewSecurity();
        security.setIssuerID("");
        security.setSessionID("");
        security.setTokenId(tokenId);
        security.setUserName(userName);
        security.addNewDomainRightsList().setDomainRightsArray(null);

        ContextMessage context = header.addNewContext();
        context.setCatalogID(1);
        context.setCustomerPoolID(1);
        context.setSiteID(100);
        // 本地化信息
        LocalizationMessage localizationMessage = header.addNewLocalization();
        localizationMessage.setCountry(Country.US);
        localizationMessage.setCurrency(Currency.USD);
        localizationMessage.setDecimalPosition(2);
        localizationMessage.setLanguage(Language.EN);
    }
}
