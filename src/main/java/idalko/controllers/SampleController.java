package idalko.controllers;

import idalko.balance.Balance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @RequestMapping("/check")
    public Boolean check(@RequestParam(value = "sValidation") String sValidation) {
        Balance balance = new Balance();
        boolean result = balance.checkBalancingParentheses(sValidation);
        return result;
    }
}
