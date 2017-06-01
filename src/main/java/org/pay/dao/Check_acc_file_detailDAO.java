package org.pay.dao;

import org.pay.entity.Check_acc_file_detail;

public interface Check_acc_file_detailDAO {
    /**
     * 根据主键删除数据库的记录
     *
     * @param ID
     */
    int deleteByPrimaryKey(String ID);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(Check_acc_file_detail record);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insertSelective(Check_acc_file_detail record);

    /**
     * 根据LOG_NO获取一条数据库记录
     *
     * @param LOG_NO
     */
    Check_acc_file_detail selectByPrimaryKey(String LOG_NO);

    /**
     * 根据主键来更新部分数据库记录
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Check_acc_file_detail record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Check_acc_file_detail record);
}