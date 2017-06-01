package org.pay;

import javax.annotation.Resource;
import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;

import org.apache.log4j.Logger;
import org.pay.entity.Check_acc_file_detail;
import org.pay.entity.Check_acc_info;
import org.pay.entity.Ip_mall_order;
import org.pay.entity.Ip_pay_bill;
import org.pay.service.ICheck_acc_file_detailServer;
import org.pay.service.ICheck_acc_infoServer;
import org.pay.service.IIp_mall_orderServer;
import org.pay.service.IIp_pay_billServer;
import org.pay.utils.Cleandata;
import org.pay.utils.Constants;
import org.pay.utils.Randparams;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;


@SuppressWarnings("restriction")
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class Runner extends AbstractTestNGSpringContextTests {

	private static Logger logger = Logger.getLogger(Runner.class);
	@Resource
	private IIp_mall_orderServer ip_mall_orderserver=null;
	@Resource
	private IIp_pay_billServer ip_pay_billserver=null;
	@Resource
	private ICheck_acc_file_detailServer check_acc_file_detailserver=null;
	@Resource
	private ICheck_acc_infoServer check_acc_infoserver=null;
	@Resource
	private Cleandata cleandata=null;
	
	private Check_acc_file_detail check_acc_file_detail = new Check_acc_file_detail();
	private Check_acc_info check_acc_info= new Check_acc_info();

	@Test
	public void runer(){
//		1.综合积分
//		this.createintegral(1);
//		2.贵宾积分
//		this.createintegral(2);
//		3.村镇积分（兴安）
//		this.createintegral(3);
//		4.村镇积分（腾县）
//		this.createintegral(4);
////		5.村镇积分（横县）
//		this.createintegral(5);
////		6.村镇积分（容县）
//		this.createintegral(6);
////		7.村镇积分（保安）
//		this.createintegral(7);
////		8.村镇积分（桂平）
//		this.createintegral(8);
////		9.村镇积分（平南）
		this.createintegral(9);
	}
	//创建数据
	private void createintegral(int jfType){		
//		cleandata.cdata();
		//指定单号更新数据
//		Ip_mall_order ip_mall_order=ip_mall_orderserver.getdata("2220170519115248880989");
		//获取最新一条数据
		Ip_mall_order ip_mall_order=ip_mall_orderserver.getTopdata(1);
		Ip_pay_bill ip_pay_bill=ip_pay_billserver.getdata(ip_mall_order.getPayLogNo().toString());
//		check_acc_file_detail=check_acc_file_detailserver.getdata(ip_pay_bill.getLogNo().toString());
		ip_mall_orderserver.updatedata(ip_mall_order,1,Constants.GENERAL_INTEGRAL,Constants.GENERAL_INTEGRAL_AMT, 
				Constants.GENERAL_INTEGRAL, Constants.GENERAL_INTEGRAL_AMT, Constants.RED_PACKET_AMT, Constants.RED_PACKET_AMT,jfType);
		String LogNO=ip_mall_order.getPayLogNo().toString();
		double TotalAmt=ip_mall_order.getTotalAmt().doubleValue();
		long GeneralIntegral=ip_mall_order.getGeneralIntegral().longValue();
		double PayAmt=ip_mall_order.getPayAmt().doubleValue();
		long GuestIntegral=ip_mall_order.getGuestIntegral().longValue();
		long TownIntegralXa=ip_mall_order.getTownIntegralXa().longValue();
		long TownIntegralTx=ip_mall_order.getTownIntegralTx().longValue();
		long TownIntegralHx=ip_mall_order.getTownIntegralHx().longValue();
		long TownIntegralRx=ip_mall_order.getTownIntegralRx().longValue();
		long TownIntegralBa=ip_mall_order.getTownIntegralBa().longValue();
		long TownIntegralGp=ip_mall_order.getTownIntegralGp().longValue();
		long TownIntegralPn=ip_mall_order.getTownIntegralPn().longValue();
		ip_pay_billserver.updatedata(ip_pay_bill, 1, Constants.GENERAL_INTEGRAL, Constants.GENERAL_INTEGRAL_AMT, 
				Constants.RED_PACKET_AMT,Constants.CHAN_TXN_CD,Constants.LogNO, jfType);
//		//对账详情表插入前日数据
//		check_acc_file_detailserver.insertdata(check_acc_file_detail,2,Constants.CHECK_STATE2,Randparams.randonSInt(21),TotalAmt,
//				GeneralIntegral,PayAmt,Randparams.randonSInt(21),GuestIntegral,TownIntegralXa,TownIntegralTx,TownIntegralHx,TownIntegralRx,
//				TownIntegralBa,TownIntegralGp,TownIntegralPn);
//		//对账详情表插入昨日数据
		check_acc_file_detailserver.insertdata(check_acc_file_detail,1,Constants.CHECK_STATE1,Constants.LogNO,TotalAmt,
				GeneralIntegral,PayAmt,LogNO,GuestIntegral,TownIntegralXa,TownIntegralTx,TownIntegralHx,TownIntegralRx,
				TownIntegralBa,TownIntegralGp,TownIntegralPn);
		//对账详情表更新昨日数据
//		check_acc_file_detailserver.updatedata(check_acc_file_detail,365,Constants.CHECK_STATE1,Constants.LogNO,TotalAmt,
//		GeneralIntegral,PayAmt,LogNO,GuestIntegral,TownIntegralXa,TownIntegralTx,TownIntegralHx,TownIntegralRx,
//		TownIntegralBa,TownIntegralGp,TownIntegralPn);
//		//对账综合任务信息表插入前日数据
//		check_acc_infoserver.insertdata(check_acc_info, 2,Constants.ICHECK_STATE0);
//		//对账综合任务信息表插入昨日数据
//		check_acc_infoserver.insertdata(check_acc_info, 1,Constants.ICHECK_STATE1);
//		logger.info(JSON.toJSONString(ip_mall_order));
//		logger.info(JSON.toJSONString(check_acc_file_detail));
//		logger.info(JSON.toJSONString(check_acc_info));
//		logger.info(JSON.toJSONString(ip_pay_bill));
	}
	//修改数据
	private void updateintegral(){
		
	}
	
}
