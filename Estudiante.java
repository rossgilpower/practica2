package practica2;

public class Estudiante {

	String nombre;
	int numControl;
	String materia;
	int calificacion;
	String estado;
	
	public Estudiante(String nombre, int numControl, String materia, int calificacion, String estado) {
		setNombre(nombre);
		setNControl(numControl);
		setMateria(materia);
		setCalificacion(calificacion);
		setEstado(estado);
	}
	
	//public Estudiante() {

	//}

	//------Setters-------
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setNControl(int numControl) {
		this.numControl = numControl;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	//------Getters-------
	public String getNombre(){
		return nombre;
	}
	public int getNControl() {
		return numControl;
	}
	public String getMateria() {
		return materia;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public String getEstado() {
		return estado;
	}
}
