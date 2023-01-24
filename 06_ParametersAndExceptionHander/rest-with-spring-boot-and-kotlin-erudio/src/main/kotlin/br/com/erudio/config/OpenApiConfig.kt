package br.com.erudio.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import org.springframework.context.annotation.Configuration

@Configuration
class OpenApiConfig {
    fun customOpenApi() : OpenAPI {

        return OpenAPI().info(
                    Info().title("RESTful API with kotlin 1.6.10 and Spring boot 3")
                        .version("v1")
                        .description("Test API")
                        .termsOfService("")
                        .license(License().name("Apache 2.0").url(""))

                )
    }

}