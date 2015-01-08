package org.erms.base;

import java.util.List;
import java.util.Map;

public interface BaseMapper<T> {
	public List<T> select(Map<String, Object> map);

	public Integer count(Map<String, Object> map);

	public T get(Object uuid);

	public void insert(T entity);

	public void update(T entity);

	public void delete(Object uuid);
}
