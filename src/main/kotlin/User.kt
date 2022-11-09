class User(var firstName: String = "Peter", var secondName: String = "Patrik") {
  internal  var login: String? = null
       set(value) {
           if (value == "Codi")
               field = "None"
           else
               field = value
           println("Значение перемнной: $field")

       }
        get() {
            val loginField = field ?: "Неизвестно"
            println("Переменная равна: $loginField")
            return field
        }
  internal fun printUser() {
       println("$firstName $secondName")
    }
}

