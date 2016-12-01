package com.xinux.account.web;

import com.xinux.account.serivce.biz.TestService;
import com.xinux.account.serivce.biz.impl.TestServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by Xinux on 25/11/2016.
 */
@RunWith(JUnit4.class)
public class CallTestServiceTest {

	private TestService testService = new TestServiceImpl();

	@Test
	public void test() {
		testService.testMethod();
	}

}