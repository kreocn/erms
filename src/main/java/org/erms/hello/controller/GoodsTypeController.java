package org.erms.hello.controller;

import org.erms.hello.bean.GoodsType;
import org.erms.hello.dao.GoodsTypeMapper;
import org.erms.hello.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoodsTypeController {
	@Autowired
	private GoodsTypeMapper mapper;
	@Autowired
	private GoodsTypeService service;
	private GoodsType goodsType;

	@RequestMapping("/goods/type")
	public String add(Model model) {
		model.addAttribute("name", "Hello World!");
		goodsType = new GoodsType();
		goodsType.setType_name("测试类型1");
		goodsType.setType_group("组1 组2 组3");
		goodsType.setStatus(1);
		goodsType.setLm_user("AA");
		// System.out.println("Mapper Insert Successful!" + mapper.insert(goodsType) + ":" + goodsType.getUuid());
		goodsType.setType_group("普通白酒Service");
		System.out.println("Service Insert Successful!" + service.insert(goodsType) + ":" + goodsType.getUuid());
		return "/goods/type";
	}
}
