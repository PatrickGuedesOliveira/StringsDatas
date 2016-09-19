package pacote;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Aplicacao {

	public static void main(String[] args){
		
//		System.out.printf("%f", 1225401.7);
		
		Locale l = new Locale("pt", "BR");
		System.out.println(l.getDisplayName());
		
		Currency moeda = Currency.getInstance(l);
		System.out.println(moeda.getSymbol());
		System.out.println(moeda.getDisplayName());
		
		NumberFormat nf = NumberFormat.getInstance();
		String s = nf.format(1000.5);
		System.out.println(s);
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance();
		String s1 = nf1.format(1000.5);
		System.out.println(s1);
		
		NumberFormat nf2 = NumberFormat.getPercentInstance();
		String s2 = nf2.format(1000.5);
		System.out.println(s2);
		
 		System.out.println(String.format("%.2f", Float.parseFloat("123.4")));
		
	}
	
}
