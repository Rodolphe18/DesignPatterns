package proxy.protection_proxy

class DatabaseProxy(private val db: Database, private val role:String): Database {

    override fun delete() {
        if (role == "ADMIN") db.delete() else print("Access has been denied")
    }


}