package com.Kurs;

import java.util.Arrays;
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
        //stack.toString();
        /*while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }*/

        int[] tab = {21};
        int tab2 = maxMirror(tab);

        System.out.println(tab2);

        CalcONP calcONP = new CalcONP();
        calcONP.getOperand();


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
        int[] tab = new int[n*(n+1)/2];
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                int index = (i*(i+1)/2)-i+j-1;
                tab[index]=j;
            }
        }
        return tab;
    }
    public static int[] squareUp(int n) {
        int[] tab = new int[n*n];
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n ; j++) {
                int index = (j)+(i-1)*n-1;
                if((n-j+1)<=i){
                   tab[index]=n-j+1;
                }
            }
        }
        return tab;
    }
    public int countClumps(int[] nums) {
        boolean isClump = false;
        boolean isPrevClump = false;
        int clumpCount = 0;
        for (int i = 1; i <nums.length ; i++) {
            isClump = (nums[i]==nums[i-1]);
            if(isClump&&!isPrevClump){
                clumpCount++;
            }
            isPrevClump=isClump;
        }
        return clumpCount;
    }
    public static int[] fix34(int[] nums) {
        int[] newTab = new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            newTab[i]=nums[i];
        }
        int k=0;
        for (int i = 0; i <newTab.length;i++) {
            if(newTab[i]==3&&newTab[i+1]!=4){
                for (int j = k; j <newTab.length ; j++) {
                    if (newTab[j]==4){
                        newTab[j]=newTab[i+1];
                        newTab[i+1]=4;
                        k=j;
                        break;
                    }
                }
            }
        }
        return newTab;
    }
    public static int[] fix45(int[] nums) {
        int[] newTab = new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            newTab[i]=nums[i];
        }
        int exc=-1;
        int start = 0;
        for (int i = 0; i <newTab.length;i++) {
            if(newTab[i]==4&&newTab[i+1]!=5){
                for (int j = start; j <newTab.length ; j++) {
                    if (newTab[j]==5&&j!=exc){
                        newTab[j]=newTab[i+1];
                        newTab[i+1]=5;
                        exc=i+1;
                        start=j+1;
                        break;
                    }
                }
            }else if(newTab[i]==4&&newTab[i+1]==5){
                exc=i+1;
            }
        }
        return newTab;
    }
    public static int maxMirror(int[] nums) {
        int maxMirror=0;
        int prevMax = 0;
        int startIndex=0;
        int endIndex=0;
        boolean breakLoop=false;
        int loopCount=0;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = nums.length-1; j >i ; j--) {

                if(nums[i]==nums[j]){
                    startIndex=j;
                    endIndex =j;
                    maxMirror=0;
                    breakLoop=true;
                    break;
                }
            }
            if(breakLoop){
                for (int j = i; (j<=endIndex)&&(startIndex>=0) ; j++) {
                    if(nums[j]==nums[startIndex]){
                        maxMirror++;
                    }else {
                        break;
                    }
                    startIndex--;
                }
            }
            if(maxMirror>prevMax){
                prevMax=maxMirror;
            }
        }
        return prevMax;
    }
}
