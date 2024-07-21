package cn.atsuc.xfg.frame.infrastructure.dao;

import cn.atsuc.xfg.frame.infrastructure.po.UserPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IUserDao {

    List<UserPO> queryUserList();

}
