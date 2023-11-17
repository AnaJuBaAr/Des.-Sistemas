function resposta() {
    let quilo = document.getElementById("quilo").value
    let cliente = document.getElementById("cliente").value

    let preco = quilo * (cliente / 1000)

    document.getElementById("resposta1").textContent = "Valor a Pagar: R$" + preco
}

let but = document.getElementById("botao")
but.onclick = resposta