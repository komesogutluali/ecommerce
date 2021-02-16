package org.ecommerce.controllers;

import org.ecommerce.dto.CategorysBrandsDto;
import org.ecommerce.models.entity.ItemsBrands;
import org.ecommerce.services.CategoriesBrandsService;
import org.ecommerce.services.ItemsBrandsService;
import org.ecommerce.services.ItemsCategoryService;
import org.ecommerce.services.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/index")
public class HomeController {

    @Autowired
    ItemsService itemsService;
    @Autowired
    ItemsCategoryService  itemsCategoryService;
    @Autowired
    CategoriesBrandsService categoriesBrandsService;
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView home(ModelAndView mav)
    {
        mav=new ModelAndView("index");
        mav.addObject("itemsDtos",itemsService.getAll());
        mav.addObject("CategorysBrandsDto", categoriesBrandsService.getCategorysBrands());
        return mav;
    }


}

