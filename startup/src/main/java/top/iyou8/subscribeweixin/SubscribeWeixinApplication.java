package top.iyou8.subscribeweixin;

import com.mxixm.fastboot.weixin.annotation.WxApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@WxApplication(menuAutoCreate = false)
public class SubscribeWeixinApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubscribeWeixinApplication.class, args);
    }

}
