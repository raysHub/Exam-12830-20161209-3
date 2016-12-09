package hand.Exam_12830_20161209_3;

import java.util.Scanner;

public class CountDay {

	public static int countDay(String date) {
		int year = Integer.parseInt(date.split("-")[0]);
		// 月份
		int month = Integer.parseInt(date.split("-")[1]);
		// 日
		int day = Integer.parseInt(date.split("-")[2]);
		// 先把每个月按30天算(2月算28天)
		int count = (month-1) * 30 + day - 2;
		// 如果是闰年，加一天
		if (((year % 100 == 0) && (year % 400 == 0)) || ((year % 100 != 0) && (year % 4 == 0))) {
			count++;
		}
		switch (month) {
		case 1:
			count += 2;
			break;
		case 2:
			count += 2;
			break;
		case 3:
			count += 1;
			break;
		case 4:
			count += 2;
			break;
		case 5:
			count += 2;
			break;
		case 6:
			count += 3;
			break;
		case 7:
			count += 3;
			break;
		case 8:
			count += 4;
			break;
		case 9:
			count += 5;
			break;
		case 10:
			count += 5;
			break;
		case 11:
			count += 6;
			break;
		case 12:
			count += 6;
			break;

		default:
			break;
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入日期：");
		String date = scan.nextLine();
		scan.close();
		System.out.println("你输入的日期为当年的第 "+countDay(date)+" 天");
	}

}
