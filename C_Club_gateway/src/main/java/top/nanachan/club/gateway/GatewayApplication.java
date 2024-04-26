package top.nanachan.club.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 网关启动器
 *
 * @author leon_ccc
 * @date 2024/4/26 15:55
 */
@SpringBootApplication
@ComponentScan("top.nanachan")
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class);
    }

}
