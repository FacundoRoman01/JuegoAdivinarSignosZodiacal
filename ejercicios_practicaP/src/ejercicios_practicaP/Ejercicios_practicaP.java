package ejercicios_practicaP;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Ejercicios_practicaP {

	public static void main(String[] args) {
		
		//Ejercicios 1 de signos
		
		int dia ;
		String mesNacimiento;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("ingrese tu dia que naciste?"));
		mesNacimiento = JOptionPane.showInputDialog("ingrese el mes de nacimiento?");
		
		if ((mesNacimiento.equalsIgnoreCase("enero") && dia >=21) || (mesNacimiento.equalsIgnoreCase("febrero") && dia <=18 )) {
			JOptionPane.showMessageDialog(null, "Tu signo es acuario" , null , JOptionPane.DEFAULT_OPTION, new ImageIcon(Ejercicios_practicaP.class.getResource("/img/acuario.jpg")));
		} else if((mesNacimiento.equalsIgnoreCase("febrero") && dia >=19) || (mesNacimiento.equalsIgnoreCase("marzo") && dia <=20)) {
			JOptionPane.showMessageDialog(null, "Tu signo es Picis" , null , JOptionPane.DEFAULT_OPTION, new ImageIcon(Ejercicios_practicaP.class.getResource("/img/picis.jpg")));
		}else if((mesNacimiento.equalsIgnoreCase("marzo") && dia >=21) || (mesNacimiento.equalsIgnoreCase("abril") && dia <=20)) {
			JOptionPane.showMessageDialog(null, "Tu signo es Aries" , null , JOptionPane.DEFAULT_OPTION, new ImageIcon(Ejercicios_practicaP.class.getResource("/img/aries.jpg")));
		}else if((mesNacimiento.equalsIgnoreCase("abril") && dia >=21) || (mesNacimiento.equalsIgnoreCase("mayo") && dia <=21)) {
			JOptionPane.showMessageDialog(null, "Tu signo es Tauro" , null , JOptionPane.DEFAULT_OPTION, new ImageIcon(Ejercicios_practicaP.class.getResource("/img/tauro.jpg")));
		}else if((mesNacimiento.equalsIgnoreCase("mayo") && dia >=22) || (mesNacimiento.equalsIgnoreCase("junio") && dia <=21)) {
			JOptionPane.showMessageDialog(null, "Tu signo es Geminis" , null , JOptionPane.DEFAULT_OPTION, new ImageIcon(Ejercicios_practicaP.class.getResource("/img/gemenis.jpg")));
		}else if((mesNacimiento.equalsIgnoreCase("junio") && dia >=23) || (mesNacimiento.equalsIgnoreCase("julio") && dia <=22)) {
			JOptionPane.showMessageDialog(null, "Tu signo es Cancer" , null , JOptionPane.DEFAULT_OPTION, new ImageIcon(Ejercicios_practicaP.class.getResource("/img/cancer.jpg")));
		}else if((mesNacimiento.equalsIgnoreCase("julio") && dia >=23) || (mesNacimiento.equalsIgnoreCase("agosto") && dia <=23)) {
			JOptionPane.showMessageDialog(null, "Tu signo es Leo" , null , JOptionPane.DEFAULT_OPTION, new ImageIcon(Ejercicios_practicaP.class.getResource("/img/leo.jpg")));
		}else if((mesNacimiento.equalsIgnoreCase("agosto") && dia >=24) || (mesNacimiento.equalsIgnoreCase("septiembre") && dia <=23)) {
			JOptionPane.showMessageDialog(null, "Tu signo es Virgo" , null , JOptionPane.DEFAULT_OPTION, new ImageIcon(Ejercicios_practicaP.class.getResource("/img/virgo.jpg")));
		}else if((mesNacimiento.equalsIgnoreCase("septiembre") && dia >=24) || (mesNacimiento.equalsIgnoreCase("octubre") && dia <=23)) {
			JOptionPane.showMessageDialog(null, "Tu signo es libra" , null , JOptionPane.DEFAULT_OPTION, new ImageIcon(Ejercicios_practicaP.class.getResource("/img/libra.jpg")));
		}else if((mesNacimiento.equalsIgnoreCase("octubre") && dia >=24) || (mesNacimiento.equalsIgnoreCase("noviembre") && dia <=22)) {
			JOptionPane.showMessageDialog(null, "Tu signo es Escorpión" , null , JOptionPane.DEFAULT_OPTION, new ImageIcon(Ejercicios_practicaP.class.getResource("/img/escorpion.jpg")));
		}else if((mesNacimiento.equalsIgnoreCase("noviembre") && dia >=23) || (mesNacimiento.equalsIgnoreCase("diciembre") && dia <=21)) {
			JOptionPane.showMessageDialog(null, "Tu signo es Sagitario" , null , JOptionPane.DEFAULT_OPTION, new ImageIcon(Ejercicios_practicaP.class.getResource("/img/sagitario.jpg")));
		}else if((mesNacimiento.equalsIgnoreCase("diciembre") && dia >=22) || (mesNacimiento.equalsIgnoreCase("enero") && dia <=20)) {
			JOptionPane.showMessageDialog(null, "Tu signo es Capricornio" , null , JOptionPane.DEFAULT_OPTION, new ImageIcon(Ejercicios_practicaP.class.getResource("/img/capricornio.jpg")));
		}
		
		
		
		
		
		
	}

}
