package com.jacaranda.baraja;

public class BarajaEspannola extends Baraja{
	
	public BarajaEspannola() {
		super(40);
	}

	@Override
	protected String generaPalo() {
		int resultado = (int) (Math.random()*4);
		return PalosBarajaEspannola.values()[resultado].toString();
	}
	
	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder("Baraja Española \n");
		
		for (int i=0; i < super.numCartas; i++) {
			if (super.cartas[i].getNumber() <= 7) {
				resultado.append(super.cartas[i].getNumber());
			}
			else {
				if (super.cartas[i].getNumber() == 8) {
					resultado.append("Sota");
				}
				else if (super.cartas[i].getNumber() == 9) {
					resultado.append("Caballo");
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
