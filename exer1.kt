
    // 1. Lamda
    // 람다식 = value 처럼 다루는 익명함수
    // 1)메소드의 피라미터로 넘겨줄수가 있다. fub maxBy(a:Int)
    // 2)return 값으로 사용가능
    // val lamdaName : Type = { argumentList -> codeBody}


val square : (Int) -> (Int) = {number -> number*number}
val nameAge = {name:String, age:Int->
    "my name is ${name} I'm ${age}"
}

fun main(){
    println(square(12))
    println(nameAge("esak",99))
    val a = "esak said"
    val b = "lee said"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())
    println(extendString("esak",24))
    println(calculateGrade(97))

    val lamda = {number : Double ->
        number == 4.3213
    }
    println(invokeLamda(lamda))

    println(invokeLamda({it > 3.22}))
    println(invokeLamda { it>3.22 })








}
    //확장함수
val pizzaIsGreat : String.()->String ={
    this + "Pizza is the Best!"
}
fun extendString(name:String,age:Int):String{
    val introduceMyself : String.(Int)->String={
        "I am ${this} and ${it} years old"
    }
    return name.introduceMyself(age)
}
//람다의 리턴
    val calculateGrade : (Int) -> String ={
        when(it){
            in 0..40 -> "fail"
            in 41..70 -> "pass"
            in 71..100 -> "perfect"
        else -> "Error"
        }
}
    //람다의 여러가지 방법
fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
        return lamda(5.2343)
    }
// pojo 클래스 비어있는 틀역할
