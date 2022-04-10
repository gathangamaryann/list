
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc     (2 points)

//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height    (2 points)

//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age   (2 points)

//4.  Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//(1 points)

//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.      (3 points)




fun main(){

    liststring(listOf("1","22","3","4","5","67","7","8","9","10"))
     height(listOf(45.5,36.5,18.9,34.1,96.9,79.1))
    var x = Person("mary",21,56,6)
    var y= Person("ann",35,56,4)
    var a = Person("mercy",20,86,7)
    var b= Person("angela",18,76,5)


    var h= mutableListOf(x,y)
    println(h)
   var sorted=h.sortedByDescending {h->h.age  }
    println(sorted)
    var addmore= mutableListOf(a,b)
    println(addmore.plus(h))
    var p=Car("KCC",70)
    var z=Car("kDD",80)
    var mycar= listOf(p,z)
    println(mycar)

    }



fun liststring(numbers:List<String>):List<String>{
    numbers.forEachIndexed { index, i ->
            if (index %2== 0){
                println(i)
            }
    }
    return numbers

 }

fun height(double: List<Double>):String {
    var calculate = double.average()
    var metre = double.sum()
    var b ="$calculate,$metre"
    println(b)
    return(b)

}

 data class Person(var name:String,var age:Int,var weight:Int,var height:Int)

fun addingmore(persontwo:List<Any>):List<Any>{
    return listOf()

}

data class Car(var registration:String,var mileage:Int)

fun magari(speed:List<Car>):Int{
    var total=0
    speed.forEach{Car->
        total+=Car.mileage
    }
    var average=total/speed.count()
    return average

}

