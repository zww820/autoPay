package org.pay.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import javax.annotation.Resource;  

import org.pay.dao.Ip_mall_orderDAO;
import org.pay.entity.Ip_mall_order;
import org.pay.service.IIp_mall_orderServer;
import org.pay.utils.Constants;
import org.pay.utils.Randparams;

@SuppressWarnings("restriction")
@Service("IIp_mall_orderServerImpl")  
public class IIp_mall_orderServerImpl implements IIp_mall_orderServer{
	@Resource
	private Ip_mall_orderDAO ip_mall_orderdao;

	
	public Ip_mall_order getdata(String orderId) {
		// TODO Auto-generated method stub
		return this.ip_mall_orderdao.selectByPrimaryKey(orderId);
	} 
	
	public Ip_mall_order getTopdata(int count){
		return this.ip_mall_orderdao.getTopOrderID(count);
	}

	public void updatedata(Ip_mall_order ip_mall_order,int day,long Integral,double IntegralAmt,long oldIntegral,double oldIntegralAmt,
			double redPacketAmt,double oldRedPacketAmt,int jfType ){
		// TODO Auto-generated method stub\
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
			ip_mall_order.setCheckDt(Randparams.GETYEST(day));
			ip_mall_order.setPayType(Constants.PAYTYPE7);
			ip_mall_order.setGeneralIntegral(Integral);
			ip_mall_order.setGeneralIntegralAmt(new BigDecimal(new DecimalFormat(".00").format(IntegralAmt)));
			ip_mall_order.setOldGeneralIntegral(oldIntegral);
			ip_mall_order.setOldGeneralIntegralAmt(new BigDecimal(new DecimalFormat(".00").format(oldIntegralAmt)));
			ip_mall_order.setRedPacketAmt(new BigDecimal(redPacketAmt));
			ip_mall_order.setOldRedPacketAmt(new BigDecimal(new DecimalFormat(".00").format(oldRedPacketAmt)));
			ip_mall_order.setTxnSts(Constants.TXNSTS2);
			ip_mall_orderdao.updateByPrimaryKeySelective(ip_mall_order);
	    
		}else if(jfType==2){
			ip_mall_order.setCheckDt(Randparams.GETYEST(day));
			ip_mall_order.setPayType(Constants.PAYTYPE7);
			ip_mall_order.setGuestIntegral(Integral);
			ip_mall_order.setGuestIntegralAmt(new BigDecimal(new DecimalFormat(".00").format(IntegralAmt)));
			ip_mall_order.setOldGeneralIntegral(oldIntegral);
			ip_mall_order.setOldGuestIntegralAmt(new BigDecimal(new DecimalFormat(".00").format(oldIntegralAmt)));
			ip_mall_order.setRedPacketAmt(new BigDecimal(redPacketAmt));
			ip_mall_order.setOldRedPacketAmt(new BigDecimal(new DecimalFormat(".00").format(oldRedPacketAmt)));
			ip_mall_order.setTxnSts(Constants.TXNSTS2);
			ip_mall_orderdao.updateByPrimaryKeySelective(ip_mall_order);
		}else if(jfType==3){
			ip_mall_order.setCheckDt(Randparams.GETYEST(day));
			ip_mall_order.setPayType(Constants.PAYTYPE7);
			ip_mall_order.setTownIntegralXa(Integral);
			ip_mall_order.setTownIntegralXaAmt(new BigDecimal(new DecimalFormat(".00").format(IntegralAmt)));
			ip_mall_order.setOldTownIntegralXa(oldIntegral);
			ip_mall_order.setOldTownIntegralXaAmt(new BigDecimal(new DecimalFormat(".00").format(oldIntegralAmt)));
			ip_mall_order.setRedPacketAmt(new BigDecimal(redPacketAmt));
			ip_mall_order.setOldRedPacketAmt(new BigDecimal(new DecimalFormat(".00").format(oldRedPacketAmt)));
			ip_mall_order.setTxnSts(Constants.TXNSTS2);
			ip_mall_orderdao.updateByPrimaryKeySelective(ip_mall_order);
		}else if(jfType==4){
			ip_mall_order.setCheckDt(Randparams.GETYEST(day));
			ip_mall_order.setPayType(Constants.PAYTYPE7);
			ip_mall_order.setTownIntegralTx(Integral);
			ip_mall_order.setTownIntegralTxAmt(new BigDecimal(new DecimalFormat(".00").format(IntegralAmt)));
			ip_mall_order.setOldTownIntegralTx(oldIntegral);
			ip_mall_order.setOldTownIntegralTxAmt(new BigDecimal(new DecimalFormat(".00").format(oldIntegralAmt)));
			ip_mall_order.setRedPacketAmt(new BigDecimal(redPacketAmt));
			ip_mall_order.setOldRedPacketAmt(new BigDecimal(new DecimalFormat(".00").format(oldRedPacketAmt)));
			ip_mall_order.setTxnSts(Constants.TXNSTS2);
			ip_mall_orderdao.updateByPrimaryKeySelective(ip_mall_order);
		}else if(jfType==5){
			ip_mall_order.setCheckDt(Randparams.GETYEST(day));
			ip_mall_order.setPayType(Constants.PAYTYPE7);
			ip_mall_order.setTownIntegralHx(Integral);
			ip_mall_order.setTownIntegralHxAmt(new BigDecimal(new DecimalFormat(".00").format(IntegralAmt)));
			ip_mall_order.setOldTownIntegralHx(oldIntegral);
			ip_mall_order.setOldTownIntegralHxAmt(new BigDecimal(new DecimalFormat(".00").format(oldIntegralAmt)));
			ip_mall_order.setRedPacketAmt(new BigDecimal(redPacketAmt));
			ip_mall_order.setOldRedPacketAmt(new BigDecimal(new DecimalFormat(".00").format(oldRedPacketAmt)));
			ip_mall_order.setTxnSts(Constants.TXNSTS2);
			ip_mall_orderdao.updateByPrimaryKeySelective(ip_mall_order);
		}else if(jfType==6){
			ip_mall_order.setCheckDt(Randparams.GETYEST(day));
			ip_mall_order.setPayType(Constants.PAYTYPE7);
			ip_mall_order.setTownIntegralRx(Integral);
			ip_mall_order.setTownIntegralRxAmt(new BigDecimal(new DecimalFormat(".00").format(IntegralAmt)));
			ip_mall_order.setOldTownIntegralRx(oldIntegral);
			ip_mall_order.setOldTownIntegralRxAmt(new BigDecimal(new DecimalFormat(".00").format(oldIntegralAmt)));
			ip_mall_order.setRedPacketAmt(new BigDecimal(redPacketAmt));
			ip_mall_order.setOldRedPacketAmt(new BigDecimal(new DecimalFormat(".00").format(oldRedPacketAmt)));
			ip_mall_order.setTxnSts(Constants.TXNSTS2);
			ip_mall_orderdao.updateByPrimaryKeySelective(ip_mall_order);
		}else if(jfType==7){
			ip_mall_order.setCheckDt(Randparams.GETYEST(day));
			ip_mall_order.setPayType(Constants.PAYTYPE7);
			ip_mall_order.setTownIntegralBa(Integral);
			ip_mall_order.setTownIntegralBaAmt(new BigDecimal(new DecimalFormat(".00").format(IntegralAmt)));
			ip_mall_order.setOldTownIntegralBa(oldIntegral);
			ip_mall_order.setOldTownIntegralBaAmt(new BigDecimal(new DecimalFormat(".00").format(oldIntegralAmt)));
			ip_mall_order.setRedPacketAmt(new BigDecimal(redPacketAmt));
			ip_mall_order.setOldRedPacketAmt(new BigDecimal(new DecimalFormat(".00").format(oldRedPacketAmt)));
			ip_mall_order.setTxnSts(Constants.TXNSTS2);
			ip_mall_orderdao.updateByPrimaryKeySelective(ip_mall_order);
			
		}else if(jfType==8){
			ip_mall_order.setCheckDt(Randparams.GETYEST(day));
			ip_mall_order.setPayType(Constants.PAYTYPE7);
			ip_mall_order.setTownIntegralGp(Integral);
			ip_mall_order.setTownIntegralGpAmt(new BigDecimal(new DecimalFormat(".00").format(IntegralAmt)));
			ip_mall_order.setOldTownIntegralGp(oldIntegral);
			ip_mall_order.setOldTownIntegralGpAmt(new BigDecimal(new DecimalFormat(".00").format(oldIntegralAmt)));
			ip_mall_order.setRedPacketAmt(new BigDecimal(redPacketAmt));
			ip_mall_order.setOldRedPacketAmt(new BigDecimal(new DecimalFormat(".00").format(oldRedPacketAmt)));
			ip_mall_order.setTxnSts(Constants.TXNSTS2);
			ip_mall_orderdao.updateByPrimaryKeySelective(ip_mall_order);
		}else if(jfType==9){
			ip_mall_order.setCheckDt(Randparams.GETYEST(day));
			ip_mall_order.setPayType(Constants.PAYTYPE7);
			ip_mall_order.setTownIntegralPn(Integral);
			ip_mall_order.setTownIntegralPnAmt(new BigDecimal(new DecimalFormat(".00").format(IntegralAmt)));
			ip_mall_order.setOldTownIntegralPn(oldIntegral);
			ip_mall_order.setOldTownIntegralPnAmt(new BigDecimal(new DecimalFormat(".00").format(oldIntegralAmt)));
			ip_mall_order.setRedPacketAmt(new BigDecimal(redPacketAmt));
			ip_mall_order.setOldRedPacketAmt(new BigDecimal(new DecimalFormat(".00").format(oldRedPacketAmt)));
			ip_mall_order.setTxnSts(Constants.TXNSTS2);
			ip_mall_orderdao.updateByPrimaryKeySelective(ip_mall_order);
		}
		
		
	}
	
	
	
	
}
