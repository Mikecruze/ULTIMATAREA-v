import javax.swing.JOptionPane;
public class user {
String name, direc, curp, tel;



public user() {
	this.name = "Mike";
	this.direc = "Palo Alto, CA.";
	this.curp = "CMTHEBSTNBR1OH867";
	this.tel = "0016793654";
}


public String getName() {
	name = JOptionPane.showInputDialog("Escriba su nombre: ");
	return name;
}

public void setName(String name) {
	this.name = "Mike";
}

public String getDirec() {
	direc=JOptionPane.showInputDialog("Escriba su dirección: ");
	return direc;
}

public void setDirec(String direc) {
	this.direc = "Palo Alto, CA.";
}

public String getCurp() {
	curp=JOptionPane.showInputDialog("Escriba su curp: ");
	return curp;
}

public void setCrup(String curp) {
	this.curp = "CMTHEBSTNBR1OH867";
}

public String getTel() {
	tel=JOptionPane.showInputDialog("Escriba su teléfono: ");

	return tel;
}

public void setTel(String tel) {
	this.tel = "0016793654";
}
}
