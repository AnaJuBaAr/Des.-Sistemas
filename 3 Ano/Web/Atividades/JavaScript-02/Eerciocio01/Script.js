function resposta(){
    let horaBr = Number(document.getElementById("fusoBR").value)
    let fuso = horaBr + 5
    let horaFr
    if (fuso > 24){
        horaFr = fuso - 24
        document.getElementById("resposta").innerHTML = "Hora na França: " + horaFr.toFixed(2)
    } else{
        horaFr = fuso
        document.getElementById("resposta").innerHTML = "Hora na França: " + horaFr.toFixed(2)
    }
}
