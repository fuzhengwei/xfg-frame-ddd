package cn.atsuc.xfg.frame.infrastructure.repository;

import cn.atsuc.xfg.frame.domain.user.model.valobj.UserVO;
import cn.atsuc.xfg.frame.domain.user.repository.IUserRepository;
import cn.atsuc.xfg.frame.infrastructure.dao.IUserDao;
import cn.atsuc.xfg.frame.infrastructure.po.UserPO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

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
