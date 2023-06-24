package cn.bugstack.xfg.frame.domain.user.service;

import cn.bugstack.xfg.frame.domain.user.model.valobj.UserVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 小傅哥，微信：fustack
 * @description
 * @github https://github.com/fuzhengwei
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface UserService {

    List<UserVO> queryUserList();

}
