package pica;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

import javax.swing.JOptionPane;

public class Picerija {
   static String failsPicas = "Pica.txt";
   static String failsKlienti = "Klients.txt";
   static String failsDarbinieki  = "Darbinieki.txt";
   static pica[] izveidotP(pica[] masivs, int p, String pMasivs[]) {
		  String nosaukums = JOptionPane.showInputDialog("Lūdzu pasakiet picas nosaukumu?");
		  Double izmers = Double.parseDouble(JOptionPane.showInputDialog("Kāds būs picas izmērs cm?"));
		  String siers = JOptionPane.showInputDialog("Lūdzu pasakiet sieru veidu?");
		  String merce = JOptionPane.showInputDialog("Kādu mērci izmantosiet?");
		  String toppings = JOptionPane.showInputDialog("Ko liksiet virsū picai?");
		  Double cena = Double.parseDouble(JOptionPane.showInputDialog("Cik maksās pica?"));
   	  masivs[p]= new pica(nosaukums, izmers, siers, merce, toppings, cena);
   	  pMasivs[0] = "Nosaukums: "+nosaukums+", Izmers: "+izmers+", Siera veids: "+siers+", Mērce: "+merce+", Toppings: "+toppings+", Cena: "+cena;
	   return masivs;
   }
   public static void saglabaP(String[] masivs){
   	try{
		   FileWriter fw = new FileWriter(failsPicas, true);
		   PrintWriter raksta = new PrintWriter(fw);
		   for(int i=0; i<masivs.length; i++){
			   raksta.print(masivs[i]+" ");	   
		   }
		   raksta.println("\t");
		   raksta.close();
		   JOptionPane.showMessageDialog(null, "Picas dati ir saglabāts failā "+failsPicas+" !");
		   }catch(Exception e){
			    	JOptionPane.showMessageDialog(null, "Programmā ir kļūda picas rakstisanas procesa!", "Kļūda", JOptionPane.ERROR_MESSAGE);    	
		   }
   }
   static darbinieks[] izveidotD(darbinieks[] masivs, int d, String pMasivs[]) {
		  String vardsD = JOptionPane.showInputDialog("Kāds jums ir vārds?");
		  String uzvardD = JOptionPane.showInputDialog("Kāds jums ir uzvārds?");
		  String telefonsD = JOptionPane.showInputDialog("Kāds ir jūsu telefona numurs?");
	  masivs[d]= new darbinieks(vardsD, uzvardD, telefonsD);
	  pMasivs[0]= "Vards: "+vardsD+", Uzvards: "+uzvardD+", Telefons: "+telefonsD;
	   return masivs;  
}
   public static void saglabaD(String masivs[]){
	   	try{
			   FileWriter fw = new FileWriter(failsDarbinieki, true);
			   PrintWriter raksta = new PrintWriter(fw);
			   for(int i=0; i<masivs.length; i++){
				   raksta.print(masivs[i]+" ");	   
			   }
			   raksta.println("\t");
			   raksta.close();
			   JOptionPane.showMessageDialog(null, "Jūsu dati ir saglabāts failā "+failsDarbinieki+" !");
			   }catch(Exception e){
				    	JOptionPane.showMessageDialog(null, "Programmā ir kļūda darbinieka rakstisanas procesa!", "Kļūda", JOptionPane.ERROR_MESSAGE);    	
			   }
	   	
	   }
   static klients[] izveidotK(klients[] masivs, int k, String pMasivs[], double cena) {
	       Random rand = new Random();
	       StringBuilder sb = new StringBuilder();
		  String vardsK = JOptionPane.showInputDialog("Kāds jums ir vārds?");
		  String uzvardK = JOptionPane.showInputDialog("Kāds jums ir uzvārds?");
		  String telefonsK = JOptionPane.showInputDialog("Kāds ir jūsu telefona numurs?");
		  String adrese = JOptionPane.showInputDialog("Kāda ir jūsu adrese?");
		  int nr = 0;
		  for(int i=0; i<4; i++){
			  nr= rand.nextInt(10);
			  sb.append(nr);
			  }
		     String kNr=sb.toString();
	  masivs[k]= new klients(vardsK, uzvardK, telefonsK, adrese, cena, kNr);
	  pMasivs[0]= "Vards: "+vardsK+", Uzvards: "+uzvardK+", Telefons: "+telefonsK+", Adrese: "+adrese+", Samaksajis:  "+cena+", Pasutijuma numurs: "+kNr;
	   return masivs;  
}
   public static void saglabaK(String masivs[]){
	   	try{
			   FileWriter fw = new FileWriter(failsKlienti, true);
			   PrintWriter raksta = new PrintWriter(fw);
			   for(int i=0; i<masivs.length; i++){
				   raksta.print(masivs[i]+" ");	   
			   }
			   raksta.println("\t");
			   raksta.close();
			   JOptionPane.showMessageDialog(null, "Jūsu dati ir saglabāts failā "+failsKlienti+" !");
			   }catch(Exception e){
				    	JOptionPane.showMessageDialog(null, "Programmā ir kļūda klientu rakstisanas procesa!", "Kļūda", JOptionPane.ERROR_MESSAGE);    	
			   }
	   	
	   }
   static pica[] nolasit(pica[] picas){
  	 String virkne="", teksts;
		   try{
		     FileReader fr = new FileReader(failsPicas);
		     BufferedReader lasa = new BufferedReader(fr);
		     while((teksts=lasa.readLine()) != null){
		    	 virkne = virkne+teksts+"\n";
		     }
		     lasa.close();
		   JOptionPane.showMessageDialog(null, virkne);
		   }catch(Exception e){
		    	JOptionPane.showMessageDialog(null, "Programmā ir kļūda picas lasīšanas procesā!", "Kļūda", JOptionPane.ERROR_MESSAGE);    	
	   }
		return picas;
  }
	public static void main(String[] args) {
		String izvele;
		pica[] picas = null;
		darbinieks[] darbinieki = null;
		klients[] klienti = null;
		String[] picaP = new String[1];
		String[] darbinieksP = new String[1];
		String[] klientsP = new String[1];
        double cena;
		int p = 0, d = 0, k = 0;
		JOptionPane.showMessageDialog(null, "Esiet sveicināti picērijā!");
		JOptionPane.showMessageDialog(null, "Ko jūs gribētu darīt!");
		do {
		izvele = JOptionPane.showInputDialog("1 - Izveidot jaunu picu! | 2 - Pieteikties darbam | 3 - Izveidot jaunu pasūtījumu | 4 - Parādīt ēdienkarti | ata - Iet prom ");
        izvele.toLowerCase();
        switch(izvele) {
        case "1":
        	picas = new pica[10];
        	izveidotP(picas, p, picaP);
        	picas[p].izvaditInfoP();
        	saglabaP(picaP);
        	JOptionPane.showMessageDialog(null, "Jūs esat izveidojis jaunu picu!");
        	p++;
        break;
        case "2":
            darbinieki = new darbinieks[10];
        	izveidotD(darbinieki, d, darbinieksP);
        	darbinieki[d].izvaditInfoD();
        	saglabaD(darbinieksP);
        	JOptionPane.showMessageDialog(null, "Jūs esat pieņemnts!");
        	d++;
        break;
        case "3":
        	try {
        	klienti = new klients[10];
        	String mekle = JOptionPane.showInputDialog("Kādu picu jūs sūtīsiet?");
        	for(int i=0; i<picas.length; i++){
        	if(mekle.equals(picas[i].noteiktN())){
                    JOptionPane.showMessageDialog(null, "Tāda pica mums ir!");
                    cena = (picas[i].notiektC());
                    izveidotK(klienti, k, klientsP, cena);
                    klienti[d].izvaditInfoK();
                	saglabaK(klientsP);
				  }else{
					JOptionPane.showMessageDialog(null, "Mums tāda pica nav!");  
				  }
			  }
        	k++;
        	}catch(Exception e){
        		JOptionPane.showMessageDialog(null, "Programmā ir kļūda meklēšanas procesā", "Kļūda", JOptionPane.ERROR_MESSAGE);
        	}
        break;
        case "4":
        	nolasit(picas);
        break;
        case "ata": JOptionPane.showMessageDialog(null, "Paldies, ka atnācāt!" ); break;
        default: JOptionPane.showMessageDialog(null, "Mēs nezinam pa, ko jūs runājat!",  "Kļūda", JOptionPane.ERROR_MESSAGE);break;
        }
	}while(!izvele.equals("ata"));
	}

}
