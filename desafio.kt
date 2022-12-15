enum class Nivel (val curso: String) { BASICO("Programação Básica"), INTERMEDIARIO("Programação intermediária"), AVANCADO("Programação avançada");
fun retornarCurso() = curso
}


data class Usuario (val nome : String)

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
       // TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
       inscritos.add(usuario)
        
    }
    
    fun listarInfo(){
        println()
        println("Nome do Curso: $nome")
        println()
        println("Dificuldade: ${nivel.retornarCurso()}")
        println()
        println("Conteúdo: ")
        conteudos.forEach{
            println("${it.nome}: ${it.duracao/60} horas")
        }
        println()
        println("Inscritos: ")
        inscritos.forEach{
            println(it.nome)
        }
    }
}

fun main() {
   // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
   // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    
   
   // Conteúdos
  	
    val introducao = ConteudoEducacional("Introdução",300)
   	val orientacaoObjetos = ConteudoEducacional("Orientação a Objetos",600)
   	val orientacaoObjetos2 = ConteudoEducacional("Orientação a Objetos 2",600)
   	val orientacaoObjetos3= ConteudoEducacional("Orientação a Objetos 3",600)
   	val cursoCSharp = ConteudoEducacional("Curso C#",900)
   	val pythonFacil = ConteudoEducacional("Python Básico",450)
	val visaoComputacional = ConteudoEducacional("Visão computacional", 600)
    val machineLearning = ConteudoEducacional("Machine Learning",1200)
    val internetDasCoisas = ConteudoEducacional("Internet das Coisas",1200)
    val segurancaDaInformacao = ConteudoEducacional("Segurança da Informação", 1800)
    val inteligenciaArtificial = ConteudoEducacional("Inteligência Artificial",2400)
    
    // Java Básico
   
   val javaBasico: MutableList<ConteudoEducacional> = mutableListOf(introducao)
   
   javaBasico.add(orientacaoObjetos)
   javaBasico.add(orientacaoObjetos2)
   javaBasico.add(orientacaoObjetos3)
  
    val curso01 = Formacao("Java Básico",javaBasico,Nivel.BASICO)
   
    // C# Básico
   
   val cSharpBasico: MutableList<ConteudoEducacional> = mutableListOf(introducao)
   
   cSharpBasico.add(cursoCSharp)
   
   val curso02 = Formacao("C# Básico",cSharpBasico,Nivel.BASICO)
   
    // Python Básico
    
    val pythonBasico: MutableList<ConteudoEducacional> = mutableListOf(introducao)
    
    pythonBasico.add(pythonFacil)
    
    val curso03 = Formacao("Python Básico",pythonBasico,Nivel.BASICO)
    
    // Python Médio
    
    val pythonMedio: MutableList<ConteudoEducacional> = mutableListOf()
    
    pythonMedio.add(visaoComputacional)
    pythonMedio.add(machineLearning)
    
    val curso04 = Formacao("Python Médio",pythonMedio,Nivel.INTERMEDIARIO)
    
    // TI Avançado
    
    val tiAvancado: MutableList<ConteudoEducacional> = mutableListOf()
    
    tiAvancado.add(internetDasCoisas)
    tiAvancado.add(segurancaDaInformacao)
    tiAvancado.add(inteligenciaArtificial)
    
    val curso05 = Formacao("TI Avançado",tiAvancado,Nivel.AVANCADO)
    
    // Alunos
    
    val alice = Usuario("Alice")
    val bruna = Usuario("Bruna")
    val carlos = Usuario("Carlos")
    val daniel = Usuario("Daniel")
    val eliel = Usuario("Eliel")
    val fernanda = Usuario("Fernanda")
    
   //Matriculas 
   
   curso01.matricular(alice)
   curso01.matricular(bruna)
   curso01.matricular(carlos)
   curso01.matricular(daniel)
   curso01.matricular(eliel)
   curso01.matricular(fernanda)
   
   curso02.matricular(daniel)
   curso02.matricular(eliel)
   
   curso03.matricular(alice)
   curso03.matricular(carlos)
   curso03.matricular(fernanda)
   
   curso04.matricular(alice)
   curso04.matricular(bruna)
   curso04.matricular(eliel)
   
   curso05.matricular(carlos)
   curso05.matricular(daniel)
   curso05.matricular(fernanda)
	
	//Listar Informção dos Cursos
   
   curso01.listarInfo()
   curso02.listarInfo()
   curso03.listarInfo()
   curso04.listarInfo()
   curso05.listarInfo()
}