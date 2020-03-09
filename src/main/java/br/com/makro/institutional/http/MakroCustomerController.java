package br.com.makro.institutional.http;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class MakroCustomerController {


    @GetMapping
    public String customerPageStep1() {

        return "customerRegistrationBRStep1";
    }

    @GetMapping("/step2")
    public String customerPageStep2() {

        return "customerRegistrationBRStep2";
    }


    @GetMapping("/step3")
    public String customerPageStep3() {

        return "customerRegistrationBRStep3";
    }

    @GetMapping("/step4")
    public String customerPageStep4() {

        return "customerRegistrationBRStep4";
    }


}
