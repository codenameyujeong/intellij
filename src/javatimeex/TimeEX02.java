package javatimeex;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class TimeEX02 {
	public static void main(String[] args) {
		
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS a");
String date = LocalDate.now().atStartOfDay().format(formatter);
System.out.println("금일 자정: " + date + "\n");

LocalDateTime tomorrow = LocalDateTime.now().plusDays(1);
date = tomorrow.format(formatter);
System.out.println("내일 현재 시간: " + date + "\n");

tomorrow =  LocalDateTime.now().plusDays(1).with(LocalTime.MAX);
date = tomorrow.format(formatter);
System.out.println("내일의 맨 마지막 시간: " + date + "\n");

tomorrow =  LocalDateTime.now().plusDays(1).with(LocalTime.MIN);
date = tomorrow.format(formatter);
System.out.println("내일의 처음 시간: " + date + "\n");

LocalDateTime todate = LocalDateTime.now().with(LocalTime.NOON);
date = todate.format(formatter);
System.out.println("오늘 날짜의 정오: " +  date + "\n");

todate = LocalDateTime.now();
		String dayOfWeek = todate.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.getDefault());
		date = todate.format(formatter);
		System.out.println(date+" "+ dayOfWeek);
	}
}



