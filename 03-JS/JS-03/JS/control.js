// if (condition){
//     Bloque código
// } else

let edad = parseInt(prompt("Escribe tu edad: "));

if (edad < 18)
{
    document.write("<h2>Tas chiquito</h2>");
}
else if (edad == 18)
{
    document.write("<h2>Tas en tu punto</h2>");
}
else if (edad > 18)
{
    document.write("<h2>Tas ruco</h2");
}
else
{
    document.write("<h2>Este no es un número válido</h2>");
}