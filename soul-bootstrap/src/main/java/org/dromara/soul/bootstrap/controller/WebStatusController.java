package org.dromara.soul.bootstrap.controller;

import org.dromara.soul.bootstrap.domain.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


/**
 * 服务健康检查controller
 * @author xuweixin
 * @date 2020-11-11
 */
@RestController
public class WebStatusController {

    @RequestMapping(value = "/webStatus", method = {RequestMethod.GET, RequestMethod.HEAD})
    @ResponseBody
    public Result welcome(HttpServletRequest servletRequest) {
        return Result.buildSuccessResult();
    }

}
