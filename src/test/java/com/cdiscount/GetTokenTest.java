package com.cdiscount;

import org.xmlsoap.schemas.soap.encoding.Token;
import org.xmlsoap.schemas.soap.encoding.TokenDocument;

/**
 * 测试获取Cdiscount Token
 *
 * create in 2018年8月18日
 * @author wangpeng
 */
public class GetTokenTest extends BaseTest {

    public static void main(String[] args) {
        TokenDocument document = TokenDocument.Factory.newInstance();
        Token token = document.addNewToken();
    }
}
