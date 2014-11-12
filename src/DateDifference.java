import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
 public class DateDifference {
 public static void main(String args[]){
 DateDifference difference = new DateDifference();
 }
 DateDifference() {
 Calendar cal1 = new GregorianCalendar();
 Calendar cal2 = new GregorianCalendar();
 

 cal1.set(1993, 4, 10); 
 cal2.set(2014, 11, 12);


 long seconds=(cal2.getTimeInMillis()-cal1.getTimeInMillis())/1000;
 long minit=seconds/60;
 long hr=minit/60;
 long day=hr/24;
 int diffYear = cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR);
 int diffMonth = diffYear * 12 + cal2.get(Calendar.MONTH) - cal1.get(Calendar.MONTH);
 long week=day/7;
 System.out.println("Days = "+daysBetween(cal1.getTime(),cal2.getTime())+"\nWeeks= "+week+"\nSeconds is = "+seconds+"\nHour is= "+hr+"\nMinuit = "+minit+"\nYear= "+diffYear+"\nMonth= "+diffMonth);
 }
 public int daysBetween(Date d1, Date d2){
 return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
 }
 }