package aep2bimestre2;

import java.util.Date;

public class BilheteAereo {
	private Integer id;
	private Integer voo;
	private String origem;
	private String destino;
	private Date data;
	
	public BilheteAereo(Integer id, Integer voo, String origem, String destino, Date data) {
		this.voo = voo;
		this.origem = origem;
		this.destino = destino;
		this.data = data;
	}

	public Date getData() {
		return data;
	}
	public String getDestino() {
		return destino;
	}
	public String getOrigem() {
		return origem;
	}
	public Integer getVoo() {
		return voo;
	}
	public int getId() {
		return id;
	}
}
