fun main(){
    strings()
    cities()
    digits()
    var names = initials("khadijah Riami", "Prince Denzel", "Mwihaki Jeniffer")
    println(names)
}
//1. Create a function that takes in 4 strings and creates an array out of them then
//prints out the array
fun strings(){
    val names = arrayOf("Tracy", "Tony", "Terry", "Tylor")
    println(names.contentToString())
}
//2. Create a function that given an array below:
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.
fun cities(){
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    for(cities in cities)
        println(cities.capitalize())

}
//3. Create one function that given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements
//(ii) prints out the index of 158
//(iii) prints out the elements in ascending order
fun digits(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers[2].plus(numbers[5]))
    println(numbers.indexOf(158))
    println(numbers.sorted())
}
//4. Create a function that takes in 3 names and returns a string array containing
//all 3 names.
fun initials(name1:String, name2:String, name3:String): String{
    var names = (arrayOf(name1,name2,name3))
    return names.contentToString()
}