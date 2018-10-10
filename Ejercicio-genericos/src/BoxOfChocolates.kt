
class BoxOfChocolates(val chocolates: ArrayList<Chocolate>){
    fun pickOne(index: Int){
        chocolates.removeAt(index)
    }
}

