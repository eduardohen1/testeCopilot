package br.com.ehmf.testeCopilot.utils;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalendarUtils {

    //método para calcular a diferença em dias entre duas datas
    public int calculateDaysBetweenDates(LocalDate date1, LocalDate date2) {
        return (int) ChronoUnit.DAYS.between(date1, date2);
    }

    public int getDayFromDate(LocalDate date) {
        return date.getDayOfMonth();
    }

    public int getYearFromDate(LocalDate date) {
        return date.getYear();
    }

    public int getMonthFromDate(LocalDate date) {
        return date.getMonthValue();
    }

}
