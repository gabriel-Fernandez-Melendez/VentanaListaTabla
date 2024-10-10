package modelo;

public class Estudiante {
	public String id;
	public String nombre;
	public String apellidos;
	//este campo puede cambiar por algo mas adecuado
	public String nota;
	//una enum
	public Materias materia;
	
	//constructor con todos los parametros
	public Estudiante(String id, String nombre, String apellidos, String nota,Materias materia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nota = nota;
		this.materia = materia;
	}
	//getters y setters de la clase
	public Estudiante() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}
	//no creo que sea necesario pero lo dejo puesto en caso de ser usado 
	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nota=" + nota + "]";
	}
	
	
	
	
	

}
