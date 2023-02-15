//Ejercicio 1
let names = ["Maria", "Antony", "Joy", "Juan"];

//Parte 1:
function insertarNombre(nombre)
{
    names.push(nombre);
    return;
}
insertarNombre("Bryan");
console.log(names);

//Parte 2:
function buscarNombre(nombre)
{
    let contiene = names.includes(nombre);
    return contiene;
}
console.log(buscarNombre("Bryan"));

//Parte 3:
let names2 = ["Maria", "Antony", "Joy", "Juan"];
let nombres = ["Miguel", "Maria", "Martina", "Edith"];
function unirListas(lista1, lista2)
{
    let duplicados = [];
    for (let i = 0; i < lista1.length; i++)
    {
        if (lista2.includes(lista1[i]))
        {
            duplicados[i] = lista1[i];
        }
    }
    return duplicados;
}
console.log(unirListas(names2, nombres));

//Parte 4:
let names3 = ["Maria", "Antony", "Joy", "Juan"];
function longitudLista(lista)
{
    let longitudes = [];
    for (let i = 0; i < lista.length; i++)
    {
        longitudes[i] = lista[i].length;
    }
    return longitudes;
}
console.log(longitudLista(names3));

//Ejercicio 2
false || (true && false);
true || (11 + 12);
(31 + 22) || true;
true && (1 + 7);
false && (3 + 4);
(1 + 2) && true;
(32 * 4) >= 129;
false !== !true;
true === 4;
false === (847 === '847');
false === (887 == '887');
(!true || (!(100 / 5) === 20) || ((328 / 4) === 82)) || false;
//Son expresiones booleandas que nos pueden servir como condicionales para determinar las propiedades de un objeto

//Ejercicio 3
function numberRange(numero)
{
    if (numero >= 0 && numero <= 25)
    {
        return console.log(numero + " está entre 0 y 25");
    }
    else if (numero > 25 && numero <= 100)
    {
        return console.log(numero + " está entre 26 y 100");
    }
    else if (numero > 100)
    {
        return console.log(numero + " es mayor que 100");
    }
    else
    {
        return console.log(numero + " es menor que 0");
    }
}
numberRange(-25);

//Adicional
var a;
var b = null;
var c = undefined;
var d = 4;
var e = 'five';
var f = a || b || c || d || e;

console.log(f); //Es 4 porque es el primer valor no vacio o indefinido que si se puede asignar a F