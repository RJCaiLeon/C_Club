package top.nanachan.subject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 刷题微服务启动类
 *
 * @author leon_ccc
 * @date 2024/4/3 11:09
 */
@SpringBootApplication  // 标识这是一个Springboot项目
@ComponentScan("top.nanachan")          // 包扫描，需要把所有Spring容器的类放到一起管理
@MapperScan("top.nanachan.**.mapper")
public class SubjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(SubjectApplication.class);
    }
}
