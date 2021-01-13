package com.mindtree.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.dto.BrandDto;
import com.mindtree.dto.CategoryDto;
import com.mindtree.dto.JacketDto;
import com.mindtree.dto.ShirtDto;
import com.mindtree.entity.Category;
import com.mindtree.entity.Jacket;
import com.mindtree.entity.Shirt;
import com.mindtree.service.BrandService;
import com.mindtree.service.CategoryService;
import com.mindtree.service.JacketService;
import com.mindtree.service.ShirtService;

@Controller
public class CategoryController {

	@Autowired
	CategoryService categoryService;

	@Autowired
	BrandService brandService;

	@Autowired
	JacketService jacketService;

	@Autowired
	ShirtService shirtservice;

	@RequestMapping("/")
	public String index() {
		return "homepage";
	}

	@RequestMapping("/addpage")
	public String addpage() {
		return "add";
	}

	@RequestMapping("/displaypage")
	public String displaypage(Model model) {
		model.addAttribute("category", categoryService.getallcategory());
		return "display";
	}

	@RequestMapping("/addcategory")
	public String addcategorypage() {
		return "addcategory";
	}
	@RequestMapping("/addjacket")
	public String addj() {
		return "addjacket";
	}

	@RequestMapping("/addshirt")
	public String adds() {
		return "addshirt";
	}
	@RequestMapping("/addbrand")
	public String addbrandpage(Model model) {
		List<Category> categories = categoryService.getCategories();
		model.addAttribute("categories", categories);
		return "addbrand";
	}

	@RequestMapping("/addjacketform")
	public String addjacketpage(Model model) {
		List<BrandDto> brands = brandService.getbrand();
		model.addAttribute("brands", brands);
		return "addjacket";
	}

	@RequestMapping("/addshirtform")
	public String addshirtpage(Model model) {
		List<BrandDto> brands = brandService.getbrand();
		model.addAttribute("brands", brands);
		return "addshirt";
	}


	@PostMapping("/category")
	public String addCategory(CategoryDto categoryDto) {
		CategoryDto saveddto = categoryService.addCategory(categoryDto);
		return "add";

	}

	@GetMapping("/brandbycategoryid")
	public String  getcategory(@RequestParam int categoryId,Model model) {
		 List<BrandDto> brands=categoryService.getbrands(categoryId);
		 System.err.println(brands);
		 model.addAttribute("brands",brands);
		 return "brands";
	}

	@PostMapping("/brand")
	public String addBrand(BrandDto brandDto, int categoryId)
	{

		CategoryDto saveddto = brandService.addBrand(brandDto, categoryId);
		return "add";
	}

	@PostMapping("/jacket")
	public String addjacket(int brandId, JacketDto jacketDto) {
		BrandDto saveddto = jacketService.addjacket(jacketDto,brandId);

		return "add";

	}

	@PostMapping("/shirt")
	public String addshirt(int brandId, ShirtDto shirtDto) {
		BrandDto saveddto = shirtservice.addshirt(brandId, shirtDto);
		return "add";
	}

	@RequestMapping("/displaycategory")
	public String displaycategory(Model model) {
		model.addAttribute("category", categoryService.getallcategory());

		return "add";
	}

	@RequestMapping("/displayjacket")
	public String displaybrandjacket(Model model) {
		System.out.println("here");
		model.addAttribute("brand", brandService.getbrand());
		return "addjacket";
	}

	@RequestMapping("/displaybrandshirt")
	public String displaybrandshirt(Model model) {
		model.addAttribute("brand", brandService.getbrand());
		return "addshirt";
	}

	@RequestMapping(value = "/Listofjackets", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getjackets(Model model) {
		List<Shirt> listofshirts = shirtservice.getallshirts();
		List<Jacket> listofjackets = jacketService.getalljackets();
		for (Jacket j : listofjackets) {
			System.out.println(j);
		}
		// model.addAttribute("jacket", new Jacket());
		model.addAttribute("listofjackets", listofjackets);
		model.addAttribute("listofshirts", listofshirts);
		return "getalljackets";

	}

	@RequestMapping(value = "/Listofshirts", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getbrands(Model model) {
		List<Shirt> listofshirts = shirtservice.getallshirts();
		for (Shirt s : listofshirts) {
			System.out.println(s);
		}
		// model.addAttribute("shirt", );
		model.addAttribute("listofshirts", listofshirts);
		// model.addAttribute("listofshirts", listofshirts);
		return "getallshirts";

	}
}
