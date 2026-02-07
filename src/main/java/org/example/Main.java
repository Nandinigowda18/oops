package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.lang.reflect.GenericDeclaration;
import java.util.*;

public class Main {

    public static void main(String[] args) {

      Product product = new Electronics("Tv",100.0,5 , true);

      System.out.println("price of TV after Discount "+product.totaldisc());


    }

        }



