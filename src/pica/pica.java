package pica;

import javax.swing.JOptionPane;

public class pica {
   String nosaukums;
   Double izmers;
   String siers;
   String merce;
   String toppings;
   Double cena;
   public pica(String nos, Double iz, String s, String mer, String top, Double cen) {
	   this.nosaukums = nos;
	   this.izmers = iz; 
	   this.siers = s;
	   this.merce = mer;
	   this.toppings = top;
	   this.cena = cen;
	   
   }
   public void izvaditInfoP(){
		JOptionPane.showMessageDialog(null, "Nosaukums: "+nosaukums+", Siera veids: "+siers+", Mērce: "+merce+", Toppinga vieds: "+toppings+", Cena: "+cena);

	}
}
