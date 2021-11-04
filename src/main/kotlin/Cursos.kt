class Cursos (val courseName: String?,
              var professorName: String?,
              var ano: Int?) {

    val listEstudante = mutableListOf<Estudante?>()

    fun addEstudante(aluno: Estudante?) {
        listEstudante.add(aluno)
        println("Estudante foi cadastrado!")
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
            println("Estudante removido.")
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
}