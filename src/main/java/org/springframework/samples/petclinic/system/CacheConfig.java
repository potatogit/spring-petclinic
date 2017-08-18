package org.springframework.samples.petclinic.system;

import org.springframework.cache.Cache;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Cache could be disable in unit test.
 */
@Configuration
@EnableCaching
@Profile("production")
class CacheConfig {
    @Bean
    public Cache avengersCache() {
        return new ConcurrentMapCache("vets");
    }
}
