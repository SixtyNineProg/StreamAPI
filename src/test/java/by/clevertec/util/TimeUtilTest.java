package by.clevertec.util;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
class TimeUtilTest {

  @Test
  void getYearsBetweenDateAndNow() {
    int years = TimeUtil.getYearsBetweenDateAndNow(LocalDate.parse("2020-01-08"));
    assertEquals(3, years);
  }
}