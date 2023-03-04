package org.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: HouYun
 * @Date: 2023/03/04/11:55
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThreadOrderStatus {
    String status;
    String num;
}
