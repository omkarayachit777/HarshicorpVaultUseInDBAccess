package com.example.VaultBasedUseInDB.vaultconfig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("db")
@Data
public class VaultConfiguration {

    private String username;
    private String password;
}
