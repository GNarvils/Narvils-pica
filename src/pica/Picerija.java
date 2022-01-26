package pica;

import javax.swing.JOptionPane;

public class Picerija {

	public static void main(String[] args) {
		String izvele;
		JOptionPane.showMessageDialog(null, "Esiet sveicināti picērijā!");
		JOptionPane.showMessageDialog(null, "Ko jūs gribētu darīt!");
		do {
		izvele = JOptionPane.showInputDialog("1 - Izveidot jaunu picu! | 2 - Pieteikties darbam | 3 - Izveidot jaunu pasūtījumu | 4 - Izvadīt ēdienkarti | ata - Iet prom ");
        izvele.toLowerCase();
        switch(izvele) {
        case "1": break;
        case "2": break;
        case "3": break;
        case "4": break;
        case "ata": JOptionPane.showMessageDialog(null, "Paldies, ka atnācāt!" ); break;
        default: JOptionPane.showMessageDialog(null, "Mēs nezinam pa, ko jūs runājat!");break;
        }
	}while(!izvele.equals("ata"));
	}

}
