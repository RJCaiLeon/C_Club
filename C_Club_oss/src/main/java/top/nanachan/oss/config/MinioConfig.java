package top.nanachan.oss.config;

import io.minio.MinioClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author leon_ccc
 * @date 2024/4/23 16:08
 */
@Configuration
public class MinioConfig {

    /**
     * minioUrl
     */
    @Value("${minio.url}")
    private String url;

    /**
     * minio账户
     */
    @Value("${minio.accessKey}")
    private String accessKey;

    /**
     * minio密码
     */
    @Value("${minio.secretKey}")
    private String secretKey;

    /**
     * 构造minioClient
     */
    @Bean
    public MinioClient getMinioClient() {
        return MinioClient.builder().endpoint(url).credentials(accessKey, secretKey).build();
    }

}
