public class Disciplina {

private Double nota;
private String disciplina;



public Disciplina(){}


public Double getNota() {
    return nota;
}


public void setNota(Double nota) {
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
    return "Disciplina [nota=" + nota + ", disciplina=" + disciplina + "]";
}


@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nota == null) ? 0 : nota.hashCode());
    result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
    return result;
}


    @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
        Disciplina other = (Disciplina) obj;
            if (nota == null) {
                if (other.nota != null)
                    return false;
             } else if (!nota.equals(other.nota))
                return false;
            if (disciplina == null) {
                if (other.disciplina != null)
                    return false;
            } else if (!disciplina.equals(other.disciplina))
            return false;
                return true;
        }




}