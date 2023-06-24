package cn.bugstack.xfg.frame.domain.user.service.impl;

import cn.bugstack.xfg.frame.domain.user.model.valobj.UserVO;
import cn.bugstack.xfg.frame.domain.user.repository.IUserRepository;
import cn.bugstack.xfg.frame.domain.user.service.UserService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 小傅哥，微信：fustack
 * @description
 * @github https://github.com/fuzhengwei
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private IUserRepository userRepository;

    @Override
    public List<UserVO> queryUserList() {
        return null;
    }

}
