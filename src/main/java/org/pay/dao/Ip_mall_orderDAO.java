package org.pay.dao;

import org.pay.entity.Ip_mall_order;

public interface Ip_mall_orderDAO {
    /**
     * 根据主键删除数据库的记录
     *
     * @param orderId
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(Ip_mall_order record);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insertSelective(Ip_mall_order record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param orderId
     */
    Ip_mall_order selectByPrimaryKey(String orderId);

    /**
     * 根据主键来更新部分数据库记录
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Ip_mall_order record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Ip_mall_order record);
    
    Ip_mall_order getTopOrderID(int index);
}