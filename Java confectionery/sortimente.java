public class sortimente {
	String denumire;
	float gramaj;
	float pret;
	
/** 
 * 
 * @param denumire
 * @param gramaj
 * @param pret
 */
	

	public sortimente (String denumire, float gramaj, float pret) {
		this.denumire = denumire;
		this.gramaj = gramaj;
		this.pret = pret;
		
	}

	
	public String toString() {
		return denumire;
	}
}