package iralik.net.pizzaapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pizzacontroller {

    @GetMapping("/pizzas")
    public void getPizzas(){
        System.out.println("My pizza app");
    }
    @GetMapping("/topings")
    public void getTopings(){
        System.out.println("My topping");
    }



}
