fun main(){
  myname()
    addition(10,5,8,)
    multiplication(2,3,20)
    myyearofbirth(2022,2001)
    sentence()
    years()

}
fun myname(){
    val firtname= "Mollen"
    val lastname= "Wambui"
    println(firtname+" "+lastname)
}
fun addition(a:Int, b:Int,c:Int){
    var sum =a+b+c
    println(sum)

}
fun multiplication(a:Int, b:Int, c:Int){
    var product= a*b*c
    println(product)

}
fun myyearofbirth(a:Int,b:Int){
    var subtraction= a-b
    println(subtraction)

}
fun years(){
    var statement="I am 20 years old"
    println(statement)

}
fun sentence(){
    var statement1="Mellisa is a CEO of Jumia online market and lives in Europe"
    println(statement1.replace("CEO","manager"))
    var statement2="Wanjiru is the head director of Simba Cement located in Africa."
    println(statement2.uppercase())
}