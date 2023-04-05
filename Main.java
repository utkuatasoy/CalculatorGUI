public class Main {
	/*
	 * 		Utku Murat Atasoy / 211401019
	 * 		Yapay Zeka Muhendisligi
	 * 
	 * 
	 * 		Bu kod sayiyi girerken 2.haneyi ekledigimizde ekrani guncellemiyor fakat 3.hane girildigi takdirde sayiyi buradan itibaren basmaya devam ediyor.
	 *		Koddaki actionListener'lar duzgun calisiyor bu yuzden GUI ile ilgili bir sorun oldugunu dusunuyorum fakat tam olarak ne oldugunu bulamadim.
	 * 
	 */
	
	
	public static void main(String[] args) {
		try {
			Calculator calculator = new Calculator();
			calculator.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}
