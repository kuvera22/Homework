package ru.samung.veronika;

public class Start {

	public static void main(String[] args) {
		Figures figure1 = new Circle();
		Figures figure2 = new Oval();
		test(figure1);
		test(figure2);
		

	}

	public static void test(Figures figure) {
		figure.drawfigure();		
	}

}
