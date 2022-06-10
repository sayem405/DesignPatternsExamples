package factory_method

interface BillCalculator {
    fun calculate(unit : Int) : Int
}


class BillCalculatorImpl(private val plan: Plan) : BillCalculator {
    override fun calculate(unit : Int) : Int {
        return plan.getRate().times(unit)
    }
}