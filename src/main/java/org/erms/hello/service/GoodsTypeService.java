package org.erms.hello.service;

import java.util.List;
import java.util.Map;

import org.erms.base.MyPageBounds;
import org.erms.hello.bean.GoodsType;
import org.erms.hello.dao.GoodsTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsTypeService {
	@Autowired
	private GoodsTypeMapper mapper;

	public List<GoodsType> select(Map<String, Object> map, Integer page) {
		return mapper.select(map, MyPageBounds.createPageBounds(page));
	}

	public Integer count(Map<String, Object> map) {
		return mapper.count(map);
	}

	public GoodsType get(Object uuid) {
		System.out.println("开始请求get");
		return mapper.get(uuid);
	}

	public void insert(GoodsType entity) {
		mapper.insert(entity);
	}

	public void update(GoodsType entity) {
		mapper.update(entity);
	}

	public void delete(Object uuid) {
		mapper.delete(uuid);
	}

	public Integer updateStatus(GoodsType entity) {
		return mapper.updateStatus(entity);
	}
}
