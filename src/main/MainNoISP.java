package main;

import noIsp.Humano;
import noIsp.Robot;

public class MainNoISP {

	public static void main(String[] args) {
		Humano trabajadorHumano = new Humano();
		Robot trabajadorRobot = new Robot();

		trabajadorHumano.cargarBateria();
		trabajadorRobot.pausaParaComer();
	}

}
