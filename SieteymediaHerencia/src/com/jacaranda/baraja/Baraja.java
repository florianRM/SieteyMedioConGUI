package com.jacaranda.baraja;

public abstract class Baraja {
	protected int numCartas;
	private int siguiente;
	protected Carta[] cartas;
	
	
	public Baraja(int numCartas) {
		this.numCartas = numCartas;
		this.siguiente = 0;
	}
	
	public void barajar() {
		cartas = new Carta[numCartas];
		int i=0;
		while (i<numCartas) {
			Carta carta = new Carta(generaNumeros(), generaPalo());
			boolean encontrado = false;
			for (int j=0; j < i &&  encontrado == false; j++) {
				if (cartas[j].equals(carta)) {
					encontrado = true;
				}
			}
			if (encontrado != true) {
				cartas[i] = carta;
				i++;
			}
		}
		siguiente = 0;
	}
	
	public Carta getSiguiente() {
		Carta resultado = new Carta(cartas[siguiente].getNumber(), cartas[siguiente].getPalo());
		siguiente ++;
		return resultado;
	}
	
	protected abstract String generaPalo();
	
	private int generaNumeros() {
		return (int) (Math.random()*(this.numCartas / 4) + 1);
	}

	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder();
		for (int i=0; i < this.numCartas; i++) {
			resultado.append(cartas[i].toString() + "\n");
		}
		return resultado.toString();
	}

}
