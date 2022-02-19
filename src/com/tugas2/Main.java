package com.tugas2;

public class Main {

	/* this is main class for running the answers 
	 * each soal class using abstract class with inheritance of soal1 class and soal2 class instantiation
	 * then execute answer method in each classes for print result
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractSoal soal1 = new Soal1(); //initialize soal 1 class
		AbstractSoal soal2 = new Soal2(); //initialize soal 2 class
		
		try {
			soal1.answer();
			soal2.answer();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
