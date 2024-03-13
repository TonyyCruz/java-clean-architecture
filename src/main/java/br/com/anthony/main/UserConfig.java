package br.com.anthony.main;

import br.com.anthony.application.gateways.UserGateway;
import br.com.anthony.application.usercases.CreateUserIterator;
import br.com.anthony.controllers.UserDtoMapper;
import br.com.anthony.infrastructure.gateways.UserEntityMapper;
import br.com.anthony.infrastructure.gateways.UserRepositoryGateway;
import br.com.anthony.infrastructure.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    CreateUserIterator createUserCase(UserGateway userGateway) {
        return new CreateUserIterator(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper() {
        return new UserEntityMapper();
    }

    @Bean
    UserDtoMapper   userDtoMapper() {
        return new UserDtoMapper();
    }
}
