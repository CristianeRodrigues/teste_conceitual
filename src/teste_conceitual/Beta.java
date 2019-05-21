/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_conceitual;

/**
 *
 * @author Cristiane
 */
public class Beta {
    int b;
    double bb;
    Alfa A;
    
    public void setB(int b){
        this.b = b;
        System.out.println("teste");
    }
      
      public void show(){
          A.setA(this.b);
          System.out.println(this.b);
      }
}
