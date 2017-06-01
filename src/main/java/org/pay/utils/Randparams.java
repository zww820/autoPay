package org.pay.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Randparams {
//  随机200~40000
	public static int randomInt(){
		return new Random().nextInt(200)*200;
	}

//	随机日期
	public static String randomDate(){		
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE,-new Random().nextInt(3650));
		String randomdate=new SimpleDateFormat("yyyyMMdd").format(cal.getTime());
		return randomdate;
	}
//  随机Float
	public static String randomFloat(int index){
		DecimalFormat dcmFmt=new DecimalFormat("0.00");
		float random=(float) (new Random().nextFloat()*Math.pow(10, new Random().nextInt(index)));		
		return dcmFmt.format(random).toString();
	}
//  随机Double
	public static Double randomDouble(int index){
		DecimalFormat dcmDmt=new DecimalFormat("0.00");
		double random=(double) (new Random().nextDouble()*Math.pow(10, new Random().nextInt(index)));
		String a=dcmDmt.format(random).toString();
		return Double.parseDouble(a);
//		BigDecimal   b=new BigDecimal(random);
//		return b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
//  随机String
	public static String randonSInt(int index){
		String[] a={"0","1","2","3","4","5","6","7","8","9"};
		StringBuilder str=new StringBuilder();
		int random=new Random().nextInt(index)+1;
		for(int i=1;i<=random;i++){
			 str.append(a[new Random().nextInt(a.length)]);
		}
		return str.toString();
	}
//  前面几日，如昨日为1
	public static String GETYEST(int day){
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE,-day);
		String yesterday=new SimpleDateFormat("yyyyMMdd").format(cal.getTime());
		return yesterday;
	}

//	账号
	public String ACCNO(){
		String[] a={"0","1","2","3","4","5","6","7","8","9"};
		StringBuilder str=new StringBuilder();
		int random=new Random().nextInt(30)+1;
		for(int i=1;i<=random;i++){
			 str.append(a[new Random().nextInt(a.length)]);
		}
		return str.toString();
		
	}


//	机构号
	public String BRANCH(){
		String[] a={"0","1","2","3","4","5","6","7","8","9"};
		StringBuilder str=new StringBuilder();
		for(int i=1;i<=6;i++){
			 str.append(a[i]);
		}
		return str.toString();
	}
//	卡号
	public String CARDNO(){
		String[] a={"0","1","2","3","4","5","6","7","8","9"};
		StringBuilder str=new StringBuilder();
		int random=new Random().nextInt(11)+1;
		for(int i=1;i<=random;i++){
			 str.append(a[new Random().nextInt(a.length)]);
		}
		return str.toString();
	}

//	交易行号
	public String CPSNDBR(){
		String[] a={"0","1","2","3","4","5","6","7","8","9"};
		return a[new Random().nextInt(10)];
	}
//	商户号
	public String CPSPNO(){
		String[] a={"0","1","2","3","4","5","6","7","8","9"};
		StringBuilder str=new StringBuilder();
		int random=new Random().nextInt(8)+1;
		for(int i=1;i<=random;i++){
			 str.append(a[new Random().nextInt(a.length)]);
		}
		return str.toString();
	}
//	贵宾卡号
	public String CRD_NO(){
		String[] a={"0","1","2","3","4","5","6","7","8","9"};
		StringBuilder str=new StringBuilder();
		int random=new Random().nextInt(30)+1;
		for(int i=1;i<=random;i++){
			 str.append(a[new Random().nextInt(a.length)]);
		}
		return str.toString();
	}

//	客户号
	public String CUST_NO(){
		String[] a={"0","1","2","3","4","5","6","7","8","9"};
		StringBuilder str=new StringBuilder();
		int random=new Random().nextInt(30)+1;
		for(int i=1;i<=random;i++){
			 str.append(a[new Random().nextInt(a.length)]);
		}
		return str.toString();
	}

//	主机客户号
	public String CUSTNO(){
		String[] a={"0","1","2","3","4","5","6","7","8","9"};
		StringBuilder str=new StringBuilder();
		int random=new Random().nextInt(30)+1;
		for(int i=1;i<=random;i++){
			 str.append(a[new Random().nextInt(a.length)]);
		}
		return str.toString();
	}
//	性别：0，1
	public String CUSTSEX(){
		String[] a={"0","1"};
		return a[new Random().nextInt(2)];
	}
//	客户类型：1，2
	public String CUSTTYP(){
		String[] a={"1","2"};
		return a[new Random().nextInt(2)];
	}

//	证件类型
	public String DOC_TYP(){
		String[] a={"A","D","E","F","G","H","I","J","K","M","O","P","Q","T","Y","X","Z","W"};
		return a[new Random().nextInt(a.length)];

	}

}
