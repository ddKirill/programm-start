package com.company.task1;

public class BinarySearchJava {

 public boolean search(int[] array, int find){

     boolean result = false;

     int a = 0;
     int b = array.length -1;

     while(!result){

         if(a > b){
             break;
         }
         int midElement = b - (b - a) / 2;
         //индекс среднего элемента
         int midValue = array[midElement];
         //средний элемент
         if(midValue > find){
             b = midElement - 1;


         }else if(midValue < find){
             a = midElement + 1;
         }else {
             result = true;
         }
     }
     return result;
 }
 public boolean dumbSearch(int[] array, int find){

     for(int a : array){
         if(a == find){
             return true;
         }
     }
     return false;
 }
}

