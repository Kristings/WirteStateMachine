package org.demo.enums;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: HouYun
 * @Date: 2023/03/04/11:57
 * @Description:
 */
public enum OrderStatus {
    PROCESSING_USER_MESSAGE, //处理用户消息
    PROCESSING_REQUEST,      //处理节点请求
    PROCESSING_RESPONSE,     //处理节点响应
    WAITING,                 //等待节点响应
    TRANSACTION_SUCCESS,     //事务成功
    TRANSACTION_FAIL ;       //事务失败
}
