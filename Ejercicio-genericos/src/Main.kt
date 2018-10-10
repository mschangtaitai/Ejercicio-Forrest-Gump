fun main(args: Array<String>) {
    val boxOfChocolates = RandomBox<Chocolate>( arrayListOf<Chocolate>(
            Chocolate("Choco1",100,"Mantequilla de mani"),
            Chocolate("Choco2",150,"Fresa"),
            Chocolate("Choco3",50,"Negro")
    ))
    val forrestLine = ForrestGump<Chocolate>(boxOfChocolates)
    println(forrestLine.theLineForrest()+ "\n")
    println(forrestLine.theLineForrest()+ "\n")
    println(forrestLine.theLineForrest()+ "\n")
    println(forrestLine.theLineForrest()+ "\n")
    println(forrestLine.theLineForrest()+ "\n")
}