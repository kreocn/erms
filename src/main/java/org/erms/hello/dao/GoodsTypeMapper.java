package org.erms.hello.dao;

import org.erms.base.BaseMapper;
import org.erms.hello.bean.GoodsType;

public interface GoodsTypeMapper extends BaseMapper<GoodsType> {
	public Integer updateStatus(GoodsType entity);
}
