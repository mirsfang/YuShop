package com.mirsfang.state;/**
 * Created by MirsFang on 2017/5/29.
 */

/***             
 *作者：MirsFang    
 *模式：       
 *时间：2017/05/29/下午3:46  
 *备注      
 ***/

//订单状态 -1:关闭
//        0:未付款
//        1:已付款
//        2:运输中
//        3:收货成功
//        4:申请退货
//        5:拒绝退货
//        6:同意退货
//        7:退货中
//        8:退货成功
public class OrderState {
    public static final int 关闭 = -1;
    public static final int 未付款 = 0;
    public static final int 已付款 = 1;
    public static final int 运输中 = 2;
    public static final int 收货成功 = 3;
    public static final int 申请退货 = 4;
    public static final int 拒绝退货 = 5;
    public static final int 同意退货 = 6;
    public static final int 退货中 = 7;
    public static final int 退货成功 = 8;
}
