Clase Fecha
    private Definir dia, mes, ano como entero

    Metodo mostrarFecha()
        mostrar "Fecha"
        mostrar dia "/" mes "/" ano
    fin Metodo

     Metodo registrarFecha()
        Mostrar "Ingrese los siguientes datos: "
        Mostrar "Día:"
        Leer dia
        Mostrar "Mes:"
        leer mes
        Mostrar "Año:"
        leer ano
    fin Metodo

    public metodo setDia(nuevoDia como entero)
        dia=nuevoDia
    fin metodo
    
    public metodo setMes(nuevoMes como entero)
        mes=nuevoMes
    fin metodo        

        
fin Clase


Clase Examen
    definir nota como real
    definir fecha como Fecha

    Metodo registrarExamen
        mostrar "ingrese la nota del examen"
        leer nota 
    fin Metodo   

    
    Metodo mostrarExamen()
        mostrar "el resultado del examen es el siguiente:"
        mostrar "nota: " nota
    fin Metodo

    Metodo mostrarNotaEscala() como real
       retornar nota/5
       
    fin Metodo


fin Clase


algoritmo Ejercicio

Definir dato como Fecha
Definir examen1 como Examen
definir nota escala como real

dato=nuevo Fecha()
examen1=nuevo Examen()

examen1.fecha=dato

Mostrar "ingrese el numero de alumnos a procesar"
Leer n

for(i=1, i<=n, i++){ //ciclo para, se puede usar también dentro de los métodos
   examen1.registrarExamen()
   dato.registrarFecha()
   examen1.mostrarExamen()
   dato.mostrarFecha()
   mostrar "Nota en escala de 20: " examen1.mostrarNotaEscala()
}
//otra forma
notaescala=examen1.mostrarNotaEscala()
mostrar "la nota en escala de 20 es: " notaescala


fin algoritmo


