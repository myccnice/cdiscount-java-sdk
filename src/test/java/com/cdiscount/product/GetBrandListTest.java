package com.cdiscount.product;
import java.rmi.RemoteException;

import org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.ContextMessage;
import org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.Country;
import org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.HeaderMessage;
import org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.LocalizationMessage;
import org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.SecurityContext;

import com.cdiscount.BaseTest;
import com.cdiscount.www.Brand;
import com.cdiscount.www.GetBrandListDocument;
import com.cdiscount.www.GetBrandListDocument.GetBrandList;
import com.cdiscount.www.GetBrandListResponseDocument;

/**
 * GetBrandList
 *
 * create in 2018年8月22日
 * @author wangpeng
 * @see https://dev.cdiscount.com/marketplace/?page_id=236
 */
public class GetBrandListTest extends BaseTest {

    public static void main(String[] args) {
        GetBrandListDocument document = GetBrandListDocument.Factory.newInstance();
        GetBrandList brandList = document.addNewGetBrandList();

        HeaderMessage headerMessage = brandList.addNewHeaderMessage();
        headerMessage.setVersion(HEADER_MESSAGE_VERSION);
        SecurityContext securityContext=headerMessage.addNewSecurity();
        securityContext.setTokenId(tokenId);
        securityContext.setUserName(userName);
        securityContext.addNewDomainRightsList().setDomainRightsArray(null);
        securityContext.setIssuerID("");
        securityContext.setSessionID("");
        ContextMessage contextMessage=headerMessage.addNewContext();
        contextMessage.setCatalogID(1);
        contextMessage.setSiteID(100);
        LocalizationMessage localizationMessage=headerMessage.addNewLocalization();
        localizationMessage.setCountry(Country.CN);
        try {
            GetBrandListResponseDocument responseDocument= stub.getBrandList(document);
            Brand[] brands=responseDocument.getGetBrandListResponse().getGetBrandListResult().getBrandList().getBrandArray();
            for (Brand brand:brands) {
                System.out.println(brand.getBrandName());
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
