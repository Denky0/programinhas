var agora = new Date()
var hora = agora.getHours()
console.log(`Agora são ${hora} horas.`)
if (hora < 12) {
    console.log('Está de Manhã')
} else if (hora <= 18) {
    console.log('Está de Tarde')
} else {
    console.log('Está de Noite')
}