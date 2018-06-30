package util;


import org.apache.log4j.Logger;

import java.math.BigInteger;
import java.text.SimpleDateFormat;

public class Pruebas {

    public static Logger log = Logger.getLogger("");

    public static void main(String[] args) {
/*
        BigInteger longNumber =  BigInteger.valueOf(Long.parseLong("1370062800000"));

        SimpleDateFormat df= new SimpleDateFormat("yyyyMMdd");
        String dd= df.format(longNumber);
        System.out.println(dd);*/
convertDateFromIntToString("1370062800000");

    }


    public static String convertDateFromIntToString(String dateIntegerFormat){

        BigInteger longNumber =  BigInteger.valueOf(Long.parseLong(dateIntegerFormat));

        SimpleDateFormat df= new SimpleDateFormat("yyyyMMdd");

        try {
            String date= df.format(longNumber);
            System.out.println(date);
            return date;

        } catch (Exception e) {
            e.printStackTrace();
            return  null;
        }


    }





}
