package com.cdiscount;

import java.rmi.RemoteException;

import org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage;
import org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Country;
import org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Language;
import org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage;
import org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage;
import org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext;

import com.cdiscount.www.GetOrderListDocument;
import com.cdiscount.www.GetOrderListDocument.GetOrderList;
import com.cdiscount.www.GetOrderListResponseDocument;
import com.cdiscount.www.Order;

public class GetOrderListTest extends BaseTest {

    public static void main(String[] args) {
        // document可以类比为客户端client
        GetOrderListDocument client = GetOrderListDocument.Factory.newInstance();
        // 可以类比为请求
        GetOrderList request = client.addNewGetOrderList();
        /**
         * https://dev.cdiscount.com/marketplace/?page_id=212
         */
        HeaderMessage headerMessage = request.addNewHeaderMessage();
        headerMessage.setVersion(HEADER_MESSAGE_VERSION);
        SecurityContext security = headerMessage.addNewSecurity();
        security.setTokenId(tokenId);
        security.setUserName(userName);
        security.addNewDomainRightsList().setDomainRightsArray(null);
        security.setIssuerID("");
        security.setSessionID("");
        ContextMessage context = headerMessage.addNewContext();
        context.setCatalogID(1);
        context.setSiteID(100);
        LocalizationMessage localization = headerMessage.addNewLocalization();
        localization.setCountry(Country.CN);
        localization.setLanguage(Language.EN);
        try {
            GetOrderListResponseDocument responseDocument = stub.getOrderList(client);
            Order[] brands=responseDocument.getGetOrderListResponse().getGetOrderListResult().getOrderList().getOrderArray();
            for (Order brand:brands) {
                System.out.println(brand.getOrderNumber());
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
