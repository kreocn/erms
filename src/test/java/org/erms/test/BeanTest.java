package org.erms.test;

import java.util.Map;

import org.apache.commons.beanutils.PropertyUtils;

public class BeanTest {
	public static void printBean(Object bean) {
		try {
			Map<String, Object> ms = PropertyUtils.describe(bean);
			for (Map.Entry<String, Object> m : ms.entrySet()) {
				try {
					System.out.println("key:" + m.getKey() + " value(" + m.getValue().getClass() + "):" + m.getValue());
				} catch (Exception e) {
					System.out.println("key:" + m.getKey() + " Error.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
