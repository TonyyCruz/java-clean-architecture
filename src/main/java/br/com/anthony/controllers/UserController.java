package br.com.anthony.controllers;

import br.com.anthony.application.usercases.CreateUserIterator;
import br.com.anthony.domain.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
    private final CreateUserIterator createUserIterator;
    private final UserDtoMapper userDtoMapper;

    public UserController(CreateUserIterator createUserIterator, UserDtoMapper userDtoMapper) {
        this.createUserIterator = createUserIterator;
        this.userDtoMapper = userDtoMapper;
    }

    @PostMapping
    UserResponse create(@RequestBody UserRequest request) {
        User userBusinessObj = userDtoMapper.toUser(request);
        User user = createUserIterator.createUser(userBusinessObj);
        return userDtoMapper.toResponse(user);
    }
}
