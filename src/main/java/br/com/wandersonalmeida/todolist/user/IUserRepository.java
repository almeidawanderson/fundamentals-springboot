package br.com.wandersonalmeida.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

// contrato dentro da nossa aplicação com metodos, porem sem a implementação dos mesmos.
public interface IUserRepository extends JpaRepository<UserModel, UUID> {
  UserModel findByUsername(String username);
}
