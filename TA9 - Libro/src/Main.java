class Libro {
	//Creación atributos clase Libro
	String ISBN = "";
	String titulo = "";
	String autor = "";
	int nPaginas = 0;
	
	//Métodos get y set
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getnPaginas() {
		return nPaginas;
	}
	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}
	
	//Sobreescribimos el método toString
	@Override
	public String toString() {
		return "El libro " + titulo + " con ISBN" + ISBN + " creado por " + autor + " tiene " + nPaginas + " páginas.";
	}
}

public class Main {

	public static void main(String[] args) {
		//Creación objeto libro1
		Libro libro1 = new Libro();
		
		//Definición de atributos del objeto libro1
		libro1.titulo = "Viaje al fin de la noche";
		libro1.ISBN = "A2UDFUYN73";
		libro1.autor = "Louis-Ferdinand Céline";
		libro1.nPaginas = 700;
		
		//Printamos el resultado del objeto libro1
		System.out.println(libro1);
		
		System.out.println();
		
		//Creación objeto libro2
		Libro libro2 = new Libro();
		
		//Definición de atributos del objeto libro2
		libro2.titulo = "Don Quijote de la Mancha";
		libro2.ISBN = "DSJFH9U34H";
		libro2.autor = "Miguel de Cervantes";
		libro2.nPaginas = 900;
		
		//Printamos el resultado del objeto libro2
		System.out.println(libro2);
		
		System.out.println();
		
		//Comparamos el número de páginas de los 2 libros para saber cuál tiene más
		if(libro1.nPaginas > libro2.nPaginas) {
			System.out.println("El libro con más páginas es el libro de " + libro1.titulo);
		} else {
			System.out.println("El libro con más páginas es el libro de " + libro2.titulo);
		}
	}
}
