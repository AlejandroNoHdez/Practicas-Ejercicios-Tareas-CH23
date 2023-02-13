/*
switch (expresión) {
  case valor1:
    //Declaraciones ejecutadas cuando el resultado de expresión coincide con el valor1
    [break;]
  case valor2:
    //Declaraciones ejecutadas cuando el resultado de expresión coincide con el valor2
    [break;]
  ...
  case valorN:
    //Declaraciones ejecutadas cuando el resultado de expresión coincide con valorN
    [break;]
  default:
    //Declaraciones ejecutadas cuando ninguno de los valores coincide con el valor de la expresión
    [break;]
}
*/

let diaNumero = Number(prompt("Introduce el número del día de la semana (1 es Lunes y 7 es Domingo): "));

switch (diaNumero)
{
    case 1:
        document.write("<h2>Lunes</h2>");
        break;
    case 2:
        document.write("<h2>Martes</h2>");
        break;
    case 3:
        document.write("<h2>Miércoles</h2>");
        break;
    case 4:
        document.write("<h2>Jueves</h2>");
        break;
    case 5:
        document.write("<h2>Viernes</h2>");
        break;
    case 6:
        document.write("<h2>Sábado</h2>");
        break;
    case 7:
        document.write("<h2>Domingo</h2>");
        break;
    default:
        console.log("Número de día inválido");
        break;
}