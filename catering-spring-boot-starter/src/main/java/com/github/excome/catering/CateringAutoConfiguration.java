package com.github.excome.catering;

import com.github.excome.catering.model.сook.Cooker;
import com.github.excome.catering.model.сook.SaladCooker;
import com.github.excome.catering.model.сook.SnackCooker;
import com.github.excome.catering.model.сook.SteakCooker;
import com.github.excome.catering.properties.CateringProperties;
import com.github.excome.catering.properties.factory.YamlPropertySourceFactory;
import com.github.excome.catering.service.CateringService;
import com.github.excome.catering.service.DefaultCateringService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Slf4j
@AutoConfiguration
@Import(CookersConfiguration.class)
@EnableConfigurationProperties(CateringProperties.class)
@ConditionalOnProperty(value = "catering.enabled", havingValue = "true", matchIfMissing = true)
@PropertySource(value = "classpath:catering-starter-config.yml", factory = YamlPropertySourceFactory.class)
public class CateringAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(CateringService.class)
    public CateringService cateringService(List<Cooker> cookers, CateringProperties cateringProperties) {
        log.info("Кейтеринг выехал");
        return new DefaultCateringService(cateringProperties, cookers);
    }
}
