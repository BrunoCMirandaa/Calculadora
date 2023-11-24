package com.higor;

import com.higor.calculator.*;

public class Calculator {

    private OperationStrategy operation;
    public double executeOperation(double number1, double number2, int operacaoEscolhida){
        this.escolherOperacao(operacaoEscolhida);
        return operation.execute(number1, number2);
    }

   private void escolherOperacao(int operacaoEscolhida){
       switch(operacaoEscolhida){
           case 1:
               this.operation = new SumOperation();
               break;
           case 2:
               this.operation = new SubtractOperation();
               break;
           case 3:
               this.operation = new MultiplyOperation();
               break;
           case 4:
               this.operation = new DivisionOperation();
               break;
           default:
               System.out.println("Operação inválida");
               break;
       }
   }
}
