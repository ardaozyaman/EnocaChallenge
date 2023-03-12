package enoca.io.demo;
/*Created by Arda Özyaman on 11/03/2023*/

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class EnocaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnocaDemoApplication.class, args);

    }



    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
