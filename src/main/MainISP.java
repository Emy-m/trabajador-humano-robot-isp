package main;

import isp.Humano;
import isp.Robot;

public class MainISP {

	public static void main(String[] args) {
		Humano trabajadorHumano = new Humano();
		Robot trabajadorRobot = new Robot();

		trabajadorHumano.cargarBateria();
		trabajadorRobot.pausaParaComer();
	}

}
