package actividad1;

public class Info {

	public Info() {
		// TODO Auto-generated constructor stub
	}
	
	private String nombre;
	private int edad;
	private String hobbie;
	private String codEditPref;
	private String so;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getHobbie() {
		return hobbie;
	}
	public void setHobbie(String hobbie) {
		this.hobbie = hobbie;
	}
	public String getCodEditPref() {
		return codEditPref;
	}
	public void setCodEditPref(String codEditPref) {
		this.codEditPref = codEditPref;
	}
	public String getSo() {
		return so;
	}
	public void setSo(String so) {
		this.so = so;
	}
	@Override
	public String toString() {
		return "info [nombre=" + nombre + ", edad=" + edad + ", hobbie=" + hobbie + ", codEditPref=" + codEditPref
				+ ", so=" + so + "]";
	}
	
}
