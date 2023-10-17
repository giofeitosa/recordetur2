package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import java.util.List;

import connection.ConnectionMySQL;
import model.Cliente;

//create

public class ClienteDAO {
	public void save(Cliente cliente) {
		
		String sql = "INSERT INTO cliente( CPF, nome_cliente, email_cliente, "
				+ "telefone_cliente, data_nascimento)"
		+ " VALUES(?, ?, ?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			
			conn = ConnectionMySQL.createConnectionToMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, cliente.getId_cliente());

			pstm.setString(1, cliente.getCPF());
			pstm.setString(2, cliente.getNome_cliente());
			pstm.setString(3, cliente.getEmail_cliente());
			pstm.setString(4, cliente.getTelefone_cliente());
			
			
			pstm.execute();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			
			try {
			if (pstm != null) {
				pstm.close();
				
			}
			
			if (conn != null) {
				conn.close();
				
			}
			
			}catch (Exception e) {
				
				e.printStackTrace();
			}
			}
		}
	

	// read
	
	public List<Cliente> read(){
		System.out.println("read");
		List<Cliente>  clientes = new ArrayList<Cliente>();
			
			return clientes;
	
	}
	
	// update
	
	public void update(Cliente cliente) {
		System.out.println("update");
		
		
	}
	
	// delete
	
	public void delete(int id_cliente) {
		System.out.println("delete");
		
	}
	
	//redabyId
	
	/*public Cliente readById() {
		System.out.println("readID");
		
		return Cliente;
	}*/
	
	}



