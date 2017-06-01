package org.pay.dao;

import org.pay.entity.Ip_pay_bill;

public interface Ip_pay_billDAO {
    /**
     * 根据主键删除数据库的记录
     *
     * @param logNo
     */
    int deleteByPrimaryKey(String logNo);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(Ip_pay_bill record);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insertSelective(Ip_pay_bill record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param logNo
     */
    Ip_pay_bill selectByPrimaryKey(String logNo);

    /**
     * 根据主键来更新部分数据库记录
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Ip_pay_bill record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Ip_pay_bill record);
}