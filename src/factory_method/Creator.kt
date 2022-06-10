package factory_method


sealed class PlanType {
    object Domestic : PlanType()
    object Institutional : PlanType()
    object Commercial : PlanType()
}

interface PlanFactory {
    fun getPlan(planType: PlanType): Plan
}

class ElectricityPlan : PlanFactory {
    override fun getPlan(planType: PlanType): Plan {
        return when(planType) {
            PlanType.Commercial -> CommercialPlan()
            PlanType.Domestic -> DomesticPlan()
            PlanType.Institutional -> InstitutionalPlan()
        }
    }
}

