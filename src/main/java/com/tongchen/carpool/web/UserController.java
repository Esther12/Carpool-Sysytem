package com.tongchen.carpool.web;

import com.tongchen.carpool.entity.User;
import com.tongchen.carpool.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by tongchen on 2016-11-06.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private HttpServletRequest httpServletRequest;
    @ResponseBody
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public int userReg(User user) {
        int userIdentity = user.getUserIdentity();
        String userName = user.getUserName();
        return userIdentity;
    }
////        if(user.getPhone_mobile()==null || user.getLogin_password()==null || !matcher.matches()){
////            return "index.jsp";
////        }
//
//        //获取当前注册时间
////        Date date = new Date();
////        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
////        map.put("register_time", df.format(date));
//
//        //将数据添加到数据库中
//        if(userService.insertNewUser(user.getUserName(),user.getUserPassword(),user.getUserTele(),user.getUserIdentity())){
//            httpServletRequest.setAttribute("phone_mobile", user.getPhone_mobile());
//            req.setAttribute("login_password", user.getLogin_password());
//            return "pages/register_success.jsp";
//        }else {
//            return "pages/register_success.jsp";
//        }
//    }

//
//    //处理用户名唯一性的判断
//    @RequestMapping("/check")
//    public User userJudge(String phone_mobile) {
//        User u = sqlSession.selectOne("com.register.dao.judgeUser",phone_mobile);
//        System.out.println(u.getPhone_mobile());
//        return u;
//    }

    //用户登录的判断
//    @RequestMapping("/login")
//    public String userLogin(String userName,String userPassword){
//        //对页面传回的值进行二次判断
//        if(userName==null || userName==null){
//            return "pages/user-login-no.jsp";
//        }
//        User user = userService.userLogin(userName,userPassword);
//        //查到用户了，执行登录成功的操作
//        if(user!=null){
//            httpServletRequest.getSession().setAttribute("user",user);
//            return "pages/user-login-ok.jsp";
//        }else{
//            return "pages/user-login-no.jsp";
//        }
//    }
    @RequestMapping("/exit")
    public String userExit(HttpSession session){
        session.invalidate();
        return "index.jsp";
    }

}
