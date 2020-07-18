package co.com.udem.inmobiliaria.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Propiedad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long area;
	private int numHabitaciones;
	private int numBanos;
	private String tipoContrato;
	private Long valor;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "propietario", referencedColumnName = "id")
	private Usuario usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getArea() {
		return area;
	}

	public void setArea(Long area) {
		this.area = area;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public int getNumBanos() {
		return numBanos;
	}

	public void setNumBanos(int numBanos) {
		this.numBanos = numBanos;
	}

	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public Long getValor() {
		return valor;
	}

	public void setValor(Long valor) {
		this.valor = valor;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Propiedad(Long id, Long area, int numHabitaciones, int numBanos, String tipoContrato, Long valor,
			Usuario usuario) {
		super();
		this.id = id;
		this.area = area;
		this.numHabitaciones = numHabitaciones;
		this.numBanos = numBanos;
		this.tipoContrato = tipoContrato;
		this.valor = valor;
		this.usuario = usuario;
	}

	public Propiedad() {
		super();
	}

}
