package br.com.anthony.application.usercases;

import br.com.anthony.application.gateways.UserGateway;
import br.com.anthony.domain.entity.User;

public class CreateUserIterator {
    final private UserGateway userGateway;

    public CreateUserIterator(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User createUser(User user) {
        return userGateway.createUser(user);
    }
}
