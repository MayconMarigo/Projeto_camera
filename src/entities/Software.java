package entities;

import java.util.Date;

public class Software {
	
	private Float temperatura;
	private Boolean mascara;
	private Date data;
	private Integer normal;
	private Integer anormal;
	
	public Software() {
	}
	
	public Software(Float temperatura, Boolean mascara, Date data, Integer normal, Integer anormal) {
		this.temperatura = temperatura;
		this.mascara = mascara;
		this.data = data;
		this.normal = normal;
		this.anormal = anormal;
	}

	public Float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Float temperatura) {
		this.temperatura = temperatura;
	}

	public Boolean getMascara() {
		return mascara;
	}

	public void setMascara(Boolean mascara) {
		this.mascara = mascara;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Integer getNormal() {
		return normal;
	}

	public void setNormal(Integer normal) {
		this.normal = normal;
	}

	public Integer getAnormal() {
		return anormal;
	}

	public void setAnormal(Integer anormal) {
		this.anormal = anormal;
	}

	public void checarTemperatura(float temperatura) {
		if (temperatura > 37.6) {
			anormal =+ 1;
		} else {
			normal =+ 1;
		}
	}
	
	public void checarMascara() {
		//processar imagem da camera verificando a mascara
	}
	
}
