package com.leo.geektimes.projects.user.web.controller;

import com.leo.geektimes.projects.user.domain.User;
import com.leo.geektimes.projects.user.service.UserService;
import com.leo.geektimes.projects.user.service.impl.UserServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author leo
 * @date 2021-03-03 22:25
 */
@Path("/user")
public class UserController {

    private UserService userService = new UserServiceImpl();

    /**
     * 跳转到注册页面
     * @return
     */
    @GET
    @Path("user/index")
    public String registerPage(){
        return "user/register.jsp";
    }

    /**
     * 进行注册操作
     * @return
     */

    @Path("user/register")
    public String register(HttpServletRequest request){
        String page = "";
        User user = new User();
        user.setName(request.getParameter("name"));
        user.setPassword(request.getParameter("password"));
        user.setEmail(request.getParameter("email"));
        user.setPhoneNumber(request.getParameter("phoneNumber"));
        boolean registerFlag = userService.register(user);
        System.out.println("程序执行的结果是:"+registerFlag);
        if(registerFlag) {
            //跳转到查询的页面
            request.setAttribute("userList",user);
            page = "user/userinfo.jsp";
        } else {
            //跳转到失败页面
            page =  "user/error.jsp";
        }
        return page;
    }

}
