# ativiade-java
package EstruturaDecisao;

import java.util.Scanner;

public class se {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 System.out.print("Primeiro valor : ");
		 int valor01 = scanner.nextInt();
		 
		 if (valor01 > 1) {
			 System.out.println( valor01); } else {
				 System.out.println("programa encerrado.");
				 System.exit(0);
				 }
		 
		 System.out.print("Segundo valor : ");
		 int  valor02 = scanner.nextInt();
		 if (valor02 > 1) {
			 System.out.println( valor02); } else {
				 System.out.println("programa encerrado.");
				 System.exit(0);
				 }
		 System.out.print("Terceiro valor : ");
		 int  valor03 = scanner.nextInt();
		 if (valor03 > 1) {
			 System.out.println( valor03); } else {
				 System.out.println("programa encerrado.");
				 System.exit(0);
				 }
		 System.out.print("Quarto  valor : ");
		 int  valor04 = scanner.nextInt();
		 if (valor04 > 1) {
			 System.out.println( valor04); } else {
				 System.out.println("programa encerrado.");
				 System.exit(0);
				 }
		 System.out.print("Quinto  valor : ");
		 int  valor05 = scanner.nextInt();
		 if (valor05 > 1) {
			 System.out.println( valor05); } else {
				 System.out.println("programa encerrado.");
				 System.exit(0);
				 }
		 scanner.close();
			 }
		

	}
