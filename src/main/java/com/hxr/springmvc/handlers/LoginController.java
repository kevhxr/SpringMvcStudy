package com.hxr.springmvc.handlers;

import com.hxr.springmvc.models.User;
import com.hxr.springmvc.models.UserContainer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/springmvc")
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(
            User user,
            @RequestParam(value = "userName",defaultValue = "kevin",required = false) String userName,
            @RequestParam(value = "password",defaultValue = "1111111",required = false) String password){

        System.out.println("user name is:"+user.getUserName());
        System.out.println("user password is:"+user.getPassword());

        System.out.println("name is:"+userName);
        System.out.println("password is:"+password);
        return "success";
    }

    @RequestMapping("/login2")
    public String login2(
            @RequestParam(value = "userName",defaultValue = "kevin",required = false) String userName,
            @RequestParam(value = "password",defaultValue = "1111111",required = false) String password,
            @RequestParam(value = "identity")List<String> identities){
        System.out.println("name is:"+userName +", password is:"+password);
        System.out.println("identities are:"+identities);
        return "success";
    }

    @RequestMapping("/login3")
    public String login3(UserContainer userContainer){
        System.out.println(userContainer);
        return "success";
    }

    @RequestMapping("/login4/{passwd}/{name1}")
    public String login4(@PathVariable("name1")String name,@PathVariable("passwd")String passwd){
        System.out.println(name+" ffff "+passwd);
        return "success";
    }


    @RequestMapping("/login5")
    public String login5(){
        System.out.println("login5");
        return "login6";
    }
    @RequestMapping("/login6")
    public String login6(){
        System.out.println("login6666");
        return "success";
    }
}
