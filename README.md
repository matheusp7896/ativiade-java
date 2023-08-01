# ativiade-java
package EstruturaDecisao;

import java.util.Scanner;

public class se01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		 System.out.print("Primeiro valor : ");
		 int valor01 = scanner.nextInt();
		 
		 if (valor01 > 0) {
			 System.out.println( valor01); } else {
				 System.out.println("programa encerrado.");
				 System.exit(0);
				 }
		 
		 System.out.print("Segundo valor : ");
		 int  valor02 = scanner.nextInt();
		 if (valor02 > 0) {
			 System.out.println( valor02); } else {
				 System.out.println("programa encerrado.");
				 System.exit(0);
				 }
		 System.out.print("Terceiro valor : ");
		 int  valor03 = scanner.nextInt();
		 if (valor03 > 0) {
			 System.out.println( valor03); } else {
				 System.out.println("programa encerrado.");
				 System.exit(0);
				 }
		 System.out.print("Quarto  valor : ");
		 int  valor04 = scanner.nextInt();
		 if (valor04 > 0) {
			 System.out.println( valor04); } else {
				 System.out.println("programa encerrado.");
				 System.exit(0);
				 }
		 System.out.print("Quinto  valor : ");
		 int  valor05 = scanner.nextInt();
		 if (valor05 > 0) {
			 System.out.println( valor05); } else {
				 System.out.println("programa encerrado.");
				 System.exit(0);
				 }
		 
		 int resultado = valor01+valor02+valor03+valor04+valor05;
		 System.out.println("A soma dos numero informados são : " + resultado);
		 scanner.close();
			 

	}
