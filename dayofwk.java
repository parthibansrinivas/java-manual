import java.time.*;  
import java.time.temporal.ChronoField;  
public class DayOfWeekExample1 {  
  public static void main(String[] args) {  
    LocalDate localDate = LocalDate.of(2017, Month.JANUARY, 25);  
    DayOfWeek dayOfWeek = DayOfWeek.from(localDate);  
    System.out.println(dayOfWeek.get(ChronoField.DAY_OF_WEEK));  
  }  
}  