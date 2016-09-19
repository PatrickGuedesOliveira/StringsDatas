package datahora;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class AppDataHora {

	public void formataDatas(Locale l) {

		Date data = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, l);
		String s = df.format(data);
		System.out.println(l.getDisplayName() + " " + s);

	}

	public void formataHora(Locale l) {

		Date data = new Date();
		DateFormat df = DateFormat.getTimeInstance(DateFormat.SHORT, l);
		String s = df.format(data);
		System.out.println(l.getDisplayName() + " " + s);

	}

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d);

		// Manipulando datas.
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 20);
		d = c.getTime();
		System.out.println(d);

		// Formatando datas.

		Date data = new Date();
		DateFormat df = DateFormat.getInstance();
		String s = df.format(data);
		System.out.println(s);

		AppDataHora appdata = new AppDataHora();
		System.out.println("Formatação de data.");
		appdata.formataDatas(new Locale("en", "US"));
		appdata.formataDatas(new Locale("pt", "BR"));
		System.out.println("Formatação de hora.");
		appdata.formataHora(new Locale("en", "US"));
		appdata.formataHora(new Locale("pt", "BR"));
	}
}
