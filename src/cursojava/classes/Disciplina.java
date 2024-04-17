package cursojava.classes;
public class Disciplina {

	
	/* cada disciplina terá 4 notas */
private double [] nota = new double[4];
private String disciplina;



public Disciplina(){}



public double[] getNota() {
	return nota;
}



public void setNota(double[] nota) {
	this.nota = nota;
}


public String getDisciplina() {
    return disciplina;
}


public void setDisciplina(String disciplina) {
    this.disciplina = disciplina;
}


@Override
public String toString() {
	return "Disciplina [disciplina=" + disciplina + ", nota=" + nota + "]";
}


public double getMediaNotas() {
	
	double somaTotal = 0;
	
	for(int i =0; i < nota.length; i ++) {
		
		somaTotal += nota[i];
	}
	
	return somaTotal / 4;
}







}