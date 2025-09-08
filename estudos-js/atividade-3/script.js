function contar() {
    var inicio = document.getElementById('texto-inicio')
    var fim = document.getElementById('texto-fim')
    var passo = document.getElementById('texto-passo')
    var resultado = document.getElementById('resultado')

    if (inicio.value.length == 0 || fim.value.length == 0 || passo.value.length == 0) {
        resultado.innerHTML = 'Impossível contar!'
    } else {
        resultado.innerHTML = 'Contando: <br>'
        var i = Number(inicio.value)
        var f = Number(fim.value)
        var p = Number(passo.value)

        if (p <= 0) {
            alert('Passo inválido! Considerando PASSO 1')
            p = 1
        }

        if (i < f) { // Contagem na Ordem Crescente
            for (var c = i; c <= f; c += p) {
                resultado.innerHTML += `${c} \u{1F449}` 
            }   
        } else { // Contagem na Ordem Decrescente
            for (var c = i; c >= f; c -= p) {
                resultado.innerHTML += `${c} \u{1F449}`
            }
        }   
        resultado.innerHTML += `\u{1F3C1}`  
    }   
}