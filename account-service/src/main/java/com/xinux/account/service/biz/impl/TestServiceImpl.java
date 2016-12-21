/**
 * Bilibili.com Inc.
 * Copyright (c) 2009-2016 All Rights Reserved.
 */
package com.xinux.account.service.biz.impl;

import org.springframework.stereotype.Service;

import com.xinux.account.service.biz.TestService;

/**
 * @author Xinux
 * @version $Id: TestServiceImpl.java, v 0.1 2016-11-25 12:14 AM Xinux Exp $$
 */
@Service
public class TestServiceImpl implements TestService {

	@Override
	public String showUserName() {
		return "Xinux";
	}
}