package org.pay.service.impl;

import javax.annotation.Resource;

import org.pay.dao.Check_acc_infoDAO;
import org.pay.entity.Check_acc_info;
import org.pay.service.ICheck_acc_infoServer;
import org.pay.utils.Constants;
import org.pay.utils.Randparams;
import org.springframework.stereotype.Service;

@SuppressWarnings("restriction")
@Service("ICheck_acc_infoServerimpl")
public class ICheck_acc_infoServerimpl implements ICheck_acc_infoServer{

	@Resource
	private Check_acc_infoDAO check_acc_infodao;

	public void insertdata(Check_acc_info check_acc_info,int day,int ICHECK_STATE) {
		// TODO Auto-generated method stub
		check_acc_info.setCHAN_NO("001");
		check_acc_info.setCHECK_DT(Randparams.GETYEST(day));
		check_acc_info.setCHECK_STATE(ICHECK_STATE);
//		check_acc_info.setTRAN_ACC_TO(TRAN_ACC_TO);
//		check_acc_info.setTRAN_ACC_AMT(TRAN_ACC_AMT);
//		check_acc_info.setOUR_PAY_TOTAL_C_AMT(OUR_PAY_TOTAL_C_AMT);
//		check_acc_info.setOUR_RFD_TOTAL_C_AMT(OUR_RFD_TOTAL_C_AMT);
//		check_acc_info.setOUR_PAY_TOTAL_GI(OUR_PAY_TOTAL_GI);
//		check_acc_info.setOUR_RFD_TOTAL_GI(OUR_RFD_TOTAL_GI);
//		check_acc_info.setOUR_PAY_TOTAL_GU(OUR_PAY_TOTAL_GU);
//		check_acc_info.setOUR_RFD_TOTAL_GU(OUR_RFD_TOTAL_GU);
		check_acc_infodao.insertSelective(check_acc_info);
		
		
	}


}
