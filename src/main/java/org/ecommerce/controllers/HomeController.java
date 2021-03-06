package org.ecommerce.controllers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.ecommerce.dto.CategorysBrandsDto;
import org.ecommerce.models.entity.ItemsBrands;
import org.ecommerce.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/index")
public class HomeController {

    @Autowired
    ItemsService itemsService;
    @Autowired
    ItemsCategoryService  itemsCategoryService;
    @Autowired
    CategoriesBrandsService categoriesBrandsService;
    @Autowired
    ItemsBrandsService itemsBrandsService;
    @Autowired
    itemWIService itemWIService;
    @Autowired
    ItemSizeLService itemSizeLService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView home(ModelAndView mav)
    {
        mav=new ModelAndView("index");
        mav.addObject("brandCounts", itemsBrandsService.getCount());
        mav.addObject("itemsDtos",itemsService.getAllDto());
        mav.addObject("CategorysBrandsDto", categoriesBrandsService.getCategorysBrands());
        return mav;
    }
    @RequestMapping(value = "/AddToCart",method = RequestMethod.POST)
    public @ResponseBody ModelAndView AddtoCart(HttpSession httpSession)
    {
        ModelAndView mav=new ModelAndView("");
        return mav;
    }
    @RequestMapping(value = "/click_wsize_select",method = RequestMethod.GET)
    public @ResponseBody
    String clickWsizeSelect(@RequestParam int wsize_id,@RequestParam int item_id) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        String jsonStr = mapper.writeValueAsString(itemSizeLService.getSelectedLList(wsize_id,item_id));

        return jsonStr;
    }
}

