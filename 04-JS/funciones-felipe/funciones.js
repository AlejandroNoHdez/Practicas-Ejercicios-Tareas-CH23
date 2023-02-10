/*

*Funciones

- Definicion de funciones

Una función en JavaScript es un bloque de código reutilizable que se puede ejecutar una y otra vez. Se utilizan para encapsular una serie de declaraciones (instrucciones) y así poder realizar una tarea específica. Las funciones pueden tener nombre, pueden recibir parametros y pueden devolver valores. Es importante mencionar que las funciones no se ejecutan sino que se invocan.


Por que son importantes las funciones?
    - Nos permite reutilizar codigo en lugar de escribirlo varias veces. Podemos llamar nuestra funcion en distintos lugares de nuestro programa, y así lo usamos cuando lo necesitamos sin necesidad de escribirlo de nuevo.
    - Nos permite modularizar nuestro codigo, esto es, dividir nuestra aplicacion en partes mas pequeñas e independientes. Así mejoramos el entendimiento y comprensión del código.
    - Mantienen su propio espacio, y las variable que se encuentran dentro de una funcion no se pueden acceder fuera de ella (scope).
    - Por que podemos probar pequeñas partes de nuestro programa de forma aislada. (Debugging)



Cosas a tener en cuenta para crear una funcion:
- Nombre: El nombre de la función debe ser descriptivo y reflejar claramente lo que hace, para esto es necesario comprender el proposito de la funcion.
- Definir los datos que entran en la funcion. 
- Definir los datos que se necesitan dentro de la funcion
- Decidir el conjunto de pasos o acciones que utilizara el programa para lograr este objetivo.



Una funcion se define con la palabra reservada function, seguida del nombre de la funcion (que puede contener digitos, letras, guiones, etc) y seguido de un parentesis.

En el parentesis, vamos a recibir los parametros dentro de la funcion, esos se separan por comas y se usan como variables o constantes dentro de la funcion.

El codigo que se encuentra dentro de una funcion es ejecutado cuando esta funcion se invoca, esto puede ocurrir en 3 posibles escenarios:
    - Cuando la funcion se invoca desde un evento (onclick), que es cuando el usuario hace clic en un boton, una imagen, un link, etc.
    - Cuando la funcion es invocada desde otra parte del codigo
    - Cuando se invoca a si misma (recursividad) 


Es importante saber que las funciones, primero se crean y luego se invocan. Si no se invocan, no se ejecutan. */

function suma()
{ //Creamos la funcion
}

suma(); //Llamamos a la funcion



/* Formas de crear e invocar funciones

1- Crear una funcion y asignarle un nombre (la forma mas comun)
2- Crear una variable y asignarle una función (funcion anónima)
3. Como un método de un objeto (algo que hace un objeto)
4. Como un constructor (algo que sirve para crear un objeto)
*/



//Funcion creada y con un nombre asignado
function suma()
{
    let valor1 = 5;
    let valor2 = 10;
    let suma = valor1 + valor2;
    console.log("Esta es mi primer funcion: ", suma);
}
suma(); //Llamamos a la funcion y obtenemos el resultado 15



//Variable que contiene la funcion (anonima)
let x = function ()
{
    let valor1 = 5;
    let valor2 = 10;
    let suma = valor1 + valor2;
    console.log("Esta funcion anonima: ", suma);
}
x(); //Llamamos a la funcion



//Funcion como un metodo
var perrito = {
    funcionLadrar: function ()
    {
        console.log("Guau guau");
    }
};

perrito.funcionLadrar();



//Funcion como un constructor
function moldeDePanque()
{
    this.cocinarPanque = "Estoy cocinando un panque";
}

var panque = new moldeDePanque();
console.log(panque.cocinarPanque);


//Si utilizamos esta segunda forma (asignar la funcion a una variable) entonces estamos hablando de una funcion anonima. Las funciones anonimas son todas aquellas que no tienen un nombre. Una funcion anonima no es accesible despues de su creacion inicial, solo podemos acceder a ella medianta la variable que la contiene.


//Otra funcion anonima

var saludo = function ()
{
    console.log("Hola Generation!, como estan? Los saludo desde una funcion anonima");
}

saludo();




/*
* Parametros

Las funciones no son funciones sin parametros. Los parametros son los valores que van dentro del parentesis de la funcion. Estos valores solo funcinan dentro de la funcion, no se pueden usar fuera de la funcion. */


