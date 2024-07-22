package br.com.findaplayer.configuration;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {

    @Value("${api.header.name}")
    private String headerName;

    @Value("${api.header.value}")
    private String headerValue;

    @Bean
    public RequestInterceptor customInterceptor() {
        return new RequestInterceptor() {
            @Override
            public void apply(RequestTemplate requestTemplate) {
                requestTemplate.header(headerName, headerValue);
            }
        };
    }

}
