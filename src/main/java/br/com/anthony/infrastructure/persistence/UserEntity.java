package br.com.anthony.infrastructure.persistence;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("USER")
public class UserEntity {
    @Id
    private Long id;
    private String userName;
    private String password;
    private String email;

    public UserEntity(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }
}
