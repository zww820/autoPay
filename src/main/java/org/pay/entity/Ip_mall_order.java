package org.pay.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Ip_mall_order implements Serializable {
    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : ORDER_ID
     */
    private String orderId;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : MERC_ID
     */
    private String mercId;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : AC_DT
     */
    private String acDt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : AC_TM
     */
    private Date acTm;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : FINISH_DT
     */
    private String finishDt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : FINISH_TIME
     */
    private Date finishTime;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : MERC_NAME
     */
    private String mercName;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : TOTAL_AMT
     */
    private BigDecimal totalAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : OLD_PAY_AMT
     */
    private BigDecimal oldPayAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : PAY_AMT
     */
    private BigDecimal payAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : ALREADY_REFUND_AMT
     */
    private BigDecimal alreadyRefundAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : DISCOUNT_AMT
     */
    private BigDecimal discountAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : SHIPPINGFEE_AMT
     */
    private BigDecimal shippingfeeAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : CLE_DT
     */
    private String cleDt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : CLE_TM
     */
    private Date cleTm;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : CLE_STATE
     */
    private Integer cleState;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : MERC_SERVICE_AMT
     */
    private BigDecimal mercServiceAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : CLE_SCENE_NO
     */
    private String cleSceneNo;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : STL_BILL_NO
     */
    private String stlBillNo;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : STL_STATE
     */
    private Integer stlState;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : STL_AMT
     */
    private BigDecimal stlAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : STL_DATE
     */
    private String stlDate;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : REFUND_STATE
     */
    private Integer refundState;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : CHECK_STATE
     */
    private Integer checkState;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : CHECK_DT
     */
    private String checkDt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : PAY_LOG_NO
     */
    private String payLogNo;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : REMARK
     */
    private String remark;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : PAY_TYPE
     */
    private Integer payType;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : GENERAL_INTEGRAL
     */
    private Long generalIntegral;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : GENERAL_INTEGRAL_AMT
     */
    private BigDecimal generalIntegralAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : OLD_GENERAL_INTEGRAL
     */
    private Long oldGeneralIntegral;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : OLD_GENERAL_INTEGRAL_AMT
     */
    private BigDecimal oldGeneralIntegralAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : REFUND_GENERAL_INTEGRAL
     */
    private Long refundGeneralIntegral;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : REFUND_GENERAL_INTEGRAL_AMT
     */
    private BigDecimal refundGeneralIntegralAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : RED_PACKET_AMT
     */
    private BigDecimal redPacketAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : OLD_RED_PACKET_AMT
     */
    private BigDecimal oldRedPacketAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : REFUND_RED_PACKET_AMT
     */
    private BigDecimal refundRedPacketAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : TXN_STS
     */
    private Integer txnSts;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : GUEST_INTEGRAL
     */
    private Long guestIntegral;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : GUEST_INTEGRAL_AMT
     */
    private BigDecimal guestIntegralAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : OLD_GUEST_INTEGRAL
     */
    private Long oldGuestIntegral;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : OLD_GUEST_INTEGRAL_AMT
     */
    private BigDecimal oldGuestIntegralAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : REFUND_GUEST_INTEGRAL
     */
    private Long refundGuestIntegral;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : REFUND_GUEST_INTEGRAL_AMT
     */
    private BigDecimal refundGuestIntegralAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : TOWN_INTEGRAL_XA
     */
    private Long townIntegralXa;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : TOWN_INTEGRAL_XA_AMT
     */
    private BigDecimal townIntegralXaAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : OLD_TOWN_INTEGRAL_XA
     */
    private Long oldTownIntegralXa;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : OLD_TOWN_INTEGRAL_XA_AMT
     */
    private BigDecimal oldTownIntegralXaAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : REFUND_TOWN_INTEGRAL_XA
     */
    private Long refundTownIntegralXa;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : REFUND_TOWN_INTEGRAL_XA_AMT
     */
    private BigDecimal refundTownIntegralXaAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : TOWN_INTEGRAL_TX
     */
    private Long townIntegralTx;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : TOWN_INTEGRAL_TX_AMT
     */
    private BigDecimal townIntegralTxAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : OLD_TOWN_INTEGRAL_TX
     */
    private Long oldTownIntegralTx;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : OLD_TOWN_INTEGRAL_TX_AMT
     */
    private BigDecimal oldTownIntegralTxAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : REFUND_TOWN_INTEGRAL_TX
     */
    private Long refundTownIntegralTx;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : REFUND_TOWN_INTEGRAL_TX_AMT
     */
    private BigDecimal refundTownIntegralTxAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : TOWN_INTEGRAL_HX
     */
    private Long townIntegralHx;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : TOWN_INTEGRAL_HX_AMT
     */
    private BigDecimal townIntegralHxAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : OLD_TOWN_INTEGRAL_HX
     */
    private Long oldTownIntegralHx;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : OLD_TOWN_INTEGRAL_HX_AMT
     */
    private BigDecimal oldTownIntegralHxAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : REFUND_TOWN_INTEGRAL_HX
     */
    private Long refundTownIntegralHx;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : REFUND_TOWN_INTEGRAL_HX_AMT
     */
    private BigDecimal refundTownIntegralHxAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : TOWN_INTEGRAL_RX
     */
    private Long townIntegralRx;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : TOWN_INTEGRAL_RX_AMT
     */
    private BigDecimal townIntegralRxAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : OLD_TOWN_INTEGRAL_RX
     */
    private Long oldTownIntegralRx;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : OLD_TOWN_INTEGRAL_RX_AMT
     */
    private BigDecimal oldTownIntegralRxAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : REFUND_TOWN_INTEGRAL_RX
     */
    private Long refundTownIntegralRx;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : REFUND_TOWN_INTEGRAL_RX_AMT
     */
    private BigDecimal refundTownIntegralRxAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : TOWN_INTEGRAL_BA
     */
    private Long townIntegralBa;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : TOWN_INTEGRAL_BA_AMT
     */
    private BigDecimal townIntegralBaAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : OLD_TOWN_INTEGRAL_BA
     */
    private Long oldTownIntegralBa;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : OLD_TOWN_INTEGRAL_BA_AMT
     */
    private BigDecimal oldTownIntegralBaAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : REFUND_TOWN_INTEGRAL_BA
     */
    private Integer refundTownIntegralBa;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : REFUND_TOWN_INTEGRAL_BA_AMT
     */
    private BigDecimal refundTownIntegralBaAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : TOWN_INTEGRAL_GP
     */
    private Long townIntegralGp;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : TOWN_INTEGRAL_GP_AMT
     */
    private BigDecimal townIntegralGpAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : OLD_TOWN_INTEGRAL_GP
     */
    private Long oldTownIntegralGp;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : OLD_TOWN_INTEGRAL_GP_AMT
     */
    private BigDecimal oldTownIntegralGpAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : REFUND_TOWN_INTEGRAL_GP
     */
    private Integer refundTownIntegralGp;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : REFUND_TOWN_INTEGRAL_GP_AMT
     */
    private BigDecimal refundTownIntegralGpAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : TOWN_INTEGRAL_PN
     */
    private Long townIntegralPn;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : TOWN_INTEGRAL_PN_AMT
     */
    private BigDecimal townIntegralPnAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : OLD_TOWN_INTEGRAL_PN
     */
    private Long oldTownIntegralPn;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : OLD_TOWN_INTEGRAL_PN_AMT
     */
    private BigDecimal oldTownIntegralPnAmt;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : REFUND_TOWN_INTEGRAL_PN
     */
    private Integer refundTownIntegralPn;

    /**
     * 表 : IECPAY.IP_MALL_ORDER
     * 对应字段 : REFUND_TOWN_INTEGRAL_PN_AMT
     */
    private BigDecimal refundTownIntegralPnAmt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table IECPAY.IP_MALL_ORDER
     *
     * @MBG Generated Mon May 15 19:01:43 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.ORDER_ID：null
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * set method 
     *
     * @param orderId  null
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.MERC_ID：null
     */
    public String getMercId() {
        return mercId;
    }

    /**
     * set method 
     *
     * @param mercId  null
     */
    public void setMercId(String mercId) {
        this.mercId = mercId == null ? null : mercId.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.AC_DT：null
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
     * @return IECPAY.IP_MALL_ORDER.AC_TM：null
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
     * @return IECPAY.IP_MALL_ORDER.FINISH_DT：null
     */
    public String getFinishDt() {
        return finishDt;
    }

    /**
     * set method 
     *
     * @param finishDt  null
     */
    public void setFinishDt(String finishDt) {
        this.finishDt = finishDt == null ? null : finishDt.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.FINISH_TIME：null
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * set method 
     *
     * @param finishTime  null
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.MERC_NAME：null
     */
    public String getMercName() {
        return mercName;
    }

    /**
     * set method 
     *
     * @param mercName  null
     */
    public void setMercName(String mercName) {
        this.mercName = mercName == null ? null : mercName.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.TOTAL_AMT：null
     */
    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    /**
     * set method 
     *
     * @param totalAmt  null
     */
    public void setTotalAmt(BigDecimal totalAmt) {
        this.totalAmt = totalAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.OLD_PAY_AMT：null
     */
    public BigDecimal getOldPayAmt() {
        return oldPayAmt;
    }

    /**
     * set method 
     *
     * @param oldPayAmt  null
     */
    public void setOldPayAmt(BigDecimal oldPayAmt) {
        this.oldPayAmt = oldPayAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.PAY_AMT：null
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
     * @return IECPAY.IP_MALL_ORDER.ALREADY_REFUND_AMT：null
     */
    public BigDecimal getAlreadyRefundAmt() {
        return alreadyRefundAmt;
    }

    /**
     * set method 
     *
     * @param alreadyRefundAmt  null
     */
    public void setAlreadyRefundAmt(BigDecimal alreadyRefundAmt) {
        this.alreadyRefundAmt = alreadyRefundAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.DISCOUNT_AMT：null
     */
    public BigDecimal getDiscountAmt() {
        return discountAmt;
    }

    /**
     * set method 
     *
     * @param discountAmt  null
     */
    public void setDiscountAmt(BigDecimal discountAmt) {
        this.discountAmt = discountAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.SHIPPINGFEE_AMT：null
     */
    public BigDecimal getShippingfeeAmt() {
        return shippingfeeAmt;
    }

    /**
     * set method 
     *
     * @param shippingfeeAmt  null
     */
    public void setShippingfeeAmt(BigDecimal shippingfeeAmt) {
        this.shippingfeeAmt = shippingfeeAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.CLE_DT：null
     */
    public String getCleDt() {
        return cleDt;
    }

    /**
     * set method 
     *
     * @param cleDt  null
     */
    public void setCleDt(String cleDt) {
        this.cleDt = cleDt == null ? null : cleDt.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.CLE_TM：null
     */
    public Date getCleTm() {
        return cleTm;
    }

    /**
     * set method 
     *
     * @param cleTm  null
     */
    public void setCleTm(Date cleTm) {
        this.cleTm = cleTm;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.CLE_STATE：null
     */
    public Integer getCleState() {
        return cleState;
    }

    /**
     * set method 
     *
     * @param cleState  null
     */
    public void setCleState(Integer cleState) {
        this.cleState = cleState;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.MERC_SERVICE_AMT：null
     */
    public BigDecimal getMercServiceAmt() {
        return mercServiceAmt;
    }

    /**
     * set method 
     *
     * @param mercServiceAmt  null
     */
    public void setMercServiceAmt(BigDecimal mercServiceAmt) {
        this.mercServiceAmt = mercServiceAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.CLE_SCENE_NO：null
     */
    public String getCleSceneNo() {
        return cleSceneNo;
    }

    /**
     * set method 
     *
     * @param cleSceneNo  null
     */
    public void setCleSceneNo(String cleSceneNo) {
        this.cleSceneNo = cleSceneNo == null ? null : cleSceneNo.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.STL_BILL_NO：null
     */
    public String getStlBillNo() {
        return stlBillNo;
    }

    /**
     * set method 
     *
     * @param stlBillNo  null
     */
    public void setStlBillNo(String stlBillNo) {
        this.stlBillNo = stlBillNo == null ? null : stlBillNo.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.STL_STATE：null
     */
    public Integer getStlState() {
        return stlState;
    }

    /**
     * set method 
     *
     * @param stlState  null
     */
    public void setStlState(Integer stlState) {
        this.stlState = stlState;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.STL_AMT：null
     */
    public BigDecimal getStlAmt() {
        return stlAmt;
    }

    /**
     * set method 
     *
     * @param stlAmt  null
     */
    public void setStlAmt(BigDecimal stlAmt) {
        this.stlAmt = stlAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.STL_DATE：null
     */
    public String getStlDate() {
        return stlDate;
    }

    /**
     * set method 
     *
     * @param stlDate  null
     */
    public void setStlDate(String stlDate) {
        this.stlDate = stlDate == null ? null : stlDate.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.REFUND_STATE：null
     */
    public Integer getRefundState() {
        return refundState;
    }

    /**
     * set method 
     *
     * @param refundState  null
     */
    public void setRefundState(Integer refundState) {
        this.refundState = refundState;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.CHECK_STATE：null
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
     * @return IECPAY.IP_MALL_ORDER.CHECK_DT：null
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
     * @return IECPAY.IP_MALL_ORDER.PAY_LOG_NO：null
     */
    public String getPayLogNo() {
        return payLogNo;
    }

    /**
     * set method 
     *
     * @param payLogNo  null
     */
    public void setPayLogNo(String payLogNo) {
        this.payLogNo = payLogNo == null ? null : payLogNo.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.REMARK：null
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
     * @return IECPAY.IP_MALL_ORDER.PAY_TYPE：null
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
     * @return IECPAY.IP_MALL_ORDER.GENERAL_INTEGRAL：null
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
     * @return IECPAY.IP_MALL_ORDER.GENERAL_INTEGRAL_AMT：null
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
     * @return IECPAY.IP_MALL_ORDER.OLD_GENERAL_INTEGRAL：null
     */
    public Long getOldGeneralIntegral() {
        return oldGeneralIntegral;
    }

    /**
     * set method 
     *
     * @param oldGeneralIntegral  null
     */
    public void setOldGeneralIntegral(Long oldGeneralIntegral) {
        this.oldGeneralIntegral = oldGeneralIntegral;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.OLD_GENERAL_INTEGRAL_AMT：null
     */
    public BigDecimal getOldGeneralIntegralAmt() {
        return oldGeneralIntegralAmt;
    }

    /**
     * set method 
     *
     * @param oldGeneralIntegralAmt  null
     */
    public void setOldGeneralIntegralAmt(BigDecimal oldGeneralIntegralAmt) {
        this.oldGeneralIntegralAmt = oldGeneralIntegralAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.REFUND_GENERAL_INTEGRAL：null
     */
    public Long getRefundGeneralIntegral() {
        return refundGeneralIntegral;
    }

    /**
     * set method 
     *
     * @param refundGeneralIntegral  null
     */
    public void setRefundGeneralIntegral(Long refundGeneralIntegral) {
        this.refundGeneralIntegral = refundGeneralIntegral;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.REFUND_GENERAL_INTEGRAL_AMT：null
     */
    public BigDecimal getRefundGeneralIntegralAmt() {
        return refundGeneralIntegralAmt;
    }

    /**
     * set method 
     *
     * @param refundGeneralIntegralAmt  null
     */
    public void setRefundGeneralIntegralAmt(BigDecimal refundGeneralIntegralAmt) {
        this.refundGeneralIntegralAmt = refundGeneralIntegralAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.RED_PACKET_AMT：null
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
     * @return IECPAY.IP_MALL_ORDER.OLD_RED_PACKET_AMT：null
     */
    public BigDecimal getOldRedPacketAmt() {
        return oldRedPacketAmt;
    }

    /**
     * set method 
     *
     * @param oldRedPacketAmt  null
     */
    public void setOldRedPacketAmt(BigDecimal oldRedPacketAmt) {
        this.oldRedPacketAmt = oldRedPacketAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.REFUND_RED_PACKET_AMT：null
     */
    public BigDecimal getRefundRedPacketAmt() {
        return refundRedPacketAmt;
    }

    /**
     * set method 
     *
     * @param refundRedPacketAmt  null
     */
    public void setRefundRedPacketAmt(BigDecimal refundRedPacketAmt) {
        this.refundRedPacketAmt = refundRedPacketAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.TXN_STS：null
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
     * @return IECPAY.IP_MALL_ORDER.GUEST_INTEGRAL：null
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
     * @return IECPAY.IP_MALL_ORDER.GUEST_INTEGRAL_AMT：null
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
     * @return IECPAY.IP_MALL_ORDER.OLD_GUEST_INTEGRAL：null
     */
    public Long getOldGuestIntegral() {
        return oldGuestIntegral;
    }

    /**
     * set method 
     *
     * @param oldGuestIntegral  null
     */
    public void setOldGuestIntegral(Long oldGuestIntegral) {
        this.oldGuestIntegral = oldGuestIntegral;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.OLD_GUEST_INTEGRAL_AMT：null
     */
    public BigDecimal getOldGuestIntegralAmt() {
        return oldGuestIntegralAmt;
    }

    /**
     * set method 
     *
     * @param oldGuestIntegralAmt  null
     */
    public void setOldGuestIntegralAmt(BigDecimal oldGuestIntegralAmt) {
        this.oldGuestIntegralAmt = oldGuestIntegralAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.REFUND_GUEST_INTEGRAL：null
     */
    public Long getRefundGuestIntegral() {
        return refundGuestIntegral;
    }

    /**
     * set method 
     *
     * @param refundGuestIntegral  null
     */
    public void setRefundGuestIntegral(Long refundGuestIntegral) {
        this.refundGuestIntegral = refundGuestIntegral;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.REFUND_GUEST_INTEGRAL_AMT：null
     */
    public BigDecimal getRefundGuestIntegralAmt() {
        return refundGuestIntegralAmt;
    }

    /**
     * set method 
     *
     * @param refundGuestIntegralAmt  null
     */
    public void setRefundGuestIntegralAmt(BigDecimal refundGuestIntegralAmt) {
        this.refundGuestIntegralAmt = refundGuestIntegralAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.TOWN_INTEGRAL_XA：null
     */
    public Long getTownIntegralXa() {
        return townIntegralXa;
    }

    /**
     * set method 
     *
     * @param townIntegralXa  null
     */
    public void setTownIntegralXa(long townIntegralXa) {
        this.townIntegralXa = townIntegralXa;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.TOWN_INTEGRAL_XA_AMT：null
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
     * @return IECPAY.IP_MALL_ORDER.OLD_TOWN_INTEGRAL_XA：null
     */
    public Long getOldTownIntegralXa() {
        return oldTownIntegralXa;
    }

    /**
     * set method 
     *
     * @param oldTownIntegralXa  null
     */
    public void setOldTownIntegralXa(Long oldTownIntegralXa) {
        this.oldTownIntegralXa = oldTownIntegralXa;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.OLD_TOWN_INTEGRAL_XA_AMT：null
     */
    public BigDecimal getOldTownIntegralXaAmt() {
        return oldTownIntegralXaAmt;
    }

    /**
     * set method 
     *
     * @param oldTownIntegralXaAmt  null
     */
    public void setOldTownIntegralXaAmt(BigDecimal oldTownIntegralXaAmt) {
        this.oldTownIntegralXaAmt = oldTownIntegralXaAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.REFUND_TOWN_INTEGRAL_XA：null
     */
    public Long getRefundTownIntegralXa() {
        return refundTownIntegralXa;
    }

    /**
     * set method 
     *
     * @param refundTownIntegralXa  null
     */
    public void setRefundTownIntegralXa(Long refundTownIntegralXa) {
        this.refundTownIntegralXa = refundTownIntegralXa;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.REFUND_TOWN_INTEGRAL_XA_AMT：null
     */
    public BigDecimal getRefundTownIntegralXaAmt() {
        return refundTownIntegralXaAmt;
    }

    /**
     * set method 
     *
     * @param refundTownIntegralXaAmt  null
     */
    public void setRefundTownIntegralXaAmt(BigDecimal refundTownIntegralXaAmt) {
        this.refundTownIntegralXaAmt = refundTownIntegralXaAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.TOWN_INTEGRAL_TX：null
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
     * @return IECPAY.IP_MALL_ORDER.TOWN_INTEGRAL_TX_AMT：null
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
     * @return IECPAY.IP_MALL_ORDER.OLD_TOWN_INTEGRAL_TX：null
     */
    public Long getOldTownIntegralTx() {
        return oldTownIntegralTx;
    }

    /**
     * set method 
     *
     * @param oldTownIntegralTx  null
     */
    public void setOldTownIntegralTx(Long oldTownIntegralTx) {
        this.oldTownIntegralTx = oldTownIntegralTx;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.OLD_TOWN_INTEGRAL_TX_AMT：null
     */
    public BigDecimal getOldTownIntegralTxAmt() {
        return oldTownIntegralTxAmt;
    }

    /**
     * set method 
     *
     * @param oldTownIntegralTxAmt  null
     */
    public void setOldTownIntegralTxAmt(BigDecimal oldTownIntegralTxAmt) {
        this.oldTownIntegralTxAmt = oldTownIntegralTxAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.REFUND_TOWN_INTEGRAL_TX：null
     */
    public Long getRefundTownIntegralTx() {
        return refundTownIntegralTx;
    }

    /**
     * set method 
     *
     * @param refundTownIntegralTx  null
     */
    public void setRefundTownIntegralTx(Long refundTownIntegralTx) {
        this.refundTownIntegralTx = refundTownIntegralTx;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.REFUND_TOWN_INTEGRAL_TX_AMT：null
     */
    public BigDecimal getRefundTownIntegralTxAmt() {
        return refundTownIntegralTxAmt;
    }

    /**
     * set method 
     *
     * @param refundTownIntegralTxAmt  null
     */
    public void setRefundTownIntegralTxAmt(BigDecimal refundTownIntegralTxAmt) {
        this.refundTownIntegralTxAmt = refundTownIntegralTxAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.TOWN_INTEGRAL_HX：null
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
     * @return IECPAY.IP_MALL_ORDER.TOWN_INTEGRAL_HX_AMT：null
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
     * @return IECPAY.IP_MALL_ORDER.OLD_TOWN_INTEGRAL_HX：null
     */
    public Long getOldTownIntegralHx() {
        return oldTownIntegralHx;
    }

    /**
     * set method 
     *
     * @param oldTownIntegralHx  null
     */
    public void setOldTownIntegralHx(Long oldTownIntegralHx) {
        this.oldTownIntegralHx = oldTownIntegralHx;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.OLD_TOWN_INTEGRAL_HX_AMT：null
     */
    public BigDecimal getOldTownIntegralHxAmt() {
        return oldTownIntegralHxAmt;
    }

    /**
     * set method 
     *
     * @param oldTownIntegralHxAmt  null
     */
    public void setOldTownIntegralHxAmt(BigDecimal oldTownIntegralHxAmt) {
        this.oldTownIntegralHxAmt = oldTownIntegralHxAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.REFUND_TOWN_INTEGRAL_HX：null
     */
    public Long getRefundTownIntegralHx() {
        return refundTownIntegralHx;
    }

    /**
     * set method 
     *
     * @param refundTownIntegralHx  null
     */
    public void setRefundTownIntegralHx(Long refundTownIntegralHx) {
        this.refundTownIntegralHx = refundTownIntegralHx;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.REFUND_TOWN_INTEGRAL_HX_AMT：null
     */
    public BigDecimal getRefundTownIntegralHxAmt() {
        return refundTownIntegralHxAmt;
    }

    /**
     * set method 
     *
     * @param refundTownIntegralHxAmt  null
     */
    public void setRefundTownIntegralHxAmt(BigDecimal refundTownIntegralHxAmt) {
        this.refundTownIntegralHxAmt = refundTownIntegralHxAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.TOWN_INTEGRAL_RX：null
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
     * @return IECPAY.IP_MALL_ORDER.TOWN_INTEGRAL_RX_AMT：null
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
     * @return IECPAY.IP_MALL_ORDER.OLD_TOWN_INTEGRAL_RX：null
     */
    public Long getOldTownIntegralRx() {
        return oldTownIntegralRx;
    }

    /**
     * set method 
     *
     * @param oldTownIntegralRx  null
     */
    public void setOldTownIntegralRx(Long oldTownIntegralRx) {
        this.oldTownIntegralRx = oldTownIntegralRx;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.OLD_TOWN_INTEGRAL_RX_AMT：null
     */
    public BigDecimal getOldTownIntegralRxAmt() {
        return oldTownIntegralRxAmt;
    }

    /**
     * set method 
     *
     * @param oldTownIntegralRxAmt  null
     */
    public void setOldTownIntegralRxAmt(BigDecimal oldTownIntegralRxAmt) {
        this.oldTownIntegralRxAmt = oldTownIntegralRxAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.REFUND_TOWN_INTEGRAL_RX：null
     */
    public Long getRefundTownIntegralRx() {
        return refundTownIntegralRx;
    }

    /**
     * set method 
     *
     * @param refundTownIntegralRx  null
     */
    public void setRefundTownIntegralRx(Long refundTownIntegralRx) {
        this.refundTownIntegralRx = refundTownIntegralRx;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.REFUND_TOWN_INTEGRAL_RX_AMT：null
     */
    public BigDecimal getRefundTownIntegralRxAmt() {
        return refundTownIntegralRxAmt;
    }

    /**
     * set method 
     *
     * @param refundTownIntegralRxAmt  null
     */
    public void setRefundTownIntegralRxAmt(BigDecimal refundTownIntegralRxAmt) {
        this.refundTownIntegralRxAmt = refundTownIntegralRxAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.TOWN_INTEGRAL_BA：null
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
     * @return IECPAY.IP_MALL_ORDER.TOWN_INTEGRAL_BA_AMT：null
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
     * @return IECPAY.IP_MALL_ORDER.OLD_TOWN_INTEGRAL_BA：null
     */
    public Long getOldTownIntegralBa() {
        return oldTownIntegralBa;
    }

    /**
     * set method 
     *
     * @param oldTownIntegralBa  null
     */
    public void setOldTownIntegralBa(Long oldTownIntegralBa) {
        this.oldTownIntegralBa = oldTownIntegralBa;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.OLD_TOWN_INTEGRAL_BA_AMT：null
     */
    public BigDecimal getOldTownIntegralBaAmt() {
        return oldTownIntegralBaAmt;
    }

    /**
     * set method 
     *
     * @param oldTownIntegralBaAmt  null
     */
    public void setOldTownIntegralBaAmt(BigDecimal oldTownIntegralBaAmt) {
        this.oldTownIntegralBaAmt = oldTownIntegralBaAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.REFUND_TOWN_INTEGRAL_BA：null
     */
    public Integer getRefundTownIntegralBa() {
        return refundTownIntegralBa;
    }

    /**
     * set method 
     *
     * @param refundTownIntegralBa  null
     */
    public void setRefundTownIntegralBa(Integer refundTownIntegralBa) {
        this.refundTownIntegralBa = refundTownIntegralBa;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.REFUND_TOWN_INTEGRAL_BA_AMT：null
     */
    public BigDecimal getRefundTownIntegralBaAmt() {
        return refundTownIntegralBaAmt;
    }

    /**
     * set method 
     *
     * @param refundTownIntegralBaAmt  null
     */
    public void setRefundTownIntegralBaAmt(BigDecimal refundTownIntegralBaAmt) {
        this.refundTownIntegralBaAmt = refundTownIntegralBaAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.TOWN_INTEGRAL_GP：null
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
     * @return IECPAY.IP_MALL_ORDER.TOWN_INTEGRAL_GP_AMT：null
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
     * @return IECPAY.IP_MALL_ORDER.OLD_TOWN_INTEGRAL_GP：null
     */
    public Long getOldTownIntegralGp() {
        return oldTownIntegralGp;
    }

    /**
     * set method 
     *
     * @param oldTownIntegralGp  null
     */
    public void setOldTownIntegralGp(Long oldTownIntegralGp) {
        this.oldTownIntegralGp = oldTownIntegralGp;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.OLD_TOWN_INTEGRAL_GP_AMT：null
     */
    public BigDecimal getOldTownIntegralGpAmt() {
        return oldTownIntegralGpAmt;
    }

    /**
     * set method 
     *
     * @param oldTownIntegralGpAmt  null
     */
    public void setOldTownIntegralGpAmt(BigDecimal oldTownIntegralGpAmt) {
        this.oldTownIntegralGpAmt = oldTownIntegralGpAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.REFUND_TOWN_INTEGRAL_GP：null
     */
    public Integer getRefundTownIntegralGp() {
        return refundTownIntegralGp;
    }

    /**
     * set method 
     *
     * @param refundTownIntegralGp  null
     */
    public void setRefundTownIntegralGp(Integer refundTownIntegralGp) {
        this.refundTownIntegralGp = refundTownIntegralGp;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.REFUND_TOWN_INTEGRAL_GP_AMT：null
     */
    public BigDecimal getRefundTownIntegralGpAmt() {
        return refundTownIntegralGpAmt;
    }

    /**
     * set method 
     *
     * @param refundTownIntegralGpAmt  null
     */
    public void setRefundTownIntegralGpAmt(BigDecimal refundTownIntegralGpAmt) {
        this.refundTownIntegralGpAmt = refundTownIntegralGpAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.TOWN_INTEGRAL_PN：null
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
     * @return IECPAY.IP_MALL_ORDER.TOWN_INTEGRAL_PN_AMT：null
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
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.OLD_TOWN_INTEGRAL_PN：null
     */
    public Long getOldTownIntegralPn() {
        return oldTownIntegralPn;
    }

    /**
     * set method 
     *
     * @param oldTownIntegralPn  null
     */
    public void setOldTownIntegralPn(Long oldTownIntegralPn) {
        this.oldTownIntegralPn = oldTownIntegralPn;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.OLD_TOWN_INTEGRAL_PN_AMT：null
     */
    public BigDecimal getOldTownIntegralPnAmt() {
        return oldTownIntegralPnAmt;
    }

    /**
     * set method 
     *
     * @param oldTownIntegralPnAmt  null
     */
    public void setOldTownIntegralPnAmt(BigDecimal oldTownIntegralPnAmt) {
        this.oldTownIntegralPnAmt = oldTownIntegralPnAmt;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.REFUND_TOWN_INTEGRAL_PN：null
     */
    public Integer getRefundTownIntegralPn() {
        return refundTownIntegralPn;
    }

    /**
     * set method 
     *
     * @param refundTownIntegralPn  null
     */
    public void setRefundTownIntegralPn(Integer refundTownIntegralPn) {
        this.refundTownIntegralPn = refundTownIntegralPn;
    }

    /**
     * get method 
     *
     * @return IECPAY.IP_MALL_ORDER.REFUND_TOWN_INTEGRAL_PN_AMT：null
     */
    public BigDecimal getRefundTownIntegralPnAmt() {
        return refundTownIntegralPnAmt;
    }

    /**
     * set method 
     *
     * @param refundTownIntegralPnAmt  null
     */
    public void setRefundTownIntegralPnAmt(BigDecimal refundTownIntegralPnAmt) {
        this.refundTownIntegralPnAmt = refundTownIntegralPnAmt;
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
        Ip_mall_order other = (Ip_mall_order) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getMercId() == null ? other.getMercId() == null : this.getMercId().equals(other.getMercId()))
            && (this.getAcDt() == null ? other.getAcDt() == null : this.getAcDt().equals(other.getAcDt()))
            && (this.getAcTm() == null ? other.getAcTm() == null : this.getAcTm().equals(other.getAcTm()))
            && (this.getFinishDt() == null ? other.getFinishDt() == null : this.getFinishDt().equals(other.getFinishDt()))
            && (this.getFinishTime() == null ? other.getFinishTime() == null : this.getFinishTime().equals(other.getFinishTime()))
            && (this.getMercName() == null ? other.getMercName() == null : this.getMercName().equals(other.getMercName()))
            && (this.getTotalAmt() == null ? other.getTotalAmt() == null : this.getTotalAmt().equals(other.getTotalAmt()))
            && (this.getOldPayAmt() == null ? other.getOldPayAmt() == null : this.getOldPayAmt().equals(other.getOldPayAmt()))
            && (this.getPayAmt() == null ? other.getPayAmt() == null : this.getPayAmt().equals(other.getPayAmt()))
            && (this.getAlreadyRefundAmt() == null ? other.getAlreadyRefundAmt() == null : this.getAlreadyRefundAmt().equals(other.getAlreadyRefundAmt()))
            && (this.getDiscountAmt() == null ? other.getDiscountAmt() == null : this.getDiscountAmt().equals(other.getDiscountAmt()))
            && (this.getShippingfeeAmt() == null ? other.getShippingfeeAmt() == null : this.getShippingfeeAmt().equals(other.getShippingfeeAmt()))
            && (this.getCleDt() == null ? other.getCleDt() == null : this.getCleDt().equals(other.getCleDt()))
            && (this.getCleTm() == null ? other.getCleTm() == null : this.getCleTm().equals(other.getCleTm()))
            && (this.getCleState() == null ? other.getCleState() == null : this.getCleState().equals(other.getCleState()))
            && (this.getMercServiceAmt() == null ? other.getMercServiceAmt() == null : this.getMercServiceAmt().equals(other.getMercServiceAmt()))
            && (this.getCleSceneNo() == null ? other.getCleSceneNo() == null : this.getCleSceneNo().equals(other.getCleSceneNo()))
            && (this.getStlBillNo() == null ? other.getStlBillNo() == null : this.getStlBillNo().equals(other.getStlBillNo()))
            && (this.getStlState() == null ? other.getStlState() == null : this.getStlState().equals(other.getStlState()))
            && (this.getStlAmt() == null ? other.getStlAmt() == null : this.getStlAmt().equals(other.getStlAmt()))
            && (this.getStlDate() == null ? other.getStlDate() == null : this.getStlDate().equals(other.getStlDate()))
            && (this.getRefundState() == null ? other.getRefundState() == null : this.getRefundState().equals(other.getRefundState()))
            && (this.getCheckState() == null ? other.getCheckState() == null : this.getCheckState().equals(other.getCheckState()))
            && (this.getCheckDt() == null ? other.getCheckDt() == null : this.getCheckDt().equals(other.getCheckDt()))
            && (this.getPayLogNo() == null ? other.getPayLogNo() == null : this.getPayLogNo().equals(other.getPayLogNo()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getPayType() == null ? other.getPayType() == null : this.getPayType().equals(other.getPayType()))
            && (this.getGeneralIntegral() == null ? other.getGeneralIntegral() == null : this.getGeneralIntegral().equals(other.getGeneralIntegral()))
            && (this.getGeneralIntegralAmt() == null ? other.getGeneralIntegralAmt() == null : this.getGeneralIntegralAmt().equals(other.getGeneralIntegralAmt()))
            && (this.getOldGeneralIntegral() == null ? other.getOldGeneralIntegral() == null : this.getOldGeneralIntegral().equals(other.getOldGeneralIntegral()))
            && (this.getOldGeneralIntegralAmt() == null ? other.getOldGeneralIntegralAmt() == null : this.getOldGeneralIntegralAmt().equals(other.getOldGeneralIntegralAmt()))
            && (this.getRefundGeneralIntegral() == null ? other.getRefundGeneralIntegral() == null : this.getRefundGeneralIntegral().equals(other.getRefundGeneralIntegral()))
            && (this.getRefundGeneralIntegralAmt() == null ? other.getRefundGeneralIntegralAmt() == null : this.getRefundGeneralIntegralAmt().equals(other.getRefundGeneralIntegralAmt()))
            && (this.getRedPacketAmt() == null ? other.getRedPacketAmt() == null : this.getRedPacketAmt().equals(other.getRedPacketAmt()))
            && (this.getOldRedPacketAmt() == null ? other.getOldRedPacketAmt() == null : this.getOldRedPacketAmt().equals(other.getOldRedPacketAmt()))
            && (this.getRefundRedPacketAmt() == null ? other.getRefundRedPacketAmt() == null : this.getRefundRedPacketAmt().equals(other.getRefundRedPacketAmt()))
            && (this.getTxnSts() == null ? other.getTxnSts() == null : this.getTxnSts().equals(other.getTxnSts()))
            && (this.getGuestIntegral() == null ? other.getGuestIntegral() == null : this.getGuestIntegral().equals(other.getGuestIntegral()))
            && (this.getGuestIntegralAmt() == null ? other.getGuestIntegralAmt() == null : this.getGuestIntegralAmt().equals(other.getGuestIntegralAmt()))
            && (this.getOldGuestIntegral() == null ? other.getOldGuestIntegral() == null : this.getOldGuestIntegral().equals(other.getOldGuestIntegral()))
            && (this.getOldGuestIntegralAmt() == null ? other.getOldGuestIntegralAmt() == null : this.getOldGuestIntegralAmt().equals(other.getOldGuestIntegralAmt()))
            && (this.getRefundGuestIntegral() == null ? other.getRefundGuestIntegral() == null : this.getRefundGuestIntegral().equals(other.getRefundGuestIntegral()))
            && (this.getRefundGuestIntegralAmt() == null ? other.getRefundGuestIntegralAmt() == null : this.getRefundGuestIntegralAmt().equals(other.getRefundGuestIntegralAmt()))
            && (this.getTownIntegralXa() == null ? other.getTownIntegralXa() == null : this.getTownIntegralXa().equals(other.getTownIntegralXa()))
            && (this.getTownIntegralXaAmt() == null ? other.getTownIntegralXaAmt() == null : this.getTownIntegralXaAmt().equals(other.getTownIntegralXaAmt()))
            && (this.getOldTownIntegralXa() == null ? other.getOldTownIntegralXa() == null : this.getOldTownIntegralXa().equals(other.getOldTownIntegralXa()))
            && (this.getOldTownIntegralXaAmt() == null ? other.getOldTownIntegralXaAmt() == null : this.getOldTownIntegralXaAmt().equals(other.getOldTownIntegralXaAmt()))
            && (this.getRefundTownIntegralXa() == null ? other.getRefundTownIntegralXa() == null : this.getRefundTownIntegralXa().equals(other.getRefundTownIntegralXa()))
            && (this.getRefundTownIntegralXaAmt() == null ? other.getRefundTownIntegralXaAmt() == null : this.getRefundTownIntegralXaAmt().equals(other.getRefundTownIntegralXaAmt()))
            && (this.getTownIntegralTx() == null ? other.getTownIntegralTx() == null : this.getTownIntegralTx().equals(other.getTownIntegralTx()))
            && (this.getTownIntegralTxAmt() == null ? other.getTownIntegralTxAmt() == null : this.getTownIntegralTxAmt().equals(other.getTownIntegralTxAmt()))
            && (this.getOldTownIntegralTx() == null ? other.getOldTownIntegralTx() == null : this.getOldTownIntegralTx().equals(other.getOldTownIntegralTx()))
            && (this.getOldTownIntegralTxAmt() == null ? other.getOldTownIntegralTxAmt() == null : this.getOldTownIntegralTxAmt().equals(other.getOldTownIntegralTxAmt()))
            && (this.getRefundTownIntegralTx() == null ? other.getRefundTownIntegralTx() == null : this.getRefundTownIntegralTx().equals(other.getRefundTownIntegralTx()))
            && (this.getRefundTownIntegralTxAmt() == null ? other.getRefundTownIntegralTxAmt() == null : this.getRefundTownIntegralTxAmt().equals(other.getRefundTownIntegralTxAmt()))
            && (this.getTownIntegralHx() == null ? other.getTownIntegralHx() == null : this.getTownIntegralHx().equals(other.getTownIntegralHx()))
            && (this.getTownIntegralHxAmt() == null ? other.getTownIntegralHxAmt() == null : this.getTownIntegralHxAmt().equals(other.getTownIntegralHxAmt()))
            && (this.getOldTownIntegralHx() == null ? other.getOldTownIntegralHx() == null : this.getOldTownIntegralHx().equals(other.getOldTownIntegralHx()))
            && (this.getOldTownIntegralHxAmt() == null ? other.getOldTownIntegralHxAmt() == null : this.getOldTownIntegralHxAmt().equals(other.getOldTownIntegralHxAmt()))
            && (this.getRefundTownIntegralHx() == null ? other.getRefundTownIntegralHx() == null : this.getRefundTownIntegralHx().equals(other.getRefundTownIntegralHx()))
            && (this.getRefundTownIntegralHxAmt() == null ? other.getRefundTownIntegralHxAmt() == null : this.getRefundTownIntegralHxAmt().equals(other.getRefundTownIntegralHxAmt()))
            && (this.getTownIntegralRx() == null ? other.getTownIntegralRx() == null : this.getTownIntegralRx().equals(other.getTownIntegralRx()))
            && (this.getTownIntegralRxAmt() == null ? other.getTownIntegralRxAmt() == null : this.getTownIntegralRxAmt().equals(other.getTownIntegralRxAmt()))
            && (this.getOldTownIntegralRx() == null ? other.getOldTownIntegralRx() == null : this.getOldTownIntegralRx().equals(other.getOldTownIntegralRx()))
            && (this.getOldTownIntegralRxAmt() == null ? other.getOldTownIntegralRxAmt() == null : this.getOldTownIntegralRxAmt().equals(other.getOldTownIntegralRxAmt()))
            && (this.getRefundTownIntegralRx() == null ? other.getRefundTownIntegralRx() == null : this.getRefundTownIntegralRx().equals(other.getRefundTownIntegralRx()))
            && (this.getRefundTownIntegralRxAmt() == null ? other.getRefundTownIntegralRxAmt() == null : this.getRefundTownIntegralRxAmt().equals(other.getRefundTownIntegralRxAmt()))
            && (this.getTownIntegralBa() == null ? other.getTownIntegralBa() == null : this.getTownIntegralBa().equals(other.getTownIntegralBa()))
            && (this.getTownIntegralBaAmt() == null ? other.getTownIntegralBaAmt() == null : this.getTownIntegralBaAmt().equals(other.getTownIntegralBaAmt()))
            && (this.getOldTownIntegralBa() == null ? other.getOldTownIntegralBa() == null : this.getOldTownIntegralBa().equals(other.getOldTownIntegralBa()))
            && (this.getOldTownIntegralBaAmt() == null ? other.getOldTownIntegralBaAmt() == null : this.getOldTownIntegralBaAmt().equals(other.getOldTownIntegralBaAmt()))
            && (this.getRefundTownIntegralBa() == null ? other.getRefundTownIntegralBa() == null : this.getRefundTownIntegralBa().equals(other.getRefundTownIntegralBa()))
            && (this.getRefundTownIntegralBaAmt() == null ? other.getRefundTownIntegralBaAmt() == null : this.getRefundTownIntegralBaAmt().equals(other.getRefundTownIntegralBaAmt()))
            && (this.getTownIntegralGp() == null ? other.getTownIntegralGp() == null : this.getTownIntegralGp().equals(other.getTownIntegralGp()))
            && (this.getTownIntegralGpAmt() == null ? other.getTownIntegralGpAmt() == null : this.getTownIntegralGpAmt().equals(other.getTownIntegralGpAmt()))
            && (this.getOldTownIntegralGp() == null ? other.getOldTownIntegralGp() == null : this.getOldTownIntegralGp().equals(other.getOldTownIntegralGp()))
            && (this.getOldTownIntegralGpAmt() == null ? other.getOldTownIntegralGpAmt() == null : this.getOldTownIntegralGpAmt().equals(other.getOldTownIntegralGpAmt()))
            && (this.getRefundTownIntegralGp() == null ? other.getRefundTownIntegralGp() == null : this.getRefundTownIntegralGp().equals(other.getRefundTownIntegralGp()))
            && (this.getRefundTownIntegralGpAmt() == null ? other.getRefundTownIntegralGpAmt() == null : this.getRefundTownIntegralGpAmt().equals(other.getRefundTownIntegralGpAmt()))
            && (this.getTownIntegralPn() == null ? other.getTownIntegralPn() == null : this.getTownIntegralPn().equals(other.getTownIntegralPn()))
            && (this.getTownIntegralPnAmt() == null ? other.getTownIntegralPnAmt() == null : this.getTownIntegralPnAmt().equals(other.getTownIntegralPnAmt()))
            && (this.getOldTownIntegralPn() == null ? other.getOldTownIntegralPn() == null : this.getOldTownIntegralPn().equals(other.getOldTownIntegralPn()))
            && (this.getOldTownIntegralPnAmt() == null ? other.getOldTownIntegralPnAmt() == null : this.getOldTownIntegralPnAmt().equals(other.getOldTownIntegralPnAmt()))
            && (this.getRefundTownIntegralPn() == null ? other.getRefundTownIntegralPn() == null : this.getRefundTownIntegralPn().equals(other.getRefundTownIntegralPn()))
            && (this.getRefundTownIntegralPnAmt() == null ? other.getRefundTownIntegralPnAmt() == null : this.getRefundTownIntegralPnAmt().equals(other.getRefundTownIntegralPnAmt()));
    }

    /**
     *
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getMercId() == null) ? 0 : getMercId().hashCode());
        result = prime * result + ((getAcDt() == null) ? 0 : getAcDt().hashCode());
        result = prime * result + ((getAcTm() == null) ? 0 : getAcTm().hashCode());
        result = prime * result + ((getFinishDt() == null) ? 0 : getFinishDt().hashCode());
        result = prime * result + ((getFinishTime() == null) ? 0 : getFinishTime().hashCode());
        result = prime * result + ((getMercName() == null) ? 0 : getMercName().hashCode());
        result = prime * result + ((getTotalAmt() == null) ? 0 : getTotalAmt().hashCode());
        result = prime * result + ((getOldPayAmt() == null) ? 0 : getOldPayAmt().hashCode());
        result = prime * result + ((getPayAmt() == null) ? 0 : getPayAmt().hashCode());
        result = prime * result + ((getAlreadyRefundAmt() == null) ? 0 : getAlreadyRefundAmt().hashCode());
        result = prime * result + ((getDiscountAmt() == null) ? 0 : getDiscountAmt().hashCode());
        result = prime * result + ((getShippingfeeAmt() == null) ? 0 : getShippingfeeAmt().hashCode());
        result = prime * result + ((getCleDt() == null) ? 0 : getCleDt().hashCode());
        result = prime * result + ((getCleTm() == null) ? 0 : getCleTm().hashCode());
        result = prime * result + ((getCleState() == null) ? 0 : getCleState().hashCode());
        result = prime * result + ((getMercServiceAmt() == null) ? 0 : getMercServiceAmt().hashCode());
        result = prime * result + ((getCleSceneNo() == null) ? 0 : getCleSceneNo().hashCode());
        result = prime * result + ((getStlBillNo() == null) ? 0 : getStlBillNo().hashCode());
        result = prime * result + ((getStlState() == null) ? 0 : getStlState().hashCode());
        result = prime * result + ((getStlAmt() == null) ? 0 : getStlAmt().hashCode());
        result = prime * result + ((getStlDate() == null) ? 0 : getStlDate().hashCode());
        result = prime * result + ((getRefundState() == null) ? 0 : getRefundState().hashCode());
        result = prime * result + ((getCheckState() == null) ? 0 : getCheckState().hashCode());
        result = prime * result + ((getCheckDt() == null) ? 0 : getCheckDt().hashCode());
        result = prime * result + ((getPayLogNo() == null) ? 0 : getPayLogNo().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getPayType() == null) ? 0 : getPayType().hashCode());
        result = prime * result + ((getGeneralIntegral() == null) ? 0 : getGeneralIntegral().hashCode());
        result = prime * result + ((getGeneralIntegralAmt() == null) ? 0 : getGeneralIntegralAmt().hashCode());
        result = prime * result + ((getOldGeneralIntegral() == null) ? 0 : getOldGeneralIntegral().hashCode());
        result = prime * result + ((getOldGeneralIntegralAmt() == null) ? 0 : getOldGeneralIntegralAmt().hashCode());
        result = prime * result + ((getRefundGeneralIntegral() == null) ? 0 : getRefundGeneralIntegral().hashCode());
        result = prime * result + ((getRefundGeneralIntegralAmt() == null) ? 0 : getRefundGeneralIntegralAmt().hashCode());
        result = prime * result + ((getRedPacketAmt() == null) ? 0 : getRedPacketAmt().hashCode());
        result = prime * result + ((getOldRedPacketAmt() == null) ? 0 : getOldRedPacketAmt().hashCode());
        result = prime * result + ((getRefundRedPacketAmt() == null) ? 0 : getRefundRedPacketAmt().hashCode());
        result = prime * result + ((getTxnSts() == null) ? 0 : getTxnSts().hashCode());
        result = prime * result + ((getGuestIntegral() == null) ? 0 : getGuestIntegral().hashCode());
        result = prime * result + ((getGuestIntegralAmt() == null) ? 0 : getGuestIntegralAmt().hashCode());
        result = prime * result + ((getOldGuestIntegral() == null) ? 0 : getOldGuestIntegral().hashCode());
        result = prime * result + ((getOldGuestIntegralAmt() == null) ? 0 : getOldGuestIntegralAmt().hashCode());
        result = prime * result + ((getRefundGuestIntegral() == null) ? 0 : getRefundGuestIntegral().hashCode());
        result = prime * result + ((getRefundGuestIntegralAmt() == null) ? 0 : getRefundGuestIntegralAmt().hashCode());
        result = prime * result + ((getTownIntegralXa() == null) ? 0 : getTownIntegralXa().hashCode());
        result = prime * result + ((getTownIntegralXaAmt() == null) ? 0 : getTownIntegralXaAmt().hashCode());
        result = prime * result + ((getOldTownIntegralXa() == null) ? 0 : getOldTownIntegralXa().hashCode());
        result = prime * result + ((getOldTownIntegralXaAmt() == null) ? 0 : getOldTownIntegralXaAmt().hashCode());
        result = prime * result + ((getRefundTownIntegralXa() == null) ? 0 : getRefundTownIntegralXa().hashCode());
        result = prime * result + ((getRefundTownIntegralXaAmt() == null) ? 0 : getRefundTownIntegralXaAmt().hashCode());
        result = prime * result + ((getTownIntegralTx() == null) ? 0 : getTownIntegralTx().hashCode());
        result = prime * result + ((getTownIntegralTxAmt() == null) ? 0 : getTownIntegralTxAmt().hashCode());
        result = prime * result + ((getOldTownIntegralTx() == null) ? 0 : getOldTownIntegralTx().hashCode());
        result = prime * result + ((getOldTownIntegralTxAmt() == null) ? 0 : getOldTownIntegralTxAmt().hashCode());
        result = prime * result + ((getRefundTownIntegralTx() == null) ? 0 : getRefundTownIntegralTx().hashCode());
        result = prime * result + ((getRefundTownIntegralTxAmt() == null) ? 0 : getRefundTownIntegralTxAmt().hashCode());
        result = prime * result + ((getTownIntegralHx() == null) ? 0 : getTownIntegralHx().hashCode());
        result = prime * result + ((getTownIntegralHxAmt() == null) ? 0 : getTownIntegralHxAmt().hashCode());
        result = prime * result + ((getOldTownIntegralHx() == null) ? 0 : getOldTownIntegralHx().hashCode());
        result = prime * result + ((getOldTownIntegralHxAmt() == null) ? 0 : getOldTownIntegralHxAmt().hashCode());
        result = prime * result + ((getRefundTownIntegralHx() == null) ? 0 : getRefundTownIntegralHx().hashCode());
        result = prime * result + ((getRefundTownIntegralHxAmt() == null) ? 0 : getRefundTownIntegralHxAmt().hashCode());
        result = prime * result + ((getTownIntegralRx() == null) ? 0 : getTownIntegralRx().hashCode());
        result = prime * result + ((getTownIntegralRxAmt() == null) ? 0 : getTownIntegralRxAmt().hashCode());
        result = prime * result + ((getOldTownIntegralRx() == null) ? 0 : getOldTownIntegralRx().hashCode());
        result = prime * result + ((getOldTownIntegralRxAmt() == null) ? 0 : getOldTownIntegralRxAmt().hashCode());
        result = prime * result + ((getRefundTownIntegralRx() == null) ? 0 : getRefundTownIntegralRx().hashCode());
        result = prime * result + ((getRefundTownIntegralRxAmt() == null) ? 0 : getRefundTownIntegralRxAmt().hashCode());
        result = prime * result + ((getTownIntegralBa() == null) ? 0 : getTownIntegralBa().hashCode());
        result = prime * result + ((getTownIntegralBaAmt() == null) ? 0 : getTownIntegralBaAmt().hashCode());
        result = prime * result + ((getOldTownIntegralBa() == null) ? 0 : getOldTownIntegralBa().hashCode());
        result = prime * result + ((getOldTownIntegralBaAmt() == null) ? 0 : getOldTownIntegralBaAmt().hashCode());
        result = prime * result + ((getRefundTownIntegralBa() == null) ? 0 : getRefundTownIntegralBa().hashCode());
        result = prime * result + ((getRefundTownIntegralBaAmt() == null) ? 0 : getRefundTownIntegralBaAmt().hashCode());
        result = prime * result + ((getTownIntegralGp() == null) ? 0 : getTownIntegralGp().hashCode());
        result = prime * result + ((getTownIntegralGpAmt() == null) ? 0 : getTownIntegralGpAmt().hashCode());
        result = prime * result + ((getOldTownIntegralGp() == null) ? 0 : getOldTownIntegralGp().hashCode());
        result = prime * result + ((getOldTownIntegralGpAmt() == null) ? 0 : getOldTownIntegralGpAmt().hashCode());
        result = prime * result + ((getRefundTownIntegralGp() == null) ? 0 : getRefundTownIntegralGp().hashCode());
        result = prime * result + ((getRefundTownIntegralGpAmt() == null) ? 0 : getRefundTownIntegralGpAmt().hashCode());
        result = prime * result + ((getTownIntegralPn() == null) ? 0 : getTownIntegralPn().hashCode());
        result = prime * result + ((getTownIntegralPnAmt() == null) ? 0 : getTownIntegralPnAmt().hashCode());
        result = prime * result + ((getOldTownIntegralPn() == null) ? 0 : getOldTownIntegralPn().hashCode());
        result = prime * result + ((getOldTownIntegralPnAmt() == null) ? 0 : getOldTownIntegralPnAmt().hashCode());
        result = prime * result + ((getRefundTownIntegralPn() == null) ? 0 : getRefundTownIntegralPn().hashCode());
        result = prime * result + ((getRefundTownIntegralPnAmt() == null) ? 0 : getRefundTownIntegralPnAmt().hashCode());
        return result;
    }
}