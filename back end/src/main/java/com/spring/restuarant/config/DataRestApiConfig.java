package com.spring.restuarant.config;

import com.spring.restuarant.model.Category;
import com.spring.restuarant.model.Order;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class DataRestApiConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {

        HttpMethod[] preventMethod = {HttpMethod.GET , HttpMethod.DELETE , HttpMethod.POST , HttpMethod.PUT};
        config.getExposureConfiguration()
                .forDomainType(Category.class)
                .withAssociationExposure(((metdata, httpMethods) -> httpMethods.disable(preventMethod)))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(preventMethod));

        config.getExposureConfiguration()
                .forDomainType(Order.class)
                .withAssociationExposure(((metdata, httpMethods) -> httpMethods.disable(preventMethod)))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(preventMethod));

    }
}
