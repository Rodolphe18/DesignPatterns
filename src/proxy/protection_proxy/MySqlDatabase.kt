package proxy.protection_proxy

class MySqlDatabase: Database {

    override fun delete() {
        println("Database is deleted")
    }
}