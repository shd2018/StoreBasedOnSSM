package com.store.controller.PageController;

import com.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 显示商品部分
 * 主要为黄宁的部分
 */
@Controller
@RequestMapping("/Evaluation")
public class ProductPageController {

    @Autowired
    ProductService ProductService;


}
