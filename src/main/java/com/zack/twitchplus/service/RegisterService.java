package com.zack.twitchplus.service;
import com.zack.twitchplus.DAO.RegisterDAO;
import com.zack.twitchplus.entity.db.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public class RegisterService {
    @Autowired
    private RegisterDAO registerDao;

    public boolean register(User user) throws IOException {
        return registerDao.register(user);
    }

}
