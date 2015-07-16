package com.albert.mbt.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.junit.Test;

public class Testttt {

	@Test
	public void test() throws IOException, ClassNotFoundException {
		Tenum t1 = Tenum.TTT;
//		String t1 = "ttt";
		System.out.println(t1);

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(t1);
		
		ByteArrayInputStream bin = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream oin = new ObjectInputStream(bin);
		Tenum t2 = (Tenum) oin.readObject();
//		String t2 = (String) oin.readObject();
		System.out.println(t2);
		
		System.out.println(t1.equals(t2));
		System.out.println(t1 == t2);
		
		oos.close();
		oin.close();
	}

	public static enum Tenum {
		TTT("ttt");
		private String tt;

		private Tenum(String tt) {
			this.tt = tt;
		}

		public String getTt() {
			return tt;
		}
		
	}

}
