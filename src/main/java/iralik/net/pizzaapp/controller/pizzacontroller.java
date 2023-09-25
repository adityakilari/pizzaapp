package iralik.net.pizzaapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

    @PostMapping("/myorder")
    public void createOrder(){
            System.out.println("I need Small pizza");
    }
}
