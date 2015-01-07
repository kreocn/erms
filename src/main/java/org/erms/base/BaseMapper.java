package org.erms.base;

import java.util.HashMap;
import java.util.List;

public interface BaseMapper<T> {
	public List<T> select(HashMap<String, Object> map);

	public Integer count(HashMap<String, Object> map);

	public T get(Object uuid);

	public Integer insert(T entity);

	public Integer update(T entity);

	public Integer delete(Object uuid);
}
