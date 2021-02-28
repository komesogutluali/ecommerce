package org.ecommerce.controllers;
import org.ecommerce.models.entity.Members;
import org.ecommerce.services.CategoriesBrandsService;
import org.ecommerce.services.ItemsBrandsService;
import org.ecommerce.services.ItemsService;
import org.ecommerce.services.MembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/shop")
public class ShopController {
    @Autowired
    private MembersService membersService;
    @Autowired
    private CategoriesBrandsService categoriesBrandsService;
    @Autowired
    private ItemsService itemsService;
    @Autowired
    private ItemsBrandsService itemsBrandsService;
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView shop(ModelAndView mav)
    {
        mav=new ModelAndView("shop");
        mav.addObject("brandCounts", itemsBrandsService.getCount());
        mav.addObject("itemsDtos",itemsService.getAllDto());
        mav.addObject("CategorysBrandsDto", categoriesBrandsService.getCategorysBrands());

        return mav;
    }

    @RequestMapping(value = "/product-details/{item_id}", method = RequestMethod.GET)
    public ModelAndView product_details(ModelAndView mav, @PathVariable int item_id) {
        mav=new ModelAndView("product-details");
        mav.addObject("CategorysBrandsDto",categoriesBrandsService.getCategorysBrands());
        mav.addObject("itemDto",itemsService.getItem(item_id));
        mav.addObject("brandCounts", itemsBrandsService.getCount());

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
    @RequestMapping(value = "/brands_items",method = RequestMethod.GET)
    public @ResponseBody ModelAndView brands_item_get(@RequestParam int brand_id,@RequestParam int category_id)
    {
           ModelAndView mav=new ModelAndView("brands_items");
             mav.addObject("itemsDtos",itemsService.getAllDto(category_id,brand_id));
             return mav;
    }
    @RequestMapping(value = "/brands_items_all",method = RequestMethod.GET)
    public @ResponseBody ModelAndView brands_items_all(@RequestParam int brand_id)
    {
        ModelAndView mav=new ModelAndView("items");
        mav.addObject("itemsDtos",itemsService.getBrandAll(brand_id));
        return mav;
    }
}