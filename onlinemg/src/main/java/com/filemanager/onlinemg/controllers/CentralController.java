package com.filemanager.onlinemg.controllers;



import com.filemanager.onlinemg.exeptions.NotFoundExeptions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/")
public class CentralController {


    @GetMapping("/")
    public String getHome()
    {
        return "home";
    }


    @GetMapping("hello")
    public String getHello()
    {
        return "hello";
    }


    @GetMapping("login")
    public String getLogin()
    {
        return "login";
    }





}
