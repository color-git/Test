package com.bdqn.springboot131;

import com.bdqn.springboot131.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.internet.MimeMessage;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SendmailApplicationTests {
    @Autowired
    MailService mailService;
    @Test
    public void setMailService(){
        mailService.sendSimpleMail("804753276@qq.com","1428450645@qq.com","1154039492@qq.com","孬磊","" +
                "请我喝水");
    }
    @Test
    public void sendAttachFileMail(){
        mailService.sendAttachFileMail("804753276@qq.com","1428450645@qq.com",
                "测试邮件主题","测试邮件内容",new File("F:\\笔试题.docx"));
    }
    /*@Test
    public void sendMailWithImg(){
        mailService.sendMailWithImg("804753276@qq.com","1428450645@qq.com",
                "测试邮件主题（图片）",
                "<div>hello，这是一封带图片资源的邮箱"+
                "这是图片1：<div><img src='cid:p01'/></div>"+
                "这是图片2：<div><img src='cid:p02'/></div>"+
                "</div>",
                new String[]{});
    }*/

}
