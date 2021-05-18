fun main() {
    var x= listOf(Book("Born a crime","Trevor Noah",400),
    Book("Kigogo","Pauline Kea",300),
    Book("Persuation","Jane",249))
    println(x.reversed())
    square()
    var d=Truck("kyi56",25,39)
    println(d.load(9))
    println(d.unload(6))

}

data class Book(var title:String, var author:String, var pages:Int)

fun listBooks(books:List<String>):List<String>{
    return books

}
fun square(){
var y=-1
    do{
        println(y*y)
        y++
    }
        while(y*y<=3000)
}
class Truck(registration:String, totalWeight:Int, capacity:Int){
    fun load(weight: Int):Int{
        var totalweight=weight+25
        totalweight++
        return totalweight

    }
    fun unload(weight: Int):Int{
        var totalweight=weight-25
        totalweight--
        return totalweight
    }
    fun weightCheck(){
        var calc=load(9)-unload(6)
        println(calc)


    }
}
class Trailer(registration:String, totalWeight:Int, capacity:Int, wheels:Int){
fun weightCheck(){

}
}