package org.example.mywcs.config;

import io.minio.BucketExistsArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import io.minio.SetBucketPolicyArgs;
import io.minio.errors.MinioException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.core.env.Environment;

/**
 * @Author：hb
 * @Package：org.example.mywcs.config
 * @Project：my-wcs
 * @Date：28/11/2024 4:10 pm
 */

@Configuration
@ConditionalOnProperty({"minio.endpoint"})
@ConditionalOnClass({MinioClient.class})
@ConfigurationProperties(prefix = "minio")
public class MinioConfig {

    @Autowired
    private Environment environment;

    public MinioConfig() {}
    @Bean
    public MinioClient minioClient() throws MinioException {
        String endpoint = this.environment.getProperty("minio.endpoint");
        String accessKey = this.environment.getProperty("minio.accessKey");
        String secretKey = this.environment.getProperty("minio.secretKey");
        String bucketName = this.environment.getProperty("minio.bucketName");
        if (endpoint!=null && !"".equals(endpoint)){
            if (accessKey!=null && !"".equals(accessKey)){
                if (secretKey!=null &&!"".equals(secretKey)){
                    if (bucketName!=null &&!"".equals(bucketName)){
                        MinioClient minioClient = MinioClient.builder()
                                .endpoint(endpoint)
                                .credentials(accessKey, secretKey)
                                .build();
                        this.makeBucket(minioClient, bucketName);
                        return minioClient;
                    }else {
                        throw new MinioException("存储桶名称未在application.yml配置！");
                    }
                }else{
                    throw new MinioException("Minio密码未在application.yml配置！");
                }
            }else {
                throw new MinioException("Minio用户名未在application.yml配置！");
            }
        }else {
            throw new MinioException("Minio的URL未在application.yml配置！");
        }
    }
    private void makeBucket(MinioClient minioClient, String bucketName) {
        try {
            boolean isExist=minioClient.bucketExists(BucketExistsArgs.builder().bucket(bucketName).build());
            if (!isExist) {
                minioClient.makeBucket(MakeBucketArgs.builder().bucket(bucketName).build());
                String policyJson="Bucket already exists";
                minioClient.setBucketPolicy(SetBucketPolicyArgs.builder().bucket(bucketName).config(policyJson).build());
            }
        }catch (Exception e) {
            throw new IllegalStateException(""+e);
        }
    }
}
