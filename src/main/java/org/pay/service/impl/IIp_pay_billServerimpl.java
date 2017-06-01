package org.pay.service.impl;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import javax.annotation.Resource;

import org.pay.dao.Ip_pay_billDAO;
import org.pay.entity.Ip_mall_order;
import org.pay.entity.Ip_pay_bill;
import org.pay.service.IIp_pay_billServer;
import org.pay.utils.Constants;
import org.pay.utils.Randparams;
import org.springframework.stereotype.Service;

@SuppressWarnings("restriction")
@Service("IIp_pay_billServerimpl")
public class IIp_pay_billServerimpl implements IIp_pay_billServer{

	@Resource
	private Ip_pay_billDAO ip_pay_billdao;
	
	public Ip_pay_bill getdata(String LogNO) {
		// TODO Auto-generated method stub
		return this.ip_pay_billdao.selectByPrimaryKey(LogNO);
	}

	public Ip_pay_bill getTopdata(int count) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updatedata(Ip_pay_bill ip_pay_bill,int day,long Integral,double IntegralAmt,
			double redPacketAmt,String chanResultCode,String chanSrefNo,int jfType) {
		// TODO Auto-generated method stub
		/*
		1.综合积分
		2.贵宾积分
		3.村镇积分（兴安）
		4.村镇积分（腾县）
		5.村镇积分（横县）
		6.村镇积分（容县）
		7.村镇积分（保安）
		8.村镇积分（桂平）
		9.村镇积分（平南）
		*/
		if(jfType==1){
			ip_pay_bill.setCheckDt(Randparams.GETYEST(day));
			ip_pay_bill.setPayType(Constants.PAYTYPE7);
			ip_pay_bill.setGeneralIntegral(Integral);
			ip_pay_bill.setGeneralIntegralAmt(new BigDecimal(new DecimalFormat(".00").format(IntegralAmt)));
			ip_pay_bill.setRedPacketAmt(new BigDecimal(redPacketAmt));
			ip_pay_bill.setTxnSts(Constants.TXNSTS2);
			ip_pay_bill.setChanResultCode(chanResultCode);
			ip_pay_bill.setChanSrefNo(chanSrefNo);
			ip_pay_billdao.updateByPrimaryKeySelective(ip_pay_bill);
		}else if(jfType==2){
			ip_pay_bill.setCheckDt(Randparams.GETYEST(day));
			ip_pay_bill.setPayType(Constants.PAYTYPE7);
			ip_pay_bill.setGuestIntegral(Integral);
			ip_pay_bill.setGuestIntegralAmt(new BigDecimal(new DecimalFormat(".00").format(IntegralAmt)));
			ip_pay_bill.setRedPacketAmt(new BigDecimal(redPacketAmt));
			ip_pay_bill.setTxnSts(Constants.TXNSTS2);
			ip_pay_bill.setChanResultCode(chanResultCode);
			ip_pay_bill.setChanSrefNo(chanSrefNo);
			ip_pay_billdao.updateByPrimaryKeySelective(ip_pay_bill);
		}else if(jfType==3){
			ip_pay_bill.setCheckDt(Randparams.GETYEST(day));
			ip_pay_bill.setPayType(Constants.PAYTYPE7);
			ip_pay_bill.setTownIntegralXa(Integral);
			ip_pay_bill.setTownIntegralXaAmt(new BigDecimal(new DecimalFormat(".00").format(IntegralAmt)));
			ip_pay_bill.setRedPacketAmt(new BigDecimal(redPacketAmt));
			ip_pay_bill.setTxnSts(Constants.TXNSTS2);
			ip_pay_bill.setChanResultCode(chanResultCode);
			ip_pay_bill.setChanSrefNo(chanSrefNo);
			ip_pay_billdao.updateByPrimaryKeySelective(ip_pay_bill);
		}else if(jfType==4){
			ip_pay_bill.setCheckDt(Randparams.GETYEST(day));
			ip_pay_bill.setPayType(Constants.PAYTYPE7);
			ip_pay_bill.setTownIntegralTx(Integral);
			ip_pay_bill.setTownIntegralTxAmt(new BigDecimal(new DecimalFormat(".00").format(IntegralAmt)));
			ip_pay_bill.setRedPacketAmt(new BigDecimal(redPacketAmt));
			ip_pay_bill.setTxnSts(Constants.TXNSTS2);
			ip_pay_bill.setChanResultCode(chanResultCode);
			ip_pay_bill.setChanSrefNo(chanSrefNo);
			ip_pay_billdao.updateByPrimaryKeySelective(ip_pay_bill);
		}else if(jfType==5){
			ip_pay_bill.setCheckDt(Randparams.GETYEST(day));
			ip_pay_bill.setPayType(Constants.PAYTYPE7);
			ip_pay_bill.setTownIntegralHx(Integral);
			ip_pay_bill.setTownIntegralHxAmt(new BigDecimal(new DecimalFormat(".00").format(IntegralAmt)));
			ip_pay_bill.setRedPacketAmt(new BigDecimal(redPacketAmt));
			ip_pay_bill.setTxnSts(Constants.TXNSTS2);
			ip_pay_bill.setChanResultCode(chanResultCode);
			ip_pay_bill.setChanSrefNo(chanSrefNo);
			ip_pay_billdao.updateByPrimaryKeySelective(ip_pay_bill);
		}else if(jfType==6){
			ip_pay_bill.setCheckDt(Randparams.GETYEST(day));
			ip_pay_bill.setPayType(Constants.PAYTYPE7);
			ip_pay_bill.setTownIntegralRx(Integral);
			ip_pay_bill.setTownIntegralRxAmt(new BigDecimal(new DecimalFormat(".00").format(IntegralAmt)));
			ip_pay_bill.setRedPacketAmt(new BigDecimal(redPacketAmt));
			ip_pay_bill.setTxnSts(Constants.TXNSTS2);
			ip_pay_bill.setChanResultCode(chanResultCode);
			ip_pay_bill.setChanSrefNo(chanSrefNo);
			ip_pay_billdao.updateByPrimaryKeySelective(ip_pay_bill);
		}else if(jfType==7){
			ip_pay_bill.setCheckDt(Randparams.GETYEST(day));
			ip_pay_bill.setPayType(Constants.PAYTYPE7);
			ip_pay_bill.setTownIntegralBa(Integral);
			ip_pay_bill.setTownIntegralBaAmt(new BigDecimal(new DecimalFormat(".00").format(IntegralAmt)));
			ip_pay_bill.setRedPacketAmt(new BigDecimal(redPacketAmt));
			ip_pay_bill.setTxnSts(Constants.TXNSTS2);
			ip_pay_bill.setChanResultCode(chanResultCode);
			ip_pay_bill.setChanSrefNo(chanSrefNo);
			ip_pay_billdao.updateByPrimaryKeySelective(ip_pay_bill);
		}else if(jfType==8){
			ip_pay_bill.setCheckDt(Randparams.GETYEST(day));
			ip_pay_bill.setPayType(Constants.PAYTYPE7);
			ip_pay_bill.setTownIntegralGp(Integral);
			ip_pay_bill.setTownIntegralGpAmt(new BigDecimal(new DecimalFormat(".00").format(IntegralAmt)));
			ip_pay_bill.setRedPacketAmt(new BigDecimal(redPacketAmt));
			ip_pay_bill.setTxnSts(Constants.TXNSTS2);
			ip_pay_bill.setChanResultCode(chanResultCode);
			ip_pay_bill.setChanSrefNo(chanSrefNo);
			ip_pay_billdao.updateByPrimaryKeySelective(ip_pay_bill);
		}else if(jfType==9){
			ip_pay_bill.setCheckDt(Randparams.GETYEST(day));
			ip_pay_bill.setPayType(Constants.PAYTYPE7);
			ip_pay_bill.setTownIntegralPn(Integral);
			ip_pay_bill.setTownIntegralPnAmt(new BigDecimal(new DecimalFormat(".00").format(IntegralAmt)));
			ip_pay_bill.setRedPacketAmt(new BigDecimal(redPacketAmt));
			ip_pay_bill.setTxnSts(Constants.TXNSTS2);
			ip_pay_bill.setChanResultCode(chanResultCode);
			ip_pay_bill.setChanSrefNo(chanSrefNo);
			ip_pay_billdao.updateByPrimaryKeySelective(ip_pay_bill);
		}

	}
}
