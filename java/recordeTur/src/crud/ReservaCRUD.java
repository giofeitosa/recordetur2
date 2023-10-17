package crud;

import java.util.Scanner;

import dao.ClienteDAO;
import dao.ReservaDAO;
import dao.ViagemDAO;
import model.Cliente;
import model.Reserva;
import model.Viagem;

public class ReservaCRUD {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ReservaDAO reservaDAO = new ReservaDAO();
		ClienteDAO clienteDAO = new ClienteDAO();
		ViagemDAO viagemDAO = new ViagemDAO();
		int opcao = 0, id_reserva = 0, id_cliente, id_viagem;
		double valor_reserva;
		String data_reserva;

		do {

			System.out.println("\n*************Reservas************\n");
			System.out.println("\n***Selecione a opção desejada:***\n");
			System.out
					.println("1 - Inserir reserva \n" + "2 - Consultar reserva \n" + "3 - Atualizar dados cadastrais \n"
							+ "4 - Deletar dados \n" + "5 - Consultar reserva por Id \n" + "0 - Sair \n");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1: {
			

				System.out.println("Digite o valor da reserva: \n");
				valor_reserva = scanner.nextDouble();

				System.out.println("Digite a data da reserva: \n");
				data_reserva = scanner.nextLine();

				System.out.println("Digite o identificador do cliente: \n");
				id_cliente = scanner.nextInt();
				scanner.nextLine();

				System.out.println("Digite o identificador da viagem: \n");
				id_viagem = scanner.nextInt();
				scanner.nextLine();

				Cliente cliente = clienteDAO.readById(id_cliente);
				Viagem viagem = viagemDAO.readById(id_viagem);

				reservaDAO.save(new Reserva(data_reserva, valor_reserva, cliente, viagem));
				break;
			}

			case 2: {

				for (Reserva reserva : reservaDAO.read()) {
					System.out.println(reserva.toString());
				}

				break;
			}

			case 3: {

				System.out.println("Digite o identificador da reserva: \n");
				id_reserva = scanner.nextInt();
				scanner.nextLine();

				System.out.println("Digite o valor da reserva: \n");
				valor_reserva = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Digite a data da reserva: \n");
				data_reserva = scanner.nextLine();

				System.out.println("Digite o identificador do cliente: \n");
				id_cliente = scanner.nextInt();
				scanner.nextLine();

				System.out.println("Digite o identificador da viagem: \n");
				id_viagem = scanner.nextInt();
				scanner.nextLine();

				Cliente cliente2 = clienteDAO.readById(id_cliente);
				Viagem viagem2 = viagemDAO.readById(id_viagem);

				reservaDAO.update(new Reserva(id_reserva, data_reserva, valor_reserva, cliente2, viagem2));

				break;
			}

			case 4: {

				System.out.println("Digite o identificador da reserva: \n");
				id_reserva = scanner.nextInt();
				scanner.nextLine();

				clienteDAO.delete(id_reserva);
				break;
			}

			case 5: {
				System.out.println("Digite o identificador da reserva: \n");
				id_reserva = scanner.nextInt();
				scanner.nextLine();

				Reserva reservaById = reservaDAO.readById(id_reserva);
				System.out.println(reservaById.toString());
				break;
			}

			default: {

				break;
			}

			}
		} while (opcao != 0);
		scanner.close();
	}

}
