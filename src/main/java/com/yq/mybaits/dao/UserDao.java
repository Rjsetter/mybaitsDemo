package com.yq.mybaits.dao;

import com.yq.mybaits.pojo.User;

import java.util.List;

public interface UserDao {
    /**
     * 根据id查询user信息
     *
     * @param id
     * @return
     */
    public User queryUserById(int id);

    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> queryUserAll();

    /**
     * 新增用户信息
     *
     * @param user
     */
    public void insertUser(User user);

    /**
     * 更新用户信息
     *
     * @param user
     */
    public void updateUser(User user);

    /**
     * 根据id删除用户
     *
     * @param id
     */
    public void deleteUser(int id);
}
