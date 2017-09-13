/**
 * MarketplaceAPIServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.5  Built on : May 06, 2017 (03:45:26 BST)
 */
package org.tempuri;


/**
 *  MarketplaceAPIServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class MarketplaceAPIServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public MarketplaceAPIServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public MarketplaceAPIServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getSellerInformation method
     * override this method for handling normal response from getSellerInformation operation
     */
    public void receiveResultgetSellerInformation(
        com.cdiscount.www.GetSellerInformationResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getSellerInformation operation
     */
    public void receiveErrorgetSellerInformation(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for submitFulfilmentOnDemandSupplyOrder method
     * override this method for handling normal response from submitFulfilmentOnDemandSupplyOrder operation
     */
    public void receiveResultsubmitFulfilmentOnDemandSupplyOrder(
        com.cdiscount.www.SubmitFulfilmentOnDemandSupplyOrderResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from submitFulfilmentOnDemandSupplyOrder operation
     */
    public void receiveErrorsubmitFulfilmentOnDemandSupplyOrder(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getOrderQuestionList method
     * override this method for handling normal response from getOrderQuestionList operation
     */
    public void receiveResultgetOrderQuestionList(
        com.cdiscount.www.GetOrderQuestionListResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getOrderQuestionList operation
     */
    public void receiveErrorgetOrderQuestionList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getFulfilmentSupplyOrderReportList method
     * override this method for handling normal response from getFulfilmentSupplyOrderReportList operation
     */
    public void receiveResultgetFulfilmentSupplyOrderReportList(
        com.cdiscount.www.GetFulfilmentSupplyOrderReportListResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getFulfilmentSupplyOrderReportList operation
     */
    public void receiveErrorgetFulfilmentSupplyOrderReportList(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getFulfilmentOrderListToSupply method
     * override this method for handling normal response from getFulfilmentOrderListToSupply operation
     */
    public void receiveResultgetFulfilmentOrderListToSupply(
        com.cdiscount.www.GetFulfilmentOrderListToSupplyResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getFulfilmentOrderListToSupply operation
     */
    public void receiveErrorgetFulfilmentOrderListToSupply(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createRefundVoucher method
     * override this method for handling normal response from createRefundVoucher operation
     */
    public void receiveResultcreateRefundVoucher(
        com.cdiscount.www.CreateRefundVoucherResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createRefundVoucher operation
     */
    public void receiveErrorcreateRefundVoucher(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getRelaysFileSubmissionResult method
     * override this method for handling normal response from getRelaysFileSubmissionResult operation
     */
    public void receiveResultgetRelaysFileSubmissionResult(
        com.cdiscount.www.GetRelaysFileSubmissionResultResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getRelaysFileSubmissionResult operation
     */
    public void receiveErrorgetRelaysFileSubmissionResult(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for submitProductPackage method
     * override this method for handling normal response from submitProductPackage operation
     */
    public void receiveResultsubmitProductPackage(
        com.cdiscount.www.SubmitProductPackageResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from submitProductPackage operation
     */
    public void receiveErrorsubmitProductPackage(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getSellerIndicators method
     * override this method for handling normal response from getSellerIndicators operation
     */
    public void receiveResultgetSellerIndicators(
        com.cdiscount.www.GetSellerIndicatorsResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getSellerIndicators operation
     */
    public void receiveErrorgetSellerIndicators(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for closeDiscussionList method
     * override this method for handling normal response from closeDiscussionList operation
     */
    public void receiveResultcloseDiscussionList(
        com.cdiscount.www.CloseDiscussionListResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from closeDiscussionList operation
     */
    public void receiveErrorcloseDiscussionList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getOfferList method
     * override this method for handling normal response from getOfferList operation
     */
    public void receiveResultgetOfferList(
        com.cdiscount.www.GetOfferListResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getOfferList operation
     */
    public void receiveErrorgetOfferList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getFulfilmentDeliveryDocument method
     * override this method for handling normal response from getFulfilmentDeliveryDocument operation
     */
    public void receiveResultgetFulfilmentDeliveryDocument(
        com.cdiscount.www.GetFulfilmentDeliveryDocumentResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getFulfilmentDeliveryDocument operation
     */
    public void receiveErrorgetFulfilmentDeliveryDocument(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for submitFulfilmentSupplyOrder method
     * override this method for handling normal response from submitFulfilmentSupplyOrder operation
     */
    public void receiveResultsubmitFulfilmentSupplyOrder(
        com.cdiscount.www.SubmitFulfilmentSupplyOrderResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from submitFulfilmentSupplyOrder operation
     */
    public void receiveErrorsubmitFulfilmentSupplyOrder(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getParcelShopList method
     * override this method for handling normal response from getParcelShopList operation
     */
    public void receiveResultgetParcelShopList(
        com.cdiscount.www.GetParcelShopListResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getParcelShopList operation
     */
    public void receiveErrorgetParcelShopList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for submitOfferPackage method
     * override this method for handling normal response from submitOfferPackage operation
     */
    public void receiveResultsubmitOfferPackage(
        com.cdiscount.www.SubmitOfferPackageResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from submitOfferPackage operation
     */
    public void receiveErrorsubmitOfferPackage(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createExternalOrder method
     * override this method for handling normal response from createExternalOrder operation
     */
    public void receiveResultcreateExternalOrder(
        com.cdiscount.www.CreateExternalOrderResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createExternalOrder operation
     */
    public void receiveErrorcreateExternalOrder(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getFulfilmentActivationReportList method
     * override this method for handling normal response from getFulfilmentActivationReportList operation
     */
    public void receiveResultgetFulfilmentActivationReportList(
        com.cdiscount.www.GetFulfilmentActivationReportListResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getFulfilmentActivationReportList operation
     */
    public void receiveErrorgetFulfilmentActivationReportList(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getOfferQuestionList method
     * override this method for handling normal response from getOfferQuestionList operation
     */
    public void receiveResultgetOfferQuestionList(
        com.cdiscount.www.GetOfferQuestionListResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getOfferQuestionList operation
     */
    public void receiveErrorgetOfferQuestionList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getDiscussionMailList method
     * override this method for handling normal response from getDiscussionMailList operation
     */
    public void receiveResultgetDiscussionMailList(
        com.cdiscount.www.GetDiscussionMailListResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getDiscussionMailList operation
     */
    public void receiveErrorgetDiscussionMailList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getProductPackageSubmissionResult method
     * override this method for handling normal response from getProductPackageSubmissionResult operation
     */
    public void receiveResultgetProductPackageSubmissionResult(
        com.cdiscount.www.GetProductPackageSubmissionResultResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getProductPackageSubmissionResult operation
     */
    public void receiveErrorgetProductPackageSubmissionResult(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for submitRelaysFile method
     * override this method for handling normal response from submitRelaysFile operation
     */
    public void receiveResultsubmitRelaysFile(
        com.cdiscount.www.SubmitRelaysFileResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from submitRelaysFile operation
     */
    public void receiveErrorsubmitRelaysFile(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getProductPackageProductMatchingFileData method
     * override this method for handling normal response from getProductPackageProductMatchingFileData operation
     */
    public void receiveResultgetProductPackageProductMatchingFileData(
        com.cdiscount.www.GetProductPackageProductMatchingFileDataResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getProductPackageProductMatchingFileData operation
     */
    public void receiveErrorgetProductPackageProductMatchingFileData(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getOrderClaimList method
     * override this method for handling normal response from getOrderClaimList operation
     */
    public void receiveResultgetOrderClaimList(
        com.cdiscount.www.GetOrderClaimListResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getOrderClaimList operation
     */
    public void receiveErrorgetOrderClaimList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getModelList method
     * override this method for handling normal response from getModelList operation
     */
    public void receiveResultgetModelList(
        com.cdiscount.www.GetModelListResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getModelList operation
     */
    public void receiveErrorgetModelList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getOfferListPaginated method
     * override this method for handling normal response from getOfferListPaginated operation
     */
    public void receiveResultgetOfferListPaginated(
        com.cdiscount.www.GetOfferListPaginatedResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getOfferListPaginated operation
     */
    public void receiveErrorgetOfferListPaginated(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAllowedCategoryTree method
     * override this method for handling normal response from getAllowedCategoryTree operation
     */
    public void receiveResultgetAllowedCategoryTree(
        com.cdiscount.www.GetAllowedCategoryTreeResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAllowedCategoryTree operation
     */
    public void receiveErrorgetAllowedCategoryTree(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getExternalOrderStatus method
     * override this method for handling normal response from getExternalOrderStatus operation
     */
    public void receiveResultgetExternalOrderStatus(
        com.cdiscount.www.GetExternalOrderStatusResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getExternalOrderStatus operation
     */
    public void receiveErrorgetExternalOrderStatus(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getOfferPackageSubmissionResult method
     * override this method for handling normal response from getOfferPackageSubmissionResult operation
     */
    public void receiveResultgetOfferPackageSubmissionResult(
        com.cdiscount.www.GetOfferPackageSubmissionResultResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getOfferPackageSubmissionResult operation
     */
    public void receiveErrorgetOfferPackageSubmissionResult(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getProductListByIdentifier method
     * override this method for handling normal response from getProductListByIdentifier operation
     */
    public void receiveResultgetProductListByIdentifier(
        com.cdiscount.www.GetProductListByIdentifierResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getProductListByIdentifier operation
     */
    public void receiveErrorgetProductListByIdentifier(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for submitOfferStateAction method
     * override this method for handling normal response from submitOfferStateAction operation
     */
    public void receiveResultsubmitOfferStateAction(
        com.cdiscount.www.SubmitOfferStateActionResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from submitOfferStateAction operation
     */
    public void receiveErrorsubmitOfferStateAction(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for validateOrderList method
     * override this method for handling normal response from validateOrderList operation
     */
    public void receiveResultvalidateOrderList(
        com.cdiscount.www.ValidateOrderListResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from validateOrderList operation
     */
    public void receiveErrorvalidateOrderList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getFulfilmentSupplyOrder method
     * override this method for handling normal response from getFulfilmentSupplyOrder operation
     */
    public void receiveResultgetFulfilmentSupplyOrder(
        com.cdiscount.www.GetFulfilmentSupplyOrderResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getFulfilmentSupplyOrder operation
     */
    public void receiveErrorgetFulfilmentSupplyOrder(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for manageParcel method
     * override this method for handling normal response from manageParcel operation
     */
    public void receiveResultmanageParcel(
        com.cdiscount.www.ManageParcelResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from manageParcel operation
     */
    public void receiveErrormanageParcel(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAllModelList method
     * override this method for handling normal response from getAllModelList operation
     */
    public void receiveResultgetAllModelList(
        com.cdiscount.www.GetAllModelListResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAllModelList operation
     */
    public void receiveErrorgetAllModelList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getProductStockList method
     * override this method for handling normal response from getProductStockList operation
     */
    public void receiveResultgetProductStockList(
        com.cdiscount.www.GetProductStockListResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getProductStockList operation
     */
    public void receiveErrorgetProductStockList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for submitFulfilmentActivation method
     * override this method for handling normal response from submitFulfilmentActivation operation
     */
    public void receiveResultsubmitFulfilmentActivation(
        com.cdiscount.www.SubmitFulfilmentActivationResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from submitFulfilmentActivation operation
     */
    public void receiveErrorsubmitFulfilmentActivation(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getProductList method
     * override this method for handling normal response from getProductList operation
     */
    public void receiveResultgetProductList(
        com.cdiscount.www.GetProductListResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getProductList operation
     */
    public void receiveErrorgetProductList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getBrandList method
     * override this method for handling normal response from getBrandList operation
     */
    public void receiveResultgetBrandList(
        com.cdiscount.www.GetBrandListResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getBrandList operation
     */
    public void receiveErrorgetBrandList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for generateDiscussionMailGuid method
     * override this method for handling normal response from generateDiscussionMailGuid operation
     */
    public void receiveResultgenerateDiscussionMailGuid(
        com.cdiscount.www.GenerateDiscussionMailGuidResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from generateDiscussionMailGuid operation
     */
    public void receiveErrorgenerateDiscussionMailGuid(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getGlobalConfiguration method
     * override this method for handling normal response from getGlobalConfiguration operation
     */
    public void receiveResultgetGlobalConfiguration(
        com.cdiscount.www.GetGlobalConfigurationResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getGlobalConfiguration operation
     */
    public void receiveErrorgetGlobalConfiguration(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getOrderList method
     * override this method for handling normal response from getOrderList operation
     */
    public void receiveResultgetOrderList(
        com.cdiscount.www.GetOrderListResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getOrderList operation
     */
    public void receiveErrorgetOrderList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createRefundVoucherAfterShipment method
     * override this method for handling normal response from createRefundVoucherAfterShipment operation
     */
    public void receiveResultcreateRefundVoucherAfterShipment(
        com.cdiscount.www.CreateRefundVoucherAfterShipmentResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createRefundVoucherAfterShipment operation
     */
    public void receiveErrorcreateRefundVoucherAfterShipment(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAllAllowedCategoryTree method
     * override this method for handling normal response from getAllAllowedCategoryTree operation
     */
    public void receiveResultgetAllAllowedCategoryTree(
        com.cdiscount.www.GetAllAllowedCategoryTreeResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAllAllowedCategoryTree operation
     */
    public void receiveErrorgetAllAllowedCategoryTree(java.lang.Exception e) {
    }
}
