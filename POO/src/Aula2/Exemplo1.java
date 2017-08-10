/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula2;

/**
 *
 * @author 10361
 */
public class Exemplo1 {

    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }
           int c = 0, a = 0, b = 1;
           System.out.print(c + ",");
       do{
           
            c = a + b;
            System.out.print(c + ",");
            b = a;
            a = c;
        }while (c <= 89);
    }
}
          
        /*
        int d = 0, e = 1;
        System.out.println(d);
        System.out.println(e);
        for (d = 1; d <= 89;) {
            System.out.println(d);
            d += e;
            e = d - e;

        }
*/

  