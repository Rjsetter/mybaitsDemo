package com.yq.mybatis.dao.impl;

import com.yq.mybatis.dao.UserDao;
import com.yq.mybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements UserDao {
    //创建SqlSession
    public SqlSession sqlSession;

    //析构函数
    public UserDaoImpl(SqlSession sqlSession){
        this.sqlSession = sqlSession;
    }


    public User queryUserById(int id){
        return this.sqlSession.selectOne("UserDao.queryUserById",id);
    }

    public List<User> queryUserAll(){
        return this.sqlSession.selectList("UserDao.queryUserAll");
    }

    public void insertUser(User user) {
        this.sqlSession.insert("UserDao.insertUser", user);
    }

    public void updateUser(User user) {
        this.sqlSession.update("UserDao.updateUser", user);
    }

    public void deleteUser(int id) {
        this.sqlSession.delete("UserDao.deleteUser", id);
    }

}
