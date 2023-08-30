package dao.impl;

import dao.IUserDao;

public class UserDaoImpl implements IUserDao {
    public UserDaoImpl() {
        System.out.println("UserDaoImpl() executed");
    }

    public void init () {
        System.out.println("init() executed");
    }
    public void destory () {
        System.out.println("destory() executed");
    }

    @Override
    public void save() {
        System.out.println("save running...");
    }
}
