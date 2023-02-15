//Ejercicios

//Ejercicio 1
function graduar(gpaAcumulativo, unidadesTotales)
{
    if (gpaAcumulativo > 2.0 && unidadesTotales > 120)
    {
        return console.log("¡Puede graduarse!");
    }
}
console.log(graduar(3.0, 122));

//Ejercicio 2
function elegible(cspCalificacion, progCalificacion)
{
    if (cspCalificacion >= 75 || progCalificacion >= 75)
    {
        return console.log("¡Eres elegible para la graduación");
    }
}
console.log(elegible(75, 60));

//Ejercicio 3
let texto = "HoLa Mundo";
let mensaje = "";
for (let i = 0; i < texto.length; i++)
{
    mensaje += texto[i] + ".";
}
let cadena1 = mensaje.substring(0, 7);
let cadena2 = mensaje.substring(10, 19);
mensaje = cadena1 + " " + cadena2;
console.log(mensaje);