Clase Fecha
    Definir dia, mes, ano como entero

    Metodo mostrarFecha()
        mostrar "Fecha"
        mostrar dia "/" mes "/" ano
    fin Metodo

    Metodo registrarFecha
        Mostrar "Ingrese los siguientes datos: "
        Mostrar "Día:"
        Leer dia
        Mostrar "Mes:"
        leer mes
        Mostrar "Año:"
        leer ano
    fin Metodo
        
fin Clase


Clase Examen
    definir nota como real
    definir fecha como Fecha

    Metodo registrarExamen
        mostrar "ingrese la nota del examen"
        leer nota 
        fecha.registrarFecha
    fin Metodo   

    
    Metodo mostrarExamen()
        mostrar "el resultado del examen es el siguiente:"
        mostrar "nota: " nota
        mostrar "Fecha de realizacion: " fecha.dia "/" fecha.mes"/" fecha.ano
        //otra forma de mostrar la fecha accediendo al atributo completo
        mostrar "fecha del examen: " fecha.mostrarFecha
    
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

examen1.registrarExamen()
examen1.mostrarExamen()
mostrar "Nota en escala de 20: " examen1.mostrarNotaEscala()
//otra forma
notaescala=examen1.mostrarNotaEscala()
mostrar "la nota en escala de 20 es: " notaescala


fin algoritmo


