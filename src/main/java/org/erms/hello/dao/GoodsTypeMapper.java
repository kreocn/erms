package org.erms.hello.dao;

import org.erms.base.BaseMapper;
import org.erms.hello.bean.GoodsType;

public interface GoodsTypeMapper extends BaseMapper<GoodsType> {
	public Integer updateStatus(GoodsType entity);
	// @Select("Select * from qkj_t_goods_type where uuid = #{uuid}")
}