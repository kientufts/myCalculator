package net.jsf.calculator.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CalculatorController {
    public String display;

    @PostConstruct
    public void init(){
        display="";
    }

    public void addDigit(String digit){
        display = display + digit;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
