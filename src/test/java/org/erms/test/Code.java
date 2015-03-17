package org.erms.test;

import java.util.ArrayList;

public class Code {

	String abc;

	public String getAbc() {
		return abc;
	}

	public void setAbc(String abc) {
		this.abc = abc;
	}

	public Code() {
		int i = 2147483647;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(4294967295l / 2);
		System.out.println(4294967295l);
		System.out.println(Long.MAX_VALUE);
	}

	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		new Code();
		long end = System.currentTimeMillis();
		System.out.println("execute time:" + (end - start));
	}
}
