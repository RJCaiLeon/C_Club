package top.nanachan.oss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * oss服务启动器
 *
 * @author leon_ccc
 * @date 2024/4/23 16:10
 */
@SpringBootApplication
@ComponentScan("top.nanachan")
public class OssApplication {

    public static void main(String[] args) {
        SpringApplication.run(OssApplication.class);
    }

}
