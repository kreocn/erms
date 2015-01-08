package org.erms.base;

import java.util.List;

import com.github.miemiedev.mybatis.paginator.domain.Order;
import com.github.miemiedev.mybatis.paginator.domain.Paginator;

/**
 * 分页专用bean
 * 
 * @author 骏宇
 * 
 */
public class IPage extends Paginator {
	private static final long serialVersionUID = -3685647364324911107L;
	private static final int DEFAULT_PAGE_SIZE = 20;

	public IPage(int page, int totalCount) {
		super(1, DEFAULT_PAGE_SIZE, totalCount);
	}

	public IPage(int page, int limit, int totalCount) {
		super(page, limit, totalCount);
	}

	private String sortString;
	private List<Order> orders;

	public String getSortString() {
		return sortString;
	}

	public void setSortString(String sortString) {
		this.sortString = sortString;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders() {
		this.orders = Order.formString(sortString);
	}
}
