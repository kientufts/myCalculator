package net.jsf.calculator.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CalculatorController {
    public String display;
    private int tmp;
    private String operation;

    @PostConstruct
    public void init(){
        display="";
    }

    public void addOperation(String operation){
        tmp = Integer.parseInt(display);
        this.operation = operation;
        display="";
    }

    public void calculate(){
        int value = Integer.parseInt(display);
        if("+".equals(operation)){
            display = (tmp + value) + "";
        } else if("-".equals(operation)) {
            display = (tmp - value) + "";
        } else if("*".equals(operation)) {
            display = (tmp * value) + "";
        } else if("/".equals(operation)) {
            display = (tmp / value) + "";
        }
    }

    public void clear(){
        display = display.substring(0, display.length()-1);
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
