
package com.igomall.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.igomall.entity.ProductCategory;
import com.igomall.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller - 商品分类
 * 
 * @author IGOMALL Team
 * @version 5.0
 */
@RestController("adminProductCategoryController")
@RequestMapping("/product_category")
public class ProductCategoryController extends BaseController {

	@Autowired
	private ProductCategoryService productCategoryService;

	@GetMapping("/list")
	@JsonView(ProductCategory.ListView.class)
	public List<ProductCategory> list(){
		return productCategoryService.findRoots();
	}
}