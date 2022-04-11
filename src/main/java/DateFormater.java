import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormater {


static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");


   public static LocalDate date(String date){
       return LocalDate.parse(date,formatter );
   }
}
