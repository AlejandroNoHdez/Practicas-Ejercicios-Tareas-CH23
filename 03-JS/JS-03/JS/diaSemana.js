/*
Crea un traductor para un día de la semana.
Tu programa debe leer una variable llamada "diaNumero" e 
imprimir (console.log) el día correspondiente de la semana,
 donde 0 es domingo y 6 es sábado.

Para cualesquiera otros valores, tu programa debe imprimir "Numero de día invalido".
Prueba tu programa para todos los valores de días de la semana.
*/

let diaNumero = parseInt(prompt("Introduce el número del día de la semana (0 es Domingo y 6 es Sábado): "));

switch (diaNumero)
{
    case 0:
        console.log("Tu día es Domingo");
        break;
    case 1:
        console.log("Tu día es Lunes");
        break;
    case 2:
        console.log("Tu día es Martes");
        break;
    case 3:
        console.log("Tu día es Miércoles");
        break;
    case 4:
        console.log("Tu día es Jueves");
        break;
    case 5:
        console.log("Tu día es Viernes");
        break;
    case 6:
        console.log("Tu día es Sábado");
        break;
    default:
        console.log("Número de día inválido");
        break;
}

if (q && p) console.log("true");

let q = false;
let p = false;

if (!(!q || p)) console.log("true");