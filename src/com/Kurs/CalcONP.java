package com.Kurs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalcONP {
    private ArrayStack<Integer> stos  = new ArrayStack<>();

    public void calc(String oper){
        Integer operand1 = 0;
        Integer operand2 = 0;
        int result = 0;
        switch (oper){
            case "+":{
                operand1=stos.pop();
                operand2=stos.pop();
                result = operand1+operand2;
                stos.push(result);
                break;
            }
            case "-":{
                operand1=stos.pop();
                operand2=stos.pop();
                result = operand1-operand2;
                stos.push(result);
                break;
            }
            case "*":{
                operand1=stos.pop();
                operand2=stos.pop();
                result = operand1*operand2;
                stos.push(result);
                break;
            }
            case "/":{
                operand1=stos.pop();
                operand2=stos.pop();
                result = operand2/operand1;
                stos.push(result);
                break;
            }

        }

    }

    private void printResult(){
        System.out.println(stos.poll());
    }
    public void getOperand(){
        Scanner scanner  =new Scanner(System.in);
        String input;

        do {
            System.out.println("Podaj kolejną liczbę, lub wykonaj operację");
            input = scanner.next();
            if (estimInputNumber(input)){
                stos.push(Integer.parseInt(input));

            }else if (estimInputOper(input)){
                if (stos.isEmpty()||stos.getSize()<2){
                    System.out.println("Nie można teraz wykonac operacji");
                }else {
                    calc(input);
                }
            }else {
                System.out.println("Nieprawidłowy znak");
            }
        }while (!input.equals("."));


    }
    private boolean estimInputNumber (String input){

        Pattern number = Pattern.compile("\\d+");
        Matcher n = number.matcher(input);
        return n.matches();
    }
    private boolean estimInputOper (String input){
        Pattern operator = Pattern.compile("\\p{Punct}");
        Matcher o = operator.matcher(input);
        return o.matches();
    }
}
