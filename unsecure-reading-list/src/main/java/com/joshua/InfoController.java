package com.joshua;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by joshua on 2017/10/25.
 */

@Controller
@RequestMapping("/info")
public class InfoController {

    @RequestMapping(method = RequestMethod.GET)
    public String getInfo(Model model){
        model.addAttribute("info","message");
        System.out.println("info message");
        return "info";
    }
}
