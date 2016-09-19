package APITime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Time {

    public static void main(String[] args) {

        LocalDate dAgora = LocalDate.now();
        System.out.println(dAgora);
        System.out.println(dAgora.plusDays(4));
        System.out.println(dAgora.minus(1, ChronoUnit.WEEKS));

        LocalDate dOf = LocalDate.of(2015, 9, 9);
        System.out.println(dOf);

        LocalDate dParse = LocalDate.parse("09/09/1979", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dParse));

        LocalTime tempoAgora = LocalTime.now();
        System.out.println(tempoAgora);
        LocalTime tempo1 = tempoAgora.plusHours(1);
//		tempo1 = tempo.plus(1, ChronoUnit.HOURS);
        System.out.println(tempo1);
        LocalTime tempo2 = tempoAgora.minusHours(1);
//		tempo2 = tempo.minus(1, ChronoUnit.HALF_DAYS);
        System.out.println(tempo2);

//		Usando LocalDate.of(); Passando uma data pré-definida.
        LocalDate data1 = LocalDate.of(1979, 9, 9);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dtf.format(data1));

        LocalDateTime dt = LocalDateTime.of(1979, 9, 9, 12, 30);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(df.format(dt));

//		Usando LocalDate.parse();
        String dataNascimento = "05/09/1989";
        LocalDate dt0 = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dt0));
        System.out.println(DateTimeFormatter.ofPattern("dd-MM-yyyy").format(dt0));

//		Periodos usando:
//		Period e ChronoUniy. Lembrando 'LocalDate' mï¿½nimo valor ï¿½ para dias.
        Period p = Period.between(data1, dt0);//Esse mï¿½todo encadeia total de anos, meses e dias respectivamente.
        System.out.println("Datas entre: " + dtf.format(data1) + " ï¿½ " + df.format(dt0));
        System.out.println("Anos: " + p.getYears());
        System.out.println("Meses: " + p.getMonths());
        System.out.println("Dias: " + p.getDays());
        System.out.println("Usando o 'ChornoUnity', vc consegue pegar total das respectivas grandezas.");
        System.out.println("Anos:" + ChronoUnit.YEARS.between(data1, dt0));
        System.out.println("Meses: " + ChronoUnit.MONTHS.between(data1, dt0));
        System.out.println("Semanas: " + ChronoUnit.WEEKS.between(data1, dt0));
        System.out.println("Dias: " + ChronoUnit.DAYS.between(data1, dt0));

//		Duraï¿½ï¿½o usando:
//		Duration e ChronoUnity. Lembrando 'LocalTime' mï¿½ximo valor ï¿½ para horas.
        Duration du = Duration.between(dt.toLocalTime(), tempoAgora);
        System.out.println(dt.toLocalTime() + " ï¿½ " + tempoAgora);
        System.out.println("Horas: " + du.toHours());
        System.out.println("Minutos: " + du.toMinutes());
        System.out.println("Segundos: " + du.toMillis() / 1000);
        System.out.println("Milissegundos: " + du.toMillis());
        System.out.println("Nanossegundos: " + du.toNanos());


        LocalDate d = LocalDate.parse("08/10/00", DateTimeFormatter.ofPattern("dd/MM/yy"));
        LocalDate dd = LocalDate.parse("09/11/00", DateTimeFormatter.ofPattern("dd/MM/yy"));

        System.out.println("-----------");
        Period ddd = Period.between(d, dd);//Esse mï¿½todo encadeia total de anos, meses e dias respectivamente.
        System.out.println(ddd.getMonths());
        System.out.println(ddd.getDays());
        System.out.println("-----------");
        System.out.println(ChronoUnit.DAYS.between(d, dd));

    }

}
