package com.selenium;

interface Printable {
	void print();
	void printout();
}

public class InterfaceTest implements Printable {
	public void print() {
		System.out.println("Print it");
	}

	public void printout() {
		System.out.println("Printout is ready");
	}
	public static void main(String args[]) {
		InterfaceTest in = new InterfaceTest();
		in.print();
		in.printout();
	}

}
