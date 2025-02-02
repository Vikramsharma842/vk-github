package in.vikram.github_learning.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/m1")
    public String m1(){
        return "Hi I am Vikram Sharma";
    }

    @GetMapping("/m2")
    public String m2(){
        int x = 23;
        System.out.println(x);
        return "Hi I am Ram Sharma";
    }


}
