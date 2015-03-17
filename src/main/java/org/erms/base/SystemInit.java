package org.erms.base;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SystemInit {
	private static Log log = LogFactory.getLog(SystemInit.class);

	public SystemInit() {
		log.info("系统初始化中...");
		initParameter();
		log.info("系统初始化完成...");
	}

	public void initParameter() {
		org.apache.ibatis.logging.LogFactory.useLog4JLogging();
		log.info("设定mybatis使用Log4J...成功");
	}
}
