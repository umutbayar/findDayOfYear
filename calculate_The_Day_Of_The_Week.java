import java.util.Scanner;
/*I prepared a program that calculates which day
 *  this date corresponds to according to the entered year, the number of the month and the day of the month.
 *  name=Umut  Surname=Bayar  Student ID=150120043*/
public class calculate_The_Day_Of_The_Week {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int year,month,dayOfTheMonth,dayOftheWeek;
		System.out.println("Enter year (e.g. 2012): ");
		year=scan.nextInt();
		System.out.println("Enter month (e.g. 1-12): ");
		month=scan.nextInt();
		if(month==1) {
			month=13;
			year=year-1;
		}
		else if(month==2) {
			month=14;
			year=year-1;
		}
		System.out.println("Enter the day of the month (e.g. 1-31): ");
		dayOfTheMonth=scan.nextInt();
		dayOftheWeek=((26*(month+1))/10+((5*(year%100))/4)+(year/400)+((5*((year))/100))+dayOfTheMonth)%7;
		switch(dayOftheWeek) {
		case 0:System.out.println("Day of the week is Saturday");break;
		case 1:System.out.println("Day of the week is Sunday");break;
		case 2:System.out.println("Day of the week is Monday");break;
		case 3:System.out.println("Day of the week is Tueasday");break;
		case 4:System.out.println("Day of the week is Wednesday");break;
		case 5:System.out.println("Day of the week is Thursday");break;
		case 6:System.out.println("Day of the week is Friday");break;
		}
	}

}
