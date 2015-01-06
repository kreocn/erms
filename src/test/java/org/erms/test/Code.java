package org.erms.test;

import java.util.UUID;

public class Code {
	public Code() {
		for (int i = 0; i < 20; i++) {
			System.out.println(UUID.randomUUID().toString().replaceAll("-", "").toUpperCase());
		}
	}

	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		new Code();
		long end = System.currentTimeMillis();
		System.out.println("execute time:" + (end - start));
	}
}
