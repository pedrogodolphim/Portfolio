package com.imc.imc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.Getter;
import lombok.Setter;


@RestController("/calc")
@Getter
@Setter
public class ContIMC {
    private double peso;
    private double altura;
    private double result;

    @GetMapping
    public double result(){
        return getResult();
    }
}
