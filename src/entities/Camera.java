package entities;

public class Camera {

	private Float temperatura;
	private String imagem;
	
	public Camera () {
		
	}
	
	public Camera(Float temperatura, String imagem) {
		this.temperatura = temperatura;
		this.imagem = imagem;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
}
