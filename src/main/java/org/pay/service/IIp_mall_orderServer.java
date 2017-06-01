package org.pay.service;

import org.pay.entity.Ip_mall_order;

public interface IIp_mall_orderServer {
	
	public Ip_mall_order getdata(String orderId);
	
	public Ip_mall_order getTopdata(int count);
	
	public void updatedata(Ip_mall_order ip_mall_order,int day,long Integral,double IntegralAmt,long oldIntegral,double oldIntegralAmt,
			double redPacketAmt,double oldRedPacketAmt,int jfType );

}
