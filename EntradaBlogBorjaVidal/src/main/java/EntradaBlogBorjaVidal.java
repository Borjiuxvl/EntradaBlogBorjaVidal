

/**
 * Clase para manejar las entradas de un blog.
 * @author Borja Vidal López
 * @since Modificado el 15/02/2023
 * @version Versión 2.3
 */

public class EntradaBlogBorjaVidal {
	
	/**
         * Separador
         * Es el carácter que separa "ENTRADA DE" del nombre del autor
         */
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	
        /**
         * 
         * @param id Recibe el número de entrada
         * @param autor Recive el nombre del autor de la entrada
         * @param texto Recibe el texto que contiene la entrada
         * @throws IllegalArgumentException Excepción que se lanza si el número es negativo
         */
	public EntradaBlogBorjaVidal(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	
        /**
         * Devuelve el número de la entrada
         * @return id
         */
	public int getId(){
		return this.id;
	}
	
	
        /**
         * Devuelve el texto completo de la entrada
         * @return texto
         */
	public String getTexto(){
		return this.texto;
	}
	
	
        /**
         * Devuelve el nombre del autor de la entrada en mayúsculas
         * @return autor
         */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	
        /**
         * Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
         * @return autor
         */
	public String devuelveAutor(){
		return this.autor;
	}
	
	
        /**
         * No tiene porqué tener argumentos.
         * @param args 
         */
	public static void main(String[] args) {
		EntradaBlogBorjaVidal e1=new EntradaBlogBorjaVidal (-3,"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}