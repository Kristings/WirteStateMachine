package org.demo.enums;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: HouYun
 * @Date: 2023/03/04/11:57
 * @Description:
 */
public enum OrderEvent {
    RECEIVE_USER_MESSAGE, //收到用户消息
    SEND_REQUEST,         //发送请求给其他节点
    SEND_RESPONSE,        //发送响应给其他节点
    RECEIVE_REQUEST,      //收到其他节点的请求
    RECEIVE_RESPONSE,     //收到其他节点的响应
    TIME_OUT,             //超时
    DECISION_PASS,        //达成共识
    DECISION_NOT_PASS;    //没达成共识

}

