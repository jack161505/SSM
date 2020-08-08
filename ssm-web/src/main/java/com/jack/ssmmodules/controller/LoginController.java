package com.jack.ssmmodules.controller;

import com.jack.ssmmodules.pojo.SecUser;
import com.jack.ssmmodules.service.LoginService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login",method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String username=request.getParameter("loginname");
        String password=request.getParameter("loginpwd");
        String name;
        String pass;
        ModelAndView mav=new ModelAndView();
        List<SecUser> users=loginService.selectAll();
        JSONObject json=new JSONObject();
        PrintWriter wirte = null;
        for (SecUser u:users) {
            name=u.getUserName();
            pass=u.getPassword();
            if (name.equals(username)&&pass.equals(password))
            {
                json.put("flag","登录成功");
                json.put("user",u);
                json.put("page","success");
//                response.getWriter().write(json.toString());
                mav.addObject("users",u);
                mav.setViewName("success");
                 break;
            }else{
                mav.addObject("msg","用户或密码错误");
                mav.setViewName("fail");
            }
        }
        return mav;
    }
}
