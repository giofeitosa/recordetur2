package model;
import java.util.Date;

public class Cliente {

	private int id_cliente;
	private String CPF;
    private String nome_cliente;
    private String email_cliente;
    private String telefone_cliente;
    private String data_nascimento;
    

    
    public Cliente() {
	}

	public Cliente(int id_cliente, String CPF, String nome_cliente, String email_cliente, String telefone_cliente, String data_nascimento) {
        this.id_cliente = id_cliente ;
    	this.CPF = CPF;
        this.nome_cliente = nome_cliente;
        this.email_cliente = email_cliente;
        this.telefone_cliente = telefone_cliente;
        this.data_nascimento = data_nascimento;
        
    }
    
    

    public Cliente(String CPF, String nome_cliente, String email_cliente, String telefone_cliente, String data_nascimento) {
		this.CPF = CPF;
		this.nome_cliente = nome_cliente;
		this.email_cliente = email_cliente;
		this.telefone_cliente = telefone_cliente;
		this.data_nascimento = data_nascimento;
	}

	
	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public String getTelefone_cliente() {
        return telefone_cliente;
    }

    public void setTelefone_cliente(String telefone_cliente) {
        this.telefone_cliente = telefone_cliente;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

	@Override
	public String toString() {
		return "Cliente [id_cliente=" + id_cliente + ", CPF=" + CPF + ", nome_cliente=" + nome_cliente
				+ ", email_cliente=" + email_cliente + ", telefone_cliente=" + telefone_cliente + ", data_nascimento="
				+ data_nascimento + "]";
	}
    
     

}
