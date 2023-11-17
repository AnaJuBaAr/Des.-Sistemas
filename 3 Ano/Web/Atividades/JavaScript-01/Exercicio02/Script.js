function resposta() {
    let veiculo = document.getElementById("veiculo").value
    let preco = document.getElementById("preco").value

    let promocao = preco/2
    let parcelas = promocao/12

    document.getElementById("resposta1").textContent = "Promoção: " + veiculo
    document.getElementById("resposta2").textContent = "Entrada de: R$" + promocao
    document.getElementById("resposta3").textContent = "+ 12X de " + parcelas
}

let but = document.getElementById("botao")
but.onclick = resposta