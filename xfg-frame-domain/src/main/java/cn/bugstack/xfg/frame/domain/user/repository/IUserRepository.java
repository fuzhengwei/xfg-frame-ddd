package cn.bugstack.xfg.frame.domain.user.repository;

import cn.bugstack.xfg.frame.domain.user.model.valobj.UserVO;

import java.util.List;

/**
 * @author 小傅哥，微信：fustack
 * @description 仓储接口
 * @github https://github.com/fuzhengwei
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface IUserRepository {

    List<UserVO> queryUserList();

}
