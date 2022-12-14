package com.macro.ob.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.macro.ob.pojo.Orders;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
* @author 37656
* @description 针对表【orders(订单表)】的数据库操作Mapper
* @createDate 2022-09-02 15:31:23
* @Entity com.macro.ob.pojo.Orders
*/
public interface OrdersMapper extends BaseMapper<Orders> {


    /**
     * 条件查询订单表
     * @param orders
     * @return
     */
    List<Orders> selectOrderIF(Orders orders);

    /**
     * 将订单状态修改为已审核
     * @param orders
     * @return
     */
    int updateOrderPass(Orders orders);

    /**
     *将订单状态改为已驳回
     * @param orders
     * @return
     */
    int updateOrderNoPass(Orders orders);

    /**
     * 查看订单详情
     * @param orders
     * @return
     */
    List<Orders> selectOrderByOrderCode(Orders orders);

    /**
     * 复核订单查询
     * @param orders
     * @return
     */
    List<Orders> selectOrderConformIF(Orders orders);

    /**
     * 备货计划列表
     * @param orders
     * @return
     */
    List<Orders> selectOrderStockList(Orders orders);

    /**
     * 备货计划列表导出
     * @param orders
     * @return
     */
    List<Orders> selectOrderStockListExport(Orders orders);

    /**
     * 查看部分备货订单列表
     * @param
     * @return
     */
    List<Orders> selectInOrderInfo(List<Orders> orders);

}
