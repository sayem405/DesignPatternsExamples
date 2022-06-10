package factory_method

interface Plan {
    fun getRate() : Int
}


class DomesticPlan : Plan {
    override fun getRate(): Int {
        return 1
    }
}

class InstitutionalPlan() : Plan {
    override fun getRate(): Int {
        return 2
    }
}


class CommercialPlan : Plan {
    override fun getRate(): Int {
        return 3
    }
}

