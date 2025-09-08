// Estrutura de Repetições
var c = 1
while (c <= 10) {
    console.log(`Passo ${c}`)
    c++ 
} 

var b = 1
do {
    console.log(`Pedalada ${b}`)
    b++ 
} while (b <= 10)

// São a mesma coisa, mas uma faz o teste lógico no início e a outra no final.

console.log('Início')
for(var a = 1; a <= 10; a++) {
    console.log(a)
}
console.log('Acabou!')

// Mesma coisa do While mas bem mais prático e redusido 