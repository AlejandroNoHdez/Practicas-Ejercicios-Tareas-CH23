// JavaScript síncrono

alert("Cohorte 23");
console.log("Hola Buen día");
alert("Día del gatito");
console.log("Adiós");

setTimeout(
    function ()
    {
        console.log("Hola mundo, con retraso");
    }, 1000)
console.log("Sorpresa!");

const myCallback = () => { console.log("Hola Mundo con retraso") };
setTimeout(myCallback);

console.log("Sorpresa!");