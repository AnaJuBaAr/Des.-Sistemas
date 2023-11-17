function resposta() {
    let filme = document.getElementById("titulo").value;
    let time = document.getElementById("duracao").value;
    
    let hora = Math.floor(time/60);
    let minuto = time%60;
    
    document.getElementById("resposta").textContent = filme;
    document.getElementById("resposta2").textContent = hora + " hora(s) e " + minuto + " minuto(s)"
}

let but = document.getElementById("botao");
but.onclick = resposta;