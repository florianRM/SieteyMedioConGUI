package com.jacaranda.baraja;

public class BarajaInglesa extends Baraja {
	
	public BarajaInglesa() {
		super(52);
	}

	@Override
	protected String generaPalo() {
		int resultado = (int) (Math.random()*4);
		return PalosBarajaInglesa.values()[resultado].toString();
	}

	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder("Baraja Inglesa \n");
		
		for (int i=0; i < super.numCartas; i++) {
			if (super.cartas[i].getNumber() <= 10) {
				resultado.append(super.cartas[i].getNumber());
			}
			else {
				if (super.cartas[i].getNumber() == 11) {
					resultado.append("Sota");
				}
				else if (super.cartas[i].getNumber() == 12) {
					resultado.append("Reina");
				}
				else {
					resultado.append("Rey");
				}
			}
			resultado.append(" de " + super.cartas[i].getPalo() + "\n");
		}
		return resultado.toString();
	}
}
