package com.pwc.Virtualized.Assets.virtualizedAsset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class VirtualizedAssetApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualizedAssetApplication.class, args);
	}

}
