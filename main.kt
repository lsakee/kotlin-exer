
fun main(){
    forAndWhile()
checkNum(1)
    nullcheck()
    //ignoreNulls()
}
fun maxBy(a:Int,b:Int):Int{
    if(a>b) {
        return a}
    else{
        return b
    }
}

fun maxBy2(a:Int,b:Int)=if(a>b) a else b
fun checkNum(score:Int){
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2 -> println("this is 2")
        3 -> println("this is 3")
        else -> println("I don't know")
    }
    var b=when(score){
        1->1
        2->2
        else ->3
    }
    println("b:${b}")
    when(score){
        in 90..100->println("You are genius")
        in 10..80->println("notbad")
        else ->println("okay")
    }
}

//1.함수
fun helloWorld(){
    println("Hello World")
}
fun add(a:Int,b:Int) :Int{
    return a+b
}
fun hi(){
    val a:Int=10
    var b:Int=9
    b=100
    val c= 100
    var d= 100
    var name :String="esak"
}

fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)
    val array2= arrayOf(1,"d",3.4f)
    val list2 = listOf(1,"d",11L)
    array[0]=3
    var result=list.get(0)

    val arrayList= arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)

}

fun forAndWhile(){
    val student= arrayListOf("joyce","james","jenny","jennifer")
    for (name in student){
        println("${name}")
    }
    var sum:Int=0

    for((index,name)in student.withIndex()){
        println("${index+1}번째 학생: ${name}")
    }
    //down to until 은 포함x
        for(i in 1..10 step 2){
            sum+=i
        }
        println(sum)
    var index=0
    while(index<10){

        println("${index}")
        index++
    }
}

fun nullcheck(){
    var name : String="esak"

    var nullName:String? =null

    var nameInUpperCase=name.toUpperCase()

    var nullNameInupperCase=nullName?.toUpperCase()

    val lastName :String?="lee"
    val fullName :String=name+" "+(lastName?:"NO lastName")
    println(fullName)

    //!!

}

fun ignoreNulls(str:String?){
   /* val mNotNull:String=str!!
    val upper=mNotNull.toUpperCase()
*/
    val email:String? ="esakXXX@nana.com"
    email?.let{
        println("my email is ${email}")
    }

}


