package com.nowcoder.community.service;

import com.nowcoder.community.entity.LoginTicket;
import com.nowcoder.community.entity.User;

import java.util.Map;

public interface UserService {

    public User findUserById(int id);

    public Map<String,Object> register(User user);

    public int activation(int userId,String code);

    public Map<String, Object> login(String username, String password, int expiredSeconds);

    public void logout(String ticket);

    public LoginTicket findLoginTicket(String ticket);

    public int updateHeader(int id,String headerUrl);
}
