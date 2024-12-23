import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ListaSortimente {
	private static ArrayList<sortimente> sortimenteTorturi = null;
	
/**   Pastreaza in memorie lista de sortimente de torturi pe care le incarcam din fisierul text 	
	
/**
 * 	
 * @return Afisarea torturilor din fisierul txt (sortimenteTorturi.txt)
 * 
 */

	public static sortimente[] getsortimenteTorturi() {
		if (sortimenteTorturi != null) {
			return (sortimente[]) sortimenteTorturi.toArray(new sortimente[sortimenteTorturi.size()]);
		}

		sortimenteTorturi = new ArrayList<sortimente>();

		BufferedReader fisierCitireCuBuffer;
		
		try {
			fisierCitireCuBuffer = new BufferedReader(new FileReader("sortimenteTorturi.txt"));
			String linie = fisierCitireCuBuffer.readLine();

			while (linie != null) {
				String[] sortimenteDinLinie = { "", "", "", "" };
				int j = 0;

				for (int i = 0; i < linie.length(); i++) {
					if (linie.charAt(i) != ',') {
						sortimenteDinLinie[j] += linie.charAt(i);
					} else {
						j++;
					}
				}
				sortimenteTorturi.add(new sortimente(sortimenteDinLinie[0], Float.parseFloat(sortimenteDinLinie[1]),
						Float.parseFloat(sortimenteDinLinie[2])));
				linie = fisierCitireCuBuffer.readLine();
			}
			fisierCitireCuBuffer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return (sortimente[]) sortimenteTorturi.toArray(new sortimente[sortimenteTorturi.size()]);
		
		/** 
		 *  Scade sortimentul unui tort si il salveaza in fisier
		 *  
		 *  @param gramaj - gramajul  care se scade
		 *  @param sortimente - sortimentul de tort pentru care se scade gramajul
		 *   
		 */
		
		
		
		
	}
	public static void scadeGramaj(sortimente sortimente, float gramaj) {
		for (int i = 0; i < sortimenteTorturi.size(); i++) {
			if (sortimenteTorturi.get(i).equals(sortimente)) {
				sortimenteTorturi.get(i).gramaj -= gramaj;
			}
		}
		salveazaListaSortimente();
	}
	
	/** 
	 * 
	 * @param sortimente- sortimentul care trebuie adaugat
	 * 
	 * Adauga un nou sortiment si il salveaza in fisier
	 */
	
	
	
	

	public static void adaugaProdus(sortimente sortimente) {
		sortimenteTorturi.add(sortimente);
		salveazaListaSortimente();
	}

	/**
	 * Salveaza sortimentele in fisierul text " SortimenteTorturi.txt" 
	 */
	
	
	
	private static void salveazaListaSortimente() {
		try {
			FileWriter fisier = new FileWriter("SortimenteTorturi.txt", false);
			for (sortimente sortimente : sortimenteTorturi) {
				fisier.write(
						sortimente.denumire + "," + sortimente.gramaj + "," + sortimente.pret + "," + "\n");
			}
			fisier.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}