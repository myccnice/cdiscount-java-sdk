package com.cdiscount.product;

import java.rmi.RemoteException;

import com.cdiscount.BaseTest;
import com.cdiscount.www.ArrayOfCategoryTree;
import com.cdiscount.www.CategoryTree;
import com.cdiscount.www.GetAllowedCategoryTreeDocument;
import com.cdiscount.www.GetAllowedCategoryTreeDocument.GetAllowedCategoryTree;
import com.cdiscount.www.GetAllowedCategoryTreeResponseDocument;

/**
 * GetAllowedCategoryTree
 *
 * create in 2018年8月22日
 * @author wangpeng
 * @see https://dev.cdiscount.com/marketplace/?page_id=222
 */
public class GetAllowedCategoryTreeTest extends BaseTest {

    public static void main(String[] args) throws RemoteException {
        GetAllowedCategoryTreeDocument client = GetAllowedCategoryTreeDocument.Factory.newInstance();

        GetAllowedCategoryTree request = client.addNewGetAllowedCategoryTree();
        setHeaderMessage(request.addNewHeaderMessage());

        GetAllowedCategoryTreeResponseDocument response = stub.getAllowedCategoryTree(client);
        System.out.println(response.xmlText());
        ArrayOfCategoryTree childrenCategoryList = response.getGetAllowedCategoryTreeResponse().getGetAllowedCategoryTreeResult().getCategoryTree().getChildrenCategoryList();
        CategoryTree[] categoryTreeArray = childrenCategoryList.getCategoryTreeArray();
        for (CategoryTree categoryTree : categoryTreeArray) {
            CategoryTree[] category = categoryTree.getChildrenCategoryList().getCategoryTreeArray();
            for (CategoryTree cat : category) {
                System.out.println(cat.getCode());
            }
        }
    }
}
