package br.com.anthony.infrastructure.gateways;

import br.com.anthony.application.gateways.UserGateway;
import br.com.anthony.domain.entity.User;
import br.com.anthony.infrastructure.persistence.UserEntity;
import br.com.anthony.infrastructure.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryGateway implements UserGateway {
    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User userDomainObj) {
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
        UserEntity savedObj =  userRepository.save(userEntity);
        return userEntityMapper.toDomainObj(savedObj);
    }
}
