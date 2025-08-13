var valores = [8, 1, 7, 4, 2, 9] // Vetores em JavaScript

// Método For

for (var pos = 0; pos < valores.length; pos++ ) {
    console.log(`Posição ${pos} | Valor ${valores[pos]}`)
}

// Método For | In

for (var pos in valores) {
    console.log(`Posição ${pos} | Valor ${valores[pos]}`)
}

var numero = [6, 5, 3, 8, 9, 1]
numero.push(1)
numero.sort()
var prev = numero.indexOf(2)
if (prev == -1) {
    console.log('O valor não foi encontrado')
} else {
    console.log(`O valor 8 está na posição ${pos}`)
}
