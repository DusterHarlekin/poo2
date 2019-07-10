Clase Libro
Definir nombre, autor, editorial como caracter
Definir tipo como Caracter
Definir pag como entero
Definir fecha como Fecha
Definir ilustrado como logico


Metodo Libro() //constructor por defecto
	nombre="libro"
	autor="desconocido"
	editorial="editorial"
	tipo="historias"
	pag=10
	fecha=nuevo Fecha() //hay que definir la clase Fecha
	ilustrado=falso

fin Metodo

Metodo libro(name, by, edit, t, cant, dibujo) //constructor con parametros
	nombre=name
	autor=by
	editorial=edit
	tipo=t
	pag=cant
	fecha=nuevo Fecha()
	ilustrado=dibujo

Fin Metodo

Algoritmo practica

Definir libro1, libro2 como Libro

libro1= nuevo Libro()
libro2= nuevo Libro("Desastre de Chernobyl", "Roger", "Askarov", "Historia contemporánea", 300, nuevo Fecha, Verdadero)
