package teste;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class RetomaTempo {

    public static void main(String[] args) {

        String datahr1 = "10/06/2000 10:00:01";//12:50:20";
        String datahr2 = "23/10/2010 00:00:00";//23:30:25";
        LocalDateTime dt1 = LocalDateTime.parse(datahr1,
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        LocalDateTime dt2 = LocalDateTime.parse(datahr2,
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss")
                .format(dt1)
                + " Até "
                + DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss").format(dt2));

        System.out.println("Já se passaram:");
        Period p = Period.between(dt1.toLocalDate(), dt2.toLocalDate());
        Duration d = Duration.between(dt1, dt2);
        Duration d1 = Duration.between(dt1.toLocalTime(), dt2.toLocalTime());

        System.out.println(p.getYears() + " anos " + p.getMonths() + " meses e " + p.getDays() + " dias.");
        System.out.println(d.toHours() % 24 + " horas " + d.toMinutes() % 60 + " minutos e " + (d.toMillis() / 1000) % 60 + " segundos.");
        System.out.println();
        System.out.println(d1.toHours() % 24 + " horas " + d1.toMinutes() % 60 + " minutos e " + (d1.toMillis() / 1000) % 60 + " segundos.");
        System.out.println();
        System.out.println(ChronoUnit.YEARS.between(dt1, dt2) + " total de anos.");
        System.out.println(p.toTotalMonths() + " total de meses.");
        System.out.println(ChronoUnit.WEEKS.between(dt1, dt2) + " total de semanas.");
        System.out.println(d.toDays() + " total de dias.");
        System.out.println(d.toHours() + " total de horas.");
        System.out.println(d.toMinutes() + " total de minutos.");
        System.out.println(d.getSeconds() + " total de segundos.");

    }
}
