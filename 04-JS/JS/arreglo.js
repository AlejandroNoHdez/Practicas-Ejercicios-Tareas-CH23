let lista = [12, 5, 80, 34, 7];

lista.sort(
    function (valor1, valor2)
    {
        return valor1 > valor2;
    }
);
console.log(lista);

lista.sort();
console.log(lista);

lista.reverse();
console.log(lista);

let remover = lista.splice(1, 2);
console.log(remover);
console.log(lista);
lista.splice(2, 0, 100, 200, 300);
console.log(lista);

lista.shift();
console.log(lista);

lista.pop();
console.log(lista);

let masE = lista.concat(100, 200, 300);
console.log(masE);

lista.push(100);
console.log(lista);

let msj = lista.join("-");
console.log(msj);

let listaNueva = lista.slice(1, 4);
console.log(listaNueva);

//console.log(lista.length);

for (let index = 0; index < lista.length; index++)
{
    console.log("--> " + lista[index]);
}
console.log(lista);