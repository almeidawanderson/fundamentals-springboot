package br.com.wandersonalmeida.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {

  @Id
  @GeneratedValue(generator = "UUID")
  private UUID user_id;
  
  
  private String name;
  private String username;
  private String password;

  @CreationTimestamp
  private LocalDateTime createdAt;

   
  
}
