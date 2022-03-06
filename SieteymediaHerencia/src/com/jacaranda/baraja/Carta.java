package com.jacaranda.baraja;
import java.util.Objects;

public class Carta {
	private int number;
	private String palo;
	
	public Carta(int number, String palo) {
		this.number = number;
		this.palo = palo;
	}
	
	public double getValor() {
		double valor = 0.5;
		if (this.number <= 7) {
			valor = this.number;
		}
		return valor;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public String getPalo() {
		return this.palo;
	}

	@Override
	public String toString() {
		String resultado = "";
		switch (this.number) {
		case 1: {
		}
		case 2: {
		}
		case 3: {
		}
		case 4: {
		}
		case 5: {
		}
		case 6: {
		}
		case 7: {
			resultado = "" + this.number;
			break;
		}
		case 8: {
			resultado = "Sota";
			break;
		}
		case 9: {
			resultado = "Caballo";
			break;
		}
		case 10: {
			resultado = "Rey";
			break;
		}
		}
		return resultado + " de " + palo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number, palo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return number == other.number && Objects.equals(palo, other.palo);
	}
	
}
