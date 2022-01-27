package pica;

import javax.swing.JOptionPane;

public class klients {
   String vards;
   String uzvards;
   String telefons;
   String adrese;
   Double samaksajis;
   int pasutijumaNr;
   public klients(String v, String u, String tel, String adr, Double samak, int pasutNr) {
	   this.vards = v;
	   this.uzvards = u;
	   this.telefons = tel;
	   this.adrese = adr;
	   this.samaksajis = samak;
   }
   public void izvaditInfoK() {
		JOptionPane.showMessageDialog(null, "Vārds: "+vards+", Uzvārds: "+uzvards+", Telefona numurs: "+telefons+", Adrese: "+adrese+", Samaksajis: "+samaksajis+ ", PasūtijumaNr: "+pasutijumaNr);
   }
 
}
