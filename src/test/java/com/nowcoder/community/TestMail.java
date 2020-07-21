package com.nowcoder.community;

import com.nowcoder.community.util.MailClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class TestMail {

    @Autowired
    MailClient mailClient;

    @Test
    public void senderTest(){
        // 发送的标题内容不用test测试等  会被识别为垃圾邮件而出错
        mailClient.sendMail("1353975140@qq.com","问题反馈","这个问题需要解决");

    }
}
