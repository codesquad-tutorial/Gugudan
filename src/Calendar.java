import java.util.Scanner;

public class Calendar {
	private final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxDaysOfMonth(int year, int month) {
		if( isLeapYear(year) ) {
			return LEAP_MAX_DAYS[month - 1];
		} else {
			return MAX_DAYS[month - 1];
		}
	}
	
	public boolean isLeapYear(int year) {
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ) {
			return true;
		}else {
			return false;
		}
	}
	
	public final void printCalendar(int year, int month) {
		System.out.printf("      << %d년 %d월 >> \n", year, month);
		System.out.printf(" 일   월  화   수   목   금   토 \n");
		System.out.printf("-----------------------------\n");
		
		int maxDay = getMaxDaysOfMonth(year, month);
		
		for(int i = 0; i < maxDay; i ++) {
//			if(i < 0) {
//				System.out.printf("   %d", i);
//			}
//
			if(i >= 0 && i + 1 < 10) {
				System.out.printf(" ");
			}
			
			System.out.printf("  %d", i + 1);
			int pagenation = (i + 1) %7;
			if(pagenation  == 0) {
				System.out.println();
			}
			
		}
		
		System.out.printf("\n");
	}
	
}
