function cambiarElemento()
{
    let contenido = prompt("Ingresa el contenido: ");
    let element = document.getElementById("card1");
    element.innerHTML = (contenido);
}

function cambiarElemento2()
{
    let contenido = prompt("Ingresa tu nombre: ");
    let element = document.getElementById("card2");
    element.innerHTML = (contenido);
}