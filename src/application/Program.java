package application;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o caminho da Pasta: ");
		String pathStr= input.nextLine();
		System.out.print("Digite o nome da pasta: ");
		String folderNameStr = input.nextLine();
		System.out.print("Digite o nome do arquivo de texto: ");
		String fileNameStr = input.nextLine();
		
		File targetFolder = new File(pathStr +"\\" + folderNameStr);
		targetFolder.mkdir();
		String targetFileStr = targetFolder.getPath()+"\\" + fileNameStr + ".txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
			String name; 
			System.out.println("Quando enviar uma mensagem vazia, o programa é encerrado. ");
			System.out.println("Texto:");
			do {
				
				name = input.nextLine();
				bw.write(name);
				bw.newLine();
				if (name.isEmpty())
					break;
				} 
			while (true);
			
		}catch (IOException e) {
			System.out.println("Writing error! " + e.getMessage());
			}
		
		System.out.println("Acabou o programa!");

		input.close();

	}
}
