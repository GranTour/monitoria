package main;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@RequestScoped
@ManagedBean
public class Main {
	private static final String MENSAGEM = "Mensagem";
	private String texto;
	
//	@PostConstruct
//public void init() {
//
//}
	
	public String getMensagem() {
		return MENSAGEM;
	}
	
	public void setTexto(String texto) {
		System.out.println("Entrei");
		this.texto = texto;
	}
	
	public String getTexto() {
		System.out.println(this.texto);
		return this.texto;
	}
	
	public String getTexto2() {
		return MENSAGEM + texto;
	}
	
	public String mover(){
		System.out.println("hereeeeeeeeeeeeeeeee");
		return ""; //Fica na mesma pagina
	}
	
	public String navegar() {
		return "pagina.xhtml";
	}
}

