package com.example.VaultBasedUseInDB;

import com.example.VaultBasedUseInDB.vaultconfig.VaultConfiguration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication
@ConfigurationProperties("db") // to access db.* value from secrets db.username, db.password
public class VaultBasedUseInDbApplication/* implements CommandLineRunner*/ {

//    private final VaultConfiguration configuration;

//    public VaultBasedUseInDbApplication(VaultConfiguration configuration) {
//        this.configuration = configuration;
//    }

    public static void main(String[] args) {
        SpringApplication.run(VaultBasedUseInDbApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("====================");
//        System.out.println("====username=======" + configuration.getUsername());
//        System.out.println("====password=======" + configuration.getPassword());
//        System.out.println("====================");
//    }
}
