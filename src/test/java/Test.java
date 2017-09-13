import com.cdiscount.www.*;
import org.apache.axis2.AxisFault;
import org.datacontract.schemas._2004._07.cdiscount_framework_core_communication_messages.*;
import org.tempuri.MarketplaceAPIServiceStub;

import java.rmi.RemoteException;

public class Test {
    private static MarketplaceAPIServiceStub stub;
    private static String userName="";
    private static String tokenId="";
    public static void main(String[] args) {

        try {
            stub=new MarketplaceAPIServiceStub();
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        }

        GetBrandListDocument getBrandListDocument=GetBrandListDocument.Factory.newInstance();
        GetBrandListDocument.GetBrandList getBrandList=getBrandListDocument.addNewGetBrandList();
        HeaderMessage headerMessage=getBrandList.addNewHeaderMessage();
        headerMessage.setVersion("1.0");
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
            GetBrandListResponseDocument responseDocument= stub.getBrandList(getBrandListDocument);
            Brand[] brands=responseDocument.getGetBrandListResponse().getGetBrandListResult().getBrandList().getBrandArray();
            for (Brand brand:brands) {
                System.out.println(brand.getBrandName());
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
