var valores = [8, 1, 7, 4, 2, 9] // Vetores em JavaScript

// Método For
for (var pos = 0; pos < valores.length; pos++ ) {
    console.log(`Posição ${pos} | Valor ${valores[pos]}`)
}

// Método For | In
for (var pos in valores) {
    console.log(`Posição ${pos} | Valor ${valores[pos]}`)
}