package crud;
import java.util.Scanner;

import dao.ClienteDAO;
import model.Cliente;

public class ClienteCRUD {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ClienteDAO clienteDAO = new ClienteDAO();
		int opcao = 0, id_cliente =0;
		String nome_cliente, email_cliente, telefone_cliente, cpf;
		
		
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
				
				System.out.println("Digite o nome: \n");	
				nome_cliente = scanner.nextLine();
				
				
				System.out.println("Digite o e-mail: \n");			
				email_cliente = scanner.nextLine();
				
				
				System.out.println("Digite o telefone: \n");				
				telefone_cliente = scanner.nextLine();
				
				System.out.println("Digite o cpf: \n");				
				cpf = scanner.nextLine();
				
			clienteDAO.save(new Cliente( cpf, nome_cliente, email_cliente,telefone_cliente ));
				break;
			}
			
			case 2: {
				
				for (Cliente cliente : clienteDAO.read()) {
					System.out.println(cliente.toString());
				}
				
				break;
			}
			
			case 3: {
				
				System.out.println("Digite o identificador do cliente: ");	
				id_cliente = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Digite o nome: ");	
				nome_cliente = scanner.nextLine();
				
				System.out.println("Digite o e-mail: ");			
				email_cliente = scanner.nextLine();
				
				System.out.println("Digite o telefone: ");				
				telefone_cliente = scanner.nextLine();
				
				System.out.println("Digite o cpf: ");				
				cpf = scanner.nextLine();
				
				
				clienteDAO.update(new Cliente( id_cliente, cpf ,nome_cliente, email_cliente,telefone_cliente ));
				
				break;
			}
			
			case 4: {
				
				System.out.println("Digite o identificador: \n");
				id_cliente = scanner.nextInt();
				scanner.nextLine();
				
				clienteDAO.delete(id_cliente);
				break;
			}
			
			case 5: {
				System.out.println("Digite o identificador do cliente: \n");
				id_cliente = scanner.nextInt();
				scanner.nextLine();
				
				Cliente clienteById = clienteDAO.readById(id_cliente);
				System.out.println(clienteById.toString());
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
