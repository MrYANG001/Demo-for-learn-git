package demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeIntervalCompute {
	/** 
     * ����ʱ�����������Сʱ 
     * @param str1 ʱ����� 1 ��ʽ��1990-01-01 12:00:00 
     * @param str2 ʱ����� 2 ��ʽ��2009-01-01 12:00:00 
     * @return double ����ֵΪ��Сʱ 
     */  
    public double getDistanceTimes(String str1, String str2) {  
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        Date one;  
        Date two;  
//        long day = 0;  
//        long hour = 0;  
//        long min = 0;  
//        long sec = 0; 
        double span = 0;
        try {  
            one = df.parse(str1);  
            two = df.parse(str2);  
            long time1 = one.getTime();  
            long time2 = two.getTime();  
            long diff ; 
//            if(time1<time2) {  
//                diff = time2 - time1;  
//            } else {  
//                diff = time1 - time2;  
//            } 
            diff = Math.abs(time1-time2);
            span = (double)diff / (60 * 60 * 1000);
//            day = diff / (24 * 60 * 60 * 1000);  
//            hour = (diff / (60 * 60 * 1000) - day * 24);  
//            min = ((diff / (60 * 1000)) - day * 24 * 60 - hour * 60);  
//            sec = (diff/1000-day*24*60*60-hour*60*60-min*60);  
        } catch (ParseException e) {  
            e.printStackTrace();  
        }  
//        long[] times = {day, hour, min, sec};  
        return span;  
    }
    
    public static void main(String[] args) {
    	TimeIntervalCompute tc = new TimeIntervalCompute();
    	String str1 = "1990-01-01 12:00:00";
    	String str2 = "2009-01-01 12:00:00";
    	System.out.println(tc.getDistanceTimes(str1, str2));
	}
}
