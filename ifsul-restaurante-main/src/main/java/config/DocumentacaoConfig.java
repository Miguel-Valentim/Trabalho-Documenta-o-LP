package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

public class DocumentacaoConfig {
	
	@Configuration
	public class ApiDocumentationConfig {

	    @Bean
	    public OpenAPI apiDocConfig() {
	        return new OpenAPI()
	                .info(new Info()
	                        .title("If Restaurante")
	                        .description("")
	                        .version("0.0.1") //você sabe como funciona uma versão?
	                        .contact(new Contact()
	                                .name("Miguel Valentim Silva dos Santos")
	                                .email("miguelsantos.ssnfq@academico.ifsul.edu.br")))
	                .externalDocs(new ExternalDocumentation()
	                        .description("Algum link externo")
	                        .url("https:/wiki...."));
	    }
	}
}
