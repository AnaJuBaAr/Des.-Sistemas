function resposta() {
    let valor = Number(document.getElementById("saque").value)

    nota100 = Math.floor(valor / 100)
    nota50 = Math.floor((valor - nota100*100)/50)
    nota10 = Math.floor((valor - nota100*100 - nota50*50)/10)

    document.getElementById("resposta1").innerHTML = "Notas de R$100,00: " + nota100
    document.getElementById("resposta2").innerHTML = "Notas de R$50,00: " + nota50
    document.getElementById("resposta3").innerHTML = "Notas de R$10,00: " + nota10
}