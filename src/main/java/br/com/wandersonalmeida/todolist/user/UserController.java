package br.com.wandersonalmeida.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
  /**
   * String (texto)
   * Integer (int) numeros inteiros
   * Double (double) numeros 0.0000
   * Float (float) Números 0.0000
   * char (A C)
   * Date (data)
   * void (não tem retorno do metodo apenas uma logica sendo executada dentro do metodo)
   */
  /**
   * Os dados serão enviados do frontend or whatever 
   * interface likely insomnia-> backend -> banco de dados
   * Body ({
   *   name;
   *   username;
   *   password;
   * })
   */

  @PostMapping("/")
  public void create( @RequestBody UserModel usermodal){
    System.out.println(usermodal.getPassword());

  }
  
}
