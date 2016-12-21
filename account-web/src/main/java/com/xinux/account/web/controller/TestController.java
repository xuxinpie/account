/**
 * Bilibili.com Inc.
 * Copyright (c) 2009-2016 All Rights Reserved.
 */
package com.xinux.account.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xinux.account.common.log.LoggerFileNames;
import com.xinux.account.common.utils.LogUtil;
import com.xinux.account.service.biz.TestService;

/**
 * @author Xinux
 * @version $Id: TesteController.java, v 0.1 2016-12-01 3:02 PM Xinux Exp $$
 */
@Controller
@RequestMapping(value = "/welcome")
public class TestController {

    @Autowired
    private TestService testService;

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerFileNames.ACCOUNT_WEB);

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response,
                                ModelMap modelMap) {
        LogUtil.info(LOGGER, "[logback日志显示]进入了welcome controller");
        modelMap.put("user", testService.showUserName());
        LogUtil.info(LOGGER, "[logback日志显示]userName={0}", testService.showUserName());

        return new ModelAndView("welcome");

    }


}