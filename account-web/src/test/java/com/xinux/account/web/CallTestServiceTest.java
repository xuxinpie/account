package com.xinux.account.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.xinux.account.common.utils.StringUtil;
import com.xinux.account.service.biz.TestService;

/**
 * Created by Xinux on 02/12/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring/account-web-spring.xml"})
public class CallTestServiceTest {

    @Autowired
    private TestService testService;

    @Test
    public void testTestMethod() throws Exception {
        Assert.isTrue(StringUtil.equals("Xinux", testService.showUserName()));
    }
}