package org.dromara.soul.admin.controller;

import org.dromara.soul.admin.result.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xuweixin
 * @date 2020-11-16
 * @description 监控检查，后续换成为服务自带的
 */
@Controller
public class WebStatusController {

    private static Logger logger = LoggerFactory.getLogger(WebStatusController.class);

    @RequestMapping(value = "/webStatus", method = {RequestMethod.GET, RequestMethod.HEAD})
    @ResponseBody
    public Result welcome(HttpServletRequest servletRequest) {
        return Result.success();
    }

}
