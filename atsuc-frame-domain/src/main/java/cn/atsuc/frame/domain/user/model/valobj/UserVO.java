package cn.atsuc.xfg.frame.domain.user.model.valobj;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserVO {

    /** 用户名称 */
    private String userId;
    /** 用户昵称 */
    private String userNickname;
    /** 创建时间 */
    private Date createTime;

}
