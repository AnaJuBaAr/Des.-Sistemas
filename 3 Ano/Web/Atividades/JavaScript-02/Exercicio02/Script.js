function resposta() {
    let number = Number(document.getElementById("numero").value)

    let raiz = Math.sqrt(number)

    if(raiz % 2 == 0){
        document.getElementById("resposta").innerHTML = "Raiz de " + number + " é igual a " + raiz
    } else{
        document.getElementById("resposta").innerHTML = "Não há raiz exata para " + number
    }
}