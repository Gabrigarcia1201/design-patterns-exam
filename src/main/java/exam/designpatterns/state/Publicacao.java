package exam.designpatterns.state;

public class Publicacao {

	private State state;

	private String text;

	public Publicacao(String text) {
		this.text = text;
		state = new Rascunho(this);
	}

	public void avancar() {

	}

	public State getState() {
		return state;
	}

	public String getTexto() {
		return text;
	}

	void setTexto(String text) {
		if(this.state.editar(text))
			this.text = text;
		
		if(this.state instanceof Publicado) 
			state = new Revisao(this);
	}
}
