package br.com.wandersonalmeida.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 1° qual a classe que esse repositório está representando;
 * 2° qual tipo de id que esss minha entidade vai ter
 */
public interface IUserRepository extends JpaRepository<UserModel, UUID> {
  
}
