
var valEntrada = 200;

function resumen(){
    /*var cantidad = document.getElementById("cantidadEntr").value;
    var descuento = document.getElementById("inputCateg").value;
    var preciofinal = cantidad * (valEntrada - (valEntrada * descuento) / 100);
    document.getElementById("Total").value = "Total a pagar: " + preciofinal + " $";*/

    document.getElementById("Total").value = "Total a pagar: " + document.getElementById("cantidadEntr").value  * 
        (valEntrada - (valEntrada * document.getElementById("inputCateg").value) /100) + " $";
}