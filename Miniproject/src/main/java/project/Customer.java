package project;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//created by kuberan 02/03/2022
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer
{
	private int id;
	private String name;
	private List<DebitCard> cards;
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<DebitCard> getCards() {
		return cards;
	}
	public void setCards(List<DebitCard> cards) {
		this.cards = cards;
	}
	
}
