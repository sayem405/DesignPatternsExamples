package factory_method

fun main() {
    val planFactory : PlanFactory = ElectricityPlan()
    val plan : Plan = planFactory.getPlan(PlanType.Commercial)
    val billCalculator = BillCalculatorImpl(plan)
    val bill = billCalculator.calculate(23)
    println(bill)
}