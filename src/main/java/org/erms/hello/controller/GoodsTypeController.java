package org.erms.hello.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.PropertyUtils;
import org.erms.hello.bean.GoodsType;
import org.erms.hello.dao.GoodsTypeMapper;
import org.erms.hello.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.HandlerMapping;

@Controller
@RequestMapping("/goods")
public class GoodsTypeController {

	@Autowired
	private GoodsTypeMapper mapper;
	@Autowired
	private GoodsTypeService service;
	// @Autowired
	// private HttpServletRequest request;

	private List<GoodsType> goodsTypes;
	private GoodsType goodsType;

	@RequestMapping("/type_load")
	public String load(Model model) {
		// model.addAttribute("name", "Hello World!");
		// goodsType = new GoodsType();
		// goodsType.setType_name("测试类型1");
		// goodsType.setType_group("组1 组2 组3");
		// goodsType.setStatus(1);
		// goodsType.setLm_user("AA");
		// mapper.insert(goodsType);
		// System.out.println("Mapper Insert Successful!" + ":" + goodsType.getUuid());
		// goodsType.setType_group("普通白酒Service");
		// service.insert(goodsType);
		// System.out.println("Service Insert Successful!" + ":" + goodsType.getUuid());
		return "/goods/type_edit";
	}

	@RequestMapping(value = "/type_add", method = RequestMethod.POST)
	public String add(GoodsType goodsType, Model model) {
		// model.addAttribute("name", "Hello World!");
		// goodsType = new GoodsType();
		// goodsType.setType_name("测试类型1");
		// goodsType.setType_group("组1 组2 组3");
		// goodsType.setStatus(1);
		// goodsType.setLm_user("AA");
		// mapper.insert(goodsType);
		// System.out.println("Mapper Insert Successful!" + ":" + goodsType.getUuid());
		// goodsType.setType_group("普通白酒Service");
		// service.insert(goodsType);
		// System.out.println("Service Insert Successful!" + ":" + goodsType.getUuid());
		// BeanTest.printBean(goodsType);
		// return "forward:/hello";
		return "redirect:type_list";
		// return "/goods/type_edit";
	}

	@RequestMapping("/type_get/{uuid}")
	public String get(@PathVariable Integer uuid, Model model, HttpServletRequest request) {
		// goodsTypes = new ArrayList<GoodsType>();
		// model.addAttribute("name", "Hello World!");
		// HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE
		// uriTemplateVariables
		goodsType = service.get(uuid);
		System.out.println("#######");
		System.out.println("uuid:" + uuid);
		System.out.println("goodsType:" + goodsType);
		System.out.println("#######");
		model.addAttribute("goodsType", goodsType);
		// return "redirect:/index.jsp";
		// return new ModelAndView("/goods/type_list", "goodsTypes", goodsTypes);
		return "/goods/type_edit";
	}

	@RequestMapping("/type_list")
	public String list(GoodsType goodsType, Integer page, Model model) {
		// goodsTypes = new ArrayList<GoodsType>();
		try {
			System.out.println("===========================");
			// BeanTest.printBean(goodsType);
			System.out.println("**************");
			System.out.println(PropertyUtils.describe(goodsType));
			System.out.println("**************");
			System.out.println("Page:" + page);
			System.out.println("===========================");
			goodsTypes = service.select(PropertyUtils.describe(goodsType), page);
			// goodsTypes.addAll(service.select(null, page));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// model.addAttribute("name", "Hello World!");
		model.addAttribute("goodsTypes", goodsTypes);
		// return "redirect:/index.jsp";

		// return new ModelAndView("/goods/type_list", "goodsTypes", goodsTypes);
		return "/goods/type_list";
	}
}
