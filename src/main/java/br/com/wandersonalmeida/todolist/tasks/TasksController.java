package br.com.wandersonalmeida.todolist.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TasksController {

  @Autowired
  private ITasksRepository tasksRepository;

  @PostMapping("/")
  public TaskModel create(@RequestBody TaskModel taskModel) {
    System.out.println("chegou no controller");
    var tasks = this.tasksRepository.save(taskModel);
    return tasks;

  }
  
}
