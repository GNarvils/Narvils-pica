package pica;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

import javax.swing.JOptionPane;

public class Picerija {
   static String failsPicas = "Pica.txt";
   static String failsKlienti = "Klients.txt";
   static String failsDarbinieki  = "Darbinieki.txt";
   static pica[] izveidot(pica[] masivs, int p) {
		  String nosaukums = JOptionPane.showInputDialog("Lūdzu pasakiet picas nosaukumu?");
		  Double izmers = Double.parseDouble(JOptionPane.showInputDialog("Kāds būs picas izmērs cm?"));
		  String siers = JOptionPane.showInputDialog("Lūdzu pasakiet sieru veidu?");
		  String merce = JOptionPane.showInputDialog("Kādu mērci izmantosiet?");
		  String toppings = JOptionPane.showInputDialog("Ko liksiet virsū picai?");
		  Double cena = Double.parseDouble(JOptionPane.showInputDialog("Cik maksās pica?"));
   	  masivs[p]= new pica(nosaukums, izmers, siers, merce, toppings, cena);
	      
	   
	   return masivs;
   }
   public static void saglabaP(pica[] picas){
   	try{
		   FileWriter fw = new FileWriter(failsPicas, true);
		   PrintWriter raksta = new PrintWriter(fw);
		   for(int i=0; i<picas.length; i++){
				   raksta.print(picas[i]+" \t");	   
			   raksta.println();
		   }
		   raksta.println("_______________");
		   raksta.close();
		   JOptionPane.showMessageDialog(null, "Masivs ir saglabats faila "+failsPicas+" !");
		   }catch(Exception e){
			    	JOptionPane.showMessageDialog(null, "Programmā ir kļūda rakstisanas procesa!", "Kļūda", JOptionPane.ERROR_MESSAGE);    	
		   }
   }
	public static void main(String[] args) {
		String izvele;
		pica[] picas = null;
		darbinieks[] darbinieki = null;
		klients[] klienti = null;
		int p = 0, d = 0, k = 0;
		JOptionPane.showMessageDialog(null, "Esiet sveicināti picērijā!");
		JOptionPane.showMessageDialog(null, "Ko jūs gribētu darīt!");
		do {
		izvele = JOptionPane.showInputDialog("1 - Izveidot jaunu picu! | 2 - Pieteikties darbam | 3 - Izveidot jaunu pasūtījumu | 4 - Parādīt ēdienkarti | ata - Iet prom ");
        izvele.toLowerCase();
        switch(izvele) {
        case "1":
        	picas = new pica[10];
        	izveidot(picas, p);
        	picas[p].izvaditInfoP();
        	saglabaP(picas);
        	p++;
        break;
        case "2":
            darbinieki = new darbinieks[10];
        break;
        case "3":
        	klienti = new klients[10];
        break;
        case "4": break;
        case "ata": JOptionPane.showMessageDialog(null, "Paldies, ka atnācāt!" ); break;
        default: JOptionPane.showMessageDialog(null, "Mēs nezinam pa, ko jūs runājat!",  "Kļūda", JOptionPane.ERROR_MESSAGE);break;
        }
	}while(!izvele.equals("ata"));
	}

}
