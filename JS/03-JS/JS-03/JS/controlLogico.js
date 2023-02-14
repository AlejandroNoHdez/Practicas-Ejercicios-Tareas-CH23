let hora = Number(prompt("Indica la hora: "));

if (hora >= 6 && hora <= 11)
{
    document.write("Buenos días");
}
else if (hora >= 12 && hora <= 18)
{
    document.write("Buenas tardes");
}
else if (hora >= 19 && hora <= 24)
{
    document.write("Buenas noches");
}
else if (hora >= 0 && hora <= 5)
{
    document.write("dejame dormir");
}
else
{
    document.write("Hora no válida");
}