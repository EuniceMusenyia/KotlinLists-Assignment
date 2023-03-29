fun main() {
    val evenNames = listOf("Eunice", "Senyia","Sue","Elsie")
    println(evenNames)

    peopleHeights()

    var person1=Persons("shiko",73,22.5,85)
    var person2=Persons("Nick",30,44.6,80)
    var person3=Persons("Anyango",22,59.6,70)
    var person4=Persons("Faith",50,75.5,45)
    var person= listOf<Persons>(person1,person2,person3,person4)
    var individual=person.sortedByDescending {person->person.age }
    println(individual)

    var car1 = Car("kDA576K",67)
    var car2 = Car("kDB456K",67)
    var car3 = Car("kCA556K",67)
    var car4 = Car("kDB476K",67)
    var allcars = listOf(car1,car2,car3,car4)
    println(carslist(allcars))




}

// 1. Given a list of 10 strings, write a function that returns a list of the strings
//at even indices ie index 2,4,6 etc

fun stringlist(str: List<String>): List<String>{
    str.forEachIndexed { index, s ->
        if (index % 2 == 0){
            println(s)
        }

    }
    return str

}


//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun peopleHeights(){
    var height = mutableListOf(4.3, 5.0, 3.9,4.6,4.5,3.5,3.7)
    println(height.average())
    println(height.sum())
}


//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
class Persons(var nam:String,var age:Int,var height:Double,var weight:Int)


//4. Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
 fun addPersons(topple: List<Persons>): List<Any>{
     return listOf()

 }

//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car(var registration:String,var mileage:Int)
fun carslist(vehicle:List<Car>):Int{
    var average = 0
    vehicle.forEach {  new -> new.mileage
    average+=new.mileage}

    var totalaverage = vehicle.count()
    return totalaverage

}