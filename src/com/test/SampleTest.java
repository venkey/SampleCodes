package com.test;

public class SampleTest extends AbsTest{ 

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public long mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public float div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public boolean testAge(int a) {
		String mesg = "authorized";
		if(a<=18) {
			System.out.println("un authorized");
			return false;
		}
		// TODO Auto-generated method stub
		System.out.println(mesg);
		return true;
	}

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return super.substract(a, b);
	}

	@Override
	public String printT(String mesg) {
		// TODO Auto-generated method stub
		return mesg;
	}

	@Override
	public int printingOfNaturalNumbers(int a) {
		// TODO Auto-generated method stub
		int v = 0;
		for(int i = 0;i<=a;i++) {
			v=v+i;
		}
		return v;
	}
}
