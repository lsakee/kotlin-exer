data class Ticket(val companyName : String, val name : String,var data : String, var seatNumber: Int)
class TicketNormal(val companyName : String, val name : String,var data : String, var seatNumber: Int)

// toString(),hashCode(),equals(),copy() 가알아서 자동으로 생성

fun main(){
    val ticketA = Ticket("korean air","esak","2022-05-02",14)
    val ticketB = TicketNormal("korean air","esak","2022-05-02",14)
    println(ticketA)
    println(ticketB)
}