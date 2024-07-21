package cn.atsuc.xfg.frame.domain.user.service.impl;

import cn.atsuc.xfg.frame.domain.user.model.valobj.UserVO;
import cn.atsuc.xfg.frame.domain.user.repository.IUserRepository;
import cn.atsuc.xfg.frame.domain.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private IUserRepository userRepository;

    @Override
    public List<UserVO> queryUserList() {
        return null;
    }

}
