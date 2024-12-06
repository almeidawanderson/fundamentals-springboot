package br.com.wandersonalmeida.todolist.tasks;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="tb_tasks")
public class TaskModel {

  @Id
  @GeneratedValue(generator="UUID")
  private  UUID task_id;

  private String task_description;

  @Column(length= 50)
  private String task_title;

  private LocalDateTime task_startAt;

  private LocalDateTime task_endAt;

  private String task_priority;

  @CreationTimestamp
  private LocalDateTime task_createdAt;

  private UUID idUser;
}
