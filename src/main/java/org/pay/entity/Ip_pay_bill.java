package org.pay.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Ip_pay_bill implements Serializable {
    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : LOG_NO
     */
    private String logNo;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : BUS_NO
     */
    private String busNo;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : AC_DT
     */
    private String acDt;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : AC_TM
     */
    private Date acTm;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : TRAN_TYPE
     */
    private Integer tranType;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : TXN_STS
     */
    private Integer txnSts;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAY_AMT
     */
    private BigDecimal payAmt;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : TXN_AMT
     */
    private BigDecimal txnAmt;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : OAC_DT
     */
    private String oacDt;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : OLOG_NO
     */
    private String ologNo;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : ORN_ORDER_ID
     */
    private String ornOrderId;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : CHECK_DT
     */
    private String checkDt;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : CHECK_STATE
     */
    private Integer checkState;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAY_METHOD
     */
    private String payMethod;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAY_CHANNEL_NO
     */
    private String payChannelNo;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : CC_NO
     */
    private String ccNo;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : SRC_CUSTID
     */
    private String srcCustid;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : SRC_CUSTNAME
     */
    private String srcCustname;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAYER_BANKCODE
     */
    private String payerBankcode;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAYER_CUSTID
     */
    private String payerCustid;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAYER_CUSTNAME
     */
    private String payerCustname;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAYER_PAYTYPE
     */
    private Integer payerPaytype;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAYER_BANK_CARDNO
     */
    private String payerBankCardno;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAYER_BANKACCOUNT_NAME
     */
    private String payerBankaccountName;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAYER_BANKACCOUNT_TYPE
     */
    private Integer payerBankaccountType;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAYER_BANKNAME
     */
    private String payerBankname;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAYER_BANKTYPE
     */
    private String payerBanktype;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAYER_BANKADDR
     */
    private String payerBankaddr;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAYEE_CUSTID
     */
    private String payeeCustid;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAYEE_CUSTNAME
     */
    private String payeeCustname;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAYEE_BANKACCOUNT_NO
     */
    private String payeeBankaccountNo;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAYEE_BANKACCOUNT_NAME
     */
    private String payeeBankaccountName;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAYEE_BANKACCOUNT_TYPE
     */
    private Integer payeeBankaccountType;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAYEE_BANKCODE
     */
    private String payeeBankcode;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAYEE_BANKNAME
     */
    private String payeeBankname;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAYEE_BANKTYPE
     */
    private String payeeBanktype;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAYEE_BANKADDR
     */
    private String payeeBankaddr;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : CHAN_SREF_NO
     */
    private String chanSrefNo;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : CHAN_RESULT_CODE
     */
    private String chanResultCode;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : EXPIRE_TIME
     */
    private Date expireTime;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : LAST_UPDATE_TM
     */
    private Date lastUpdateTm;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : REMARK
     */
    private String remark;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : SEND_STATE
     */
    private Integer sendState;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAY_TYPE
     */
    private Integer payType;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : GENERAL_INTEGRAL
     */
    private Long generalIntegral;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : GENERAL_INTEGRAL_AMT
     */
    private BigDecimal generalIntegralAmt;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : RED_PACKET_AMT
     */
    private BigDecimal redPacketAmt;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : TXN_TOTAL_AMT
     */
    private BigDecimal txnTotalAmt;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : GUEST_INTEGRAL
     */
    private Long guestIntegral;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : GUEST_INTEGRAL_AMT
     */
    private BigDecimal guestIntegralAmt;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : BLUE_CARD_NUMBERS
     */
    private Long blueCardNumbers;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAYER_ID_TYPE
     */
    private String payerIdType;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAYER_ID_NO
     */
    private String payerIdNo;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : PAYER_USRE_TYPE
     */
    private String payerUsreType;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : CHECK_PWD
     */
    private String checkPwd;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : SIGN_FLAG
     */
    private String signFlag;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : TOWN_INTEGRAL_XA
     */
    private Long townIntegralXa;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : TOWN_INTEGRAL_XA_AMT
     */
    private BigDecimal townIntegralXaAmt;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : TOWN_INTEGRAL_TX
     */
    private Long townIntegralTx;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : TOWN_INTEGRAL_TX_AMT
     */
    private BigDecimal townIntegralTxAmt;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : TOWN_INTEGRAL_HX
     */
    private Long townIntegralHx;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : TOWN_INTEGRAL_HX_AMT
     */
    private BigDecimal townIntegralHxAmt;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : TOWN_INTEGRAL_RX
     */
    private Long townIntegralRx;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : TOWN_INTEGRAL_RX_AMT
     */
    private BigDecimal townIntegralRxAmt;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : TOWN_INTEGRAL_BA
     */
    private Long townIntegralBa;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : TOWN_INTEGRAL_BA_AMT
     */
    private BigDecimal townIntegralBaAmt;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : TOWN_INTEGRAL_GP
     */
    private Long townIntegralGp;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : TOWN_INTEGRAL_GP_AMT
     */
    private BigDecimal townIntegralGpAmt;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : TOWN_INTEGRAL_PN
     */
    private Long townIntegralPn;

    /**
     * 表 : IECPAY.IP_PAY_BILL
     * 对应字段 : TOWN_INTEGRAL_PN_AMT
     */
    private BigDecimal townIntegralPnAmt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table IECPAY.IP_PAY_BILL
     *
     * @MBG Generated Mon May 15 19:01:43 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.LOG_NO：null
     */
    public String getLogNo() {
        return logNo;
    }

    /**
     * set method 
     *
     * @param logNo  null
     */
    public void setLogNo(String logNo) {
        this.logNo = logNo == null ? null : logNo.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.BUS_NO：null
     */
    public String getBusNo() {
        return busNo;
    }

    /**
     * set method 
     *
     * @param busNo  null
     */
    public void setBusNo(String busNo) {
        this.busNo = busNo == null ? null : busNo.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.AC_DT：null
     */
    public String getAcDt() {
        return acDt;
    }

    /**
     * set method 
     *
     * @param acDt  null
     */
    public void setAcDt(String acDt) {
        this.acDt = acDt == null ? null : acDt.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.AC_TM：null
     */
    public Date getAcTm() {
        return acTm;
    }

    /**
     * set method 
     *
     * @param acTm  null
     */
    public void setAcTm(Date acTm) {
        this.acTm = acTm;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.TRAN_TYPE：null
     */
    public Integer getTranType() {
        return tranType;
    }

    /**
     * set method 
     *
     * @param tranType  null
     */
    public void setTranType(Integer tranType) {
        this.tranType = tranType;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.TXN_STS：null
     */
    public Integer getTxnSts() {
        return txnSts;
    }

    /**
     * set method 
     *
     * @param txnSts  null
     */
    public void setTxnSts(Integer txnSts) {
        this.txnSts = txnSts;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAY_AMT：null
     */
    public BigDecimal getPayAmt() {
        return payAmt;
    }

    /**
     * set method 
     *
     * @param payAmt  null
     */
    public void setPayAmt(BigDecimal payAmt) {
        this.payAmt = payAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.TXN_AMT：null
     */
    public BigDecimal getTxnAmt() {
        return txnAmt;
    }

    /**
     * set method 
     *
     * @param txnAmt  null
     */
    public void setTxnAmt(BigDecimal txnAmt) {
        this.txnAmt = txnAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.OAC_DT：null
     */
    public String getOacDt() {
        return oacDt;
    }

    /**
     * set method 
     *
     * @param oacDt  null
     */
    public void setOacDt(String oacDt) {
        this.oacDt = oacDt == null ? null : oacDt.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.OLOG_NO：null
     */
    public String getOlogNo() {
        return ologNo;
    }

    /**
     * set method 
     *
     * @param ologNo  null
     */
    public void setOlogNo(String ologNo) {
        this.ologNo = ologNo == null ? null : ologNo.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.ORN_ORDER_ID：null
     */
    public String getOrnOrderId() {
        return ornOrderId;
    }

    /**
     * set method 
     *
     * @param ornOrderId  null
     */
    public void setOrnOrderId(String ornOrderId) {
        this.ornOrderId = ornOrderId == null ? null : ornOrderId.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.CHECK_DT：null
     */
    public String getCheckDt() {
        return checkDt;
    }

    /**
     * set method 
     *
     * @param checkDt  null
     */
    public void setCheckDt(String checkDt) {
        this.checkDt = checkDt == null ? null : checkDt.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.CHECK_STATE：null
     */
    public Integer getCheckState() {
        return checkState;
    }

    /**
     * set method 
     *
     * @param checkState  null
     */
    public void setCheckState(Integer checkState) {
        this.checkState = checkState;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAY_METHOD：null
     */
    public String getPayMethod() {
        return payMethod;
    }

    /**
     * set method 
     *
     * @param payMethod  null
     */
    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod == null ? null : payMethod.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAY_CHANNEL_NO：null
     */
    public String getPayChannelNo() {
        return payChannelNo;
    }

    /**
     * set method 
     *
     * @param payChannelNo  null
     */
    public void setPayChannelNo(String payChannelNo) {
        this.payChannelNo = payChannelNo == null ? null : payChannelNo.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.CC_NO：null
     */
    public String getCcNo() {
        return ccNo;
    }

    /**
     * set method 
     *
     * @param ccNo  null
     */
    public void setCcNo(String ccNo) {
        this.ccNo = ccNo == null ? null : ccNo.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.SRC_CUSTID：null
     */
    public String getSrcCustid() {
        return srcCustid;
    }

    /**
     * set method 
     *
     * @param srcCustid  null
     */
    public void setSrcCustid(String srcCustid) {
        this.srcCustid = srcCustid == null ? null : srcCustid.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.SRC_CUSTNAME：null
     */
    public String getSrcCustname() {
        return srcCustname;
    }

    /**
     * set method 
     *
     * @param srcCustname  null
     */
    public void setSrcCustname(String srcCustname) {
        this.srcCustname = srcCustname == null ? null : srcCustname.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAYER_BANKCODE：null
     */
    public String getPayerBankcode() {
        return payerBankcode;
    }

    /**
     * set method 
     *
     * @param payerBankcode  null
     */
    public void setPayerBankcode(String payerBankcode) {
        this.payerBankcode = payerBankcode == null ? null : payerBankcode.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAYER_CUSTID：null
     */
    public String getPayerCustid() {
        return payerCustid;
    }

    /**
     * set method 
     *
     * @param payerCustid  null
     */
    public void setPayerCustid(String payerCustid) {
        this.payerCustid = payerCustid == null ? null : payerCustid.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAYER_CUSTNAME：null
     */
    public String getPayerCustname() {
        return payerCustname;
    }

    /**
     * set method 
     *
     * @param payerCustname  null
     */
    public void setPayerCustname(String payerCustname) {
        this.payerCustname = payerCustname == null ? null : payerCustname.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAYER_PAYTYPE：null
     */
    public Integer getPayerPaytype() {
        return payerPaytype;
    }

    /**
     * set method 
     *
     * @param payerPaytype  null
     */
    public void setPayerPaytype(Integer payerPaytype) {
        this.payerPaytype = payerPaytype;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAYER_BANK_CARDNO：null
     */
    public String getPayerBankCardno() {
        return payerBankCardno;
    }

    /**
     * set method 
     *
     * @param payerBankCardno  null
     */
    public void setPayerBankCardno(String payerBankCardno) {
        this.payerBankCardno = payerBankCardno == null ? null : payerBankCardno.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAYER_BANKACCOUNT_NAME：null
     */
    public String getPayerBankaccountName() {
        return payerBankaccountName;
    }

    /**
     * set method 
     *
     * @param payerBankaccountName  null
     */
    public void setPayerBankaccountName(String payerBankaccountName) {
        this.payerBankaccountName = payerBankaccountName == null ? null : payerBankaccountName.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAYER_BANKACCOUNT_TYPE：null
     */
    public Integer getPayerBankaccountType() {
        return payerBankaccountType;
    }

    /**
     * set method 
     *
     * @param payerBankaccountType  null
     */
    public void setPayerBankaccountType(Integer payerBankaccountType) {
        this.payerBankaccountType = payerBankaccountType;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAYER_BANKNAME：null
     */
    public String getPayerBankname() {
        return payerBankname;
    }

    /**
     * set method 
     *
     * @param payerBankname  null
     */
    public void setPayerBankname(String payerBankname) {
        this.payerBankname = payerBankname == null ? null : payerBankname.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAYER_BANKTYPE：null
     */
    public String getPayerBanktype() {
        return payerBanktype;
    }

    /**
     * set method 
     *
     * @param payerBanktype  null
     */
    public void setPayerBanktype(String payerBanktype) {
        this.payerBanktype = payerBanktype == null ? null : payerBanktype.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAYER_BANKADDR：null
     */
    public String getPayerBankaddr() {
        return payerBankaddr;
    }

    /**
     * set method 
     *
     * @param payerBankaddr  null
     */
    public void setPayerBankaddr(String payerBankaddr) {
        this.payerBankaddr = payerBankaddr == null ? null : payerBankaddr.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAYEE_CUSTID：null
     */
    public String getPayeeCustid() {
        return payeeCustid;
    }

    /**
     * set method 
     *
     * @param payeeCustid  null
     */
    public void setPayeeCustid(String payeeCustid) {
        this.payeeCustid = payeeCustid == null ? null : payeeCustid.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAYEE_CUSTNAME：null
     */
    public String getPayeeCustname() {
        return payeeCustname;
    }

    /**
     * set method 
     *
     * @param payeeCustname  null
     */
    public void setPayeeCustname(String payeeCustname) {
        this.payeeCustname = payeeCustname == null ? null : payeeCustname.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAYEE_BANKACCOUNT_NO：null
     */
    public String getPayeeBankaccountNo() {
        return payeeBankaccountNo;
    }

    /**
     * set method 
     *
     * @param payeeBankaccountNo  null
     */
    public void setPayeeBankaccountNo(String payeeBankaccountNo) {
        this.payeeBankaccountNo = payeeBankaccountNo == null ? null : payeeBankaccountNo.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAYEE_BANKACCOUNT_NAME：null
     */
    public String getPayeeBankaccountName() {
        return payeeBankaccountName;
    }

    /**
     * set method 
     *
     * @param payeeBankaccountName  null
     */
    public void setPayeeBankaccountName(String payeeBankaccountName) {
        this.payeeBankaccountName = payeeBankaccountName == null ? null : payeeBankaccountName.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAYEE_BANKACCOUNT_TYPE：null
     */
    public Integer getPayeeBankaccountType() {
        return payeeBankaccountType;
    }

    /**
     * set method 
     *
     * @param payeeBankaccountType  null
     */
    public void setPayeeBankaccountType(Integer payeeBankaccountType) {
        this.payeeBankaccountType = payeeBankaccountType;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAYEE_BANKCODE：null
     */
    public String getPayeeBankcode() {
        return payeeBankcode;
    }

    /**
     * set method 
     *
     * @param payeeBankcode  null
     */
    public void setPayeeBankcode(String payeeBankcode) {
        this.payeeBankcode = payeeBankcode == null ? null : payeeBankcode.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAYEE_BANKNAME：null
     */
    public String getPayeeBankname() {
        return payeeBankname;
    }

    /**
     * set method 
     *
     * @param payeeBankname  null
     */
    public void setPayeeBankname(String payeeBankname) {
        this.payeeBankname = payeeBankname == null ? null : payeeBankname.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAYEE_BANKTYPE：null
     */
    public String getPayeeBanktype() {
        return payeeBanktype;
    }

    /**
     * set method 
     *
     * @param payeeBanktype  null
     */
    public void setPayeeBanktype(String payeeBanktype) {
        this.payeeBanktype = payeeBanktype == null ? null : payeeBanktype.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAYEE_BANKADDR：null
     */
    public String getPayeeBankaddr() {
        return payeeBankaddr;
    }

    /**
     * set method 
     *
     * @param payeeBankaddr  null
     */
    public void setPayeeBankaddr(String payeeBankaddr) {
        this.payeeBankaddr = payeeBankaddr == null ? null : payeeBankaddr.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.CHAN_SREF_NO：null
     */
    public String getChanSrefNo() {
        return chanSrefNo;
    }

    /**
     * set method 
     *
     * @param chanSrefNo  null
     */
    public void setChanSrefNo(String chanSrefNo) {
        this.chanSrefNo = chanSrefNo == null ? null : chanSrefNo.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.CHAN_RESULT_CODE：null
     */
    public String getChanResultCode() {
        return chanResultCode;
    }

    /**
     * set method 
     *
     * @param chanResultCode  null
     */
    public void setChanResultCode(String chanResultCode) {
        this.chanResultCode = chanResultCode == null ? null : chanResultCode.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.EXPIRE_TIME：null
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * set method 
     *
     * @param expireTime  null
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.LAST_UPDATE_TM：null
     */
    public Date getLastUpdateTm() {
        return lastUpdateTm;
    }

    /**
     * set method 
     *
     * @param lastUpdateTm  null
     */
    public void setLastUpdateTm(Date lastUpdateTm) {
        this.lastUpdateTm = lastUpdateTm;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.REMARK：null
     */
    public String getRemark() {
        return remark;
    }

    /**
     * set method 
     *
     * @param remark  null
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.SEND_STATE：null
     */
    public Integer getSendState() {
        return sendState;
    }

    /**
     * set method 
     *
     * @param sendState  null
     */
    public void setSendState(Integer sendState) {
        this.sendState = sendState;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAY_TYPE：null
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * set method 
     *
     * @param payType  null
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.GENERAL_INTEGRAL：null
     */
    public Long getGeneralIntegral() {
        return generalIntegral;
    }

    /**
     * set method 
     *
     * @param generalIntegral  null
     */
    public void setGeneralIntegral(Long generalIntegral) {
        this.generalIntegral = generalIntegral;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.GENERAL_INTEGRAL_AMT：null
     */
    public BigDecimal getGeneralIntegralAmt() {
        return generalIntegralAmt;
    }

    /**
     * set method 
     *
     * @param generalIntegralAmt  null
     */
    public void setGeneralIntegralAmt(BigDecimal generalIntegralAmt) {
        this.generalIntegralAmt = generalIntegralAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.RED_PACKET_AMT：null
     */
    public BigDecimal getRedPacketAmt() {
        return redPacketAmt;
    }

    /**
     * set method 
     *
     * @param redPacketAmt  null
     */
    public void setRedPacketAmt(BigDecimal redPacketAmt) {
        this.redPacketAmt = redPacketAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.TXN_TOTAL_AMT：null
     */
    public BigDecimal getTxnTotalAmt() {
        return txnTotalAmt;
    }

    /**
     * set method 
     *
     * @param txnTotalAmt  null
     */
    public void setTxnTotalAmt(BigDecimal txnTotalAmt) {
        this.txnTotalAmt = txnTotalAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.GUEST_INTEGRAL：null
     */
    public Long getGuestIntegral() {
        return guestIntegral;
    }

    /**
     * set method 
     *
     * @param guestIntegral  null
     */
    public void setGuestIntegral(Long guestIntegral) {
        this.guestIntegral = guestIntegral;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.GUEST_INTEGRAL_AMT：null
     */
    public BigDecimal getGuestIntegralAmt() {
        return guestIntegralAmt;
    }

    /**
     * set method 
     *
     * @param guestIntegralAmt  null
     */
    public void setGuestIntegralAmt(BigDecimal guestIntegralAmt) {
        this.guestIntegralAmt = guestIntegralAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.BLUE_CARD_NUMBERS：null
     */
    public Long getBlueCardNumbers() {
        return blueCardNumbers;
    }

    /**
     * set method 
     *
     * @param blueCardNumbers  null
     */
    public void setBlueCardNumbers(Long blueCardNumbers) {
        this.blueCardNumbers = blueCardNumbers;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAYER_ID_TYPE：null
     */
    public String getPayerIdType() {
        return payerIdType;
    }

    /**
     * set method 
     *
     * @param payerIdType  null
     */
    public void setPayerIdType(String payerIdType) {
        this.payerIdType = payerIdType == null ? null : payerIdType.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAYER_ID_NO：null
     */
    public String getPayerIdNo() {
        return payerIdNo;
    }

    /**
     * set method 
     *
     * @param payerIdNo  null
     */
    public void setPayerIdNo(String payerIdNo) {
        this.payerIdNo = payerIdNo == null ? null : payerIdNo.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.PAYER_USRE_TYPE：null
     */
    public String getPayerUsreType() {
        return payerUsreType;
    }

    /**
     * set method 
     *
     * @param payerUsreType  null
     */
    public void setPayerUsreType(String payerUsreType) {
        this.payerUsreType = payerUsreType == null ? null : payerUsreType.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.CHECK_PWD：null
     */
    public String getCheckPwd() {
        return checkPwd;
    }

    /**
     * set method 
     *
     * @param checkPwd  null
     */
    public void setCheckPwd(String checkPwd) {
        this.checkPwd = checkPwd == null ? null : checkPwd.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.SIGN_FLAG：null
     */
    public String getSignFlag() {
        return signFlag;
    }

    /**
     * set method 
     *
     * @param signFlag  null
     */
    public void setSignFlag(String signFlag) {
        this.signFlag = signFlag == null ? null : signFlag.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.TOWN_INTEGRAL_XA：null
     */
    public Long getTownIntegralXa() {
        return townIntegralXa;
    }

    /**
     * set method 
     *
     * @param townIntegralXa  null
     */
    public void setTownIntegralXa(Long townIntegralXa) {
        this.townIntegralXa = townIntegralXa;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.TOWN_INTEGRAL_XA_AMT：null
     */
    public BigDecimal getTownIntegralXaAmt() {
        return townIntegralXaAmt;
    }

    /**
     * set method 
     *
     * @param townIntegralXaAmt  null
     */
    public void setTownIntegralXaAmt(BigDecimal townIntegralXaAmt) {
        this.townIntegralXaAmt = townIntegralXaAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.TOWN_INTEGRAL_TX：null
     */
    public Long getTownIntegralTx() {
        return townIntegralTx;
    }

    /**
     * set method 
     *
     * @param townIntegralTx  null
     */
    public void setTownIntegralTx(Long townIntegralTx) {
        this.townIntegralTx = townIntegralTx;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.TOWN_INTEGRAL_TX_AMT：null
     */
    public BigDecimal getTownIntegralTxAmt() {
        return townIntegralTxAmt;
    }

    /**
     * set method 
     *
     * @param townIntegralTxAmt  null
     */
    public void setTownIntegralTxAmt(BigDecimal townIntegralTxAmt) {
        this.townIntegralTxAmt = townIntegralTxAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.TOWN_INTEGRAL_HX：null
     */
    public Long getTownIntegralHx() {
        return townIntegralHx;
    }

    /**
     * set method 
     *
     * @param townIntegralHx  null
     */
    public void setTownIntegralHx(Long townIntegralHx) {
        this.townIntegralHx = townIntegralHx;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.TOWN_INTEGRAL_HX_AMT：null
     */
    public BigDecimal getTownIntegralHxAmt() {
        return townIntegralHxAmt;
    }

    /**
     * set method 
     *
     * @param townIntegralHxAmt  null
     */
    public void setTownIntegralHxAmt(BigDecimal townIntegralHxAmt) {
        this.townIntegralHxAmt = townIntegralHxAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.TOWN_INTEGRAL_RX：null
     */
    public Long getTownIntegralRx() {
        return townIntegralRx;
    }

    /**
     * set method 
     *
     * @param townIntegralRx  null
     */
    public void setTownIntegralRx(Long townIntegralRx) {
        this.townIntegralRx = townIntegralRx;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.TOWN_INTEGRAL_RX_AMT：null
     */
    public BigDecimal getTownIntegralRxAmt() {
        return townIntegralRxAmt;
    }

    /**
     * set method 
     *
     * @param townIntegralRxAmt  null
     */
    public void setTownIntegralRxAmt(BigDecimal townIntegralRxAmt) {
        this.townIntegralRxAmt = townIntegralRxAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.TOWN_INTEGRAL_BA：null
     */
    public Long getTownIntegralBa() {
        return townIntegralBa;
    }

    /**
     * set method 
     *
     * @param townIntegralBa  null
     */
    public void setTownIntegralBa(Long townIntegralBa) {
        this.townIntegralBa = townIntegralBa;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.TOWN_INTEGRAL_BA_AMT：null
     */
    public BigDecimal getTownIntegralBaAmt() {
        return townIntegralBaAmt;
    }

    /**
     * set method 
     *
     * @param townIntegralBaAmt  null
     */
    public void setTownIntegralBaAmt(BigDecimal townIntegralBaAmt) {
        this.townIntegralBaAmt = townIntegralBaAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.TOWN_INTEGRAL_GP：null
     */
    public Long getTownIntegralGp() {
        return townIntegralGp;
    }

    /**
     * set method 
     *
     * @param townIntegralGp  null
     */
    public void setTownIntegralGp(Long townIntegralGp) {
        this.townIntegralGp = townIntegralGp;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.TOWN_INTEGRAL_GP_AMT：null
     */
    public BigDecimal getTownIntegralGpAmt() {
        return townIntegralGpAmt;
    }

    /**
     * set method 
     *
     * @param townIntegralGpAmt  null
     */
    public void setTownIntegralGpAmt(BigDecimal townIntegralGpAmt) {
        this.townIntegralGpAmt = townIntegralGpAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.TOWN_INTEGRAL_PN：null
     */
    public Long getTownIntegralPn() {
        return townIntegralPn;
    }

    /**
     * set method 
     *
     * @param townIntegralPn  null
     */
    public void setTownIntegralPn(Long townIntegralPn) {
        this.townIntegralPn = townIntegralPn;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_PAY_BILL.TOWN_INTEGRAL_PN_AMT：null
     */
    public BigDecimal getTownIntegralPnAmt() {
        return townIntegralPnAmt;
    }

    /**
     * set method 
     *
     * @param townIntegralPnAmt  null
     */
    public void setTownIntegralPnAmt(BigDecimal townIntegralPnAmt) {
        this.townIntegralPnAmt = townIntegralPnAmt;
    }

    /**
     *
     * @param that
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Ip_pay_bill other = (Ip_pay_bill) that;
        return (this.getLogNo() == null ? other.getLogNo() == null : this.getLogNo().equals(other.getLogNo()))
            && (this.getBusNo() == null ? other.getBusNo() == null : this.getBusNo().equals(other.getBusNo()))
            && (this.getAcDt() == null ? other.getAcDt() == null : this.getAcDt().equals(other.getAcDt()))
            && (this.getAcTm() == null ? other.getAcTm() == null : this.getAcTm().equals(other.getAcTm()))
            && (this.getTranType() == null ? other.getTranType() == null : this.getTranType().equals(other.getTranType()))
            && (this.getTxnSts() == null ? other.getTxnSts() == null : this.getTxnSts().equals(other.getTxnSts()))
            && (this.getPayAmt() == null ? other.getPayAmt() == null : this.getPayAmt().equals(other.getPayAmt()))
            && (this.getTxnAmt() == null ? other.getTxnAmt() == null : this.getTxnAmt().equals(other.getTxnAmt()))
            && (this.getOacDt() == null ? other.getOacDt() == null : this.getOacDt().equals(other.getOacDt()))
            && (this.getOlogNo() == null ? other.getOlogNo() == null : this.getOlogNo().equals(other.getOlogNo()))
            && (this.getOrnOrderId() == null ? other.getOrnOrderId() == null : this.getOrnOrderId().equals(other.getOrnOrderId()))
            && (this.getCheckDt() == null ? other.getCheckDt() == null : this.getCheckDt().equals(other.getCheckDt()))
            && (this.getCheckState() == null ? other.getCheckState() == null : this.getCheckState().equals(other.getCheckState()))
            && (this.getPayMethod() == null ? other.getPayMethod() == null : this.getPayMethod().equals(other.getPayMethod()))
            && (this.getPayChannelNo() == null ? other.getPayChannelNo() == null : this.getPayChannelNo().equals(other.getPayChannelNo()))
            && (this.getCcNo() == null ? other.getCcNo() == null : this.getCcNo().equals(other.getCcNo()))
            && (this.getSrcCustid() == null ? other.getSrcCustid() == null : this.getSrcCustid().equals(other.getSrcCustid()))
            && (this.getSrcCustname() == null ? other.getSrcCustname() == null : this.getSrcCustname().equals(other.getSrcCustname()))
            && (this.getPayerBankcode() == null ? other.getPayerBankcode() == null : this.getPayerBankcode().equals(other.getPayerBankcode()))
            && (this.getPayerCustid() == null ? other.getPayerCustid() == null : this.getPayerCustid().equals(other.getPayerCustid()))
            && (this.getPayerCustname() == null ? other.getPayerCustname() == null : this.getPayerCustname().equals(other.getPayerCustname()))
            && (this.getPayerPaytype() == null ? other.getPayerPaytype() == null : this.getPayerPaytype().equals(other.getPayerPaytype()))
            && (this.getPayerBankCardno() == null ? other.getPayerBankCardno() == null : this.getPayerBankCardno().equals(other.getPayerBankCardno()))
            && (this.getPayerBankaccountName() == null ? other.getPayerBankaccountName() == null : this.getPayerBankaccountName().equals(other.getPayerBankaccountName()))
            && (this.getPayerBankaccountType() == null ? other.getPayerBankaccountType() == null : this.getPayerBankaccountType().equals(other.getPayerBankaccountType()))
            && (this.getPayerBankname() == null ? other.getPayerBankname() == null : this.getPayerBankname().equals(other.getPayerBankname()))
            && (this.getPayerBanktype() == null ? other.getPayerBanktype() == null : this.getPayerBanktype().equals(other.getPayerBanktype()))
            && (this.getPayerBankaddr() == null ? other.getPayerBankaddr() == null : this.getPayerBankaddr().equals(other.getPayerBankaddr()))
            && (this.getPayeeCustid() == null ? other.getPayeeCustid() == null : this.getPayeeCustid().equals(other.getPayeeCustid()))
            && (this.getPayeeCustname() == null ? other.getPayeeCustname() == null : this.getPayeeCustname().equals(other.getPayeeCustname()))
            && (this.getPayeeBankaccountNo() == null ? other.getPayeeBankaccountNo() == null : this.getPayeeBankaccountNo().equals(other.getPayeeBankaccountNo()))
            && (this.getPayeeBankaccountName() == null ? other.getPayeeBankaccountName() == null : this.getPayeeBankaccountName().equals(other.getPayeeBankaccountName()))
            && (this.getPayeeBankaccountType() == null ? other.getPayeeBankaccountType() == null : this.getPayeeBankaccountType().equals(other.getPayeeBankaccountType()))
            && (this.getPayeeBankcode() == null ? other.getPayeeBankcode() == null : this.getPayeeBankcode().equals(other.getPayeeBankcode()))
            && (this.getPayeeBankname() == null ? other.getPayeeBankname() == null : this.getPayeeBankname().equals(other.getPayeeBankname()))
            && (this.getPayeeBanktype() == null ? other.getPayeeBanktype() == null : this.getPayeeBanktype().equals(other.getPayeeBanktype()))
            && (this.getPayeeBankaddr() == null ? other.getPayeeBankaddr() == null : this.getPayeeBankaddr().equals(other.getPayeeBankaddr()))
            && (this.getChanSrefNo() == null ? other.getChanSrefNo() == null : this.getChanSrefNo().equals(other.getChanSrefNo()))
            && (this.getChanResultCode() == null ? other.getChanResultCode() == null : this.getChanResultCode().equals(other.getChanResultCode()))
            && (this.getExpireTime() == null ? other.getExpireTime() == null : this.getExpireTime().equals(other.getExpireTime()))
            && (this.getLastUpdateTm() == null ? other.getLastUpdateTm() == null : this.getLastUpdateTm().equals(other.getLastUpdateTm()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getSendState() == null ? other.getSendState() == null : this.getSendState().equals(other.getSendState()))
            && (this.getPayType() == null ? other.getPayType() == null : this.getPayType().equals(other.getPayType()))
            && (this.getGeneralIntegral() == null ? other.getGeneralIntegral() == null : this.getGeneralIntegral().equals(other.getGeneralIntegral()))
            && (this.getGeneralIntegralAmt() == null ? other.getGeneralIntegralAmt() == null : this.getGeneralIntegralAmt().equals(other.getGeneralIntegralAmt()))
            && (this.getRedPacketAmt() == null ? other.getRedPacketAmt() == null : this.getRedPacketAmt().equals(other.getRedPacketAmt()))
            && (this.getTxnTotalAmt() == null ? other.getTxnTotalAmt() == null : this.getTxnTotalAmt().equals(other.getTxnTotalAmt()))
            && (this.getGuestIntegral() == null ? other.getGuestIntegral() == null : this.getGuestIntegral().equals(other.getGuestIntegral()))
            && (this.getGuestIntegralAmt() == null ? other.getGuestIntegralAmt() == null : this.getGuestIntegralAmt().equals(other.getGuestIntegralAmt()))
            && (this.getBlueCardNumbers() == null ? other.getBlueCardNumbers() == null : this.getBlueCardNumbers().equals(other.getBlueCardNumbers()))
            && (this.getPayerIdType() == null ? other.getPayerIdType() == null : this.getPayerIdType().equals(other.getPayerIdType()))
            && (this.getPayerIdNo() == null ? other.getPayerIdNo() == null : this.getPayerIdNo().equals(other.getPayerIdNo()))
            && (this.getPayerUsreType() == null ? other.getPayerUsreType() == null : this.getPayerUsreType().equals(other.getPayerUsreType()))
            && (this.getCheckPwd() == null ? other.getCheckPwd() == null : this.getCheckPwd().equals(other.getCheckPwd()))
            && (this.getSignFlag() == null ? other.getSignFlag() == null : this.getSignFlag().equals(other.getSignFlag()))
            && (this.getTownIntegralXa() == null ? other.getTownIntegralXa() == null : this.getTownIntegralXa().equals(other.getTownIntegralXa()))
            && (this.getTownIntegralXaAmt() == null ? other.getTownIntegralXaAmt() == null : this.getTownIntegralXaAmt().equals(other.getTownIntegralXaAmt()))
            && (this.getTownIntegralTx() == null ? other.getTownIntegralTx() == null : this.getTownIntegralTx().equals(other.getTownIntegralTx()))
            && (this.getTownIntegralTxAmt() == null ? other.getTownIntegralTxAmt() == null : this.getTownIntegralTxAmt().equals(other.getTownIntegralTxAmt()))
            && (this.getTownIntegralHx() == null ? other.getTownIntegralHx() == null : this.getTownIntegralHx().equals(other.getTownIntegralHx()))
            && (this.getTownIntegralHxAmt() == null ? other.getTownIntegralHxAmt() == null : this.getTownIntegralHxAmt().equals(other.getTownIntegralHxAmt()))
            && (this.getTownIntegralRx() == null ? other.getTownIntegralRx() == null : this.getTownIntegralRx().equals(other.getTownIntegralRx()))
            && (this.getTownIntegralRxAmt() == null ? other.getTownIntegralRxAmt() == null : this.getTownIntegralRxAmt().equals(other.getTownIntegralRxAmt()))
            && (this.getTownIntegralBa() == null ? other.getTownIntegralBa() == null : this.getTownIntegralBa().equals(other.getTownIntegralBa()))
            && (this.getTownIntegralBaAmt() == null ? other.getTownIntegralBaAmt() == null : this.getTownIntegralBaAmt().equals(other.getTownIntegralBaAmt()))
            && (this.getTownIntegralGp() == null ? other.getTownIntegralGp() == null : this.getTownIntegralGp().equals(other.getTownIntegralGp()))
            && (this.getTownIntegralGpAmt() == null ? other.getTownIntegralGpAmt() == null : this.getTownIntegralGpAmt().equals(other.getTownIntegralGpAmt()))
            && (this.getTownIntegralPn() == null ? other.getTownIntegralPn() == null : this.getTownIntegralPn().equals(other.getTownIntegralPn()))
            && (this.getTownIntegralPnAmt() == null ? other.getTownIntegralPnAmt() == null : this.getTownIntegralPnAmt().equals(other.getTownIntegralPnAmt()));
    }

    /**
     *
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogNo() == null) ? 0 : getLogNo().hashCode());
        result = prime * result + ((getBusNo() == null) ? 0 : getBusNo().hashCode());
        result = prime * result + ((getAcDt() == null) ? 0 : getAcDt().hashCode());
        result = prime * result + ((getAcTm() == null) ? 0 : getAcTm().hashCode());
        result = prime * result + ((getTranType() == null) ? 0 : getTranType().hashCode());
        result = prime * result + ((getTxnSts() == null) ? 0 : getTxnSts().hashCode());
        result = prime * result + ((getPayAmt() == null) ? 0 : getPayAmt().hashCode());
        result = prime * result + ((getTxnAmt() == null) ? 0 : getTxnAmt().hashCode());
        result = prime * result + ((getOacDt() == null) ? 0 : getOacDt().hashCode());
        result = prime * result + ((getOlogNo() == null) ? 0 : getOlogNo().hashCode());
        result = prime * result + ((getOrnOrderId() == null) ? 0 : getOrnOrderId().hashCode());
        result = prime * result + ((getCheckDt() == null) ? 0 : getCheckDt().hashCode());
        result = prime * result + ((getCheckState() == null) ? 0 : getCheckState().hashCode());
        result = prime * result + ((getPayMethod() == null) ? 0 : getPayMethod().hashCode());
        result = prime * result + ((getPayChannelNo() == null) ? 0 : getPayChannelNo().hashCode());
        result = prime * result + ((getCcNo() == null) ? 0 : getCcNo().hashCode());
        result = prime * result + ((getSrcCustid() == null) ? 0 : getSrcCustid().hashCode());
        result = prime * result + ((getSrcCustname() == null) ? 0 : getSrcCustname().hashCode());
        result = prime * result + ((getPayerBankcode() == null) ? 0 : getPayerBankcode().hashCode());
        result = prime * result + ((getPayerCustid() == null) ? 0 : getPayerCustid().hashCode());
        result = prime * result + ((getPayerCustname() == null) ? 0 : getPayerCustname().hashCode());
        result = prime * result + ((getPayerPaytype() == null) ? 0 : getPayerPaytype().hashCode());
        result = prime * result + ((getPayerBankCardno() == null) ? 0 : getPayerBankCardno().hashCode());
        result = prime * result + ((getPayerBankaccountName() == null) ? 0 : getPayerBankaccountName().hashCode());
        result = prime * result + ((getPayerBankaccountType() == null) ? 0 : getPayerBankaccountType().hashCode());
        result = prime * result + ((getPayerBankname() == null) ? 0 : getPayerBankname().hashCode());
        result = prime * result + ((getPayerBanktype() == null) ? 0 : getPayerBanktype().hashCode());
        result = prime * result + ((getPayerBankaddr() == null) ? 0 : getPayerBankaddr().hashCode());
        result = prime * result + ((getPayeeCustid() == null) ? 0 : getPayeeCustid().hashCode());
        result = prime * result + ((getPayeeCustname() == null) ? 0 : getPayeeCustname().hashCode());
        result = prime * result + ((getPayeeBankaccountNo() == null) ? 0 : getPayeeBankaccountNo().hashCode());
        result = prime * result + ((getPayeeBankaccountName() == null) ? 0 : getPayeeBankaccountName().hashCode());
        result = prime * result + ((getPayeeBankaccountType() == null) ? 0 : getPayeeBankaccountType().hashCode());
        result = prime * result + ((getPayeeBankcode() == null) ? 0 : getPayeeBankcode().hashCode());
        result = prime * result + ((getPayeeBankname() == null) ? 0 : getPayeeBankname().hashCode());
        result = prime * result + ((getPayeeBanktype() == null) ? 0 : getPayeeBanktype().hashCode());
        result = prime * result + ((getPayeeBankaddr() == null) ? 0 : getPayeeBankaddr().hashCode());
        result = prime * result + ((getChanSrefNo() == null) ? 0 : getChanSrefNo().hashCode());
        result = prime * result + ((getChanResultCode() == null) ? 0 : getChanResultCode().hashCode());
        result = prime * result + ((getExpireTime() == null) ? 0 : getExpireTime().hashCode());
        result = prime * result + ((getLastUpdateTm() == null) ? 0 : getLastUpdateTm().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getSendState() == null) ? 0 : getSendState().hashCode());
        result = prime * result + ((getPayType() == null) ? 0 : getPayType().hashCode());
        result = prime * result + ((getGeneralIntegral() == null) ? 0 : getGeneralIntegral().hashCode());
        result = prime * result + ((getGeneralIntegralAmt() == null) ? 0 : getGeneralIntegralAmt().hashCode());
        result = prime * result + ((getRedPacketAmt() == null) ? 0 : getRedPacketAmt().hashCode());
        result = prime * result + ((getTxnTotalAmt() == null) ? 0 : getTxnTotalAmt().hashCode());
        result = prime * result + ((getGuestIntegral() == null) ? 0 : getGuestIntegral().hashCode());
        result = prime * result + ((getGuestIntegralAmt() == null) ? 0 : getGuestIntegralAmt().hashCode());
        result = prime * result + ((getBlueCardNumbers() == null) ? 0 : getBlueCardNumbers().hashCode());
        result = prime * result + ((getPayerIdType() == null) ? 0 : getPayerIdType().hashCode());
        result = prime * result + ((getPayerIdNo() == null) ? 0 : getPayerIdNo().hashCode());
        result = prime * result + ((getPayerUsreType() == null) ? 0 : getPayerUsreType().hashCode());
        result = prime * result + ((getCheckPwd() == null) ? 0 : getCheckPwd().hashCode());
        result = prime * result + ((getSignFlag() == null) ? 0 : getSignFlag().hashCode());
        result = prime * result + ((getTownIntegralXa() == null) ? 0 : getTownIntegralXa().hashCode());
        result = prime * result + ((getTownIntegralXaAmt() == null) ? 0 : getTownIntegralXaAmt().hashCode());
        result = prime * result + ((getTownIntegralTx() == null) ? 0 : getTownIntegralTx().hashCode());
        result = prime * result + ((getTownIntegralTxAmt() == null) ? 0 : getTownIntegralTxAmt().hashCode());
        result = prime * result + ((getTownIntegralHx() == null) ? 0 : getTownIntegralHx().hashCode());
        result = prime * result + ((getTownIntegralHxAmt() == null) ? 0 : getTownIntegralHxAmt().hashCode());
        result = prime * result + ((getTownIntegralRx() == null) ? 0 : getTownIntegralRx().hashCode());
        result = prime * result + ((getTownIntegralRxAmt() == null) ? 0 : getTownIntegralRxAmt().hashCode());
        result = prime * result + ((getTownIntegralBa() == null) ? 0 : getTownIntegralBa().hashCode());
        result = prime * result + ((getTownIntegralBaAmt() == null) ? 0 : getTownIntegralBaAmt().hashCode());
        result = prime * result + ((getTownIntegralGp() == null) ? 0 : getTownIntegralGp().hashCode());
        result = prime * result + ((getTownIntegralGpAmt() == null) ? 0 : getTownIntegralGpAmt().hashCode());
        result = prime * result + ((getTownIntegralPn() == null) ? 0 : getTownIntegralPn().hashCode());
        result = prime * result + ((getTownIntegralPnAmt() == null) ? 0 : getTownIntegralPnAmt().hashCode());
        return result;
    }
}