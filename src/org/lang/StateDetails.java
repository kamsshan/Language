package org.lang;

public class StateDetails
{
 public void southIndia() {
	System.out.println("south india");

}
public void northIndia() {
	System.out.println("north india");

}
public static void main(String[] args) {
	StateDetails s=new StateDetails();
	s.southIndia();
	s.northIndia();
	LanguageInfo l=new LanguageInfo();
	l.tamilLanguage();
	l.englishLanguage();
	l.hindiLanguage();
	
}
}
