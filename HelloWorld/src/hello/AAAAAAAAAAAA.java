package hello;

public class AAAAAAAAAAAA {
	public static void main(String[] args) {
		ShowCal(10);
	}

	public static void ShowCal(int mon) {
		String[] week = { "Sun", "Mon", "Tue", "Wed", "thr", "Fri", "Sat" };
		int month = mon;
		int monthDay = getMonday(month);
		int start = getStartday(month);
		System.out.println("-------------" + month + "월------------");

		for (int i = 0; i < week.length; i++) { // for(String str : week)
			System.out.print(" " + week[i]); // System.out.println(" " + str);
		}
		System.out.println();
		// 요일 타이틀 출력

		for (int i = 1; i < start; i++) {
			System.out.printf("%4s", ""); // ?
		} // 1일의 위치 지정

		for (int i = 1; i <= monthDay; i++) {
			System.out.printf("%4d", i);
			if ((start + i) % 7 == 1) // ?
				System.out.println();
		} // 월에 맞게 요일 수 출력
	}

	public static int getStartday(int month) {
		int startDay = 0;
		if (month == 9) {
			startDay = 1; // 일요일
		} else if (month == 10) {
			startDay = 3; // 화요일
		} else if (month == 11) {
			startDay = 6; // 금요일
		} else if (month == 8) {
			startDay = 5; // 목요일
		}
		return startDay;
	}

	public static int getMonday(int month) {
		int day = 0;
		if (month <= 7 && month % 2 == 1) {
			day = 31;
		} else if (month >= 8 && month % 2 == 0) {
			day = 31;
		} else if (month == 2) {
			day = 28;
		} else {
			day = 30;
		}
		return day;
	}
}
