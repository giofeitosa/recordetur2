package model;
import java.util.Date;

public class Viagem {
   private int id_viagem;
   private  String destino;
   private double preco;
   private Date data_retorno;
   private Date data_ida;
   
   

    public Viagem() {
	
}

	public Viagem(int id_viagem, String destino, Double preco, Date data_retorno, Date data_ida) {
        this.id_viagem = id_viagem;
        this.destino = destino;
        this.preco = preco;
        this.data_retorno = data_retorno;
        this.data_ida = data_ida;
    }

	
    public Viagem(String destino, double preco, Date data_retorno, Date data_ida) {
		
		this.destino = destino;
		this.preco = preco;
		this.data_retorno = data_retorno;
		this.data_ida = data_ida;
	}

	public int getId_viagem() {
        return id_viagem;
    }

    public void setId_viagem(int id_viagem) {
        this.id_viagem = id_viagem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Date getData_retorno() {
        return data_retorno;
    }

    public void setData_retorno(Date data_retorno) {
        this.data_retorno = data_retorno;
    }

    public Date getData_ida() {
        return data_ida;
    }

    public void setData_ida(Date data_ida) {
        this.data_ida = data_ida;
    }

	@Override
	public String toString() {
		return "Viagem [id_viagem=" + id_viagem + ", destino=" + destino + ", preco=" + preco + ", data_retorno="
				+ data_retorno + ", data_ida=" + data_ida + "]";
	}
    
    
}
