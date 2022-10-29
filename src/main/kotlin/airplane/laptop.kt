package airplane

fun main(args: Array<String>) {
    val myLaptop = Laptop()
    val apple = Apple()
    apple.screenSize = 13
    apple.name = "Apple Laptop"

    myLaptop.run()
    apple.run()
}

open class Laptop {
    var screenSize = 15
    var speed = 1200
    var name = "Generic Laptop"

    fun run() {
        println("Running $name with screen size $screenSize and speed $speed")
    }
}

class Apple: Laptop() {

}