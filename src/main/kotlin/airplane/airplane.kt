package airplane

open class Airplane {
    var speed = 300
    var altitude = 3000

    fun ascend(num: Int) {
        altitude += num
        println("My ${this.javaClass.simpleName} is now at an altitude of $altitude")
    }

    fun descend(num: Int) {
        altitude -= num
        println("My ${this.javaClass.simpleName} is now at an altitude of $altitude")
    }

    fun fly() {
        println("My plane is flying at $speed miles an hour, at a height of $altitude")
    }
}

class Boeing: Airplane() {}
class Airbus: Airplane() {}
