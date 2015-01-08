package org.erms.test;

public class Code {

	String abc;

	public String getAbc() {
		return abc;
	}

	public void setAbc(String abc) {
		this.abc = abc;
	}

	public Code() {
		if (abc == null) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		new Code();
		long end = System.currentTimeMillis();
		System.out.println("execute time:" + (end - start));
	}
}
