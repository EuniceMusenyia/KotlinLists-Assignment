fun main() {

    val evenNames = listOf("Eunice", "Senyia","Sue","Elsie")
    println(evenNames)

    println( heights(listOf(4.3, 5.0, 4.5, 2.8,1.9)))

    personsList(mutableListOf(Persons("Eunice" ,25, 5.3, 49.0),
    Persons("Senyia",23, 4.1, 50.2),
    Persons("Mutunga", 50,4.0, 60.2)))



    var car1 = Car("kDA576K",67)
    var car2 = Car("kDB456K",67)
    var car3 = Car("kCA556K",67)
    var car4 = Car("kDB476K",60)
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



data class PeopleHeights(var height: Double, var average: Double)
fun heights(myHeight:List<Double>):PeopleHeights{


    return  PeopleHeights(myHeight.sum(), myHeight.average())

//   ALTERNATIVELY:
//    var average = myHeight.average()
//    var height = myHeight.sum()
//    var myHeight = PeopleHeights(height, average)
//    return myHeight

}

//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
class Persons(var nam:String,var age:Int,var height:Double,var weight:Double)
fun personsList(personList:List<Persons>){
           var sorted = personList.sortedByDescending {person->person.age }
            println(sorted)
}


//4. Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//





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
//To be redone
}