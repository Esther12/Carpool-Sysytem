package com.tongchen.carpool.web;

import com.tongchen.carpool.entity.Request;
import com.tongchen.carpool.service.RequestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by tongchen on 2016-11-10.
 */
@Controller
@RequestMapping(value = "/request")
public class RequestController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private RequestService requestService;
    @RequestMapping(value = "/{userIdentity}/list", method = RequestMethod.GET)
    public String list(@PathVariable("userIdentity") Integer userIdentity, Model model) {
        //获取列表页
        List<Request> list=null;
        if (userIdentity==0){
            list = requestService.getRequestList(1);
        }
        if (userIdentity==1){
            list = requestService.getRequestList(0);
        }
        model.addAttribute("list", list);
        //list.jsp + model = ModelAndView
        return "list";// /WEB-INF/jsp/"list".jsp
    }
    @RequestMapping(value = "/{requestId}/detail", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Request detail(@PathVariable("requestId") Long requestId) {
        Request request = requestService.getRequestById(requestId);
        return request;
    }
//    @RequestMapping(value = "/{requestId}/reserve", method = RequestMethod.POST)
//    public String reserve(@PathVariable("requestId") Long requestId) {
//        //获取列表页
//        List<Request> list=null;
//        if (userIdentity==0){
//            list = requestService.getRequestList(1);
//        }
//        if (userIdentity==1){
//            list = requestService.getRequestList(0);
//        }
//        //list.jsp + model = ModelAndView
//        return "list";// /WEB-INF/jsp/"list".jsp
//    }
}
