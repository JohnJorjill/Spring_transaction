package com.jorjill.Transaction.utils;

import com.jorjill.Transaction.exception.InsufficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {

    private static Map<String, Double> paymentMap = new HashMap<>();

    static {
        paymentMap.put("acc1",20000.0);
        paymentMap.put("acc2",10000.0);
        paymentMap.put("acc3",5000.0);
        paymentMap.put("acc4",12000.0);
    }

    public static boolean validateCreditLimit(String accNo, double paidAmount){
        if(paidAmount>paymentMap.get(accNo)){
            throw new InsufficientAmountException("Insufficient fund");
        }else{
            return true;
        }
    }

}
