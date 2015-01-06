package org.erms.base;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDao<T extends BaseBean, E extends BaseMapper<T>> {
	@Autowired
	private E mapper;

	public T get(Object uuid) {
		return (T) mapper.get(uuid);
	}

	public List<T> select(HashMap<String, Object> map) {
		return (List<T>) mapper.select(map);
	}

	public Integer insert(T entity) {
		return mapper.insert(entity);
	}

	public Integer update(T entity) {
		return mapper.update(entity);
	}

	public Integer delete(Object uuid) {
		return mapper.delete(uuid);
	}
}
