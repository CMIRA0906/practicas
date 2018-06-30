package util;

import org.apache.log4j.Logger;

import java.math.BigInteger;
import java.text.SimpleDateFormat;

public class AyudaPruebas {

    public static Logger log = Logger.getLogger("Metodos genericos");

    public static void main(String[] args) {
/*
        BigInteger longNumber =  BigInteger.valueOf(Long.parseLong("1370062800000"));

        SimpleDateFormat df= new SimpleDateFormat("yyyyMMdd");
        String dd= df.format(longNumber);
        System.out.println(dd);*/
        convertDateFromIntToString("1370062800000");

    }


    public static String convertDateFromIntToString(String dateIntegerFormat) {

        BigInteger longNumber = BigInteger.valueOf(Long.parseLong(dateIntegerFormat));

        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");

        try {
            String date = df.format(longNumber);
            log.info("Nueva fecha: "+date);

            return date;

        } catch (Exception ex) {

            log.error(ex);
            return null;
        }
    }
}

