package org.pay.service;

import org.pay.entity.Ip_pay_bill;

public interface IIp_pay_billServer {
	
	
	public Ip_pay_bill getdata(String LogNO);
	
	public Ip_pay_bill getTopdata(int count);
	
	public void updatedata(Ip_pay_bill ip_pay_bill,int day,long Integral,double IntegralAmt,
			double redPacketAmt,String chanResultCode,String chanSrefNo,int jfType);

}
