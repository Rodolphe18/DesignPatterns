package observer

interface Subject {

    // méthode pour ajouter un observateur
    fun subscribe(observer: Observer)

    // méthode pour supprimer un observateur
    fun unsubscribe(observer: Observer)
}