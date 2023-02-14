let miVariable = 34;

let miArreglo = []; // declaración Literal
let miArreglo01 = new Array(); // por instancia

let miArreglo02 = [31, 32, 33, 34];
console.log("dato de miArreglo en el índice 0: " + miArreglo02[0]);
console.log("dato de miArreglo en el índice 1: " + miArreglo02[1]);
console.log("dato de miArreglo en el índice 2: " + miArreglo02[2]);
console.log("dato de miArreglo en el índice 3: " + miArreglo02[3]);
console.log("el tamaño del arreglo es: " + miArreglo02.length);

let miArreglo03 = ["Hola", "que", "tal"];
console.log(miArreglo03[0]);
console.log(miArreglo03[1]);
console.log(miArreglo03[2]);
console.log("el tamaño del arreglo es: " + miArreglo03.length);

let miArreglo04 = [{ nombre: "Hugo" }, { apellido: "Fernández" }, { edad: 23 }];
console.log("elemento del arreglo de tipo objeto: " + miArreglo04[0].nombre);
console.log("elemento del arreglo de tipo objeto: " + miArreglo04[1].apellido);
console.log("elemento del arreglo de tipo objeto: " + miArreglo04[2].edad);
console.log("el tamaño del arreglo es: " + miArreglo04.length);

let nuevoArreglo00 = [3, 6, 1, 4];
console.log("Orden de mi arreglo es: " + nuevoArreglo00.sort());
console.log("Orden de mi arreglo es: " + nuevoArreglo00.pop());
console.log("Orden de mi arreglo es: " + nuevoArreglo00.push(10));
console.log("Orden de mi arreglo es: " + nuevoArreglo00.reverse());

let otroArreglo = ["que", "hola", "tal", "como"];
console.log("Orden de mi arreglo es: " + otroArreglo.sort());
console.log("Orden de mi arreglo es: " + otroArreglo.pop());
console.log("Orden de mi arreglo es: " + otroArreglo.push("estas"));
console.log("Orden de mi arreglo es: " + otroArreglo.reverse());

console.log("javascript"[2]);
console.log("javascript".length);

let matriz = [[1, 2, 3], [4, 5, 6], [7, 8, 9]];
console.log("tamaño: " + matriz.length);
console.log("matriz: " + matriz[1][1]);
console.log("matriz: " + matriz[2][1]);
console.log("matriz: " + matriz[0][2]);