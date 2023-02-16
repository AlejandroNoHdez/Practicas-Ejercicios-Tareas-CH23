/*
    ¡Qué encontramos en el árbol del DOM?

    - Node: Es la unidad más básica dentro del documento. Puede ser una etiqueta, un texto dentro de una etiqueta o un comentario, etc.

    <title> NODO
        Manipulación DOM // Es un nodo, pero es hijo del title
    </title>

    - Document: También es un nodo, del tipo documento, es el nodo raiz a partir del cual se desarrollan o generan todos los demas nodos.

    - Element: Son todos aquellos definidos por etiquetas <div>, <img>, <h1>, <p>

    - Attributes: Nodos que dan información asocidada al tipo de elemento.

    - Comentario: Comentarios y otros elementos que están dento del HTML, son considerados nodos.

*/

/*¿Cómo leer nodos de mi Document Object Model (DOM

    Métodos tradicionales (que se usan en versiones antiguas)
        - document.getElementById (botonSuma)
        - document.getElementsByTagName (<button>)
        - document.getElementsByClassName (botones)
*/

// var elementoID = document.getElementById("botonSuma");
// console.log(elementoID);

// var elementoEtiqueta = document.getElementsByTagName("button");
// console.log(elementoEtiqueta);
// console.log("Este es el primer elemento de mi colección de botones", elementoEtiqueta[0]);

// var elementoClassName = document.getElementsByClassName("botones");
// console.log(elementoClassName);

/*

Métodos recientes

    - document.querySelector(#botonSuma)
    - document.querySelectorAll(.botones)
*/

// var unElemento = document.querySelector("#input1");
// console.log(unElemento);

// var variosElementos = document.querySelectorAll(".botones");
// console.log(variosElementos);

/*
Creación de nodos

    - document.createElement(tipoNodo)

*/

//Creación de una etiqueta del tipo imagen
var imagenPerrito = document.createElement("img");

//Creamos atributos a la etiqueta
imagenPerrito.src = "https://www.petdarling.com/wp-content/uploads/2021/01/cachorros.jpg"
imagenPerrito.alt = "Foto de perrito tierno"
imagenPerrito.style.width = "150px";
imagenPerrito.style.borderRadius = "100px";

//Poner elemento o nodos en el HTML
document.body.append(imagenPerrito);

//Actualizar nodos
//1er Paso: Identificar el nodo que quiero cambiar (outer)
//2do Paso: Modificar el nodo (inner)

var resultadoQueCambia = document.getElementById("resultado");

//resultadoQueCambia.innerHTML = "Saludos cambié el texto juas juas";


//Construir nuestra calculadora
var input1 = document.getElementById("input1");
var input2 = document.getElementById("input2");

var botonSuma = document.getElementById("botonSuma");
var botonResta = document.getElementById("botonResta");
var botonMultiplicacion = document.getElementById("botonMultiplicacion");
var botonDivision = document.getElementById("botonDivision");

var resultado = document.getElementById("resultado");