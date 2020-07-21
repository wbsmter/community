package com.nowcoder.community;

import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class TestUser {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void TestSelect(){
        User user = userMapper.selectById(149);
        System.out.println(user);
        User username = userMapper.selectByName("SYSTEM");
        System.out.println(username);
        User useremail = userMapper.selectByEmail("nowcoder11@sina.com");
        System.out.println(useremail);
    }

    @Test
    public void TestInsert(){
        User user = new User();
        user.setUsername("张三");
        user.setActivationCode("aa");
        user.setCreateTime(new Date());
        user.setEmail("1353975@qq.com");
        user.setHeaderUrl("http://baidu.com");
        user.setPassword("san");
        user.setSalt("at");
        user.setType(0);
        user.setStatus(0);
        userMapper.insertUser(user);
        User username = userMapper.selectByName("张三");
        System.out.println(username);
    }

    @Test
    public void TestUpdate(){
        int id = 150;
        userMapper.updateHeader(150,"http://google.com");
        userMapper.updatePassword(150,"pasw");
        userMapper.updateStatus(150,1);
        User username = userMapper.selectById(150);
        System.out.println(username);
    }
}
