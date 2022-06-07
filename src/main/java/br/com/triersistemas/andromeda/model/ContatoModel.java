package br.com.triersistemas.andromeda.model;

public class ContatoModel {
	
	private final long id;
	private final String content;
	
	public ContatoModel(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

}
