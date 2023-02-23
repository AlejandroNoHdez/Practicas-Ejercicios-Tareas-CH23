//Prueba efectiva

//const indexTest = require("../calculadora"); ECMA5

import { indexTest } from "../calculadora"; // ECMA6

test('test suma', () =>
{
    const r = indexTest.suma(3, 2);
    expect(r).toBe(5);
})

test.todo('test resta');
test.todo('test multi');
test.todo('test div');