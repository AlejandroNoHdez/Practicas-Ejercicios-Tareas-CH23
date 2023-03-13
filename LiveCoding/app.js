function cadena(texto, array)
{
    let newArray = [];
    for (let i = 0; i < array.length; i++)
    {
        if (array[i].length > texto.length)
        {
            newArray.push(array[i]);
        }
    }
    return newArray;
}

const myArray = ['oscar', 'alejandro', 'esmeraldita'];

console.log(cadena("oscar", myArray));