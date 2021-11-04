package metodos

import alunos.Estudante

    class Cursos (val courseName: String?,
              var professorName: String?,
              var ano: Int?) {

    private val listEstudante = mutableListOf<Estudante?>()  //privado

    fun addEstudante(aluno: Estudante?) {
        listEstudante.add(aluno)
        println("Alunos.Estudante foi cadastrado!")
    }

    fun addEstudante(alunos: Array<Estudante?>?) {
        if (alunos != null) {
            for(i in alunos){
                listEstudante.add(i)
            }
        }
        println("Estudantes cadastrados.")
    }

    fun removeEstudante(aluno: Estudante?) {
        if (listEstudante.contains(aluno)){
            listEstudante.remove(aluno)
            println("Alunos.Estudante removido.")
        }else{
            println("Aluno inexistente.")
        }
    }

    fun quantosEstudantes(){
        println("O numero de estudantes cadastrado é ${listEstudante.size}")
    }

    fun melhorGrade(){
        var bestNota = listEstudante[0]?.nota
        for(i in listEstudante){
            if(i?.nota!! > bestNota!!){
                bestNota = i.nota
            }
        }
        println("A melhor nota foi $bestNota")
    }
        fun verificarAluno(estudante: Estudante) {
           if (listEstudante.contains(estudante)){
               println("O estudante esta na lista.")
           }else{
               throw Exception("Deu errado irmão.")
           }
        }
}

/*
 println("Digite o nome do aluno para verificar: ")
            val tempAluno = readLine()!!
            var nomeAtual: String = ""
            for(i in listEstudante){

                if(i?.firstNome!! == tempAluno){
                    nomeAtual = i.firstNome!!
                }
            }
            println(nomeAtual)

            if(tempAluno == nomeAtual){
                println("O aluno $tempAluno, está matriculado.")
            }else{
                throw Exception("Deu errado irmão.")
            }
 */