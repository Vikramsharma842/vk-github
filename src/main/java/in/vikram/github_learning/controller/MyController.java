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

        int y = 5;

        String x = "Hello";
        System.out.println("Hi This is vikram Sharma");
        return "Hi I am Ram Sharma";
    }

    @GetMapping("/m3")
    public String m3(){
        System.out.println("m3() method is there");
        return "m3";
    }


}
