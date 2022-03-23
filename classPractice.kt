open class classPractice constructor(val name:String="Anonymous"){

    constructor(name: String,age:Int):this(name){
        println("my name is ${name},${age}years old")
    }

    init{
        println("New human has been born!")
    }

    fun eatingMeet(){
        println("good")
    }

    open fun singASong(){
        println("haha")
    }
}

class Korean:classPractice(){
    override fun singASong(){
        super.singASong()
        print("lalalal")
        println("my name is ${name}")
    }
}



fun main(){
    val korean=Korean()
    korean.singASong()
   /* val classPractice = classPractice("esak")
    val stranger=classPractice()
    val mom =classPractice("Nam",55)
    classPractice.eatingMeet()
    println("this is human name is${classPractice.name}")
    println("this is human name is${stranger.name}")
    */
}
