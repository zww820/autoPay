package org.pay.service;

import org.pay.entity.Check_acc_file_detail;

public interface ICheck_acc_file_detailServer {
	public Check_acc_file_detail getdata(String LOG_NO);
	
	public void updatedata(Check_acc_file_detail check_acc_file_detail,int day,int CHECK_STATE,String CHAN_LOG_NO,double CHAN_TXN_AMT,
			long CHAN_TXN_BAL,double CHAN_TXN_DEAMT,String LOG_NO,long CHAN_GUEST_BAL,long CHAN_TXN_GT_XA,long CHAN_TXN_GT_TX,long CHAN_TXN_GT_HX,
			long CHAN_TXN_GT_RX,long CHAN_TXN_GT_BA,long CHAN_TXN_GT_GP,long CHAN_TXN_GT_PN);

	public void insertdata(Check_acc_file_detail check_acc_file_detail,int day,int CHECK_STATE,String CHAN_LOG_NO,double CHAN_TXN_AMT,
			long CHAN_TXN_BAL,double CHAN_TXN_DEAMT,String LOG_NO,long CHAN_GUEST_BAL,long CHAN_TXN_GT_XA,long CHAN_TXN_GT_TX,long CHAN_TXN_GT_HX,
			long CHAN_TXN_GT_RX,long CHAN_TXN_GT_BA,long CHAN_TXN_GT_GP,long CHAN_TXN_GT_PN);
}
