package controller;

public class GameMenuController {
    public static float taxAmountCalculator(int taxRate){
        float taxAmount = 0;
        if (taxRate>0) taxAmount=(taxRate-1)*2/10 +6/10;
        else if(taxRate<0)  taxAmount=(taxRate+1)*2/10 -6/10;
        return taxAmount;
    }
}
