package org.pay.dao;

import org.pay.entity.Ip_refund_order;

public interface Ip_refund_orderDAO {
    /**
     * 根据主键删除数据库的记录
     *
     * @param ORDER_ID
     */
    int deleteByPrimaryKey(String ORDER_ID);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(Ip_refund_order record);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insertSelective(Ip_refund_order record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param ORDER_ID
     */
    Ip_refund_order selectByPrimaryKey(String ORDER_ID);

    /**
     * 根据主键来更新部分数据库记录
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Ip_refund_order record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Ip_refund_order record);
}