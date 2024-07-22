import java.util.Scanner;  



public class App {
    
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in); 
            System.out.println("Digite um numero: "); 
            
            int numero = scanner.nextInt(); 
    
    
            if(numero > 10) {
            System.out.println("O numero é maior que 10"); 
    
        } else if(numero < 10) {
            System.out.println("O numero e menor que 10");
        } 
        else if(numero == 10) {
            System.out.println("O numero e igual a 10");
        }
        System.out.println("O numero digitado e :" + numero);
              
        } catch (Exception e) {
            System.err.println("Erro de tipo: Voce digitou uma letra ao inves de um numero. Tente novamente " );
        } finally {
            System.err.println("Fim do programa");
            
        }

        

    
} 

}