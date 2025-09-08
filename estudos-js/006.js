var agora = new Date()
var dia_da_semana = agora.getDay()

<<<<<<< HEAD
=======
// Utilizando o método Switch-Case
>>>>>>> 16c707ea5d7cb4d8d0b5d683600e67935a24f5c5
switch(dia_da_semana) {
    case 0:
        console.log('Domingo')
        break
    case 1:
        console.log('Segunda')
        break
    case 2:
        console.log('Terça')
        break
    case 3:
        console.log('Quarta')
        break
    case 4:
        console.log('Quinta')
        break
    case 5:
        console.log('Sexta')
        break
    case 6:
        console.log('Sábado')
        break
    default:
        console.log('[ERRO!] Dia Inválido')
        break
}