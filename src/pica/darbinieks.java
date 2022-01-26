package pica;

import javax.swing.JOptionPane;

public class darbinieks {
String vards;
String uzvards;
String telefons;
public darbinieks(String v, String u, String tel) {
	this.vards = v;
	this.uzvards = u;
	this.telefons = tel;	
}
public void izvaditInfoD() {
	JOptionPane.showMessageDialog(null, "Vārds: "+vards+", Uzvārds: "+uzvards+", Telefona numurs: "+telefons);
} 
}
