package oop.labor02;

public class DateUtil {
    public static boolean leapYear(int year){
        if(year%4==0){
            return true;
        }
        return false;
    }
    public static boolean isValidDate(int year, int month, int day){
        if(year<0 || year>2022){
            return false;
        }
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            if(day>31 || day<1){
                return false;
            }
        }
        if(month==2){
            if((day>28 || day<1)&& !leapYear(year)){
                return false;
            }
            if((day>29 || day<1)&& leapYear(year)){
                return false;
            }
        }
        if(month==4 || month==6 || month==9 || month==11){
            if(day>30 || day<1){
                return false;
            }
        }
        return true;
        }
    }

