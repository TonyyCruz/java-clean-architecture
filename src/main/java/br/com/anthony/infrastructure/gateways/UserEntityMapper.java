package br.com.anthony.infrastructure.gateways;

import br.com.anthony.domain.entity.User;
import br.com.anthony.infrastructure.persistence.UserEntity;

public class UserEntityMapper {

    UserEntity toEntity(User userDomainObj) {
        return new UserEntity(userDomainObj.username(), userDomainObj.password(), userDomainObj.email());
    }

    User toDomainObj(UserEntity userEntity) {
        return new User(userEntity.getUserName(), userEntity.getPassword(), userEntity.getEmail());
    }
}
