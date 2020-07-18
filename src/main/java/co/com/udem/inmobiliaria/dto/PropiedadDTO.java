package co.com.udem.inmobiliaria.dto;

import org.springframework.beans.factory.annotation.Autowired;

public class PropiedadDTO {

	private Long id;
	private Long area;
	private int numHabitaciones;
	private int numBanos;
	private String tipoContrato;
	private Long valor;

	@Autowired
	private UsuarioDTO usuarioDTO;

	public PropiedadDTO(Long id, Long area, int numHabitaciones, int numBanos, String tipoContrato, Long valor,
			UsuarioDTO usuarioDTO) {
		super();
		this.id = id;
		this.area = area;
		this.numHabitaciones = numHabitaciones;
		this.numBanos = numBanos;
		this.tipoContrato = tipoContrato;
		this.valor = valor;
		this.usuarioDTO = usuarioDTO;
	}

	public PropiedadDTO() {
		super();
	}

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

	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}

}
