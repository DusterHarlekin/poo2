class Alumno{
definir nombre como caracter
definir apellido como caracter
definir cedula como cadena
definir correo como cadena
definir promedio como real

metodo cargarDatos()
mostrar "ingrese nombre del alumno"
leer nombre
mostrar "ingrese el apellido"
leer apellido
mostrar "ingrese numero de cedula"
leer cedula
mostrar "ingrese correo electrónico"
leer correo

metodo mostDatos()
mostrar "nombre del alumno: " nombre " " apellido
mostrar "Número de cédula: " cedula
mostrar "Correo electrónico: " correo 

 Fin metodo
}
   fin clase

 class Carrera{
 definir nro_materias como entero
 definir semestres como entero
 definir horas_acad como real
}
    fin clase 

class Profesor{
definir nombre como caracter
definir horario como real
definir materia como materia
}
   fin clase 

class Universidad{
definir nombre como caracter
definir carreras como entero
definir empleados como persona
definir horario como real
}
   fin clase


Algoritmo Universidad

definir alum_1, alum_2 como Alumno
definir prof_1, prof_2 como Profesor
definir univ1, univ2 como Universidad
definir carrera_1, carrera_2 como Carrera

alum_1=nuevo Alumno() //Instanciando objeto
alum_2=nuevo Alumno() //Instanciando objeto
prof_1=nuevo Profesor()
prof_2=nuevo Profesor()
univ1=nuevo Universidad()
univ2=nuevo Universidad()
carrera_1=nuevo Carrera()
carrera_2=nuevo Carrera()

mostrar "ingrese los siguientes datos: "
alum_1.cargarDatos() 
mostrar "el nombre de la universidad a la que pertenece el alumno 1"
leer univ1.nombre
mostrar "el nombre de la carrera 1"
leer carrera_1.nombre
mostrar "nombre del profesor 1"
leer prof_1.nombre
mostrar "materia del profesor 1"
leer prof_1.materia

alum_1.mostDatos()
mostrar "universidad a la que pertenece: " univ1.nombre
mostrar "carrera a la que pertenece: " carrera_1.nombre
mostrar "nombre del docente de " prof_1.materia ": " prof_1.nombre

mostrar "ingrese los siguientes datos: "
alum_2.cargarDatos
mostrar "el nombre de la universidad a la que pertenece el alumno 2"
leer univ2.nombre
mostrar "el nombre de la carrera 2"
leer carrera_2.nombre
mostrar "nombre del profesor 2"
leer prof_2.nombre
mostrar "materia del profesor 2"
leer prof_2.materia

alum_2.mostDatos()
mostrar "universidad a la que pertenece: " univ2.nombre
mostrar "carrera a la que pertenece: " carrera_2.nombre
mostrar "nombre del docente de " prof_2.materia ":" prof_2.nombre

FinAlgoritmo