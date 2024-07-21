package cn.atsuc.xfg.frame.domain.user.service;

import cn.atsuc.xfg.frame.domain.user.model.valobj.UserVO;

import java.util.List;

public interface UserService {

    List<UserVO> queryUserList();

}
