package br.com.makro.institutional.http;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class MakroCustomerController {



    @GetMapping
    public String customerPage(){

        return "customerRegistrationBR";
    }


}
