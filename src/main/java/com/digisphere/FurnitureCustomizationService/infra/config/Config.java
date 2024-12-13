package com.digisphere.FurnitureCustomizationService.infra.config;

import com.digisphere.FurnitureCustomizationService.application.directors.*;
import com.digisphere.FurnitureCustomizationService.application.useCase.IProcessOrder;
import com.digisphere.FurnitureCustomizationService.application.useCase.ProcessOrder;
import com.digisphere.FurnitureCustomizationService.infra.DAO.context.ContextDAO;
import com.digisphere.FurnitureCustomizationService.infra.DAO.context.IContextDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    // DAO context
    @Bean
    public IContextDAO contextDAO() {
        return new ContextDAO();
    }

    // use case
    @Bean
    public IProcessOrder processOrder(IContextDAO contextDAO) {
        return new ProcessOrder(contextDAO);
    }

    // directors
    @Bean
    public IDirector bookCaseDirector() {
        return new BookCaseDirector();
    }

    @Bean
    public IDirector CabinetDirector() {
        return new CabinetDirector();
    }

    @Bean
    public IDirector ChairDirector() {
        return new ChairDirector();
    }

    @Bean
    public IDirector orderDirector() {
        return new OrderDirector();
    }

    @Bean
    public IDirector tableDirector() {
        return new TableDirector();
    }
}
