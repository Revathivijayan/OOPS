package Org.all;

import Org.telgu.Telgu;

public class LanguageClass extends Telgu{

	public void allLanguage() {
		System.out.println("detail of language");
	}
	
	public static void main(String[] args) {
		LanguageClass a=new LanguageClass();
		a.allLanguage();
		a.englishLanguage();
		a.tamilLanguage();
		a.telguLanguage();
	}
	
}
