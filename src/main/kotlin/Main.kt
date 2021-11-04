import alunos.Estudante
import metodos.Cursos
import java.lang.Exception

//https://github.com/generation-org/KOTLIN/tree/main/Object%20Oriented%20Programming%20-%20Fundamentals

fun main(args: Array<String>) {

    var guilhonardo = Estudante("Guilhonardo", "Calderaro"
        , 123, 78.0, 6)

    var milerio = Estudante("Milerio", "Xapizko"
        , 124, 11.0, 5)

    var sanada = Estudante("Yukimura", "Sanada"
        , 125, 100.0, 8)

    var tanjiro = Estudante("Tanjiro", "Pilaro"
        , 126, 58.0, 4)

    var sidona = Estudante("Sidona", "Cida"
        , 127, 60.0, 3)

    guilhonardo.fullName()
    guilhonardo.mudarAno()

    val cursoIngles = Cursos("Inglês", "Janice", 1)

    cursoIngles.addEstudante(milerio)
    cursoIngles.addEstudante(sanada)
    cursoIngles.quantosEstudantes()

    cursoIngles.removeEstudante(sidona)
    val estudantes: Array<Estudante?> = arrayOf(tanjiro, sidona)
    cursoIngles.addEstudante(estudantes)

    cursoIngles.quantosEstudantes()
    cursoIngles.melhorGrade()

    try {
        cursoIngles.verificarAluno(milerio)
    }catch (e: Exception){
        println(e.message)
    }

}