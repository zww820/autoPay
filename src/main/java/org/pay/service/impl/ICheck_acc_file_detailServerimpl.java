package org.pay.service.impl;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import javax.annotation.Resource;

import org.pay.dao.Check_acc_file_detailDAO;
import org.pay.dao.Ip_mall_orderDAO;
import org.pay.entity.Check_acc_file_detail;
import org.pay.entity.Ip_mall_order;
import org.pay.service.ICheck_acc_file_detailServer;
import org.pay.utils.Constants;
import org.pay.utils.Randparams;
import org.springframework.stereotype.Service;

@SuppressWarnings("restriction")
@Service("ICheck_acc_file_detailServerimpl")
public class ICheck_acc_file_detailServerimpl implements ICheck_acc_file_detailServer{
	
	@Resource
	private Check_acc_file_detailDAO check_acc_file_detaildao;
	
	public void updatedata(Check_acc_file_detail check_acc_file_detail,int day,int CHECK_STATE,String CHAN_LOG_NO,double CHAN_TXN_AMT,
			long CHAN_TXN_BAL,double CHAN_TXN_DEAMT,String LOG_NO,long CHAN_GUEST_BAL,long CHAN_TXN_GT_XA,long CHAN_TXN_GT_TX,long CHAN_TXN_GT_HX,
			long CHAN_TXN_GT_RX,long CHAN_TXN_GT_BA,long CHAN_TXN_GT_GP,long CHAN_TXN_GT_PN) {
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
		check_acc_file_detail.setCHECK_DT(Randparams.GETYEST(day));
		check_acc_file_detail.setCHAN_NO(Constants.CHAN_NO);
		check_acc_file_detail.setCHECK_STATE(CHECK_STATE);
		check_acc_file_detail.setCHAN_LOG_NO(CHAN_LOG_NO);//通道流水号
		check_acc_file_detail.setCHAN_TXN_TYPE(Constants.TXN_TYPE1);
		check_acc_file_detail.setCHAN_TXN_AMT(new BigDecimal(new DecimalFormat(".00").format(CHAN_TXN_AMT)));
		check_acc_file_detail.setCHAN_TXN_BAL(CHAN_TXN_BAL);
		check_acc_file_detail.setCHAN_TXN_DEAMT(new BigDecimal(new DecimalFormat(".00").format(CHAN_TXN_DEAMT)));
		check_acc_file_detail.setCHAN_TXN_CD(Constants.CHAN_TXN_CD);
		check_acc_file_detail.setLOG_NO(LOG_NO);
		check_acc_file_detail.setCHAN_GUEST_BAL(CHAN_GUEST_BAL);
		check_acc_file_detail.setCHAN_TXN_GT_XA(CHAN_TXN_GT_XA);
		check_acc_file_detail.setCHAN_TXN_GT_TX(CHAN_TXN_GT_TX);
		check_acc_file_detail.setCHAN_TXN_GT_HX(CHAN_TXN_GT_HX);
		check_acc_file_detail.setCHAN_TXN_GT_RX(CHAN_TXN_GT_RX);
		check_acc_file_detail.setCHAN_TXN_GT_BA(CHAN_TXN_GT_BA);
		check_acc_file_detail.setCHAN_TXN_GT_GP(CHAN_TXN_GT_GP);
		check_acc_file_detail.setCHAN_TXN_GT_PN(CHAN_TXN_GT_PN);
		check_acc_file_detaildao.updateByPrimaryKeySelective(check_acc_file_detail);
	}

	
	public void insertdata(Check_acc_file_detail check_acc_file_detail,int day,int CHECK_STATE,String CHAN_LOG_NO,double CHAN_TXN_AMT,
			long CHAN_TXN_BAL,double CHAN_TXN_DEAMT,String LOG_NO,long CHAN_GUEST_BAL,long CHAN_TXN_GT_XA,long CHAN_TXN_GT_TX,long CHAN_TXN_GT_HX,
			long CHAN_TXN_GT_RX,long CHAN_TXN_GT_BA,long CHAN_TXN_GT_GP,long CHAN_TXN_GT_PN) {
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
//		if(jfType==1){
			check_acc_file_detail.setCHECK_DT(Randparams.GETYEST(day));
			check_acc_file_detail.setCHAN_NO(Constants.CHAN_NO);
			check_acc_file_detail.setCHECK_STATE(CHECK_STATE);
			check_acc_file_detail.setCHAN_LOG_NO(CHAN_LOG_NO);//通道流水号
			check_acc_file_detail.setCHAN_TXN_TYPE(Constants.TXN_TYPE1);
			check_acc_file_detail.setCHAN_TXN_AMT(new BigDecimal(new DecimalFormat(".00").format(CHAN_TXN_AMT)));
			check_acc_file_detail.setCHAN_TXN_BAL(CHAN_TXN_BAL);
			check_acc_file_detail.setCHAN_TXN_DEAMT(new BigDecimal(new DecimalFormat(".00").format(CHAN_TXN_DEAMT)));
			check_acc_file_detail.setCHAN_TXN_CD(Constants.CHAN_TXN_CD);
			check_acc_file_detail.setLOG_NO(LOG_NO);
			check_acc_file_detail.setCHAN_GUEST_BAL(CHAN_GUEST_BAL);
			check_acc_file_detail.setCHAN_TXN_GT_XA(CHAN_TXN_GT_XA);
			check_acc_file_detail.setCHAN_TXN_GT_TX(CHAN_TXN_GT_TX);
			check_acc_file_detail.setCHAN_TXN_GT_HX(CHAN_TXN_GT_HX);
			check_acc_file_detail.setCHAN_TXN_GT_RX(CHAN_TXN_GT_RX);
			check_acc_file_detail.setCHAN_TXN_GT_BA(CHAN_TXN_GT_BA);
			check_acc_file_detail.setCHAN_TXN_GT_GP(CHAN_TXN_GT_GP);
			check_acc_file_detail.setCHAN_TXN_GT_PN(CHAN_TXN_GT_PN);
			check_acc_file_detaildao.insertSelective(check_acc_file_detail);
//		}
		/*
		else if(jfType==2){
			check_acc_file_detail.setCHECK_DT(Randparams.GETYEST(day));
			check_acc_file_detail.setCHAN_NO(Constants.CHAN_NO);
			check_acc_file_detail.setCHECK_STATE(CHECK_STATE);
			check_acc_file_detail.setCHAN_LOG_NO(CHAN_LOG_NO);
			check_acc_file_detail.setCHAN_TXN_TYPE(Constants.TXN_TYPE1);
			check_acc_file_detail.setCHAN_TXN_AMT(new BigDecimal(new DecimalFormat(".00").format(CHAN_TXN_AMT)));
			check_acc_file_detail.setCHAN_GUEST_BAL(CHAN_TXN);
			check_acc_file_detail.setCHAN_TXN_DEAMT(new BigDecimal(new DecimalFormat(".00").format(CHAN_TXN_DEAMT)));
			check_acc_file_detail.setCHAN_TXN_CD(Constants.CHAN_TXN_CD);
			check_acc_file_detail.setLOG_NO(LOG_NO);
			check_acc_file_detaildao.insertSelective(check_acc_file_detail);
		}else if(jfType==3){
			check_acc_file_detail.setCHECK_DT(Randparams.GETYEST(day));
			check_acc_file_detail.setCHAN_NO(Constants.CHAN_NO);
			check_acc_file_detail.setCHECK_STATE(CHECK_STATE);
			check_acc_file_detail.setCHAN_LOG_NO(CHAN_LOG_NO);
			check_acc_file_detail.setCHAN_TXN_TYPE(Constants.TXN_TYPE1);
			check_acc_file_detail.setCHAN_TXN_AMT(new BigDecimal(new DecimalFormat(".00").format(CHAN_TXN_AMT)));
			check_acc_file_detail.setCHAN_TXN_GT_XA(CHAN_TXN);
			check_acc_file_detail.setCHAN_TXN_DEAMT(new BigDecimal(new DecimalFormat(".00").format(CHAN_TXN_DEAMT)));
			check_acc_file_detail.setCHAN_TXN_CD(Constants.CHAN_TXN_CD);
			check_acc_file_detail.setLOG_NO(LOG_NO);
			check_acc_file_detaildao.insertSelective(check_acc_file_detail);
		}else if(jfType==4){
			check_acc_file_detail.setCHECK_DT(Randparams.GETYEST(day));
			check_acc_file_detail.setCHAN_NO(Constants.CHAN_NO);
			check_acc_file_detail.setCHECK_STATE(CHECK_STATE);
			check_acc_file_detail.setCHAN_LOG_NO(CHAN_LOG_NO);
			check_acc_file_detail.setCHAN_TXN_TYPE(Constants.TXN_TYPE1);
			check_acc_file_detail.setCHAN_TXN_AMT(new BigDecimal(new DecimalFormat(".00").format(CHAN_TXN_AMT)));
			check_acc_file_detail.setCHAN_TXN_GT_TX(CHAN_TXN);
			check_acc_file_detail.setCHAN_TXN_DEAMT(new BigDecimal(new DecimalFormat(".00").format(CHAN_TXN_DEAMT)));
			check_acc_file_detail.setCHAN_TXN_CD(Constants.CHAN_TXN_CD);
			check_acc_file_detail.setLOG_NO(LOG_NO);
			check_acc_file_detaildao.insertSelective(check_acc_file_detail);
		}else if(jfType==5){
			check_acc_file_detail.setCHECK_DT(Randparams.GETYEST(day));
			check_acc_file_detail.setCHAN_NO(Constants.CHAN_NO);
			check_acc_file_detail.setCHECK_STATE(CHECK_STATE);
			check_acc_file_detail.setCHAN_LOG_NO(CHAN_LOG_NO);
			check_acc_file_detail.setCHAN_TXN_TYPE(Constants.TXN_TYPE1);
			check_acc_file_detail.setCHAN_TXN_AMT(new BigDecimal(new DecimalFormat(".00").format(CHAN_TXN_AMT)));
			check_acc_file_detail.setCHAN_TXN_GT_HX(CHAN_TXN);
			check_acc_file_detail.setCHAN_TXN_DEAMT(new BigDecimal(new DecimalFormat(".00").format(CHAN_TXN_DEAMT)));
			check_acc_file_detail.setCHAN_TXN_CD(Constants.CHAN_TXN_CD);
			check_acc_file_detail.setLOG_NO(LOG_NO);
			check_acc_file_detaildao.insertSelective(check_acc_file_detail);
		}else if(jfType==6){
			check_acc_file_detail.setCHECK_DT(Randparams.GETYEST(day));
			check_acc_file_detail.setCHAN_NO(Constants.CHAN_NO);
			check_acc_file_detail.setCHECK_STATE(CHECK_STATE);
			check_acc_file_detail.setCHAN_LOG_NO(CHAN_LOG_NO);
			check_acc_file_detail.setCHAN_TXN_TYPE(Constants.TXN_TYPE1);
			check_acc_file_detail.setCHAN_TXN_AMT(new BigDecimal(new DecimalFormat(".00").format(CHAN_TXN_AMT)));
			check_acc_file_detail.setCHAN_TXN_GT_RX(CHAN_TXN);
			check_acc_file_detail.setCHAN_TXN_DEAMT(new BigDecimal(new DecimalFormat(".00").format(CHAN_TXN_DEAMT)));
			check_acc_file_detail.setCHAN_TXN_CD(Constants.CHAN_TXN_CD);
			check_acc_file_detail.setLOG_NO(LOG_NO);
			check_acc_file_detaildao.insertSelective(check_acc_file_detail);
		}else if(jfType==7){
			check_acc_file_detail.setCHECK_DT(Randparams.GETYEST(day));
			check_acc_file_detail.setCHAN_NO(Constants.CHAN_NO);
			check_acc_file_detail.setCHECK_STATE(CHECK_STATE);
			check_acc_file_detail.setCHAN_LOG_NO(CHAN_LOG_NO);
			check_acc_file_detail.setCHAN_TXN_TYPE(Constants.TXN_TYPE1);
			check_acc_file_detail.setCHAN_TXN_AMT(new BigDecimal(new DecimalFormat(".00").format(CHAN_TXN_AMT)));
			check_acc_file_detail.setCHAN_TXN_GT_BA(CHAN_TXN);
			check_acc_file_detail.setCHAN_TXN_DEAMT(new BigDecimal(new DecimalFormat(".00").format(CHAN_TXN_DEAMT)));
			check_acc_file_detail.setCHAN_TXN_CD(Constants.CHAN_TXN_CD);
			check_acc_file_detail.setLOG_NO(LOG_NO);
			check_acc_file_detaildao.insertSelective(check_acc_file_detail);
		}else if(jfType==8){
			check_acc_file_detail.setCHECK_DT(Randparams.GETYEST(day));
			check_acc_file_detail.setCHAN_NO(Constants.CHAN_NO);
			check_acc_file_detail.setCHECK_STATE(CHECK_STATE);
			check_acc_file_detail.setCHAN_LOG_NO(CHAN_LOG_NO);
			check_acc_file_detail.setCHAN_TXN_TYPE(Constants.TXN_TYPE1);
			check_acc_file_detail.setCHAN_TXN_AMT(new BigDecimal(new DecimalFormat(".00").format(CHAN_TXN_AMT)));
			check_acc_file_detail.setCHAN_TXN_GT_GP(CHAN_TXN);
			check_acc_file_detail.setCHAN_TXN_DEAMT(new BigDecimal(new DecimalFormat(".00").format(CHAN_TXN_DEAMT)));
			check_acc_file_detail.setCHAN_TXN_CD(Constants.CHAN_TXN_CD);
			check_acc_file_detail.setLOG_NO(LOG_NO);
			check_acc_file_detaildao.insertSelective(check_acc_file_detail);
		}else if(jfType==9){
			check_acc_file_detail.setCHECK_DT(Randparams.GETYEST(day));
			check_acc_file_detail.setCHAN_NO(Constants.CHAN_NO);
			check_acc_file_detail.setCHECK_STATE(CHECK_STATE);
			check_acc_file_detail.setCHAN_LOG_NO(CHAN_LOG_NO);
			check_acc_file_detail.setCHAN_TXN_TYPE(Constants.TXN_TYPE1);
			check_acc_file_detail.setCHAN_TXN_AMT(new BigDecimal(new DecimalFormat(".00").format(CHAN_TXN_AMT)));
			check_acc_file_detail.setCHAN_TXN_GT_PN(CHAN_TXN);
			check_acc_file_detail.setCHAN_TXN_DEAMT(new BigDecimal(new DecimalFormat(".00").format(CHAN_TXN_DEAMT)));
			check_acc_file_detail.setCHAN_TXN_CD(Constants.CHAN_TXN_CD);
			check_acc_file_detail.setLOG_NO(LOG_NO);
			check_acc_file_detaildao.insertSelective(check_acc_file_detail);
		}
*/
	}


	public Check_acc_file_detail getdata(String LOG_NO) {
		// TODO Auto-generated method stub
		return this.check_acc_file_detaildao.selectByPrimaryKey(LOG_NO);
	}
}
