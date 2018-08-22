package com.cdiscount.product;

import java.rmi.RemoteException;

import com.cdiscount.BaseTest;
import com.cdiscount.www.GetProductListDocument;
import com.cdiscount.www.GetProductListDocument.GetProductList;
import com.cdiscount.www.GetProductListResponseDocument;
import com.cdiscount.www.Product;
import com.cdiscount.www.ProductFilter;

public class GetProductListTest extends BaseTest {

    public static void main(String[] args) {
        GetProductListDocument client = GetProductListDocument.Factory.newInstance();
        GetProductList request = client.addNewGetProductList();
        // 设置消息头
        setHeaderMessage(request.addNewHeaderMessage());;
        // 设置查询条件
        ProductFilter filter = request.addNewProductFilter();
        filter.setCategoryCode("06040201");
        try {
            GetProductListResponseDocument response = stub.getProductList(client);
            Product[] Products = response.getGetProductListResponse().getGetProductListResult().getProductList().getProductArray();
            for (Product product:Products) {
                System.out.println(product.getSKU());
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
