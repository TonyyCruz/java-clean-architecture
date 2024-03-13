package br.com.anthony.controllers;

import br.com.anthony.domain.entity.User;

public class UserDtoMapper {

    UserResponse toResponse(User request) {
        return new UserResponse(request.username(), request.email());
    }

    User toUser(UserRequest request) {
        return new User(request.username(), request.password(), request.email());
    }
}
