/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício.looping.pkg2;

/**
 *
 * @author Kayke
 */
public class ExercícioLooping2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float celsius;
        float fahrenheit;
    
        celsius = 10;
     

		while(celsius <= 100) {
			fahrenheit = (9 * celsius + 160) / 5;

			System.out.printf("%.2f°C = %.2f°F.\n", celsius, fahrenheit);

			celsius += 10;
		}
	}
}
    
    
  
    

