package anotacoes;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		boolean working = true;
		Anotacoes anotacoes = new Anotacoes();
		Scanner scanner = new Scanner(System.in);
		Integer option = null;
		
		
		while (working) {
			if(option != null) option = null;
			System.out.println("Olá, escolha uma atitude a seguir.");

			System.out.println("1 Para adicionar.");
			System.out.println("2 Para excluir.");
			System.out.println("3 Para ler.");
			System.out.println("4 Para sair");

			option = readValueByUser();

			switch (option) {
			case 1:
				System.out.println("Digite seu texto");
				String item = scanner.nextLine();
				anotacoes.newItemList(item);
				break;
			case 2:
				System.out.println("Digite o index.");
				int index = scanner.nextInt();
				anotacoes.excludeItem(index);
				break;
			case 3:
				anotacoes.readAllItems();
				System.out.println("Digite qualquer tecla para sair.");
				scanner.next();
				break;
			case 4:
				System.out.println("Saindo");
				working = false;
				System.exit(0);
				
				default:
					System.out.println("Opção invalida");
			}

		}

	}

	public static int readValueByUser() {
		Scanner scanner = new Scanner(System.in);
		
		int option  = 0;
		
		try {
			 option = scanner.nextInt();
		}catch(Exception e) {
			System.out.println("Erro");
		}
		
		
		return option;
		
	}

}
