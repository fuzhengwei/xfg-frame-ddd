package cn.atsuc.xfg.frame.domain.user.repository;

import cn.atsuc.xfg.frame.domain.user.model.valobj.UserVO;

import java.util.List;

/**
 * @description 仓储接口
 */
public interface IUserRepository {

    List<UserVO> queryUserList();

}
