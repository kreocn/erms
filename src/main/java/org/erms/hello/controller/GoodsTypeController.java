package org.erms.hello.controller;

import org.erms.base.BaseDao;
import org.erms.hello.bean.GoodsType;
import org.erms.hello.dao.GoodsTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoodsTypeController {

	@Autowired
	private BaseDao<GoodsType, GoodsTypeMapper> dao;

	private GoodsType goodsType;

	@RequestMapping("/goods/type")
	public String add(Model model) {
		model.addAttribute("name", "Hello World!");
		goodsType = new GoodsType();
		goodsType.setType_name("普通白酒");
		goodsType.setType_group("天佑德 八大作坊 互助");
		goodsType.setItem_num(0);
		goodsType.setStatus(1);
		goodsType.setLm_user("AA");
		dao.insert(goodsType);
		System.out.println("Insert Successful!");
		return "/goods/type";
	}
}
