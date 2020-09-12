class Employee private constructor(builder: Builder) {
    val firstName: String?
    val lastName: String?
    val id: String?
    val isManager: Boolean
    val managerId: String?

    class Builder {
        var firstName: String? = null
        var lastName: String? = null
        var id: String? = null
        var isManager = false
        var managerId: String? = null
        fun build(): Employee {
            return Employee(this)
        }

        fun setFirstName(firstName: String?): Builder {
            this.firstName = firstName
            return this
        }

        fun setLastName(lastName: String?): Builder {
            this.lastName = lastName
            return this
        }

        fun setId(id: String?): Builder {
            this.id = id
            return this
        }

        fun setIsManager(manager: Boolean): Builder {
            isManager = manager
            return this
        }

        fun setManagerId(managerId: String?): Builder {
            this.managerId = managerId
            return this
        }
    }

    init {
        firstName = builder.firstName
        lastName = builder.lastName
        id = builder.id
        isManager = builder.isManager
        managerId = builder.managerId
    }
}
fun main(){
    val employee=Employee.Builder()
        .setFirstName("Doug")
        .setLastName("sigelboum")
        .setIsManager(false)
        .setManagerId("xxx")
    println(employee.firstName+"  "+employee.lastName)
}