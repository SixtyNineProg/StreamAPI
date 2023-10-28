package by.clevertec.util;

import java.time.LocalDate;

public class TimeUtil {
  public static int getYearsBetweenDateAndNow(LocalDate date) {
    return date.until(LocalDate.now()).getYears();
  }
}
