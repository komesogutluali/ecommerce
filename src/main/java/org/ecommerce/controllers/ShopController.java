package org.ecommerce.controllers;
import org.ecommerce.models.entity.Members;
import org.ecommerce.services.CategoriesBrandsService;
import org.ecommerce.services.ItemsService;
import org.ecommerce.services.MembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping(value = "/shop")
public class ShopController {
    @Autowired
    private MembersService membersService;
    @Autowired
    private CategoriesBrandsService categoriesBrandsService;
    @Autowired
    ItemsService itemsService;
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView shop(ModelAndView mav)
    {
     mav=new ModelAndView("shop");
        return mav;
    }

    @RequestMapping(value = "/product-details", method = RequestMethod.GET)
    public ModelAndView product_details(ModelAndView mav) {
        mav=new ModelAndView("product-details");
        mav.addObject("itemsDtos",itemsService.getAll());
        mav.addObject("CategorysBrandsDto",categoriesBrandsService.getCategorysBrands());
        return mav;
    }
    @RequestMapping(value = "/checkout",method = RequestMethod.GET)
    public ModelAndView checkout(ModelAndView mav)
    {
        mav=new ModelAndView("checkout");
        return mav;
    }
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView login(ModelAndView mav)
    {
        mav=new ModelAndView("login");
        mav.addObject("member",new Members());
        return mav;
    }
    @RequestMapping(value = "/cart",method = RequestMethod.GET)
    public ModelAndView cart(ModelAndView mav)
    {
        mav=new ModelAndView("cart");
        return mav;
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView log( @ModelAttribute("member") Members member)
    {
       ModelAndView mav=new ModelAndView("cart");
        return mav;
    }

}