package com.taneja.jpa21;

import java.text.ParseException;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;

import com.vsp.il.util.DateHelper;
import com.vsp.il.util.DateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(DateHelper.asofdate("2014-0201"));
        System.out.println(DateHelper.asofdate("2014"));
        System.out.println(DateHelper.asofdate("2014-02-30"));
        String[] dateFormat = {"yyyy-MM-dd"};
		try {
			System.out.println(DateUtils.parseDateStrictly("9999-12-31", dateFormat));
			//System.out.println(DateUtils.parseDateStrictly("2014", dateFormat));
			System.out.println(DateUtils.parseDateStrictly("2014-02-28", dateFormat));
			System.out.println(StringUtils.isNumeric("999999"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
    }
}
