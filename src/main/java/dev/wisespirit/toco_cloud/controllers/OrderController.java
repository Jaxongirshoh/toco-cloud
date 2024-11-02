package dev.wisespirit.toco_cloud.controllers;

import dev.wisespirit.toco_cloud.domains.Taco;
import dev.wisespirit.toco_cloud.domains.TacoOrder;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Slf4j
@Controller
@RequestMapping(value = {"/orders"})
@SessionAttributes("tacoOrder")
public class OrderController {

    @GetMapping("/current")
    public String orderForm(){
        return "orderForm";
    }     

    @PostMapping
    public String processOrder(@Valid TacoOrder tacoOrder, Errors errors,
                               SessionStatus sessionStatus) {
        if (errors.hasErrors()){
            return "orderForm";
        }
        log.info("Order submitted : {}",tacoOrder);
        return "redirect:/";
    }


}
