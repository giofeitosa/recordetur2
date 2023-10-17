package crud;
import java.util.Scanner;

import dao.ClienteDAO;
import model.Cliente;

public class ClienteCRUD {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ClienteDAO clienteDAO = new ClienteDAO();
		int opcao = 0, id =0;
		
		
		do {
			
			System.out.println("\n*************Clientes************\n");
			System.out.println("\n***Selecione a opção desejada:***\n");
			System.out.println(   "1 - Inserir cliente \n" 
								+ "2 - Consultar cliente \n"
								+ "3 - Atualizar dados cadastrais \n"
								+ "4 - Deletar dados \n" 
								+ "5 - Consultar cliente por Id \n"
								+ "0 - Sair \n");
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			case 1: {
			clienteDAO.save(new Cliente(1, "1234", "Giova","giova@email", "987456321", "16/01/85" ));
				break;
			}
			case 2: {
				clienteDAO.read();
				break;
			}
			case 3: {
				clienteDAO.update(new Cliente());
				break;
			}
			case 4: {
				clienteDAO.delete(1);
				break;
			}
			case 5: {
				//clienteDAO.readById();
				break;
			}
			
			
			default: {
				
				break;
				}
			
			}	
		}while(opcao !=0);
	}
	

}
