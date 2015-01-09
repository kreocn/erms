package org.erms.base;

import com.github.miemiedev.mybatis.paginator.domain.Order;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;

public class MyPageBounds {
	private static final int DEFAULT_PAGE_SIZE = 15;

	public static PageBounds createPageBounds(Integer page) {
		if (page == null || page <= 0) page = 1;
		return new PageBounds(page, DEFAULT_PAGE_SIZE);
	}

	public static PageBounds createPageBounds(Integer page, Integer page_size) {
		if (page == null || page <= 0) page = 1;
		if (page_size == null || page_size <= 0) page_size = DEFAULT_PAGE_SIZE;
		return new PageBounds(page, page_size);
	}

	public static PageBounds createPageBounds(Integer page, Integer page_size, String orderString) {
		if (page == null || page <= 0) page = 1;
		if (page_size == null || page_size <= 0) page_size = DEFAULT_PAGE_SIZE;
		if (orderString == null || "".equals(orderString)) {
			return new PageBounds(page, page_size);
		} else {
			return new PageBounds(page, page_size, Order.formString(orderString));
		}
	}
}
