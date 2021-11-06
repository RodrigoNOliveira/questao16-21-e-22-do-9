import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int[] entrada = new int[6];



  System.out.println("Digite 6 valores inteiros: " );
  for (int i = 0; i < entrada.length; i++){
    entrada[i] = scanner.nextInt();
   
  }



    System.out.println("Os números digitados foram: ");
    for (int entrada2 = 5; entrada2 >= 0; entrada2--){
      System.out.println(entrada[entrada2]);
    }


    scanner.close();
  }
}