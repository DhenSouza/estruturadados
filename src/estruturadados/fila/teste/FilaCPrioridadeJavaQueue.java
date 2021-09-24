package estruturadados.fila.teste;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class FilaCPrioridadeJavaQueue {

	public static void main(String[] args) {
		Queue<Paciente> fila = new PriorityQueue<Paciente>(new Comparator<Paciente>() {

			@Override
			public int compare(Paciente p1, Paciente p2) {
				return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
			}
		}
	);

		fila.add(new Paciente("Jujuco", 2));
		fila.add(new Paciente("lalaca", 1));

		System.out.println(fila);
	}

}
