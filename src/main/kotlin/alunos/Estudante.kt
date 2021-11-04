package alunos

class Estudante (private var lastNome: String?, var firstNome: String?, var alunoRa: Int){

    var nota = 0.0
    var ano = 0

    constructor(firstNome: String?, lastNome: String?,
                alunoRa: Int, nota: Double): this(firstNome, lastNome, alunoRa){
                    this.nota = nota
                }

    constructor(firstNome: String?, lastNome: String?,
                alunoRa: Int, nota: Double, ano: Int): this(firstNome, lastNome, alunoRa, nota){
                this.ano = ano
                }

    fun fullName (): String{
        return "$lastNome $firstNome"
    }

    private val aprovado : Boolean //privado
        get() {
            return nota >= 60.0
        }

    fun mudarAno (){
        if (aprovado){
            ano += 1
            println("Parabéns, foi aprovado.")
        }else{
            println("Tu foi reprovado.")
        }
    }
}