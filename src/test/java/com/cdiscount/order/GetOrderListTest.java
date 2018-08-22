package com.cdiscount.order;

import java.rmi.RemoteException;
import java.util.Calendar;

import com.cdiscount.BaseTest;
import com.cdiscount.www.ArrayOfOrderLine;
import com.cdiscount.www.GetOrderListDocument;
import com.cdiscount.www.GetOrderListDocument.GetOrderList;
import com.cdiscount.www.GetOrderListResponseDocument;
import com.cdiscount.www.Order;
import com.cdiscount.www.OrderFilter;
import com.cdiscount.www.OrderLine;

/**
 * GetOrderList
 *
 * create in 2018年8月22日
 * @author wangpeng
 * @see https://dev.cdiscount.com/marketplace/?page_id=130
 */
public class GetOrderListTest extends BaseTest {

    public static void main(String[] args) {
        // document可以类比为客户端client
        GetOrderListDocument client = GetOrderListDocument.Factory.newInstance();
        // 可以类比为请求
        GetOrderList request = client.addNewGetOrderList();
        setHeaderMessage(request.addNewHeaderMessage());
        OrderFilter filter = request.addNewOrderFilter();

        Calendar beginModificationDate = Calendar.getInstance();
        beginModificationDate.add(Calendar.DAY_OF_YEAR, -10);
        filter.setBeginModificationDate(beginModificationDate);
        filter.setFetchOrderLines(true);
        try {
            GetOrderListResponseDocument response = stub.getOrderList(client);
            System.out.println(response.xmlText());
            Order[] brands = response.getGetOrderListResponse().getGetOrderListResult().getOrderList().getOrderArray();
            for (Order brand:brands) {
                ArrayOfOrderLine orderLineList = brand.getOrderLineList();
                OrderLine[] array = orderLineList.getOrderLineArray();
                for (OrderLine orderLine : array) {
                    System.out.println(orderLine.xmlText());
                }
                System.out.println(brand.getOrderNumber());
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
