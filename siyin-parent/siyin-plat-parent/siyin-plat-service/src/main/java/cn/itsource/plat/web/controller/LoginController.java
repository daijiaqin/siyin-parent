package cn.itsource.plat.web.controller;

import cn.itsource.palt.domain.User;
import cn.itsource.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody User user){
        System.out.println(user);
        if ("admin".equals(user.getUsername())&&"admin".equals(user.getPassword())){

            return AjaxResult.myAjax().setSuccess(true).setMessager("登录成功").setRestobj(user);
        }
        return AjaxResult.myAjax().setSuccess(false).setMessager("登录失败");
    }

}
