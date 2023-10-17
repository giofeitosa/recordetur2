package crud;

import java.util.Scanner;


import dao.ViagemDAO;
import model.Viagem;

public class ViagemCRUD {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ViagemDAO viagemDAO = new ViagemDAO();
		int opcao = 0, id_viagem =0;
		String destino, descricao;
		double preco;
		
		
		
		
		do {
			
			System.out.println("\n*************Viagens************\n");
			System.out.println("\n***Selecione a opção desejada:***\n");
			System.out.println(   "1 - Inserir viagem \n" 
								+ "2 - Consultar viagem \n"
								+ "3 - Atualizar dados informações \n"
								+ "4 - Deletar dados \n" 
								+ "5 - Consultar viagem por Id \n"
								+ "0 - Sair \n");
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			case 1: {
				
				System.out.println("Digite o destino: \n");	
				destino = scanner.nextLine();
				
				System.out.println("Digite a descrição: \n");			
				descricao = scanner.nextLine();
				
				
				System.out.println("Digite o preço: \n");			
				preco = scanner.nextDouble();
				
				
				
				
			viagemDAO.save(new Viagem( destino, descricao, preco ));
				break;
			}
			
			case 2: {
				
				for (Viagem viagem : viagemDAO.read()) {
					System.out.println(viagem.toString());
				}
				
				break;
			}
			
			case 3: {
				
				System.out.println("Digite o identificador: ");	
				id_viagem = scanner.nextInt();
				
				
				System.out.println("Digite o destino: ");	
				destino = scanner.nextLine();
				
				System.out.println("Digite a descrição: ");	
				descricao = scanner.nextLine();
				
				System.out.println("Digite o preco: ");	
				preco = scanner.nextDouble();
				
				
				
				viagemDAO.update(new Viagem ( id_viagem, destino, descricao, preco, descricao ));
				
				break;
			}
			
			case 4: {
				
				System.out.println("Digite o identificador: \n");
				id_viagem = scanner.nextInt();
				scanner.nextLine();
				
				viagemDAO.delete(id_viagem);
				break;
			}
			
			case 5: {
				System.out.println("Digite o identificador: \n");
				id_viagem = scanner.nextInt();
				scanner.nextLine();
				
				Viagem viagemById = viagemDAO.readById(id_viagem);
				System.out.println(viagemById.toString());
				break;
			}
			
			
			default: {
				
				break;
				}
			
			}	
		}while(opcao !=0);
		scanner.close();
	}
	

}
