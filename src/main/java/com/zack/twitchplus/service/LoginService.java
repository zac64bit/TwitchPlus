package com.zack.twitchplus.service;
import com.zack.twitchplus.DAO.LoginDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public class LoginService {
    @Autowired
    private LoginDAO loginDao;

    public String verifyLogin(String userId, String password) throws IOException {
        return loginDao.verifyLogin(userId, password);
    }

}
