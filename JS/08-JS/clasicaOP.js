class OperacionesAritmeticas
{
    numero0 = 0;
    numero1 = 0;

    constructor(numero0, numero1)
    {
        this.numero0 = numero0;
        this.numero1 = numero1;
    }

    sumar()
    {
        return this.numero0 + this.numero1;
    }

    restar()
    {
        return this.numero0 - this.numero1;
    }

    multiplicar()
    {
        return this.numero0 * this.numero1;
    }

    dividir()
    {
        return this.numero0 / this.numero1;
    }
}

let obj4 = new OperacionesAritmeticas(8, 6);
console.log('---> ' + obj4.sumar());


let obj3 = new OperacionesAritmeticas();
obj3.numero0 = 8;
obj3.numero1 = 5;
console.log(obj3.sumar(obj3.numero0, obj3.numero1));

let obj2 = new OperacionesAritmeticas();
console.log(obj2.sumar(5, 6));

let obj1;
obj1 = new OperacionesAritmeticas();
let a = obj1.numero0;
console.log('--> ', a);