package ro.ugal.student.magazin.models.db;

import java.util.ArrayList;
import java.util.List;
import ro.ugal.student.magazin.models.Lampa;

public class ListLampa extends Metode {
	
	// Cream o lista de Lampi Standard 

	private List<Lampa> lampLista = new ArrayList<Lampa>();
	


	public ListLampa() {
	
	

		lampLista.add(new Lampa(r.nextInt(1500), RandomGarantie(), RandomCod(), r.nextBoolean(),RandomTipIntrerupator() , r.nextBoolean()));
		lampLista.add(new Lampa(r.nextInt(1500), RandomGarantie(), RandomCod(), r.nextBoolean(),RandomTipIntrerupator() , r.nextBoolean()));
		lampLista.add(new Lampa(r.nextInt(1500), RandomGarantie(), RandomCod(), r.nextBoolean(),RandomTipIntrerupator() , r.nextBoolean()));
		lampLista.add(new Lampa(r.nextInt(1500), RandomGarantie(), RandomCod(), r.nextBoolean(),RandomTipIntrerupator() , r.nextBoolean()));
		lampLista.add(new Lampa(r.nextInt(1500), RandomGarantie(), RandomCod(), r.nextBoolean(),RandomTipIntrerupator() , r.nextBoolean()));

	}

	public void add(Lampa entity) {
		lampLista.add(entity);
	}

	public void addAll(List<Lampa> entity) {
		lampLista.addAll(entity);
	}

	public List<Lampa> getLampLista() {
		return lampLista;
	}

	public void setLampLista(List<Lampa> lampLista) {
		this.lampLista = lampLista;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(lampLista);
		return builder.toString();
	}

}
