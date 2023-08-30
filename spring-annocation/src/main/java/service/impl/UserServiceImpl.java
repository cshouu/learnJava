package service.impl;

import dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import service.IUserService;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {
//    @Autowired
//    @Qualifier("userDao")
    @Resource(name="userDao")
    private IUserDao userDao;

    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Override
    public void save() {
        System.out.println("jdbcUrl:" + jdbcUrl);
        userDao.save();
    }
}
