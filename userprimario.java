import javax.swing.*;

public class userprimario {
public static void main(String [] args) {
	user mike = new user();
	String name=mike.getName();
	String curp=mike.getCurp();
	String direc=mike.getDirec();
	String tel=mike.getTel();
	
	JOptionPane.showMessageDialog(null, "Tu nombre es: "+name+",\n tu curp es: "+curp+","+"\n tu dirección es: "+direc+"\n tu teléfono es: "+tel);
}
}
