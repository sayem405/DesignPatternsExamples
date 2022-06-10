package observer

fun main() {
    val ibm = IBM()
    ibm.attach(Investor("Sayem"))

    ibm.price = 2

    ibm.attach(Investor("Imran"))

    ibm.price = 3
}