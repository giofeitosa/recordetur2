package model;
import java.util.Date;

public class Reserva {

    private String id_reserva;
    private Date data_reserva;
    private boolean confirma_reserva;
    private boolean cancela_reserva;
    private Double valor_reserva;
    private Cliente cliente;
    private Viagem destino;
    
    

    public Reserva() {
	}

	public Reserva(String id_reserva, Date data_reserva, boolean confirma_reserva,
                   boolean cancela_reserva, Double valor_reserva, Cliente cliente, Viagem destino) {
        this.id_reserva = id_reserva;
        this.data_reserva = data_reserva;
        this.confirma_reserva = confirma_reserva;
        this.cancela_reserva = cancela_reserva;
        this.valor_reserva = valor_reserva;
        this.cliente = cliente;
        this.destino = destino;
    }
	
	
    public Reserva(Date data_reserva, boolean confirma_reserva, boolean cancela_reserva, Double valor_reserva,
			Cliente cliente, Viagem destino) {
		super();
		this.data_reserva = data_reserva;
		this.confirma_reserva = confirma_reserva;
		this.cancela_reserva = cancela_reserva;
		this.valor_reserva = valor_reserva;
		this.cliente = cliente;
		this.destino = destino;
	}

	public String getId_reserva() {
        return id_reserva;
    }
	

    public void setId_reserva(String id_reserva) {
		this.id_reserva = id_reserva;
	}

	public Date getData_reserva() {
        return data_reserva;
    }
	
	public void setData_reserva(Date data_reserva) {
		this.data_reserva = data_reserva;
	}

    public boolean isConfirma_reserva() {
        return confirma_reserva;
    }

    public void setConfirma_reserva(boolean confirma_reserva) {
        this.confirma_reserva = confirma_reserva;
    }

    public boolean isCancela_reserva() {
        return cancela_reserva;
    }

    public void setCancela_reserva(boolean cancela_reserva) {
        this.cancela_reserva = cancela_reserva;
    }

    public Double getValor_reserva() {
        return valor_reserva;
    }

    public void setValor_reserva(Double valor_reserva) {
        this.valor_reserva = valor_reserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Viagem getDestino() {
        return destino;
    }

    public void setDestino(Viagem destino) {
        this.destino = destino;
    }

	@Override
	public String toString() {
		return "Reserva [id_reserva=" + id_reserva + ", data_reserva=" + data_reserva + ", confirma_reserva="
				+ confirma_reserva + ", cancela_reserva=" + cancela_reserva + ", valor_reserva=" + valor_reserva
				+ ", cliente=" + cliente + ", destino=" + destino + "]";
	}
    
    
}
