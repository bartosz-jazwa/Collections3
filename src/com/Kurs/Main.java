package com.Kurs;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int valPrev0 = 0;
        int valPrev1 = 1;
        int n=20;
        int current = 0;
        /*for (int i=0; i<n; i++){
            if(i==0){
                System.out.println(valPrev0);
            }else if (i==1){
                System.out.println(valPrev1);
            }else {
                current = valPrev0+valPrev1;
                valPrev0=valPrev1;
                valPrev1=current;
                System.out.println(current);
            }
        }*/
        Stack stack = new ArrayStack();
        for (int i = 0; i <17; i++) {
            stack.push(i);
        }
        stack.toString();
        /*while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }*/
    }
    public static boolean czyRyz(int x, int kg1, int kg5){
        return false;
    }
    public static void zamienElTab(int[] tab,int elem1, int elem2){

        if(elem1<tab.length&&elem2<tab.length){
            int temp=tab[elem1];
            tab[elem1]=tab[elem2];
            tab[elem2]=temp;

        }else {
            System.out.println("Elementy do zamiany nie odpowiadaja rozmiarowi tablicy");
        }

    }
    public static int[] zad2(int n){
        int[] tab = new int[n];
        for (int i =n-1;i>=0;i--){
            tab[n-i-1]=i;
        }
        return tab;
    }
    public static int[] zad3(int n){
        int[] tab = new int[n];
        for (int i =0;i<n;i++){
            tab[i]=i;
        }
        return tab;
    }
    public static int[] zad4(int n, int a, int b){
        Random random = new Random();
        int[] tab = new int[n];
        for (int i =0;i<n;i++){
            tab[i]=random.nextInt(b-a+1)+a;
        }
        return tab;
    }
    public static int[] zad5(int n){
        int[] tab = new int[n];
        int[] tabB = new int[n];
        int[] tabC = new int[n];
        for (int i =0;i<n;i++) {
            tab[i] = i;
            tabB[i] = i;
            tabC[i] = i;
            if (i % 2 != 0 && i >= 2) {
                tab[i] += tabB[i - 2];
            }


            if (i % 2 == 0) {
                tab[i] = tabC[i] / 2;
            }
        }

        return tab;
        }


    public static int[] zad6(int[] tab1, int[] tab2){
        int[] tab = new int[tab1.length];
        for (int i = 0; i <tab1.length; i++) {
           tab[i]=tab1[i]+tab2[i];
        }
        return tab;
    }
    public static int[] zad7(int[] tab1, int[] tab2){
        int newSize = 0;
        int[] tab;
        if(tab1.length>=tab2.length){
            newSize=tab1.length;
            tab = new int[newSize];
            for (int i = 0; i <newSize; i++) {
                if(i<tab2.length){
                    tab[i]=tab1[i]+tab2[i];
                }else {
                    tab[i]=tab1[i];
                }

            }
        }else {
            newSize = tab2.length;
            tab = new int[newSize];
            for (int i = 0; i <newSize; i++) {
                if(i<tab1.length){
                    tab[i]=tab1[i]+tab2[i];
                }else {
                    tab[i]=tab2[i];
                }

            }
        }


        return tab;
    }
    public boolean canBalance(int[] nums) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i <nums.length-1; i++) {
            sumLeft+=nums[i];
            sumRight=0;
            for (int j = i+1; j <nums.length; j++) {
                sumRight+=nums[j];
            }
            if (sumLeft==sumRight){
                return true;
            }
        }
        return false;
    }
    public int[] seriesUp(int n) {
        return null;
    }
}