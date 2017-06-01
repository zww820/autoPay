package org.pay.utils;

import java.text.DecimalFormat;

public class Constants {
	
	public static String CHAN_NO="001";
	//未对账
	public static int CHECK_STATE1=1;
	//对平
	public static int CHECK_STATE2=2;
	//对账完成并全部对平
	public static int ICHECK_STATE0=0;
	//已获取对账文件
	public static int ICHECK_STATE1=1;
	//对账完成未对平
	public static int ICHECK_STATE7=7;
	//交易类型：支付
	public static int TXN_TYPE1=1;
	//通道交易响应码
	public static String CHAN_TXN_CD="000000";
	//支付类型：7-现金+红包+积分
	public static int PAYTYPE7=7;
	//交易状态：2-支付成功
	public static int TXNSTS2=2;
	//积分
	public static int INTEGRAL=Randparams.randomInt();
	//积分抵扣额
	public static double INTEGRAL_AMT=(double)((double)(INTEGRAL)/400);
	//综合积分
	public static int GENERAL_INTEGRAL=Randparams.randomInt();
	//综合积分抵扣额
	public static double GENERAL_INTEGRAL_AMT=(double)((double)(GENERAL_INTEGRAL)/400);
	//红包金额
	public static double RED_PACKET_AMT=Randparams.randomDouble(3);
	//贵宾积分
	public static int GUEST_INTEGRAL=Randparams.randomInt();
	//贵宾积分抵扣额
	public static double GUEST_INTEGRAL_AMT=(double)((double)(GUEST_INTEGRAL)/400);
	//村镇积分（兴安）
	public static int TOWN_INTEGRAL_XA=Randparams.randomInt();
	//村镇积分抵扣额（兴安）
	public static double TOWN_INTEGRAL_XA_AMT=(double)((double)(TOWN_INTEGRAL_XA)/400);
	//村镇积分（腾县）
	public static int TOWN_INTEGRAL_TX=Randparams.randomInt();
	//村镇积分抵扣额（腾县）
	public static double TOWN_INTEGRAL_TX_AMT=(double)((double)(TOWN_INTEGRAL_TX)/400);
	//村镇积分（横县）
	public static int TOWN_INTEGRAL_HX=Randparams.randomInt();
	//村镇积分抵扣额（横县）
	public static double TOWN_INTEGRAL_HX_AMT=(double)((double)(TOWN_INTEGRAL_HX)/400);
	//村镇积分（容县）
	public static int TOWN_INTEGRAL_RX=Randparams.randomInt();
	//村镇积分抵扣额（容县）
	public static double TOWN_INTEGRAL_RX_AMT=(double)((double)(TOWN_INTEGRAL_RX)/400);
	//村镇积分（保安）
	public static int TOWN_INTEGRAL_BA=Randparams.randomInt();
	//村镇积分抵扣额（保安）
	public static double TOWN_INTEGRAL_BA_AMT=(double)((double)(TOWN_INTEGRAL_BA)/400);
	//村镇积分（桂平）
	public static int TOWN_INTEGRAL_GP=Randparams.randomInt();
	//村镇积分抵扣额（桂平）
	public static double TOWN_INTEGRAL_GP_AMT=(double)((double)(TOWN_INTEGRAL_GP)/400);
	//村镇积分（平南）
	public static int TOWN_INTEGRAL_PN=Randparams.randomInt();
	//村镇积分抵扣额（平南）
	public static double TOWN_INTEGRAL_PN_AMT=(double)((double)(TOWN_INTEGRAL_PN)/400);
	//自定义流水
	public static String LogNO=Randparams.randonSInt(21);


}
