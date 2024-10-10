package modelo;

public enum Materias {
	//coleccion de datos(la ñ es mejor no usarla)
Matematica("matematica"),Biologia("biologia"),Fisica("fisica"),LenguaEspañola("lenguaespañola");

//campo provado del dato
private String nombrecurso;
//constructor por defecto
private Materias(String s) {
	this.nombrecurso=s;
}
//el unico getter necesario de momento
public String getNombrecurso() {
	return nombrecurso;
}


}
