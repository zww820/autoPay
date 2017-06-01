package org.pay.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Check_acc_info implements Serializable {
    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : TASK_ID
     */
    private String TASK_ID;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO
     */
    private String CHAN_NO;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHECK_DT
     */
    private String CHECK_DT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : AC_DT
     */
    private String AC_DT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : START_TM
     */
    private Date START_TM;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : END_TM
     */
    private Date END_TM;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHECK_STATE
     */
    private Integer CHECK_STATE;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : REMARK
     */
    private String REMARK;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FILENAME
     */
    private String CHAN_FILENAME;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : TRAN_ACC_TO
     */
    private Integer TRAN_ACC_TO;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : TRAN_ACC_AMT
     */
    private BigDecimal TRAN_ACC_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_PAY_TOTAL_C_AMT
     */
    private BigDecimal OUR_PAY_TOTAL_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_RFD_TOTAL_C_AMT
     */
    private BigDecimal OUR_RFD_TOTAL_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_PAY_TOTAL_GI
     */
    private BigDecimal OUR_PAY_TOTAL_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_RFD_TOTAL_GI
     */
    private BigDecimal OUR_RFD_TOTAL_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_PAY_TOTAL_GU
     */
    private BigDecimal OUR_PAY_TOTAL_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_RFD_TOTAL_GU
     */
    private BigDecimal OUR_RFD_TOTAL_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_PAY_TOTAL_GT_XA
     */
    private BigDecimal OUR_PAY_TOTAL_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_RFD_TOTAL_GT_XA
     */
    private BigDecimal OUR_RFD_TOTAL_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_PAY_TOTAL_GT_TX
     */
    private BigDecimal OUR_PAY_TOTAL_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_RFD_TOTAL_GT_TX
     */
    private BigDecimal OUR_RFD_TOTAL_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_PAY_TOTAL_GT_HX
     */
    private BigDecimal OUR_PAY_TOTAL_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_RFD_TOTAL_GT_HX
     */
    private BigDecimal OUR_RFD_TOTAL_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_PAY_TOTAL_GT_RX
     */
    private BigDecimal OUR_PAY_TOTAL_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_RFD_TOTAL_GT_RX
     */
    private BigDecimal OUR_RFD_TOTAL_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_PAY_TOTAL_GT_BA
     */
    private BigDecimal OUR_PAY_TOTAL_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_RFD_TOTAL_GT_BA
     */
    private BigDecimal OUR_RFD_TOTAL_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_PAY_TOTAL_GT_GP
     */
    private BigDecimal OUR_PAY_TOTAL_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_RFD_TOTAL_GT_GP
     */
    private BigDecimal OUR_RFD_TOTAL_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_PAY_TOTAL_GT_PN
     */
    private BigDecimal OUR_PAY_TOTAL_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_RFD_TOTAL_GT_PN
     */
    private BigDecimal OUR_RFD_TOTAL_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_PAY_TOTAL_AMT
     */
    private BigDecimal OUR_PAY_TOTAL_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_PAY_TOTAL_COUNT
     */
    private Long OUR_PAY_TOTAL_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_RFD_TOTAL_AMT
     */
    private BigDecimal OUR_RFD_TOTAL_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_RFD_TOTAL_COUNT
     */
    private Long OUR_RFD_TOTAL_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DOUBTS_SHORT_PAY_C_AMT
     */
    private BigDecimal OUR_DOUBTS_SHORT_PAY_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DOUBTS_SHORT_RFD_C_AMT
     */
    private BigDecimal OUR_DOUBTS_SHORT_RFD_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DOUBTS_SHORT_PAY_GI
     */
    private BigDecimal OUR_DOUBTS_SHORT_PAY_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DOUBTS_SHORT_RFD_GI
     */
    private BigDecimal OUR_DOUBTS_SHORT_RFD_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DOUBTS_SHORT_PAY_GU
     */
    private BigDecimal OUR_DOUBTS_SHORT_PAY_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DOUBTS_SHORT_RFD_GU
     */
    private BigDecimal OUR_DOUBTS_SHORT_RFD_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DOUBTS_SHORT_PAY_GT_XA
     */
    private BigDecimal OUR_DOUBTS_SHORT_PAY_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DOUBTS_SHORT_RFD_GT_XA
     */
    private BigDecimal OUR_DOUBTS_SHORT_RFD_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DOUBTS_SHORT_PAY_GT_TX
     */
    private BigDecimal OUR_DOUBTS_SHORT_PAY_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DOUBTS_SHORT_RFD_GT_TX
     */
    private BigDecimal OUR_DOUBTS_SHORT_RFD_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DOUBTS_SHORT_PAY_GT_HX
     */
    private BigDecimal OUR_DOUBTS_SHORT_PAY_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DOUBTS_SHORT_RFD_GT_HX
     */
    private BigDecimal OUR_DOUBTS_SHORT_RFD_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DOUBTS_SHORT_PAY_GT_RX
     */
    private BigDecimal OUR_DOUBTS_SHORT_PAY_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DOUBTS_SHORT_RFD_GT_RX
     */
    private BigDecimal OUR_DOUBTS_SHORT_RFD_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DOUBTS_SHORT_PAY_GT_BA
     */
    private BigDecimal OUR_DOUBTS_SHORT_PAY_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DOUBTS_SHORT_RFD_GT_BA
     */
    private BigDecimal OUR_DOUBTS_SHORT_RFD_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DOUBTS_SHORT_PAY_GT_GP
     */
    private BigDecimal OUR_DOUBTS_SHORT_PAY_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DOUBTS_SHORT_RFD_GT_GP
     */
    private BigDecimal OUR_DOUBTS_SHORT_RFD_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DOUBTS_SHORT_PAY_GT_PN
     */
    private BigDecimal OUR_DOUBTS_SHORT_PAY_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DOUBTS_SHORT_RFD_GT_PN
     */
    private BigDecimal OUR_DOUBTS_SHORT_RFD_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DOUBTS_SHORT_PAY_AMT
     */
    private BigDecimal OUR_DOUBTS_SHORT_PAY_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DOUBTS_SHORT_PAY_COUNT
     */
    private Long OUR_DOUBTS_SHORT_PAY_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DOUBTS_SHORT_RFD_AMT
     */
    private BigDecimal OUR_DOUBTS_SHORT_RFD_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DOUBTS_SHORT_RFD_COUNT
     */
    private Long OUR_DOUBTS_SHORT_RFD_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_FLAT_PAY_C_AMT
     */
    private BigDecimal OUR_FLAT_PAY_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_FLAT_RFD_C_AMT
     */
    private BigDecimal OUR_FLAT_RFD_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_FLAT_PAY_GI
     */
    private BigDecimal OUR_FLAT_PAY_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_FLAT_RFD_GI
     */
    private BigDecimal OUR_FLAT_RFD_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_FLAT_PAY_GU
     */
    private BigDecimal OUR_FLAT_PAY_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_FLAT_RFD_GU
     */
    private BigDecimal OUR_FLAT_RFD_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_FLAT_PAY_GT_XA
     */
    private BigDecimal OUR_FLAT_PAY_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_FLAT_RFD_GT_XA
     */
    private BigDecimal OUR_FLAT_RFD_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_FLAT_PAY_GT_TX
     */
    private BigDecimal OUR_FLAT_PAY_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_FLAT_RFD_GT_TX
     */
    private BigDecimal OUR_FLAT_RFD_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_FLAT_PAY_GT_HX
     */
    private BigDecimal OUR_FLAT_PAY_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_FLAT_RFD_GT_HX
     */
    private BigDecimal OUR_FLAT_RFD_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_FLAT_PAY_GT_RX
     */
    private BigDecimal OUR_FLAT_PAY_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_FLAT_RFD_GT_RX
     */
    private BigDecimal OUR_FLAT_RFD_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_FLAT_PAY_GT_BA
     */
    private BigDecimal OUR_FLAT_PAY_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_FLAT_RFD_GT_BA
     */
    private BigDecimal OUR_FLAT_RFD_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_FLAT_PAY_GT_GP
     */
    private BigDecimal OUR_FLAT_PAY_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_FLAT_RFD_GT_GP
     */
    private BigDecimal OUR_FLAT_RFD_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_FLAT_PAY_GT_PN
     */
    private BigDecimal OUR_FLAT_PAY_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_FLAT_RFD_GT_PN
     */
    private BigDecimal OUR_FLAT_RFD_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_FLAT_PAY_AMT
     */
    private BigDecimal OUR_FLAT_PAY_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_FLAT_PAY_COUNT
     */
    private Long OUR_FLAT_PAY_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_FLAT_RFD_AMT
     */
    private BigDecimal OUR_FLAT_RFD_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_FLAT_RFD_COUNT
     */
    private Long OUR_FLAT_RFD_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_NO_FLAT_PAY_C_AMT
     */
    private BigDecimal OUR_NO_FLAT_PAY_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_NO_FLAT_RFD_C_AMT
     */
    private BigDecimal OUR_NO_FLAT_RFD_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_NO_FLAT_PAY_GI
     */
    private BigDecimal OUR_NO_FLAT_PAY_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_NO_FLAT_RFD_GI
     */
    private BigDecimal OUR_NO_FLAT_RFD_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_NO_FLAT_PAY_GU
     */
    private BigDecimal OUR_NO_FLAT_PAY_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_NO_FLAT_RFD_GU
     */
    private BigDecimal OUR_NO_FLAT_RFD_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_NO_FLAT_PAY_GT_XA
     */
    private BigDecimal OUR_NO_FLAT_PAY_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_NO_FLAT_RFD_GT_XA
     */
    private BigDecimal OUR_NO_FLAT_RFD_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_NO_FLAT_PAY_GT_TX
     */
    private BigDecimal OUR_NO_FLAT_PAY_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_NO_FLAT_RFD_GT_TX
     */
    private BigDecimal OUR_NO_FLAT_RFD_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_NO_FLAT_PAY_GT_HX
     */
    private BigDecimal OUR_NO_FLAT_PAY_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_NO_FLAT_RFD_GT_HX
     */
    private BigDecimal OUR_NO_FLAT_RFD_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_NO_FLAT_PAY_GT_RX
     */
    private BigDecimal OUR_NO_FLAT_PAY_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_NO_FLAT_RFD_GT_RX
     */
    private BigDecimal OUR_NO_FLAT_RFD_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_NO_FLAT_PAY_GT_BA
     */
    private BigDecimal OUR_NO_FLAT_PAY_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_NO_FLAT_RFD_GT_BA
     */
    private BigDecimal OUR_NO_FLAT_RFD_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_NO_FLAT_PAY_GT_GP
     */
    private BigDecimal OUR_NO_FLAT_PAY_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_NO_FLAT_RFD_GT_GP
     */
    private BigDecimal OUR_NO_FLAT_RFD_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_NO_FLAT_PAY_GT_PN
     */
    private BigDecimal OUR_NO_FLAT_PAY_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_NO_FLAT_RFD_GT_PN
     */
    private BigDecimal OUR_NO_FLAT_RFD_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_NO_FLAT_PAY_AMT
     */
    private BigDecimal OUR_NO_FLAT_PAY_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_NO_FLAT_PAY_COUNT
     */
    private Long OUR_NO_FLAT_PAY_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_NO_FLAT_RFD_AMT
     */
    private BigDecimal OUR_NO_FLAT_RFD_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_NO_FLAT_RFD_COUNT
     */
    private Long OUR_NO_FLAT_RFD_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_FLAT_PAY_C_AMT
     */
    private BigDecimal DOUBTS_SHORT_FLAT_PAY_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_FLAT_RFD_C_AMT
     */
    private BigDecimal DOUBTS_SHORT_FLAT_RFD_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_FLAT_PAY_GI
     */
    private BigDecimal DOUBTS_SHORT_FLAT_PAY_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_FLAT_RFD_GI
     */
    private BigDecimal DOUBTS_SHORT_FLAT_RFD_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_FLAT_PAY_GU
     */
    private BigDecimal DOUBTS_SHORT_FLAT_PAY_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_FLAT_RFD_GU
     */
    private BigDecimal DOUBTS_SHORT_FLAT_RFD_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_FLAT_PAY_GT_XA
     */
    private BigDecimal DOUBTS_SHORT_FLAT_PAY_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_FLAT_RFD_GT_XA
     */
    private BigDecimal DOUBTS_SHORT_FLAT_RFD_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_FLAT_PAY_GT_TX
     */
    private BigDecimal DOUBTS_SHORT_FLAT_PAY_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_FLAT_RFD_GT_TX
     */
    private BigDecimal DOUBTS_SHORT_FLAT_RFD_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_FLAT_PAY_GT_HX
     */
    private BigDecimal DOUBTS_SHORT_FLAT_PAY_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_FLAT_RFD_GT_HX
     */
    private BigDecimal DOUBTS_SHORT_FLAT_RFD_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_FLAT_PAY_GT_RX
     */
    private BigDecimal DOUBTS_SHORT_FLAT_PAY_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_FLAT_RFD_GT_RX
     */
    private BigDecimal DOUBTS_SHORT_FLAT_RFD_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_FLAT_PAY_GT_BA
     */
    private BigDecimal DOUBTS_SHORT_FLAT_PAY_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_FLAT_RFD_GT_BA
     */
    private BigDecimal DOUBTS_SHORT_FLAT_RFD_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_FLAT_PAY_GT_GP
     */
    private BigDecimal DOUBTS_SHORT_FLAT_PAY_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_FLAT_RFD_GT_GP
     */
    private BigDecimal DOUBTS_SHORT_FLAT_RFD_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_FLAT_PAY_GT_PN
     */
    private BigDecimal DOUBTS_SHORT_FLAT_PAY_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_FLAT_RFD_GT_PN
     */
    private BigDecimal DOUBTS_SHORT_FLAT_RFD_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_FLAT_PAY_AMT
     */
    private BigDecimal DOUBTS_SHORT_FLAT_PAY_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_FLAT_PAY_COUNT
     */
    private Long DOUBTS_SHORT_FLAT_PAY_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_FLAT_RFD_AMT
     */
    private BigDecimal DOUBTS_SHORT_FLAT_RFD_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_FLAT_RFD_COUNT
     */
    private Long DOUBTS_SHORT_FLAT_RFD_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_NO_FLAT_PAY_C_AMT
     */
    private BigDecimal DOUBTS_SHORT_NO_FLAT_PAY_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_NO_FLAT_RFD_C_AMT
     */
    private BigDecimal DOUBTS_SHORT_NO_FLAT_RFD_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_NO_FLAT_PAY_GI
     */
    private BigDecimal DOUBTS_SHORT_NO_FLAT_PAY_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_NO_FLAT_RFD_GI
     */
    private BigDecimal DOUBTS_SHORT_NO_FLAT_RFD_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_NO_FLAT_PAY_GU
     */
    private BigDecimal DOUBTS_SHORT_NO_FLAT_PAY_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_NO_FLAT_RFD_GU
     */
    private BigDecimal DOUBTS_SHORT_NO_FLAT_RFD_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_NO_FLAT_PAY_GT_XA
     */
    private BigDecimal DOUBTS_SHORT_NO_FLAT_PAY_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_NO_FLAT_RFD_GT_XA
     */
    private BigDecimal DOUBTS_SHORT_NO_FLAT_RFD_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_NO_FLAT_PAY_GT_TX
     */
    private BigDecimal DOUBTS_SHORT_NO_FLAT_PAY_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_NO_FLAT_RFD_GT_TX
     */
    private BigDecimal DOUBTS_SHORT_NO_FLAT_RFD_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_NO_FLAT_PAY_GT_HX
     */
    private BigDecimal DOUBTS_SHORT_NO_FLAT_PAY_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_NO_FLAT_RFD_GT_HX
     */
    private BigDecimal DOUBTS_SHORT_NO_FLAT_RFD_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_NO_FLAT_PAY_GT_RX
     */
    private BigDecimal DOUBTS_SHORT_NO_FLAT_PAY_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_NO_FLAT_RFD_GT_RX
     */
    private BigDecimal DOUBTS_SHORT_NO_FLAT_RFD_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_NO_FLAT_PAY_GT_BA
     */
    private BigDecimal DOUBTS_SHORT_NO_FLAT_PAY_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_NO_FLAT_RFD_GT_BA
     */
    private BigDecimal DOUBTS_SHORT_NO_FLAT_RFD_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_NO_FLAT_PAY_GT_GP
     */
    private BigDecimal DOUBTS_SHORT_NO_FLAT_PAY_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_NO_FLAT_RFD_GT_GP
     */
    private BigDecimal DOUBTS_SHORT_NO_FLAT_RFD_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_NO_FLAT_PAY_GT_PN
     */
    private BigDecimal DOUBTS_SHORT_NO_FLAT_PAY_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_NO_FLAT_RFD_GT_PN
     */
    private BigDecimal DOUBTS_SHORT_NO_FLAT_RFD_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_NO_FLAT_PAY_AMT
     */
    private BigDecimal DOUBTS_SHORT_NO_FLAT_PAY_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_NO_FLAT_PAY_COUNT
     */
    private Long DOUBTS_SHORT_NO_FLAT_PAY_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_NO_FLAT_RFD_AMT
     */
    private BigDecimal DOUBTS_SHORT_NO_FLAT_RFD_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_SHORT_NO_FLAT_RFD_COUNT
     */
    private Long DOUBTS_SHORT_NO_FLAT_RFD_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DIFFE_SHORT_PAY_C_AMT
     */
    private BigDecimal OUR_DIFFE_SHORT_PAY_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DIFFE_SHORT_RFD_C_AMT
     */
    private BigDecimal OUR_DIFFE_SHORT_RFD_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DIFFE_SHORT_PAY_GI
     */
    private BigDecimal OUR_DIFFE_SHORT_PAY_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DIFFE_SHORT_RFD_GI
     */
    private BigDecimal OUR_DIFFE_SHORT_RFD_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DIFFE_SHORT_PAY_GU
     */
    private BigDecimal OUR_DIFFE_SHORT_PAY_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DIFFE_SHORT_RFD_GU
     */
    private BigDecimal OUR_DIFFE_SHORT_RFD_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DIFFE_SHORT_PAY_GT_XA
     */
    private BigDecimal OUR_DIFFE_SHORT_PAY_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DIFFE_SHORT_RFD_GT_XA
     */
    private BigDecimal OUR_DIFFE_SHORT_RFD_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DIFFE_SHORT_PAY_GT_TX
     */
    private BigDecimal OUR_DIFFE_SHORT_PAY_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DIFFE_SHORT_RFD_GT_TX
     */
    private BigDecimal OUR_DIFFE_SHORT_RFD_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DIFFE_SHORT_PAY_GT_HX
     */
    private BigDecimal OUR_DIFFE_SHORT_PAY_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DIFFE_SHORT_RFD_GT_HX
     */
    private BigDecimal OUR_DIFFE_SHORT_RFD_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DIFFE_SHORT_PAY_GT_RX
     */
    private BigDecimal OUR_DIFFE_SHORT_PAY_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DIFFE_SHORT_RFD_GT_RX
     */
    private BigDecimal OUR_DIFFE_SHORT_RFD_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DIFFE_SHORT_PAY_GT_BA
     */
    private BigDecimal OUR_DIFFE_SHORT_PAY_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DIFFE_SHORT_RFD_GT_BA
     */
    private BigDecimal OUR_DIFFE_SHORT_RFD_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DIFFE_SHORT_PAY_GT_GP
     */
    private BigDecimal OUR_DIFFE_SHORT_PAY_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DIFFE_SHORT_RFD_GT_GP
     */
    private BigDecimal OUR_DIFFE_SHORT_RFD_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DIFFE_SHORT_PAY_GT_PN
     */
    private BigDecimal OUR_DIFFE_SHORT_PAY_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DIFFE_SHORT_RFD_GT_PN
     */
    private BigDecimal OUR_DIFFE_SHORT_RFD_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DIFFE_SHORT_PAY_AMT
     */
    private BigDecimal OUR_DIFFE_SHORT_PAY_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DIFFE_SHORT_PAY_COUNT
     */
    private Long OUR_DIFFE_SHORT_PAY_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DIFFE_SHORT_RFD_AMT
     */
    private BigDecimal OUR_DIFFE_SHORT_RFD_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : OUR_DIFFE_SHORT_RFD_COUNT
     */
    private Long OUR_DIFFE_SHORT_RFD_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_PAY_TOTAL_C_AMT
     */
    private BigDecimal CHAN_PAY_TOTAL_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_RFD_TOTAL_C_AMT
     */
    private BigDecimal CHAN_RFD_TOTAL_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_PAY_TOTAL_GI
     */
    private BigDecimal CHAN_PAY_TOTAL_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_RFD_TOTAL_GI
     */
    private BigDecimal CHAN_RFD_TOTAL_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_PAY_TOTAL_GU
     */
    private BigDecimal CHAN_PAY_TOTAL_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_RFD_TOTAL_GU
     */
    private BigDecimal CHAN_RFD_TOTAL_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_PAY_TOTAL_GT_XA
     */
    private BigDecimal CHAN_PAY_TOTAL_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_RFD_TOTAL_GT_XA
     */
    private BigDecimal CHAN_RFD_TOTAL_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_PAY_TOTAL_GT_TX
     */
    private BigDecimal CHAN_PAY_TOTAL_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_RFD_TOTAL_GT_TX
     */
    private BigDecimal CHAN_RFD_TOTAL_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_PAY_TOTAL_GT_HX
     */
    private BigDecimal CHAN_PAY_TOTAL_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_RFD_TOTAL_GT_HX
     */
    private BigDecimal CHAN_RFD_TOTAL_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_PAY_TOTAL_GT_RX
     */
    private BigDecimal CHAN_PAY_TOTAL_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_RFD_TOTAL_GT_RX
     */
    private BigDecimal CHAN_RFD_TOTAL_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_PAY_TOTAL_GT_BA
     */
    private BigDecimal CHAN_PAY_TOTAL_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_RFD_TOTAL_GT_BA
     */
    private BigDecimal CHAN_RFD_TOTAL_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_PAY_TOTAL_GT_GP
     */
    private BigDecimal CHAN_PAY_TOTAL_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_RFD_TOTAL_GT_GP
     */
    private BigDecimal CHAN_RFD_TOTAL_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_PAY_TOTAL_GT_PN
     */
    private BigDecimal CHAN_PAY_TOTAL_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_RFD_TOTAL_GT_PN
     */
    private BigDecimal CHAN_RFD_TOTAL_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_PAY_TOTAL_AMT
     */
    private BigDecimal CHAN_PAY_TOTAL_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_PAY_TOTAL_COUNT
     */
    private Long CHAN_PAY_TOTAL_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_RFD_TOTAL_AMT
     */
    private BigDecimal CHAN_RFD_TOTAL_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_RFD_TOTAL_COUNT
     */
    private Long CHAN_RFD_TOTAL_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DOUBTS_LONG_PAY_C_AMT
     */
    private BigDecimal CHAN_DOUBTS_LONG_PAY_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DOUBTS_LONG_RFD_C_AMT
     */
    private BigDecimal CHAN_DOUBTS_LONG_RFD_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DOUBTS_LONG_PAY_GI
     */
    private BigDecimal CHAN_DOUBTS_LONG_PAY_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DOUBTS_LONG_RFD_GI
     */
    private BigDecimal CHAN_DOUBTS_LONG_RFD_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DOUBTS_LONG_PAY_GU
     */
    private BigDecimal CHAN_DOUBTS_LONG_PAY_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DOUBTS_LONG_RFD_GU
     */
    private BigDecimal CHAN_DOUBTS_LONG_RFD_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DOUBTS_LONG_PAY_GT_XA
     */
    private BigDecimal CHAN_DOUBTS_LONG_PAY_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DOUBTS_LONG_RFD_GT_XA
     */
    private BigDecimal CHAN_DOUBTS_LONG_RFD_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DOUBTS_LONG_PAY_GT_TX
     */
    private BigDecimal CHAN_DOUBTS_LONG_PAY_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DOUBTS_LONG_RFD_GT_TX
     */
    private BigDecimal CHAN_DOUBTS_LONG_RFD_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DOUBTS_LONG_PAY_GT_HX
     */
    private BigDecimal CHAN_DOUBTS_LONG_PAY_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DOUBTS_LONG_RFD_GT_HX
     */
    private BigDecimal CHAN_DOUBTS_LONG_RFD_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DOUBTS_LONG_PAY_GT_RX
     */
    private BigDecimal CHAN_DOUBTS_LONG_PAY_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DOUBTS_LONG_RFD_GT_RX
     */
    private BigDecimal CHAN_DOUBTS_LONG_RFD_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DOUBTS_LONG_PAY_GT_BA
     */
    private BigDecimal CHAN_DOUBTS_LONG_PAY_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DOUBTS_LONG_RFD_GT_BA
     */
    private BigDecimal CHAN_DOUBTS_LONG_RFD_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DOUBTS_LONG_PAY_GT_GP
     */
    private BigDecimal CHAN_DOUBTS_LONG_PAY_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DOUBTS_LONG_RFD_GT_GP
     */
    private BigDecimal CHAN_DOUBTS_LONG_RFD_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DOUBTS_LONG_PAY_GT_PN
     */
    private BigDecimal CHAN_DOUBTS_LONG_PAY_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DOUBTS_LONG_RFD_GT_PN
     */
    private BigDecimal CHAN_DOUBTS_LONG_RFD_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DOUBTS_LONG_PAY_AMT
     */
    private BigDecimal CHAN_DOUBTS_LONG_PAY_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DOUBTS_LONG_PAY_COUNT
     */
    private Long CHAN_DOUBTS_LONG_PAY_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DOUBTS_LONG_RFD_AMT
     */
    private BigDecimal CHAN_DOUBTS_LONG_RFD_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DOUBTS_LONG_RFD_COUNT
     */
    private Long CHAN_DOUBTS_LONG_RFD_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FLAT_PAY_C_AMT
     */
    private BigDecimal CHAN_FLAT_PAY_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FLAT_RFD_C_AMT
     */
    private BigDecimal CHAN_FLAT_RFD_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FLAT_PAY_GI
     */
    private BigDecimal CHAN_FLAT_PAY_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FLAT_RFD_GI
     */
    private BigDecimal CHAN_FLAT_RFD_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FLAT_PAY_GU
     */
    private BigDecimal CHAN_FLAT_PAY_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FLAT_RFD_GU
     */
    private BigDecimal CHAN_FLAT_RFD_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FLAT_PAY_GT_XA
     */
    private BigDecimal CHAN_FLAT_PAY_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FLAT_RFD_GT_XA
     */
    private BigDecimal CHAN_FLAT_RFD_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FLAT_PAY_GT_TX
     */
    private BigDecimal CHAN_FLAT_PAY_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FLAT_RFD_GT_TX
     */
    private BigDecimal CHAN_FLAT_RFD_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FLAT_PAY_GT_HX
     */
    private BigDecimal CHAN_FLAT_PAY_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FLAT_RFD_GT_HX
     */
    private BigDecimal CHAN_FLAT_RFD_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FLAT_PAY_GT_RX
     */
    private BigDecimal CHAN_FLAT_PAY_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FLAT_RFD_GT_RX
     */
    private BigDecimal CHAN_FLAT_RFD_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FLAT_PAY_GT_BA
     */
    private BigDecimal CHAN_FLAT_PAY_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FLAT_RFD_GT_BA
     */
    private BigDecimal CHAN_FLAT_RFD_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FLAT_PAY_GT_GP
     */
    private BigDecimal CHAN_FLAT_PAY_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FLAT_RFD_GT_GP
     */
    private BigDecimal CHAN_FLAT_RFD_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FLAT_PAY_GT_PN
     */
    private BigDecimal CHAN_FLAT_PAY_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FLAT_RFD_GT_PN
     */
    private BigDecimal CHAN_FLAT_RFD_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FLAT_PAY_AMT
     */
    private BigDecimal CHAN_FLAT_PAY_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FLAT_PAY_COUNT
     */
    private Long CHAN_FLAT_PAY_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FLAT_RFD_AMT
     */
    private BigDecimal CHAN_FLAT_RFD_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_FLAT_RFD_COUNT
     */
    private Long CHAN_FLAT_RFD_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO_FLAT_PAY_C_AMT
     */
    private BigDecimal CHAN_NO_FLAT_PAY_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO_FLAT_RFD_C_AMT
     */
    private BigDecimal CHAN_NO_FLAT_RFD_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO_FLAT_PAY_GI
     */
    private BigDecimal CHAN_NO_FLAT_PAY_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO_FLAT_RFD_GI
     */
    private BigDecimal CHAN_NO_FLAT_RFD_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO_FLAT_PAY_GU
     */
    private BigDecimal CHAN_NO_FLAT_PAY_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO_FLAT_RFD_GU
     */
    private BigDecimal CHAN_NO_FLAT_RFD_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO_FLAT_PAY_GT_XA
     */
    private BigDecimal CHAN_NO_FLAT_PAY_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO_FLAT_RFD_GT_XA
     */
    private BigDecimal CHAN_NO_FLAT_RFD_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO_FLAT_PAY_GT_TX
     */
    private BigDecimal CHAN_NO_FLAT_PAY_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO_FLAT_RFD_GT_TX
     */
    private BigDecimal CHAN_NO_FLAT_RFD_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO_FLAT_PAY_GT_HX
     */
    private BigDecimal CHAN_NO_FLAT_PAY_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO_FLAT_RFD_GT_HX
     */
    private BigDecimal CHAN_NO_FLAT_RFD_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO_FLAT_PAY_GT_RX
     */
    private BigDecimal CHAN_NO_FLAT_PAY_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO_FLAT_RFD_GT_RX
     */
    private BigDecimal CHAN_NO_FLAT_RFD_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO_FLAT_PAY_GT_BA
     */
    private BigDecimal CHAN_NO_FLAT_PAY_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO_FLAT_RFD_GT_BA
     */
    private BigDecimal CHAN_NO_FLAT_RFD_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO_FLAT_PAY_GT_GP
     */
    private BigDecimal CHAN_NO_FLAT_PAY_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO_FLAT_RFD_GT_GP
     */
    private BigDecimal CHAN_NO_FLAT_RFD_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO_FLAT_PAY_GT_PN
     */
    private BigDecimal CHAN_NO_FLAT_PAY_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO_FLAT_RFD_GT_PN
     */
    private BigDecimal CHAN_NO_FLAT_RFD_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO_FLAT_PAY_AMT
     */
    private BigDecimal CHAN_NO_FLAT_PAY_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO_FLAT_PAY_COUNT
     */
    private Long CHAN_NO_FLAT_PAY_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO_FLAT_RFD_AMT
     */
    private BigDecimal CHAN_NO_FLAT_RFD_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_NO_FLAT_RFD_COUNT
     */
    private Long CHAN_NO_FLAT_RFD_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_FLAT_PAY_C_AMT
     */
    private BigDecimal DOUBTS_LONG_FLAT_PAY_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_FLAT_RFD_C_AMT
     */
    private BigDecimal DOUBTS_LONG_FLAT_RFD_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_FLAT_PAY_GI
     */
    private BigDecimal DOUBTS_LONG_FLAT_PAY_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_FLAT_RFD_GI
     */
    private BigDecimal DOUBTS_LONG_FLAT_RFD_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_FLAT_PAY_GU
     */
    private BigDecimal DOUBTS_LONG_FLAT_PAY_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_FLAT_RFD_GU
     */
    private BigDecimal DOUBTS_LONG_FLAT_RFD_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_FLAT_PAY_GT_XA
     */
    private BigDecimal DOUBTS_LONG_FLAT_PAY_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_FLAT_RFD_GT_XA
     */
    private BigDecimal DOUBTS_LONG_FLAT_RFD_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_FLAT_PAY_GT_TX
     */
    private BigDecimal DOUBTS_LONG_FLAT_PAY_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_FLAT_RFD_GT_TX
     */
    private BigDecimal DOUBTS_LONG_FLAT_RFD_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_FLAT_PAY_GT_HX
     */
    private BigDecimal DOUBTS_LONG_FLAT_PAY_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_FLAT_RFD_GT_HX
     */
    private BigDecimal DOUBTS_LONG_FLAT_RFD_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_FLAT_PAY_GT_RX
     */
    private BigDecimal DOUBTS_LONG_FLAT_PAY_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_FLAT_RFD_GT_RX
     */
    private BigDecimal DOUBTS_LONG_FLAT_RFD_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_FLAT_PAY_GT_BA
     */
    private BigDecimal DOUBTS_LONG_FLAT_PAY_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_FLAT_RFD_GT_BA
     */
    private BigDecimal DOUBTS_LONG_FLAT_RFD_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_FLAT_PAY_GT_GP
     */
    private BigDecimal DOUBTS_LONG_FLAT_PAY_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_FLAT_RFD_GT_GP
     */
    private BigDecimal DOUBTS_LONG_FLAT_RFD_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_FLAT_PAY_GT_PN
     */
    private BigDecimal DOUBTS_LONG_FLAT_PAY_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_FLAT_RFD_GT_PN
     */
    private BigDecimal DOUBTS_LONG_FLAT_RFD_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_FLAT_PAY_AMT
     */
    private BigDecimal DOUBTS_LONG_FLAT_PAY_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_FLAT_PAY_COUNT
     */
    private Long DOUBTS_LONG_FLAT_PAY_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_FLAT_RFD_AMT
     */
    private BigDecimal DOUBTS_LONG_FLAT_RFD_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_FLAT_RFD_COUNT
     */
    private Long DOUBTS_LONG_FLAT_RFD_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_NO_FLAT_PAY_C_AMT
     */
    private BigDecimal DOUBTS_LONG_NO_FLAT_PAY_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_NO_FLAT_RFD_C_AMT
     */
    private BigDecimal DOUBTS_LONG_NO_FLAT_RFD_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_NO_FLAT_PAY_GI
     */
    private BigDecimal DOUBTS_LONG_NO_FLAT_PAY_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_NO_FLAT_RFD_GI
     */
    private BigDecimal DOUBTS_LONG_NO_FLAT_RFD_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_NO_FLAT_PAY_GU
     */
    private BigDecimal DOUBTS_LONG_NO_FLAT_PAY_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_NO_FLAT_RFD_GU
     */
    private BigDecimal DOUBTS_LONG_NO_FLAT_RFD_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_NO_FLAT_PAY_GT_XA
     */
    private BigDecimal DOUBTS_LONG_NO_FLAT_PAY_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_NO_FLAT_RFD_GT_XA
     */
    private BigDecimal DOUBTS_LONG_NO_FLAT_RFD_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_NO_FLAT_PAY_GT_TX
     */
    private BigDecimal DOUBTS_LONG_NO_FLAT_PAY_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_NO_FLAT_RFD_GT_TX
     */
    private BigDecimal DOUBTS_LONG_NO_FLAT_RFD_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_NO_FLAT_PAY_GT_HX
     */
    private BigDecimal DOUBTS_LONG_NO_FLAT_PAY_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_NO_FLAT_RFD_GT_HX
     */
    private BigDecimal DOUBTS_LONG_NO_FLAT_RFD_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_NO_FLAT_PAY_GT_RX
     */
    private BigDecimal DOUBTS_LONG_NO_FLAT_PAY_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_NO_FLAT_RFD_GT_RX
     */
    private BigDecimal DOUBTS_LONG_NO_FLAT_RFD_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_NO_FLAT_PAY_GT_BA
     */
    private BigDecimal DOUBTS_LONG_NO_FLAT_PAY_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_NO_FLAT_RFD_GT_BA
     */
    private BigDecimal DOUBTS_LONG_NO_FLAT_RFD_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_NO_FLAT_PAY_GT_GP
     */
    private BigDecimal DOUBTS_LONG_NO_FLAT_PAY_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_NO_FLAT_RFD_GT_GP
     */
    private BigDecimal DOUBTS_LONG_NO_FLAT_RFD_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_NO_FLAT_PAY_GT_PN
     */
    private BigDecimal DOUBTS_LONG_NO_FLAT_PAY_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_NO_FLAT_RFD_GT_PN
     */
    private BigDecimal DOUBTS_LONG_NO_FLAT_RFD_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_NO_FLAT_PAY_AMT
     */
    private BigDecimal DOUBTS_LONG_NO_FLAT_PAY_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_NO_FLAT_PAY_COUNT
     */
    private Long DOUBTS_LONG_NO_FLAT_PAY_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_NO_FLAT_RFD_AMT
     */
    private BigDecimal DOUBTS_LONG_NO_FLAT_RFD_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : DOUBTS_LONG_NO_FLAT_RFD_COUNT
     */
    private Long DOUBTS_LONG_NO_FLAT_RFD_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DIFFE_LONG_PAY_C_AMT
     */
    private BigDecimal CHAN_DIFFE_LONG_PAY_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DIFFE_LONG_RFD_C_AMT
     */
    private BigDecimal CHAN_DIFFE_LONG_RFD_C_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DIFFE_LONG_PAY_GI
     */
    private BigDecimal CHAN_DIFFE_LONG_PAY_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DIFFE_LONG_RFD_GI
     */
    private BigDecimal CHAN_DIFFE_LONG_RFD_GI;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DIFFE_LONG_PAY_GU
     */
    private BigDecimal CHAN_DIFFE_LONG_PAY_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DIFFE_LONG_RFD_GU
     */
    private BigDecimal CHAN_DIFFE_LONG_RFD_GU;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DIFFE_LONG_PAY_GT_XA
     */
    private BigDecimal CHAN_DIFFE_LONG_PAY_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DIFFE_LONG_RFD_GT_XA
     */
    private BigDecimal CHAN_DIFFE_LONG_RFD_GT_XA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DIFFE_LONG_PAY_GT_TX
     */
    private BigDecimal CHAN_DIFFE_LONG_PAY_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DIFFE_LONG_RFD_GT_TX
     */
    private BigDecimal CHAN_DIFFE_LONG_RFD_GT_TX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DIFFE_LONG_PAY_GT_HX
     */
    private BigDecimal CHAN_DIFFE_LONG_PAY_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DIFFE_LONG_RFD_GT_HX
     */
    private BigDecimal CHAN_DIFFE_LONG_RFD_GT_HX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DIFFE_LONG_PAY_GT_RX
     */
    private BigDecimal CHAN_DIFFE_LONG_PAY_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DIFFE_LONG_RFD_GT_RX
     */
    private BigDecimal CHAN_DIFFE_LONG_RFD_GT_RX;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DIFFE_LONG_PAY_GT_BA
     */
    private BigDecimal CHAN_DIFFE_LONG_PAY_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DIFFE_LONG_RFD_GT_BA
     */
    private BigDecimal CHAN_DIFFE_LONG_RFD_GT_BA;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DIFFE_LONG_PAY_GT_GP
     */
    private BigDecimal CHAN_DIFFE_LONG_PAY_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DIFFE_LONG_RFD_GT_GP
     */
    private BigDecimal CHAN_DIFFE_LONG_RFD_GT_GP;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DIFFE_LONG_PAY_GT_PN
     */
    private BigDecimal CHAN_DIFFE_LONG_PAY_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DIFFE_LONG_RFD_GT_PN
     */
    private BigDecimal CHAN_DIFFE_LONG_RFD_GT_PN;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DIFFE_LONG_PAY_AMT
     */
    private BigDecimal CHAN_DIFFE_LONG_PAY_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DIFFE_LONG_PAY_COUNT
     */
    private Long CHAN_DIFFE_LONG_PAY_COUNT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DIFFE_LONG_RFD_AMT
     */
    private BigDecimal CHAN_DIFFE_LONG_RFD_AMT;

    /**
     * 表 : IECPAY.CHECK_ACC_INFO
     * 对应字段 : CHAN_DIFFE_LONG_RFD_COUNT
     */
    private Long CHAN_DIFFE_LONG_RFD_COUNT;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table IECPAY.CHECK_ACC_INFO
     *
     * @MBG Generated Mon May 15 19:01:43 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.TASK_ID：null
     */
    public String getTASK_ID() {
        return TASK_ID;
    }

    /**
     * set method 
     *
     * @param TASK_ID  null
     */
    public void setTASK_ID(String TASK_ID) {
        this.TASK_ID = TASK_ID == null ? null : TASK_ID.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO：null
     */
    public String getCHAN_NO() {
        return CHAN_NO;
    }

    /**
     * set method 
     *
     * @param CHAN_NO  null
     */
    public void setCHAN_NO(String CHAN_NO) {
        this.CHAN_NO = CHAN_NO == null ? null : CHAN_NO.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHECK_DT：null
     */
    public String getCHECK_DT() {
        return CHECK_DT;
    }

    /**
     * set method 
     *
     * @param CHECK_DT  null
     */
    public void setCHECK_DT(String CHECK_DT) {
        this.CHECK_DT = CHECK_DT == null ? null : CHECK_DT.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.AC_DT：null
     */
    public String getAC_DT() {
        return AC_DT;
    }

    /**
     * set method 
     *
     * @param AC_DT  null
     */
    public void setAC_DT(String AC_DT) {
        this.AC_DT = AC_DT == null ? null : AC_DT.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.START_TM：null
     */
    public Date getSTART_TM() {
        return START_TM;
    }

    /**
     * set method 
     *
     * @param START_TM  null
     */
    public void setSTART_TM(Date START_TM) {
        this.START_TM = START_TM;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.END_TM：null
     */
    public Date getEND_TM() {
        return END_TM;
    }

    /**
     * set method 
     *
     * @param END_TM  null
     */
    public void setEND_TM(Date END_TM) {
        this.END_TM = END_TM;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHECK_STATE：null
     */
    public Integer getCHECK_STATE() {
        return CHECK_STATE;
    }

    /**
     * set method 
     *
     * @param CHECK_STATE  null
     */
    public void setCHECK_STATE(Integer CHECK_STATE) {
        this.CHECK_STATE = CHECK_STATE;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.REMARK：null
     */
    public String getREMARK() {
        return REMARK;
    }

    /**
     * set method 
     *
     * @param REMARK  null
     */
    public void setREMARK(String REMARK) {
        this.REMARK = REMARK == null ? null : REMARK.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FILENAME：null
     */
    public String getCHAN_FILENAME() {
        return CHAN_FILENAME;
    }

    /**
     * set method 
     *
     * @param CHAN_FILENAME  null
     */
    public void setCHAN_FILENAME(String CHAN_FILENAME) {
        this.CHAN_FILENAME = CHAN_FILENAME == null ? null : CHAN_FILENAME.trim();
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.TRAN_ACC_TO：null
     */
    public Integer getTRAN_ACC_TO() {
        return TRAN_ACC_TO;
    }

    /**
     * set method 
     *
     * @param TRAN_ACC_TO  null
     */
    public void setTRAN_ACC_TO(Integer TRAN_ACC_TO) {
        this.TRAN_ACC_TO = TRAN_ACC_TO;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.TRAN_ACC_AMT：null
     */
    public BigDecimal getTRAN_ACC_AMT() {
        return TRAN_ACC_AMT;
    }

    /**
     * set method 
     *
     * @param TRAN_ACC_AMT  null
     */
    public void setTRAN_ACC_AMT(BigDecimal TRAN_ACC_AMT) {
        this.TRAN_ACC_AMT = TRAN_ACC_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_PAY_TOTAL_C_AMT：null
     */
    public BigDecimal getOUR_PAY_TOTAL_C_AMT() {
        return OUR_PAY_TOTAL_C_AMT;
    }

    /**
     * set method 
     *
     * @param OUR_PAY_TOTAL_C_AMT  null
     */
    public void setOUR_PAY_TOTAL_C_AMT(BigDecimal OUR_PAY_TOTAL_C_AMT) {
        this.OUR_PAY_TOTAL_C_AMT = OUR_PAY_TOTAL_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_RFD_TOTAL_C_AMT：null
     */
    public BigDecimal getOUR_RFD_TOTAL_C_AMT() {
        return OUR_RFD_TOTAL_C_AMT;
    }

    /**
     * set method 
     *
     * @param OUR_RFD_TOTAL_C_AMT  null
     */
    public void setOUR_RFD_TOTAL_C_AMT(BigDecimal OUR_RFD_TOTAL_C_AMT) {
        this.OUR_RFD_TOTAL_C_AMT = OUR_RFD_TOTAL_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_PAY_TOTAL_GI：null
     */
    public BigDecimal getOUR_PAY_TOTAL_GI() {
        return OUR_PAY_TOTAL_GI;
    }

    /**
     * set method 
     *
     * @param OUR_PAY_TOTAL_GI  null
     */
    public void setOUR_PAY_TOTAL_GI(BigDecimal OUR_PAY_TOTAL_GI) {
        this.OUR_PAY_TOTAL_GI = OUR_PAY_TOTAL_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_RFD_TOTAL_GI：null
     */
    public BigDecimal getOUR_RFD_TOTAL_GI() {
        return OUR_RFD_TOTAL_GI;
    }

    /**
     * set method 
     *
     * @param OUR_RFD_TOTAL_GI  null
     */
    public void setOUR_RFD_TOTAL_GI(BigDecimal OUR_RFD_TOTAL_GI) {
        this.OUR_RFD_TOTAL_GI = OUR_RFD_TOTAL_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_PAY_TOTAL_GU：null
     */
    public BigDecimal getOUR_PAY_TOTAL_GU() {
        return OUR_PAY_TOTAL_GU;
    }

    /**
     * set method 
     *
     * @param OUR_PAY_TOTAL_GU  null
     */
    public void setOUR_PAY_TOTAL_GU(BigDecimal OUR_PAY_TOTAL_GU) {
        this.OUR_PAY_TOTAL_GU = OUR_PAY_TOTAL_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_RFD_TOTAL_GU：null
     */
    public BigDecimal getOUR_RFD_TOTAL_GU() {
        return OUR_RFD_TOTAL_GU;
    }

    /**
     * set method 
     *
     * @param OUR_RFD_TOTAL_GU  null
     */
    public void setOUR_RFD_TOTAL_GU(BigDecimal OUR_RFD_TOTAL_GU) {
        this.OUR_RFD_TOTAL_GU = OUR_RFD_TOTAL_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_PAY_TOTAL_GT_XA：null
     */
    public BigDecimal getOUR_PAY_TOTAL_GT_XA() {
        return OUR_PAY_TOTAL_GT_XA;
    }

    /**
     * set method 
     *
     * @param OUR_PAY_TOTAL_GT_XA  null
     */
    public void setOUR_PAY_TOTAL_GT_XA(BigDecimal OUR_PAY_TOTAL_GT_XA) {
        this.OUR_PAY_TOTAL_GT_XA = OUR_PAY_TOTAL_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_RFD_TOTAL_GT_XA：null
     */
    public BigDecimal getOUR_RFD_TOTAL_GT_XA() {
        return OUR_RFD_TOTAL_GT_XA;
    }

    /**
     * set method 
     *
     * @param OUR_RFD_TOTAL_GT_XA  null
     */
    public void setOUR_RFD_TOTAL_GT_XA(BigDecimal OUR_RFD_TOTAL_GT_XA) {
        this.OUR_RFD_TOTAL_GT_XA = OUR_RFD_TOTAL_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_PAY_TOTAL_GT_TX：null
     */
    public BigDecimal getOUR_PAY_TOTAL_GT_TX() {
        return OUR_PAY_TOTAL_GT_TX;
    }

    /**
     * set method 
     *
     * @param OUR_PAY_TOTAL_GT_TX  null
     */
    public void setOUR_PAY_TOTAL_GT_TX(BigDecimal OUR_PAY_TOTAL_GT_TX) {
        this.OUR_PAY_TOTAL_GT_TX = OUR_PAY_TOTAL_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_RFD_TOTAL_GT_TX：null
     */
    public BigDecimal getOUR_RFD_TOTAL_GT_TX() {
        return OUR_RFD_TOTAL_GT_TX;
    }

    /**
     * set method 
     *
     * @param OUR_RFD_TOTAL_GT_TX  null
     */
    public void setOUR_RFD_TOTAL_GT_TX(BigDecimal OUR_RFD_TOTAL_GT_TX) {
        this.OUR_RFD_TOTAL_GT_TX = OUR_RFD_TOTAL_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_PAY_TOTAL_GT_HX：null
     */
    public BigDecimal getOUR_PAY_TOTAL_GT_HX() {
        return OUR_PAY_TOTAL_GT_HX;
    }

    /**
     * set method 
     *
     * @param OUR_PAY_TOTAL_GT_HX  null
     */
    public void setOUR_PAY_TOTAL_GT_HX(BigDecimal OUR_PAY_TOTAL_GT_HX) {
        this.OUR_PAY_TOTAL_GT_HX = OUR_PAY_TOTAL_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_RFD_TOTAL_GT_HX：null
     */
    public BigDecimal getOUR_RFD_TOTAL_GT_HX() {
        return OUR_RFD_TOTAL_GT_HX;
    }

    /**
     * set method 
     *
     * @param OUR_RFD_TOTAL_GT_HX  null
     */
    public void setOUR_RFD_TOTAL_GT_HX(BigDecimal OUR_RFD_TOTAL_GT_HX) {
        this.OUR_RFD_TOTAL_GT_HX = OUR_RFD_TOTAL_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_PAY_TOTAL_GT_RX：null
     */
    public BigDecimal getOUR_PAY_TOTAL_GT_RX() {
        return OUR_PAY_TOTAL_GT_RX;
    }

    /**
     * set method 
     *
     * @param OUR_PAY_TOTAL_GT_RX  null
     */
    public void setOUR_PAY_TOTAL_GT_RX(BigDecimal OUR_PAY_TOTAL_GT_RX) {
        this.OUR_PAY_TOTAL_GT_RX = OUR_PAY_TOTAL_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_RFD_TOTAL_GT_RX：null
     */
    public BigDecimal getOUR_RFD_TOTAL_GT_RX() {
        return OUR_RFD_TOTAL_GT_RX;
    }

    /**
     * set method 
     *
     * @param OUR_RFD_TOTAL_GT_RX  null
     */
    public void setOUR_RFD_TOTAL_GT_RX(BigDecimal OUR_RFD_TOTAL_GT_RX) {
        this.OUR_RFD_TOTAL_GT_RX = OUR_RFD_TOTAL_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_PAY_TOTAL_GT_BA：null
     */
    public BigDecimal getOUR_PAY_TOTAL_GT_BA() {
        return OUR_PAY_TOTAL_GT_BA;
    }

    /**
     * set method 
     *
     * @param OUR_PAY_TOTAL_GT_BA  null
     */
    public void setOUR_PAY_TOTAL_GT_BA(BigDecimal OUR_PAY_TOTAL_GT_BA) {
        this.OUR_PAY_TOTAL_GT_BA = OUR_PAY_TOTAL_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_RFD_TOTAL_GT_BA：null
     */
    public BigDecimal getOUR_RFD_TOTAL_GT_BA() {
        return OUR_RFD_TOTAL_GT_BA;
    }

    /**
     * set method 
     *
     * @param OUR_RFD_TOTAL_GT_BA  null
     */
    public void setOUR_RFD_TOTAL_GT_BA(BigDecimal OUR_RFD_TOTAL_GT_BA) {
        this.OUR_RFD_TOTAL_GT_BA = OUR_RFD_TOTAL_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_PAY_TOTAL_GT_GP：null
     */
    public BigDecimal getOUR_PAY_TOTAL_GT_GP() {
        return OUR_PAY_TOTAL_GT_GP;
    }

    /**
     * set method 
     *
     * @param OUR_PAY_TOTAL_GT_GP  null
     */
    public void setOUR_PAY_TOTAL_GT_GP(BigDecimal OUR_PAY_TOTAL_GT_GP) {
        this.OUR_PAY_TOTAL_GT_GP = OUR_PAY_TOTAL_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_RFD_TOTAL_GT_GP：null
     */
    public BigDecimal getOUR_RFD_TOTAL_GT_GP() {
        return OUR_RFD_TOTAL_GT_GP;
    }

    /**
     * set method 
     *
     * @param OUR_RFD_TOTAL_GT_GP  null
     */
    public void setOUR_RFD_TOTAL_GT_GP(BigDecimal OUR_RFD_TOTAL_GT_GP) {
        this.OUR_RFD_TOTAL_GT_GP = OUR_RFD_TOTAL_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_PAY_TOTAL_GT_PN：null
     */
    public BigDecimal getOUR_PAY_TOTAL_GT_PN() {
        return OUR_PAY_TOTAL_GT_PN;
    }

    /**
     * set method 
     *
     * @param OUR_PAY_TOTAL_GT_PN  null
     */
    public void setOUR_PAY_TOTAL_GT_PN(BigDecimal OUR_PAY_TOTAL_GT_PN) {
        this.OUR_PAY_TOTAL_GT_PN = OUR_PAY_TOTAL_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_RFD_TOTAL_GT_PN：null
     */
    public BigDecimal getOUR_RFD_TOTAL_GT_PN() {
        return OUR_RFD_TOTAL_GT_PN;
    }

    /**
     * set method 
     *
     * @param OUR_RFD_TOTAL_GT_PN  null
     */
    public void setOUR_RFD_TOTAL_GT_PN(BigDecimal OUR_RFD_TOTAL_GT_PN) {
        this.OUR_RFD_TOTAL_GT_PN = OUR_RFD_TOTAL_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_PAY_TOTAL_AMT：null
     */
    public BigDecimal getOUR_PAY_TOTAL_AMT() {
        return OUR_PAY_TOTAL_AMT;
    }

    /**
     * set method 
     *
     * @param OUR_PAY_TOTAL_AMT  null
     */
    public void setOUR_PAY_TOTAL_AMT(BigDecimal OUR_PAY_TOTAL_AMT) {
        this.OUR_PAY_TOTAL_AMT = OUR_PAY_TOTAL_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_PAY_TOTAL_COUNT：null
     */
    public Long getOUR_PAY_TOTAL_COUNT() {
        return OUR_PAY_TOTAL_COUNT;
    }

    /**
     * set method 
     *
     * @param OUR_PAY_TOTAL_COUNT  null
     */
    public void setOUR_PAY_TOTAL_COUNT(Long OUR_PAY_TOTAL_COUNT) {
        this.OUR_PAY_TOTAL_COUNT = OUR_PAY_TOTAL_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_RFD_TOTAL_AMT：null
     */
    public BigDecimal getOUR_RFD_TOTAL_AMT() {
        return OUR_RFD_TOTAL_AMT;
    }

    /**
     * set method 
     *
     * @param OUR_RFD_TOTAL_AMT  null
     */
    public void setOUR_RFD_TOTAL_AMT(BigDecimal OUR_RFD_TOTAL_AMT) {
        this.OUR_RFD_TOTAL_AMT = OUR_RFD_TOTAL_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_RFD_TOTAL_COUNT：null
     */
    public Long getOUR_RFD_TOTAL_COUNT() {
        return OUR_RFD_TOTAL_COUNT;
    }

    /**
     * set method 
     *
     * @param OUR_RFD_TOTAL_COUNT  null
     */
    public void setOUR_RFD_TOTAL_COUNT(Long OUR_RFD_TOTAL_COUNT) {
        this.OUR_RFD_TOTAL_COUNT = OUR_RFD_TOTAL_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DOUBTS_SHORT_PAY_C_AMT：null
     */
    public BigDecimal getOUR_DOUBTS_SHORT_PAY_C_AMT() {
        return OUR_DOUBTS_SHORT_PAY_C_AMT;
    }

    /**
     * set method 
     *
     * @param OUR_DOUBTS_SHORT_PAY_C_AMT  null
     */
    public void setOUR_DOUBTS_SHORT_PAY_C_AMT(BigDecimal OUR_DOUBTS_SHORT_PAY_C_AMT) {
        this.OUR_DOUBTS_SHORT_PAY_C_AMT = OUR_DOUBTS_SHORT_PAY_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DOUBTS_SHORT_RFD_C_AMT：null
     */
    public BigDecimal getOUR_DOUBTS_SHORT_RFD_C_AMT() {
        return OUR_DOUBTS_SHORT_RFD_C_AMT;
    }

    /**
     * set method 
     *
     * @param OUR_DOUBTS_SHORT_RFD_C_AMT  null
     */
    public void setOUR_DOUBTS_SHORT_RFD_C_AMT(BigDecimal OUR_DOUBTS_SHORT_RFD_C_AMT) {
        this.OUR_DOUBTS_SHORT_RFD_C_AMT = OUR_DOUBTS_SHORT_RFD_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DOUBTS_SHORT_PAY_GI：null
     */
    public BigDecimal getOUR_DOUBTS_SHORT_PAY_GI() {
        return OUR_DOUBTS_SHORT_PAY_GI;
    }

    /**
     * set method 
     *
     * @param OUR_DOUBTS_SHORT_PAY_GI  null
     */
    public void setOUR_DOUBTS_SHORT_PAY_GI(BigDecimal OUR_DOUBTS_SHORT_PAY_GI) {
        this.OUR_DOUBTS_SHORT_PAY_GI = OUR_DOUBTS_SHORT_PAY_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DOUBTS_SHORT_RFD_GI：null
     */
    public BigDecimal getOUR_DOUBTS_SHORT_RFD_GI() {
        return OUR_DOUBTS_SHORT_RFD_GI;
    }

    /**
     * set method 
     *
     * @param OUR_DOUBTS_SHORT_RFD_GI  null
     */
    public void setOUR_DOUBTS_SHORT_RFD_GI(BigDecimal OUR_DOUBTS_SHORT_RFD_GI) {
        this.OUR_DOUBTS_SHORT_RFD_GI = OUR_DOUBTS_SHORT_RFD_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DOUBTS_SHORT_PAY_GU：null
     */
    public BigDecimal getOUR_DOUBTS_SHORT_PAY_GU() {
        return OUR_DOUBTS_SHORT_PAY_GU;
    }

    /**
     * set method 
     *
     * @param OUR_DOUBTS_SHORT_PAY_GU  null
     */
    public void setOUR_DOUBTS_SHORT_PAY_GU(BigDecimal OUR_DOUBTS_SHORT_PAY_GU) {
        this.OUR_DOUBTS_SHORT_PAY_GU = OUR_DOUBTS_SHORT_PAY_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DOUBTS_SHORT_RFD_GU：null
     */
    public BigDecimal getOUR_DOUBTS_SHORT_RFD_GU() {
        return OUR_DOUBTS_SHORT_RFD_GU;
    }

    /**
     * set method 
     *
     * @param OUR_DOUBTS_SHORT_RFD_GU  null
     */
    public void setOUR_DOUBTS_SHORT_RFD_GU(BigDecimal OUR_DOUBTS_SHORT_RFD_GU) {
        this.OUR_DOUBTS_SHORT_RFD_GU = OUR_DOUBTS_SHORT_RFD_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DOUBTS_SHORT_PAY_GT_XA：null
     */
    public BigDecimal getOUR_DOUBTS_SHORT_PAY_GT_XA() {
        return OUR_DOUBTS_SHORT_PAY_GT_XA;
    }

    /**
     * set method 
     *
     * @param OUR_DOUBTS_SHORT_PAY_GT_XA  null
     */
    public void setOUR_DOUBTS_SHORT_PAY_GT_XA(BigDecimal OUR_DOUBTS_SHORT_PAY_GT_XA) {
        this.OUR_DOUBTS_SHORT_PAY_GT_XA = OUR_DOUBTS_SHORT_PAY_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DOUBTS_SHORT_RFD_GT_XA：null
     */
    public BigDecimal getOUR_DOUBTS_SHORT_RFD_GT_XA() {
        return OUR_DOUBTS_SHORT_RFD_GT_XA;
    }

    /**
     * set method 
     *
     * @param OUR_DOUBTS_SHORT_RFD_GT_XA  null
     */
    public void setOUR_DOUBTS_SHORT_RFD_GT_XA(BigDecimal OUR_DOUBTS_SHORT_RFD_GT_XA) {
        this.OUR_DOUBTS_SHORT_RFD_GT_XA = OUR_DOUBTS_SHORT_RFD_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DOUBTS_SHORT_PAY_GT_TX：null
     */
    public BigDecimal getOUR_DOUBTS_SHORT_PAY_GT_TX() {
        return OUR_DOUBTS_SHORT_PAY_GT_TX;
    }

    /**
     * set method 
     *
     * @param OUR_DOUBTS_SHORT_PAY_GT_TX  null
     */
    public void setOUR_DOUBTS_SHORT_PAY_GT_TX(BigDecimal OUR_DOUBTS_SHORT_PAY_GT_TX) {
        this.OUR_DOUBTS_SHORT_PAY_GT_TX = OUR_DOUBTS_SHORT_PAY_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DOUBTS_SHORT_RFD_GT_TX：null
     */
    public BigDecimal getOUR_DOUBTS_SHORT_RFD_GT_TX() {
        return OUR_DOUBTS_SHORT_RFD_GT_TX;
    }

    /**
     * set method 
     *
     * @param OUR_DOUBTS_SHORT_RFD_GT_TX  null
     */
    public void setOUR_DOUBTS_SHORT_RFD_GT_TX(BigDecimal OUR_DOUBTS_SHORT_RFD_GT_TX) {
        this.OUR_DOUBTS_SHORT_RFD_GT_TX = OUR_DOUBTS_SHORT_RFD_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DOUBTS_SHORT_PAY_GT_HX：null
     */
    public BigDecimal getOUR_DOUBTS_SHORT_PAY_GT_HX() {
        return OUR_DOUBTS_SHORT_PAY_GT_HX;
    }

    /**
     * set method 
     *
     * @param OUR_DOUBTS_SHORT_PAY_GT_HX  null
     */
    public void setOUR_DOUBTS_SHORT_PAY_GT_HX(BigDecimal OUR_DOUBTS_SHORT_PAY_GT_HX) {
        this.OUR_DOUBTS_SHORT_PAY_GT_HX = OUR_DOUBTS_SHORT_PAY_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DOUBTS_SHORT_RFD_GT_HX：null
     */
    public BigDecimal getOUR_DOUBTS_SHORT_RFD_GT_HX() {
        return OUR_DOUBTS_SHORT_RFD_GT_HX;
    }

    /**
     * set method 
     *
     * @param OUR_DOUBTS_SHORT_RFD_GT_HX  null
     */
    public void setOUR_DOUBTS_SHORT_RFD_GT_HX(BigDecimal OUR_DOUBTS_SHORT_RFD_GT_HX) {
        this.OUR_DOUBTS_SHORT_RFD_GT_HX = OUR_DOUBTS_SHORT_RFD_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DOUBTS_SHORT_PAY_GT_RX：null
     */
    public BigDecimal getOUR_DOUBTS_SHORT_PAY_GT_RX() {
        return OUR_DOUBTS_SHORT_PAY_GT_RX;
    }

    /**
     * set method 
     *
     * @param OUR_DOUBTS_SHORT_PAY_GT_RX  null
     */
    public void setOUR_DOUBTS_SHORT_PAY_GT_RX(BigDecimal OUR_DOUBTS_SHORT_PAY_GT_RX) {
        this.OUR_DOUBTS_SHORT_PAY_GT_RX = OUR_DOUBTS_SHORT_PAY_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DOUBTS_SHORT_RFD_GT_RX：null
     */
    public BigDecimal getOUR_DOUBTS_SHORT_RFD_GT_RX() {
        return OUR_DOUBTS_SHORT_RFD_GT_RX;
    }

    /**
     * set method 
     *
     * @param OUR_DOUBTS_SHORT_RFD_GT_RX  null
     */
    public void setOUR_DOUBTS_SHORT_RFD_GT_RX(BigDecimal OUR_DOUBTS_SHORT_RFD_GT_RX) {
        this.OUR_DOUBTS_SHORT_RFD_GT_RX = OUR_DOUBTS_SHORT_RFD_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DOUBTS_SHORT_PAY_GT_BA：null
     */
    public BigDecimal getOUR_DOUBTS_SHORT_PAY_GT_BA() {
        return OUR_DOUBTS_SHORT_PAY_GT_BA;
    }

    /**
     * set method 
     *
     * @param OUR_DOUBTS_SHORT_PAY_GT_BA  null
     */
    public void setOUR_DOUBTS_SHORT_PAY_GT_BA(BigDecimal OUR_DOUBTS_SHORT_PAY_GT_BA) {
        this.OUR_DOUBTS_SHORT_PAY_GT_BA = OUR_DOUBTS_SHORT_PAY_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DOUBTS_SHORT_RFD_GT_BA：null
     */
    public BigDecimal getOUR_DOUBTS_SHORT_RFD_GT_BA() {
        return OUR_DOUBTS_SHORT_RFD_GT_BA;
    }

    /**
     * set method 
     *
     * @param OUR_DOUBTS_SHORT_RFD_GT_BA  null
     */
    public void setOUR_DOUBTS_SHORT_RFD_GT_BA(BigDecimal OUR_DOUBTS_SHORT_RFD_GT_BA) {
        this.OUR_DOUBTS_SHORT_RFD_GT_BA = OUR_DOUBTS_SHORT_RFD_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DOUBTS_SHORT_PAY_GT_GP：null
     */
    public BigDecimal getOUR_DOUBTS_SHORT_PAY_GT_GP() {
        return OUR_DOUBTS_SHORT_PAY_GT_GP;
    }

    /**
     * set method 
     *
     * @param OUR_DOUBTS_SHORT_PAY_GT_GP  null
     */
    public void setOUR_DOUBTS_SHORT_PAY_GT_GP(BigDecimal OUR_DOUBTS_SHORT_PAY_GT_GP) {
        this.OUR_DOUBTS_SHORT_PAY_GT_GP = OUR_DOUBTS_SHORT_PAY_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DOUBTS_SHORT_RFD_GT_GP：null
     */
    public BigDecimal getOUR_DOUBTS_SHORT_RFD_GT_GP() {
        return OUR_DOUBTS_SHORT_RFD_GT_GP;
    }

    /**
     * set method 
     *
     * @param OUR_DOUBTS_SHORT_RFD_GT_GP  null
     */
    public void setOUR_DOUBTS_SHORT_RFD_GT_GP(BigDecimal OUR_DOUBTS_SHORT_RFD_GT_GP) {
        this.OUR_DOUBTS_SHORT_RFD_GT_GP = OUR_DOUBTS_SHORT_RFD_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DOUBTS_SHORT_PAY_GT_PN：null
     */
    public BigDecimal getOUR_DOUBTS_SHORT_PAY_GT_PN() {
        return OUR_DOUBTS_SHORT_PAY_GT_PN;
    }

    /**
     * set method 
     *
     * @param OUR_DOUBTS_SHORT_PAY_GT_PN  null
     */
    public void setOUR_DOUBTS_SHORT_PAY_GT_PN(BigDecimal OUR_DOUBTS_SHORT_PAY_GT_PN) {
        this.OUR_DOUBTS_SHORT_PAY_GT_PN = OUR_DOUBTS_SHORT_PAY_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DOUBTS_SHORT_RFD_GT_PN：null
     */
    public BigDecimal getOUR_DOUBTS_SHORT_RFD_GT_PN() {
        return OUR_DOUBTS_SHORT_RFD_GT_PN;
    }

    /**
     * set method 
     *
     * @param OUR_DOUBTS_SHORT_RFD_GT_PN  null
     */
    public void setOUR_DOUBTS_SHORT_RFD_GT_PN(BigDecimal OUR_DOUBTS_SHORT_RFD_GT_PN) {
        this.OUR_DOUBTS_SHORT_RFD_GT_PN = OUR_DOUBTS_SHORT_RFD_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DOUBTS_SHORT_PAY_AMT：null
     */
    public BigDecimal getOUR_DOUBTS_SHORT_PAY_AMT() {
        return OUR_DOUBTS_SHORT_PAY_AMT;
    }

    /**
     * set method 
     *
     * @param OUR_DOUBTS_SHORT_PAY_AMT  null
     */
    public void setOUR_DOUBTS_SHORT_PAY_AMT(BigDecimal OUR_DOUBTS_SHORT_PAY_AMT) {
        this.OUR_DOUBTS_SHORT_PAY_AMT = OUR_DOUBTS_SHORT_PAY_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DOUBTS_SHORT_PAY_COUNT：null
     */
    public Long getOUR_DOUBTS_SHORT_PAY_COUNT() {
        return OUR_DOUBTS_SHORT_PAY_COUNT;
    }

    /**
     * set method 
     *
     * @param OUR_DOUBTS_SHORT_PAY_COUNT  null
     */
    public void setOUR_DOUBTS_SHORT_PAY_COUNT(Long OUR_DOUBTS_SHORT_PAY_COUNT) {
        this.OUR_DOUBTS_SHORT_PAY_COUNT = OUR_DOUBTS_SHORT_PAY_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DOUBTS_SHORT_RFD_AMT：null
     */
    public BigDecimal getOUR_DOUBTS_SHORT_RFD_AMT() {
        return OUR_DOUBTS_SHORT_RFD_AMT;
    }

    /**
     * set method 
     *
     * @param OUR_DOUBTS_SHORT_RFD_AMT  null
     */
    public void setOUR_DOUBTS_SHORT_RFD_AMT(BigDecimal OUR_DOUBTS_SHORT_RFD_AMT) {
        this.OUR_DOUBTS_SHORT_RFD_AMT = OUR_DOUBTS_SHORT_RFD_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DOUBTS_SHORT_RFD_COUNT：null
     */
    public Long getOUR_DOUBTS_SHORT_RFD_COUNT() {
        return OUR_DOUBTS_SHORT_RFD_COUNT;
    }

    /**
     * set method 
     *
     * @param OUR_DOUBTS_SHORT_RFD_COUNT  null
     */
    public void setOUR_DOUBTS_SHORT_RFD_COUNT(Long OUR_DOUBTS_SHORT_RFD_COUNT) {
        this.OUR_DOUBTS_SHORT_RFD_COUNT = OUR_DOUBTS_SHORT_RFD_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_FLAT_PAY_C_AMT：null
     */
    public BigDecimal getOUR_FLAT_PAY_C_AMT() {
        return OUR_FLAT_PAY_C_AMT;
    }

    /**
     * set method 
     *
     * @param OUR_FLAT_PAY_C_AMT  null
     */
    public void setOUR_FLAT_PAY_C_AMT(BigDecimal OUR_FLAT_PAY_C_AMT) {
        this.OUR_FLAT_PAY_C_AMT = OUR_FLAT_PAY_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_FLAT_RFD_C_AMT：null
     */
    public BigDecimal getOUR_FLAT_RFD_C_AMT() {
        return OUR_FLAT_RFD_C_AMT;
    }

    /**
     * set method 
     *
     * @param OUR_FLAT_RFD_C_AMT  null
     */
    public void setOUR_FLAT_RFD_C_AMT(BigDecimal OUR_FLAT_RFD_C_AMT) {
        this.OUR_FLAT_RFD_C_AMT = OUR_FLAT_RFD_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_FLAT_PAY_GI：null
     */
    public BigDecimal getOUR_FLAT_PAY_GI() {
        return OUR_FLAT_PAY_GI;
    }

    /**
     * set method 
     *
     * @param OUR_FLAT_PAY_GI  null
     */
    public void setOUR_FLAT_PAY_GI(BigDecimal OUR_FLAT_PAY_GI) {
        this.OUR_FLAT_PAY_GI = OUR_FLAT_PAY_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_FLAT_RFD_GI：null
     */
    public BigDecimal getOUR_FLAT_RFD_GI() {
        return OUR_FLAT_RFD_GI;
    }

    /**
     * set method 
     *
     * @param OUR_FLAT_RFD_GI  null
     */
    public void setOUR_FLAT_RFD_GI(BigDecimal OUR_FLAT_RFD_GI) {
        this.OUR_FLAT_RFD_GI = OUR_FLAT_RFD_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_FLAT_PAY_GU：null
     */
    public BigDecimal getOUR_FLAT_PAY_GU() {
        return OUR_FLAT_PAY_GU;
    }

    /**
     * set method 
     *
     * @param OUR_FLAT_PAY_GU  null
     */
    public void setOUR_FLAT_PAY_GU(BigDecimal OUR_FLAT_PAY_GU) {
        this.OUR_FLAT_PAY_GU = OUR_FLAT_PAY_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_FLAT_RFD_GU：null
     */
    public BigDecimal getOUR_FLAT_RFD_GU() {
        return OUR_FLAT_RFD_GU;
    }

    /**
     * set method 
     *
     * @param OUR_FLAT_RFD_GU  null
     */
    public void setOUR_FLAT_RFD_GU(BigDecimal OUR_FLAT_RFD_GU) {
        this.OUR_FLAT_RFD_GU = OUR_FLAT_RFD_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_FLAT_PAY_GT_XA：null
     */
    public BigDecimal getOUR_FLAT_PAY_GT_XA() {
        return OUR_FLAT_PAY_GT_XA;
    }

    /**
     * set method 
     *
     * @param OUR_FLAT_PAY_GT_XA  null
     */
    public void setOUR_FLAT_PAY_GT_XA(BigDecimal OUR_FLAT_PAY_GT_XA) {
        this.OUR_FLAT_PAY_GT_XA = OUR_FLAT_PAY_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_FLAT_RFD_GT_XA：null
     */
    public BigDecimal getOUR_FLAT_RFD_GT_XA() {
        return OUR_FLAT_RFD_GT_XA;
    }

    /**
     * set method 
     *
     * @param OUR_FLAT_RFD_GT_XA  null
     */
    public void setOUR_FLAT_RFD_GT_XA(BigDecimal OUR_FLAT_RFD_GT_XA) {
        this.OUR_FLAT_RFD_GT_XA = OUR_FLAT_RFD_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_FLAT_PAY_GT_TX：null
     */
    public BigDecimal getOUR_FLAT_PAY_GT_TX() {
        return OUR_FLAT_PAY_GT_TX;
    }

    /**
     * set method 
     *
     * @param OUR_FLAT_PAY_GT_TX  null
     */
    public void setOUR_FLAT_PAY_GT_TX(BigDecimal OUR_FLAT_PAY_GT_TX) {
        this.OUR_FLAT_PAY_GT_TX = OUR_FLAT_PAY_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_FLAT_RFD_GT_TX：null
     */
    public BigDecimal getOUR_FLAT_RFD_GT_TX() {
        return OUR_FLAT_RFD_GT_TX;
    }

    /**
     * set method 
     *
     * @param OUR_FLAT_RFD_GT_TX  null
     */
    public void setOUR_FLAT_RFD_GT_TX(BigDecimal OUR_FLAT_RFD_GT_TX) {
        this.OUR_FLAT_RFD_GT_TX = OUR_FLAT_RFD_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_FLAT_PAY_GT_HX：null
     */
    public BigDecimal getOUR_FLAT_PAY_GT_HX() {
        return OUR_FLAT_PAY_GT_HX;
    }

    /**
     * set method 
     *
     * @param OUR_FLAT_PAY_GT_HX  null
     */
    public void setOUR_FLAT_PAY_GT_HX(BigDecimal OUR_FLAT_PAY_GT_HX) {
        this.OUR_FLAT_PAY_GT_HX = OUR_FLAT_PAY_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_FLAT_RFD_GT_HX：null
     */
    public BigDecimal getOUR_FLAT_RFD_GT_HX() {
        return OUR_FLAT_RFD_GT_HX;
    }

    /**
     * set method 
     *
     * @param OUR_FLAT_RFD_GT_HX  null
     */
    public void setOUR_FLAT_RFD_GT_HX(BigDecimal OUR_FLAT_RFD_GT_HX) {
        this.OUR_FLAT_RFD_GT_HX = OUR_FLAT_RFD_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_FLAT_PAY_GT_RX：null
     */
    public BigDecimal getOUR_FLAT_PAY_GT_RX() {
        return OUR_FLAT_PAY_GT_RX;
    }

    /**
     * set method 
     *
     * @param OUR_FLAT_PAY_GT_RX  null
     */
    public void setOUR_FLAT_PAY_GT_RX(BigDecimal OUR_FLAT_PAY_GT_RX) {
        this.OUR_FLAT_PAY_GT_RX = OUR_FLAT_PAY_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_FLAT_RFD_GT_RX：null
     */
    public BigDecimal getOUR_FLAT_RFD_GT_RX() {
        return OUR_FLAT_RFD_GT_RX;
    }

    /**
     * set method 
     *
     * @param OUR_FLAT_RFD_GT_RX  null
     */
    public void setOUR_FLAT_RFD_GT_RX(BigDecimal OUR_FLAT_RFD_GT_RX) {
        this.OUR_FLAT_RFD_GT_RX = OUR_FLAT_RFD_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_FLAT_PAY_GT_BA：null
     */
    public BigDecimal getOUR_FLAT_PAY_GT_BA() {
        return OUR_FLAT_PAY_GT_BA;
    }

    /**
     * set method 
     *
     * @param OUR_FLAT_PAY_GT_BA  null
     */
    public void setOUR_FLAT_PAY_GT_BA(BigDecimal OUR_FLAT_PAY_GT_BA) {
        this.OUR_FLAT_PAY_GT_BA = OUR_FLAT_PAY_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_FLAT_RFD_GT_BA：null
     */
    public BigDecimal getOUR_FLAT_RFD_GT_BA() {
        return OUR_FLAT_RFD_GT_BA;
    }

    /**
     * set method 
     *
     * @param OUR_FLAT_RFD_GT_BA  null
     */
    public void setOUR_FLAT_RFD_GT_BA(BigDecimal OUR_FLAT_RFD_GT_BA) {
        this.OUR_FLAT_RFD_GT_BA = OUR_FLAT_RFD_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_FLAT_PAY_GT_GP：null
     */
    public BigDecimal getOUR_FLAT_PAY_GT_GP() {
        return OUR_FLAT_PAY_GT_GP;
    }

    /**
     * set method 
     *
     * @param OUR_FLAT_PAY_GT_GP  null
     */
    public void setOUR_FLAT_PAY_GT_GP(BigDecimal OUR_FLAT_PAY_GT_GP) {
        this.OUR_FLAT_PAY_GT_GP = OUR_FLAT_PAY_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_FLAT_RFD_GT_GP：null
     */
    public BigDecimal getOUR_FLAT_RFD_GT_GP() {
        return OUR_FLAT_RFD_GT_GP;
    }

    /**
     * set method 
     *
     * @param OUR_FLAT_RFD_GT_GP  null
     */
    public void setOUR_FLAT_RFD_GT_GP(BigDecimal OUR_FLAT_RFD_GT_GP) {
        this.OUR_FLAT_RFD_GT_GP = OUR_FLAT_RFD_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_FLAT_PAY_GT_PN：null
     */
    public BigDecimal getOUR_FLAT_PAY_GT_PN() {
        return OUR_FLAT_PAY_GT_PN;
    }

    /**
     * set method 
     *
     * @param OUR_FLAT_PAY_GT_PN  null
     */
    public void setOUR_FLAT_PAY_GT_PN(BigDecimal OUR_FLAT_PAY_GT_PN) {
        this.OUR_FLAT_PAY_GT_PN = OUR_FLAT_PAY_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_FLAT_RFD_GT_PN：null
     */
    public BigDecimal getOUR_FLAT_RFD_GT_PN() {
        return OUR_FLAT_RFD_GT_PN;
    }

    /**
     * set method 
     *
     * @param OUR_FLAT_RFD_GT_PN  null
     */
    public void setOUR_FLAT_RFD_GT_PN(BigDecimal OUR_FLAT_RFD_GT_PN) {
        this.OUR_FLAT_RFD_GT_PN = OUR_FLAT_RFD_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_FLAT_PAY_AMT：null
     */
    public BigDecimal getOUR_FLAT_PAY_AMT() {
        return OUR_FLAT_PAY_AMT;
    }

    /**
     * set method 
     *
     * @param OUR_FLAT_PAY_AMT  null
     */
    public void setOUR_FLAT_PAY_AMT(BigDecimal OUR_FLAT_PAY_AMT) {
        this.OUR_FLAT_PAY_AMT = OUR_FLAT_PAY_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_FLAT_PAY_COUNT：null
     */
    public Long getOUR_FLAT_PAY_COUNT() {
        return OUR_FLAT_PAY_COUNT;
    }

    /**
     * set method 
     *
     * @param OUR_FLAT_PAY_COUNT  null
     */
    public void setOUR_FLAT_PAY_COUNT(Long OUR_FLAT_PAY_COUNT) {
        this.OUR_FLAT_PAY_COUNT = OUR_FLAT_PAY_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_FLAT_RFD_AMT：null
     */
    public BigDecimal getOUR_FLAT_RFD_AMT() {
        return OUR_FLAT_RFD_AMT;
    }

    /**
     * set method 
     *
     * @param OUR_FLAT_RFD_AMT  null
     */
    public void setOUR_FLAT_RFD_AMT(BigDecimal OUR_FLAT_RFD_AMT) {
        this.OUR_FLAT_RFD_AMT = OUR_FLAT_RFD_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_FLAT_RFD_COUNT：null
     */
    public Long getOUR_FLAT_RFD_COUNT() {
        return OUR_FLAT_RFD_COUNT;
    }

    /**
     * set method 
     *
     * @param OUR_FLAT_RFD_COUNT  null
     */
    public void setOUR_FLAT_RFD_COUNT(Long OUR_FLAT_RFD_COUNT) {
        this.OUR_FLAT_RFD_COUNT = OUR_FLAT_RFD_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_NO_FLAT_PAY_C_AMT：null
     */
    public BigDecimal getOUR_NO_FLAT_PAY_C_AMT() {
        return OUR_NO_FLAT_PAY_C_AMT;
    }

    /**
     * set method 
     *
     * @param OUR_NO_FLAT_PAY_C_AMT  null
     */
    public void setOUR_NO_FLAT_PAY_C_AMT(BigDecimal OUR_NO_FLAT_PAY_C_AMT) {
        this.OUR_NO_FLAT_PAY_C_AMT = OUR_NO_FLAT_PAY_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_NO_FLAT_RFD_C_AMT：null
     */
    public BigDecimal getOUR_NO_FLAT_RFD_C_AMT() {
        return OUR_NO_FLAT_RFD_C_AMT;
    }

    /**
     * set method 
     *
     * @param OUR_NO_FLAT_RFD_C_AMT  null
     */
    public void setOUR_NO_FLAT_RFD_C_AMT(BigDecimal OUR_NO_FLAT_RFD_C_AMT) {
        this.OUR_NO_FLAT_RFD_C_AMT = OUR_NO_FLAT_RFD_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_NO_FLAT_PAY_GI：null
     */
    public BigDecimal getOUR_NO_FLAT_PAY_GI() {
        return OUR_NO_FLAT_PAY_GI;
    }

    /**
     * set method 
     *
     * @param OUR_NO_FLAT_PAY_GI  null
     */
    public void setOUR_NO_FLAT_PAY_GI(BigDecimal OUR_NO_FLAT_PAY_GI) {
        this.OUR_NO_FLAT_PAY_GI = OUR_NO_FLAT_PAY_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_NO_FLAT_RFD_GI：null
     */
    public BigDecimal getOUR_NO_FLAT_RFD_GI() {
        return OUR_NO_FLAT_RFD_GI;
    }

    /**
     * set method 
     *
     * @param OUR_NO_FLAT_RFD_GI  null
     */
    public void setOUR_NO_FLAT_RFD_GI(BigDecimal OUR_NO_FLAT_RFD_GI) {
        this.OUR_NO_FLAT_RFD_GI = OUR_NO_FLAT_RFD_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_NO_FLAT_PAY_GU：null
     */
    public BigDecimal getOUR_NO_FLAT_PAY_GU() {
        return OUR_NO_FLAT_PAY_GU;
    }

    /**
     * set method 
     *
     * @param OUR_NO_FLAT_PAY_GU  null
     */
    public void setOUR_NO_FLAT_PAY_GU(BigDecimal OUR_NO_FLAT_PAY_GU) {
        this.OUR_NO_FLAT_PAY_GU = OUR_NO_FLAT_PAY_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_NO_FLAT_RFD_GU：null
     */
    public BigDecimal getOUR_NO_FLAT_RFD_GU() {
        return OUR_NO_FLAT_RFD_GU;
    }

    /**
     * set method 
     *
     * @param OUR_NO_FLAT_RFD_GU  null
     */
    public void setOUR_NO_FLAT_RFD_GU(BigDecimal OUR_NO_FLAT_RFD_GU) {
        this.OUR_NO_FLAT_RFD_GU = OUR_NO_FLAT_RFD_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_NO_FLAT_PAY_GT_XA：null
     */
    public BigDecimal getOUR_NO_FLAT_PAY_GT_XA() {
        return OUR_NO_FLAT_PAY_GT_XA;
    }

    /**
     * set method 
     *
     * @param OUR_NO_FLAT_PAY_GT_XA  null
     */
    public void setOUR_NO_FLAT_PAY_GT_XA(BigDecimal OUR_NO_FLAT_PAY_GT_XA) {
        this.OUR_NO_FLAT_PAY_GT_XA = OUR_NO_FLAT_PAY_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_NO_FLAT_RFD_GT_XA：null
     */
    public BigDecimal getOUR_NO_FLAT_RFD_GT_XA() {
        return OUR_NO_FLAT_RFD_GT_XA;
    }

    /**
     * set method 
     *
     * @param OUR_NO_FLAT_RFD_GT_XA  null
     */
    public void setOUR_NO_FLAT_RFD_GT_XA(BigDecimal OUR_NO_FLAT_RFD_GT_XA) {
        this.OUR_NO_FLAT_RFD_GT_XA = OUR_NO_FLAT_RFD_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_NO_FLAT_PAY_GT_TX：null
     */
    public BigDecimal getOUR_NO_FLAT_PAY_GT_TX() {
        return OUR_NO_FLAT_PAY_GT_TX;
    }

    /**
     * set method 
     *
     * @param OUR_NO_FLAT_PAY_GT_TX  null
     */
    public void setOUR_NO_FLAT_PAY_GT_TX(BigDecimal OUR_NO_FLAT_PAY_GT_TX) {
        this.OUR_NO_FLAT_PAY_GT_TX = OUR_NO_FLAT_PAY_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_NO_FLAT_RFD_GT_TX：null
     */
    public BigDecimal getOUR_NO_FLAT_RFD_GT_TX() {
        return OUR_NO_FLAT_RFD_GT_TX;
    }

    /**
     * set method 
     *
     * @param OUR_NO_FLAT_RFD_GT_TX  null
     */
    public void setOUR_NO_FLAT_RFD_GT_TX(BigDecimal OUR_NO_FLAT_RFD_GT_TX) {
        this.OUR_NO_FLAT_RFD_GT_TX = OUR_NO_FLAT_RFD_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_NO_FLAT_PAY_GT_HX：null
     */
    public BigDecimal getOUR_NO_FLAT_PAY_GT_HX() {
        return OUR_NO_FLAT_PAY_GT_HX;
    }

    /**
     * set method 
     *
     * @param OUR_NO_FLAT_PAY_GT_HX  null
     */
    public void setOUR_NO_FLAT_PAY_GT_HX(BigDecimal OUR_NO_FLAT_PAY_GT_HX) {
        this.OUR_NO_FLAT_PAY_GT_HX = OUR_NO_FLAT_PAY_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_NO_FLAT_RFD_GT_HX：null
     */
    public BigDecimal getOUR_NO_FLAT_RFD_GT_HX() {
        return OUR_NO_FLAT_RFD_GT_HX;
    }

    /**
     * set method 
     *
     * @param OUR_NO_FLAT_RFD_GT_HX  null
     */
    public void setOUR_NO_FLAT_RFD_GT_HX(BigDecimal OUR_NO_FLAT_RFD_GT_HX) {
        this.OUR_NO_FLAT_RFD_GT_HX = OUR_NO_FLAT_RFD_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_NO_FLAT_PAY_GT_RX：null
     */
    public BigDecimal getOUR_NO_FLAT_PAY_GT_RX() {
        return OUR_NO_FLAT_PAY_GT_RX;
    }

    /**
     * set method 
     *
     * @param OUR_NO_FLAT_PAY_GT_RX  null
     */
    public void setOUR_NO_FLAT_PAY_GT_RX(BigDecimal OUR_NO_FLAT_PAY_GT_RX) {
        this.OUR_NO_FLAT_PAY_GT_RX = OUR_NO_FLAT_PAY_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_NO_FLAT_RFD_GT_RX：null
     */
    public BigDecimal getOUR_NO_FLAT_RFD_GT_RX() {
        return OUR_NO_FLAT_RFD_GT_RX;
    }

    /**
     * set method 
     *
     * @param OUR_NO_FLAT_RFD_GT_RX  null
     */
    public void setOUR_NO_FLAT_RFD_GT_RX(BigDecimal OUR_NO_FLAT_RFD_GT_RX) {
        this.OUR_NO_FLAT_RFD_GT_RX = OUR_NO_FLAT_RFD_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_NO_FLAT_PAY_GT_BA：null
     */
    public BigDecimal getOUR_NO_FLAT_PAY_GT_BA() {
        return OUR_NO_FLAT_PAY_GT_BA;
    }

    /**
     * set method 
     *
     * @param OUR_NO_FLAT_PAY_GT_BA  null
     */
    public void setOUR_NO_FLAT_PAY_GT_BA(BigDecimal OUR_NO_FLAT_PAY_GT_BA) {
        this.OUR_NO_FLAT_PAY_GT_BA = OUR_NO_FLAT_PAY_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_NO_FLAT_RFD_GT_BA：null
     */
    public BigDecimal getOUR_NO_FLAT_RFD_GT_BA() {
        return OUR_NO_FLAT_RFD_GT_BA;
    }

    /**
     * set method 
     *
     * @param OUR_NO_FLAT_RFD_GT_BA  null
     */
    public void setOUR_NO_FLAT_RFD_GT_BA(BigDecimal OUR_NO_FLAT_RFD_GT_BA) {
        this.OUR_NO_FLAT_RFD_GT_BA = OUR_NO_FLAT_RFD_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_NO_FLAT_PAY_GT_GP：null
     */
    public BigDecimal getOUR_NO_FLAT_PAY_GT_GP() {
        return OUR_NO_FLAT_PAY_GT_GP;
    }

    /**
     * set method 
     *
     * @param OUR_NO_FLAT_PAY_GT_GP  null
     */
    public void setOUR_NO_FLAT_PAY_GT_GP(BigDecimal OUR_NO_FLAT_PAY_GT_GP) {
        this.OUR_NO_FLAT_PAY_GT_GP = OUR_NO_FLAT_PAY_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_NO_FLAT_RFD_GT_GP：null
     */
    public BigDecimal getOUR_NO_FLAT_RFD_GT_GP() {
        return OUR_NO_FLAT_RFD_GT_GP;
    }

    /**
     * set method 
     *
     * @param OUR_NO_FLAT_RFD_GT_GP  null
     */
    public void setOUR_NO_FLAT_RFD_GT_GP(BigDecimal OUR_NO_FLAT_RFD_GT_GP) {
        this.OUR_NO_FLAT_RFD_GT_GP = OUR_NO_FLAT_RFD_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_NO_FLAT_PAY_GT_PN：null
     */
    public BigDecimal getOUR_NO_FLAT_PAY_GT_PN() {
        return OUR_NO_FLAT_PAY_GT_PN;
    }

    /**
     * set method 
     *
     * @param OUR_NO_FLAT_PAY_GT_PN  null
     */
    public void setOUR_NO_FLAT_PAY_GT_PN(BigDecimal OUR_NO_FLAT_PAY_GT_PN) {
        this.OUR_NO_FLAT_PAY_GT_PN = OUR_NO_FLAT_PAY_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_NO_FLAT_RFD_GT_PN：null
     */
    public BigDecimal getOUR_NO_FLAT_RFD_GT_PN() {
        return OUR_NO_FLAT_RFD_GT_PN;
    }

    /**
     * set method 
     *
     * @param OUR_NO_FLAT_RFD_GT_PN  null
     */
    public void setOUR_NO_FLAT_RFD_GT_PN(BigDecimal OUR_NO_FLAT_RFD_GT_PN) {
        this.OUR_NO_FLAT_RFD_GT_PN = OUR_NO_FLAT_RFD_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_NO_FLAT_PAY_AMT：null
     */
    public BigDecimal getOUR_NO_FLAT_PAY_AMT() {
        return OUR_NO_FLAT_PAY_AMT;
    }

    /**
     * set method 
     *
     * @param OUR_NO_FLAT_PAY_AMT  null
     */
    public void setOUR_NO_FLAT_PAY_AMT(BigDecimal OUR_NO_FLAT_PAY_AMT) {
        this.OUR_NO_FLAT_PAY_AMT = OUR_NO_FLAT_PAY_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_NO_FLAT_PAY_COUNT：null
     */
    public Long getOUR_NO_FLAT_PAY_COUNT() {
        return OUR_NO_FLAT_PAY_COUNT;
    }

    /**
     * set method 
     *
     * @param OUR_NO_FLAT_PAY_COUNT  null
     */
    public void setOUR_NO_FLAT_PAY_COUNT(Long OUR_NO_FLAT_PAY_COUNT) {
        this.OUR_NO_FLAT_PAY_COUNT = OUR_NO_FLAT_PAY_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_NO_FLAT_RFD_AMT：null
     */
    public BigDecimal getOUR_NO_FLAT_RFD_AMT() {
        return OUR_NO_FLAT_RFD_AMT;
    }

    /**
     * set method 
     *
     * @param OUR_NO_FLAT_RFD_AMT  null
     */
    public void setOUR_NO_FLAT_RFD_AMT(BigDecimal OUR_NO_FLAT_RFD_AMT) {
        this.OUR_NO_FLAT_RFD_AMT = OUR_NO_FLAT_RFD_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_NO_FLAT_RFD_COUNT：null
     */
    public Long getOUR_NO_FLAT_RFD_COUNT() {
        return OUR_NO_FLAT_RFD_COUNT;
    }

    /**
     * set method 
     *
     * @param OUR_NO_FLAT_RFD_COUNT  null
     */
    public void setOUR_NO_FLAT_RFD_COUNT(Long OUR_NO_FLAT_RFD_COUNT) {
        this.OUR_NO_FLAT_RFD_COUNT = OUR_NO_FLAT_RFD_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_FLAT_PAY_C_AMT：null
     */
    public BigDecimal getDOUBTS_SHORT_FLAT_PAY_C_AMT() {
        return DOUBTS_SHORT_FLAT_PAY_C_AMT;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_FLAT_PAY_C_AMT  null
     */
    public void setDOUBTS_SHORT_FLAT_PAY_C_AMT(BigDecimal DOUBTS_SHORT_FLAT_PAY_C_AMT) {
        this.DOUBTS_SHORT_FLAT_PAY_C_AMT = DOUBTS_SHORT_FLAT_PAY_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_FLAT_RFD_C_AMT：null
     */
    public BigDecimal getDOUBTS_SHORT_FLAT_RFD_C_AMT() {
        return DOUBTS_SHORT_FLAT_RFD_C_AMT;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_FLAT_RFD_C_AMT  null
     */
    public void setDOUBTS_SHORT_FLAT_RFD_C_AMT(BigDecimal DOUBTS_SHORT_FLAT_RFD_C_AMT) {
        this.DOUBTS_SHORT_FLAT_RFD_C_AMT = DOUBTS_SHORT_FLAT_RFD_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_FLAT_PAY_GI：null
     */
    public BigDecimal getDOUBTS_SHORT_FLAT_PAY_GI() {
        return DOUBTS_SHORT_FLAT_PAY_GI;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_FLAT_PAY_GI  null
     */
    public void setDOUBTS_SHORT_FLAT_PAY_GI(BigDecimal DOUBTS_SHORT_FLAT_PAY_GI) {
        this.DOUBTS_SHORT_FLAT_PAY_GI = DOUBTS_SHORT_FLAT_PAY_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_FLAT_RFD_GI：null
     */
    public BigDecimal getDOUBTS_SHORT_FLAT_RFD_GI() {
        return DOUBTS_SHORT_FLAT_RFD_GI;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_FLAT_RFD_GI  null
     */
    public void setDOUBTS_SHORT_FLAT_RFD_GI(BigDecimal DOUBTS_SHORT_FLAT_RFD_GI) {
        this.DOUBTS_SHORT_FLAT_RFD_GI = DOUBTS_SHORT_FLAT_RFD_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_FLAT_PAY_GU：null
     */
    public BigDecimal getDOUBTS_SHORT_FLAT_PAY_GU() {
        return DOUBTS_SHORT_FLAT_PAY_GU;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_FLAT_PAY_GU  null
     */
    public void setDOUBTS_SHORT_FLAT_PAY_GU(BigDecimal DOUBTS_SHORT_FLAT_PAY_GU) {
        this.DOUBTS_SHORT_FLAT_PAY_GU = DOUBTS_SHORT_FLAT_PAY_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_FLAT_RFD_GU：null
     */
    public BigDecimal getDOUBTS_SHORT_FLAT_RFD_GU() {
        return DOUBTS_SHORT_FLAT_RFD_GU;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_FLAT_RFD_GU  null
     */
    public void setDOUBTS_SHORT_FLAT_RFD_GU(BigDecimal DOUBTS_SHORT_FLAT_RFD_GU) {
        this.DOUBTS_SHORT_FLAT_RFD_GU = DOUBTS_SHORT_FLAT_RFD_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_FLAT_PAY_GT_XA：null
     */
    public BigDecimal getDOUBTS_SHORT_FLAT_PAY_GT_XA() {
        return DOUBTS_SHORT_FLAT_PAY_GT_XA;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_FLAT_PAY_GT_XA  null
     */
    public void setDOUBTS_SHORT_FLAT_PAY_GT_XA(BigDecimal DOUBTS_SHORT_FLAT_PAY_GT_XA) {
        this.DOUBTS_SHORT_FLAT_PAY_GT_XA = DOUBTS_SHORT_FLAT_PAY_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_FLAT_RFD_GT_XA：null
     */
    public BigDecimal getDOUBTS_SHORT_FLAT_RFD_GT_XA() {
        return DOUBTS_SHORT_FLAT_RFD_GT_XA;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_FLAT_RFD_GT_XA  null
     */
    public void setDOUBTS_SHORT_FLAT_RFD_GT_XA(BigDecimal DOUBTS_SHORT_FLAT_RFD_GT_XA) {
        this.DOUBTS_SHORT_FLAT_RFD_GT_XA = DOUBTS_SHORT_FLAT_RFD_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_FLAT_PAY_GT_TX：null
     */
    public BigDecimal getDOUBTS_SHORT_FLAT_PAY_GT_TX() {
        return DOUBTS_SHORT_FLAT_PAY_GT_TX;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_FLAT_PAY_GT_TX  null
     */
    public void setDOUBTS_SHORT_FLAT_PAY_GT_TX(BigDecimal DOUBTS_SHORT_FLAT_PAY_GT_TX) {
        this.DOUBTS_SHORT_FLAT_PAY_GT_TX = DOUBTS_SHORT_FLAT_PAY_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_FLAT_RFD_GT_TX：null
     */
    public BigDecimal getDOUBTS_SHORT_FLAT_RFD_GT_TX() {
        return DOUBTS_SHORT_FLAT_RFD_GT_TX;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_FLAT_RFD_GT_TX  null
     */
    public void setDOUBTS_SHORT_FLAT_RFD_GT_TX(BigDecimal DOUBTS_SHORT_FLAT_RFD_GT_TX) {
        this.DOUBTS_SHORT_FLAT_RFD_GT_TX = DOUBTS_SHORT_FLAT_RFD_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_FLAT_PAY_GT_HX：null
     */
    public BigDecimal getDOUBTS_SHORT_FLAT_PAY_GT_HX() {
        return DOUBTS_SHORT_FLAT_PAY_GT_HX;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_FLAT_PAY_GT_HX  null
     */
    public void setDOUBTS_SHORT_FLAT_PAY_GT_HX(BigDecimal DOUBTS_SHORT_FLAT_PAY_GT_HX) {
        this.DOUBTS_SHORT_FLAT_PAY_GT_HX = DOUBTS_SHORT_FLAT_PAY_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_FLAT_RFD_GT_HX：null
     */
    public BigDecimal getDOUBTS_SHORT_FLAT_RFD_GT_HX() {
        return DOUBTS_SHORT_FLAT_RFD_GT_HX;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_FLAT_RFD_GT_HX  null
     */
    public void setDOUBTS_SHORT_FLAT_RFD_GT_HX(BigDecimal DOUBTS_SHORT_FLAT_RFD_GT_HX) {
        this.DOUBTS_SHORT_FLAT_RFD_GT_HX = DOUBTS_SHORT_FLAT_RFD_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_FLAT_PAY_GT_RX：null
     */
    public BigDecimal getDOUBTS_SHORT_FLAT_PAY_GT_RX() {
        return DOUBTS_SHORT_FLAT_PAY_GT_RX;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_FLAT_PAY_GT_RX  null
     */
    public void setDOUBTS_SHORT_FLAT_PAY_GT_RX(BigDecimal DOUBTS_SHORT_FLAT_PAY_GT_RX) {
        this.DOUBTS_SHORT_FLAT_PAY_GT_RX = DOUBTS_SHORT_FLAT_PAY_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_FLAT_RFD_GT_RX：null
     */
    public BigDecimal getDOUBTS_SHORT_FLAT_RFD_GT_RX() {
        return DOUBTS_SHORT_FLAT_RFD_GT_RX;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_FLAT_RFD_GT_RX  null
     */
    public void setDOUBTS_SHORT_FLAT_RFD_GT_RX(BigDecimal DOUBTS_SHORT_FLAT_RFD_GT_RX) {
        this.DOUBTS_SHORT_FLAT_RFD_GT_RX = DOUBTS_SHORT_FLAT_RFD_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_FLAT_PAY_GT_BA：null
     */
    public BigDecimal getDOUBTS_SHORT_FLAT_PAY_GT_BA() {
        return DOUBTS_SHORT_FLAT_PAY_GT_BA;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_FLAT_PAY_GT_BA  null
     */
    public void setDOUBTS_SHORT_FLAT_PAY_GT_BA(BigDecimal DOUBTS_SHORT_FLAT_PAY_GT_BA) {
        this.DOUBTS_SHORT_FLAT_PAY_GT_BA = DOUBTS_SHORT_FLAT_PAY_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_FLAT_RFD_GT_BA：null
     */
    public BigDecimal getDOUBTS_SHORT_FLAT_RFD_GT_BA() {
        return DOUBTS_SHORT_FLAT_RFD_GT_BA;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_FLAT_RFD_GT_BA  null
     */
    public void setDOUBTS_SHORT_FLAT_RFD_GT_BA(BigDecimal DOUBTS_SHORT_FLAT_RFD_GT_BA) {
        this.DOUBTS_SHORT_FLAT_RFD_GT_BA = DOUBTS_SHORT_FLAT_RFD_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_FLAT_PAY_GT_GP：null
     */
    public BigDecimal getDOUBTS_SHORT_FLAT_PAY_GT_GP() {
        return DOUBTS_SHORT_FLAT_PAY_GT_GP;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_FLAT_PAY_GT_GP  null
     */
    public void setDOUBTS_SHORT_FLAT_PAY_GT_GP(BigDecimal DOUBTS_SHORT_FLAT_PAY_GT_GP) {
        this.DOUBTS_SHORT_FLAT_PAY_GT_GP = DOUBTS_SHORT_FLAT_PAY_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_FLAT_RFD_GT_GP：null
     */
    public BigDecimal getDOUBTS_SHORT_FLAT_RFD_GT_GP() {
        return DOUBTS_SHORT_FLAT_RFD_GT_GP;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_FLAT_RFD_GT_GP  null
     */
    public void setDOUBTS_SHORT_FLAT_RFD_GT_GP(BigDecimal DOUBTS_SHORT_FLAT_RFD_GT_GP) {
        this.DOUBTS_SHORT_FLAT_RFD_GT_GP = DOUBTS_SHORT_FLAT_RFD_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_FLAT_PAY_GT_PN：null
     */
    public BigDecimal getDOUBTS_SHORT_FLAT_PAY_GT_PN() {
        return DOUBTS_SHORT_FLAT_PAY_GT_PN;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_FLAT_PAY_GT_PN  null
     */
    public void setDOUBTS_SHORT_FLAT_PAY_GT_PN(BigDecimal DOUBTS_SHORT_FLAT_PAY_GT_PN) {
        this.DOUBTS_SHORT_FLAT_PAY_GT_PN = DOUBTS_SHORT_FLAT_PAY_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_FLAT_RFD_GT_PN：null
     */
    public BigDecimal getDOUBTS_SHORT_FLAT_RFD_GT_PN() {
        return DOUBTS_SHORT_FLAT_RFD_GT_PN;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_FLAT_RFD_GT_PN  null
     */
    public void setDOUBTS_SHORT_FLAT_RFD_GT_PN(BigDecimal DOUBTS_SHORT_FLAT_RFD_GT_PN) {
        this.DOUBTS_SHORT_FLAT_RFD_GT_PN = DOUBTS_SHORT_FLAT_RFD_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_FLAT_PAY_AMT：null
     */
    public BigDecimal getDOUBTS_SHORT_FLAT_PAY_AMT() {
        return DOUBTS_SHORT_FLAT_PAY_AMT;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_FLAT_PAY_AMT  null
     */
    public void setDOUBTS_SHORT_FLAT_PAY_AMT(BigDecimal DOUBTS_SHORT_FLAT_PAY_AMT) {
        this.DOUBTS_SHORT_FLAT_PAY_AMT = DOUBTS_SHORT_FLAT_PAY_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_FLAT_PAY_COUNT：null
     */
    public Long getDOUBTS_SHORT_FLAT_PAY_COUNT() {
        return DOUBTS_SHORT_FLAT_PAY_COUNT;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_FLAT_PAY_COUNT  null
     */
    public void setDOUBTS_SHORT_FLAT_PAY_COUNT(Long DOUBTS_SHORT_FLAT_PAY_COUNT) {
        this.DOUBTS_SHORT_FLAT_PAY_COUNT = DOUBTS_SHORT_FLAT_PAY_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_FLAT_RFD_AMT：null
     */
    public BigDecimal getDOUBTS_SHORT_FLAT_RFD_AMT() {
        return DOUBTS_SHORT_FLAT_RFD_AMT;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_FLAT_RFD_AMT  null
     */
    public void setDOUBTS_SHORT_FLAT_RFD_AMT(BigDecimal DOUBTS_SHORT_FLAT_RFD_AMT) {
        this.DOUBTS_SHORT_FLAT_RFD_AMT = DOUBTS_SHORT_FLAT_RFD_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_FLAT_RFD_COUNT：null
     */
    public Long getDOUBTS_SHORT_FLAT_RFD_COUNT() {
        return DOUBTS_SHORT_FLAT_RFD_COUNT;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_FLAT_RFD_COUNT  null
     */
    public void setDOUBTS_SHORT_FLAT_RFD_COUNT(Long DOUBTS_SHORT_FLAT_RFD_COUNT) {
        this.DOUBTS_SHORT_FLAT_RFD_COUNT = DOUBTS_SHORT_FLAT_RFD_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_NO_FLAT_PAY_C_AMT：null
     */
    public BigDecimal getDOUBTS_SHORT_NO_FLAT_PAY_C_AMT() {
        return DOUBTS_SHORT_NO_FLAT_PAY_C_AMT;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_NO_FLAT_PAY_C_AMT  null
     */
    public void setDOUBTS_SHORT_NO_FLAT_PAY_C_AMT(BigDecimal DOUBTS_SHORT_NO_FLAT_PAY_C_AMT) {
        this.DOUBTS_SHORT_NO_FLAT_PAY_C_AMT = DOUBTS_SHORT_NO_FLAT_PAY_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_NO_FLAT_RFD_C_AMT：null
     */
    public BigDecimal getDOUBTS_SHORT_NO_FLAT_RFD_C_AMT() {
        return DOUBTS_SHORT_NO_FLAT_RFD_C_AMT;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_NO_FLAT_RFD_C_AMT  null
     */
    public void setDOUBTS_SHORT_NO_FLAT_RFD_C_AMT(BigDecimal DOUBTS_SHORT_NO_FLAT_RFD_C_AMT) {
        this.DOUBTS_SHORT_NO_FLAT_RFD_C_AMT = DOUBTS_SHORT_NO_FLAT_RFD_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_NO_FLAT_PAY_GI：null
     */
    public BigDecimal getDOUBTS_SHORT_NO_FLAT_PAY_GI() {
        return DOUBTS_SHORT_NO_FLAT_PAY_GI;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_NO_FLAT_PAY_GI  null
     */
    public void setDOUBTS_SHORT_NO_FLAT_PAY_GI(BigDecimal DOUBTS_SHORT_NO_FLAT_PAY_GI) {
        this.DOUBTS_SHORT_NO_FLAT_PAY_GI = DOUBTS_SHORT_NO_FLAT_PAY_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_NO_FLAT_RFD_GI：null
     */
    public BigDecimal getDOUBTS_SHORT_NO_FLAT_RFD_GI() {
        return DOUBTS_SHORT_NO_FLAT_RFD_GI;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_NO_FLAT_RFD_GI  null
     */
    public void setDOUBTS_SHORT_NO_FLAT_RFD_GI(BigDecimal DOUBTS_SHORT_NO_FLAT_RFD_GI) {
        this.DOUBTS_SHORT_NO_FLAT_RFD_GI = DOUBTS_SHORT_NO_FLAT_RFD_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_NO_FLAT_PAY_GU：null
     */
    public BigDecimal getDOUBTS_SHORT_NO_FLAT_PAY_GU() {
        return DOUBTS_SHORT_NO_FLAT_PAY_GU;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_NO_FLAT_PAY_GU  null
     */
    public void setDOUBTS_SHORT_NO_FLAT_PAY_GU(BigDecimal DOUBTS_SHORT_NO_FLAT_PAY_GU) {
        this.DOUBTS_SHORT_NO_FLAT_PAY_GU = DOUBTS_SHORT_NO_FLAT_PAY_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_NO_FLAT_RFD_GU：null
     */
    public BigDecimal getDOUBTS_SHORT_NO_FLAT_RFD_GU() {
        return DOUBTS_SHORT_NO_FLAT_RFD_GU;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_NO_FLAT_RFD_GU  null
     */
    public void setDOUBTS_SHORT_NO_FLAT_RFD_GU(BigDecimal DOUBTS_SHORT_NO_FLAT_RFD_GU) {
        this.DOUBTS_SHORT_NO_FLAT_RFD_GU = DOUBTS_SHORT_NO_FLAT_RFD_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_NO_FLAT_PAY_GT_XA：null
     */
    public BigDecimal getDOUBTS_SHORT_NO_FLAT_PAY_GT_XA() {
        return DOUBTS_SHORT_NO_FLAT_PAY_GT_XA;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_NO_FLAT_PAY_GT_XA  null
     */
    public void setDOUBTS_SHORT_NO_FLAT_PAY_GT_XA(BigDecimal DOUBTS_SHORT_NO_FLAT_PAY_GT_XA) {
        this.DOUBTS_SHORT_NO_FLAT_PAY_GT_XA = DOUBTS_SHORT_NO_FLAT_PAY_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_NO_FLAT_RFD_GT_XA：null
     */
    public BigDecimal getDOUBTS_SHORT_NO_FLAT_RFD_GT_XA() {
        return DOUBTS_SHORT_NO_FLAT_RFD_GT_XA;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_NO_FLAT_RFD_GT_XA  null
     */
    public void setDOUBTS_SHORT_NO_FLAT_RFD_GT_XA(BigDecimal DOUBTS_SHORT_NO_FLAT_RFD_GT_XA) {
        this.DOUBTS_SHORT_NO_FLAT_RFD_GT_XA = DOUBTS_SHORT_NO_FLAT_RFD_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_NO_FLAT_PAY_GT_TX：null
     */
    public BigDecimal getDOUBTS_SHORT_NO_FLAT_PAY_GT_TX() {
        return DOUBTS_SHORT_NO_FLAT_PAY_GT_TX;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_NO_FLAT_PAY_GT_TX  null
     */
    public void setDOUBTS_SHORT_NO_FLAT_PAY_GT_TX(BigDecimal DOUBTS_SHORT_NO_FLAT_PAY_GT_TX) {
        this.DOUBTS_SHORT_NO_FLAT_PAY_GT_TX = DOUBTS_SHORT_NO_FLAT_PAY_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_NO_FLAT_RFD_GT_TX：null
     */
    public BigDecimal getDOUBTS_SHORT_NO_FLAT_RFD_GT_TX() {
        return DOUBTS_SHORT_NO_FLAT_RFD_GT_TX;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_NO_FLAT_RFD_GT_TX  null
     */
    public void setDOUBTS_SHORT_NO_FLAT_RFD_GT_TX(BigDecimal DOUBTS_SHORT_NO_FLAT_RFD_GT_TX) {
        this.DOUBTS_SHORT_NO_FLAT_RFD_GT_TX = DOUBTS_SHORT_NO_FLAT_RFD_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_NO_FLAT_PAY_GT_HX：null
     */
    public BigDecimal getDOUBTS_SHORT_NO_FLAT_PAY_GT_HX() {
        return DOUBTS_SHORT_NO_FLAT_PAY_GT_HX;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_NO_FLAT_PAY_GT_HX  null
     */
    public void setDOUBTS_SHORT_NO_FLAT_PAY_GT_HX(BigDecimal DOUBTS_SHORT_NO_FLAT_PAY_GT_HX) {
        this.DOUBTS_SHORT_NO_FLAT_PAY_GT_HX = DOUBTS_SHORT_NO_FLAT_PAY_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_NO_FLAT_RFD_GT_HX：null
     */
    public BigDecimal getDOUBTS_SHORT_NO_FLAT_RFD_GT_HX() {
        return DOUBTS_SHORT_NO_FLAT_RFD_GT_HX;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_NO_FLAT_RFD_GT_HX  null
     */
    public void setDOUBTS_SHORT_NO_FLAT_RFD_GT_HX(BigDecimal DOUBTS_SHORT_NO_FLAT_RFD_GT_HX) {
        this.DOUBTS_SHORT_NO_FLAT_RFD_GT_HX = DOUBTS_SHORT_NO_FLAT_RFD_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_NO_FLAT_PAY_GT_RX：null
     */
    public BigDecimal getDOUBTS_SHORT_NO_FLAT_PAY_GT_RX() {
        return DOUBTS_SHORT_NO_FLAT_PAY_GT_RX;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_NO_FLAT_PAY_GT_RX  null
     */
    public void setDOUBTS_SHORT_NO_FLAT_PAY_GT_RX(BigDecimal DOUBTS_SHORT_NO_FLAT_PAY_GT_RX) {
        this.DOUBTS_SHORT_NO_FLAT_PAY_GT_RX = DOUBTS_SHORT_NO_FLAT_PAY_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_NO_FLAT_RFD_GT_RX：null
     */
    public BigDecimal getDOUBTS_SHORT_NO_FLAT_RFD_GT_RX() {
        return DOUBTS_SHORT_NO_FLAT_RFD_GT_RX;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_NO_FLAT_RFD_GT_RX  null
     */
    public void setDOUBTS_SHORT_NO_FLAT_RFD_GT_RX(BigDecimal DOUBTS_SHORT_NO_FLAT_RFD_GT_RX) {
        this.DOUBTS_SHORT_NO_FLAT_RFD_GT_RX = DOUBTS_SHORT_NO_FLAT_RFD_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_NO_FLAT_PAY_GT_BA：null
     */
    public BigDecimal getDOUBTS_SHORT_NO_FLAT_PAY_GT_BA() {
        return DOUBTS_SHORT_NO_FLAT_PAY_GT_BA;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_NO_FLAT_PAY_GT_BA  null
     */
    public void setDOUBTS_SHORT_NO_FLAT_PAY_GT_BA(BigDecimal DOUBTS_SHORT_NO_FLAT_PAY_GT_BA) {
        this.DOUBTS_SHORT_NO_FLAT_PAY_GT_BA = DOUBTS_SHORT_NO_FLAT_PAY_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_NO_FLAT_RFD_GT_BA：null
     */
    public BigDecimal getDOUBTS_SHORT_NO_FLAT_RFD_GT_BA() {
        return DOUBTS_SHORT_NO_FLAT_RFD_GT_BA;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_NO_FLAT_RFD_GT_BA  null
     */
    public void setDOUBTS_SHORT_NO_FLAT_RFD_GT_BA(BigDecimal DOUBTS_SHORT_NO_FLAT_RFD_GT_BA) {
        this.DOUBTS_SHORT_NO_FLAT_RFD_GT_BA = DOUBTS_SHORT_NO_FLAT_RFD_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_NO_FLAT_PAY_GT_GP：null
     */
    public BigDecimal getDOUBTS_SHORT_NO_FLAT_PAY_GT_GP() {
        return DOUBTS_SHORT_NO_FLAT_PAY_GT_GP;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_NO_FLAT_PAY_GT_GP  null
     */
    public void setDOUBTS_SHORT_NO_FLAT_PAY_GT_GP(BigDecimal DOUBTS_SHORT_NO_FLAT_PAY_GT_GP) {
        this.DOUBTS_SHORT_NO_FLAT_PAY_GT_GP = DOUBTS_SHORT_NO_FLAT_PAY_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_NO_FLAT_RFD_GT_GP：null
     */
    public BigDecimal getDOUBTS_SHORT_NO_FLAT_RFD_GT_GP() {
        return DOUBTS_SHORT_NO_FLAT_RFD_GT_GP;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_NO_FLAT_RFD_GT_GP  null
     */
    public void setDOUBTS_SHORT_NO_FLAT_RFD_GT_GP(BigDecimal DOUBTS_SHORT_NO_FLAT_RFD_GT_GP) {
        this.DOUBTS_SHORT_NO_FLAT_RFD_GT_GP = DOUBTS_SHORT_NO_FLAT_RFD_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_NO_FLAT_PAY_GT_PN：null
     */
    public BigDecimal getDOUBTS_SHORT_NO_FLAT_PAY_GT_PN() {
        return DOUBTS_SHORT_NO_FLAT_PAY_GT_PN;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_NO_FLAT_PAY_GT_PN  null
     */
    public void setDOUBTS_SHORT_NO_FLAT_PAY_GT_PN(BigDecimal DOUBTS_SHORT_NO_FLAT_PAY_GT_PN) {
        this.DOUBTS_SHORT_NO_FLAT_PAY_GT_PN = DOUBTS_SHORT_NO_FLAT_PAY_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_NO_FLAT_RFD_GT_PN：null
     */
    public BigDecimal getDOUBTS_SHORT_NO_FLAT_RFD_GT_PN() {
        return DOUBTS_SHORT_NO_FLAT_RFD_GT_PN;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_NO_FLAT_RFD_GT_PN  null
     */
    public void setDOUBTS_SHORT_NO_FLAT_RFD_GT_PN(BigDecimal DOUBTS_SHORT_NO_FLAT_RFD_GT_PN) {
        this.DOUBTS_SHORT_NO_FLAT_RFD_GT_PN = DOUBTS_SHORT_NO_FLAT_RFD_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_NO_FLAT_PAY_AMT：null
     */
    public BigDecimal getDOUBTS_SHORT_NO_FLAT_PAY_AMT() {
        return DOUBTS_SHORT_NO_FLAT_PAY_AMT;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_NO_FLAT_PAY_AMT  null
     */
    public void setDOUBTS_SHORT_NO_FLAT_PAY_AMT(BigDecimal DOUBTS_SHORT_NO_FLAT_PAY_AMT) {
        this.DOUBTS_SHORT_NO_FLAT_PAY_AMT = DOUBTS_SHORT_NO_FLAT_PAY_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_NO_FLAT_PAY_COUNT：null
     */
    public Long getDOUBTS_SHORT_NO_FLAT_PAY_COUNT() {
        return DOUBTS_SHORT_NO_FLAT_PAY_COUNT;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_NO_FLAT_PAY_COUNT  null
     */
    public void setDOUBTS_SHORT_NO_FLAT_PAY_COUNT(Long DOUBTS_SHORT_NO_FLAT_PAY_COUNT) {
        this.DOUBTS_SHORT_NO_FLAT_PAY_COUNT = DOUBTS_SHORT_NO_FLAT_PAY_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_NO_FLAT_RFD_AMT：null
     */
    public BigDecimal getDOUBTS_SHORT_NO_FLAT_RFD_AMT() {
        return DOUBTS_SHORT_NO_FLAT_RFD_AMT;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_NO_FLAT_RFD_AMT  null
     */
    public void setDOUBTS_SHORT_NO_FLAT_RFD_AMT(BigDecimal DOUBTS_SHORT_NO_FLAT_RFD_AMT) {
        this.DOUBTS_SHORT_NO_FLAT_RFD_AMT = DOUBTS_SHORT_NO_FLAT_RFD_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_SHORT_NO_FLAT_RFD_COUNT：null
     */
    public Long getDOUBTS_SHORT_NO_FLAT_RFD_COUNT() {
        return DOUBTS_SHORT_NO_FLAT_RFD_COUNT;
    }

    /**
     * set method 
     *
     * @param DOUBTS_SHORT_NO_FLAT_RFD_COUNT  null
     */
    public void setDOUBTS_SHORT_NO_FLAT_RFD_COUNT(Long DOUBTS_SHORT_NO_FLAT_RFD_COUNT) {
        this.DOUBTS_SHORT_NO_FLAT_RFD_COUNT = DOUBTS_SHORT_NO_FLAT_RFD_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DIFFE_SHORT_PAY_C_AMT：null
     */
    public BigDecimal getOUR_DIFFE_SHORT_PAY_C_AMT() {
        return OUR_DIFFE_SHORT_PAY_C_AMT;
    }

    /**
     * set method 
     *
     * @param OUR_DIFFE_SHORT_PAY_C_AMT  null
     */
    public void setOUR_DIFFE_SHORT_PAY_C_AMT(BigDecimal OUR_DIFFE_SHORT_PAY_C_AMT) {
        this.OUR_DIFFE_SHORT_PAY_C_AMT = OUR_DIFFE_SHORT_PAY_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DIFFE_SHORT_RFD_C_AMT：null
     */
    public BigDecimal getOUR_DIFFE_SHORT_RFD_C_AMT() {
        return OUR_DIFFE_SHORT_RFD_C_AMT;
    }

    /**
     * set method 
     *
     * @param OUR_DIFFE_SHORT_RFD_C_AMT  null
     */
    public void setOUR_DIFFE_SHORT_RFD_C_AMT(BigDecimal OUR_DIFFE_SHORT_RFD_C_AMT) {
        this.OUR_DIFFE_SHORT_RFD_C_AMT = OUR_DIFFE_SHORT_RFD_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DIFFE_SHORT_PAY_GI：null
     */
    public BigDecimal getOUR_DIFFE_SHORT_PAY_GI() {
        return OUR_DIFFE_SHORT_PAY_GI;
    }

    /**
     * set method 
     *
     * @param OUR_DIFFE_SHORT_PAY_GI  null
     */
    public void setOUR_DIFFE_SHORT_PAY_GI(BigDecimal OUR_DIFFE_SHORT_PAY_GI) {
        this.OUR_DIFFE_SHORT_PAY_GI = OUR_DIFFE_SHORT_PAY_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DIFFE_SHORT_RFD_GI：null
     */
    public BigDecimal getOUR_DIFFE_SHORT_RFD_GI() {
        return OUR_DIFFE_SHORT_RFD_GI;
    }

    /**
     * set method 
     *
     * @param OUR_DIFFE_SHORT_RFD_GI  null
     */
    public void setOUR_DIFFE_SHORT_RFD_GI(BigDecimal OUR_DIFFE_SHORT_RFD_GI) {
        this.OUR_DIFFE_SHORT_RFD_GI = OUR_DIFFE_SHORT_RFD_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DIFFE_SHORT_PAY_GU：null
     */
    public BigDecimal getOUR_DIFFE_SHORT_PAY_GU() {
        return OUR_DIFFE_SHORT_PAY_GU;
    }

    /**
     * set method 
     *
     * @param OUR_DIFFE_SHORT_PAY_GU  null
     */
    public void setOUR_DIFFE_SHORT_PAY_GU(BigDecimal OUR_DIFFE_SHORT_PAY_GU) {
        this.OUR_DIFFE_SHORT_PAY_GU = OUR_DIFFE_SHORT_PAY_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DIFFE_SHORT_RFD_GU：null
     */
    public BigDecimal getOUR_DIFFE_SHORT_RFD_GU() {
        return OUR_DIFFE_SHORT_RFD_GU;
    }

    /**
     * set method 
     *
     * @param OUR_DIFFE_SHORT_RFD_GU  null
     */
    public void setOUR_DIFFE_SHORT_RFD_GU(BigDecimal OUR_DIFFE_SHORT_RFD_GU) {
        this.OUR_DIFFE_SHORT_RFD_GU = OUR_DIFFE_SHORT_RFD_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DIFFE_SHORT_PAY_GT_XA：null
     */
    public BigDecimal getOUR_DIFFE_SHORT_PAY_GT_XA() {
        return OUR_DIFFE_SHORT_PAY_GT_XA;
    }

    /**
     * set method 
     *
     * @param OUR_DIFFE_SHORT_PAY_GT_XA  null
     */
    public void setOUR_DIFFE_SHORT_PAY_GT_XA(BigDecimal OUR_DIFFE_SHORT_PAY_GT_XA) {
        this.OUR_DIFFE_SHORT_PAY_GT_XA = OUR_DIFFE_SHORT_PAY_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DIFFE_SHORT_RFD_GT_XA：null
     */
    public BigDecimal getOUR_DIFFE_SHORT_RFD_GT_XA() {
        return OUR_DIFFE_SHORT_RFD_GT_XA;
    }

    /**
     * set method 
     *
     * @param OUR_DIFFE_SHORT_RFD_GT_XA  null
     */
    public void setOUR_DIFFE_SHORT_RFD_GT_XA(BigDecimal OUR_DIFFE_SHORT_RFD_GT_XA) {
        this.OUR_DIFFE_SHORT_RFD_GT_XA = OUR_DIFFE_SHORT_RFD_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DIFFE_SHORT_PAY_GT_TX：null
     */
    public BigDecimal getOUR_DIFFE_SHORT_PAY_GT_TX() {
        return OUR_DIFFE_SHORT_PAY_GT_TX;
    }

    /**
     * set method 
     *
     * @param OUR_DIFFE_SHORT_PAY_GT_TX  null
     */
    public void setOUR_DIFFE_SHORT_PAY_GT_TX(BigDecimal OUR_DIFFE_SHORT_PAY_GT_TX) {
        this.OUR_DIFFE_SHORT_PAY_GT_TX = OUR_DIFFE_SHORT_PAY_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DIFFE_SHORT_RFD_GT_TX：null
     */
    public BigDecimal getOUR_DIFFE_SHORT_RFD_GT_TX() {
        return OUR_DIFFE_SHORT_RFD_GT_TX;
    }

    /**
     * set method 
     *
     * @param OUR_DIFFE_SHORT_RFD_GT_TX  null
     */
    public void setOUR_DIFFE_SHORT_RFD_GT_TX(BigDecimal OUR_DIFFE_SHORT_RFD_GT_TX) {
        this.OUR_DIFFE_SHORT_RFD_GT_TX = OUR_DIFFE_SHORT_RFD_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DIFFE_SHORT_PAY_GT_HX：null
     */
    public BigDecimal getOUR_DIFFE_SHORT_PAY_GT_HX() {
        return OUR_DIFFE_SHORT_PAY_GT_HX;
    }

    /**
     * set method 
     *
     * @param OUR_DIFFE_SHORT_PAY_GT_HX  null
     */
    public void setOUR_DIFFE_SHORT_PAY_GT_HX(BigDecimal OUR_DIFFE_SHORT_PAY_GT_HX) {
        this.OUR_DIFFE_SHORT_PAY_GT_HX = OUR_DIFFE_SHORT_PAY_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DIFFE_SHORT_RFD_GT_HX：null
     */
    public BigDecimal getOUR_DIFFE_SHORT_RFD_GT_HX() {
        return OUR_DIFFE_SHORT_RFD_GT_HX;
    }

    /**
     * set method 
     *
     * @param OUR_DIFFE_SHORT_RFD_GT_HX  null
     */
    public void setOUR_DIFFE_SHORT_RFD_GT_HX(BigDecimal OUR_DIFFE_SHORT_RFD_GT_HX) {
        this.OUR_DIFFE_SHORT_RFD_GT_HX = OUR_DIFFE_SHORT_RFD_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DIFFE_SHORT_PAY_GT_RX：null
     */
    public BigDecimal getOUR_DIFFE_SHORT_PAY_GT_RX() {
        return OUR_DIFFE_SHORT_PAY_GT_RX;
    }

    /**
     * set method 
     *
     * @param OUR_DIFFE_SHORT_PAY_GT_RX  null
     */
    public void setOUR_DIFFE_SHORT_PAY_GT_RX(BigDecimal OUR_DIFFE_SHORT_PAY_GT_RX) {
        this.OUR_DIFFE_SHORT_PAY_GT_RX = OUR_DIFFE_SHORT_PAY_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DIFFE_SHORT_RFD_GT_RX：null
     */
    public BigDecimal getOUR_DIFFE_SHORT_RFD_GT_RX() {
        return OUR_DIFFE_SHORT_RFD_GT_RX;
    }

    /**
     * set method 
     *
     * @param OUR_DIFFE_SHORT_RFD_GT_RX  null
     */
    public void setOUR_DIFFE_SHORT_RFD_GT_RX(BigDecimal OUR_DIFFE_SHORT_RFD_GT_RX) {
        this.OUR_DIFFE_SHORT_RFD_GT_RX = OUR_DIFFE_SHORT_RFD_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DIFFE_SHORT_PAY_GT_BA：null
     */
    public BigDecimal getOUR_DIFFE_SHORT_PAY_GT_BA() {
        return OUR_DIFFE_SHORT_PAY_GT_BA;
    }

    /**
     * set method 
     *
     * @param OUR_DIFFE_SHORT_PAY_GT_BA  null
     */
    public void setOUR_DIFFE_SHORT_PAY_GT_BA(BigDecimal OUR_DIFFE_SHORT_PAY_GT_BA) {
        this.OUR_DIFFE_SHORT_PAY_GT_BA = OUR_DIFFE_SHORT_PAY_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DIFFE_SHORT_RFD_GT_BA：null
     */
    public BigDecimal getOUR_DIFFE_SHORT_RFD_GT_BA() {
        return OUR_DIFFE_SHORT_RFD_GT_BA;
    }

    /**
     * set method 
     *
     * @param OUR_DIFFE_SHORT_RFD_GT_BA  null
     */
    public void setOUR_DIFFE_SHORT_RFD_GT_BA(BigDecimal OUR_DIFFE_SHORT_RFD_GT_BA) {
        this.OUR_DIFFE_SHORT_RFD_GT_BA = OUR_DIFFE_SHORT_RFD_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DIFFE_SHORT_PAY_GT_GP：null
     */
    public BigDecimal getOUR_DIFFE_SHORT_PAY_GT_GP() {
        return OUR_DIFFE_SHORT_PAY_GT_GP;
    }

    /**
     * set method 
     *
     * @param OUR_DIFFE_SHORT_PAY_GT_GP  null
     */
    public void setOUR_DIFFE_SHORT_PAY_GT_GP(BigDecimal OUR_DIFFE_SHORT_PAY_GT_GP) {
        this.OUR_DIFFE_SHORT_PAY_GT_GP = OUR_DIFFE_SHORT_PAY_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DIFFE_SHORT_RFD_GT_GP：null
     */
    public BigDecimal getOUR_DIFFE_SHORT_RFD_GT_GP() {
        return OUR_DIFFE_SHORT_RFD_GT_GP;
    }

    /**
     * set method 
     *
     * @param OUR_DIFFE_SHORT_RFD_GT_GP  null
     */
    public void setOUR_DIFFE_SHORT_RFD_GT_GP(BigDecimal OUR_DIFFE_SHORT_RFD_GT_GP) {
        this.OUR_DIFFE_SHORT_RFD_GT_GP = OUR_DIFFE_SHORT_RFD_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DIFFE_SHORT_PAY_GT_PN：null
     */
    public BigDecimal getOUR_DIFFE_SHORT_PAY_GT_PN() {
        return OUR_DIFFE_SHORT_PAY_GT_PN;
    }

    /**
     * set method 
     *
     * @param OUR_DIFFE_SHORT_PAY_GT_PN  null
     */
    public void setOUR_DIFFE_SHORT_PAY_GT_PN(BigDecimal OUR_DIFFE_SHORT_PAY_GT_PN) {
        this.OUR_DIFFE_SHORT_PAY_GT_PN = OUR_DIFFE_SHORT_PAY_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DIFFE_SHORT_RFD_GT_PN：null
     */
    public BigDecimal getOUR_DIFFE_SHORT_RFD_GT_PN() {
        return OUR_DIFFE_SHORT_RFD_GT_PN;
    }

    /**
     * set method 
     *
     * @param OUR_DIFFE_SHORT_RFD_GT_PN  null
     */
    public void setOUR_DIFFE_SHORT_RFD_GT_PN(BigDecimal OUR_DIFFE_SHORT_RFD_GT_PN) {
        this.OUR_DIFFE_SHORT_RFD_GT_PN = OUR_DIFFE_SHORT_RFD_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DIFFE_SHORT_PAY_AMT：null
     */
    public BigDecimal getOUR_DIFFE_SHORT_PAY_AMT() {
        return OUR_DIFFE_SHORT_PAY_AMT;
    }

    /**
     * set method 
     *
     * @param OUR_DIFFE_SHORT_PAY_AMT  null
     */
    public void setOUR_DIFFE_SHORT_PAY_AMT(BigDecimal OUR_DIFFE_SHORT_PAY_AMT) {
        this.OUR_DIFFE_SHORT_PAY_AMT = OUR_DIFFE_SHORT_PAY_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DIFFE_SHORT_PAY_COUNT：null
     */
    public Long getOUR_DIFFE_SHORT_PAY_COUNT() {
        return OUR_DIFFE_SHORT_PAY_COUNT;
    }

    /**
     * set method 
     *
     * @param OUR_DIFFE_SHORT_PAY_COUNT  null
     */
    public void setOUR_DIFFE_SHORT_PAY_COUNT(Long OUR_DIFFE_SHORT_PAY_COUNT) {
        this.OUR_DIFFE_SHORT_PAY_COUNT = OUR_DIFFE_SHORT_PAY_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DIFFE_SHORT_RFD_AMT：null
     */
    public BigDecimal getOUR_DIFFE_SHORT_RFD_AMT() {
        return OUR_DIFFE_SHORT_RFD_AMT;
    }

    /**
     * set method 
     *
     * @param OUR_DIFFE_SHORT_RFD_AMT  null
     */
    public void setOUR_DIFFE_SHORT_RFD_AMT(BigDecimal OUR_DIFFE_SHORT_RFD_AMT) {
        this.OUR_DIFFE_SHORT_RFD_AMT = OUR_DIFFE_SHORT_RFD_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.OUR_DIFFE_SHORT_RFD_COUNT：null
     */
    public Long getOUR_DIFFE_SHORT_RFD_COUNT() {
        return OUR_DIFFE_SHORT_RFD_COUNT;
    }

    /**
     * set method 
     *
     * @param OUR_DIFFE_SHORT_RFD_COUNT  null
     */
    public void setOUR_DIFFE_SHORT_RFD_COUNT(Long OUR_DIFFE_SHORT_RFD_COUNT) {
        this.OUR_DIFFE_SHORT_RFD_COUNT = OUR_DIFFE_SHORT_RFD_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_PAY_TOTAL_C_AMT：null
     */
    public BigDecimal getCHAN_PAY_TOTAL_C_AMT() {
        return CHAN_PAY_TOTAL_C_AMT;
    }

    /**
     * set method 
     *
     * @param CHAN_PAY_TOTAL_C_AMT  null
     */
    public void setCHAN_PAY_TOTAL_C_AMT(BigDecimal CHAN_PAY_TOTAL_C_AMT) {
        this.CHAN_PAY_TOTAL_C_AMT = CHAN_PAY_TOTAL_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_RFD_TOTAL_C_AMT：null
     */
    public BigDecimal getCHAN_RFD_TOTAL_C_AMT() {
        return CHAN_RFD_TOTAL_C_AMT;
    }

    /**
     * set method 
     *
     * @param CHAN_RFD_TOTAL_C_AMT  null
     */
    public void setCHAN_RFD_TOTAL_C_AMT(BigDecimal CHAN_RFD_TOTAL_C_AMT) {
        this.CHAN_RFD_TOTAL_C_AMT = CHAN_RFD_TOTAL_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_PAY_TOTAL_GI：null
     */
    public BigDecimal getCHAN_PAY_TOTAL_GI() {
        return CHAN_PAY_TOTAL_GI;
    }

    /**
     * set method 
     *
     * @param CHAN_PAY_TOTAL_GI  null
     */
    public void setCHAN_PAY_TOTAL_GI(BigDecimal CHAN_PAY_TOTAL_GI) {
        this.CHAN_PAY_TOTAL_GI = CHAN_PAY_TOTAL_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_RFD_TOTAL_GI：null
     */
    public BigDecimal getCHAN_RFD_TOTAL_GI() {
        return CHAN_RFD_TOTAL_GI;
    }

    /**
     * set method 
     *
     * @param CHAN_RFD_TOTAL_GI  null
     */
    public void setCHAN_RFD_TOTAL_GI(BigDecimal CHAN_RFD_TOTAL_GI) {
        this.CHAN_RFD_TOTAL_GI = CHAN_RFD_TOTAL_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_PAY_TOTAL_GU：null
     */
    public BigDecimal getCHAN_PAY_TOTAL_GU() {
        return CHAN_PAY_TOTAL_GU;
    }

    /**
     * set method 
     *
     * @param CHAN_PAY_TOTAL_GU  null
     */
    public void setCHAN_PAY_TOTAL_GU(BigDecimal CHAN_PAY_TOTAL_GU) {
        this.CHAN_PAY_TOTAL_GU = CHAN_PAY_TOTAL_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_RFD_TOTAL_GU：null
     */
    public BigDecimal getCHAN_RFD_TOTAL_GU() {
        return CHAN_RFD_TOTAL_GU;
    }

    /**
     * set method 
     *
     * @param CHAN_RFD_TOTAL_GU  null
     */
    public void setCHAN_RFD_TOTAL_GU(BigDecimal CHAN_RFD_TOTAL_GU) {
        this.CHAN_RFD_TOTAL_GU = CHAN_RFD_TOTAL_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_PAY_TOTAL_GT_XA：null
     */
    public BigDecimal getCHAN_PAY_TOTAL_GT_XA() {
        return CHAN_PAY_TOTAL_GT_XA;
    }

    /**
     * set method 
     *
     * @param CHAN_PAY_TOTAL_GT_XA  null
     */
    public void setCHAN_PAY_TOTAL_GT_XA(BigDecimal CHAN_PAY_TOTAL_GT_XA) {
        this.CHAN_PAY_TOTAL_GT_XA = CHAN_PAY_TOTAL_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_RFD_TOTAL_GT_XA：null
     */
    public BigDecimal getCHAN_RFD_TOTAL_GT_XA() {
        return CHAN_RFD_TOTAL_GT_XA;
    }

    /**
     * set method 
     *
     * @param CHAN_RFD_TOTAL_GT_XA  null
     */
    public void setCHAN_RFD_TOTAL_GT_XA(BigDecimal CHAN_RFD_TOTAL_GT_XA) {
        this.CHAN_RFD_TOTAL_GT_XA = CHAN_RFD_TOTAL_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_PAY_TOTAL_GT_TX：null
     */
    public BigDecimal getCHAN_PAY_TOTAL_GT_TX() {
        return CHAN_PAY_TOTAL_GT_TX;
    }

    /**
     * set method 
     *
     * @param CHAN_PAY_TOTAL_GT_TX  null
     */
    public void setCHAN_PAY_TOTAL_GT_TX(BigDecimal CHAN_PAY_TOTAL_GT_TX) {
        this.CHAN_PAY_TOTAL_GT_TX = CHAN_PAY_TOTAL_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_RFD_TOTAL_GT_TX：null
     */
    public BigDecimal getCHAN_RFD_TOTAL_GT_TX() {
        return CHAN_RFD_TOTAL_GT_TX;
    }

    /**
     * set method 
     *
     * @param CHAN_RFD_TOTAL_GT_TX  null
     */
    public void setCHAN_RFD_TOTAL_GT_TX(BigDecimal CHAN_RFD_TOTAL_GT_TX) {
        this.CHAN_RFD_TOTAL_GT_TX = CHAN_RFD_TOTAL_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_PAY_TOTAL_GT_HX：null
     */
    public BigDecimal getCHAN_PAY_TOTAL_GT_HX() {
        return CHAN_PAY_TOTAL_GT_HX;
    }

    /**
     * set method 
     *
     * @param CHAN_PAY_TOTAL_GT_HX  null
     */
    public void setCHAN_PAY_TOTAL_GT_HX(BigDecimal CHAN_PAY_TOTAL_GT_HX) {
        this.CHAN_PAY_TOTAL_GT_HX = CHAN_PAY_TOTAL_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_RFD_TOTAL_GT_HX：null
     */
    public BigDecimal getCHAN_RFD_TOTAL_GT_HX() {
        return CHAN_RFD_TOTAL_GT_HX;
    }

    /**
     * set method 
     *
     * @param CHAN_RFD_TOTAL_GT_HX  null
     */
    public void setCHAN_RFD_TOTAL_GT_HX(BigDecimal CHAN_RFD_TOTAL_GT_HX) {
        this.CHAN_RFD_TOTAL_GT_HX = CHAN_RFD_TOTAL_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_PAY_TOTAL_GT_RX：null
     */
    public BigDecimal getCHAN_PAY_TOTAL_GT_RX() {
        return CHAN_PAY_TOTAL_GT_RX;
    }

    /**
     * set method 
     *
     * @param CHAN_PAY_TOTAL_GT_RX  null
     */
    public void setCHAN_PAY_TOTAL_GT_RX(BigDecimal CHAN_PAY_TOTAL_GT_RX) {
        this.CHAN_PAY_TOTAL_GT_RX = CHAN_PAY_TOTAL_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_RFD_TOTAL_GT_RX：null
     */
    public BigDecimal getCHAN_RFD_TOTAL_GT_RX() {
        return CHAN_RFD_TOTAL_GT_RX;
    }

    /**
     * set method 
     *
     * @param CHAN_RFD_TOTAL_GT_RX  null
     */
    public void setCHAN_RFD_TOTAL_GT_RX(BigDecimal CHAN_RFD_TOTAL_GT_RX) {
        this.CHAN_RFD_TOTAL_GT_RX = CHAN_RFD_TOTAL_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_PAY_TOTAL_GT_BA：null
     */
    public BigDecimal getCHAN_PAY_TOTAL_GT_BA() {
        return CHAN_PAY_TOTAL_GT_BA;
    }

    /**
     * set method 
     *
     * @param CHAN_PAY_TOTAL_GT_BA  null
     */
    public void setCHAN_PAY_TOTAL_GT_BA(BigDecimal CHAN_PAY_TOTAL_GT_BA) {
        this.CHAN_PAY_TOTAL_GT_BA = CHAN_PAY_TOTAL_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_RFD_TOTAL_GT_BA：null
     */
    public BigDecimal getCHAN_RFD_TOTAL_GT_BA() {
        return CHAN_RFD_TOTAL_GT_BA;
    }

    /**
     * set method 
     *
     * @param CHAN_RFD_TOTAL_GT_BA  null
     */
    public void setCHAN_RFD_TOTAL_GT_BA(BigDecimal CHAN_RFD_TOTAL_GT_BA) {
        this.CHAN_RFD_TOTAL_GT_BA = CHAN_RFD_TOTAL_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_PAY_TOTAL_GT_GP：null
     */
    public BigDecimal getCHAN_PAY_TOTAL_GT_GP() {
        return CHAN_PAY_TOTAL_GT_GP;
    }

    /**
     * set method 
     *
     * @param CHAN_PAY_TOTAL_GT_GP  null
     */
    public void setCHAN_PAY_TOTAL_GT_GP(BigDecimal CHAN_PAY_TOTAL_GT_GP) {
        this.CHAN_PAY_TOTAL_GT_GP = CHAN_PAY_TOTAL_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_RFD_TOTAL_GT_GP：null
     */
    public BigDecimal getCHAN_RFD_TOTAL_GT_GP() {
        return CHAN_RFD_TOTAL_GT_GP;
    }

    /**
     * set method 
     *
     * @param CHAN_RFD_TOTAL_GT_GP  null
     */
    public void setCHAN_RFD_TOTAL_GT_GP(BigDecimal CHAN_RFD_TOTAL_GT_GP) {
        this.CHAN_RFD_TOTAL_GT_GP = CHAN_RFD_TOTAL_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_PAY_TOTAL_GT_PN：null
     */
    public BigDecimal getCHAN_PAY_TOTAL_GT_PN() {
        return CHAN_PAY_TOTAL_GT_PN;
    }

    /**
     * set method 
     *
     * @param CHAN_PAY_TOTAL_GT_PN  null
     */
    public void setCHAN_PAY_TOTAL_GT_PN(BigDecimal CHAN_PAY_TOTAL_GT_PN) {
        this.CHAN_PAY_TOTAL_GT_PN = CHAN_PAY_TOTAL_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_RFD_TOTAL_GT_PN：null
     */
    public BigDecimal getCHAN_RFD_TOTAL_GT_PN() {
        return CHAN_RFD_TOTAL_GT_PN;
    }

    /**
     * set method 
     *
     * @param CHAN_RFD_TOTAL_GT_PN  null
     */
    public void setCHAN_RFD_TOTAL_GT_PN(BigDecimal CHAN_RFD_TOTAL_GT_PN) {
        this.CHAN_RFD_TOTAL_GT_PN = CHAN_RFD_TOTAL_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_PAY_TOTAL_AMT：null
     */
    public BigDecimal getCHAN_PAY_TOTAL_AMT() {
        return CHAN_PAY_TOTAL_AMT;
    }

    /**
     * set method 
     *
     * @param CHAN_PAY_TOTAL_AMT  null
     */
    public void setCHAN_PAY_TOTAL_AMT(BigDecimal CHAN_PAY_TOTAL_AMT) {
        this.CHAN_PAY_TOTAL_AMT = CHAN_PAY_TOTAL_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_PAY_TOTAL_COUNT：null
     */
    public Long getCHAN_PAY_TOTAL_COUNT() {
        return CHAN_PAY_TOTAL_COUNT;
    }

    /**
     * set method 
     *
     * @param CHAN_PAY_TOTAL_COUNT  null
     */
    public void setCHAN_PAY_TOTAL_COUNT(Long CHAN_PAY_TOTAL_COUNT) {
        this.CHAN_PAY_TOTAL_COUNT = CHAN_PAY_TOTAL_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_RFD_TOTAL_AMT：null
     */
    public BigDecimal getCHAN_RFD_TOTAL_AMT() {
        return CHAN_RFD_TOTAL_AMT;
    }

    /**
     * set method 
     *
     * @param CHAN_RFD_TOTAL_AMT  null
     */
    public void setCHAN_RFD_TOTAL_AMT(BigDecimal CHAN_RFD_TOTAL_AMT) {
        this.CHAN_RFD_TOTAL_AMT = CHAN_RFD_TOTAL_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_RFD_TOTAL_COUNT：null
     */
    public Long getCHAN_RFD_TOTAL_COUNT() {
        return CHAN_RFD_TOTAL_COUNT;
    }

    /**
     * set method 
     *
     * @param CHAN_RFD_TOTAL_COUNT  null
     */
    public void setCHAN_RFD_TOTAL_COUNT(Long CHAN_RFD_TOTAL_COUNT) {
        this.CHAN_RFD_TOTAL_COUNT = CHAN_RFD_TOTAL_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DOUBTS_LONG_PAY_C_AMT：null
     */
    public BigDecimal getCHAN_DOUBTS_LONG_PAY_C_AMT() {
        return CHAN_DOUBTS_LONG_PAY_C_AMT;
    }

    /**
     * set method 
     *
     * @param CHAN_DOUBTS_LONG_PAY_C_AMT  null
     */
    public void setCHAN_DOUBTS_LONG_PAY_C_AMT(BigDecimal CHAN_DOUBTS_LONG_PAY_C_AMT) {
        this.CHAN_DOUBTS_LONG_PAY_C_AMT = CHAN_DOUBTS_LONG_PAY_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DOUBTS_LONG_RFD_C_AMT：null
     */
    public BigDecimal getCHAN_DOUBTS_LONG_RFD_C_AMT() {
        return CHAN_DOUBTS_LONG_RFD_C_AMT;
    }

    /**
     * set method 
     *
     * @param CHAN_DOUBTS_LONG_RFD_C_AMT  null
     */
    public void setCHAN_DOUBTS_LONG_RFD_C_AMT(BigDecimal CHAN_DOUBTS_LONG_RFD_C_AMT) {
        this.CHAN_DOUBTS_LONG_RFD_C_AMT = CHAN_DOUBTS_LONG_RFD_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DOUBTS_LONG_PAY_GI：null
     */
    public BigDecimal getCHAN_DOUBTS_LONG_PAY_GI() {
        return CHAN_DOUBTS_LONG_PAY_GI;
    }

    /**
     * set method 
     *
     * @param CHAN_DOUBTS_LONG_PAY_GI  null
     */
    public void setCHAN_DOUBTS_LONG_PAY_GI(BigDecimal CHAN_DOUBTS_LONG_PAY_GI) {
        this.CHAN_DOUBTS_LONG_PAY_GI = CHAN_DOUBTS_LONG_PAY_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DOUBTS_LONG_RFD_GI：null
     */
    public BigDecimal getCHAN_DOUBTS_LONG_RFD_GI() {
        return CHAN_DOUBTS_LONG_RFD_GI;
    }

    /**
     * set method 
     *
     * @param CHAN_DOUBTS_LONG_RFD_GI  null
     */
    public void setCHAN_DOUBTS_LONG_RFD_GI(BigDecimal CHAN_DOUBTS_LONG_RFD_GI) {
        this.CHAN_DOUBTS_LONG_RFD_GI = CHAN_DOUBTS_LONG_RFD_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DOUBTS_LONG_PAY_GU：null
     */
    public BigDecimal getCHAN_DOUBTS_LONG_PAY_GU() {
        return CHAN_DOUBTS_LONG_PAY_GU;
    }

    /**
     * set method 
     *
     * @param CHAN_DOUBTS_LONG_PAY_GU  null
     */
    public void setCHAN_DOUBTS_LONG_PAY_GU(BigDecimal CHAN_DOUBTS_LONG_PAY_GU) {
        this.CHAN_DOUBTS_LONG_PAY_GU = CHAN_DOUBTS_LONG_PAY_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DOUBTS_LONG_RFD_GU：null
     */
    public BigDecimal getCHAN_DOUBTS_LONG_RFD_GU() {
        return CHAN_DOUBTS_LONG_RFD_GU;
    }

    /**
     * set method 
     *
     * @param CHAN_DOUBTS_LONG_RFD_GU  null
     */
    public void setCHAN_DOUBTS_LONG_RFD_GU(BigDecimal CHAN_DOUBTS_LONG_RFD_GU) {
        this.CHAN_DOUBTS_LONG_RFD_GU = CHAN_DOUBTS_LONG_RFD_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DOUBTS_LONG_PAY_GT_XA：null
     */
    public BigDecimal getCHAN_DOUBTS_LONG_PAY_GT_XA() {
        return CHAN_DOUBTS_LONG_PAY_GT_XA;
    }

    /**
     * set method 
     *
     * @param CHAN_DOUBTS_LONG_PAY_GT_XA  null
     */
    public void setCHAN_DOUBTS_LONG_PAY_GT_XA(BigDecimal CHAN_DOUBTS_LONG_PAY_GT_XA) {
        this.CHAN_DOUBTS_LONG_PAY_GT_XA = CHAN_DOUBTS_LONG_PAY_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DOUBTS_LONG_RFD_GT_XA：null
     */
    public BigDecimal getCHAN_DOUBTS_LONG_RFD_GT_XA() {
        return CHAN_DOUBTS_LONG_RFD_GT_XA;
    }

    /**
     * set method 
     *
     * @param CHAN_DOUBTS_LONG_RFD_GT_XA  null
     */
    public void setCHAN_DOUBTS_LONG_RFD_GT_XA(BigDecimal CHAN_DOUBTS_LONG_RFD_GT_XA) {
        this.CHAN_DOUBTS_LONG_RFD_GT_XA = CHAN_DOUBTS_LONG_RFD_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DOUBTS_LONG_PAY_GT_TX：null
     */
    public BigDecimal getCHAN_DOUBTS_LONG_PAY_GT_TX() {
        return CHAN_DOUBTS_LONG_PAY_GT_TX;
    }

    /**
     * set method 
     *
     * @param CHAN_DOUBTS_LONG_PAY_GT_TX  null
     */
    public void setCHAN_DOUBTS_LONG_PAY_GT_TX(BigDecimal CHAN_DOUBTS_LONG_PAY_GT_TX) {
        this.CHAN_DOUBTS_LONG_PAY_GT_TX = CHAN_DOUBTS_LONG_PAY_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DOUBTS_LONG_RFD_GT_TX：null
     */
    public BigDecimal getCHAN_DOUBTS_LONG_RFD_GT_TX() {
        return CHAN_DOUBTS_LONG_RFD_GT_TX;
    }

    /**
     * set method 
     *
     * @param CHAN_DOUBTS_LONG_RFD_GT_TX  null
     */
    public void setCHAN_DOUBTS_LONG_RFD_GT_TX(BigDecimal CHAN_DOUBTS_LONG_RFD_GT_TX) {
        this.CHAN_DOUBTS_LONG_RFD_GT_TX = CHAN_DOUBTS_LONG_RFD_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DOUBTS_LONG_PAY_GT_HX：null
     */
    public BigDecimal getCHAN_DOUBTS_LONG_PAY_GT_HX() {
        return CHAN_DOUBTS_LONG_PAY_GT_HX;
    }

    /**
     * set method 
     *
     * @param CHAN_DOUBTS_LONG_PAY_GT_HX  null
     */
    public void setCHAN_DOUBTS_LONG_PAY_GT_HX(BigDecimal CHAN_DOUBTS_LONG_PAY_GT_HX) {
        this.CHAN_DOUBTS_LONG_PAY_GT_HX = CHAN_DOUBTS_LONG_PAY_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DOUBTS_LONG_RFD_GT_HX：null
     */
    public BigDecimal getCHAN_DOUBTS_LONG_RFD_GT_HX() {
        return CHAN_DOUBTS_LONG_RFD_GT_HX;
    }

    /**
     * set method 
     *
     * @param CHAN_DOUBTS_LONG_RFD_GT_HX  null
     */
    public void setCHAN_DOUBTS_LONG_RFD_GT_HX(BigDecimal CHAN_DOUBTS_LONG_RFD_GT_HX) {
        this.CHAN_DOUBTS_LONG_RFD_GT_HX = CHAN_DOUBTS_LONG_RFD_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DOUBTS_LONG_PAY_GT_RX：null
     */
    public BigDecimal getCHAN_DOUBTS_LONG_PAY_GT_RX() {
        return CHAN_DOUBTS_LONG_PAY_GT_RX;
    }

    /**
     * set method 
     *
     * @param CHAN_DOUBTS_LONG_PAY_GT_RX  null
     */
    public void setCHAN_DOUBTS_LONG_PAY_GT_RX(BigDecimal CHAN_DOUBTS_LONG_PAY_GT_RX) {
        this.CHAN_DOUBTS_LONG_PAY_GT_RX = CHAN_DOUBTS_LONG_PAY_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DOUBTS_LONG_RFD_GT_RX：null
     */
    public BigDecimal getCHAN_DOUBTS_LONG_RFD_GT_RX() {
        return CHAN_DOUBTS_LONG_RFD_GT_RX;
    }

    /**
     * set method 
     *
     * @param CHAN_DOUBTS_LONG_RFD_GT_RX  null
     */
    public void setCHAN_DOUBTS_LONG_RFD_GT_RX(BigDecimal CHAN_DOUBTS_LONG_RFD_GT_RX) {
        this.CHAN_DOUBTS_LONG_RFD_GT_RX = CHAN_DOUBTS_LONG_RFD_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DOUBTS_LONG_PAY_GT_BA：null
     */
    public BigDecimal getCHAN_DOUBTS_LONG_PAY_GT_BA() {
        return CHAN_DOUBTS_LONG_PAY_GT_BA;
    }

    /**
     * set method 
     *
     * @param CHAN_DOUBTS_LONG_PAY_GT_BA  null
     */
    public void setCHAN_DOUBTS_LONG_PAY_GT_BA(BigDecimal CHAN_DOUBTS_LONG_PAY_GT_BA) {
        this.CHAN_DOUBTS_LONG_PAY_GT_BA = CHAN_DOUBTS_LONG_PAY_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DOUBTS_LONG_RFD_GT_BA：null
     */
    public BigDecimal getCHAN_DOUBTS_LONG_RFD_GT_BA() {
        return CHAN_DOUBTS_LONG_RFD_GT_BA;
    }

    /**
     * set method 
     *
     * @param CHAN_DOUBTS_LONG_RFD_GT_BA  null
     */
    public void setCHAN_DOUBTS_LONG_RFD_GT_BA(BigDecimal CHAN_DOUBTS_LONG_RFD_GT_BA) {
        this.CHAN_DOUBTS_LONG_RFD_GT_BA = CHAN_DOUBTS_LONG_RFD_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DOUBTS_LONG_PAY_GT_GP：null
     */
    public BigDecimal getCHAN_DOUBTS_LONG_PAY_GT_GP() {
        return CHAN_DOUBTS_LONG_PAY_GT_GP;
    }

    /**
     * set method 
     *
     * @param CHAN_DOUBTS_LONG_PAY_GT_GP  null
     */
    public void setCHAN_DOUBTS_LONG_PAY_GT_GP(BigDecimal CHAN_DOUBTS_LONG_PAY_GT_GP) {
        this.CHAN_DOUBTS_LONG_PAY_GT_GP = CHAN_DOUBTS_LONG_PAY_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DOUBTS_LONG_RFD_GT_GP：null
     */
    public BigDecimal getCHAN_DOUBTS_LONG_RFD_GT_GP() {
        return CHAN_DOUBTS_LONG_RFD_GT_GP;
    }

    /**
     * set method 
     *
     * @param CHAN_DOUBTS_LONG_RFD_GT_GP  null
     */
    public void setCHAN_DOUBTS_LONG_RFD_GT_GP(BigDecimal CHAN_DOUBTS_LONG_RFD_GT_GP) {
        this.CHAN_DOUBTS_LONG_RFD_GT_GP = CHAN_DOUBTS_LONG_RFD_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DOUBTS_LONG_PAY_GT_PN：null
     */
    public BigDecimal getCHAN_DOUBTS_LONG_PAY_GT_PN() {
        return CHAN_DOUBTS_LONG_PAY_GT_PN;
    }

    /**
     * set method 
     *
     * @param CHAN_DOUBTS_LONG_PAY_GT_PN  null
     */
    public void setCHAN_DOUBTS_LONG_PAY_GT_PN(BigDecimal CHAN_DOUBTS_LONG_PAY_GT_PN) {
        this.CHAN_DOUBTS_LONG_PAY_GT_PN = CHAN_DOUBTS_LONG_PAY_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DOUBTS_LONG_RFD_GT_PN：null
     */
    public BigDecimal getCHAN_DOUBTS_LONG_RFD_GT_PN() {
        return CHAN_DOUBTS_LONG_RFD_GT_PN;
    }

    /**
     * set method 
     *
     * @param CHAN_DOUBTS_LONG_RFD_GT_PN  null
     */
    public void setCHAN_DOUBTS_LONG_RFD_GT_PN(BigDecimal CHAN_DOUBTS_LONG_RFD_GT_PN) {
        this.CHAN_DOUBTS_LONG_RFD_GT_PN = CHAN_DOUBTS_LONG_RFD_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DOUBTS_LONG_PAY_AMT：null
     */
    public BigDecimal getCHAN_DOUBTS_LONG_PAY_AMT() {
        return CHAN_DOUBTS_LONG_PAY_AMT;
    }

    /**
     * set method 
     *
     * @param CHAN_DOUBTS_LONG_PAY_AMT  null
     */
    public void setCHAN_DOUBTS_LONG_PAY_AMT(BigDecimal CHAN_DOUBTS_LONG_PAY_AMT) {
        this.CHAN_DOUBTS_LONG_PAY_AMT = CHAN_DOUBTS_LONG_PAY_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DOUBTS_LONG_PAY_COUNT：null
     */
    public Long getCHAN_DOUBTS_LONG_PAY_COUNT() {
        return CHAN_DOUBTS_LONG_PAY_COUNT;
    }

    /**
     * set method 
     *
     * @param CHAN_DOUBTS_LONG_PAY_COUNT  null
     */
    public void setCHAN_DOUBTS_LONG_PAY_COUNT(Long CHAN_DOUBTS_LONG_PAY_COUNT) {
        this.CHAN_DOUBTS_LONG_PAY_COUNT = CHAN_DOUBTS_LONG_PAY_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DOUBTS_LONG_RFD_AMT：null
     */
    public BigDecimal getCHAN_DOUBTS_LONG_RFD_AMT() {
        return CHAN_DOUBTS_LONG_RFD_AMT;
    }

    /**
     * set method 
     *
     * @param CHAN_DOUBTS_LONG_RFD_AMT  null
     */
    public void setCHAN_DOUBTS_LONG_RFD_AMT(BigDecimal CHAN_DOUBTS_LONG_RFD_AMT) {
        this.CHAN_DOUBTS_LONG_RFD_AMT = CHAN_DOUBTS_LONG_RFD_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DOUBTS_LONG_RFD_COUNT：null
     */
    public Long getCHAN_DOUBTS_LONG_RFD_COUNT() {
        return CHAN_DOUBTS_LONG_RFD_COUNT;
    }

    /**
     * set method 
     *
     * @param CHAN_DOUBTS_LONG_RFD_COUNT  null
     */
    public void setCHAN_DOUBTS_LONG_RFD_COUNT(Long CHAN_DOUBTS_LONG_RFD_COUNT) {
        this.CHAN_DOUBTS_LONG_RFD_COUNT = CHAN_DOUBTS_LONG_RFD_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FLAT_PAY_C_AMT：null
     */
    public BigDecimal getCHAN_FLAT_PAY_C_AMT() {
        return CHAN_FLAT_PAY_C_AMT;
    }

    /**
     * set method 
     *
     * @param CHAN_FLAT_PAY_C_AMT  null
     */
    public void setCHAN_FLAT_PAY_C_AMT(BigDecimal CHAN_FLAT_PAY_C_AMT) {
        this.CHAN_FLAT_PAY_C_AMT = CHAN_FLAT_PAY_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FLAT_RFD_C_AMT：null
     */
    public BigDecimal getCHAN_FLAT_RFD_C_AMT() {
        return CHAN_FLAT_RFD_C_AMT;
    }

    /**
     * set method 
     *
     * @param CHAN_FLAT_RFD_C_AMT  null
     */
    public void setCHAN_FLAT_RFD_C_AMT(BigDecimal CHAN_FLAT_RFD_C_AMT) {
        this.CHAN_FLAT_RFD_C_AMT = CHAN_FLAT_RFD_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FLAT_PAY_GI：null
     */
    public BigDecimal getCHAN_FLAT_PAY_GI() {
        return CHAN_FLAT_PAY_GI;
    }

    /**
     * set method 
     *
     * @param CHAN_FLAT_PAY_GI  null
     */
    public void setCHAN_FLAT_PAY_GI(BigDecimal CHAN_FLAT_PAY_GI) {
        this.CHAN_FLAT_PAY_GI = CHAN_FLAT_PAY_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FLAT_RFD_GI：null
     */
    public BigDecimal getCHAN_FLAT_RFD_GI() {
        return CHAN_FLAT_RFD_GI;
    }

    /**
     * set method 
     *
     * @param CHAN_FLAT_RFD_GI  null
     */
    public void setCHAN_FLAT_RFD_GI(BigDecimal CHAN_FLAT_RFD_GI) {
        this.CHAN_FLAT_RFD_GI = CHAN_FLAT_RFD_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FLAT_PAY_GU：null
     */
    public BigDecimal getCHAN_FLAT_PAY_GU() {
        return CHAN_FLAT_PAY_GU;
    }

    /**
     * set method 
     *
     * @param CHAN_FLAT_PAY_GU  null
     */
    public void setCHAN_FLAT_PAY_GU(BigDecimal CHAN_FLAT_PAY_GU) {
        this.CHAN_FLAT_PAY_GU = CHAN_FLAT_PAY_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FLAT_RFD_GU：null
     */
    public BigDecimal getCHAN_FLAT_RFD_GU() {
        return CHAN_FLAT_RFD_GU;
    }

    /**
     * set method 
     *
     * @param CHAN_FLAT_RFD_GU  null
     */
    public void setCHAN_FLAT_RFD_GU(BigDecimal CHAN_FLAT_RFD_GU) {
        this.CHAN_FLAT_RFD_GU = CHAN_FLAT_RFD_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FLAT_PAY_GT_XA：null
     */
    public BigDecimal getCHAN_FLAT_PAY_GT_XA() {
        return CHAN_FLAT_PAY_GT_XA;
    }

    /**
     * set method 
     *
     * @param CHAN_FLAT_PAY_GT_XA  null
     */
    public void setCHAN_FLAT_PAY_GT_XA(BigDecimal CHAN_FLAT_PAY_GT_XA) {
        this.CHAN_FLAT_PAY_GT_XA = CHAN_FLAT_PAY_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FLAT_RFD_GT_XA：null
     */
    public BigDecimal getCHAN_FLAT_RFD_GT_XA() {
        return CHAN_FLAT_RFD_GT_XA;
    }

    /**
     * set method 
     *
     * @param CHAN_FLAT_RFD_GT_XA  null
     */
    public void setCHAN_FLAT_RFD_GT_XA(BigDecimal CHAN_FLAT_RFD_GT_XA) {
        this.CHAN_FLAT_RFD_GT_XA = CHAN_FLAT_RFD_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FLAT_PAY_GT_TX：null
     */
    public BigDecimal getCHAN_FLAT_PAY_GT_TX() {
        return CHAN_FLAT_PAY_GT_TX;
    }

    /**
     * set method 
     *
     * @param CHAN_FLAT_PAY_GT_TX  null
     */
    public void setCHAN_FLAT_PAY_GT_TX(BigDecimal CHAN_FLAT_PAY_GT_TX) {
        this.CHAN_FLAT_PAY_GT_TX = CHAN_FLAT_PAY_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FLAT_RFD_GT_TX：null
     */
    public BigDecimal getCHAN_FLAT_RFD_GT_TX() {
        return CHAN_FLAT_RFD_GT_TX;
    }

    /**
     * set method 
     *
     * @param CHAN_FLAT_RFD_GT_TX  null
     */
    public void setCHAN_FLAT_RFD_GT_TX(BigDecimal CHAN_FLAT_RFD_GT_TX) {
        this.CHAN_FLAT_RFD_GT_TX = CHAN_FLAT_RFD_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FLAT_PAY_GT_HX：null
     */
    public BigDecimal getCHAN_FLAT_PAY_GT_HX() {
        return CHAN_FLAT_PAY_GT_HX;
    }

    /**
     * set method 
     *
     * @param CHAN_FLAT_PAY_GT_HX  null
     */
    public void setCHAN_FLAT_PAY_GT_HX(BigDecimal CHAN_FLAT_PAY_GT_HX) {
        this.CHAN_FLAT_PAY_GT_HX = CHAN_FLAT_PAY_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FLAT_RFD_GT_HX：null
     */
    public BigDecimal getCHAN_FLAT_RFD_GT_HX() {
        return CHAN_FLAT_RFD_GT_HX;
    }

    /**
     * set method 
     *
     * @param CHAN_FLAT_RFD_GT_HX  null
     */
    public void setCHAN_FLAT_RFD_GT_HX(BigDecimal CHAN_FLAT_RFD_GT_HX) {
        this.CHAN_FLAT_RFD_GT_HX = CHAN_FLAT_RFD_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FLAT_PAY_GT_RX：null
     */
    public BigDecimal getCHAN_FLAT_PAY_GT_RX() {
        return CHAN_FLAT_PAY_GT_RX;
    }

    /**
     * set method 
     *
     * @param CHAN_FLAT_PAY_GT_RX  null
     */
    public void setCHAN_FLAT_PAY_GT_RX(BigDecimal CHAN_FLAT_PAY_GT_RX) {
        this.CHAN_FLAT_PAY_GT_RX = CHAN_FLAT_PAY_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FLAT_RFD_GT_RX：null
     */
    public BigDecimal getCHAN_FLAT_RFD_GT_RX() {
        return CHAN_FLAT_RFD_GT_RX;
    }

    /**
     * set method 
     *
     * @param CHAN_FLAT_RFD_GT_RX  null
     */
    public void setCHAN_FLAT_RFD_GT_RX(BigDecimal CHAN_FLAT_RFD_GT_RX) {
        this.CHAN_FLAT_RFD_GT_RX = CHAN_FLAT_RFD_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FLAT_PAY_GT_BA：null
     */
    public BigDecimal getCHAN_FLAT_PAY_GT_BA() {
        return CHAN_FLAT_PAY_GT_BA;
    }

    /**
     * set method 
     *
     * @param CHAN_FLAT_PAY_GT_BA  null
     */
    public void setCHAN_FLAT_PAY_GT_BA(BigDecimal CHAN_FLAT_PAY_GT_BA) {
        this.CHAN_FLAT_PAY_GT_BA = CHAN_FLAT_PAY_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FLAT_RFD_GT_BA：null
     */
    public BigDecimal getCHAN_FLAT_RFD_GT_BA() {
        return CHAN_FLAT_RFD_GT_BA;
    }

    /**
     * set method 
     *
     * @param CHAN_FLAT_RFD_GT_BA  null
     */
    public void setCHAN_FLAT_RFD_GT_BA(BigDecimal CHAN_FLAT_RFD_GT_BA) {
        this.CHAN_FLAT_RFD_GT_BA = CHAN_FLAT_RFD_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FLAT_PAY_GT_GP：null
     */
    public BigDecimal getCHAN_FLAT_PAY_GT_GP() {
        return CHAN_FLAT_PAY_GT_GP;
    }

    /**
     * set method 
     *
     * @param CHAN_FLAT_PAY_GT_GP  null
     */
    public void setCHAN_FLAT_PAY_GT_GP(BigDecimal CHAN_FLAT_PAY_GT_GP) {
        this.CHAN_FLAT_PAY_GT_GP = CHAN_FLAT_PAY_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FLAT_RFD_GT_GP：null
     */
    public BigDecimal getCHAN_FLAT_RFD_GT_GP() {
        return CHAN_FLAT_RFD_GT_GP;
    }

    /**
     * set method 
     *
     * @param CHAN_FLAT_RFD_GT_GP  null
     */
    public void setCHAN_FLAT_RFD_GT_GP(BigDecimal CHAN_FLAT_RFD_GT_GP) {
        this.CHAN_FLAT_RFD_GT_GP = CHAN_FLAT_RFD_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FLAT_PAY_GT_PN：null
     */
    public BigDecimal getCHAN_FLAT_PAY_GT_PN() {
        return CHAN_FLAT_PAY_GT_PN;
    }

    /**
     * set method 
     *
     * @param CHAN_FLAT_PAY_GT_PN  null
     */
    public void setCHAN_FLAT_PAY_GT_PN(BigDecimal CHAN_FLAT_PAY_GT_PN) {
        this.CHAN_FLAT_PAY_GT_PN = CHAN_FLAT_PAY_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FLAT_RFD_GT_PN：null
     */
    public BigDecimal getCHAN_FLAT_RFD_GT_PN() {
        return CHAN_FLAT_RFD_GT_PN;
    }

    /**
     * set method 
     *
     * @param CHAN_FLAT_RFD_GT_PN  null
     */
    public void setCHAN_FLAT_RFD_GT_PN(BigDecimal CHAN_FLAT_RFD_GT_PN) {
        this.CHAN_FLAT_RFD_GT_PN = CHAN_FLAT_RFD_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FLAT_PAY_AMT：null
     */
    public BigDecimal getCHAN_FLAT_PAY_AMT() {
        return CHAN_FLAT_PAY_AMT;
    }

    /**
     * set method 
     *
     * @param CHAN_FLAT_PAY_AMT  null
     */
    public void setCHAN_FLAT_PAY_AMT(BigDecimal CHAN_FLAT_PAY_AMT) {
        this.CHAN_FLAT_PAY_AMT = CHAN_FLAT_PAY_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FLAT_PAY_COUNT：null
     */
    public Long getCHAN_FLAT_PAY_COUNT() {
        return CHAN_FLAT_PAY_COUNT;
    }

    /**
     * set method 
     *
     * @param CHAN_FLAT_PAY_COUNT  null
     */
    public void setCHAN_FLAT_PAY_COUNT(Long CHAN_FLAT_PAY_COUNT) {
        this.CHAN_FLAT_PAY_COUNT = CHAN_FLAT_PAY_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FLAT_RFD_AMT：null
     */
    public BigDecimal getCHAN_FLAT_RFD_AMT() {
        return CHAN_FLAT_RFD_AMT;
    }

    /**
     * set method 
     *
     * @param CHAN_FLAT_RFD_AMT  null
     */
    public void setCHAN_FLAT_RFD_AMT(BigDecimal CHAN_FLAT_RFD_AMT) {
        this.CHAN_FLAT_RFD_AMT = CHAN_FLAT_RFD_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_FLAT_RFD_COUNT：null
     */
    public Long getCHAN_FLAT_RFD_COUNT() {
        return CHAN_FLAT_RFD_COUNT;
    }

    /**
     * set method 
     *
     * @param CHAN_FLAT_RFD_COUNT  null
     */
    public void setCHAN_FLAT_RFD_COUNT(Long CHAN_FLAT_RFD_COUNT) {
        this.CHAN_FLAT_RFD_COUNT = CHAN_FLAT_RFD_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO_FLAT_PAY_C_AMT：null
     */
    public BigDecimal getCHAN_NO_FLAT_PAY_C_AMT() {
        return CHAN_NO_FLAT_PAY_C_AMT;
    }

    /**
     * set method 
     *
     * @param CHAN_NO_FLAT_PAY_C_AMT  null
     */
    public void setCHAN_NO_FLAT_PAY_C_AMT(BigDecimal CHAN_NO_FLAT_PAY_C_AMT) {
        this.CHAN_NO_FLAT_PAY_C_AMT = CHAN_NO_FLAT_PAY_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO_FLAT_RFD_C_AMT：null
     */
    public BigDecimal getCHAN_NO_FLAT_RFD_C_AMT() {
        return CHAN_NO_FLAT_RFD_C_AMT;
    }

    /**
     * set method 
     *
     * @param CHAN_NO_FLAT_RFD_C_AMT  null
     */
    public void setCHAN_NO_FLAT_RFD_C_AMT(BigDecimal CHAN_NO_FLAT_RFD_C_AMT) {
        this.CHAN_NO_FLAT_RFD_C_AMT = CHAN_NO_FLAT_RFD_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO_FLAT_PAY_GI：null
     */
    public BigDecimal getCHAN_NO_FLAT_PAY_GI() {
        return CHAN_NO_FLAT_PAY_GI;
    }

    /**
     * set method 
     *
     * @param CHAN_NO_FLAT_PAY_GI  null
     */
    public void setCHAN_NO_FLAT_PAY_GI(BigDecimal CHAN_NO_FLAT_PAY_GI) {
        this.CHAN_NO_FLAT_PAY_GI = CHAN_NO_FLAT_PAY_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO_FLAT_RFD_GI：null
     */
    public BigDecimal getCHAN_NO_FLAT_RFD_GI() {
        return CHAN_NO_FLAT_RFD_GI;
    }

    /**
     * set method 
     *
     * @param CHAN_NO_FLAT_RFD_GI  null
     */
    public void setCHAN_NO_FLAT_RFD_GI(BigDecimal CHAN_NO_FLAT_RFD_GI) {
        this.CHAN_NO_FLAT_RFD_GI = CHAN_NO_FLAT_RFD_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO_FLAT_PAY_GU：null
     */
    public BigDecimal getCHAN_NO_FLAT_PAY_GU() {
        return CHAN_NO_FLAT_PAY_GU;
    }

    /**
     * set method 
     *
     * @param CHAN_NO_FLAT_PAY_GU  null
     */
    public void setCHAN_NO_FLAT_PAY_GU(BigDecimal CHAN_NO_FLAT_PAY_GU) {
        this.CHAN_NO_FLAT_PAY_GU = CHAN_NO_FLAT_PAY_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO_FLAT_RFD_GU：null
     */
    public BigDecimal getCHAN_NO_FLAT_RFD_GU() {
        return CHAN_NO_FLAT_RFD_GU;
    }

    /**
     * set method 
     *
     * @param CHAN_NO_FLAT_RFD_GU  null
     */
    public void setCHAN_NO_FLAT_RFD_GU(BigDecimal CHAN_NO_FLAT_RFD_GU) {
        this.CHAN_NO_FLAT_RFD_GU = CHAN_NO_FLAT_RFD_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO_FLAT_PAY_GT_XA：null
     */
    public BigDecimal getCHAN_NO_FLAT_PAY_GT_XA() {
        return CHAN_NO_FLAT_PAY_GT_XA;
    }

    /**
     * set method 
     *
     * @param CHAN_NO_FLAT_PAY_GT_XA  null
     */
    public void setCHAN_NO_FLAT_PAY_GT_XA(BigDecimal CHAN_NO_FLAT_PAY_GT_XA) {
        this.CHAN_NO_FLAT_PAY_GT_XA = CHAN_NO_FLAT_PAY_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO_FLAT_RFD_GT_XA：null
     */
    public BigDecimal getCHAN_NO_FLAT_RFD_GT_XA() {
        return CHAN_NO_FLAT_RFD_GT_XA;
    }

    /**
     * set method 
     *
     * @param CHAN_NO_FLAT_RFD_GT_XA  null
     */
    public void setCHAN_NO_FLAT_RFD_GT_XA(BigDecimal CHAN_NO_FLAT_RFD_GT_XA) {
        this.CHAN_NO_FLAT_RFD_GT_XA = CHAN_NO_FLAT_RFD_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO_FLAT_PAY_GT_TX：null
     */
    public BigDecimal getCHAN_NO_FLAT_PAY_GT_TX() {
        return CHAN_NO_FLAT_PAY_GT_TX;
    }

    /**
     * set method 
     *
     * @param CHAN_NO_FLAT_PAY_GT_TX  null
     */
    public void setCHAN_NO_FLAT_PAY_GT_TX(BigDecimal CHAN_NO_FLAT_PAY_GT_TX) {
        this.CHAN_NO_FLAT_PAY_GT_TX = CHAN_NO_FLAT_PAY_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO_FLAT_RFD_GT_TX：null
     */
    public BigDecimal getCHAN_NO_FLAT_RFD_GT_TX() {
        return CHAN_NO_FLAT_RFD_GT_TX;
    }

    /**
     * set method 
     *
     * @param CHAN_NO_FLAT_RFD_GT_TX  null
     */
    public void setCHAN_NO_FLAT_RFD_GT_TX(BigDecimal CHAN_NO_FLAT_RFD_GT_TX) {
        this.CHAN_NO_FLAT_RFD_GT_TX = CHAN_NO_FLAT_RFD_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO_FLAT_PAY_GT_HX：null
     */
    public BigDecimal getCHAN_NO_FLAT_PAY_GT_HX() {
        return CHAN_NO_FLAT_PAY_GT_HX;
    }

    /**
     * set method 
     *
     * @param CHAN_NO_FLAT_PAY_GT_HX  null
     */
    public void setCHAN_NO_FLAT_PAY_GT_HX(BigDecimal CHAN_NO_FLAT_PAY_GT_HX) {
        this.CHAN_NO_FLAT_PAY_GT_HX = CHAN_NO_FLAT_PAY_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO_FLAT_RFD_GT_HX：null
     */
    public BigDecimal getCHAN_NO_FLAT_RFD_GT_HX() {
        return CHAN_NO_FLAT_RFD_GT_HX;
    }

    /**
     * set method 
     *
     * @param CHAN_NO_FLAT_RFD_GT_HX  null
     */
    public void setCHAN_NO_FLAT_RFD_GT_HX(BigDecimal CHAN_NO_FLAT_RFD_GT_HX) {
        this.CHAN_NO_FLAT_RFD_GT_HX = CHAN_NO_FLAT_RFD_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO_FLAT_PAY_GT_RX：null
     */
    public BigDecimal getCHAN_NO_FLAT_PAY_GT_RX() {
        return CHAN_NO_FLAT_PAY_GT_RX;
    }

    /**
     * set method 
     *
     * @param CHAN_NO_FLAT_PAY_GT_RX  null
     */
    public void setCHAN_NO_FLAT_PAY_GT_RX(BigDecimal CHAN_NO_FLAT_PAY_GT_RX) {
        this.CHAN_NO_FLAT_PAY_GT_RX = CHAN_NO_FLAT_PAY_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO_FLAT_RFD_GT_RX：null
     */
    public BigDecimal getCHAN_NO_FLAT_RFD_GT_RX() {
        return CHAN_NO_FLAT_RFD_GT_RX;
    }

    /**
     * set method 
     *
     * @param CHAN_NO_FLAT_RFD_GT_RX  null
     */
    public void setCHAN_NO_FLAT_RFD_GT_RX(BigDecimal CHAN_NO_FLAT_RFD_GT_RX) {
        this.CHAN_NO_FLAT_RFD_GT_RX = CHAN_NO_FLAT_RFD_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO_FLAT_PAY_GT_BA：null
     */
    public BigDecimal getCHAN_NO_FLAT_PAY_GT_BA() {
        return CHAN_NO_FLAT_PAY_GT_BA;
    }

    /**
     * set method 
     *
     * @param CHAN_NO_FLAT_PAY_GT_BA  null
     */
    public void setCHAN_NO_FLAT_PAY_GT_BA(BigDecimal CHAN_NO_FLAT_PAY_GT_BA) {
        this.CHAN_NO_FLAT_PAY_GT_BA = CHAN_NO_FLAT_PAY_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO_FLAT_RFD_GT_BA：null
     */
    public BigDecimal getCHAN_NO_FLAT_RFD_GT_BA() {
        return CHAN_NO_FLAT_RFD_GT_BA;
    }

    /**
     * set method 
     *
     * @param CHAN_NO_FLAT_RFD_GT_BA  null
     */
    public void setCHAN_NO_FLAT_RFD_GT_BA(BigDecimal CHAN_NO_FLAT_RFD_GT_BA) {
        this.CHAN_NO_FLAT_RFD_GT_BA = CHAN_NO_FLAT_RFD_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO_FLAT_PAY_GT_GP：null
     */
    public BigDecimal getCHAN_NO_FLAT_PAY_GT_GP() {
        return CHAN_NO_FLAT_PAY_GT_GP;
    }

    /**
     * set method 
     *
     * @param CHAN_NO_FLAT_PAY_GT_GP  null
     */
    public void setCHAN_NO_FLAT_PAY_GT_GP(BigDecimal CHAN_NO_FLAT_PAY_GT_GP) {
        this.CHAN_NO_FLAT_PAY_GT_GP = CHAN_NO_FLAT_PAY_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO_FLAT_RFD_GT_GP：null
     */
    public BigDecimal getCHAN_NO_FLAT_RFD_GT_GP() {
        return CHAN_NO_FLAT_RFD_GT_GP;
    }

    /**
     * set method 
     *
     * @param CHAN_NO_FLAT_RFD_GT_GP  null
     */
    public void setCHAN_NO_FLAT_RFD_GT_GP(BigDecimal CHAN_NO_FLAT_RFD_GT_GP) {
        this.CHAN_NO_FLAT_RFD_GT_GP = CHAN_NO_FLAT_RFD_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO_FLAT_PAY_GT_PN：null
     */
    public BigDecimal getCHAN_NO_FLAT_PAY_GT_PN() {
        return CHAN_NO_FLAT_PAY_GT_PN;
    }

    /**
     * set method 
     *
     * @param CHAN_NO_FLAT_PAY_GT_PN  null
     */
    public void setCHAN_NO_FLAT_PAY_GT_PN(BigDecimal CHAN_NO_FLAT_PAY_GT_PN) {
        this.CHAN_NO_FLAT_PAY_GT_PN = CHAN_NO_FLAT_PAY_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO_FLAT_RFD_GT_PN：null
     */
    public BigDecimal getCHAN_NO_FLAT_RFD_GT_PN() {
        return CHAN_NO_FLAT_RFD_GT_PN;
    }

    /**
     * set method 
     *
     * @param CHAN_NO_FLAT_RFD_GT_PN  null
     */
    public void setCHAN_NO_FLAT_RFD_GT_PN(BigDecimal CHAN_NO_FLAT_RFD_GT_PN) {
        this.CHAN_NO_FLAT_RFD_GT_PN = CHAN_NO_FLAT_RFD_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO_FLAT_PAY_AMT：null
     */
    public BigDecimal getCHAN_NO_FLAT_PAY_AMT() {
        return CHAN_NO_FLAT_PAY_AMT;
    }

    /**
     * set method 
     *
     * @param CHAN_NO_FLAT_PAY_AMT  null
     */
    public void setCHAN_NO_FLAT_PAY_AMT(BigDecimal CHAN_NO_FLAT_PAY_AMT) {
        this.CHAN_NO_FLAT_PAY_AMT = CHAN_NO_FLAT_PAY_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO_FLAT_PAY_COUNT：null
     */
    public Long getCHAN_NO_FLAT_PAY_COUNT() {
        return CHAN_NO_FLAT_PAY_COUNT;
    }

    /**
     * set method 
     *
     * @param CHAN_NO_FLAT_PAY_COUNT  null
     */
    public void setCHAN_NO_FLAT_PAY_COUNT(Long CHAN_NO_FLAT_PAY_COUNT) {
        this.CHAN_NO_FLAT_PAY_COUNT = CHAN_NO_FLAT_PAY_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO_FLAT_RFD_AMT：null
     */
    public BigDecimal getCHAN_NO_FLAT_RFD_AMT() {
        return CHAN_NO_FLAT_RFD_AMT;
    }

    /**
     * set method 
     *
     * @param CHAN_NO_FLAT_RFD_AMT  null
     */
    public void setCHAN_NO_FLAT_RFD_AMT(BigDecimal CHAN_NO_FLAT_RFD_AMT) {
        this.CHAN_NO_FLAT_RFD_AMT = CHAN_NO_FLAT_RFD_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_NO_FLAT_RFD_COUNT：null
     */
    public Long getCHAN_NO_FLAT_RFD_COUNT() {
        return CHAN_NO_FLAT_RFD_COUNT;
    }

    /**
     * set method 
     *
     * @param CHAN_NO_FLAT_RFD_COUNT  null
     */
    public void setCHAN_NO_FLAT_RFD_COUNT(Long CHAN_NO_FLAT_RFD_COUNT) {
        this.CHAN_NO_FLAT_RFD_COUNT = CHAN_NO_FLAT_RFD_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_FLAT_PAY_C_AMT：null
     */
    public BigDecimal getDOUBTS_LONG_FLAT_PAY_C_AMT() {
        return DOUBTS_LONG_FLAT_PAY_C_AMT;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_FLAT_PAY_C_AMT  null
     */
    public void setDOUBTS_LONG_FLAT_PAY_C_AMT(BigDecimal DOUBTS_LONG_FLAT_PAY_C_AMT) {
        this.DOUBTS_LONG_FLAT_PAY_C_AMT = DOUBTS_LONG_FLAT_PAY_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_FLAT_RFD_C_AMT：null
     */
    public BigDecimal getDOUBTS_LONG_FLAT_RFD_C_AMT() {
        return DOUBTS_LONG_FLAT_RFD_C_AMT;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_FLAT_RFD_C_AMT  null
     */
    public void setDOUBTS_LONG_FLAT_RFD_C_AMT(BigDecimal DOUBTS_LONG_FLAT_RFD_C_AMT) {
        this.DOUBTS_LONG_FLAT_RFD_C_AMT = DOUBTS_LONG_FLAT_RFD_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_FLAT_PAY_GI：null
     */
    public BigDecimal getDOUBTS_LONG_FLAT_PAY_GI() {
        return DOUBTS_LONG_FLAT_PAY_GI;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_FLAT_PAY_GI  null
     */
    public void setDOUBTS_LONG_FLAT_PAY_GI(BigDecimal DOUBTS_LONG_FLAT_PAY_GI) {
        this.DOUBTS_LONG_FLAT_PAY_GI = DOUBTS_LONG_FLAT_PAY_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_FLAT_RFD_GI：null
     */
    public BigDecimal getDOUBTS_LONG_FLAT_RFD_GI() {
        return DOUBTS_LONG_FLAT_RFD_GI;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_FLAT_RFD_GI  null
     */
    public void setDOUBTS_LONG_FLAT_RFD_GI(BigDecimal DOUBTS_LONG_FLAT_RFD_GI) {
        this.DOUBTS_LONG_FLAT_RFD_GI = DOUBTS_LONG_FLAT_RFD_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_FLAT_PAY_GU：null
     */
    public BigDecimal getDOUBTS_LONG_FLAT_PAY_GU() {
        return DOUBTS_LONG_FLAT_PAY_GU;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_FLAT_PAY_GU  null
     */
    public void setDOUBTS_LONG_FLAT_PAY_GU(BigDecimal DOUBTS_LONG_FLAT_PAY_GU) {
        this.DOUBTS_LONG_FLAT_PAY_GU = DOUBTS_LONG_FLAT_PAY_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_FLAT_RFD_GU：null
     */
    public BigDecimal getDOUBTS_LONG_FLAT_RFD_GU() {
        return DOUBTS_LONG_FLAT_RFD_GU;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_FLAT_RFD_GU  null
     */
    public void setDOUBTS_LONG_FLAT_RFD_GU(BigDecimal DOUBTS_LONG_FLAT_RFD_GU) {
        this.DOUBTS_LONG_FLAT_RFD_GU = DOUBTS_LONG_FLAT_RFD_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_FLAT_PAY_GT_XA：null
     */
    public BigDecimal getDOUBTS_LONG_FLAT_PAY_GT_XA() {
        return DOUBTS_LONG_FLAT_PAY_GT_XA;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_FLAT_PAY_GT_XA  null
     */
    public void setDOUBTS_LONG_FLAT_PAY_GT_XA(BigDecimal DOUBTS_LONG_FLAT_PAY_GT_XA) {
        this.DOUBTS_LONG_FLAT_PAY_GT_XA = DOUBTS_LONG_FLAT_PAY_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_FLAT_RFD_GT_XA：null
     */
    public BigDecimal getDOUBTS_LONG_FLAT_RFD_GT_XA() {
        return DOUBTS_LONG_FLAT_RFD_GT_XA;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_FLAT_RFD_GT_XA  null
     */
    public void setDOUBTS_LONG_FLAT_RFD_GT_XA(BigDecimal DOUBTS_LONG_FLAT_RFD_GT_XA) {
        this.DOUBTS_LONG_FLAT_RFD_GT_XA = DOUBTS_LONG_FLAT_RFD_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_FLAT_PAY_GT_TX：null
     */
    public BigDecimal getDOUBTS_LONG_FLAT_PAY_GT_TX() {
        return DOUBTS_LONG_FLAT_PAY_GT_TX;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_FLAT_PAY_GT_TX  null
     */
    public void setDOUBTS_LONG_FLAT_PAY_GT_TX(BigDecimal DOUBTS_LONG_FLAT_PAY_GT_TX) {
        this.DOUBTS_LONG_FLAT_PAY_GT_TX = DOUBTS_LONG_FLAT_PAY_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_FLAT_RFD_GT_TX：null
     */
    public BigDecimal getDOUBTS_LONG_FLAT_RFD_GT_TX() {
        return DOUBTS_LONG_FLAT_RFD_GT_TX;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_FLAT_RFD_GT_TX  null
     */
    public void setDOUBTS_LONG_FLAT_RFD_GT_TX(BigDecimal DOUBTS_LONG_FLAT_RFD_GT_TX) {
        this.DOUBTS_LONG_FLAT_RFD_GT_TX = DOUBTS_LONG_FLAT_RFD_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_FLAT_PAY_GT_HX：null
     */
    public BigDecimal getDOUBTS_LONG_FLAT_PAY_GT_HX() {
        return DOUBTS_LONG_FLAT_PAY_GT_HX;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_FLAT_PAY_GT_HX  null
     */
    public void setDOUBTS_LONG_FLAT_PAY_GT_HX(BigDecimal DOUBTS_LONG_FLAT_PAY_GT_HX) {
        this.DOUBTS_LONG_FLAT_PAY_GT_HX = DOUBTS_LONG_FLAT_PAY_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_FLAT_RFD_GT_HX：null
     */
    public BigDecimal getDOUBTS_LONG_FLAT_RFD_GT_HX() {
        return DOUBTS_LONG_FLAT_RFD_GT_HX;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_FLAT_RFD_GT_HX  null
     */
    public void setDOUBTS_LONG_FLAT_RFD_GT_HX(BigDecimal DOUBTS_LONG_FLAT_RFD_GT_HX) {
        this.DOUBTS_LONG_FLAT_RFD_GT_HX = DOUBTS_LONG_FLAT_RFD_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_FLAT_PAY_GT_RX：null
     */
    public BigDecimal getDOUBTS_LONG_FLAT_PAY_GT_RX() {
        return DOUBTS_LONG_FLAT_PAY_GT_RX;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_FLAT_PAY_GT_RX  null
     */
    public void setDOUBTS_LONG_FLAT_PAY_GT_RX(BigDecimal DOUBTS_LONG_FLAT_PAY_GT_RX) {
        this.DOUBTS_LONG_FLAT_PAY_GT_RX = DOUBTS_LONG_FLAT_PAY_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_FLAT_RFD_GT_RX：null
     */
    public BigDecimal getDOUBTS_LONG_FLAT_RFD_GT_RX() {
        return DOUBTS_LONG_FLAT_RFD_GT_RX;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_FLAT_RFD_GT_RX  null
     */
    public void setDOUBTS_LONG_FLAT_RFD_GT_RX(BigDecimal DOUBTS_LONG_FLAT_RFD_GT_RX) {
        this.DOUBTS_LONG_FLAT_RFD_GT_RX = DOUBTS_LONG_FLAT_RFD_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_FLAT_PAY_GT_BA：null
     */
    public BigDecimal getDOUBTS_LONG_FLAT_PAY_GT_BA() {
        return DOUBTS_LONG_FLAT_PAY_GT_BA;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_FLAT_PAY_GT_BA  null
     */
    public void setDOUBTS_LONG_FLAT_PAY_GT_BA(BigDecimal DOUBTS_LONG_FLAT_PAY_GT_BA) {
        this.DOUBTS_LONG_FLAT_PAY_GT_BA = DOUBTS_LONG_FLAT_PAY_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_FLAT_RFD_GT_BA：null
     */
    public BigDecimal getDOUBTS_LONG_FLAT_RFD_GT_BA() {
        return DOUBTS_LONG_FLAT_RFD_GT_BA;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_FLAT_RFD_GT_BA  null
     */
    public void setDOUBTS_LONG_FLAT_RFD_GT_BA(BigDecimal DOUBTS_LONG_FLAT_RFD_GT_BA) {
        this.DOUBTS_LONG_FLAT_RFD_GT_BA = DOUBTS_LONG_FLAT_RFD_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_FLAT_PAY_GT_GP：null
     */
    public BigDecimal getDOUBTS_LONG_FLAT_PAY_GT_GP() {
        return DOUBTS_LONG_FLAT_PAY_GT_GP;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_FLAT_PAY_GT_GP  null
     */
    public void setDOUBTS_LONG_FLAT_PAY_GT_GP(BigDecimal DOUBTS_LONG_FLAT_PAY_GT_GP) {
        this.DOUBTS_LONG_FLAT_PAY_GT_GP = DOUBTS_LONG_FLAT_PAY_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_FLAT_RFD_GT_GP：null
     */
    public BigDecimal getDOUBTS_LONG_FLAT_RFD_GT_GP() {
        return DOUBTS_LONG_FLAT_RFD_GT_GP;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_FLAT_RFD_GT_GP  null
     */
    public void setDOUBTS_LONG_FLAT_RFD_GT_GP(BigDecimal DOUBTS_LONG_FLAT_RFD_GT_GP) {
        this.DOUBTS_LONG_FLAT_RFD_GT_GP = DOUBTS_LONG_FLAT_RFD_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_FLAT_PAY_GT_PN：null
     */
    public BigDecimal getDOUBTS_LONG_FLAT_PAY_GT_PN() {
        return DOUBTS_LONG_FLAT_PAY_GT_PN;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_FLAT_PAY_GT_PN  null
     */
    public void setDOUBTS_LONG_FLAT_PAY_GT_PN(BigDecimal DOUBTS_LONG_FLAT_PAY_GT_PN) {
        this.DOUBTS_LONG_FLAT_PAY_GT_PN = DOUBTS_LONG_FLAT_PAY_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_FLAT_RFD_GT_PN：null
     */
    public BigDecimal getDOUBTS_LONG_FLAT_RFD_GT_PN() {
        return DOUBTS_LONG_FLAT_RFD_GT_PN;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_FLAT_RFD_GT_PN  null
     */
    public void setDOUBTS_LONG_FLAT_RFD_GT_PN(BigDecimal DOUBTS_LONG_FLAT_RFD_GT_PN) {
        this.DOUBTS_LONG_FLAT_RFD_GT_PN = DOUBTS_LONG_FLAT_RFD_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_FLAT_PAY_AMT：null
     */
    public BigDecimal getDOUBTS_LONG_FLAT_PAY_AMT() {
        return DOUBTS_LONG_FLAT_PAY_AMT;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_FLAT_PAY_AMT  null
     */
    public void setDOUBTS_LONG_FLAT_PAY_AMT(BigDecimal DOUBTS_LONG_FLAT_PAY_AMT) {
        this.DOUBTS_LONG_FLAT_PAY_AMT = DOUBTS_LONG_FLAT_PAY_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_FLAT_PAY_COUNT：null
     */
    public Long getDOUBTS_LONG_FLAT_PAY_COUNT() {
        return DOUBTS_LONG_FLAT_PAY_COUNT;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_FLAT_PAY_COUNT  null
     */
    public void setDOUBTS_LONG_FLAT_PAY_COUNT(Long DOUBTS_LONG_FLAT_PAY_COUNT) {
        this.DOUBTS_LONG_FLAT_PAY_COUNT = DOUBTS_LONG_FLAT_PAY_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_FLAT_RFD_AMT：null
     */
    public BigDecimal getDOUBTS_LONG_FLAT_RFD_AMT() {
        return DOUBTS_LONG_FLAT_RFD_AMT;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_FLAT_RFD_AMT  null
     */
    public void setDOUBTS_LONG_FLAT_RFD_AMT(BigDecimal DOUBTS_LONG_FLAT_RFD_AMT) {
        this.DOUBTS_LONG_FLAT_RFD_AMT = DOUBTS_LONG_FLAT_RFD_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_FLAT_RFD_COUNT：null
     */
    public Long getDOUBTS_LONG_FLAT_RFD_COUNT() {
        return DOUBTS_LONG_FLAT_RFD_COUNT;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_FLAT_RFD_COUNT  null
     */
    public void setDOUBTS_LONG_FLAT_RFD_COUNT(Long DOUBTS_LONG_FLAT_RFD_COUNT) {
        this.DOUBTS_LONG_FLAT_RFD_COUNT = DOUBTS_LONG_FLAT_RFD_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_NO_FLAT_PAY_C_AMT：null
     */
    public BigDecimal getDOUBTS_LONG_NO_FLAT_PAY_C_AMT() {
        return DOUBTS_LONG_NO_FLAT_PAY_C_AMT;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_NO_FLAT_PAY_C_AMT  null
     */
    public void setDOUBTS_LONG_NO_FLAT_PAY_C_AMT(BigDecimal DOUBTS_LONG_NO_FLAT_PAY_C_AMT) {
        this.DOUBTS_LONG_NO_FLAT_PAY_C_AMT = DOUBTS_LONG_NO_FLAT_PAY_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_NO_FLAT_RFD_C_AMT：null
     */
    public BigDecimal getDOUBTS_LONG_NO_FLAT_RFD_C_AMT() {
        return DOUBTS_LONG_NO_FLAT_RFD_C_AMT;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_NO_FLAT_RFD_C_AMT  null
     */
    public void setDOUBTS_LONG_NO_FLAT_RFD_C_AMT(BigDecimal DOUBTS_LONG_NO_FLAT_RFD_C_AMT) {
        this.DOUBTS_LONG_NO_FLAT_RFD_C_AMT = DOUBTS_LONG_NO_FLAT_RFD_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_NO_FLAT_PAY_GI：null
     */
    public BigDecimal getDOUBTS_LONG_NO_FLAT_PAY_GI() {
        return DOUBTS_LONG_NO_FLAT_PAY_GI;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_NO_FLAT_PAY_GI  null
     */
    public void setDOUBTS_LONG_NO_FLAT_PAY_GI(BigDecimal DOUBTS_LONG_NO_FLAT_PAY_GI) {
        this.DOUBTS_LONG_NO_FLAT_PAY_GI = DOUBTS_LONG_NO_FLAT_PAY_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_NO_FLAT_RFD_GI：null
     */
    public BigDecimal getDOUBTS_LONG_NO_FLAT_RFD_GI() {
        return DOUBTS_LONG_NO_FLAT_RFD_GI;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_NO_FLAT_RFD_GI  null
     */
    public void setDOUBTS_LONG_NO_FLAT_RFD_GI(BigDecimal DOUBTS_LONG_NO_FLAT_RFD_GI) {
        this.DOUBTS_LONG_NO_FLAT_RFD_GI = DOUBTS_LONG_NO_FLAT_RFD_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_NO_FLAT_PAY_GU：null
     */
    public BigDecimal getDOUBTS_LONG_NO_FLAT_PAY_GU() {
        return DOUBTS_LONG_NO_FLAT_PAY_GU;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_NO_FLAT_PAY_GU  null
     */
    public void setDOUBTS_LONG_NO_FLAT_PAY_GU(BigDecimal DOUBTS_LONG_NO_FLAT_PAY_GU) {
        this.DOUBTS_LONG_NO_FLAT_PAY_GU = DOUBTS_LONG_NO_FLAT_PAY_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_NO_FLAT_RFD_GU：null
     */
    public BigDecimal getDOUBTS_LONG_NO_FLAT_RFD_GU() {
        return DOUBTS_LONG_NO_FLAT_RFD_GU;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_NO_FLAT_RFD_GU  null
     */
    public void setDOUBTS_LONG_NO_FLAT_RFD_GU(BigDecimal DOUBTS_LONG_NO_FLAT_RFD_GU) {
        this.DOUBTS_LONG_NO_FLAT_RFD_GU = DOUBTS_LONG_NO_FLAT_RFD_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_NO_FLAT_PAY_GT_XA：null
     */
    public BigDecimal getDOUBTS_LONG_NO_FLAT_PAY_GT_XA() {
        return DOUBTS_LONG_NO_FLAT_PAY_GT_XA;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_NO_FLAT_PAY_GT_XA  null
     */
    public void setDOUBTS_LONG_NO_FLAT_PAY_GT_XA(BigDecimal DOUBTS_LONG_NO_FLAT_PAY_GT_XA) {
        this.DOUBTS_LONG_NO_FLAT_PAY_GT_XA = DOUBTS_LONG_NO_FLAT_PAY_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_NO_FLAT_RFD_GT_XA：null
     */
    public BigDecimal getDOUBTS_LONG_NO_FLAT_RFD_GT_XA() {
        return DOUBTS_LONG_NO_FLAT_RFD_GT_XA;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_NO_FLAT_RFD_GT_XA  null
     */
    public void setDOUBTS_LONG_NO_FLAT_RFD_GT_XA(BigDecimal DOUBTS_LONG_NO_FLAT_RFD_GT_XA) {
        this.DOUBTS_LONG_NO_FLAT_RFD_GT_XA = DOUBTS_LONG_NO_FLAT_RFD_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_NO_FLAT_PAY_GT_TX：null
     */
    public BigDecimal getDOUBTS_LONG_NO_FLAT_PAY_GT_TX() {
        return DOUBTS_LONG_NO_FLAT_PAY_GT_TX;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_NO_FLAT_PAY_GT_TX  null
     */
    public void setDOUBTS_LONG_NO_FLAT_PAY_GT_TX(BigDecimal DOUBTS_LONG_NO_FLAT_PAY_GT_TX) {
        this.DOUBTS_LONG_NO_FLAT_PAY_GT_TX = DOUBTS_LONG_NO_FLAT_PAY_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_NO_FLAT_RFD_GT_TX：null
     */
    public BigDecimal getDOUBTS_LONG_NO_FLAT_RFD_GT_TX() {
        return DOUBTS_LONG_NO_FLAT_RFD_GT_TX;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_NO_FLAT_RFD_GT_TX  null
     */
    public void setDOUBTS_LONG_NO_FLAT_RFD_GT_TX(BigDecimal DOUBTS_LONG_NO_FLAT_RFD_GT_TX) {
        this.DOUBTS_LONG_NO_FLAT_RFD_GT_TX = DOUBTS_LONG_NO_FLAT_RFD_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_NO_FLAT_PAY_GT_HX：null
     */
    public BigDecimal getDOUBTS_LONG_NO_FLAT_PAY_GT_HX() {
        return DOUBTS_LONG_NO_FLAT_PAY_GT_HX;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_NO_FLAT_PAY_GT_HX  null
     */
    public void setDOUBTS_LONG_NO_FLAT_PAY_GT_HX(BigDecimal DOUBTS_LONG_NO_FLAT_PAY_GT_HX) {
        this.DOUBTS_LONG_NO_FLAT_PAY_GT_HX = DOUBTS_LONG_NO_FLAT_PAY_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_NO_FLAT_RFD_GT_HX：null
     */
    public BigDecimal getDOUBTS_LONG_NO_FLAT_RFD_GT_HX() {
        return DOUBTS_LONG_NO_FLAT_RFD_GT_HX;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_NO_FLAT_RFD_GT_HX  null
     */
    public void setDOUBTS_LONG_NO_FLAT_RFD_GT_HX(BigDecimal DOUBTS_LONG_NO_FLAT_RFD_GT_HX) {
        this.DOUBTS_LONG_NO_FLAT_RFD_GT_HX = DOUBTS_LONG_NO_FLAT_RFD_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_NO_FLAT_PAY_GT_RX：null
     */
    public BigDecimal getDOUBTS_LONG_NO_FLAT_PAY_GT_RX() {
        return DOUBTS_LONG_NO_FLAT_PAY_GT_RX;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_NO_FLAT_PAY_GT_RX  null
     */
    public void setDOUBTS_LONG_NO_FLAT_PAY_GT_RX(BigDecimal DOUBTS_LONG_NO_FLAT_PAY_GT_RX) {
        this.DOUBTS_LONG_NO_FLAT_PAY_GT_RX = DOUBTS_LONG_NO_FLAT_PAY_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_NO_FLAT_RFD_GT_RX：null
     */
    public BigDecimal getDOUBTS_LONG_NO_FLAT_RFD_GT_RX() {
        return DOUBTS_LONG_NO_FLAT_RFD_GT_RX;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_NO_FLAT_RFD_GT_RX  null
     */
    public void setDOUBTS_LONG_NO_FLAT_RFD_GT_RX(BigDecimal DOUBTS_LONG_NO_FLAT_RFD_GT_RX) {
        this.DOUBTS_LONG_NO_FLAT_RFD_GT_RX = DOUBTS_LONG_NO_FLAT_RFD_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_NO_FLAT_PAY_GT_BA：null
     */
    public BigDecimal getDOUBTS_LONG_NO_FLAT_PAY_GT_BA() {
        return DOUBTS_LONG_NO_FLAT_PAY_GT_BA;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_NO_FLAT_PAY_GT_BA  null
     */
    public void setDOUBTS_LONG_NO_FLAT_PAY_GT_BA(BigDecimal DOUBTS_LONG_NO_FLAT_PAY_GT_BA) {
        this.DOUBTS_LONG_NO_FLAT_PAY_GT_BA = DOUBTS_LONG_NO_FLAT_PAY_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_NO_FLAT_RFD_GT_BA：null
     */
    public BigDecimal getDOUBTS_LONG_NO_FLAT_RFD_GT_BA() {
        return DOUBTS_LONG_NO_FLAT_RFD_GT_BA;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_NO_FLAT_RFD_GT_BA  null
     */
    public void setDOUBTS_LONG_NO_FLAT_RFD_GT_BA(BigDecimal DOUBTS_LONG_NO_FLAT_RFD_GT_BA) {
        this.DOUBTS_LONG_NO_FLAT_RFD_GT_BA = DOUBTS_LONG_NO_FLAT_RFD_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_NO_FLAT_PAY_GT_GP：null
     */
    public BigDecimal getDOUBTS_LONG_NO_FLAT_PAY_GT_GP() {
        return DOUBTS_LONG_NO_FLAT_PAY_GT_GP;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_NO_FLAT_PAY_GT_GP  null
     */
    public void setDOUBTS_LONG_NO_FLAT_PAY_GT_GP(BigDecimal DOUBTS_LONG_NO_FLAT_PAY_GT_GP) {
        this.DOUBTS_LONG_NO_FLAT_PAY_GT_GP = DOUBTS_LONG_NO_FLAT_PAY_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_NO_FLAT_RFD_GT_GP：null
     */
    public BigDecimal getDOUBTS_LONG_NO_FLAT_RFD_GT_GP() {
        return DOUBTS_LONG_NO_FLAT_RFD_GT_GP;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_NO_FLAT_RFD_GT_GP  null
     */
    public void setDOUBTS_LONG_NO_FLAT_RFD_GT_GP(BigDecimal DOUBTS_LONG_NO_FLAT_RFD_GT_GP) {
        this.DOUBTS_LONG_NO_FLAT_RFD_GT_GP = DOUBTS_LONG_NO_FLAT_RFD_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_NO_FLAT_PAY_GT_PN：null
     */
    public BigDecimal getDOUBTS_LONG_NO_FLAT_PAY_GT_PN() {
        return DOUBTS_LONG_NO_FLAT_PAY_GT_PN;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_NO_FLAT_PAY_GT_PN  null
     */
    public void setDOUBTS_LONG_NO_FLAT_PAY_GT_PN(BigDecimal DOUBTS_LONG_NO_FLAT_PAY_GT_PN) {
        this.DOUBTS_LONG_NO_FLAT_PAY_GT_PN = DOUBTS_LONG_NO_FLAT_PAY_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_NO_FLAT_RFD_GT_PN：null
     */
    public BigDecimal getDOUBTS_LONG_NO_FLAT_RFD_GT_PN() {
        return DOUBTS_LONG_NO_FLAT_RFD_GT_PN;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_NO_FLAT_RFD_GT_PN  null
     */
    public void setDOUBTS_LONG_NO_FLAT_RFD_GT_PN(BigDecimal DOUBTS_LONG_NO_FLAT_RFD_GT_PN) {
        this.DOUBTS_LONG_NO_FLAT_RFD_GT_PN = DOUBTS_LONG_NO_FLAT_RFD_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_NO_FLAT_PAY_AMT：null
     */
    public BigDecimal getDOUBTS_LONG_NO_FLAT_PAY_AMT() {
        return DOUBTS_LONG_NO_FLAT_PAY_AMT;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_NO_FLAT_PAY_AMT  null
     */
    public void setDOUBTS_LONG_NO_FLAT_PAY_AMT(BigDecimal DOUBTS_LONG_NO_FLAT_PAY_AMT) {
        this.DOUBTS_LONG_NO_FLAT_PAY_AMT = DOUBTS_LONG_NO_FLAT_PAY_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_NO_FLAT_PAY_COUNT：null
     */
    public Long getDOUBTS_LONG_NO_FLAT_PAY_COUNT() {
        return DOUBTS_LONG_NO_FLAT_PAY_COUNT;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_NO_FLAT_PAY_COUNT  null
     */
    public void setDOUBTS_LONG_NO_FLAT_PAY_COUNT(Long DOUBTS_LONG_NO_FLAT_PAY_COUNT) {
        this.DOUBTS_LONG_NO_FLAT_PAY_COUNT = DOUBTS_LONG_NO_FLAT_PAY_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_NO_FLAT_RFD_AMT：null
     */
    public BigDecimal getDOUBTS_LONG_NO_FLAT_RFD_AMT() {
        return DOUBTS_LONG_NO_FLAT_RFD_AMT;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_NO_FLAT_RFD_AMT  null
     */
    public void setDOUBTS_LONG_NO_FLAT_RFD_AMT(BigDecimal DOUBTS_LONG_NO_FLAT_RFD_AMT) {
        this.DOUBTS_LONG_NO_FLAT_RFD_AMT = DOUBTS_LONG_NO_FLAT_RFD_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.DOUBTS_LONG_NO_FLAT_RFD_COUNT：null
     */
    public Long getDOUBTS_LONG_NO_FLAT_RFD_COUNT() {
        return DOUBTS_LONG_NO_FLAT_RFD_COUNT;
    }

    /**
     * set method 
     *
     * @param DOUBTS_LONG_NO_FLAT_RFD_COUNT  null
     */
    public void setDOUBTS_LONG_NO_FLAT_RFD_COUNT(Long DOUBTS_LONG_NO_FLAT_RFD_COUNT) {
        this.DOUBTS_LONG_NO_FLAT_RFD_COUNT = DOUBTS_LONG_NO_FLAT_RFD_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DIFFE_LONG_PAY_C_AMT：null
     */
    public BigDecimal getCHAN_DIFFE_LONG_PAY_C_AMT() {
        return CHAN_DIFFE_LONG_PAY_C_AMT;
    }

    /**
     * set method 
     *
     * @param CHAN_DIFFE_LONG_PAY_C_AMT  null
     */
    public void setCHAN_DIFFE_LONG_PAY_C_AMT(BigDecimal CHAN_DIFFE_LONG_PAY_C_AMT) {
        this.CHAN_DIFFE_LONG_PAY_C_AMT = CHAN_DIFFE_LONG_PAY_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DIFFE_LONG_RFD_C_AMT：null
     */
    public BigDecimal getCHAN_DIFFE_LONG_RFD_C_AMT() {
        return CHAN_DIFFE_LONG_RFD_C_AMT;
    }

    /**
     * set method 
     *
     * @param CHAN_DIFFE_LONG_RFD_C_AMT  null
     */
    public void setCHAN_DIFFE_LONG_RFD_C_AMT(BigDecimal CHAN_DIFFE_LONG_RFD_C_AMT) {
        this.CHAN_DIFFE_LONG_RFD_C_AMT = CHAN_DIFFE_LONG_RFD_C_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DIFFE_LONG_PAY_GI：null
     */
    public BigDecimal getCHAN_DIFFE_LONG_PAY_GI() {
        return CHAN_DIFFE_LONG_PAY_GI;
    }

    /**
     * set method 
     *
     * @param CHAN_DIFFE_LONG_PAY_GI  null
     */
    public void setCHAN_DIFFE_LONG_PAY_GI(BigDecimal CHAN_DIFFE_LONG_PAY_GI) {
        this.CHAN_DIFFE_LONG_PAY_GI = CHAN_DIFFE_LONG_PAY_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DIFFE_LONG_RFD_GI：null
     */
    public BigDecimal getCHAN_DIFFE_LONG_RFD_GI() {
        return CHAN_DIFFE_LONG_RFD_GI;
    }

    /**
     * set method 
     *
     * @param CHAN_DIFFE_LONG_RFD_GI  null
     */
    public void setCHAN_DIFFE_LONG_RFD_GI(BigDecimal CHAN_DIFFE_LONG_RFD_GI) {
        this.CHAN_DIFFE_LONG_RFD_GI = CHAN_DIFFE_LONG_RFD_GI;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DIFFE_LONG_PAY_GU：null
     */
    public BigDecimal getCHAN_DIFFE_LONG_PAY_GU() {
        return CHAN_DIFFE_LONG_PAY_GU;
    }

    /**
     * set method 
     *
     * @param CHAN_DIFFE_LONG_PAY_GU  null
     */
    public void setCHAN_DIFFE_LONG_PAY_GU(BigDecimal CHAN_DIFFE_LONG_PAY_GU) {
        this.CHAN_DIFFE_LONG_PAY_GU = CHAN_DIFFE_LONG_PAY_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DIFFE_LONG_RFD_GU：null
     */
    public BigDecimal getCHAN_DIFFE_LONG_RFD_GU() {
        return CHAN_DIFFE_LONG_RFD_GU;
    }

    /**
     * set method 
     *
     * @param CHAN_DIFFE_LONG_RFD_GU  null
     */
    public void setCHAN_DIFFE_LONG_RFD_GU(BigDecimal CHAN_DIFFE_LONG_RFD_GU) {
        this.CHAN_DIFFE_LONG_RFD_GU = CHAN_DIFFE_LONG_RFD_GU;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DIFFE_LONG_PAY_GT_XA：null
     */
    public BigDecimal getCHAN_DIFFE_LONG_PAY_GT_XA() {
        return CHAN_DIFFE_LONG_PAY_GT_XA;
    }

    /**
     * set method 
     *
     * @param CHAN_DIFFE_LONG_PAY_GT_XA  null
     */
    public void setCHAN_DIFFE_LONG_PAY_GT_XA(BigDecimal CHAN_DIFFE_LONG_PAY_GT_XA) {
        this.CHAN_DIFFE_LONG_PAY_GT_XA = CHAN_DIFFE_LONG_PAY_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DIFFE_LONG_RFD_GT_XA：null
     */
    public BigDecimal getCHAN_DIFFE_LONG_RFD_GT_XA() {
        return CHAN_DIFFE_LONG_RFD_GT_XA;
    }

    /**
     * set method 
     *
     * @param CHAN_DIFFE_LONG_RFD_GT_XA  null
     */
    public void setCHAN_DIFFE_LONG_RFD_GT_XA(BigDecimal CHAN_DIFFE_LONG_RFD_GT_XA) {
        this.CHAN_DIFFE_LONG_RFD_GT_XA = CHAN_DIFFE_LONG_RFD_GT_XA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DIFFE_LONG_PAY_GT_TX：null
     */
    public BigDecimal getCHAN_DIFFE_LONG_PAY_GT_TX() {
        return CHAN_DIFFE_LONG_PAY_GT_TX;
    }

    /**
     * set method 
     *
     * @param CHAN_DIFFE_LONG_PAY_GT_TX  null
     */
    public void setCHAN_DIFFE_LONG_PAY_GT_TX(BigDecimal CHAN_DIFFE_LONG_PAY_GT_TX) {
        this.CHAN_DIFFE_LONG_PAY_GT_TX = CHAN_DIFFE_LONG_PAY_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DIFFE_LONG_RFD_GT_TX：null
     */
    public BigDecimal getCHAN_DIFFE_LONG_RFD_GT_TX() {
        return CHAN_DIFFE_LONG_RFD_GT_TX;
    }

    /**
     * set method 
     *
     * @param CHAN_DIFFE_LONG_RFD_GT_TX  null
     */
    public void setCHAN_DIFFE_LONG_RFD_GT_TX(BigDecimal CHAN_DIFFE_LONG_RFD_GT_TX) {
        this.CHAN_DIFFE_LONG_RFD_GT_TX = CHAN_DIFFE_LONG_RFD_GT_TX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DIFFE_LONG_PAY_GT_HX：null
     */
    public BigDecimal getCHAN_DIFFE_LONG_PAY_GT_HX() {
        return CHAN_DIFFE_LONG_PAY_GT_HX;
    }

    /**
     * set method 
     *
     * @param CHAN_DIFFE_LONG_PAY_GT_HX  null
     */
    public void setCHAN_DIFFE_LONG_PAY_GT_HX(BigDecimal CHAN_DIFFE_LONG_PAY_GT_HX) {
        this.CHAN_DIFFE_LONG_PAY_GT_HX = CHAN_DIFFE_LONG_PAY_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DIFFE_LONG_RFD_GT_HX：null
     */
    public BigDecimal getCHAN_DIFFE_LONG_RFD_GT_HX() {
        return CHAN_DIFFE_LONG_RFD_GT_HX;
    }

    /**
     * set method 
     *
     * @param CHAN_DIFFE_LONG_RFD_GT_HX  null
     */
    public void setCHAN_DIFFE_LONG_RFD_GT_HX(BigDecimal CHAN_DIFFE_LONG_RFD_GT_HX) {
        this.CHAN_DIFFE_LONG_RFD_GT_HX = CHAN_DIFFE_LONG_RFD_GT_HX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DIFFE_LONG_PAY_GT_RX：null
     */
    public BigDecimal getCHAN_DIFFE_LONG_PAY_GT_RX() {
        return CHAN_DIFFE_LONG_PAY_GT_RX;
    }

    /**
     * set method 
     *
     * @param CHAN_DIFFE_LONG_PAY_GT_RX  null
     */
    public void setCHAN_DIFFE_LONG_PAY_GT_RX(BigDecimal CHAN_DIFFE_LONG_PAY_GT_RX) {
        this.CHAN_DIFFE_LONG_PAY_GT_RX = CHAN_DIFFE_LONG_PAY_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DIFFE_LONG_RFD_GT_RX：null
     */
    public BigDecimal getCHAN_DIFFE_LONG_RFD_GT_RX() {
        return CHAN_DIFFE_LONG_RFD_GT_RX;
    }

    /**
     * set method 
     *
     * @param CHAN_DIFFE_LONG_RFD_GT_RX  null
     */
    public void setCHAN_DIFFE_LONG_RFD_GT_RX(BigDecimal CHAN_DIFFE_LONG_RFD_GT_RX) {
        this.CHAN_DIFFE_LONG_RFD_GT_RX = CHAN_DIFFE_LONG_RFD_GT_RX;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DIFFE_LONG_PAY_GT_BA：null
     */
    public BigDecimal getCHAN_DIFFE_LONG_PAY_GT_BA() {
        return CHAN_DIFFE_LONG_PAY_GT_BA;
    }

    /**
     * set method 
     *
     * @param CHAN_DIFFE_LONG_PAY_GT_BA  null
     */
    public void setCHAN_DIFFE_LONG_PAY_GT_BA(BigDecimal CHAN_DIFFE_LONG_PAY_GT_BA) {
        this.CHAN_DIFFE_LONG_PAY_GT_BA = CHAN_DIFFE_LONG_PAY_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DIFFE_LONG_RFD_GT_BA：null
     */
    public BigDecimal getCHAN_DIFFE_LONG_RFD_GT_BA() {
        return CHAN_DIFFE_LONG_RFD_GT_BA;
    }

    /**
     * set method 
     *
     * @param CHAN_DIFFE_LONG_RFD_GT_BA  null
     */
    public void setCHAN_DIFFE_LONG_RFD_GT_BA(BigDecimal CHAN_DIFFE_LONG_RFD_GT_BA) {
        this.CHAN_DIFFE_LONG_RFD_GT_BA = CHAN_DIFFE_LONG_RFD_GT_BA;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DIFFE_LONG_PAY_GT_GP：null
     */
    public BigDecimal getCHAN_DIFFE_LONG_PAY_GT_GP() {
        return CHAN_DIFFE_LONG_PAY_GT_GP;
    }

    /**
     * set method 
     *
     * @param CHAN_DIFFE_LONG_PAY_GT_GP  null
     */
    public void setCHAN_DIFFE_LONG_PAY_GT_GP(BigDecimal CHAN_DIFFE_LONG_PAY_GT_GP) {
        this.CHAN_DIFFE_LONG_PAY_GT_GP = CHAN_DIFFE_LONG_PAY_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DIFFE_LONG_RFD_GT_GP：null
     */
    public BigDecimal getCHAN_DIFFE_LONG_RFD_GT_GP() {
        return CHAN_DIFFE_LONG_RFD_GT_GP;
    }

    /**
     * set method 
     *
     * @param CHAN_DIFFE_LONG_RFD_GT_GP  null
     */
    public void setCHAN_DIFFE_LONG_RFD_GT_GP(BigDecimal CHAN_DIFFE_LONG_RFD_GT_GP) {
        this.CHAN_DIFFE_LONG_RFD_GT_GP = CHAN_DIFFE_LONG_RFD_GT_GP;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DIFFE_LONG_PAY_GT_PN：null
     */
    public BigDecimal getCHAN_DIFFE_LONG_PAY_GT_PN() {
        return CHAN_DIFFE_LONG_PAY_GT_PN;
    }

    /**
     * set method 
     *
     * @param CHAN_DIFFE_LONG_PAY_GT_PN  null
     */
    public void setCHAN_DIFFE_LONG_PAY_GT_PN(BigDecimal CHAN_DIFFE_LONG_PAY_GT_PN) {
        this.CHAN_DIFFE_LONG_PAY_GT_PN = CHAN_DIFFE_LONG_PAY_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DIFFE_LONG_RFD_GT_PN：null
     */
    public BigDecimal getCHAN_DIFFE_LONG_RFD_GT_PN() {
        return CHAN_DIFFE_LONG_RFD_GT_PN;
    }

    /**
     * set method 
     *
     * @param CHAN_DIFFE_LONG_RFD_GT_PN  null
     */
    public void setCHAN_DIFFE_LONG_RFD_GT_PN(BigDecimal CHAN_DIFFE_LONG_RFD_GT_PN) {
        this.CHAN_DIFFE_LONG_RFD_GT_PN = CHAN_DIFFE_LONG_RFD_GT_PN;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DIFFE_LONG_PAY_AMT：null
     */
    public BigDecimal getCHAN_DIFFE_LONG_PAY_AMT() {
        return CHAN_DIFFE_LONG_PAY_AMT;
    }

    /**
     * set method 
     *
     * @param CHAN_DIFFE_LONG_PAY_AMT  null
     */
    public void setCHAN_DIFFE_LONG_PAY_AMT(BigDecimal CHAN_DIFFE_LONG_PAY_AMT) {
        this.CHAN_DIFFE_LONG_PAY_AMT = CHAN_DIFFE_LONG_PAY_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DIFFE_LONG_PAY_COUNT：null
     */
    public Long getCHAN_DIFFE_LONG_PAY_COUNT() {
        return CHAN_DIFFE_LONG_PAY_COUNT;
    }

    /**
     * set method 
     *
     * @param CHAN_DIFFE_LONG_PAY_COUNT  null
     */
    public void setCHAN_DIFFE_LONG_PAY_COUNT(Long CHAN_DIFFE_LONG_PAY_COUNT) {
        this.CHAN_DIFFE_LONG_PAY_COUNT = CHAN_DIFFE_LONG_PAY_COUNT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DIFFE_LONG_RFD_AMT：null
     */
    public BigDecimal getCHAN_DIFFE_LONG_RFD_AMT() {
        return CHAN_DIFFE_LONG_RFD_AMT;
    }

    /**
     * set method 
     *
     * @param CHAN_DIFFE_LONG_RFD_AMT  null
     */
    public void setCHAN_DIFFE_LONG_RFD_AMT(BigDecimal CHAN_DIFFE_LONG_RFD_AMT) {
        this.CHAN_DIFFE_LONG_RFD_AMT = CHAN_DIFFE_LONG_RFD_AMT;
    }

    /**
     * get method 
     *
     * @return IECPAY.CHECK_ACC_INFO.CHAN_DIFFE_LONG_RFD_COUNT：null
     */
    public Long getCHAN_DIFFE_LONG_RFD_COUNT() {
        return CHAN_DIFFE_LONG_RFD_COUNT;
    }

    /**
     * set method 
     *
     * @param CHAN_DIFFE_LONG_RFD_COUNT  null
     */
    public void setCHAN_DIFFE_LONG_RFD_COUNT(Long CHAN_DIFFE_LONG_RFD_COUNT) {
        this.CHAN_DIFFE_LONG_RFD_COUNT = CHAN_DIFFE_LONG_RFD_COUNT;
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
        Check_acc_info other = (Check_acc_info) that;
        return (this.getTASK_ID() == null ? other.getTASK_ID() == null : this.getTASK_ID().equals(other.getTASK_ID()))
            && (this.getCHAN_NO() == null ? other.getCHAN_NO() == null : this.getCHAN_NO().equals(other.getCHAN_NO()))
            && (this.getCHECK_DT() == null ? other.getCHECK_DT() == null : this.getCHECK_DT().equals(other.getCHECK_DT()))
            && (this.getAC_DT() == null ? other.getAC_DT() == null : this.getAC_DT().equals(other.getAC_DT()))
            && (this.getSTART_TM() == null ? other.getSTART_TM() == null : this.getSTART_TM().equals(other.getSTART_TM()))
            && (this.getEND_TM() == null ? other.getEND_TM() == null : this.getEND_TM().equals(other.getEND_TM()))
            && (this.getCHECK_STATE() == null ? other.getCHECK_STATE() == null : this.getCHECK_STATE().equals(other.getCHECK_STATE()))
            && (this.getREMARK() == null ? other.getREMARK() == null : this.getREMARK().equals(other.getREMARK()))
            && (this.getCHAN_FILENAME() == null ? other.getCHAN_FILENAME() == null : this.getCHAN_FILENAME().equals(other.getCHAN_FILENAME()))
            && (this.getTRAN_ACC_TO() == null ? other.getTRAN_ACC_TO() == null : this.getTRAN_ACC_TO().equals(other.getTRAN_ACC_TO()))
            && (this.getTRAN_ACC_AMT() == null ? other.getTRAN_ACC_AMT() == null : this.getTRAN_ACC_AMT().equals(other.getTRAN_ACC_AMT()))
            && (this.getOUR_PAY_TOTAL_C_AMT() == null ? other.getOUR_PAY_TOTAL_C_AMT() == null : this.getOUR_PAY_TOTAL_C_AMT().equals(other.getOUR_PAY_TOTAL_C_AMT()))
            && (this.getOUR_RFD_TOTAL_C_AMT() == null ? other.getOUR_RFD_TOTAL_C_AMT() == null : this.getOUR_RFD_TOTAL_C_AMT().equals(other.getOUR_RFD_TOTAL_C_AMT()))
            && (this.getOUR_PAY_TOTAL_GI() == null ? other.getOUR_PAY_TOTAL_GI() == null : this.getOUR_PAY_TOTAL_GI().equals(other.getOUR_PAY_TOTAL_GI()))
            && (this.getOUR_RFD_TOTAL_GI() == null ? other.getOUR_RFD_TOTAL_GI() == null : this.getOUR_RFD_TOTAL_GI().equals(other.getOUR_RFD_TOTAL_GI()))
            && (this.getOUR_PAY_TOTAL_GU() == null ? other.getOUR_PAY_TOTAL_GU() == null : this.getOUR_PAY_TOTAL_GU().equals(other.getOUR_PAY_TOTAL_GU()))
            && (this.getOUR_RFD_TOTAL_GU() == null ? other.getOUR_RFD_TOTAL_GU() == null : this.getOUR_RFD_TOTAL_GU().equals(other.getOUR_RFD_TOTAL_GU()))
            && (this.getOUR_PAY_TOTAL_GT_XA() == null ? other.getOUR_PAY_TOTAL_GT_XA() == null : this.getOUR_PAY_TOTAL_GT_XA().equals(other.getOUR_PAY_TOTAL_GT_XA()))
            && (this.getOUR_RFD_TOTAL_GT_XA() == null ? other.getOUR_RFD_TOTAL_GT_XA() == null : this.getOUR_RFD_TOTAL_GT_XA().equals(other.getOUR_RFD_TOTAL_GT_XA()))
            && (this.getOUR_PAY_TOTAL_GT_TX() == null ? other.getOUR_PAY_TOTAL_GT_TX() == null : this.getOUR_PAY_TOTAL_GT_TX().equals(other.getOUR_PAY_TOTAL_GT_TX()))
            && (this.getOUR_RFD_TOTAL_GT_TX() == null ? other.getOUR_RFD_TOTAL_GT_TX() == null : this.getOUR_RFD_TOTAL_GT_TX().equals(other.getOUR_RFD_TOTAL_GT_TX()))
            && (this.getOUR_PAY_TOTAL_GT_HX() == null ? other.getOUR_PAY_TOTAL_GT_HX() == null : this.getOUR_PAY_TOTAL_GT_HX().equals(other.getOUR_PAY_TOTAL_GT_HX()))
            && (this.getOUR_RFD_TOTAL_GT_HX() == null ? other.getOUR_RFD_TOTAL_GT_HX() == null : this.getOUR_RFD_TOTAL_GT_HX().equals(other.getOUR_RFD_TOTAL_GT_HX()))
            && (this.getOUR_PAY_TOTAL_GT_RX() == null ? other.getOUR_PAY_TOTAL_GT_RX() == null : this.getOUR_PAY_TOTAL_GT_RX().equals(other.getOUR_PAY_TOTAL_GT_RX()))
            && (this.getOUR_RFD_TOTAL_GT_RX() == null ? other.getOUR_RFD_TOTAL_GT_RX() == null : this.getOUR_RFD_TOTAL_GT_RX().equals(other.getOUR_RFD_TOTAL_GT_RX()))
            && (this.getOUR_PAY_TOTAL_GT_BA() == null ? other.getOUR_PAY_TOTAL_GT_BA() == null : this.getOUR_PAY_TOTAL_GT_BA().equals(other.getOUR_PAY_TOTAL_GT_BA()))
            && (this.getOUR_RFD_TOTAL_GT_BA() == null ? other.getOUR_RFD_TOTAL_GT_BA() == null : this.getOUR_RFD_TOTAL_GT_BA().equals(other.getOUR_RFD_TOTAL_GT_BA()))
            && (this.getOUR_PAY_TOTAL_GT_GP() == null ? other.getOUR_PAY_TOTAL_GT_GP() == null : this.getOUR_PAY_TOTAL_GT_GP().equals(other.getOUR_PAY_TOTAL_GT_GP()))
            && (this.getOUR_RFD_TOTAL_GT_GP() == null ? other.getOUR_RFD_TOTAL_GT_GP() == null : this.getOUR_RFD_TOTAL_GT_GP().equals(other.getOUR_RFD_TOTAL_GT_GP()))
            && (this.getOUR_PAY_TOTAL_GT_PN() == null ? other.getOUR_PAY_TOTAL_GT_PN() == null : this.getOUR_PAY_TOTAL_GT_PN().equals(other.getOUR_PAY_TOTAL_GT_PN()))
            && (this.getOUR_RFD_TOTAL_GT_PN() == null ? other.getOUR_RFD_TOTAL_GT_PN() == null : this.getOUR_RFD_TOTAL_GT_PN().equals(other.getOUR_RFD_TOTAL_GT_PN()))
            && (this.getOUR_PAY_TOTAL_AMT() == null ? other.getOUR_PAY_TOTAL_AMT() == null : this.getOUR_PAY_TOTAL_AMT().equals(other.getOUR_PAY_TOTAL_AMT()))
            && (this.getOUR_PAY_TOTAL_COUNT() == null ? other.getOUR_PAY_TOTAL_COUNT() == null : this.getOUR_PAY_TOTAL_COUNT().equals(other.getOUR_PAY_TOTAL_COUNT()))
            && (this.getOUR_RFD_TOTAL_AMT() == null ? other.getOUR_RFD_TOTAL_AMT() == null : this.getOUR_RFD_TOTAL_AMT().equals(other.getOUR_RFD_TOTAL_AMT()))
            && (this.getOUR_RFD_TOTAL_COUNT() == null ? other.getOUR_RFD_TOTAL_COUNT() == null : this.getOUR_RFD_TOTAL_COUNT().equals(other.getOUR_RFD_TOTAL_COUNT()))
            && (this.getOUR_DOUBTS_SHORT_PAY_C_AMT() == null ? other.getOUR_DOUBTS_SHORT_PAY_C_AMT() == null : this.getOUR_DOUBTS_SHORT_PAY_C_AMT().equals(other.getOUR_DOUBTS_SHORT_PAY_C_AMT()))
            && (this.getOUR_DOUBTS_SHORT_RFD_C_AMT() == null ? other.getOUR_DOUBTS_SHORT_RFD_C_AMT() == null : this.getOUR_DOUBTS_SHORT_RFD_C_AMT().equals(other.getOUR_DOUBTS_SHORT_RFD_C_AMT()))
            && (this.getOUR_DOUBTS_SHORT_PAY_GI() == null ? other.getOUR_DOUBTS_SHORT_PAY_GI() == null : this.getOUR_DOUBTS_SHORT_PAY_GI().equals(other.getOUR_DOUBTS_SHORT_PAY_GI()))
            && (this.getOUR_DOUBTS_SHORT_RFD_GI() == null ? other.getOUR_DOUBTS_SHORT_RFD_GI() == null : this.getOUR_DOUBTS_SHORT_RFD_GI().equals(other.getOUR_DOUBTS_SHORT_RFD_GI()))
            && (this.getOUR_DOUBTS_SHORT_PAY_GU() == null ? other.getOUR_DOUBTS_SHORT_PAY_GU() == null : this.getOUR_DOUBTS_SHORT_PAY_GU().equals(other.getOUR_DOUBTS_SHORT_PAY_GU()))
            && (this.getOUR_DOUBTS_SHORT_RFD_GU() == null ? other.getOUR_DOUBTS_SHORT_RFD_GU() == null : this.getOUR_DOUBTS_SHORT_RFD_GU().equals(other.getOUR_DOUBTS_SHORT_RFD_GU()))
            && (this.getOUR_DOUBTS_SHORT_PAY_GT_XA() == null ? other.getOUR_DOUBTS_SHORT_PAY_GT_XA() == null : this.getOUR_DOUBTS_SHORT_PAY_GT_XA().equals(other.getOUR_DOUBTS_SHORT_PAY_GT_XA()))
            && (this.getOUR_DOUBTS_SHORT_RFD_GT_XA() == null ? other.getOUR_DOUBTS_SHORT_RFD_GT_XA() == null : this.getOUR_DOUBTS_SHORT_RFD_GT_XA().equals(other.getOUR_DOUBTS_SHORT_RFD_GT_XA()))
            && (this.getOUR_DOUBTS_SHORT_PAY_GT_TX() == null ? other.getOUR_DOUBTS_SHORT_PAY_GT_TX() == null : this.getOUR_DOUBTS_SHORT_PAY_GT_TX().equals(other.getOUR_DOUBTS_SHORT_PAY_GT_TX()))
            && (this.getOUR_DOUBTS_SHORT_RFD_GT_TX() == null ? other.getOUR_DOUBTS_SHORT_RFD_GT_TX() == null : this.getOUR_DOUBTS_SHORT_RFD_GT_TX().equals(other.getOUR_DOUBTS_SHORT_RFD_GT_TX()))
            && (this.getOUR_DOUBTS_SHORT_PAY_GT_HX() == null ? other.getOUR_DOUBTS_SHORT_PAY_GT_HX() == null : this.getOUR_DOUBTS_SHORT_PAY_GT_HX().equals(other.getOUR_DOUBTS_SHORT_PAY_GT_HX()))
            && (this.getOUR_DOUBTS_SHORT_RFD_GT_HX() == null ? other.getOUR_DOUBTS_SHORT_RFD_GT_HX() == null : this.getOUR_DOUBTS_SHORT_RFD_GT_HX().equals(other.getOUR_DOUBTS_SHORT_RFD_GT_HX()))
            && (this.getOUR_DOUBTS_SHORT_PAY_GT_RX() == null ? other.getOUR_DOUBTS_SHORT_PAY_GT_RX() == null : this.getOUR_DOUBTS_SHORT_PAY_GT_RX().equals(other.getOUR_DOUBTS_SHORT_PAY_GT_RX()))
            && (this.getOUR_DOUBTS_SHORT_RFD_GT_RX() == null ? other.getOUR_DOUBTS_SHORT_RFD_GT_RX() == null : this.getOUR_DOUBTS_SHORT_RFD_GT_RX().equals(other.getOUR_DOUBTS_SHORT_RFD_GT_RX()))
            && (this.getOUR_DOUBTS_SHORT_PAY_GT_BA() == null ? other.getOUR_DOUBTS_SHORT_PAY_GT_BA() == null : this.getOUR_DOUBTS_SHORT_PAY_GT_BA().equals(other.getOUR_DOUBTS_SHORT_PAY_GT_BA()))
            && (this.getOUR_DOUBTS_SHORT_RFD_GT_BA() == null ? other.getOUR_DOUBTS_SHORT_RFD_GT_BA() == null : this.getOUR_DOUBTS_SHORT_RFD_GT_BA().equals(other.getOUR_DOUBTS_SHORT_RFD_GT_BA()))
            && (this.getOUR_DOUBTS_SHORT_PAY_GT_GP() == null ? other.getOUR_DOUBTS_SHORT_PAY_GT_GP() == null : this.getOUR_DOUBTS_SHORT_PAY_GT_GP().equals(other.getOUR_DOUBTS_SHORT_PAY_GT_GP()))
            && (this.getOUR_DOUBTS_SHORT_RFD_GT_GP() == null ? other.getOUR_DOUBTS_SHORT_RFD_GT_GP() == null : this.getOUR_DOUBTS_SHORT_RFD_GT_GP().equals(other.getOUR_DOUBTS_SHORT_RFD_GT_GP()))
            && (this.getOUR_DOUBTS_SHORT_PAY_GT_PN() == null ? other.getOUR_DOUBTS_SHORT_PAY_GT_PN() == null : this.getOUR_DOUBTS_SHORT_PAY_GT_PN().equals(other.getOUR_DOUBTS_SHORT_PAY_GT_PN()))
            && (this.getOUR_DOUBTS_SHORT_RFD_GT_PN() == null ? other.getOUR_DOUBTS_SHORT_RFD_GT_PN() == null : this.getOUR_DOUBTS_SHORT_RFD_GT_PN().equals(other.getOUR_DOUBTS_SHORT_RFD_GT_PN()))
            && (this.getOUR_DOUBTS_SHORT_PAY_AMT() == null ? other.getOUR_DOUBTS_SHORT_PAY_AMT() == null : this.getOUR_DOUBTS_SHORT_PAY_AMT().equals(other.getOUR_DOUBTS_SHORT_PAY_AMT()))
            && (this.getOUR_DOUBTS_SHORT_PAY_COUNT() == null ? other.getOUR_DOUBTS_SHORT_PAY_COUNT() == null : this.getOUR_DOUBTS_SHORT_PAY_COUNT().equals(other.getOUR_DOUBTS_SHORT_PAY_COUNT()))
            && (this.getOUR_DOUBTS_SHORT_RFD_AMT() == null ? other.getOUR_DOUBTS_SHORT_RFD_AMT() == null : this.getOUR_DOUBTS_SHORT_RFD_AMT().equals(other.getOUR_DOUBTS_SHORT_RFD_AMT()))
            && (this.getOUR_DOUBTS_SHORT_RFD_COUNT() == null ? other.getOUR_DOUBTS_SHORT_RFD_COUNT() == null : this.getOUR_DOUBTS_SHORT_RFD_COUNT().equals(other.getOUR_DOUBTS_SHORT_RFD_COUNT()))
            && (this.getOUR_FLAT_PAY_C_AMT() == null ? other.getOUR_FLAT_PAY_C_AMT() == null : this.getOUR_FLAT_PAY_C_AMT().equals(other.getOUR_FLAT_PAY_C_AMT()))
            && (this.getOUR_FLAT_RFD_C_AMT() == null ? other.getOUR_FLAT_RFD_C_AMT() == null : this.getOUR_FLAT_RFD_C_AMT().equals(other.getOUR_FLAT_RFD_C_AMT()))
            && (this.getOUR_FLAT_PAY_GI() == null ? other.getOUR_FLAT_PAY_GI() == null : this.getOUR_FLAT_PAY_GI().equals(other.getOUR_FLAT_PAY_GI()))
            && (this.getOUR_FLAT_RFD_GI() == null ? other.getOUR_FLAT_RFD_GI() == null : this.getOUR_FLAT_RFD_GI().equals(other.getOUR_FLAT_RFD_GI()))
            && (this.getOUR_FLAT_PAY_GU() == null ? other.getOUR_FLAT_PAY_GU() == null : this.getOUR_FLAT_PAY_GU().equals(other.getOUR_FLAT_PAY_GU()))
            && (this.getOUR_FLAT_RFD_GU() == null ? other.getOUR_FLAT_RFD_GU() == null : this.getOUR_FLAT_RFD_GU().equals(other.getOUR_FLAT_RFD_GU()))
            && (this.getOUR_FLAT_PAY_GT_XA() == null ? other.getOUR_FLAT_PAY_GT_XA() == null : this.getOUR_FLAT_PAY_GT_XA().equals(other.getOUR_FLAT_PAY_GT_XA()))
            && (this.getOUR_FLAT_RFD_GT_XA() == null ? other.getOUR_FLAT_RFD_GT_XA() == null : this.getOUR_FLAT_RFD_GT_XA().equals(other.getOUR_FLAT_RFD_GT_XA()))
            && (this.getOUR_FLAT_PAY_GT_TX() == null ? other.getOUR_FLAT_PAY_GT_TX() == null : this.getOUR_FLAT_PAY_GT_TX().equals(other.getOUR_FLAT_PAY_GT_TX()))
            && (this.getOUR_FLAT_RFD_GT_TX() == null ? other.getOUR_FLAT_RFD_GT_TX() == null : this.getOUR_FLAT_RFD_GT_TX().equals(other.getOUR_FLAT_RFD_GT_TX()))
            && (this.getOUR_FLAT_PAY_GT_HX() == null ? other.getOUR_FLAT_PAY_GT_HX() == null : this.getOUR_FLAT_PAY_GT_HX().equals(other.getOUR_FLAT_PAY_GT_HX()))
            && (this.getOUR_FLAT_RFD_GT_HX() == null ? other.getOUR_FLAT_RFD_GT_HX() == null : this.getOUR_FLAT_RFD_GT_HX().equals(other.getOUR_FLAT_RFD_GT_HX()))
            && (this.getOUR_FLAT_PAY_GT_RX() == null ? other.getOUR_FLAT_PAY_GT_RX() == null : this.getOUR_FLAT_PAY_GT_RX().equals(other.getOUR_FLAT_PAY_GT_RX()))
            && (this.getOUR_FLAT_RFD_GT_RX() == null ? other.getOUR_FLAT_RFD_GT_RX() == null : this.getOUR_FLAT_RFD_GT_RX().equals(other.getOUR_FLAT_RFD_GT_RX()))
            && (this.getOUR_FLAT_PAY_GT_BA() == null ? other.getOUR_FLAT_PAY_GT_BA() == null : this.getOUR_FLAT_PAY_GT_BA().equals(other.getOUR_FLAT_PAY_GT_BA()))
            && (this.getOUR_FLAT_RFD_GT_BA() == null ? other.getOUR_FLAT_RFD_GT_BA() == null : this.getOUR_FLAT_RFD_GT_BA().equals(other.getOUR_FLAT_RFD_GT_BA()))
            && (this.getOUR_FLAT_PAY_GT_GP() == null ? other.getOUR_FLAT_PAY_GT_GP() == null : this.getOUR_FLAT_PAY_GT_GP().equals(other.getOUR_FLAT_PAY_GT_GP()))
            && (this.getOUR_FLAT_RFD_GT_GP() == null ? other.getOUR_FLAT_RFD_GT_GP() == null : this.getOUR_FLAT_RFD_GT_GP().equals(other.getOUR_FLAT_RFD_GT_GP()))
            && (this.getOUR_FLAT_PAY_GT_PN() == null ? other.getOUR_FLAT_PAY_GT_PN() == null : this.getOUR_FLAT_PAY_GT_PN().equals(other.getOUR_FLAT_PAY_GT_PN()))
            && (this.getOUR_FLAT_RFD_GT_PN() == null ? other.getOUR_FLAT_RFD_GT_PN() == null : this.getOUR_FLAT_RFD_GT_PN().equals(other.getOUR_FLAT_RFD_GT_PN()))
            && (this.getOUR_FLAT_PAY_AMT() == null ? other.getOUR_FLAT_PAY_AMT() == null : this.getOUR_FLAT_PAY_AMT().equals(other.getOUR_FLAT_PAY_AMT()))
            && (this.getOUR_FLAT_PAY_COUNT() == null ? other.getOUR_FLAT_PAY_COUNT() == null : this.getOUR_FLAT_PAY_COUNT().equals(other.getOUR_FLAT_PAY_COUNT()))
            && (this.getOUR_FLAT_RFD_AMT() == null ? other.getOUR_FLAT_RFD_AMT() == null : this.getOUR_FLAT_RFD_AMT().equals(other.getOUR_FLAT_RFD_AMT()))
            && (this.getOUR_FLAT_RFD_COUNT() == null ? other.getOUR_FLAT_RFD_COUNT() == null : this.getOUR_FLAT_RFD_COUNT().equals(other.getOUR_FLAT_RFD_COUNT()))
            && (this.getOUR_NO_FLAT_PAY_C_AMT() == null ? other.getOUR_NO_FLAT_PAY_C_AMT() == null : this.getOUR_NO_FLAT_PAY_C_AMT().equals(other.getOUR_NO_FLAT_PAY_C_AMT()))
            && (this.getOUR_NO_FLAT_RFD_C_AMT() == null ? other.getOUR_NO_FLAT_RFD_C_AMT() == null : this.getOUR_NO_FLAT_RFD_C_AMT().equals(other.getOUR_NO_FLAT_RFD_C_AMT()))
            && (this.getOUR_NO_FLAT_PAY_GI() == null ? other.getOUR_NO_FLAT_PAY_GI() == null : this.getOUR_NO_FLAT_PAY_GI().equals(other.getOUR_NO_FLAT_PAY_GI()))
            && (this.getOUR_NO_FLAT_RFD_GI() == null ? other.getOUR_NO_FLAT_RFD_GI() == null : this.getOUR_NO_FLAT_RFD_GI().equals(other.getOUR_NO_FLAT_RFD_GI()))
            && (this.getOUR_NO_FLAT_PAY_GU() == null ? other.getOUR_NO_FLAT_PAY_GU() == null : this.getOUR_NO_FLAT_PAY_GU().equals(other.getOUR_NO_FLAT_PAY_GU()))
            && (this.getOUR_NO_FLAT_RFD_GU() == null ? other.getOUR_NO_FLAT_RFD_GU() == null : this.getOUR_NO_FLAT_RFD_GU().equals(other.getOUR_NO_FLAT_RFD_GU()))
            && (this.getOUR_NO_FLAT_PAY_GT_XA() == null ? other.getOUR_NO_FLAT_PAY_GT_XA() == null : this.getOUR_NO_FLAT_PAY_GT_XA().equals(other.getOUR_NO_FLAT_PAY_GT_XA()))
            && (this.getOUR_NO_FLAT_RFD_GT_XA() == null ? other.getOUR_NO_FLAT_RFD_GT_XA() == null : this.getOUR_NO_FLAT_RFD_GT_XA().equals(other.getOUR_NO_FLAT_RFD_GT_XA()))
            && (this.getOUR_NO_FLAT_PAY_GT_TX() == null ? other.getOUR_NO_FLAT_PAY_GT_TX() == null : this.getOUR_NO_FLAT_PAY_GT_TX().equals(other.getOUR_NO_FLAT_PAY_GT_TX()))
            && (this.getOUR_NO_FLAT_RFD_GT_TX() == null ? other.getOUR_NO_FLAT_RFD_GT_TX() == null : this.getOUR_NO_FLAT_RFD_GT_TX().equals(other.getOUR_NO_FLAT_RFD_GT_TX()))
            && (this.getOUR_NO_FLAT_PAY_GT_HX() == null ? other.getOUR_NO_FLAT_PAY_GT_HX() == null : this.getOUR_NO_FLAT_PAY_GT_HX().equals(other.getOUR_NO_FLAT_PAY_GT_HX()))
            && (this.getOUR_NO_FLAT_RFD_GT_HX() == null ? other.getOUR_NO_FLAT_RFD_GT_HX() == null : this.getOUR_NO_FLAT_RFD_GT_HX().equals(other.getOUR_NO_FLAT_RFD_GT_HX()))
            && (this.getOUR_NO_FLAT_PAY_GT_RX() == null ? other.getOUR_NO_FLAT_PAY_GT_RX() == null : this.getOUR_NO_FLAT_PAY_GT_RX().equals(other.getOUR_NO_FLAT_PAY_GT_RX()))
            && (this.getOUR_NO_FLAT_RFD_GT_RX() == null ? other.getOUR_NO_FLAT_RFD_GT_RX() == null : this.getOUR_NO_FLAT_RFD_GT_RX().equals(other.getOUR_NO_FLAT_RFD_GT_RX()))
            && (this.getOUR_NO_FLAT_PAY_GT_BA() == null ? other.getOUR_NO_FLAT_PAY_GT_BA() == null : this.getOUR_NO_FLAT_PAY_GT_BA().equals(other.getOUR_NO_FLAT_PAY_GT_BA()))
            && (this.getOUR_NO_FLAT_RFD_GT_BA() == null ? other.getOUR_NO_FLAT_RFD_GT_BA() == null : this.getOUR_NO_FLAT_RFD_GT_BA().equals(other.getOUR_NO_FLAT_RFD_GT_BA()))
            && (this.getOUR_NO_FLAT_PAY_GT_GP() == null ? other.getOUR_NO_FLAT_PAY_GT_GP() == null : this.getOUR_NO_FLAT_PAY_GT_GP().equals(other.getOUR_NO_FLAT_PAY_GT_GP()))
            && (this.getOUR_NO_FLAT_RFD_GT_GP() == null ? other.getOUR_NO_FLAT_RFD_GT_GP() == null : this.getOUR_NO_FLAT_RFD_GT_GP().equals(other.getOUR_NO_FLAT_RFD_GT_GP()))
            && (this.getOUR_NO_FLAT_PAY_GT_PN() == null ? other.getOUR_NO_FLAT_PAY_GT_PN() == null : this.getOUR_NO_FLAT_PAY_GT_PN().equals(other.getOUR_NO_FLAT_PAY_GT_PN()))
            && (this.getOUR_NO_FLAT_RFD_GT_PN() == null ? other.getOUR_NO_FLAT_RFD_GT_PN() == null : this.getOUR_NO_FLAT_RFD_GT_PN().equals(other.getOUR_NO_FLAT_RFD_GT_PN()))
            && (this.getOUR_NO_FLAT_PAY_AMT() == null ? other.getOUR_NO_FLAT_PAY_AMT() == null : this.getOUR_NO_FLAT_PAY_AMT().equals(other.getOUR_NO_FLAT_PAY_AMT()))
            && (this.getOUR_NO_FLAT_PAY_COUNT() == null ? other.getOUR_NO_FLAT_PAY_COUNT() == null : this.getOUR_NO_FLAT_PAY_COUNT().equals(other.getOUR_NO_FLAT_PAY_COUNT()))
            && (this.getOUR_NO_FLAT_RFD_AMT() == null ? other.getOUR_NO_FLAT_RFD_AMT() == null : this.getOUR_NO_FLAT_RFD_AMT().equals(other.getOUR_NO_FLAT_RFD_AMT()))
            && (this.getOUR_NO_FLAT_RFD_COUNT() == null ? other.getOUR_NO_FLAT_RFD_COUNT() == null : this.getOUR_NO_FLAT_RFD_COUNT().equals(other.getOUR_NO_FLAT_RFD_COUNT()))
            && (this.getDOUBTS_SHORT_FLAT_PAY_C_AMT() == null ? other.getDOUBTS_SHORT_FLAT_PAY_C_AMT() == null : this.getDOUBTS_SHORT_FLAT_PAY_C_AMT().equals(other.getDOUBTS_SHORT_FLAT_PAY_C_AMT()))
            && (this.getDOUBTS_SHORT_FLAT_RFD_C_AMT() == null ? other.getDOUBTS_SHORT_FLAT_RFD_C_AMT() == null : this.getDOUBTS_SHORT_FLAT_RFD_C_AMT().equals(other.getDOUBTS_SHORT_FLAT_RFD_C_AMT()))
            && (this.getDOUBTS_SHORT_FLAT_PAY_GI() == null ? other.getDOUBTS_SHORT_FLAT_PAY_GI() == null : this.getDOUBTS_SHORT_FLAT_PAY_GI().equals(other.getDOUBTS_SHORT_FLAT_PAY_GI()))
            && (this.getDOUBTS_SHORT_FLAT_RFD_GI() == null ? other.getDOUBTS_SHORT_FLAT_RFD_GI() == null : this.getDOUBTS_SHORT_FLAT_RFD_GI().equals(other.getDOUBTS_SHORT_FLAT_RFD_GI()))
            && (this.getDOUBTS_SHORT_FLAT_PAY_GU() == null ? other.getDOUBTS_SHORT_FLAT_PAY_GU() == null : this.getDOUBTS_SHORT_FLAT_PAY_GU().equals(other.getDOUBTS_SHORT_FLAT_PAY_GU()))
            && (this.getDOUBTS_SHORT_FLAT_RFD_GU() == null ? other.getDOUBTS_SHORT_FLAT_RFD_GU() == null : this.getDOUBTS_SHORT_FLAT_RFD_GU().equals(other.getDOUBTS_SHORT_FLAT_RFD_GU()))
            && (this.getDOUBTS_SHORT_FLAT_PAY_GT_XA() == null ? other.getDOUBTS_SHORT_FLAT_PAY_GT_XA() == null : this.getDOUBTS_SHORT_FLAT_PAY_GT_XA().equals(other.getDOUBTS_SHORT_FLAT_PAY_GT_XA()))
            && (this.getDOUBTS_SHORT_FLAT_RFD_GT_XA() == null ? other.getDOUBTS_SHORT_FLAT_RFD_GT_XA() == null : this.getDOUBTS_SHORT_FLAT_RFD_GT_XA().equals(other.getDOUBTS_SHORT_FLAT_RFD_GT_XA()))
            && (this.getDOUBTS_SHORT_FLAT_PAY_GT_TX() == null ? other.getDOUBTS_SHORT_FLAT_PAY_GT_TX() == null : this.getDOUBTS_SHORT_FLAT_PAY_GT_TX().equals(other.getDOUBTS_SHORT_FLAT_PAY_GT_TX()))
            && (this.getDOUBTS_SHORT_FLAT_RFD_GT_TX() == null ? other.getDOUBTS_SHORT_FLAT_RFD_GT_TX() == null : this.getDOUBTS_SHORT_FLAT_RFD_GT_TX().equals(other.getDOUBTS_SHORT_FLAT_RFD_GT_TX()))
            && (this.getDOUBTS_SHORT_FLAT_PAY_GT_HX() == null ? other.getDOUBTS_SHORT_FLAT_PAY_GT_HX() == null : this.getDOUBTS_SHORT_FLAT_PAY_GT_HX().equals(other.getDOUBTS_SHORT_FLAT_PAY_GT_HX()))
            && (this.getDOUBTS_SHORT_FLAT_RFD_GT_HX() == null ? other.getDOUBTS_SHORT_FLAT_RFD_GT_HX() == null : this.getDOUBTS_SHORT_FLAT_RFD_GT_HX().equals(other.getDOUBTS_SHORT_FLAT_RFD_GT_HX()))
            && (this.getDOUBTS_SHORT_FLAT_PAY_GT_RX() == null ? other.getDOUBTS_SHORT_FLAT_PAY_GT_RX() == null : this.getDOUBTS_SHORT_FLAT_PAY_GT_RX().equals(other.getDOUBTS_SHORT_FLAT_PAY_GT_RX()))
            && (this.getDOUBTS_SHORT_FLAT_RFD_GT_RX() == null ? other.getDOUBTS_SHORT_FLAT_RFD_GT_RX() == null : this.getDOUBTS_SHORT_FLAT_RFD_GT_RX().equals(other.getDOUBTS_SHORT_FLAT_RFD_GT_RX()))
            && (this.getDOUBTS_SHORT_FLAT_PAY_GT_BA() == null ? other.getDOUBTS_SHORT_FLAT_PAY_GT_BA() == null : this.getDOUBTS_SHORT_FLAT_PAY_GT_BA().equals(other.getDOUBTS_SHORT_FLAT_PAY_GT_BA()))
            && (this.getDOUBTS_SHORT_FLAT_RFD_GT_BA() == null ? other.getDOUBTS_SHORT_FLAT_RFD_GT_BA() == null : this.getDOUBTS_SHORT_FLAT_RFD_GT_BA().equals(other.getDOUBTS_SHORT_FLAT_RFD_GT_BA()))
            && (this.getDOUBTS_SHORT_FLAT_PAY_GT_GP() == null ? other.getDOUBTS_SHORT_FLAT_PAY_GT_GP() == null : this.getDOUBTS_SHORT_FLAT_PAY_GT_GP().equals(other.getDOUBTS_SHORT_FLAT_PAY_GT_GP()))
            && (this.getDOUBTS_SHORT_FLAT_RFD_GT_GP() == null ? other.getDOUBTS_SHORT_FLAT_RFD_GT_GP() == null : this.getDOUBTS_SHORT_FLAT_RFD_GT_GP().equals(other.getDOUBTS_SHORT_FLAT_RFD_GT_GP()))
            && (this.getDOUBTS_SHORT_FLAT_PAY_GT_PN() == null ? other.getDOUBTS_SHORT_FLAT_PAY_GT_PN() == null : this.getDOUBTS_SHORT_FLAT_PAY_GT_PN().equals(other.getDOUBTS_SHORT_FLAT_PAY_GT_PN()))
            && (this.getDOUBTS_SHORT_FLAT_RFD_GT_PN() == null ? other.getDOUBTS_SHORT_FLAT_RFD_GT_PN() == null : this.getDOUBTS_SHORT_FLAT_RFD_GT_PN().equals(other.getDOUBTS_SHORT_FLAT_RFD_GT_PN()))
            && (this.getDOUBTS_SHORT_FLAT_PAY_AMT() == null ? other.getDOUBTS_SHORT_FLAT_PAY_AMT() == null : this.getDOUBTS_SHORT_FLAT_PAY_AMT().equals(other.getDOUBTS_SHORT_FLAT_PAY_AMT()))
            && (this.getDOUBTS_SHORT_FLAT_PAY_COUNT() == null ? other.getDOUBTS_SHORT_FLAT_PAY_COUNT() == null : this.getDOUBTS_SHORT_FLAT_PAY_COUNT().equals(other.getDOUBTS_SHORT_FLAT_PAY_COUNT()))
            && (this.getDOUBTS_SHORT_FLAT_RFD_AMT() == null ? other.getDOUBTS_SHORT_FLAT_RFD_AMT() == null : this.getDOUBTS_SHORT_FLAT_RFD_AMT().equals(other.getDOUBTS_SHORT_FLAT_RFD_AMT()))
            && (this.getDOUBTS_SHORT_FLAT_RFD_COUNT() == null ? other.getDOUBTS_SHORT_FLAT_RFD_COUNT() == null : this.getDOUBTS_SHORT_FLAT_RFD_COUNT().equals(other.getDOUBTS_SHORT_FLAT_RFD_COUNT()))
            && (this.getDOUBTS_SHORT_NO_FLAT_PAY_C_AMT() == null ? other.getDOUBTS_SHORT_NO_FLAT_PAY_C_AMT() == null : this.getDOUBTS_SHORT_NO_FLAT_PAY_C_AMT().equals(other.getDOUBTS_SHORT_NO_FLAT_PAY_C_AMT()))
            && (this.getDOUBTS_SHORT_NO_FLAT_RFD_C_AMT() == null ? other.getDOUBTS_SHORT_NO_FLAT_RFD_C_AMT() == null : this.getDOUBTS_SHORT_NO_FLAT_RFD_C_AMT().equals(other.getDOUBTS_SHORT_NO_FLAT_RFD_C_AMT()))
            && (this.getDOUBTS_SHORT_NO_FLAT_PAY_GI() == null ? other.getDOUBTS_SHORT_NO_FLAT_PAY_GI() == null : this.getDOUBTS_SHORT_NO_FLAT_PAY_GI().equals(other.getDOUBTS_SHORT_NO_FLAT_PAY_GI()))
            && (this.getDOUBTS_SHORT_NO_FLAT_RFD_GI() == null ? other.getDOUBTS_SHORT_NO_FLAT_RFD_GI() == null : this.getDOUBTS_SHORT_NO_FLAT_RFD_GI().equals(other.getDOUBTS_SHORT_NO_FLAT_RFD_GI()))
            && (this.getDOUBTS_SHORT_NO_FLAT_PAY_GU() == null ? other.getDOUBTS_SHORT_NO_FLAT_PAY_GU() == null : this.getDOUBTS_SHORT_NO_FLAT_PAY_GU().equals(other.getDOUBTS_SHORT_NO_FLAT_PAY_GU()))
            && (this.getDOUBTS_SHORT_NO_FLAT_RFD_GU() == null ? other.getDOUBTS_SHORT_NO_FLAT_RFD_GU() == null : this.getDOUBTS_SHORT_NO_FLAT_RFD_GU().equals(other.getDOUBTS_SHORT_NO_FLAT_RFD_GU()))
            && (this.getDOUBTS_SHORT_NO_FLAT_PAY_GT_XA() == null ? other.getDOUBTS_SHORT_NO_FLAT_PAY_GT_XA() == null : this.getDOUBTS_SHORT_NO_FLAT_PAY_GT_XA().equals(other.getDOUBTS_SHORT_NO_FLAT_PAY_GT_XA()))
            && (this.getDOUBTS_SHORT_NO_FLAT_RFD_GT_XA() == null ? other.getDOUBTS_SHORT_NO_FLAT_RFD_GT_XA() == null : this.getDOUBTS_SHORT_NO_FLAT_RFD_GT_XA().equals(other.getDOUBTS_SHORT_NO_FLAT_RFD_GT_XA()))
            && (this.getDOUBTS_SHORT_NO_FLAT_PAY_GT_TX() == null ? other.getDOUBTS_SHORT_NO_FLAT_PAY_GT_TX() == null : this.getDOUBTS_SHORT_NO_FLAT_PAY_GT_TX().equals(other.getDOUBTS_SHORT_NO_FLAT_PAY_GT_TX()))
            && (this.getDOUBTS_SHORT_NO_FLAT_RFD_GT_TX() == null ? other.getDOUBTS_SHORT_NO_FLAT_RFD_GT_TX() == null : this.getDOUBTS_SHORT_NO_FLAT_RFD_GT_TX().equals(other.getDOUBTS_SHORT_NO_FLAT_RFD_GT_TX()))
            && (this.getDOUBTS_SHORT_NO_FLAT_PAY_GT_HX() == null ? other.getDOUBTS_SHORT_NO_FLAT_PAY_GT_HX() == null : this.getDOUBTS_SHORT_NO_FLAT_PAY_GT_HX().equals(other.getDOUBTS_SHORT_NO_FLAT_PAY_GT_HX()))
            && (this.getDOUBTS_SHORT_NO_FLAT_RFD_GT_HX() == null ? other.getDOUBTS_SHORT_NO_FLAT_RFD_GT_HX() == null : this.getDOUBTS_SHORT_NO_FLAT_RFD_GT_HX().equals(other.getDOUBTS_SHORT_NO_FLAT_RFD_GT_HX()))
            && (this.getDOUBTS_SHORT_NO_FLAT_PAY_GT_RX() == null ? other.getDOUBTS_SHORT_NO_FLAT_PAY_GT_RX() == null : this.getDOUBTS_SHORT_NO_FLAT_PAY_GT_RX().equals(other.getDOUBTS_SHORT_NO_FLAT_PAY_GT_RX()))
            && (this.getDOUBTS_SHORT_NO_FLAT_RFD_GT_RX() == null ? other.getDOUBTS_SHORT_NO_FLAT_RFD_GT_RX() == null : this.getDOUBTS_SHORT_NO_FLAT_RFD_GT_RX().equals(other.getDOUBTS_SHORT_NO_FLAT_RFD_GT_RX()))
            && (this.getDOUBTS_SHORT_NO_FLAT_PAY_GT_BA() == null ? other.getDOUBTS_SHORT_NO_FLAT_PAY_GT_BA() == null : this.getDOUBTS_SHORT_NO_FLAT_PAY_GT_BA().equals(other.getDOUBTS_SHORT_NO_FLAT_PAY_GT_BA()))
            && (this.getDOUBTS_SHORT_NO_FLAT_RFD_GT_BA() == null ? other.getDOUBTS_SHORT_NO_FLAT_RFD_GT_BA() == null : this.getDOUBTS_SHORT_NO_FLAT_RFD_GT_BA().equals(other.getDOUBTS_SHORT_NO_FLAT_RFD_GT_BA()))
            && (this.getDOUBTS_SHORT_NO_FLAT_PAY_GT_GP() == null ? other.getDOUBTS_SHORT_NO_FLAT_PAY_GT_GP() == null : this.getDOUBTS_SHORT_NO_FLAT_PAY_GT_GP().equals(other.getDOUBTS_SHORT_NO_FLAT_PAY_GT_GP()))
            && (this.getDOUBTS_SHORT_NO_FLAT_RFD_GT_GP() == null ? other.getDOUBTS_SHORT_NO_FLAT_RFD_GT_GP() == null : this.getDOUBTS_SHORT_NO_FLAT_RFD_GT_GP().equals(other.getDOUBTS_SHORT_NO_FLAT_RFD_GT_GP()))
            && (this.getDOUBTS_SHORT_NO_FLAT_PAY_GT_PN() == null ? other.getDOUBTS_SHORT_NO_FLAT_PAY_GT_PN() == null : this.getDOUBTS_SHORT_NO_FLAT_PAY_GT_PN().equals(other.getDOUBTS_SHORT_NO_FLAT_PAY_GT_PN()))
            && (this.getDOUBTS_SHORT_NO_FLAT_RFD_GT_PN() == null ? other.getDOUBTS_SHORT_NO_FLAT_RFD_GT_PN() == null : this.getDOUBTS_SHORT_NO_FLAT_RFD_GT_PN().equals(other.getDOUBTS_SHORT_NO_FLAT_RFD_GT_PN()))
            && (this.getDOUBTS_SHORT_NO_FLAT_PAY_AMT() == null ? other.getDOUBTS_SHORT_NO_FLAT_PAY_AMT() == null : this.getDOUBTS_SHORT_NO_FLAT_PAY_AMT().equals(other.getDOUBTS_SHORT_NO_FLAT_PAY_AMT()))
            && (this.getDOUBTS_SHORT_NO_FLAT_PAY_COUNT() == null ? other.getDOUBTS_SHORT_NO_FLAT_PAY_COUNT() == null : this.getDOUBTS_SHORT_NO_FLAT_PAY_COUNT().equals(other.getDOUBTS_SHORT_NO_FLAT_PAY_COUNT()))
            && (this.getDOUBTS_SHORT_NO_FLAT_RFD_AMT() == null ? other.getDOUBTS_SHORT_NO_FLAT_RFD_AMT() == null : this.getDOUBTS_SHORT_NO_FLAT_RFD_AMT().equals(other.getDOUBTS_SHORT_NO_FLAT_RFD_AMT()))
            && (this.getDOUBTS_SHORT_NO_FLAT_RFD_COUNT() == null ? other.getDOUBTS_SHORT_NO_FLAT_RFD_COUNT() == null : this.getDOUBTS_SHORT_NO_FLAT_RFD_COUNT().equals(other.getDOUBTS_SHORT_NO_FLAT_RFD_COUNT()))
            && (this.getOUR_DIFFE_SHORT_PAY_C_AMT() == null ? other.getOUR_DIFFE_SHORT_PAY_C_AMT() == null : this.getOUR_DIFFE_SHORT_PAY_C_AMT().equals(other.getOUR_DIFFE_SHORT_PAY_C_AMT()))
            && (this.getOUR_DIFFE_SHORT_RFD_C_AMT() == null ? other.getOUR_DIFFE_SHORT_RFD_C_AMT() == null : this.getOUR_DIFFE_SHORT_RFD_C_AMT().equals(other.getOUR_DIFFE_SHORT_RFD_C_AMT()))
            && (this.getOUR_DIFFE_SHORT_PAY_GI() == null ? other.getOUR_DIFFE_SHORT_PAY_GI() == null : this.getOUR_DIFFE_SHORT_PAY_GI().equals(other.getOUR_DIFFE_SHORT_PAY_GI()))
            && (this.getOUR_DIFFE_SHORT_RFD_GI() == null ? other.getOUR_DIFFE_SHORT_RFD_GI() == null : this.getOUR_DIFFE_SHORT_RFD_GI().equals(other.getOUR_DIFFE_SHORT_RFD_GI()))
            && (this.getOUR_DIFFE_SHORT_PAY_GU() == null ? other.getOUR_DIFFE_SHORT_PAY_GU() == null : this.getOUR_DIFFE_SHORT_PAY_GU().equals(other.getOUR_DIFFE_SHORT_PAY_GU()))
            && (this.getOUR_DIFFE_SHORT_RFD_GU() == null ? other.getOUR_DIFFE_SHORT_RFD_GU() == null : this.getOUR_DIFFE_SHORT_RFD_GU().equals(other.getOUR_DIFFE_SHORT_RFD_GU()))
            && (this.getOUR_DIFFE_SHORT_PAY_GT_XA() == null ? other.getOUR_DIFFE_SHORT_PAY_GT_XA() == null : this.getOUR_DIFFE_SHORT_PAY_GT_XA().equals(other.getOUR_DIFFE_SHORT_PAY_GT_XA()))
            && (this.getOUR_DIFFE_SHORT_RFD_GT_XA() == null ? other.getOUR_DIFFE_SHORT_RFD_GT_XA() == null : this.getOUR_DIFFE_SHORT_RFD_GT_XA().equals(other.getOUR_DIFFE_SHORT_RFD_GT_XA()))
            && (this.getOUR_DIFFE_SHORT_PAY_GT_TX() == null ? other.getOUR_DIFFE_SHORT_PAY_GT_TX() == null : this.getOUR_DIFFE_SHORT_PAY_GT_TX().equals(other.getOUR_DIFFE_SHORT_PAY_GT_TX()))
            && (this.getOUR_DIFFE_SHORT_RFD_GT_TX() == null ? other.getOUR_DIFFE_SHORT_RFD_GT_TX() == null : this.getOUR_DIFFE_SHORT_RFD_GT_TX().equals(other.getOUR_DIFFE_SHORT_RFD_GT_TX()))
            && (this.getOUR_DIFFE_SHORT_PAY_GT_HX() == null ? other.getOUR_DIFFE_SHORT_PAY_GT_HX() == null : this.getOUR_DIFFE_SHORT_PAY_GT_HX().equals(other.getOUR_DIFFE_SHORT_PAY_GT_HX()))
            && (this.getOUR_DIFFE_SHORT_RFD_GT_HX() == null ? other.getOUR_DIFFE_SHORT_RFD_GT_HX() == null : this.getOUR_DIFFE_SHORT_RFD_GT_HX().equals(other.getOUR_DIFFE_SHORT_RFD_GT_HX()))
            && (this.getOUR_DIFFE_SHORT_PAY_GT_RX() == null ? other.getOUR_DIFFE_SHORT_PAY_GT_RX() == null : this.getOUR_DIFFE_SHORT_PAY_GT_RX().equals(other.getOUR_DIFFE_SHORT_PAY_GT_RX()))
            && (this.getOUR_DIFFE_SHORT_RFD_GT_RX() == null ? other.getOUR_DIFFE_SHORT_RFD_GT_RX() == null : this.getOUR_DIFFE_SHORT_RFD_GT_RX().equals(other.getOUR_DIFFE_SHORT_RFD_GT_RX()))
            && (this.getOUR_DIFFE_SHORT_PAY_GT_BA() == null ? other.getOUR_DIFFE_SHORT_PAY_GT_BA() == null : this.getOUR_DIFFE_SHORT_PAY_GT_BA().equals(other.getOUR_DIFFE_SHORT_PAY_GT_BA()))
            && (this.getOUR_DIFFE_SHORT_RFD_GT_BA() == null ? other.getOUR_DIFFE_SHORT_RFD_GT_BA() == null : this.getOUR_DIFFE_SHORT_RFD_GT_BA().equals(other.getOUR_DIFFE_SHORT_RFD_GT_BA()))
            && (this.getOUR_DIFFE_SHORT_PAY_GT_GP() == null ? other.getOUR_DIFFE_SHORT_PAY_GT_GP() == null : this.getOUR_DIFFE_SHORT_PAY_GT_GP().equals(other.getOUR_DIFFE_SHORT_PAY_GT_GP()))
            && (this.getOUR_DIFFE_SHORT_RFD_GT_GP() == null ? other.getOUR_DIFFE_SHORT_RFD_GT_GP() == null : this.getOUR_DIFFE_SHORT_RFD_GT_GP().equals(other.getOUR_DIFFE_SHORT_RFD_GT_GP()))
            && (this.getOUR_DIFFE_SHORT_PAY_GT_PN() == null ? other.getOUR_DIFFE_SHORT_PAY_GT_PN() == null : this.getOUR_DIFFE_SHORT_PAY_GT_PN().equals(other.getOUR_DIFFE_SHORT_PAY_GT_PN()))
            && (this.getOUR_DIFFE_SHORT_RFD_GT_PN() == null ? other.getOUR_DIFFE_SHORT_RFD_GT_PN() == null : this.getOUR_DIFFE_SHORT_RFD_GT_PN().equals(other.getOUR_DIFFE_SHORT_RFD_GT_PN()))
            && (this.getOUR_DIFFE_SHORT_PAY_AMT() == null ? other.getOUR_DIFFE_SHORT_PAY_AMT() == null : this.getOUR_DIFFE_SHORT_PAY_AMT().equals(other.getOUR_DIFFE_SHORT_PAY_AMT()))
            && (this.getOUR_DIFFE_SHORT_PAY_COUNT() == null ? other.getOUR_DIFFE_SHORT_PAY_COUNT() == null : this.getOUR_DIFFE_SHORT_PAY_COUNT().equals(other.getOUR_DIFFE_SHORT_PAY_COUNT()))
            && (this.getOUR_DIFFE_SHORT_RFD_AMT() == null ? other.getOUR_DIFFE_SHORT_RFD_AMT() == null : this.getOUR_DIFFE_SHORT_RFD_AMT().equals(other.getOUR_DIFFE_SHORT_RFD_AMT()))
            && (this.getOUR_DIFFE_SHORT_RFD_COUNT() == null ? other.getOUR_DIFFE_SHORT_RFD_COUNT() == null : this.getOUR_DIFFE_SHORT_RFD_COUNT().equals(other.getOUR_DIFFE_SHORT_RFD_COUNT()))
            && (this.getCHAN_PAY_TOTAL_C_AMT() == null ? other.getCHAN_PAY_TOTAL_C_AMT() == null : this.getCHAN_PAY_TOTAL_C_AMT().equals(other.getCHAN_PAY_TOTAL_C_AMT()))
            && (this.getCHAN_RFD_TOTAL_C_AMT() == null ? other.getCHAN_RFD_TOTAL_C_AMT() == null : this.getCHAN_RFD_TOTAL_C_AMT().equals(other.getCHAN_RFD_TOTAL_C_AMT()))
            && (this.getCHAN_PAY_TOTAL_GI() == null ? other.getCHAN_PAY_TOTAL_GI() == null : this.getCHAN_PAY_TOTAL_GI().equals(other.getCHAN_PAY_TOTAL_GI()))
            && (this.getCHAN_RFD_TOTAL_GI() == null ? other.getCHAN_RFD_TOTAL_GI() == null : this.getCHAN_RFD_TOTAL_GI().equals(other.getCHAN_RFD_TOTAL_GI()))
            && (this.getCHAN_PAY_TOTAL_GU() == null ? other.getCHAN_PAY_TOTAL_GU() == null : this.getCHAN_PAY_TOTAL_GU().equals(other.getCHAN_PAY_TOTAL_GU()))
            && (this.getCHAN_RFD_TOTAL_GU() == null ? other.getCHAN_RFD_TOTAL_GU() == null : this.getCHAN_RFD_TOTAL_GU().equals(other.getCHAN_RFD_TOTAL_GU()))
            && (this.getCHAN_PAY_TOTAL_GT_XA() == null ? other.getCHAN_PAY_TOTAL_GT_XA() == null : this.getCHAN_PAY_TOTAL_GT_XA().equals(other.getCHAN_PAY_TOTAL_GT_XA()))
            && (this.getCHAN_RFD_TOTAL_GT_XA() == null ? other.getCHAN_RFD_TOTAL_GT_XA() == null : this.getCHAN_RFD_TOTAL_GT_XA().equals(other.getCHAN_RFD_TOTAL_GT_XA()))
            && (this.getCHAN_PAY_TOTAL_GT_TX() == null ? other.getCHAN_PAY_TOTAL_GT_TX() == null : this.getCHAN_PAY_TOTAL_GT_TX().equals(other.getCHAN_PAY_TOTAL_GT_TX()))
            && (this.getCHAN_RFD_TOTAL_GT_TX() == null ? other.getCHAN_RFD_TOTAL_GT_TX() == null : this.getCHAN_RFD_TOTAL_GT_TX().equals(other.getCHAN_RFD_TOTAL_GT_TX()))
            && (this.getCHAN_PAY_TOTAL_GT_HX() == null ? other.getCHAN_PAY_TOTAL_GT_HX() == null : this.getCHAN_PAY_TOTAL_GT_HX().equals(other.getCHAN_PAY_TOTAL_GT_HX()))
            && (this.getCHAN_RFD_TOTAL_GT_HX() == null ? other.getCHAN_RFD_TOTAL_GT_HX() == null : this.getCHAN_RFD_TOTAL_GT_HX().equals(other.getCHAN_RFD_TOTAL_GT_HX()))
            && (this.getCHAN_PAY_TOTAL_GT_RX() == null ? other.getCHAN_PAY_TOTAL_GT_RX() == null : this.getCHAN_PAY_TOTAL_GT_RX().equals(other.getCHAN_PAY_TOTAL_GT_RX()))
            && (this.getCHAN_RFD_TOTAL_GT_RX() == null ? other.getCHAN_RFD_TOTAL_GT_RX() == null : this.getCHAN_RFD_TOTAL_GT_RX().equals(other.getCHAN_RFD_TOTAL_GT_RX()))
            && (this.getCHAN_PAY_TOTAL_GT_BA() == null ? other.getCHAN_PAY_TOTAL_GT_BA() == null : this.getCHAN_PAY_TOTAL_GT_BA().equals(other.getCHAN_PAY_TOTAL_GT_BA()))
            && (this.getCHAN_RFD_TOTAL_GT_BA() == null ? other.getCHAN_RFD_TOTAL_GT_BA() == null : this.getCHAN_RFD_TOTAL_GT_BA().equals(other.getCHAN_RFD_TOTAL_GT_BA()))
            && (this.getCHAN_PAY_TOTAL_GT_GP() == null ? other.getCHAN_PAY_TOTAL_GT_GP() == null : this.getCHAN_PAY_TOTAL_GT_GP().equals(other.getCHAN_PAY_TOTAL_GT_GP()))
            && (this.getCHAN_RFD_TOTAL_GT_GP() == null ? other.getCHAN_RFD_TOTAL_GT_GP() == null : this.getCHAN_RFD_TOTAL_GT_GP().equals(other.getCHAN_RFD_TOTAL_GT_GP()))
            && (this.getCHAN_PAY_TOTAL_GT_PN() == null ? other.getCHAN_PAY_TOTAL_GT_PN() == null : this.getCHAN_PAY_TOTAL_GT_PN().equals(other.getCHAN_PAY_TOTAL_GT_PN()))
            && (this.getCHAN_RFD_TOTAL_GT_PN() == null ? other.getCHAN_RFD_TOTAL_GT_PN() == null : this.getCHAN_RFD_TOTAL_GT_PN().equals(other.getCHAN_RFD_TOTAL_GT_PN()))
            && (this.getCHAN_PAY_TOTAL_AMT() == null ? other.getCHAN_PAY_TOTAL_AMT() == null : this.getCHAN_PAY_TOTAL_AMT().equals(other.getCHAN_PAY_TOTAL_AMT()))
            && (this.getCHAN_PAY_TOTAL_COUNT() == null ? other.getCHAN_PAY_TOTAL_COUNT() == null : this.getCHAN_PAY_TOTAL_COUNT().equals(other.getCHAN_PAY_TOTAL_COUNT()))
            && (this.getCHAN_RFD_TOTAL_AMT() == null ? other.getCHAN_RFD_TOTAL_AMT() == null : this.getCHAN_RFD_TOTAL_AMT().equals(other.getCHAN_RFD_TOTAL_AMT()))
            && (this.getCHAN_RFD_TOTAL_COUNT() == null ? other.getCHAN_RFD_TOTAL_COUNT() == null : this.getCHAN_RFD_TOTAL_COUNT().equals(other.getCHAN_RFD_TOTAL_COUNT()))
            && (this.getCHAN_DOUBTS_LONG_PAY_C_AMT() == null ? other.getCHAN_DOUBTS_LONG_PAY_C_AMT() == null : this.getCHAN_DOUBTS_LONG_PAY_C_AMT().equals(other.getCHAN_DOUBTS_LONG_PAY_C_AMT()))
            && (this.getCHAN_DOUBTS_LONG_RFD_C_AMT() == null ? other.getCHAN_DOUBTS_LONG_RFD_C_AMT() == null : this.getCHAN_DOUBTS_LONG_RFD_C_AMT().equals(other.getCHAN_DOUBTS_LONG_RFD_C_AMT()))
            && (this.getCHAN_DOUBTS_LONG_PAY_GI() == null ? other.getCHAN_DOUBTS_LONG_PAY_GI() == null : this.getCHAN_DOUBTS_LONG_PAY_GI().equals(other.getCHAN_DOUBTS_LONG_PAY_GI()))
            && (this.getCHAN_DOUBTS_LONG_RFD_GI() == null ? other.getCHAN_DOUBTS_LONG_RFD_GI() == null : this.getCHAN_DOUBTS_LONG_RFD_GI().equals(other.getCHAN_DOUBTS_LONG_RFD_GI()))
            && (this.getCHAN_DOUBTS_LONG_PAY_GU() == null ? other.getCHAN_DOUBTS_LONG_PAY_GU() == null : this.getCHAN_DOUBTS_LONG_PAY_GU().equals(other.getCHAN_DOUBTS_LONG_PAY_GU()))
            && (this.getCHAN_DOUBTS_LONG_RFD_GU() == null ? other.getCHAN_DOUBTS_LONG_RFD_GU() == null : this.getCHAN_DOUBTS_LONG_RFD_GU().equals(other.getCHAN_DOUBTS_LONG_RFD_GU()))
            && (this.getCHAN_DOUBTS_LONG_PAY_GT_XA() == null ? other.getCHAN_DOUBTS_LONG_PAY_GT_XA() == null : this.getCHAN_DOUBTS_LONG_PAY_GT_XA().equals(other.getCHAN_DOUBTS_LONG_PAY_GT_XA()))
            && (this.getCHAN_DOUBTS_LONG_RFD_GT_XA() == null ? other.getCHAN_DOUBTS_LONG_RFD_GT_XA() == null : this.getCHAN_DOUBTS_LONG_RFD_GT_XA().equals(other.getCHAN_DOUBTS_LONG_RFD_GT_XA()))
            && (this.getCHAN_DOUBTS_LONG_PAY_GT_TX() == null ? other.getCHAN_DOUBTS_LONG_PAY_GT_TX() == null : this.getCHAN_DOUBTS_LONG_PAY_GT_TX().equals(other.getCHAN_DOUBTS_LONG_PAY_GT_TX()))
            && (this.getCHAN_DOUBTS_LONG_RFD_GT_TX() == null ? other.getCHAN_DOUBTS_LONG_RFD_GT_TX() == null : this.getCHAN_DOUBTS_LONG_RFD_GT_TX().equals(other.getCHAN_DOUBTS_LONG_RFD_GT_TX()))
            && (this.getCHAN_DOUBTS_LONG_PAY_GT_HX() == null ? other.getCHAN_DOUBTS_LONG_PAY_GT_HX() == null : this.getCHAN_DOUBTS_LONG_PAY_GT_HX().equals(other.getCHAN_DOUBTS_LONG_PAY_GT_HX()))
            && (this.getCHAN_DOUBTS_LONG_RFD_GT_HX() == null ? other.getCHAN_DOUBTS_LONG_RFD_GT_HX() == null : this.getCHAN_DOUBTS_LONG_RFD_GT_HX().equals(other.getCHAN_DOUBTS_LONG_RFD_GT_HX()))
            && (this.getCHAN_DOUBTS_LONG_PAY_GT_RX() == null ? other.getCHAN_DOUBTS_LONG_PAY_GT_RX() == null : this.getCHAN_DOUBTS_LONG_PAY_GT_RX().equals(other.getCHAN_DOUBTS_LONG_PAY_GT_RX()))
            && (this.getCHAN_DOUBTS_LONG_RFD_GT_RX() == null ? other.getCHAN_DOUBTS_LONG_RFD_GT_RX() == null : this.getCHAN_DOUBTS_LONG_RFD_GT_RX().equals(other.getCHAN_DOUBTS_LONG_RFD_GT_RX()))
            && (this.getCHAN_DOUBTS_LONG_PAY_GT_BA() == null ? other.getCHAN_DOUBTS_LONG_PAY_GT_BA() == null : this.getCHAN_DOUBTS_LONG_PAY_GT_BA().equals(other.getCHAN_DOUBTS_LONG_PAY_GT_BA()))
            && (this.getCHAN_DOUBTS_LONG_RFD_GT_BA() == null ? other.getCHAN_DOUBTS_LONG_RFD_GT_BA() == null : this.getCHAN_DOUBTS_LONG_RFD_GT_BA().equals(other.getCHAN_DOUBTS_LONG_RFD_GT_BA()))
            && (this.getCHAN_DOUBTS_LONG_PAY_GT_GP() == null ? other.getCHAN_DOUBTS_LONG_PAY_GT_GP() == null : this.getCHAN_DOUBTS_LONG_PAY_GT_GP().equals(other.getCHAN_DOUBTS_LONG_PAY_GT_GP()))
            && (this.getCHAN_DOUBTS_LONG_RFD_GT_GP() == null ? other.getCHAN_DOUBTS_LONG_RFD_GT_GP() == null : this.getCHAN_DOUBTS_LONG_RFD_GT_GP().equals(other.getCHAN_DOUBTS_LONG_RFD_GT_GP()))
            && (this.getCHAN_DOUBTS_LONG_PAY_GT_PN() == null ? other.getCHAN_DOUBTS_LONG_PAY_GT_PN() == null : this.getCHAN_DOUBTS_LONG_PAY_GT_PN().equals(other.getCHAN_DOUBTS_LONG_PAY_GT_PN()))
            && (this.getCHAN_DOUBTS_LONG_RFD_GT_PN() == null ? other.getCHAN_DOUBTS_LONG_RFD_GT_PN() == null : this.getCHAN_DOUBTS_LONG_RFD_GT_PN().equals(other.getCHAN_DOUBTS_LONG_RFD_GT_PN()))
            && (this.getCHAN_DOUBTS_LONG_PAY_AMT() == null ? other.getCHAN_DOUBTS_LONG_PAY_AMT() == null : this.getCHAN_DOUBTS_LONG_PAY_AMT().equals(other.getCHAN_DOUBTS_LONG_PAY_AMT()))
            && (this.getCHAN_DOUBTS_LONG_PAY_COUNT() == null ? other.getCHAN_DOUBTS_LONG_PAY_COUNT() == null : this.getCHAN_DOUBTS_LONG_PAY_COUNT().equals(other.getCHAN_DOUBTS_LONG_PAY_COUNT()))
            && (this.getCHAN_DOUBTS_LONG_RFD_AMT() == null ? other.getCHAN_DOUBTS_LONG_RFD_AMT() == null : this.getCHAN_DOUBTS_LONG_RFD_AMT().equals(other.getCHAN_DOUBTS_LONG_RFD_AMT()))
            && (this.getCHAN_DOUBTS_LONG_RFD_COUNT() == null ? other.getCHAN_DOUBTS_LONG_RFD_COUNT() == null : this.getCHAN_DOUBTS_LONG_RFD_COUNT().equals(other.getCHAN_DOUBTS_LONG_RFD_COUNT()))
            && (this.getCHAN_FLAT_PAY_C_AMT() == null ? other.getCHAN_FLAT_PAY_C_AMT() == null : this.getCHAN_FLAT_PAY_C_AMT().equals(other.getCHAN_FLAT_PAY_C_AMT()))
            && (this.getCHAN_FLAT_RFD_C_AMT() == null ? other.getCHAN_FLAT_RFD_C_AMT() == null : this.getCHAN_FLAT_RFD_C_AMT().equals(other.getCHAN_FLAT_RFD_C_AMT()))
            && (this.getCHAN_FLAT_PAY_GI() == null ? other.getCHAN_FLAT_PAY_GI() == null : this.getCHAN_FLAT_PAY_GI().equals(other.getCHAN_FLAT_PAY_GI()))
            && (this.getCHAN_FLAT_RFD_GI() == null ? other.getCHAN_FLAT_RFD_GI() == null : this.getCHAN_FLAT_RFD_GI().equals(other.getCHAN_FLAT_RFD_GI()))
            && (this.getCHAN_FLAT_PAY_GU() == null ? other.getCHAN_FLAT_PAY_GU() == null : this.getCHAN_FLAT_PAY_GU().equals(other.getCHAN_FLAT_PAY_GU()))
            && (this.getCHAN_FLAT_RFD_GU() == null ? other.getCHAN_FLAT_RFD_GU() == null : this.getCHAN_FLAT_RFD_GU().equals(other.getCHAN_FLAT_RFD_GU()))
            && (this.getCHAN_FLAT_PAY_GT_XA() == null ? other.getCHAN_FLAT_PAY_GT_XA() == null : this.getCHAN_FLAT_PAY_GT_XA().equals(other.getCHAN_FLAT_PAY_GT_XA()))
            && (this.getCHAN_FLAT_RFD_GT_XA() == null ? other.getCHAN_FLAT_RFD_GT_XA() == null : this.getCHAN_FLAT_RFD_GT_XA().equals(other.getCHAN_FLAT_RFD_GT_XA()))
            && (this.getCHAN_FLAT_PAY_GT_TX() == null ? other.getCHAN_FLAT_PAY_GT_TX() == null : this.getCHAN_FLAT_PAY_GT_TX().equals(other.getCHAN_FLAT_PAY_GT_TX()))
            && (this.getCHAN_FLAT_RFD_GT_TX() == null ? other.getCHAN_FLAT_RFD_GT_TX() == null : this.getCHAN_FLAT_RFD_GT_TX().equals(other.getCHAN_FLAT_RFD_GT_TX()))
            && (this.getCHAN_FLAT_PAY_GT_HX() == null ? other.getCHAN_FLAT_PAY_GT_HX() == null : this.getCHAN_FLAT_PAY_GT_HX().equals(other.getCHAN_FLAT_PAY_GT_HX()))
            && (this.getCHAN_FLAT_RFD_GT_HX() == null ? other.getCHAN_FLAT_RFD_GT_HX() == null : this.getCHAN_FLAT_RFD_GT_HX().equals(other.getCHAN_FLAT_RFD_GT_HX()))
            && (this.getCHAN_FLAT_PAY_GT_RX() == null ? other.getCHAN_FLAT_PAY_GT_RX() == null : this.getCHAN_FLAT_PAY_GT_RX().equals(other.getCHAN_FLAT_PAY_GT_RX()))
            && (this.getCHAN_FLAT_RFD_GT_RX() == null ? other.getCHAN_FLAT_RFD_GT_RX() == null : this.getCHAN_FLAT_RFD_GT_RX().equals(other.getCHAN_FLAT_RFD_GT_RX()))
            && (this.getCHAN_FLAT_PAY_GT_BA() == null ? other.getCHAN_FLAT_PAY_GT_BA() == null : this.getCHAN_FLAT_PAY_GT_BA().equals(other.getCHAN_FLAT_PAY_GT_BA()))
            && (this.getCHAN_FLAT_RFD_GT_BA() == null ? other.getCHAN_FLAT_RFD_GT_BA() == null : this.getCHAN_FLAT_RFD_GT_BA().equals(other.getCHAN_FLAT_RFD_GT_BA()))
            && (this.getCHAN_FLAT_PAY_GT_GP() == null ? other.getCHAN_FLAT_PAY_GT_GP() == null : this.getCHAN_FLAT_PAY_GT_GP().equals(other.getCHAN_FLAT_PAY_GT_GP()))
            && (this.getCHAN_FLAT_RFD_GT_GP() == null ? other.getCHAN_FLAT_RFD_GT_GP() == null : this.getCHAN_FLAT_RFD_GT_GP().equals(other.getCHAN_FLAT_RFD_GT_GP()))
            && (this.getCHAN_FLAT_PAY_GT_PN() == null ? other.getCHAN_FLAT_PAY_GT_PN() == null : this.getCHAN_FLAT_PAY_GT_PN().equals(other.getCHAN_FLAT_PAY_GT_PN()))
            && (this.getCHAN_FLAT_RFD_GT_PN() == null ? other.getCHAN_FLAT_RFD_GT_PN() == null : this.getCHAN_FLAT_RFD_GT_PN().equals(other.getCHAN_FLAT_RFD_GT_PN()))
            && (this.getCHAN_FLAT_PAY_AMT() == null ? other.getCHAN_FLAT_PAY_AMT() == null : this.getCHAN_FLAT_PAY_AMT().equals(other.getCHAN_FLAT_PAY_AMT()))
            && (this.getCHAN_FLAT_PAY_COUNT() == null ? other.getCHAN_FLAT_PAY_COUNT() == null : this.getCHAN_FLAT_PAY_COUNT().equals(other.getCHAN_FLAT_PAY_COUNT()))
            && (this.getCHAN_FLAT_RFD_AMT() == null ? other.getCHAN_FLAT_RFD_AMT() == null : this.getCHAN_FLAT_RFD_AMT().equals(other.getCHAN_FLAT_RFD_AMT()))
            && (this.getCHAN_FLAT_RFD_COUNT() == null ? other.getCHAN_FLAT_RFD_COUNT() == null : this.getCHAN_FLAT_RFD_COUNT().equals(other.getCHAN_FLAT_RFD_COUNT()))
            && (this.getCHAN_NO_FLAT_PAY_C_AMT() == null ? other.getCHAN_NO_FLAT_PAY_C_AMT() == null : this.getCHAN_NO_FLAT_PAY_C_AMT().equals(other.getCHAN_NO_FLAT_PAY_C_AMT()))
            && (this.getCHAN_NO_FLAT_RFD_C_AMT() == null ? other.getCHAN_NO_FLAT_RFD_C_AMT() == null : this.getCHAN_NO_FLAT_RFD_C_AMT().equals(other.getCHAN_NO_FLAT_RFD_C_AMT()))
            && (this.getCHAN_NO_FLAT_PAY_GI() == null ? other.getCHAN_NO_FLAT_PAY_GI() == null : this.getCHAN_NO_FLAT_PAY_GI().equals(other.getCHAN_NO_FLAT_PAY_GI()))
            && (this.getCHAN_NO_FLAT_RFD_GI() == null ? other.getCHAN_NO_FLAT_RFD_GI() == null : this.getCHAN_NO_FLAT_RFD_GI().equals(other.getCHAN_NO_FLAT_RFD_GI()))
            && (this.getCHAN_NO_FLAT_PAY_GU() == null ? other.getCHAN_NO_FLAT_PAY_GU() == null : this.getCHAN_NO_FLAT_PAY_GU().equals(other.getCHAN_NO_FLAT_PAY_GU()))
            && (this.getCHAN_NO_FLAT_RFD_GU() == null ? other.getCHAN_NO_FLAT_RFD_GU() == null : this.getCHAN_NO_FLAT_RFD_GU().equals(other.getCHAN_NO_FLAT_RFD_GU()))
            && (this.getCHAN_NO_FLAT_PAY_GT_XA() == null ? other.getCHAN_NO_FLAT_PAY_GT_XA() == null : this.getCHAN_NO_FLAT_PAY_GT_XA().equals(other.getCHAN_NO_FLAT_PAY_GT_XA()))
            && (this.getCHAN_NO_FLAT_RFD_GT_XA() == null ? other.getCHAN_NO_FLAT_RFD_GT_XA() == null : this.getCHAN_NO_FLAT_RFD_GT_XA().equals(other.getCHAN_NO_FLAT_RFD_GT_XA()))
            && (this.getCHAN_NO_FLAT_PAY_GT_TX() == null ? other.getCHAN_NO_FLAT_PAY_GT_TX() == null : this.getCHAN_NO_FLAT_PAY_GT_TX().equals(other.getCHAN_NO_FLAT_PAY_GT_TX()))
            && (this.getCHAN_NO_FLAT_RFD_GT_TX() == null ? other.getCHAN_NO_FLAT_RFD_GT_TX() == null : this.getCHAN_NO_FLAT_RFD_GT_TX().equals(other.getCHAN_NO_FLAT_RFD_GT_TX()))
            && (this.getCHAN_NO_FLAT_PAY_GT_HX() == null ? other.getCHAN_NO_FLAT_PAY_GT_HX() == null : this.getCHAN_NO_FLAT_PAY_GT_HX().equals(other.getCHAN_NO_FLAT_PAY_GT_HX()))
            && (this.getCHAN_NO_FLAT_RFD_GT_HX() == null ? other.getCHAN_NO_FLAT_RFD_GT_HX() == null : this.getCHAN_NO_FLAT_RFD_GT_HX().equals(other.getCHAN_NO_FLAT_RFD_GT_HX()))
            && (this.getCHAN_NO_FLAT_PAY_GT_RX() == null ? other.getCHAN_NO_FLAT_PAY_GT_RX() == null : this.getCHAN_NO_FLAT_PAY_GT_RX().equals(other.getCHAN_NO_FLAT_PAY_GT_RX()))
            && (this.getCHAN_NO_FLAT_RFD_GT_RX() == null ? other.getCHAN_NO_FLAT_RFD_GT_RX() == null : this.getCHAN_NO_FLAT_RFD_GT_RX().equals(other.getCHAN_NO_FLAT_RFD_GT_RX()))
            && (this.getCHAN_NO_FLAT_PAY_GT_BA() == null ? other.getCHAN_NO_FLAT_PAY_GT_BA() == null : this.getCHAN_NO_FLAT_PAY_GT_BA().equals(other.getCHAN_NO_FLAT_PAY_GT_BA()))
            && (this.getCHAN_NO_FLAT_RFD_GT_BA() == null ? other.getCHAN_NO_FLAT_RFD_GT_BA() == null : this.getCHAN_NO_FLAT_RFD_GT_BA().equals(other.getCHAN_NO_FLAT_RFD_GT_BA()))
            && (this.getCHAN_NO_FLAT_PAY_GT_GP() == null ? other.getCHAN_NO_FLAT_PAY_GT_GP() == null : this.getCHAN_NO_FLAT_PAY_GT_GP().equals(other.getCHAN_NO_FLAT_PAY_GT_GP()))
            && (this.getCHAN_NO_FLAT_RFD_GT_GP() == null ? other.getCHAN_NO_FLAT_RFD_GT_GP() == null : this.getCHAN_NO_FLAT_RFD_GT_GP().equals(other.getCHAN_NO_FLAT_RFD_GT_GP()))
            && (this.getCHAN_NO_FLAT_PAY_GT_PN() == null ? other.getCHAN_NO_FLAT_PAY_GT_PN() == null : this.getCHAN_NO_FLAT_PAY_GT_PN().equals(other.getCHAN_NO_FLAT_PAY_GT_PN()))
            && (this.getCHAN_NO_FLAT_RFD_GT_PN() == null ? other.getCHAN_NO_FLAT_RFD_GT_PN() == null : this.getCHAN_NO_FLAT_RFD_GT_PN().equals(other.getCHAN_NO_FLAT_RFD_GT_PN()))
            && (this.getCHAN_NO_FLAT_PAY_AMT() == null ? other.getCHAN_NO_FLAT_PAY_AMT() == null : this.getCHAN_NO_FLAT_PAY_AMT().equals(other.getCHAN_NO_FLAT_PAY_AMT()))
            && (this.getCHAN_NO_FLAT_PAY_COUNT() == null ? other.getCHAN_NO_FLAT_PAY_COUNT() == null : this.getCHAN_NO_FLAT_PAY_COUNT().equals(other.getCHAN_NO_FLAT_PAY_COUNT()))
            && (this.getCHAN_NO_FLAT_RFD_AMT() == null ? other.getCHAN_NO_FLAT_RFD_AMT() == null : this.getCHAN_NO_FLAT_RFD_AMT().equals(other.getCHAN_NO_FLAT_RFD_AMT()))
            && (this.getCHAN_NO_FLAT_RFD_COUNT() == null ? other.getCHAN_NO_FLAT_RFD_COUNT() == null : this.getCHAN_NO_FLAT_RFD_COUNT().equals(other.getCHAN_NO_FLAT_RFD_COUNT()))
            && (this.getDOUBTS_LONG_FLAT_PAY_C_AMT() == null ? other.getDOUBTS_LONG_FLAT_PAY_C_AMT() == null : this.getDOUBTS_LONG_FLAT_PAY_C_AMT().equals(other.getDOUBTS_LONG_FLAT_PAY_C_AMT()))
            && (this.getDOUBTS_LONG_FLAT_RFD_C_AMT() == null ? other.getDOUBTS_LONG_FLAT_RFD_C_AMT() == null : this.getDOUBTS_LONG_FLAT_RFD_C_AMT().equals(other.getDOUBTS_LONG_FLAT_RFD_C_AMT()))
            && (this.getDOUBTS_LONG_FLAT_PAY_GI() == null ? other.getDOUBTS_LONG_FLAT_PAY_GI() == null : this.getDOUBTS_LONG_FLAT_PAY_GI().equals(other.getDOUBTS_LONG_FLAT_PAY_GI()))
            && (this.getDOUBTS_LONG_FLAT_RFD_GI() == null ? other.getDOUBTS_LONG_FLAT_RFD_GI() == null : this.getDOUBTS_LONG_FLAT_RFD_GI().equals(other.getDOUBTS_LONG_FLAT_RFD_GI()))
            && (this.getDOUBTS_LONG_FLAT_PAY_GU() == null ? other.getDOUBTS_LONG_FLAT_PAY_GU() == null : this.getDOUBTS_LONG_FLAT_PAY_GU().equals(other.getDOUBTS_LONG_FLAT_PAY_GU()))
            && (this.getDOUBTS_LONG_FLAT_RFD_GU() == null ? other.getDOUBTS_LONG_FLAT_RFD_GU() == null : this.getDOUBTS_LONG_FLAT_RFD_GU().equals(other.getDOUBTS_LONG_FLAT_RFD_GU()))
            && (this.getDOUBTS_LONG_FLAT_PAY_GT_XA() == null ? other.getDOUBTS_LONG_FLAT_PAY_GT_XA() == null : this.getDOUBTS_LONG_FLAT_PAY_GT_XA().equals(other.getDOUBTS_LONG_FLAT_PAY_GT_XA()))
            && (this.getDOUBTS_LONG_FLAT_RFD_GT_XA() == null ? other.getDOUBTS_LONG_FLAT_RFD_GT_XA() == null : this.getDOUBTS_LONG_FLAT_RFD_GT_XA().equals(other.getDOUBTS_LONG_FLAT_RFD_GT_XA()))
            && (this.getDOUBTS_LONG_FLAT_PAY_GT_TX() == null ? other.getDOUBTS_LONG_FLAT_PAY_GT_TX() == null : this.getDOUBTS_LONG_FLAT_PAY_GT_TX().equals(other.getDOUBTS_LONG_FLAT_PAY_GT_TX()))
            && (this.getDOUBTS_LONG_FLAT_RFD_GT_TX() == null ? other.getDOUBTS_LONG_FLAT_RFD_GT_TX() == null : this.getDOUBTS_LONG_FLAT_RFD_GT_TX().equals(other.getDOUBTS_LONG_FLAT_RFD_GT_TX()))
            && (this.getDOUBTS_LONG_FLAT_PAY_GT_HX() == null ? other.getDOUBTS_LONG_FLAT_PAY_GT_HX() == null : this.getDOUBTS_LONG_FLAT_PAY_GT_HX().equals(other.getDOUBTS_LONG_FLAT_PAY_GT_HX()))
            && (this.getDOUBTS_LONG_FLAT_RFD_GT_HX() == null ? other.getDOUBTS_LONG_FLAT_RFD_GT_HX() == null : this.getDOUBTS_LONG_FLAT_RFD_GT_HX().equals(other.getDOUBTS_LONG_FLAT_RFD_GT_HX()))
            && (this.getDOUBTS_LONG_FLAT_PAY_GT_RX() == null ? other.getDOUBTS_LONG_FLAT_PAY_GT_RX() == null : this.getDOUBTS_LONG_FLAT_PAY_GT_RX().equals(other.getDOUBTS_LONG_FLAT_PAY_GT_RX()))
            && (this.getDOUBTS_LONG_FLAT_RFD_GT_RX() == null ? other.getDOUBTS_LONG_FLAT_RFD_GT_RX() == null : this.getDOUBTS_LONG_FLAT_RFD_GT_RX().equals(other.getDOUBTS_LONG_FLAT_RFD_GT_RX()))
            && (this.getDOUBTS_LONG_FLAT_PAY_GT_BA() == null ? other.getDOUBTS_LONG_FLAT_PAY_GT_BA() == null : this.getDOUBTS_LONG_FLAT_PAY_GT_BA().equals(other.getDOUBTS_LONG_FLAT_PAY_GT_BA()))
            && (this.getDOUBTS_LONG_FLAT_RFD_GT_BA() == null ? other.getDOUBTS_LONG_FLAT_RFD_GT_BA() == null : this.getDOUBTS_LONG_FLAT_RFD_GT_BA().equals(other.getDOUBTS_LONG_FLAT_RFD_GT_BA()))
            && (this.getDOUBTS_LONG_FLAT_PAY_GT_GP() == null ? other.getDOUBTS_LONG_FLAT_PAY_GT_GP() == null : this.getDOUBTS_LONG_FLAT_PAY_GT_GP().equals(other.getDOUBTS_LONG_FLAT_PAY_GT_GP()))
            && (this.getDOUBTS_LONG_FLAT_RFD_GT_GP() == null ? other.getDOUBTS_LONG_FLAT_RFD_GT_GP() == null : this.getDOUBTS_LONG_FLAT_RFD_GT_GP().equals(other.getDOUBTS_LONG_FLAT_RFD_GT_GP()))
            && (this.getDOUBTS_LONG_FLAT_PAY_GT_PN() == null ? other.getDOUBTS_LONG_FLAT_PAY_GT_PN() == null : this.getDOUBTS_LONG_FLAT_PAY_GT_PN().equals(other.getDOUBTS_LONG_FLAT_PAY_GT_PN()))
            && (this.getDOUBTS_LONG_FLAT_RFD_GT_PN() == null ? other.getDOUBTS_LONG_FLAT_RFD_GT_PN() == null : this.getDOUBTS_LONG_FLAT_RFD_GT_PN().equals(other.getDOUBTS_LONG_FLAT_RFD_GT_PN()))
            && (this.getDOUBTS_LONG_FLAT_PAY_AMT() == null ? other.getDOUBTS_LONG_FLAT_PAY_AMT() == null : this.getDOUBTS_LONG_FLAT_PAY_AMT().equals(other.getDOUBTS_LONG_FLAT_PAY_AMT()))
            && (this.getDOUBTS_LONG_FLAT_PAY_COUNT() == null ? other.getDOUBTS_LONG_FLAT_PAY_COUNT() == null : this.getDOUBTS_LONG_FLAT_PAY_COUNT().equals(other.getDOUBTS_LONG_FLAT_PAY_COUNT()))
            && (this.getDOUBTS_LONG_FLAT_RFD_AMT() == null ? other.getDOUBTS_LONG_FLAT_RFD_AMT() == null : this.getDOUBTS_LONG_FLAT_RFD_AMT().equals(other.getDOUBTS_LONG_FLAT_RFD_AMT()))
            && (this.getDOUBTS_LONG_FLAT_RFD_COUNT() == null ? other.getDOUBTS_LONG_FLAT_RFD_COUNT() == null : this.getDOUBTS_LONG_FLAT_RFD_COUNT().equals(other.getDOUBTS_LONG_FLAT_RFD_COUNT()))
            && (this.getDOUBTS_LONG_NO_FLAT_PAY_C_AMT() == null ? other.getDOUBTS_LONG_NO_FLAT_PAY_C_AMT() == null : this.getDOUBTS_LONG_NO_FLAT_PAY_C_AMT().equals(other.getDOUBTS_LONG_NO_FLAT_PAY_C_AMT()))
            && (this.getDOUBTS_LONG_NO_FLAT_RFD_C_AMT() == null ? other.getDOUBTS_LONG_NO_FLAT_RFD_C_AMT() == null : this.getDOUBTS_LONG_NO_FLAT_RFD_C_AMT().equals(other.getDOUBTS_LONG_NO_FLAT_RFD_C_AMT()))
            && (this.getDOUBTS_LONG_NO_FLAT_PAY_GI() == null ? other.getDOUBTS_LONG_NO_FLAT_PAY_GI() == null : this.getDOUBTS_LONG_NO_FLAT_PAY_GI().equals(other.getDOUBTS_LONG_NO_FLAT_PAY_GI()))
            && (this.getDOUBTS_LONG_NO_FLAT_RFD_GI() == null ? other.getDOUBTS_LONG_NO_FLAT_RFD_GI() == null : this.getDOUBTS_LONG_NO_FLAT_RFD_GI().equals(other.getDOUBTS_LONG_NO_FLAT_RFD_GI()))
            && (this.getDOUBTS_LONG_NO_FLAT_PAY_GU() == null ? other.getDOUBTS_LONG_NO_FLAT_PAY_GU() == null : this.getDOUBTS_LONG_NO_FLAT_PAY_GU().equals(other.getDOUBTS_LONG_NO_FLAT_PAY_GU()))
            && (this.getDOUBTS_LONG_NO_FLAT_RFD_GU() == null ? other.getDOUBTS_LONG_NO_FLAT_RFD_GU() == null : this.getDOUBTS_LONG_NO_FLAT_RFD_GU().equals(other.getDOUBTS_LONG_NO_FLAT_RFD_GU()))
            && (this.getDOUBTS_LONG_NO_FLAT_PAY_GT_XA() == null ? other.getDOUBTS_LONG_NO_FLAT_PAY_GT_XA() == null : this.getDOUBTS_LONG_NO_FLAT_PAY_GT_XA().equals(other.getDOUBTS_LONG_NO_FLAT_PAY_GT_XA()))
            && (this.getDOUBTS_LONG_NO_FLAT_RFD_GT_XA() == null ? other.getDOUBTS_LONG_NO_FLAT_RFD_GT_XA() == null : this.getDOUBTS_LONG_NO_FLAT_RFD_GT_XA().equals(other.getDOUBTS_LONG_NO_FLAT_RFD_GT_XA()))
            && (this.getDOUBTS_LONG_NO_FLAT_PAY_GT_TX() == null ? other.getDOUBTS_LONG_NO_FLAT_PAY_GT_TX() == null : this.getDOUBTS_LONG_NO_FLAT_PAY_GT_TX().equals(other.getDOUBTS_LONG_NO_FLAT_PAY_GT_TX()))
            && (this.getDOUBTS_LONG_NO_FLAT_RFD_GT_TX() == null ? other.getDOUBTS_LONG_NO_FLAT_RFD_GT_TX() == null : this.getDOUBTS_LONG_NO_FLAT_RFD_GT_TX().equals(other.getDOUBTS_LONG_NO_FLAT_RFD_GT_TX()))
            && (this.getDOUBTS_LONG_NO_FLAT_PAY_GT_HX() == null ? other.getDOUBTS_LONG_NO_FLAT_PAY_GT_HX() == null : this.getDOUBTS_LONG_NO_FLAT_PAY_GT_HX().equals(other.getDOUBTS_LONG_NO_FLAT_PAY_GT_HX()))
            && (this.getDOUBTS_LONG_NO_FLAT_RFD_GT_HX() == null ? other.getDOUBTS_LONG_NO_FLAT_RFD_GT_HX() == null : this.getDOUBTS_LONG_NO_FLAT_RFD_GT_HX().equals(other.getDOUBTS_LONG_NO_FLAT_RFD_GT_HX()))
            && (this.getDOUBTS_LONG_NO_FLAT_PAY_GT_RX() == null ? other.getDOUBTS_LONG_NO_FLAT_PAY_GT_RX() == null : this.getDOUBTS_LONG_NO_FLAT_PAY_GT_RX().equals(other.getDOUBTS_LONG_NO_FLAT_PAY_GT_RX()))
            && (this.getDOUBTS_LONG_NO_FLAT_RFD_GT_RX() == null ? other.getDOUBTS_LONG_NO_FLAT_RFD_GT_RX() == null : this.getDOUBTS_LONG_NO_FLAT_RFD_GT_RX().equals(other.getDOUBTS_LONG_NO_FLAT_RFD_GT_RX()))
            && (this.getDOUBTS_LONG_NO_FLAT_PAY_GT_BA() == null ? other.getDOUBTS_LONG_NO_FLAT_PAY_GT_BA() == null : this.getDOUBTS_LONG_NO_FLAT_PAY_GT_BA().equals(other.getDOUBTS_LONG_NO_FLAT_PAY_GT_BA()))
            && (this.getDOUBTS_LONG_NO_FLAT_RFD_GT_BA() == null ? other.getDOUBTS_LONG_NO_FLAT_RFD_GT_BA() == null : this.getDOUBTS_LONG_NO_FLAT_RFD_GT_BA().equals(other.getDOUBTS_LONG_NO_FLAT_RFD_GT_BA()))
            && (this.getDOUBTS_LONG_NO_FLAT_PAY_GT_GP() == null ? other.getDOUBTS_LONG_NO_FLAT_PAY_GT_GP() == null : this.getDOUBTS_LONG_NO_FLAT_PAY_GT_GP().equals(other.getDOUBTS_LONG_NO_FLAT_PAY_GT_GP()))
            && (this.getDOUBTS_LONG_NO_FLAT_RFD_GT_GP() == null ? other.getDOUBTS_LONG_NO_FLAT_RFD_GT_GP() == null : this.getDOUBTS_LONG_NO_FLAT_RFD_GT_GP().equals(other.getDOUBTS_LONG_NO_FLAT_RFD_GT_GP()))
            && (this.getDOUBTS_LONG_NO_FLAT_PAY_GT_PN() == null ? other.getDOUBTS_LONG_NO_FLAT_PAY_GT_PN() == null : this.getDOUBTS_LONG_NO_FLAT_PAY_GT_PN().equals(other.getDOUBTS_LONG_NO_FLAT_PAY_GT_PN()))
            && (this.getDOUBTS_LONG_NO_FLAT_RFD_GT_PN() == null ? other.getDOUBTS_LONG_NO_FLAT_RFD_GT_PN() == null : this.getDOUBTS_LONG_NO_FLAT_RFD_GT_PN().equals(other.getDOUBTS_LONG_NO_FLAT_RFD_GT_PN()))
            && (this.getDOUBTS_LONG_NO_FLAT_PAY_AMT() == null ? other.getDOUBTS_LONG_NO_FLAT_PAY_AMT() == null : this.getDOUBTS_LONG_NO_FLAT_PAY_AMT().equals(other.getDOUBTS_LONG_NO_FLAT_PAY_AMT()))
            && (this.getDOUBTS_LONG_NO_FLAT_PAY_COUNT() == null ? other.getDOUBTS_LONG_NO_FLAT_PAY_COUNT() == null : this.getDOUBTS_LONG_NO_FLAT_PAY_COUNT().equals(other.getDOUBTS_LONG_NO_FLAT_PAY_COUNT()))
            && (this.getDOUBTS_LONG_NO_FLAT_RFD_AMT() == null ? other.getDOUBTS_LONG_NO_FLAT_RFD_AMT() == null : this.getDOUBTS_LONG_NO_FLAT_RFD_AMT().equals(other.getDOUBTS_LONG_NO_FLAT_RFD_AMT()))
            && (this.getDOUBTS_LONG_NO_FLAT_RFD_COUNT() == null ? other.getDOUBTS_LONG_NO_FLAT_RFD_COUNT() == null : this.getDOUBTS_LONG_NO_FLAT_RFD_COUNT().equals(other.getDOUBTS_LONG_NO_FLAT_RFD_COUNT()))
            && (this.getCHAN_DIFFE_LONG_PAY_C_AMT() == null ? other.getCHAN_DIFFE_LONG_PAY_C_AMT() == null : this.getCHAN_DIFFE_LONG_PAY_C_AMT().equals(other.getCHAN_DIFFE_LONG_PAY_C_AMT()))
            && (this.getCHAN_DIFFE_LONG_RFD_C_AMT() == null ? other.getCHAN_DIFFE_LONG_RFD_C_AMT() == null : this.getCHAN_DIFFE_LONG_RFD_C_AMT().equals(other.getCHAN_DIFFE_LONG_RFD_C_AMT()))
            && (this.getCHAN_DIFFE_LONG_PAY_GI() == null ? other.getCHAN_DIFFE_LONG_PAY_GI() == null : this.getCHAN_DIFFE_LONG_PAY_GI().equals(other.getCHAN_DIFFE_LONG_PAY_GI()))
            && (this.getCHAN_DIFFE_LONG_RFD_GI() == null ? other.getCHAN_DIFFE_LONG_RFD_GI() == null : this.getCHAN_DIFFE_LONG_RFD_GI().equals(other.getCHAN_DIFFE_LONG_RFD_GI()))
            && (this.getCHAN_DIFFE_LONG_PAY_GU() == null ? other.getCHAN_DIFFE_LONG_PAY_GU() == null : this.getCHAN_DIFFE_LONG_PAY_GU().equals(other.getCHAN_DIFFE_LONG_PAY_GU()))
            && (this.getCHAN_DIFFE_LONG_RFD_GU() == null ? other.getCHAN_DIFFE_LONG_RFD_GU() == null : this.getCHAN_DIFFE_LONG_RFD_GU().equals(other.getCHAN_DIFFE_LONG_RFD_GU()))
            && (this.getCHAN_DIFFE_LONG_PAY_GT_XA() == null ? other.getCHAN_DIFFE_LONG_PAY_GT_XA() == null : this.getCHAN_DIFFE_LONG_PAY_GT_XA().equals(other.getCHAN_DIFFE_LONG_PAY_GT_XA()))
            && (this.getCHAN_DIFFE_LONG_RFD_GT_XA() == null ? other.getCHAN_DIFFE_LONG_RFD_GT_XA() == null : this.getCHAN_DIFFE_LONG_RFD_GT_XA().equals(other.getCHAN_DIFFE_LONG_RFD_GT_XA()))
            && (this.getCHAN_DIFFE_LONG_PAY_GT_TX() == null ? other.getCHAN_DIFFE_LONG_PAY_GT_TX() == null : this.getCHAN_DIFFE_LONG_PAY_GT_TX().equals(other.getCHAN_DIFFE_LONG_PAY_GT_TX()))
            && (this.getCHAN_DIFFE_LONG_RFD_GT_TX() == null ? other.getCHAN_DIFFE_LONG_RFD_GT_TX() == null : this.getCHAN_DIFFE_LONG_RFD_GT_TX().equals(other.getCHAN_DIFFE_LONG_RFD_GT_TX()))
            && (this.getCHAN_DIFFE_LONG_PAY_GT_HX() == null ? other.getCHAN_DIFFE_LONG_PAY_GT_HX() == null : this.getCHAN_DIFFE_LONG_PAY_GT_HX().equals(other.getCHAN_DIFFE_LONG_PAY_GT_HX()))
            && (this.getCHAN_DIFFE_LONG_RFD_GT_HX() == null ? other.getCHAN_DIFFE_LONG_RFD_GT_HX() == null : this.getCHAN_DIFFE_LONG_RFD_GT_HX().equals(other.getCHAN_DIFFE_LONG_RFD_GT_HX()))
            && (this.getCHAN_DIFFE_LONG_PAY_GT_RX() == null ? other.getCHAN_DIFFE_LONG_PAY_GT_RX() == null : this.getCHAN_DIFFE_LONG_PAY_GT_RX().equals(other.getCHAN_DIFFE_LONG_PAY_GT_RX()))
            && (this.getCHAN_DIFFE_LONG_RFD_GT_RX() == null ? other.getCHAN_DIFFE_LONG_RFD_GT_RX() == null : this.getCHAN_DIFFE_LONG_RFD_GT_RX().equals(other.getCHAN_DIFFE_LONG_RFD_GT_RX()))
            && (this.getCHAN_DIFFE_LONG_PAY_GT_BA() == null ? other.getCHAN_DIFFE_LONG_PAY_GT_BA() == null : this.getCHAN_DIFFE_LONG_PAY_GT_BA().equals(other.getCHAN_DIFFE_LONG_PAY_GT_BA()))
            && (this.getCHAN_DIFFE_LONG_RFD_GT_BA() == null ? other.getCHAN_DIFFE_LONG_RFD_GT_BA() == null : this.getCHAN_DIFFE_LONG_RFD_GT_BA().equals(other.getCHAN_DIFFE_LONG_RFD_GT_BA()))
            && (this.getCHAN_DIFFE_LONG_PAY_GT_GP() == null ? other.getCHAN_DIFFE_LONG_PAY_GT_GP() == null : this.getCHAN_DIFFE_LONG_PAY_GT_GP().equals(other.getCHAN_DIFFE_LONG_PAY_GT_GP()))
            && (this.getCHAN_DIFFE_LONG_RFD_GT_GP() == null ? other.getCHAN_DIFFE_LONG_RFD_GT_GP() == null : this.getCHAN_DIFFE_LONG_RFD_GT_GP().equals(other.getCHAN_DIFFE_LONG_RFD_GT_GP()))
            && (this.getCHAN_DIFFE_LONG_PAY_GT_PN() == null ? other.getCHAN_DIFFE_LONG_PAY_GT_PN() == null : this.getCHAN_DIFFE_LONG_PAY_GT_PN().equals(other.getCHAN_DIFFE_LONG_PAY_GT_PN()))
            && (this.getCHAN_DIFFE_LONG_RFD_GT_PN() == null ? other.getCHAN_DIFFE_LONG_RFD_GT_PN() == null : this.getCHAN_DIFFE_LONG_RFD_GT_PN().equals(other.getCHAN_DIFFE_LONG_RFD_GT_PN()))
            && (this.getCHAN_DIFFE_LONG_PAY_AMT() == null ? other.getCHAN_DIFFE_LONG_PAY_AMT() == null : this.getCHAN_DIFFE_LONG_PAY_AMT().equals(other.getCHAN_DIFFE_LONG_PAY_AMT()))
            && (this.getCHAN_DIFFE_LONG_PAY_COUNT() == null ? other.getCHAN_DIFFE_LONG_PAY_COUNT() == null : this.getCHAN_DIFFE_LONG_PAY_COUNT().equals(other.getCHAN_DIFFE_LONG_PAY_COUNT()))
            && (this.getCHAN_DIFFE_LONG_RFD_AMT() == null ? other.getCHAN_DIFFE_LONG_RFD_AMT() == null : this.getCHAN_DIFFE_LONG_RFD_AMT().equals(other.getCHAN_DIFFE_LONG_RFD_AMT()))
            && (this.getCHAN_DIFFE_LONG_RFD_COUNT() == null ? other.getCHAN_DIFFE_LONG_RFD_COUNT() == null : this.getCHAN_DIFFE_LONG_RFD_COUNT().equals(other.getCHAN_DIFFE_LONG_RFD_COUNT()));
    }

    /**
     *
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTASK_ID() == null) ? 0 : getTASK_ID().hashCode());
        result = prime * result + ((getCHAN_NO() == null) ? 0 : getCHAN_NO().hashCode());
        result = prime * result + ((getCHECK_DT() == null) ? 0 : getCHECK_DT().hashCode());
        result = prime * result + ((getAC_DT() == null) ? 0 : getAC_DT().hashCode());
        result = prime * result + ((getSTART_TM() == null) ? 0 : getSTART_TM().hashCode());
        result = prime * result + ((getEND_TM() == null) ? 0 : getEND_TM().hashCode());
        result = prime * result + ((getCHECK_STATE() == null) ? 0 : getCHECK_STATE().hashCode());
        result = prime * result + ((getREMARK() == null) ? 0 : getREMARK().hashCode());
        result = prime * result + ((getCHAN_FILENAME() == null) ? 0 : getCHAN_FILENAME().hashCode());
        result = prime * result + ((getTRAN_ACC_TO() == null) ? 0 : getTRAN_ACC_TO().hashCode());
        result = prime * result + ((getTRAN_ACC_AMT() == null) ? 0 : getTRAN_ACC_AMT().hashCode());
        result = prime * result + ((getOUR_PAY_TOTAL_C_AMT() == null) ? 0 : getOUR_PAY_TOTAL_C_AMT().hashCode());
        result = prime * result + ((getOUR_RFD_TOTAL_C_AMT() == null) ? 0 : getOUR_RFD_TOTAL_C_AMT().hashCode());
        result = prime * result + ((getOUR_PAY_TOTAL_GI() == null) ? 0 : getOUR_PAY_TOTAL_GI().hashCode());
        result = prime * result + ((getOUR_RFD_TOTAL_GI() == null) ? 0 : getOUR_RFD_TOTAL_GI().hashCode());
        result = prime * result + ((getOUR_PAY_TOTAL_GU() == null) ? 0 : getOUR_PAY_TOTAL_GU().hashCode());
        result = prime * result + ((getOUR_RFD_TOTAL_GU() == null) ? 0 : getOUR_RFD_TOTAL_GU().hashCode());
        result = prime * result + ((getOUR_PAY_TOTAL_GT_XA() == null) ? 0 : getOUR_PAY_TOTAL_GT_XA().hashCode());
        result = prime * result + ((getOUR_RFD_TOTAL_GT_XA() == null) ? 0 : getOUR_RFD_TOTAL_GT_XA().hashCode());
        result = prime * result + ((getOUR_PAY_TOTAL_GT_TX() == null) ? 0 : getOUR_PAY_TOTAL_GT_TX().hashCode());
        result = prime * result + ((getOUR_RFD_TOTAL_GT_TX() == null) ? 0 : getOUR_RFD_TOTAL_GT_TX().hashCode());
        result = prime * result + ((getOUR_PAY_TOTAL_GT_HX() == null) ? 0 : getOUR_PAY_TOTAL_GT_HX().hashCode());
        result = prime * result + ((getOUR_RFD_TOTAL_GT_HX() == null) ? 0 : getOUR_RFD_TOTAL_GT_HX().hashCode());
        result = prime * result + ((getOUR_PAY_TOTAL_GT_RX() == null) ? 0 : getOUR_PAY_TOTAL_GT_RX().hashCode());
        result = prime * result + ((getOUR_RFD_TOTAL_GT_RX() == null) ? 0 : getOUR_RFD_TOTAL_GT_RX().hashCode());
        result = prime * result + ((getOUR_PAY_TOTAL_GT_BA() == null) ? 0 : getOUR_PAY_TOTAL_GT_BA().hashCode());
        result = prime * result + ((getOUR_RFD_TOTAL_GT_BA() == null) ? 0 : getOUR_RFD_TOTAL_GT_BA().hashCode());
        result = prime * result + ((getOUR_PAY_TOTAL_GT_GP() == null) ? 0 : getOUR_PAY_TOTAL_GT_GP().hashCode());
        result = prime * result + ((getOUR_RFD_TOTAL_GT_GP() == null) ? 0 : getOUR_RFD_TOTAL_GT_GP().hashCode());
        result = prime * result + ((getOUR_PAY_TOTAL_GT_PN() == null) ? 0 : getOUR_PAY_TOTAL_GT_PN().hashCode());
        result = prime * result + ((getOUR_RFD_TOTAL_GT_PN() == null) ? 0 : getOUR_RFD_TOTAL_GT_PN().hashCode());
        result = prime * result + ((getOUR_PAY_TOTAL_AMT() == null) ? 0 : getOUR_PAY_TOTAL_AMT().hashCode());
        result = prime * result + ((getOUR_PAY_TOTAL_COUNT() == null) ? 0 : getOUR_PAY_TOTAL_COUNT().hashCode());
        result = prime * result + ((getOUR_RFD_TOTAL_AMT() == null) ? 0 : getOUR_RFD_TOTAL_AMT().hashCode());
        result = prime * result + ((getOUR_RFD_TOTAL_COUNT() == null) ? 0 : getOUR_RFD_TOTAL_COUNT().hashCode());
        result = prime * result + ((getOUR_DOUBTS_SHORT_PAY_C_AMT() == null) ? 0 : getOUR_DOUBTS_SHORT_PAY_C_AMT().hashCode());
        result = prime * result + ((getOUR_DOUBTS_SHORT_RFD_C_AMT() == null) ? 0 : getOUR_DOUBTS_SHORT_RFD_C_AMT().hashCode());
        result = prime * result + ((getOUR_DOUBTS_SHORT_PAY_GI() == null) ? 0 : getOUR_DOUBTS_SHORT_PAY_GI().hashCode());
        result = prime * result + ((getOUR_DOUBTS_SHORT_RFD_GI() == null) ? 0 : getOUR_DOUBTS_SHORT_RFD_GI().hashCode());
        result = prime * result + ((getOUR_DOUBTS_SHORT_PAY_GU() == null) ? 0 : getOUR_DOUBTS_SHORT_PAY_GU().hashCode());
        result = prime * result + ((getOUR_DOUBTS_SHORT_RFD_GU() == null) ? 0 : getOUR_DOUBTS_SHORT_RFD_GU().hashCode());
        result = prime * result + ((getOUR_DOUBTS_SHORT_PAY_GT_XA() == null) ? 0 : getOUR_DOUBTS_SHORT_PAY_GT_XA().hashCode());
        result = prime * result + ((getOUR_DOUBTS_SHORT_RFD_GT_XA() == null) ? 0 : getOUR_DOUBTS_SHORT_RFD_GT_XA().hashCode());
        result = prime * result + ((getOUR_DOUBTS_SHORT_PAY_GT_TX() == null) ? 0 : getOUR_DOUBTS_SHORT_PAY_GT_TX().hashCode());
        result = prime * result + ((getOUR_DOUBTS_SHORT_RFD_GT_TX() == null) ? 0 : getOUR_DOUBTS_SHORT_RFD_GT_TX().hashCode());
        result = prime * result + ((getOUR_DOUBTS_SHORT_PAY_GT_HX() == null) ? 0 : getOUR_DOUBTS_SHORT_PAY_GT_HX().hashCode());
        result = prime * result + ((getOUR_DOUBTS_SHORT_RFD_GT_HX() == null) ? 0 : getOUR_DOUBTS_SHORT_RFD_GT_HX().hashCode());
        result = prime * result + ((getOUR_DOUBTS_SHORT_PAY_GT_RX() == null) ? 0 : getOUR_DOUBTS_SHORT_PAY_GT_RX().hashCode());
        result = prime * result + ((getOUR_DOUBTS_SHORT_RFD_GT_RX() == null) ? 0 : getOUR_DOUBTS_SHORT_RFD_GT_RX().hashCode());
        result = prime * result + ((getOUR_DOUBTS_SHORT_PAY_GT_BA() == null) ? 0 : getOUR_DOUBTS_SHORT_PAY_GT_BA().hashCode());
        result = prime * result + ((getOUR_DOUBTS_SHORT_RFD_GT_BA() == null) ? 0 : getOUR_DOUBTS_SHORT_RFD_GT_BA().hashCode());
        result = prime * result + ((getOUR_DOUBTS_SHORT_PAY_GT_GP() == null) ? 0 : getOUR_DOUBTS_SHORT_PAY_GT_GP().hashCode());
        result = prime * result + ((getOUR_DOUBTS_SHORT_RFD_GT_GP() == null) ? 0 : getOUR_DOUBTS_SHORT_RFD_GT_GP().hashCode());
        result = prime * result + ((getOUR_DOUBTS_SHORT_PAY_GT_PN() == null) ? 0 : getOUR_DOUBTS_SHORT_PAY_GT_PN().hashCode());
        result = prime * result + ((getOUR_DOUBTS_SHORT_RFD_GT_PN() == null) ? 0 : getOUR_DOUBTS_SHORT_RFD_GT_PN().hashCode());
        result = prime * result + ((getOUR_DOUBTS_SHORT_PAY_AMT() == null) ? 0 : getOUR_DOUBTS_SHORT_PAY_AMT().hashCode());
        result = prime * result + ((getOUR_DOUBTS_SHORT_PAY_COUNT() == null) ? 0 : getOUR_DOUBTS_SHORT_PAY_COUNT().hashCode());
        result = prime * result + ((getOUR_DOUBTS_SHORT_RFD_AMT() == null) ? 0 : getOUR_DOUBTS_SHORT_RFD_AMT().hashCode());
        result = prime * result + ((getOUR_DOUBTS_SHORT_RFD_COUNT() == null) ? 0 : getOUR_DOUBTS_SHORT_RFD_COUNT().hashCode());
        result = prime * result + ((getOUR_FLAT_PAY_C_AMT() == null) ? 0 : getOUR_FLAT_PAY_C_AMT().hashCode());
        result = prime * result + ((getOUR_FLAT_RFD_C_AMT() == null) ? 0 : getOUR_FLAT_RFD_C_AMT().hashCode());
        result = prime * result + ((getOUR_FLAT_PAY_GI() == null) ? 0 : getOUR_FLAT_PAY_GI().hashCode());
        result = prime * result + ((getOUR_FLAT_RFD_GI() == null) ? 0 : getOUR_FLAT_RFD_GI().hashCode());
        result = prime * result + ((getOUR_FLAT_PAY_GU() == null) ? 0 : getOUR_FLAT_PAY_GU().hashCode());
        result = prime * result + ((getOUR_FLAT_RFD_GU() == null) ? 0 : getOUR_FLAT_RFD_GU().hashCode());
        result = prime * result + ((getOUR_FLAT_PAY_GT_XA() == null) ? 0 : getOUR_FLAT_PAY_GT_XA().hashCode());
        result = prime * result + ((getOUR_FLAT_RFD_GT_XA() == null) ? 0 : getOUR_FLAT_RFD_GT_XA().hashCode());
        result = prime * result + ((getOUR_FLAT_PAY_GT_TX() == null) ? 0 : getOUR_FLAT_PAY_GT_TX().hashCode());
        result = prime * result + ((getOUR_FLAT_RFD_GT_TX() == null) ? 0 : getOUR_FLAT_RFD_GT_TX().hashCode());
        result = prime * result + ((getOUR_FLAT_PAY_GT_HX() == null) ? 0 : getOUR_FLAT_PAY_GT_HX().hashCode());
        result = prime * result + ((getOUR_FLAT_RFD_GT_HX() == null) ? 0 : getOUR_FLAT_RFD_GT_HX().hashCode());
        result = prime * result + ((getOUR_FLAT_PAY_GT_RX() == null) ? 0 : getOUR_FLAT_PAY_GT_RX().hashCode());
        result = prime * result + ((getOUR_FLAT_RFD_GT_RX() == null) ? 0 : getOUR_FLAT_RFD_GT_RX().hashCode());
        result = prime * result + ((getOUR_FLAT_PAY_GT_BA() == null) ? 0 : getOUR_FLAT_PAY_GT_BA().hashCode());
        result = prime * result + ((getOUR_FLAT_RFD_GT_BA() == null) ? 0 : getOUR_FLAT_RFD_GT_BA().hashCode());
        result = prime * result + ((getOUR_FLAT_PAY_GT_GP() == null) ? 0 : getOUR_FLAT_PAY_GT_GP().hashCode());
        result = prime * result + ((getOUR_FLAT_RFD_GT_GP() == null) ? 0 : getOUR_FLAT_RFD_GT_GP().hashCode());
        result = prime * result + ((getOUR_FLAT_PAY_GT_PN() == null) ? 0 : getOUR_FLAT_PAY_GT_PN().hashCode());
        result = prime * result + ((getOUR_FLAT_RFD_GT_PN() == null) ? 0 : getOUR_FLAT_RFD_GT_PN().hashCode());
        result = prime * result + ((getOUR_FLAT_PAY_AMT() == null) ? 0 : getOUR_FLAT_PAY_AMT().hashCode());
        result = prime * result + ((getOUR_FLAT_PAY_COUNT() == null) ? 0 : getOUR_FLAT_PAY_COUNT().hashCode());
        result = prime * result + ((getOUR_FLAT_RFD_AMT() == null) ? 0 : getOUR_FLAT_RFD_AMT().hashCode());
        result = prime * result + ((getOUR_FLAT_RFD_COUNT() == null) ? 0 : getOUR_FLAT_RFD_COUNT().hashCode());
        result = prime * result + ((getOUR_NO_FLAT_PAY_C_AMT() == null) ? 0 : getOUR_NO_FLAT_PAY_C_AMT().hashCode());
        result = prime * result + ((getOUR_NO_FLAT_RFD_C_AMT() == null) ? 0 : getOUR_NO_FLAT_RFD_C_AMT().hashCode());
        result = prime * result + ((getOUR_NO_FLAT_PAY_GI() == null) ? 0 : getOUR_NO_FLAT_PAY_GI().hashCode());
        result = prime * result + ((getOUR_NO_FLAT_RFD_GI() == null) ? 0 : getOUR_NO_FLAT_RFD_GI().hashCode());
        result = prime * result + ((getOUR_NO_FLAT_PAY_GU() == null) ? 0 : getOUR_NO_FLAT_PAY_GU().hashCode());
        result = prime * result + ((getOUR_NO_FLAT_RFD_GU() == null) ? 0 : getOUR_NO_FLAT_RFD_GU().hashCode());
        result = prime * result + ((getOUR_NO_FLAT_PAY_GT_XA() == null) ? 0 : getOUR_NO_FLAT_PAY_GT_XA().hashCode());
        result = prime * result + ((getOUR_NO_FLAT_RFD_GT_XA() == null) ? 0 : getOUR_NO_FLAT_RFD_GT_XA().hashCode());
        result = prime * result + ((getOUR_NO_FLAT_PAY_GT_TX() == null) ? 0 : getOUR_NO_FLAT_PAY_GT_TX().hashCode());
        result = prime * result + ((getOUR_NO_FLAT_RFD_GT_TX() == null) ? 0 : getOUR_NO_FLAT_RFD_GT_TX().hashCode());
        result = prime * result + ((getOUR_NO_FLAT_PAY_GT_HX() == null) ? 0 : getOUR_NO_FLAT_PAY_GT_HX().hashCode());
        result = prime * result + ((getOUR_NO_FLAT_RFD_GT_HX() == null) ? 0 : getOUR_NO_FLAT_RFD_GT_HX().hashCode());
        result = prime * result + ((getOUR_NO_FLAT_PAY_GT_RX() == null) ? 0 : getOUR_NO_FLAT_PAY_GT_RX().hashCode());
        result = prime * result + ((getOUR_NO_FLAT_RFD_GT_RX() == null) ? 0 : getOUR_NO_FLAT_RFD_GT_RX().hashCode());
        result = prime * result + ((getOUR_NO_FLAT_PAY_GT_BA() == null) ? 0 : getOUR_NO_FLAT_PAY_GT_BA().hashCode());
        result = prime * result + ((getOUR_NO_FLAT_RFD_GT_BA() == null) ? 0 : getOUR_NO_FLAT_RFD_GT_BA().hashCode());
        result = prime * result + ((getOUR_NO_FLAT_PAY_GT_GP() == null) ? 0 : getOUR_NO_FLAT_PAY_GT_GP().hashCode());
        result = prime * result + ((getOUR_NO_FLAT_RFD_GT_GP() == null) ? 0 : getOUR_NO_FLAT_RFD_GT_GP().hashCode());
        result = prime * result + ((getOUR_NO_FLAT_PAY_GT_PN() == null) ? 0 : getOUR_NO_FLAT_PAY_GT_PN().hashCode());
        result = prime * result + ((getOUR_NO_FLAT_RFD_GT_PN() == null) ? 0 : getOUR_NO_FLAT_RFD_GT_PN().hashCode());
        result = prime * result + ((getOUR_NO_FLAT_PAY_AMT() == null) ? 0 : getOUR_NO_FLAT_PAY_AMT().hashCode());
        result = prime * result + ((getOUR_NO_FLAT_PAY_COUNT() == null) ? 0 : getOUR_NO_FLAT_PAY_COUNT().hashCode());
        result = prime * result + ((getOUR_NO_FLAT_RFD_AMT() == null) ? 0 : getOUR_NO_FLAT_RFD_AMT().hashCode());
        result = prime * result + ((getOUR_NO_FLAT_RFD_COUNT() == null) ? 0 : getOUR_NO_FLAT_RFD_COUNT().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_FLAT_PAY_C_AMT() == null) ? 0 : getDOUBTS_SHORT_FLAT_PAY_C_AMT().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_FLAT_RFD_C_AMT() == null) ? 0 : getDOUBTS_SHORT_FLAT_RFD_C_AMT().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_FLAT_PAY_GI() == null) ? 0 : getDOUBTS_SHORT_FLAT_PAY_GI().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_FLAT_RFD_GI() == null) ? 0 : getDOUBTS_SHORT_FLAT_RFD_GI().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_FLAT_PAY_GU() == null) ? 0 : getDOUBTS_SHORT_FLAT_PAY_GU().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_FLAT_RFD_GU() == null) ? 0 : getDOUBTS_SHORT_FLAT_RFD_GU().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_FLAT_PAY_GT_XA() == null) ? 0 : getDOUBTS_SHORT_FLAT_PAY_GT_XA().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_FLAT_RFD_GT_XA() == null) ? 0 : getDOUBTS_SHORT_FLAT_RFD_GT_XA().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_FLAT_PAY_GT_TX() == null) ? 0 : getDOUBTS_SHORT_FLAT_PAY_GT_TX().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_FLAT_RFD_GT_TX() == null) ? 0 : getDOUBTS_SHORT_FLAT_RFD_GT_TX().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_FLAT_PAY_GT_HX() == null) ? 0 : getDOUBTS_SHORT_FLAT_PAY_GT_HX().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_FLAT_RFD_GT_HX() == null) ? 0 : getDOUBTS_SHORT_FLAT_RFD_GT_HX().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_FLAT_PAY_GT_RX() == null) ? 0 : getDOUBTS_SHORT_FLAT_PAY_GT_RX().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_FLAT_RFD_GT_RX() == null) ? 0 : getDOUBTS_SHORT_FLAT_RFD_GT_RX().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_FLAT_PAY_GT_BA() == null) ? 0 : getDOUBTS_SHORT_FLAT_PAY_GT_BA().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_FLAT_RFD_GT_BA() == null) ? 0 : getDOUBTS_SHORT_FLAT_RFD_GT_BA().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_FLAT_PAY_GT_GP() == null) ? 0 : getDOUBTS_SHORT_FLAT_PAY_GT_GP().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_FLAT_RFD_GT_GP() == null) ? 0 : getDOUBTS_SHORT_FLAT_RFD_GT_GP().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_FLAT_PAY_GT_PN() == null) ? 0 : getDOUBTS_SHORT_FLAT_PAY_GT_PN().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_FLAT_RFD_GT_PN() == null) ? 0 : getDOUBTS_SHORT_FLAT_RFD_GT_PN().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_FLAT_PAY_AMT() == null) ? 0 : getDOUBTS_SHORT_FLAT_PAY_AMT().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_FLAT_PAY_COUNT() == null) ? 0 : getDOUBTS_SHORT_FLAT_PAY_COUNT().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_FLAT_RFD_AMT() == null) ? 0 : getDOUBTS_SHORT_FLAT_RFD_AMT().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_FLAT_RFD_COUNT() == null) ? 0 : getDOUBTS_SHORT_FLAT_RFD_COUNT().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_NO_FLAT_PAY_C_AMT() == null) ? 0 : getDOUBTS_SHORT_NO_FLAT_PAY_C_AMT().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_NO_FLAT_RFD_C_AMT() == null) ? 0 : getDOUBTS_SHORT_NO_FLAT_RFD_C_AMT().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_NO_FLAT_PAY_GI() == null) ? 0 : getDOUBTS_SHORT_NO_FLAT_PAY_GI().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_NO_FLAT_RFD_GI() == null) ? 0 : getDOUBTS_SHORT_NO_FLAT_RFD_GI().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_NO_FLAT_PAY_GU() == null) ? 0 : getDOUBTS_SHORT_NO_FLAT_PAY_GU().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_NO_FLAT_RFD_GU() == null) ? 0 : getDOUBTS_SHORT_NO_FLAT_RFD_GU().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_NO_FLAT_PAY_GT_XA() == null) ? 0 : getDOUBTS_SHORT_NO_FLAT_PAY_GT_XA().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_NO_FLAT_RFD_GT_XA() == null) ? 0 : getDOUBTS_SHORT_NO_FLAT_RFD_GT_XA().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_NO_FLAT_PAY_GT_TX() == null) ? 0 : getDOUBTS_SHORT_NO_FLAT_PAY_GT_TX().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_NO_FLAT_RFD_GT_TX() == null) ? 0 : getDOUBTS_SHORT_NO_FLAT_RFD_GT_TX().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_NO_FLAT_PAY_GT_HX() == null) ? 0 : getDOUBTS_SHORT_NO_FLAT_PAY_GT_HX().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_NO_FLAT_RFD_GT_HX() == null) ? 0 : getDOUBTS_SHORT_NO_FLAT_RFD_GT_HX().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_NO_FLAT_PAY_GT_RX() == null) ? 0 : getDOUBTS_SHORT_NO_FLAT_PAY_GT_RX().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_NO_FLAT_RFD_GT_RX() == null) ? 0 : getDOUBTS_SHORT_NO_FLAT_RFD_GT_RX().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_NO_FLAT_PAY_GT_BA() == null) ? 0 : getDOUBTS_SHORT_NO_FLAT_PAY_GT_BA().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_NO_FLAT_RFD_GT_BA() == null) ? 0 : getDOUBTS_SHORT_NO_FLAT_RFD_GT_BA().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_NO_FLAT_PAY_GT_GP() == null) ? 0 : getDOUBTS_SHORT_NO_FLAT_PAY_GT_GP().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_NO_FLAT_RFD_GT_GP() == null) ? 0 : getDOUBTS_SHORT_NO_FLAT_RFD_GT_GP().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_NO_FLAT_PAY_GT_PN() == null) ? 0 : getDOUBTS_SHORT_NO_FLAT_PAY_GT_PN().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_NO_FLAT_RFD_GT_PN() == null) ? 0 : getDOUBTS_SHORT_NO_FLAT_RFD_GT_PN().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_NO_FLAT_PAY_AMT() == null) ? 0 : getDOUBTS_SHORT_NO_FLAT_PAY_AMT().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_NO_FLAT_PAY_COUNT() == null) ? 0 : getDOUBTS_SHORT_NO_FLAT_PAY_COUNT().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_NO_FLAT_RFD_AMT() == null) ? 0 : getDOUBTS_SHORT_NO_FLAT_RFD_AMT().hashCode());
        result = prime * result + ((getDOUBTS_SHORT_NO_FLAT_RFD_COUNT() == null) ? 0 : getDOUBTS_SHORT_NO_FLAT_RFD_COUNT().hashCode());
        result = prime * result + ((getOUR_DIFFE_SHORT_PAY_C_AMT() == null) ? 0 : getOUR_DIFFE_SHORT_PAY_C_AMT().hashCode());
        result = prime * result + ((getOUR_DIFFE_SHORT_RFD_C_AMT() == null) ? 0 : getOUR_DIFFE_SHORT_RFD_C_AMT().hashCode());
        result = prime * result + ((getOUR_DIFFE_SHORT_PAY_GI() == null) ? 0 : getOUR_DIFFE_SHORT_PAY_GI().hashCode());
        result = prime * result + ((getOUR_DIFFE_SHORT_RFD_GI() == null) ? 0 : getOUR_DIFFE_SHORT_RFD_GI().hashCode());
        result = prime * result + ((getOUR_DIFFE_SHORT_PAY_GU() == null) ? 0 : getOUR_DIFFE_SHORT_PAY_GU().hashCode());
        result = prime * result + ((getOUR_DIFFE_SHORT_RFD_GU() == null) ? 0 : getOUR_DIFFE_SHORT_RFD_GU().hashCode());
        result = prime * result + ((getOUR_DIFFE_SHORT_PAY_GT_XA() == null) ? 0 : getOUR_DIFFE_SHORT_PAY_GT_XA().hashCode());
        result = prime * result + ((getOUR_DIFFE_SHORT_RFD_GT_XA() == null) ? 0 : getOUR_DIFFE_SHORT_RFD_GT_XA().hashCode());
        result = prime * result + ((getOUR_DIFFE_SHORT_PAY_GT_TX() == null) ? 0 : getOUR_DIFFE_SHORT_PAY_GT_TX().hashCode());
        result = prime * result + ((getOUR_DIFFE_SHORT_RFD_GT_TX() == null) ? 0 : getOUR_DIFFE_SHORT_RFD_GT_TX().hashCode());
        result = prime * result + ((getOUR_DIFFE_SHORT_PAY_GT_HX() == null) ? 0 : getOUR_DIFFE_SHORT_PAY_GT_HX().hashCode());
        result = prime * result + ((getOUR_DIFFE_SHORT_RFD_GT_HX() == null) ? 0 : getOUR_DIFFE_SHORT_RFD_GT_HX().hashCode());
        result = prime * result + ((getOUR_DIFFE_SHORT_PAY_GT_RX() == null) ? 0 : getOUR_DIFFE_SHORT_PAY_GT_RX().hashCode());
        result = prime * result + ((getOUR_DIFFE_SHORT_RFD_GT_RX() == null) ? 0 : getOUR_DIFFE_SHORT_RFD_GT_RX().hashCode());
        result = prime * result + ((getOUR_DIFFE_SHORT_PAY_GT_BA() == null) ? 0 : getOUR_DIFFE_SHORT_PAY_GT_BA().hashCode());
        result = prime * result + ((getOUR_DIFFE_SHORT_RFD_GT_BA() == null) ? 0 : getOUR_DIFFE_SHORT_RFD_GT_BA().hashCode());
        result = prime * result + ((getOUR_DIFFE_SHORT_PAY_GT_GP() == null) ? 0 : getOUR_DIFFE_SHORT_PAY_GT_GP().hashCode());
        result = prime * result + ((getOUR_DIFFE_SHORT_RFD_GT_GP() == null) ? 0 : getOUR_DIFFE_SHORT_RFD_GT_GP().hashCode());
        result = prime * result + ((getOUR_DIFFE_SHORT_PAY_GT_PN() == null) ? 0 : getOUR_DIFFE_SHORT_PAY_GT_PN().hashCode());
        result = prime * result + ((getOUR_DIFFE_SHORT_RFD_GT_PN() == null) ? 0 : getOUR_DIFFE_SHORT_RFD_GT_PN().hashCode());
        result = prime * result + ((getOUR_DIFFE_SHORT_PAY_AMT() == null) ? 0 : getOUR_DIFFE_SHORT_PAY_AMT().hashCode());
        result = prime * result + ((getOUR_DIFFE_SHORT_PAY_COUNT() == null) ? 0 : getOUR_DIFFE_SHORT_PAY_COUNT().hashCode());
        result = prime * result + ((getOUR_DIFFE_SHORT_RFD_AMT() == null) ? 0 : getOUR_DIFFE_SHORT_RFD_AMT().hashCode());
        result = prime * result + ((getOUR_DIFFE_SHORT_RFD_COUNT() == null) ? 0 : getOUR_DIFFE_SHORT_RFD_COUNT().hashCode());
        result = prime * result + ((getCHAN_PAY_TOTAL_C_AMT() == null) ? 0 : getCHAN_PAY_TOTAL_C_AMT().hashCode());
        result = prime * result + ((getCHAN_RFD_TOTAL_C_AMT() == null) ? 0 : getCHAN_RFD_TOTAL_C_AMT().hashCode());
        result = prime * result + ((getCHAN_PAY_TOTAL_GI() == null) ? 0 : getCHAN_PAY_TOTAL_GI().hashCode());
        result = prime * result + ((getCHAN_RFD_TOTAL_GI() == null) ? 0 : getCHAN_RFD_TOTAL_GI().hashCode());
        result = prime * result + ((getCHAN_PAY_TOTAL_GU() == null) ? 0 : getCHAN_PAY_TOTAL_GU().hashCode());
        result = prime * result + ((getCHAN_RFD_TOTAL_GU() == null) ? 0 : getCHAN_RFD_TOTAL_GU().hashCode());
        result = prime * result + ((getCHAN_PAY_TOTAL_GT_XA() == null) ? 0 : getCHAN_PAY_TOTAL_GT_XA().hashCode());
        result = prime * result + ((getCHAN_RFD_TOTAL_GT_XA() == null) ? 0 : getCHAN_RFD_TOTAL_GT_XA().hashCode());
        result = prime * result + ((getCHAN_PAY_TOTAL_GT_TX() == null) ? 0 : getCHAN_PAY_TOTAL_GT_TX().hashCode());
        result = prime * result + ((getCHAN_RFD_TOTAL_GT_TX() == null) ? 0 : getCHAN_RFD_TOTAL_GT_TX().hashCode());
        result = prime * result + ((getCHAN_PAY_TOTAL_GT_HX() == null) ? 0 : getCHAN_PAY_TOTAL_GT_HX().hashCode());
        result = prime * result + ((getCHAN_RFD_TOTAL_GT_HX() == null) ? 0 : getCHAN_RFD_TOTAL_GT_HX().hashCode());
        result = prime * result + ((getCHAN_PAY_TOTAL_GT_RX() == null) ? 0 : getCHAN_PAY_TOTAL_GT_RX().hashCode());
        result = prime * result + ((getCHAN_RFD_TOTAL_GT_RX() == null) ? 0 : getCHAN_RFD_TOTAL_GT_RX().hashCode());
        result = prime * result + ((getCHAN_PAY_TOTAL_GT_BA() == null) ? 0 : getCHAN_PAY_TOTAL_GT_BA().hashCode());
        result = prime * result + ((getCHAN_RFD_TOTAL_GT_BA() == null) ? 0 : getCHAN_RFD_TOTAL_GT_BA().hashCode());
        result = prime * result + ((getCHAN_PAY_TOTAL_GT_GP() == null) ? 0 : getCHAN_PAY_TOTAL_GT_GP().hashCode());
        result = prime * result + ((getCHAN_RFD_TOTAL_GT_GP() == null) ? 0 : getCHAN_RFD_TOTAL_GT_GP().hashCode());
        result = prime * result + ((getCHAN_PAY_TOTAL_GT_PN() == null) ? 0 : getCHAN_PAY_TOTAL_GT_PN().hashCode());
        result = prime * result + ((getCHAN_RFD_TOTAL_GT_PN() == null) ? 0 : getCHAN_RFD_TOTAL_GT_PN().hashCode());
        result = prime * result + ((getCHAN_PAY_TOTAL_AMT() == null) ? 0 : getCHAN_PAY_TOTAL_AMT().hashCode());
        result = prime * result + ((getCHAN_PAY_TOTAL_COUNT() == null) ? 0 : getCHAN_PAY_TOTAL_COUNT().hashCode());
        result = prime * result + ((getCHAN_RFD_TOTAL_AMT() == null) ? 0 : getCHAN_RFD_TOTAL_AMT().hashCode());
        result = prime * result + ((getCHAN_RFD_TOTAL_COUNT() == null) ? 0 : getCHAN_RFD_TOTAL_COUNT().hashCode());
        result = prime * result + ((getCHAN_DOUBTS_LONG_PAY_C_AMT() == null) ? 0 : getCHAN_DOUBTS_LONG_PAY_C_AMT().hashCode());
        result = prime * result + ((getCHAN_DOUBTS_LONG_RFD_C_AMT() == null) ? 0 : getCHAN_DOUBTS_LONG_RFD_C_AMT().hashCode());
        result = prime * result + ((getCHAN_DOUBTS_LONG_PAY_GI() == null) ? 0 : getCHAN_DOUBTS_LONG_PAY_GI().hashCode());
        result = prime * result + ((getCHAN_DOUBTS_LONG_RFD_GI() == null) ? 0 : getCHAN_DOUBTS_LONG_RFD_GI().hashCode());
        result = prime * result + ((getCHAN_DOUBTS_LONG_PAY_GU() == null) ? 0 : getCHAN_DOUBTS_LONG_PAY_GU().hashCode());
        result = prime * result + ((getCHAN_DOUBTS_LONG_RFD_GU() == null) ? 0 : getCHAN_DOUBTS_LONG_RFD_GU().hashCode());
        result = prime * result + ((getCHAN_DOUBTS_LONG_PAY_GT_XA() == null) ? 0 : getCHAN_DOUBTS_LONG_PAY_GT_XA().hashCode());
        result = prime * result + ((getCHAN_DOUBTS_LONG_RFD_GT_XA() == null) ? 0 : getCHAN_DOUBTS_LONG_RFD_GT_XA().hashCode());
        result = prime * result + ((getCHAN_DOUBTS_LONG_PAY_GT_TX() == null) ? 0 : getCHAN_DOUBTS_LONG_PAY_GT_TX().hashCode());
        result = prime * result + ((getCHAN_DOUBTS_LONG_RFD_GT_TX() == null) ? 0 : getCHAN_DOUBTS_LONG_RFD_GT_TX().hashCode());
        result = prime * result + ((getCHAN_DOUBTS_LONG_PAY_GT_HX() == null) ? 0 : getCHAN_DOUBTS_LONG_PAY_GT_HX().hashCode());
        result = prime * result + ((getCHAN_DOUBTS_LONG_RFD_GT_HX() == null) ? 0 : getCHAN_DOUBTS_LONG_RFD_GT_HX().hashCode());
        result = prime * result + ((getCHAN_DOUBTS_LONG_PAY_GT_RX() == null) ? 0 : getCHAN_DOUBTS_LONG_PAY_GT_RX().hashCode());
        result = prime * result + ((getCHAN_DOUBTS_LONG_RFD_GT_RX() == null) ? 0 : getCHAN_DOUBTS_LONG_RFD_GT_RX().hashCode());
        result = prime * result + ((getCHAN_DOUBTS_LONG_PAY_GT_BA() == null) ? 0 : getCHAN_DOUBTS_LONG_PAY_GT_BA().hashCode());
        result = prime * result + ((getCHAN_DOUBTS_LONG_RFD_GT_BA() == null) ? 0 : getCHAN_DOUBTS_LONG_RFD_GT_BA().hashCode());
        result = prime * result + ((getCHAN_DOUBTS_LONG_PAY_GT_GP() == null) ? 0 : getCHAN_DOUBTS_LONG_PAY_GT_GP().hashCode());
        result = prime * result + ((getCHAN_DOUBTS_LONG_RFD_GT_GP() == null) ? 0 : getCHAN_DOUBTS_LONG_RFD_GT_GP().hashCode());
        result = prime * result + ((getCHAN_DOUBTS_LONG_PAY_GT_PN() == null) ? 0 : getCHAN_DOUBTS_LONG_PAY_GT_PN().hashCode());
        result = prime * result + ((getCHAN_DOUBTS_LONG_RFD_GT_PN() == null) ? 0 : getCHAN_DOUBTS_LONG_RFD_GT_PN().hashCode());
        result = prime * result + ((getCHAN_DOUBTS_LONG_PAY_AMT() == null) ? 0 : getCHAN_DOUBTS_LONG_PAY_AMT().hashCode());
        result = prime * result + ((getCHAN_DOUBTS_LONG_PAY_COUNT() == null) ? 0 : getCHAN_DOUBTS_LONG_PAY_COUNT().hashCode());
        result = prime * result + ((getCHAN_DOUBTS_LONG_RFD_AMT() == null) ? 0 : getCHAN_DOUBTS_LONG_RFD_AMT().hashCode());
        result = prime * result + ((getCHAN_DOUBTS_LONG_RFD_COUNT() == null) ? 0 : getCHAN_DOUBTS_LONG_RFD_COUNT().hashCode());
        result = prime * result + ((getCHAN_FLAT_PAY_C_AMT() == null) ? 0 : getCHAN_FLAT_PAY_C_AMT().hashCode());
        result = prime * result + ((getCHAN_FLAT_RFD_C_AMT() == null) ? 0 : getCHAN_FLAT_RFD_C_AMT().hashCode());
        result = prime * result + ((getCHAN_FLAT_PAY_GI() == null) ? 0 : getCHAN_FLAT_PAY_GI().hashCode());
        result = prime * result + ((getCHAN_FLAT_RFD_GI() == null) ? 0 : getCHAN_FLAT_RFD_GI().hashCode());
        result = prime * result + ((getCHAN_FLAT_PAY_GU() == null) ? 0 : getCHAN_FLAT_PAY_GU().hashCode());
        result = prime * result + ((getCHAN_FLAT_RFD_GU() == null) ? 0 : getCHAN_FLAT_RFD_GU().hashCode());
        result = prime * result + ((getCHAN_FLAT_PAY_GT_XA() == null) ? 0 : getCHAN_FLAT_PAY_GT_XA().hashCode());
        result = prime * result + ((getCHAN_FLAT_RFD_GT_XA() == null) ? 0 : getCHAN_FLAT_RFD_GT_XA().hashCode());
        result = prime * result + ((getCHAN_FLAT_PAY_GT_TX() == null) ? 0 : getCHAN_FLAT_PAY_GT_TX().hashCode());
        result = prime * result + ((getCHAN_FLAT_RFD_GT_TX() == null) ? 0 : getCHAN_FLAT_RFD_GT_TX().hashCode());
        result = prime * result + ((getCHAN_FLAT_PAY_GT_HX() == null) ? 0 : getCHAN_FLAT_PAY_GT_HX().hashCode());
        result = prime * result + ((getCHAN_FLAT_RFD_GT_HX() == null) ? 0 : getCHAN_FLAT_RFD_GT_HX().hashCode());
        result = prime * result + ((getCHAN_FLAT_PAY_GT_RX() == null) ? 0 : getCHAN_FLAT_PAY_GT_RX().hashCode());
        result = prime * result + ((getCHAN_FLAT_RFD_GT_RX() == null) ? 0 : getCHAN_FLAT_RFD_GT_RX().hashCode());
        result = prime * result + ((getCHAN_FLAT_PAY_GT_BA() == null) ? 0 : getCHAN_FLAT_PAY_GT_BA().hashCode());
        result = prime * result + ((getCHAN_FLAT_RFD_GT_BA() == null) ? 0 : getCHAN_FLAT_RFD_GT_BA().hashCode());
        result = prime * result + ((getCHAN_FLAT_PAY_GT_GP() == null) ? 0 : getCHAN_FLAT_PAY_GT_GP().hashCode());
        result = prime * result + ((getCHAN_FLAT_RFD_GT_GP() == null) ? 0 : getCHAN_FLAT_RFD_GT_GP().hashCode());
        result = prime * result + ((getCHAN_FLAT_PAY_GT_PN() == null) ? 0 : getCHAN_FLAT_PAY_GT_PN().hashCode());
        result = prime * result + ((getCHAN_FLAT_RFD_GT_PN() == null) ? 0 : getCHAN_FLAT_RFD_GT_PN().hashCode());
        result = prime * result + ((getCHAN_FLAT_PAY_AMT() == null) ? 0 : getCHAN_FLAT_PAY_AMT().hashCode());
        result = prime * result + ((getCHAN_FLAT_PAY_COUNT() == null) ? 0 : getCHAN_FLAT_PAY_COUNT().hashCode());
        result = prime * result + ((getCHAN_FLAT_RFD_AMT() == null) ? 0 : getCHAN_FLAT_RFD_AMT().hashCode());
        result = prime * result + ((getCHAN_FLAT_RFD_COUNT() == null) ? 0 : getCHAN_FLAT_RFD_COUNT().hashCode());
        result = prime * result + ((getCHAN_NO_FLAT_PAY_C_AMT() == null) ? 0 : getCHAN_NO_FLAT_PAY_C_AMT().hashCode());
        result = prime * result + ((getCHAN_NO_FLAT_RFD_C_AMT() == null) ? 0 : getCHAN_NO_FLAT_RFD_C_AMT().hashCode());
        result = prime * result + ((getCHAN_NO_FLAT_PAY_GI() == null) ? 0 : getCHAN_NO_FLAT_PAY_GI().hashCode());
        result = prime * result + ((getCHAN_NO_FLAT_RFD_GI() == null) ? 0 : getCHAN_NO_FLAT_RFD_GI().hashCode());
        result = prime * result + ((getCHAN_NO_FLAT_PAY_GU() == null) ? 0 : getCHAN_NO_FLAT_PAY_GU().hashCode());
        result = prime * result + ((getCHAN_NO_FLAT_RFD_GU() == null) ? 0 : getCHAN_NO_FLAT_RFD_GU().hashCode());
        result = prime * result + ((getCHAN_NO_FLAT_PAY_GT_XA() == null) ? 0 : getCHAN_NO_FLAT_PAY_GT_XA().hashCode());
        result = prime * result + ((getCHAN_NO_FLAT_RFD_GT_XA() == null) ? 0 : getCHAN_NO_FLAT_RFD_GT_XA().hashCode());
        result = prime * result + ((getCHAN_NO_FLAT_PAY_GT_TX() == null) ? 0 : getCHAN_NO_FLAT_PAY_GT_TX().hashCode());
        result = prime * result + ((getCHAN_NO_FLAT_RFD_GT_TX() == null) ? 0 : getCHAN_NO_FLAT_RFD_GT_TX().hashCode());
        result = prime * result + ((getCHAN_NO_FLAT_PAY_GT_HX() == null) ? 0 : getCHAN_NO_FLAT_PAY_GT_HX().hashCode());
        result = prime * result + ((getCHAN_NO_FLAT_RFD_GT_HX() == null) ? 0 : getCHAN_NO_FLAT_RFD_GT_HX().hashCode());
        result = prime * result + ((getCHAN_NO_FLAT_PAY_GT_RX() == null) ? 0 : getCHAN_NO_FLAT_PAY_GT_RX().hashCode());
        result = prime * result + ((getCHAN_NO_FLAT_RFD_GT_RX() == null) ? 0 : getCHAN_NO_FLAT_RFD_GT_RX().hashCode());
        result = prime * result + ((getCHAN_NO_FLAT_PAY_GT_BA() == null) ? 0 : getCHAN_NO_FLAT_PAY_GT_BA().hashCode());
        result = prime * result + ((getCHAN_NO_FLAT_RFD_GT_BA() == null) ? 0 : getCHAN_NO_FLAT_RFD_GT_BA().hashCode());
        result = prime * result + ((getCHAN_NO_FLAT_PAY_GT_GP() == null) ? 0 : getCHAN_NO_FLAT_PAY_GT_GP().hashCode());
        result = prime * result + ((getCHAN_NO_FLAT_RFD_GT_GP() == null) ? 0 : getCHAN_NO_FLAT_RFD_GT_GP().hashCode());
        result = prime * result + ((getCHAN_NO_FLAT_PAY_GT_PN() == null) ? 0 : getCHAN_NO_FLAT_PAY_GT_PN().hashCode());
        result = prime * result + ((getCHAN_NO_FLAT_RFD_GT_PN() == null) ? 0 : getCHAN_NO_FLAT_RFD_GT_PN().hashCode());
        result = prime * result + ((getCHAN_NO_FLAT_PAY_AMT() == null) ? 0 : getCHAN_NO_FLAT_PAY_AMT().hashCode());
        result = prime * result + ((getCHAN_NO_FLAT_PAY_COUNT() == null) ? 0 : getCHAN_NO_FLAT_PAY_COUNT().hashCode());
        result = prime * result + ((getCHAN_NO_FLAT_RFD_AMT() == null) ? 0 : getCHAN_NO_FLAT_RFD_AMT().hashCode());
        result = prime * result + ((getCHAN_NO_FLAT_RFD_COUNT() == null) ? 0 : getCHAN_NO_FLAT_RFD_COUNT().hashCode());
        result = prime * result + ((getDOUBTS_LONG_FLAT_PAY_C_AMT() == null) ? 0 : getDOUBTS_LONG_FLAT_PAY_C_AMT().hashCode());
        result = prime * result + ((getDOUBTS_LONG_FLAT_RFD_C_AMT() == null) ? 0 : getDOUBTS_LONG_FLAT_RFD_C_AMT().hashCode());
        result = prime * result + ((getDOUBTS_LONG_FLAT_PAY_GI() == null) ? 0 : getDOUBTS_LONG_FLAT_PAY_GI().hashCode());
        result = prime * result + ((getDOUBTS_LONG_FLAT_RFD_GI() == null) ? 0 : getDOUBTS_LONG_FLAT_RFD_GI().hashCode());
        result = prime * result + ((getDOUBTS_LONG_FLAT_PAY_GU() == null) ? 0 : getDOUBTS_LONG_FLAT_PAY_GU().hashCode());
        result = prime * result + ((getDOUBTS_LONG_FLAT_RFD_GU() == null) ? 0 : getDOUBTS_LONG_FLAT_RFD_GU().hashCode());
        result = prime * result + ((getDOUBTS_LONG_FLAT_PAY_GT_XA() == null) ? 0 : getDOUBTS_LONG_FLAT_PAY_GT_XA().hashCode());
        result = prime * result + ((getDOUBTS_LONG_FLAT_RFD_GT_XA() == null) ? 0 : getDOUBTS_LONG_FLAT_RFD_GT_XA().hashCode());
        result = prime * result + ((getDOUBTS_LONG_FLAT_PAY_GT_TX() == null) ? 0 : getDOUBTS_LONG_FLAT_PAY_GT_TX().hashCode());
        result = prime * result + ((getDOUBTS_LONG_FLAT_RFD_GT_TX() == null) ? 0 : getDOUBTS_LONG_FLAT_RFD_GT_TX().hashCode());
        result = prime * result + ((getDOUBTS_LONG_FLAT_PAY_GT_HX() == null) ? 0 : getDOUBTS_LONG_FLAT_PAY_GT_HX().hashCode());
        result = prime * result + ((getDOUBTS_LONG_FLAT_RFD_GT_HX() == null) ? 0 : getDOUBTS_LONG_FLAT_RFD_GT_HX().hashCode());
        result = prime * result + ((getDOUBTS_LONG_FLAT_PAY_GT_RX() == null) ? 0 : getDOUBTS_LONG_FLAT_PAY_GT_RX().hashCode());
        result = prime * result + ((getDOUBTS_LONG_FLAT_RFD_GT_RX() == null) ? 0 : getDOUBTS_LONG_FLAT_RFD_GT_RX().hashCode());
        result = prime * result + ((getDOUBTS_LONG_FLAT_PAY_GT_BA() == null) ? 0 : getDOUBTS_LONG_FLAT_PAY_GT_BA().hashCode());
        result = prime * result + ((getDOUBTS_LONG_FLAT_RFD_GT_BA() == null) ? 0 : getDOUBTS_LONG_FLAT_RFD_GT_BA().hashCode());
        result = prime * result + ((getDOUBTS_LONG_FLAT_PAY_GT_GP() == null) ? 0 : getDOUBTS_LONG_FLAT_PAY_GT_GP().hashCode());
        result = prime * result + ((getDOUBTS_LONG_FLAT_RFD_GT_GP() == null) ? 0 : getDOUBTS_LONG_FLAT_RFD_GT_GP().hashCode());
        result = prime * result + ((getDOUBTS_LONG_FLAT_PAY_GT_PN() == null) ? 0 : getDOUBTS_LONG_FLAT_PAY_GT_PN().hashCode());
        result = prime * result + ((getDOUBTS_LONG_FLAT_RFD_GT_PN() == null) ? 0 : getDOUBTS_LONG_FLAT_RFD_GT_PN().hashCode());
        result = prime * result + ((getDOUBTS_LONG_FLAT_PAY_AMT() == null) ? 0 : getDOUBTS_LONG_FLAT_PAY_AMT().hashCode());
        result = prime * result + ((getDOUBTS_LONG_FLAT_PAY_COUNT() == null) ? 0 : getDOUBTS_LONG_FLAT_PAY_COUNT().hashCode());
        result = prime * result + ((getDOUBTS_LONG_FLAT_RFD_AMT() == null) ? 0 : getDOUBTS_LONG_FLAT_RFD_AMT().hashCode());
        result = prime * result + ((getDOUBTS_LONG_FLAT_RFD_COUNT() == null) ? 0 : getDOUBTS_LONG_FLAT_RFD_COUNT().hashCode());
        result = prime * result + ((getDOUBTS_LONG_NO_FLAT_PAY_C_AMT() == null) ? 0 : getDOUBTS_LONG_NO_FLAT_PAY_C_AMT().hashCode());
        result = prime * result + ((getDOUBTS_LONG_NO_FLAT_RFD_C_AMT() == null) ? 0 : getDOUBTS_LONG_NO_FLAT_RFD_C_AMT().hashCode());
        result = prime * result + ((getDOUBTS_LONG_NO_FLAT_PAY_GI() == null) ? 0 : getDOUBTS_LONG_NO_FLAT_PAY_GI().hashCode());
        result = prime * result + ((getDOUBTS_LONG_NO_FLAT_RFD_GI() == null) ? 0 : getDOUBTS_LONG_NO_FLAT_RFD_GI().hashCode());
        result = prime * result + ((getDOUBTS_LONG_NO_FLAT_PAY_GU() == null) ? 0 : getDOUBTS_LONG_NO_FLAT_PAY_GU().hashCode());
        result = prime * result + ((getDOUBTS_LONG_NO_FLAT_RFD_GU() == null) ? 0 : getDOUBTS_LONG_NO_FLAT_RFD_GU().hashCode());
        result = prime * result + ((getDOUBTS_LONG_NO_FLAT_PAY_GT_XA() == null) ? 0 : getDOUBTS_LONG_NO_FLAT_PAY_GT_XA().hashCode());
        result = prime * result + ((getDOUBTS_LONG_NO_FLAT_RFD_GT_XA() == null) ? 0 : getDOUBTS_LONG_NO_FLAT_RFD_GT_XA().hashCode());
        result = prime * result + ((getDOUBTS_LONG_NO_FLAT_PAY_GT_TX() == null) ? 0 : getDOUBTS_LONG_NO_FLAT_PAY_GT_TX().hashCode());
        result = prime * result + ((getDOUBTS_LONG_NO_FLAT_RFD_GT_TX() == null) ? 0 : getDOUBTS_LONG_NO_FLAT_RFD_GT_TX().hashCode());
        result = prime * result + ((getDOUBTS_LONG_NO_FLAT_PAY_GT_HX() == null) ? 0 : getDOUBTS_LONG_NO_FLAT_PAY_GT_HX().hashCode());
        result = prime * result + ((getDOUBTS_LONG_NO_FLAT_RFD_GT_HX() == null) ? 0 : getDOUBTS_LONG_NO_FLAT_RFD_GT_HX().hashCode());
        result = prime * result + ((getDOUBTS_LONG_NO_FLAT_PAY_GT_RX() == null) ? 0 : getDOUBTS_LONG_NO_FLAT_PAY_GT_RX().hashCode());
        result = prime * result + ((getDOUBTS_LONG_NO_FLAT_RFD_GT_RX() == null) ? 0 : getDOUBTS_LONG_NO_FLAT_RFD_GT_RX().hashCode());
        result = prime * result + ((getDOUBTS_LONG_NO_FLAT_PAY_GT_BA() == null) ? 0 : getDOUBTS_LONG_NO_FLAT_PAY_GT_BA().hashCode());
        result = prime * result + ((getDOUBTS_LONG_NO_FLAT_RFD_GT_BA() == null) ? 0 : getDOUBTS_LONG_NO_FLAT_RFD_GT_BA().hashCode());
        result = prime * result + ((getDOUBTS_LONG_NO_FLAT_PAY_GT_GP() == null) ? 0 : getDOUBTS_LONG_NO_FLAT_PAY_GT_GP().hashCode());
        result = prime * result + ((getDOUBTS_LONG_NO_FLAT_RFD_GT_GP() == null) ? 0 : getDOUBTS_LONG_NO_FLAT_RFD_GT_GP().hashCode());
        result = prime * result + ((getDOUBTS_LONG_NO_FLAT_PAY_GT_PN() == null) ? 0 : getDOUBTS_LONG_NO_FLAT_PAY_GT_PN().hashCode());
        result = prime * result + ((getDOUBTS_LONG_NO_FLAT_RFD_GT_PN() == null) ? 0 : getDOUBTS_LONG_NO_FLAT_RFD_GT_PN().hashCode());
        result = prime * result + ((getDOUBTS_LONG_NO_FLAT_PAY_AMT() == null) ? 0 : getDOUBTS_LONG_NO_FLAT_PAY_AMT().hashCode());
        result = prime * result + ((getDOUBTS_LONG_NO_FLAT_PAY_COUNT() == null) ? 0 : getDOUBTS_LONG_NO_FLAT_PAY_COUNT().hashCode());
        result = prime * result + ((getDOUBTS_LONG_NO_FLAT_RFD_AMT() == null) ? 0 : getDOUBTS_LONG_NO_FLAT_RFD_AMT().hashCode());
        result = prime * result + ((getDOUBTS_LONG_NO_FLAT_RFD_COUNT() == null) ? 0 : getDOUBTS_LONG_NO_FLAT_RFD_COUNT().hashCode());
        result = prime * result + ((getCHAN_DIFFE_LONG_PAY_C_AMT() == null) ? 0 : getCHAN_DIFFE_LONG_PAY_C_AMT().hashCode());
        result = prime * result + ((getCHAN_DIFFE_LONG_RFD_C_AMT() == null) ? 0 : getCHAN_DIFFE_LONG_RFD_C_AMT().hashCode());
        result = prime * result + ((getCHAN_DIFFE_LONG_PAY_GI() == null) ? 0 : getCHAN_DIFFE_LONG_PAY_GI().hashCode());
        result = prime * result + ((getCHAN_DIFFE_LONG_RFD_GI() == null) ? 0 : getCHAN_DIFFE_LONG_RFD_GI().hashCode());
        result = prime * result + ((getCHAN_DIFFE_LONG_PAY_GU() == null) ? 0 : getCHAN_DIFFE_LONG_PAY_GU().hashCode());
        result = prime * result + ((getCHAN_DIFFE_LONG_RFD_GU() == null) ? 0 : getCHAN_DIFFE_LONG_RFD_GU().hashCode());
        result = prime * result + ((getCHAN_DIFFE_LONG_PAY_GT_XA() == null) ? 0 : getCHAN_DIFFE_LONG_PAY_GT_XA().hashCode());
        result = prime * result + ((getCHAN_DIFFE_LONG_RFD_GT_XA() == null) ? 0 : getCHAN_DIFFE_LONG_RFD_GT_XA().hashCode());
        result = prime * result + ((getCHAN_DIFFE_LONG_PAY_GT_TX() == null) ? 0 : getCHAN_DIFFE_LONG_PAY_GT_TX().hashCode());
        result = prime * result + ((getCHAN_DIFFE_LONG_RFD_GT_TX() == null) ? 0 : getCHAN_DIFFE_LONG_RFD_GT_TX().hashCode());
        result = prime * result + ((getCHAN_DIFFE_LONG_PAY_GT_HX() == null) ? 0 : getCHAN_DIFFE_LONG_PAY_GT_HX().hashCode());
        result = prime * result + ((getCHAN_DIFFE_LONG_RFD_GT_HX() == null) ? 0 : getCHAN_DIFFE_LONG_RFD_GT_HX().hashCode());
        result = prime * result + ((getCHAN_DIFFE_LONG_PAY_GT_RX() == null) ? 0 : getCHAN_DIFFE_LONG_PAY_GT_RX().hashCode());
        result = prime * result + ((getCHAN_DIFFE_LONG_RFD_GT_RX() == null) ? 0 : getCHAN_DIFFE_LONG_RFD_GT_RX().hashCode());
        result = prime * result + ((getCHAN_DIFFE_LONG_PAY_GT_BA() == null) ? 0 : getCHAN_DIFFE_LONG_PAY_GT_BA().hashCode());
        result = prime * result + ((getCHAN_DIFFE_LONG_RFD_GT_BA() == null) ? 0 : getCHAN_DIFFE_LONG_RFD_GT_BA().hashCode());
        result = prime * result + ((getCHAN_DIFFE_LONG_PAY_GT_GP() == null) ? 0 : getCHAN_DIFFE_LONG_PAY_GT_GP().hashCode());
        result = prime * result + ((getCHAN_DIFFE_LONG_RFD_GT_GP() == null) ? 0 : getCHAN_DIFFE_LONG_RFD_GT_GP().hashCode());
        result = prime * result + ((getCHAN_DIFFE_LONG_PAY_GT_PN() == null) ? 0 : getCHAN_DIFFE_LONG_PAY_GT_PN().hashCode());
        result = prime * result + ((getCHAN_DIFFE_LONG_RFD_GT_PN() == null) ? 0 : getCHAN_DIFFE_LONG_RFD_GT_PN().hashCode());
        result = prime * result + ((getCHAN_DIFFE_LONG_PAY_AMT() == null) ? 0 : getCHAN_DIFFE_LONG_PAY_AMT().hashCode());
        result = prime * result + ((getCHAN_DIFFE_LONG_PAY_COUNT() == null) ? 0 : getCHAN_DIFFE_LONG_PAY_COUNT().hashCode());
        result = prime * result + ((getCHAN_DIFFE_LONG_RFD_AMT() == null) ? 0 : getCHAN_DIFFE_LONG_RFD_AMT().hashCode());
        result = prime * result + ((getCHAN_DIFFE_LONG_RFD_COUNT() == null) ? 0 : getCHAN_DIFFE_LONG_RFD_COUNT().hashCode());
        return result;
    }
}