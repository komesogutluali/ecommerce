package org.ecommerce.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/index")
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView home(ModelAndView mav)
    {
        mav=new ModelAndView("index");
        return mav;
    }


}
