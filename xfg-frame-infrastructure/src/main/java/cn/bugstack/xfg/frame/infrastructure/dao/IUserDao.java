package cn.bugstack.xfg.frame.infrastructure.dao;

import cn.bugstack.xfg.frame.infrastructure.po.UserPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IUserDao {

    List<UserPO> queryUserList();

}