//Estas son variables globales, y si se dan cuenta, no afectan a nuestro bloque de codigo porque el bloque de codigo usa variables locales, por lo que no se veran afectadas.

var numero1 = 30;
var numero2 = 20;

//Funcion para sumar dos valores, asignando los parametros dentro de la funcion
function suma()
{
    let valor1 = 5;
    let valor2 = 10;
    let suma = valor1 + valor2;
    console.log("La suma de los dos valores es: ", suma);
}
suma(); //Llamamos a la funcion y obtenemos el resultado 15


//Funcion para calcular la resta de dos valores, asignando los parametros dentro del parentesis de la funcion

function resta(valor1, valor2)
{
    let resta = valor1 - valor2;
    console.log("La resta de los dos valores es: ", resta);
}

resta(10, 50); //Llamamos a la funcion y obtenemos el resultado -40
resta(45, 12); //Llama a la funcion y obtiene el resultado 33
resta(5); //Llama a la funcion y obtenemos el resultado NaN porque nos falta un parametro


//Funcion para calcular area de triangulo (no recibe parametros)
function areaTriangulo(base, altura)
{
    let area = base * altura / 2;
    console.log("El area del triangulo es :", area);
}

areaTriangulo(); //Llamamos a la funcion y obtenemos el resultado NaN, por que no esta recibiendo parametros

//Funcion para calcular area de triangulo (recibe parametros cuando invocamos la funcion)

function areaTriangulo2(base, altura)
{
    let area = base * altura / 2;
    console.log("El area del triangulo es :", area);
}

areaTriangulo2(10, 5); //Llamamos a la funcion y obtenemos el resultado 25
areaTriangulo2(20, 10); //Llamamos a la funcion y obtenemos el resultado 100
areaTriangulo(30, 15); //Llamamos a la funcion y obtenemos el resultado 225



/*

- Return

La sentencia return finaliza la ejecucion de la funcion, y especifica un valor para ser devuelto a quien llama a la funcion. O lo que es lo mismo, usamos return para finalizar y tambien para poder asignar el resultado a una variable.

HABLA ACERCA DE QUE SI NO USAMOS EL RETURN, LA FUNCION NUNCA TERMINA, Y SI QUEREMOS USAR EL RESULTADO PARA ALGO DESPUES, NO SE PODRA PORQUE NO SE ESTA ASIGNANDO A NADA.*/

function areaCuadrado()
{
    let lado = 5;
    let area = lado * lado;; //Al usar return podemos asignar el resultado a una variable
    return area;
}

areaCuadrado();

console.log("Te mostrare el resultado de mi funcion llamada areaCuadrado: ", areaCuadrado()); //Aqui nos mostrara undefined en la consola, por que no se esta asignando el resultado a ninguna variable.

let resultadoQueUsareMasTarde = areaCuadrado(); //Guardamos el resultado en una variable

console.log("Usare mi resultado que guarde para mostrarte el area del cuadrado: ", resultadoQueUsareMasTarde); //Llamamos a la funcion y obtenemos el resultado 25


/*

- Scope

Todas las funciones que creamos, tienen un scope GLOBAL, esto quiere decir que podemos llamar nuestras funciones desde cualquier parte del codigo. En cambio, las variables que creamos dentro de una funcion, solo estan disponibles dentro de la funcion (scope local). */

function suma()
{
    let valor1 = 5; //OJITO si le quitamos let a nuestra variable, se convertira en una variable global, y podremos usarla desde cualquier parte del codigo. PERO NOS PUEDE DAR ERRORES
    let valor2 = 10;
    let suma = valor1 + valor2;
    console.log("La suma de los dos valores es: ", suma);

}
suma(); //Llamamos a la funcion y obtenemos el resultado 15

//console.log ("Quiero ver el valor de mi primer numero", valor1); //Esto nos dara un error, porque no esta disponible este valor fuera de la funcion, por lo que no podemos acceder a ella.


//Contexto o alcance global
var xm = 10;

function myFunction()
{
    // Ámbito local
    var y = 20;
    console.log(xm); // Imprime 10
    console.log(y); // Imprime 20
}

myFunction();
console.log(xm); // Imprime 10
//console.log(y); // ReferenceError: y is not defined


