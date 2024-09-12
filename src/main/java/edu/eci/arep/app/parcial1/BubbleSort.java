package edu.eci.arep.app.parcial1;

public class BubbleSort {
     public static void main(String[] args){
        int aux;
        int[] l = {1,2,3,4,8,1,5,10};

        boolean flag = true;
        while (flag){
            int c = 0;
            for (int i = 0 ; i < l.length-1 ; i++) {
                if (l[i + 1] < l[i]) {
                    aux = l[i + 1];
                    l[i + 1] = l[i];
                    l[i] = aux;
                    c += 1;
                }
            }
            if (c == 0){
                break;
            }
        }

         for (int x = 0 ; x < l.length ; x++){
             System.out.println(l[x]);
         }
     }



    }