package desafios;

import java.util.Scanner;

public class sequencia_fibonacci {
	
	 private static int[] vetAux = new int[50];
	    private static int k;

	    public static long fibo(int n) {
	             k = 1; // inicializa k
	             return recursao(n);
	           }
	    static boolean busca(int numero, long []vetor) {
	    	for (int i =0;i<vetor.length;i++) {
	    		if (vetor[i] == numero) {
	    			return true;
	    		}
	    	}
	    	return false;
	    }

	    private static long recursao(int n) {
	            if (n < 0) {
	               return vetAux[0];
	          } else {
	           if (k < 3) {
	              vetAux[n] = k - 1;
	              k++;
	           } else {
	                 vetAux[n] = vetAux[n + 1] + vetAux[n + 2];
	                 }
	              return recursao(n - 1);
	           }
	    }

	    public static void main(String[] args) {
	    	Scanner leia = new Scanner (System.in);
	    	long [] vetor = new long [50];
	    for (int i = 0; i < 30; i++) {
	    	vetor [i] = sequencia_fibonacci.fibo(i);
	    }
	    System.out.println("Digite o numero: ");
	    int x = leia.nextInt();
	    System.out.println(busca(x,vetor));
}
}
	
       
  



	

