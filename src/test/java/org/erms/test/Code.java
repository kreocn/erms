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
		ArrayList<StringBuffer> sbl = new ArrayList<>();
		sbl.add(3, new StringBuffer());
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println(i + ":" + sbl.get(i));
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		new Code();
		long end = System.currentTimeMillis();
		System.out.println("execute time:" + (end - start));
	}
}
