package org.erms.hello.service;

import java.util.HashMap;
import java.util.List;

import org.erms.base.BaseDao;
import org.erms.base.BaseService;
import org.erms.hello.bean.GoodsType;
import org.erms.hello.dao.GoodsTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsTypeService implements BaseService<GoodsType> {
	@Autowired
	private GoodsTypeMapper mapper;

	public List<GoodsType> select(HashMap<String, Object> map) {
		return mapper.select(map);
	}

	public GoodsType get(Object uuid) {
		return mapper.get(uuid);
	}

	public Integer insert(GoodsType entity) {
		return mapper.insert(entity);
	}

	public Integer update(GoodsType entity) {
		return mapper.update(entity);
	}

	public Integer delete(Object uuid) {
		return mapper.delete(uuid);
	}

}
