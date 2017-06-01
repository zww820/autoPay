package org.pay.dao;

import org.pay.entity.Check_acc_info;

public interface Check_acc_infoDAO {
    /**
     * 根据主键删除数据库的记录
     *
     * @param TASK_ID
     */
    int deleteByPrimaryKey(String TASK_ID);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(Check_acc_info record);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insertSelective(Check_acc_info record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param TASK_ID
     */
    Check_acc_info selectByPrimaryKey(String TASK_ID);

    /**
     * 根据主键来更新部分数据库记录
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Check_acc_info record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Check_acc_info record);
}