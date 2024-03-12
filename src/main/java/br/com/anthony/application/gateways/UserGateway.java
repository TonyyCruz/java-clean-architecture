package br.com.anthony.application.gateways;

import br.com.anthony.domain.entity.User;

public interface UserGateway {
    User createUser(User user);
}
