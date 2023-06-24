package cn.bugstack.xfg.frame.infrastructure.repository;

import cn.bugstack.xfg.frame.domain.user.model.valobj.UserVO;
import cn.bugstack.xfg.frame.domain.user.repository.IUserRepository;
import cn.bugstack.xfg.frame.infrastructure.dao.IUserDao;
import cn.bugstack.xfg.frame.infrastructure.po.UserPO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 小傅哥，微信：fustack
 * @description
 * @github https://github.com/fuzhengwei
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@Repository
public class UserRepository implements IUserRepository {

    @Resource
    private IUserDao userDao;

    @Override
    public List<UserVO> queryUserList() {
        List<UserVO> userInfoList = new ArrayList<>();
        List<UserPO> users = userDao.queryUserList();
        for (UserPO user : users) {
            UserVO userInfo = UserVO.builder()
                    .userId(user.getUserId())
                    .userNickname(user.getUserNickname())
                    .createTime(user.getCreateTime())
                    .build();
            userInfoList.add(userInfo);
        }
        return userInfoList;
    }

}
