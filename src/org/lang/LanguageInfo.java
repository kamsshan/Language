package org.lang;

public class LanguageInfo 
{
	public void tamilLanguage() 
	{
	System.out.println("tamil language");
	
}

	public void englishLanguage() 
	{
	System.out.println("english language");	

	}
	public void hindiLanguage()
	{
		System.out.println("hindi language");

	}
	public static void main(String[] args) {
		LanguageInfo l=new LanguageInfo();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
		StateDetails s=new StateDetails();
		s.southIndia();
		s.northIndia();
	}
}
