package pica;

import javax.swing.JOptionPane;

public class klients {
   String vards;
   String uzvards;
   String telefons;
   String adrese;
   Double samaksajis;
   String pasutijumaNr;
   public klients(String v, String u, String tel, String adr, Double samak, String pasutNr) {
	   this.vards = v;
	   this.uzvards = u;
	   this.telefons = tel;
	   this.adrese = adr;
	   this.samaksajis = samak;
	   this.pasutijumaNr = pasutNr;
   }
   public void izvaditInfoK() {
    JOptionPane.showMessageDialog(null, "Vards: "+vards+", Uzvards: "+uzvards+", Telefons: "+telefons+", Adrese: "+adrese+", Samaksajis:  "+samaksajis+", Pasutijuma numurs: "+pasutijumaNr);
   }
   
}
