package com.levon.controller;

import com.levon.entity.UserEntity;
import com.levon.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by forrest on 17-7-5.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;


    @RequestMapping(value = "/showUser",method = RequestMethod.GET)
    public String  toIndex(@RequestParam String  id, Model model){
            System.out.print("come ...."+id);
            UserEntity user=this.userService.getUserById(Integer.parseInt(id));
            System.out.print(" user="+user);
            model.addAttribute("user",user);
            return "hello";
    }



}
