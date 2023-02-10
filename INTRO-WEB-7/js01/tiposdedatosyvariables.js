/*var nombre = "Alejandro";
var edad = 30;
var tengomascotas = true;
var tengotrabajo = false;
var tengosueldo;

let nombre = "Alejandro";
let edad = 30;
let tengomascotas = true;
let tengotrabajo = false;
let tengosueldo;*/

function horas()
{
    let horasTrabajadas = parseInt(prompt("Cuantas horas?"));
    let coste = parseInt(prompt("Coste por hora"));
    document.write("Total = " + (horasTrabajadas * coste));
}

function operacion(a, b, c, d)
{
    let suma = a + b;
    let mul = d * c;
    let res = suma / mul;
    return res
}

function imc()
{
    let peso = parseInt(prompt("Cuál es tu peso en (lb)?"));
    let estatura = parseInt(prompt("Cual es tu estatura (cm)?"));
    peso = peso * 0.453592;
    estatura = estatura / 100;
    let imc = peso / (estatura ** 2);
    if (imc < 16)
    {
        console.log("Criterio de ingreso");
    }
    else if (imc >= 16 && imc <= 16.9)
    {
        console.log("Infrapeso");
    }
    else if (imc >= 17 && imc <= 18.4)
    {
        console.log("Bajo peso");
    }
    else if (imc >= 18.5 && imc <= 24.9)
    {
        console.log("Peso Normal");
    }
    else if (imc >= 25 && imc <= 29.9)
    {
        console.log("Sobre peso");
    }
    else if (imc >= 30 && imc <= 34.9)
    {
        console.log("Obesidad premorbida");
    }
    else if (imc >= 35 && imc <= 45)
    {
        console.log("Obesidad morbida");
    }
    else if (imc > 45)
    {
        console.log("Obesidad hipermorbida");
    }
    console.log("tu peso es :" + peso)
    console.log("tu imc es de :" + imc)
}