/*
El hoisting es un comportamiento de JavaScript en el que las declaraciones de variables y funciones se mueven al inicio del contexto actual antes de que se ejecute el código. Esto significa que, en teoría, las declaraciones de variables y funciones pueden ser accedidas antes de que sean definidas en el código. Sin embargo, solo las declaraciones de variables se mueven realmente al inicio del contexto y las inicializaciones de variables permanecen en su posición original.

Es importante tener en cuenta que el hoisting puede causar confusiones y errores si no se comprende cómo funciona y se utiliza correctamente. Por eso, es mejor siempre declarar las variables y funciones al principio del contexto en el que van a ser utilizadas para evitar confusiones y errores.

*/


//Hoisting
console.log(x); // Imprime undefined
//var x = 10;


/*

Funciones flecha

Las funciones flecha (arrow functions en inglés) son una forma abreviada y concisa de escribir funciones en JavaScript. Son una característica introducida en ECMAScript 6 (ES6) y han sido ampliamente adoptadas en la comunidad de desarrolladores de JavaScript.


Sintaxis de una funcion flecha

const myFunction = (params) => {
  // Código de la función
};



Las funciones flecha tienen algunas características únicas:

    No tienen una palabra clave function.
    Tienen una sintaxis más corta y concisa.
    Tienen un this lexico, lo que significa que el this dentro de la función siempre se refiere al this del contexto en el que se define la función, no al this del contexto en el que se invoca la función.
    No tienen una palabra clave arguments.




*/

const sum = (a, b) => a + b;

console.log(sum(1, 2)); // Imprime 3


/*
Las funciones flecha son útiles para escribir funciones de una sola línea de manera más concisa y legible. Sin embargo, es importante tener en cuenta que las funciones flecha no deben utilizarse en todas las situaciones, ya que tienen algunas limitaciones y restricciones en comparación con las funciones normales. Por ejemplo, no se pueden utilizar para crear constructores 

*/


// Función directa
// function sum(a, b)
// {
//     return a + b;
// }

// Función flecha
// const sum = (a, b) => a + b;


/*Pasos para convertir una funcion normal o directa a una funcion flecha

El proceso de convertir una función directa a una función flecha es el siguiente:

    Elimine la palabra clave function y reemplace function con const y el nombre de la función.
    Agregue un operador de flecha => después de los parámetros de la función.
    Si la función solo tiene una línea de código, elimine las llaves y la palabra clave return.

Es importante tener en cuenta que, si la función original tenía más de una línea de código o utilizaba una palabra clave this, entonces la conversión a una función flecha puede no ser posible o puede requerir una reescritura más significativa del código. En tales casos, es posible que sea mejor mantener la función como una función directa.


*/









//Esta es nuestra funcion tradicional

function sumita(numero1, numero2)
{
    return numero1 + numero2;
}

/*Si queremos convertirla a una funcion flecha, debemos hacer lo siguiente:

- Eliminamos la palabra function, y nos limitamos a recoger los parametros mediante parentesis tradicionales
- Podemos eliminar las llaves que delimintan el cuerpo de la funcion, abriendolo con una flecha
- Podemos eliminar el return, porque se usa implicitamente
*/

var sumita = (numero1, numero2) => numero1 + numero2;

//Las funciones flecha son siempre anonimas, estamos usando una estructura declarativa donde asignamos la funcion a una variable.

//A pesar de que de principio es complicado entender su estructura, cuando nos acostumbremos podemos usar una funcion flecha para disminuir el codigo y tener una sintaxis mucho mas limpia y simple.

//INVESTIGAR REFACTORIZACION DE CODIGO

function saludar(nombre)
{
    let saludo = "Hola " + nombre;
    console.log(saludo);
}

saludar("Juan"); //Llamamos a la funcion y obtenemos el resultado Hola Juan
saludar("Felipe"); //Llamamos a la funcion y obtenemos el resultado Hola Felipe

//Conviritiendo a funcion flecha (funcion anonima)

let otroSaludo = nombre => console.log("Hola " + nombre);

otroSaludo("Rosa");
otroSaludo("Ivonne");


/*Si queremos convertirla a una funcion flecha, debemos hacer lo siguiente:

- Eliminamos la palabra function, y nos limitamos a recoger los parametros mediante parentesis tradicionales
- Podemos eliminar las llaves que delimintan el cuerpo de la funcion, abriendolo con una flecha
- Podemos eliminar el return, porque se usa implicitamente
*/