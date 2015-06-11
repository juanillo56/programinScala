
val langs = Seq(
	("Scala", 	"Martin", 	"Odersky"),
	("Clojure", 	"Rich", 	"Hickey"),
	("Lips", 	"Jhon", 	"McCarthy")
)
for(tuple <-langs) { 
	tuple match {
	case ("Scala",_,_) => println("Found Scala")
	case (lang, first, last) => println(s"Found other language: $lang ($first, $last)")
	}
}
